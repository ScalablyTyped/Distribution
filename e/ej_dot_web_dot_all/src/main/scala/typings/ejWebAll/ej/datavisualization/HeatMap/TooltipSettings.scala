package typings.ejWebAll.ej.datavisualization.HeatMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TooltipSettings extends js.Object {
  
  /** Defines the animation for the tooltip that should be shown when the mouse hovers over rows/columns.
    */
  var animation: js.UndefOr[TooltipSettingsAnimation] = js.native
  
  /** Defines the tooltip of associate that should be shown when the mouse hovers over rows/columns.
    * @Default {mouseFollow}
    */
  var associate: js.UndefOr[Associate | String] = js.native
  
  /** Enables/ disables the balloon for the tooltip to be shown
    * @Default {true}
    */
  var isBalloon: js.UndefOr[Boolean] = js.native
  
  /** Defines various attributes of the Tooltip position
    */
  var position: js.UndefOr[TooltipSettingsPosition] = js.native
  
  /** Defines the tooltip that should be shown when the mouse hovers over rows/columns.
    * @Default {null}
    */
  var templateId: js.UndefOr[String] = js.native
  
  /** Defines the tooltip to be triggered.
    * @Default {hover}
    */
  var trigger: js.UndefOr[Trigger | String] = js.native
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
    def setAnimation(value: TooltipSettingsAnimation): Self = this.set("animation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimation: Self = this.set("animation", js.undefined)
    
    @scala.inline
    def setAssociate(value: Associate | String): Self = this.set("associate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAssociate: Self = this.set("associate", js.undefined)
    
    @scala.inline
    def setIsBalloon(value: Boolean): Self = this.set("isBalloon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsBalloon: Self = this.set("isBalloon", js.undefined)
    
    @scala.inline
    def setPosition(value: TooltipSettingsPosition): Self = this.set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    
    @scala.inline
    def setTemplateId(value: String): Self = this.set("templateId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTemplateId: Self = this.set("templateId", js.undefined)
    
    @scala.inline
    def setTrigger(value: Trigger | String): Self = this.set("trigger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrigger: Self = this.set("trigger", js.undefined)
  }
}
