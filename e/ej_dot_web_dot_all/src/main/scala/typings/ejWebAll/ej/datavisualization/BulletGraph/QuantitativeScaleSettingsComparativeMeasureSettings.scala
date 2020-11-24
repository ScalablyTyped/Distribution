package typings.ejWebAll.ej.datavisualization.BulletGraph

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QuantitativeScaleSettingsComparativeMeasureSettings extends js.Object {
  
  /** Specifies the stroke of the comparative measure.
    * @Default {null}
    */
  var stroke: js.UndefOr[Double] = js.native
  
  /** Specifies the width of the comparative measure.
    * @Default {5}
    */
  var width: js.UndefOr[Double] = js.native
}
object QuantitativeScaleSettingsComparativeMeasureSettings {
  
  @scala.inline
  def apply(): QuantitativeScaleSettingsComparativeMeasureSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QuantitativeScaleSettingsComparativeMeasureSettings]
  }
  
  @scala.inline
  implicit class QuantitativeScaleSettingsComparativeMeasureSettingsOps[Self <: QuantitativeScaleSettingsComparativeMeasureSettings] (val x: Self) extends AnyVal {
    
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
    def setStroke(value: Double): Self = this.set("stroke", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStroke: Self = this.set("stroke", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
