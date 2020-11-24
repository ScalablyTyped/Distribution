package typings.ejWebAll.ej.datavisualization.BulletGraph

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QuantitativeScaleSettingsMinorTickSettings extends js.Object {
  
  /** Specifies the size of minor ticks.
    * @Default {7}
    */
  var size: js.UndefOr[Double] = js.native
  
  /** Specifies the stroke color of minor ticks in bullet graph.
    * @Default {null}
    */
  var stroke: js.UndefOr[String] = js.native
  
  /** Specifies the width of the minor ticks in bullet graph.
    * @Default {2}
    */
  var width: js.UndefOr[Double] = js.native
}
object QuantitativeScaleSettingsMinorTickSettings {
  
  @scala.inline
  def apply(): QuantitativeScaleSettingsMinorTickSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QuantitativeScaleSettingsMinorTickSettings]
  }
  
  @scala.inline
  implicit class QuantitativeScaleSettingsMinorTickSettingsOps[Self <: QuantitativeScaleSettingsMinorTickSettings] (val x: Self) extends AnyVal {
    
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
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    
    @scala.inline
    def setStroke(value: String): Self = this.set("stroke", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStroke: Self = this.set("stroke", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
