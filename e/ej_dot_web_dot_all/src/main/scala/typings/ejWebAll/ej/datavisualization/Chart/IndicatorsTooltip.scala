package typings.ejWebAll.ej.datavisualization.Chart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IndicatorsTooltip extends js.Object {
  
  /** Option to customize the border of indicator tooltip.
    */
  var border: js.UndefOr[IndicatorsTooltipBorder] = js.native
  
  /** Specifies the animation duration of indicator tooltip.
    * @Default {500ms}
    */
  var duration: js.UndefOr[String] = js.native
  
  /** Enables/disables the tooltip animation.
    * @Default {true}
    */
  var enableAnimation: js.UndefOr[Boolean] = js.native
  
  /** Background color of indicator tooltip.
    * @Default {null}
    */
  var fill: js.UndefOr[String] = js.native
  
  /** Format of indicator tooltip. Use â€œpoint.xâ€ and â€œpoint.yâ€ as a placeholder text to display the corresponding data pointâ€™s x and y value.
    * @Default {#point.x# : #point.y#}
    */
  var format: js.UndefOr[String] = js.native
  
  /** Opacity of indicator tooltip.
    * @Default {0.95}
    */
  var opacity: js.UndefOr[Double] = js.native
  
  /** Controls the visibility of indicator tooltip.
    * @Default {false}
    */
  var visible: js.UndefOr[Boolean] = js.native
}
object IndicatorsTooltip {
  
  @scala.inline
  def apply(): IndicatorsTooltip = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IndicatorsTooltip]
  }
  
  @scala.inline
  implicit class IndicatorsTooltipOps[Self <: IndicatorsTooltip] (val x: Self) extends AnyVal {
    
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
    def setBorder(value: IndicatorsTooltipBorder): Self = this.set("border", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorder: Self = this.set("border", js.undefined)
    
    @scala.inline
    def setDuration(value: String): Self = this.set("duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
    
    @scala.inline
    def setEnableAnimation(value: Boolean): Self = this.set("enableAnimation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableAnimation: Self = this.set("enableAnimation", js.undefined)
    
    @scala.inline
    def setFill(value: String): Self = this.set("fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFill: Self = this.set("fill", js.undefined)
    
    @scala.inline
    def setFormat(value: String): Self = this.set("format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    
    @scala.inline
    def setOpacity(value: Double): Self = this.set("opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
  }
}
