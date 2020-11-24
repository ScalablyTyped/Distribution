package typings.ejWebAll.ej.datavisualization.CircularGauge

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScalesIndicatorsStateRange extends js.Object {
  
  /** Specify backgroundColor for indicator of circular gauge
    * @Default {null}
    */
  var backgroundColor: js.UndefOr[String] = js.native
  
  /** Specify borderColor for indicator of circular gauge
    * @Default {null}
    */
  var borderColor: js.UndefOr[String] = js.native
  
  /** Specify end value for each specified state of circular gauge
    * @Default {0}
    */
  var endValue: js.UndefOr[Double] = js.native
  
  /** Specify value of the font as the indicator when the indicator style is set with the value &quot;text&quot; of circular gauge
    * @Default {null}
    */
  var font: js.UndefOr[js.Any] = js.native
  
  /** Specify start value for each specified state of circular gauge
    * @Default {0}
    */
  var startValue: js.UndefOr[Double] = js.native
  
  /** Specify value of the text as the indicator when the indicator style is set with the value &quot;text&quot; of circular gauge
    */
  var text: js.UndefOr[String] = js.native
  
  /** Specify value of the textColor as the indicator when the indicator style is set with the value &quot;text&quot; of circular gauge
    * @Default {null}
    */
  var textColor: js.UndefOr[String] = js.native
}
object ScalesIndicatorsStateRange {
  
  @scala.inline
  def apply(): ScalesIndicatorsStateRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScalesIndicatorsStateRange]
  }
  
  @scala.inline
  implicit class ScalesIndicatorsStateRangeOps[Self <: ScalesIndicatorsStateRange] (val x: Self) extends AnyVal {
    
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
    def setBorderColor(value: String): Self = this.set("borderColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderColor: Self = this.set("borderColor", js.undefined)
    
    @scala.inline
    def setEndValue(value: Double): Self = this.set("endValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndValue: Self = this.set("endValue", js.undefined)
    
    @scala.inline
    def setFont(value: js.Any): Self = this.set("font", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFont: Self = this.set("font", js.undefined)
    
    @scala.inline
    def setStartValue(value: Double): Self = this.set("startValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartValue: Self = this.set("startValue", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    
    @scala.inline
    def setTextColor(value: String): Self = this.set("textColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextColor: Self = this.set("textColor", js.undefined)
  }
}
