package typings.foundationSites.FoundationSites

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAccordionOptions extends js.Object {
  var allowAllClosed: js.UndefOr[Boolean] = js.native
  var multiExpand: js.UndefOr[Boolean] = js.native
  var slideSpeed: js.UndefOr[Double] = js.native
}

object IAccordionOptions {
  @scala.inline
  def apply(): IAccordionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IAccordionOptions]
  }
  @scala.inline
  implicit class IAccordionOptionsOps[Self <: IAccordionOptions] (val x: Self) extends AnyVal {
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
    def setAllowAllClosed(value: Boolean): Self = this.set("allowAllClosed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowAllClosed: Self = this.set("allowAllClosed", js.undefined)
    @scala.inline
    def setMultiExpand(value: Boolean): Self = this.set("multiExpand", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMultiExpand: Self = this.set("multiExpand", js.undefined)
    @scala.inline
    def setSlideSpeed(value: Double): Self = this.set("slideSpeed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSlideSpeed: Self = this.set("slideSpeed", js.undefined)
  }
  
}

