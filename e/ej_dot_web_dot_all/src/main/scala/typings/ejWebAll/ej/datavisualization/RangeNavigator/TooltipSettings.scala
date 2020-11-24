package typings.ejWebAll.ej.datavisualization.RangeNavigator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TooltipSettings extends js.Object {
  
  /** Specifies the background color of tooltip.
    * @Default {#303030}
    */
  var backgroundColor: js.UndefOr[String] = js.native
  
  /** Options for customizing the font in tooltip.
    */
  var font: js.UndefOr[TooltipSettingsFont] = js.native
  
  /** Specifies the format of text to be displayed in tooltip.
    * @Default {MM/dd/yyyy}
    */
  var labelFormat: js.UndefOr[String] = js.native
  
  /** Specifies the mode of displaying the tooltip. Neither to display the tooltip always nor on demand.
    * @Default {null}
    */
  var tooltipDisplayMode: js.UndefOr[String] = js.native
  
  /** Toggles the visibility of tooltip.
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
    def setBackgroundColor(value: String): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackgroundColor: Self = this.set("backgroundColor", js.undefined)
    
    @scala.inline
    def setFont(value: TooltipSettingsFont): Self = this.set("font", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFont: Self = this.set("font", js.undefined)
    
    @scala.inline
    def setLabelFormat(value: String): Self = this.set("labelFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelFormat: Self = this.set("labelFormat", js.undefined)
    
    @scala.inline
    def setTooltipDisplayMode(value: String): Self = this.set("tooltipDisplayMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTooltipDisplayMode: Self = this.set("tooltipDisplayMode", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
  }
}
