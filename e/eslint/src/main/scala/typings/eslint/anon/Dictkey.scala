package typings.eslint.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Dictkey
  extends /* key */ StringDictionary[js.Any] {
  var experimentalObjectRestSpread: js.UndefOr[Boolean] = js.native
  var globalReturn: js.UndefOr[Boolean] = js.native
  var impliedStrict: js.UndefOr[Boolean] = js.native
  var jsx: js.UndefOr[Boolean] = js.native
}

object Dictkey {
  @scala.inline
  def apply(): Dictkey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Dictkey]
  }
  @scala.inline
  implicit class DictkeyOps[Self <: Dictkey] (val x: Self) extends AnyVal {
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
    def setExperimentalObjectRestSpread(value: Boolean): Self = this.set("experimentalObjectRestSpread", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExperimentalObjectRestSpread: Self = this.set("experimentalObjectRestSpread", js.undefined)
    @scala.inline
    def setGlobalReturn(value: Boolean): Self = this.set("globalReturn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGlobalReturn: Self = this.set("globalReturn", js.undefined)
    @scala.inline
    def setImpliedStrict(value: Boolean): Self = this.set("impliedStrict", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImpliedStrict: Self = this.set("impliedStrict", js.undefined)
    @scala.inline
    def setJsx(value: Boolean): Self = this.set("jsx", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJsx: Self = this.set("jsx", js.undefined)
  }
  
}

