package typings.expressValidator.optionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IsIMEIOptions extends js.Object {
  var allow_hyphens: js.UndefOr[Boolean] = js.native
}

object IsIMEIOptions {
  @scala.inline
  def apply(): IsIMEIOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IsIMEIOptions]
  }
  @scala.inline
  implicit class IsIMEIOptionsOps[Self <: IsIMEIOptions] (val x: Self) extends AnyVal {
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
    def setAllow_hyphens(value: Boolean): Self = this.set("allow_hyphens", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllow_hyphens: Self = this.set("allow_hyphens", js.undefined)
  }
  
}

