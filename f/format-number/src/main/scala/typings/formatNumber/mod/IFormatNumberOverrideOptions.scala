package typings.formatNumber.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IFormatNumberOverrideOptions extends js.Object {
  var noSeparator: js.UndefOr[Boolean] = js.native
  var noUnits: js.UndefOr[Boolean] = js.native
}

object IFormatNumberOverrideOptions {
  @scala.inline
  def apply(): IFormatNumberOverrideOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IFormatNumberOverrideOptions]
  }
  @scala.inline
  implicit class IFormatNumberOverrideOptionsOps[Self <: IFormatNumberOverrideOptions] (val x: Self) extends AnyVal {
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
    def setNoSeparator(value: Boolean): Self = this.set("noSeparator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoSeparator: Self = this.set("noSeparator", js.undefined)
    @scala.inline
    def setNoUnits(value: Boolean): Self = this.set("noUnits", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoUnits: Self = this.set("noUnits", js.undefined)
  }
  
}

