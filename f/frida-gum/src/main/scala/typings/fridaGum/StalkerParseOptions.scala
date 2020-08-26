package typings.fridaGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StalkerParseOptions extends js.Object {
  /**
    * Whether to include the type of each event. Defaults to `true`.
    */
  var annotate: js.UndefOr[Boolean] = js.native
  /**
    * Whether to format pointer values as strings instead of `NativePointer`
    * values, i.e. less overhead if you're just going to `send()` the result
    * and not actually parse the data agent-side.
    */
  var stringify: js.UndefOr[Boolean] = js.native
}

object StalkerParseOptions {
  @scala.inline
  def apply(): StalkerParseOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StalkerParseOptions]
  }
  @scala.inline
  implicit class StalkerParseOptionsOps[Self <: StalkerParseOptions] (val x: Self) extends AnyVal {
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
    def setAnnotate(value: Boolean): Self = this.set("annotate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnnotate: Self = this.set("annotate", js.undefined)
    @scala.inline
    def setStringify(value: Boolean): Self = this.set("stringify", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStringify: Self = this.set("stringify", js.undefined)
  }
  
}

