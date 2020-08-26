package typings.foundationSites.FoundationSites

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAccordionMenuOptions extends js.Object {
  var multiOpen: js.UndefOr[Boolean] = js.native
  var slideSpeed: js.UndefOr[Double] = js.native
}

object IAccordionMenuOptions {
  @scala.inline
  def apply(): IAccordionMenuOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IAccordionMenuOptions]
  }
  @scala.inline
  implicit class IAccordionMenuOptionsOps[Self <: IAccordionMenuOptions] (val x: Self) extends AnyVal {
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
    def setMultiOpen(value: Boolean): Self = this.set("multiOpen", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMultiOpen: Self = this.set("multiOpen", js.undefined)
    @scala.inline
    def setSlideSpeed(value: Double): Self = this.set("slideSpeed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSlideSpeed: Self = this.set("slideSpeed", js.undefined)
  }
  
}

