package typings.ejWebAll.ej.datavisualization.LinearGauge

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScalesIndicatorsStateRange extends js.Object {
  
  /** Specifies the backgroundColor in bar indicators state ranges
    * @Default {null}
    */
  var backgroundColor: js.UndefOr[String] = js.native
  
  /** Specifies the borderColor in bar indicators state ranges
    * @Default {null}
    */
  var borderColor: js.UndefOr[String] = js.native
  
  /** Specifies the endValue in bar indicators state ranges
    * @Default {60}
    */
  var endValue: js.UndefOr[Double] = js.native
  
  /** Specifies the startValue in bar indicators state ranges
    * @Default {50}
    */
  var startValue: js.UndefOr[Double] = js.native
  
  /** Specifies the text in bar indicators state ranges
    */
  var text: js.UndefOr[String] = js.native
  
  /** Specifies the textColor in bar indicators state ranges
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
