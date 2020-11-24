package typings.ejWebAll.ej.datavisualization.LinearGauge

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScalesIndicator extends js.Object {
  
  /** Specifies the backgroundColor in bar indicators
    * @Default {null}
    */
  var backgroundColor: js.UndefOr[String] = js.native
  
  /** Specifies the border in bar indicators
    * @Default {null}
    */
  var border: js.UndefOr[ScalesIndicatorsBorder] = js.native
  
  /** Specifies the font of bar indicators
    * @Default {null}
    */
  var font: js.UndefOr[ScalesIndicatorsFont] = js.native
  
  /** Specifies the indicator Height of bar indicators
    * @Default {30}
    */
  var height: js.UndefOr[Double] = js.native
  
  /** Specifies the opacity in bar indicators
    * @Default {null}
    */
  var opacity: js.UndefOr[Double] = js.native
  
  /** Specifies the position in bar indicators
    * @Default {null}
    */
  var position: js.UndefOr[ScalesIndicatorsPosition] = js.native
  
  /** Specifies the state ranges in bar indicators
    * @Default {Array}
    */
  var stateRanges: js.UndefOr[js.Array[ScalesIndicatorsStateRange]] = js.native
  
  /** Specifies the textLocation in bar indicators
    * @Default {null}
    */
  var textLocation: js.UndefOr[ScalesIndicatorsTextLocation] = js.native
  
  /** Specifies the indicator Style of font in bar indicators
    * @Default {ej.datavisualization.LinearGauge.IndicatorType.Rectangle}
    */
  var `type`: js.UndefOr[IndicatorTypes | String] = js.native
  
  /** Specifies the indicator Width in bar indicators
    * @Default {30}
    */
  var width: js.UndefOr[Double] = js.native
}
object ScalesIndicator {
  
  @scala.inline
  def apply(): ScalesIndicator = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScalesIndicator]
  }
  
  @scala.inline
  implicit class ScalesIndicatorOps[Self <: ScalesIndicator] (val x: Self) extends AnyVal {
    
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
    def setBorder(value: ScalesIndicatorsBorder): Self = this.set("border", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorder: Self = this.set("border", js.undefined)
    
    @scala.inline
    def setFont(value: ScalesIndicatorsFont): Self = this.set("font", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFont: Self = this.set("font", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setOpacity(value: Double): Self = this.set("opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
    
    @scala.inline
    def setPosition(value: ScalesIndicatorsPosition): Self = this.set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    
    @scala.inline
    def setStateRangesVarargs(value: ScalesIndicatorsStateRange*): Self = this.set("stateRanges", js.Array(value :_*))
    
    @scala.inline
    def setStateRanges(value: js.Array[ScalesIndicatorsStateRange]): Self = this.set("stateRanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStateRanges: Self = this.set("stateRanges", js.undefined)
    
    @scala.inline
    def setTextLocation(value: ScalesIndicatorsTextLocation): Self = this.set("textLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextLocation: Self = this.set("textLocation", js.undefined)
    
    @scala.inline
    def setType(value: IndicatorTypes | String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
