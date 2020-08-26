package typings.expressValidator.optionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IsBase64Options extends js.Object {
  var urlSafe: js.UndefOr[Boolean] = js.native
}

object IsBase64Options {
  @scala.inline
  def apply(): IsBase64Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IsBase64Options]
  }
  @scala.inline
  implicit class IsBase64OptionsOps[Self <: IsBase64Options] (val x: Self) extends AnyVal {
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
    def setUrlSafe(value: Boolean): Self = this.set("urlSafe", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrlSafe: Self = this.set("urlSafe", js.undefined)
  }
  
}

