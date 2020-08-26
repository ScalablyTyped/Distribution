package typings.findCacheDir.mod

import typings.findCacheDir.findCacheDirBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OptionsWithThunk extends Options {
  /**
    * If `true`, this modifies the return type to be a function that is a thunk for `path.join(theFoundCacheDirectory)`.
    * @default false
    */
  @JSName("thunk")
  var thunk_OptionsWithThunk: `true` = js.native
}

object OptionsWithThunk {
  @scala.inline
  def apply(name: String, thunk: `true`): OptionsWithThunk = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], thunk = thunk.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionsWithThunk]
  }
  @scala.inline
  implicit class OptionsWithThunkOps[Self <: OptionsWithThunk] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setThunk(value: `true`): Self = this.set("thunk", value.asInstanceOf[js.Any])
  }
  
}

