package typings.ejWebAll.ej.datavisualization.CircularGauge

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScalesIndicator extends js.Object {
  
  /** Specify indicator height of circular gauge
    * @Default {15}
    */
  var height: js.UndefOr[Double] = js.native
  
  /** Specify imageUrl of circular gauge
    * @Default {null}
    */
  var imageUrl: js.UndefOr[String] = js.native
  
  /** Specify position of circular gauge
    * @Default {Object}
    */
  var position: js.UndefOr[ScalesIndicatorsPosition] = js.native
  
  /** Specify the various states of circular gauge
    * @Default {Array}
    */
  var stateRanges: js.UndefOr[js.Array[ScalesIndicatorsStateRange]] = js.native
  
  /** Specify indicator style of circular gauge. See
    * @Default {Circle}
    */
  var `type`: js.UndefOr[IndicatorTypes | String] = js.native
  
  /** Specify indicator width of circular gauge
    * @Default {15}
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
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setImageUrl(value: String): Self = this.set("imageUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageUrl: Self = this.set("imageUrl", js.undefined)
    
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
    def setType(value: IndicatorTypes | String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
