package typings.ejWebAll.ej.datavisualization.Map

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LayersBubbleSettings extends js.Object {
  
  /** Specifies the bubble Opacity value of bubbles for shape layer in map
    * @Default {0.9}
    */
  var bubbleOpacity: js.UndefOr[Double] = js.native
  
  /** Specifies the mouse hover color of the shape layer in map
    * @Default {gray}
    */
  var color: js.UndefOr[String] = js.native
  
  /** Specifies the colorMappings of the shape layer in map
    * @Default {null}
    */
  var colorMappings: js.UndefOr[LayersBubbleSettingsColorMappings] = js.native
  
  /** Specifies the bubble color valuePath of the shape layer in map
    * @Default {null}
    */
  var colorValuePath: js.UndefOr[String] = js.native
  
  /** Specifies the maximum size value of bubbles for shape layer in map
    * @Default {20}
    */
  var maxValue: js.UndefOr[Double] = js.native
  
  /** Specifies the minimum size value of bubbles for shape layer in map
    * @Default {10}
    */
  var minValue: js.UndefOr[Double] = js.native
  
  /** Specifies the showBubble visibility status map
    * @Default {true}
    */
  var showBubble: js.UndefOr[Boolean] = js.native
  
  /** Specifies the tooltip visibility status of the shape layer in map
    * @Default {false}
    */
  var showTooltip: js.UndefOr[Boolean] = js.native
  
  /** Specifies the bubble tooltip template of the shape layer in map
    * @Default {null}
    */
  var tooltipTemplate: js.UndefOr[String] = js.native
  
  /** Specifies the bubble valuePath of the shape layer in map
    * @Default {null}
    */
  var valuePath: js.UndefOr[String] = js.native
}
object LayersBubbleSettings {
  
  @scala.inline
  def apply(): LayersBubbleSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LayersBubbleSettings]
  }
  
  @scala.inline
  implicit class LayersBubbleSettingsOps[Self <: LayersBubbleSettings] (val x: Self) extends AnyVal {
    
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
    def setBubbleOpacity(value: Double): Self = this.set("bubbleOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBubbleOpacity: Self = this.set("bubbleOpacity", js.undefined)
    
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setColorMappings(value: LayersBubbleSettingsColorMappings): Self = this.set("colorMappings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColorMappings: Self = this.set("colorMappings", js.undefined)
    
    @scala.inline
    def setColorValuePath(value: String): Self = this.set("colorValuePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColorValuePath: Self = this.set("colorValuePath", js.undefined)
    
    @scala.inline
    def setMaxValue(value: Double): Self = this.set("maxValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxValue: Self = this.set("maxValue", js.undefined)
    
    @scala.inline
    def setMinValue(value: Double): Self = this.set("minValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinValue: Self = this.set("minValue", js.undefined)
    
    @scala.inline
    def setShowBubble(value: Boolean): Self = this.set("showBubble", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowBubble: Self = this.set("showBubble", js.undefined)
    
    @scala.inline
    def setShowTooltip(value: Boolean): Self = this.set("showTooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowTooltip: Self = this.set("showTooltip", js.undefined)
    
    @scala.inline
    def setTooltipTemplate(value: String): Self = this.set("tooltipTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTooltipTemplate: Self = this.set("tooltipTemplate", js.undefined)
    
    @scala.inline
    def setValuePath(value: String): Self = this.set("valuePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValuePath: Self = this.set("valuePath", js.undefined)
  }
}
