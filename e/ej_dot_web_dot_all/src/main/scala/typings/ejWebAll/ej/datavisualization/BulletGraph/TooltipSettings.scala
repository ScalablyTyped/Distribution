package typings.ejWebAll.ej.datavisualization.BulletGraph

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TooltipSettings extends js.Object {
  
  /** Specifies template for caption tooltip
    * @Default {null}
    */
  var captionTemplate: js.UndefOr[String] = js.native
  
  /** Toggles the visibility of caption tooltip
    * @Default {false}
    */
  var enableCaptionTooltip: js.UndefOr[Boolean] = js.native
  
  /** Specifies the ID of a div, which is to be displayed as tooltip.
    * @Default {null}
    */
  var template: js.UndefOr[String] = js.native
  
  /** Toggles the visibility of tooltip
    * @Default {true}
    */
  var visible: js.UndefOr[Boolean] = js.native
}
object TooltipSettings {
  
  @scala.inline
  def apply(): TooltipSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TooltipSettings]
  }
  
  @scala.inline
  implicit class TooltipSettingsOps[Self <: TooltipSettings] (val x: Self) extends AnyVal {
    
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
    def setCaptionTemplate(value: String): Self = this.set("captionTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCaptionTemplate: Self = this.set("captionTemplate", js.undefined)
    
    @scala.inline
    def setEnableCaptionTooltip(value: Boolean): Self = this.set("enableCaptionTooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableCaptionTooltip: Self = this.set("enableCaptionTooltip", js.undefined)
    
    @scala.inline
    def setTemplate(value: String): Self = this.set("template", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTemplate: Self = this.set("template", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
  }
}
