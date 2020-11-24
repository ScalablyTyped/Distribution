package typings.ejWebAll.ej.datavisualization.LinearGauge

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScalesTick extends js.Object {
  
  /** Specifies the angle in the tick.
    * @Default {0}
    */
  var angle: js.UndefOr[Double] = js.native
  
  /** Specifies the tick Color in the tick.
    * @Default {null}
    */
  var color: js.UndefOr[String] = js.native
  
  /** Specifies the DistanceFromScale in the tick.
    * @Default {null}
    */
  var distanceFromScale: js.UndefOr[ScalesTicksDistanceFromScale] = js.native
  
  /** Specifies the tick Height in the tick.
    * @Default {10}
    */
  var height: js.UndefOr[Double] = js.native
  
  /** Specifies the opacity in the tick.
    * @Default {0}
    */
  var opacity: js.UndefOr[Double] = js.native
  
  /** Specifies the tick Placement in the tick. See TickPlacement
    * @Default {Near}
    */
  var placement: js.UndefOr[PointerPlacement | String] = js.native
  
  /** Specifies the tick Style in the tick. See
    * @Default {MajorInterval}
    */
  var `type`: js.UndefOr[TicksType | String] = js.native
  
  /** Specifies the tick Width in the tick.
    * @Default {3}
    */
  var width: js.UndefOr[Double] = js.native
}
object ScalesTick {
  
  @scala.inline
  def apply(): ScalesTick = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScalesTick]
  }
  
  @scala.inline
  implicit class ScalesTickOps[Self <: ScalesTick] (val x: Self) extends AnyVal {
    
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
    def setAngle(value: Double): Self = this.set("angle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAngle: Self = this.set("angle", js.undefined)
    
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setDistanceFromScale(value: ScalesTicksDistanceFromScale): Self = this.set("distanceFromScale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDistanceFromScale: Self = this.set("distanceFromScale", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setOpacity(value: Double): Self = this.set("opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
    
    @scala.inline
    def setPlacement(value: PointerPlacement | String): Self = this.set("placement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlacement: Self = this.set("placement", js.undefined)
    
    @scala.inline
    def setType(value: TicksType | String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
