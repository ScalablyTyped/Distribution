package typings.ejWebAll.ej.datavisualization.CircularGauge

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScalesRange extends js.Object {
  
  /** Specify backgroundColor for the ranges of circular gauge
    * @Default {#32b3c6}
    */
  var backgroundColor: js.UndefOr[String] = js.native
  
  /** Specify border for ranges of circular gauge
    * @Default {Object}
    */
  var border: js.UndefOr[ScalesRangesBorder] = js.native
  
  /** Specify distanceFromScale value for ranges of circular gauge
    * @Default {25}
    */
  var distanceFromScale: js.UndefOr[Double] = js.native
  
  /** Specify endValue for ranges of circular gauge
    * @Default {null}
    */
  var endValue: js.UndefOr[Double] = js.native
  
  /** Specify endWidth for ranges of circular gauge
    * @Default {10}
    */
  var endWidth: js.UndefOr[Double] = js.native
  
  /** Specify range gradients of circular gauge
    * @Default {null}
    */
  var gradients: js.UndefOr[js.Any] = js.native
  
  /** Specify text for the ranges of circular gauge
    * @Default {null}
    */
  var legendText: js.UndefOr[String] = js.native
  
  /** Specify opacity value for ranges of circular gauge
    * @Default {null}
    */
  var opacity: js.UndefOr[Double] = js.native
  
  /** Specify placement of circular gauge. See RangePlacement
    * @Default {Near}
    */
  var placement: js.UndefOr[Placement | String] = js.native
  
  /** Specify size of the range value of circular gauge
    * @Default {5}
    */
  var size: js.UndefOr[Double] = js.native
  
  /** Specify startValue for ranges of circular gauge
    * @Default {null}
    */
  var startValue: js.UndefOr[Double] = js.native
  
  /** Specify startWidth of circular gauge
    * @Default {[Array.number] scale.ranges.startWidth = 10}
    */
  var startWidth: js.UndefOr[Double] = js.native
}
object ScalesRange {
  
  @scala.inline
  def apply(): ScalesRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScalesRange]
  }
  
  @scala.inline
  implicit class ScalesRangeOps[Self <: ScalesRange] (val x: Self) extends AnyVal {
    
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
    def setBorder(value: ScalesRangesBorder): Self = this.set("border", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorder: Self = this.set("border", js.undefined)
    
    @scala.inline
    def setDistanceFromScale(value: Double): Self = this.set("distanceFromScale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDistanceFromScale: Self = this.set("distanceFromScale", js.undefined)
    
    @scala.inline
    def setEndValue(value: Double): Self = this.set("endValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndValue: Self = this.set("endValue", js.undefined)
    
    @scala.inline
    def setEndWidth(value: Double): Self = this.set("endWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndWidth: Self = this.set("endWidth", js.undefined)
    
    @scala.inline
    def setGradients(value: js.Any): Self = this.set("gradients", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGradients: Self = this.set("gradients", js.undefined)
    
    @scala.inline
    def setLegendText(value: String): Self = this.set("legendText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLegendText: Self = this.set("legendText", js.undefined)
    
    @scala.inline
    def setOpacity(value: Double): Self = this.set("opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
    
    @scala.inline
    def setPlacement(value: Placement | String): Self = this.set("placement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlacement: Self = this.set("placement", js.undefined)
    
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    
    @scala.inline
    def setStartValue(value: Double): Self = this.set("startValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartValue: Self = this.set("startValue", js.undefined)
    
    @scala.inline
    def setStartWidth(value: Double): Self = this.set("startWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartWidth: Self = this.set("startWidth", js.undefined)
  }
}
