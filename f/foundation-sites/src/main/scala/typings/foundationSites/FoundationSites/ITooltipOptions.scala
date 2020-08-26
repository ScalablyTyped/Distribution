package typings.foundationSites.FoundationSites

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITooltipOptions extends js.Object {
  var clickOpen: js.UndefOr[Boolean] = js.native
  var disableHover: js.UndefOr[Boolean] = js.native
  var fadeInDuration: js.UndefOr[Double] = js.native
  var fadeOutDuration: js.UndefOr[Double] = js.native
  var hOffset: js.UndefOr[Double] = js.native
  var hoverDelay: js.UndefOr[Double] = js.native
  var positionClass: js.UndefOr[String] = js.native
  var showOn: js.UndefOr[String] = js.native
  var template: js.UndefOr[String] = js.native
  var templateClasses: js.UndefOr[String] = js.native
  var tipText: js.UndefOr[String] = js.native
  var tooltipClass: js.UndefOr[String] = js.native
  var triggerClass: js.UndefOr[String] = js.native
  var vOffset: js.UndefOr[Double] = js.native
}

object ITooltipOptions {
  @scala.inline
  def apply(): ITooltipOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITooltipOptions]
  }
  @scala.inline
  implicit class ITooltipOptionsOps[Self <: ITooltipOptions] (val x: Self) extends AnyVal {
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
    def setClickOpen(value: Boolean): Self = this.set("clickOpen", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClickOpen: Self = this.set("clickOpen", js.undefined)
    @scala.inline
    def setDisableHover(value: Boolean): Self = this.set("disableHover", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableHover: Self = this.set("disableHover", js.undefined)
    @scala.inline
    def setFadeInDuration(value: Double): Self = this.set("fadeInDuration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFadeInDuration: Self = this.set("fadeInDuration", js.undefined)
    @scala.inline
    def setFadeOutDuration(value: Double): Self = this.set("fadeOutDuration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFadeOutDuration: Self = this.set("fadeOutDuration", js.undefined)
    @scala.inline
    def setHOffset(value: Double): Self = this.set("hOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHOffset: Self = this.set("hOffset", js.undefined)
    @scala.inline
    def setHoverDelay(value: Double): Self = this.set("hoverDelay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHoverDelay: Self = this.set("hoverDelay", js.undefined)
    @scala.inline
    def setPositionClass(value: String): Self = this.set("positionClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePositionClass: Self = this.set("positionClass", js.undefined)
    @scala.inline
    def setShowOn(value: String): Self = this.set("showOn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowOn: Self = this.set("showOn", js.undefined)
    @scala.inline
    def setTemplate(value: String): Self = this.set("template", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTemplate: Self = this.set("template", js.undefined)
    @scala.inline
    def setTemplateClasses(value: String): Self = this.set("templateClasses", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTemplateClasses: Self = this.set("templateClasses", js.undefined)
    @scala.inline
    def setTipText(value: String): Self = this.set("tipText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTipText: Self = this.set("tipText", js.undefined)
    @scala.inline
    def setTooltipClass(value: String): Self = this.set("tooltipClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTooltipClass: Self = this.set("tooltipClass", js.undefined)
    @scala.inline
    def setTriggerClass(value: String): Self = this.set("triggerClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTriggerClass: Self = this.set("triggerClass", js.undefined)
    @scala.inline
    def setVOffset(value: Double): Self = this.set("vOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVOffset: Self = this.set("vOffset", js.undefined)
  }
  
}

