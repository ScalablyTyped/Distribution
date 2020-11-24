package typings.ejWebAll.ej.datavisualization.CircularGauge

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScalesPointerCap extends js.Object {
  
  /** Specify cap backgroundColor of circular gauge
    * @Default {null}
    */
  var backgroundColor: js.UndefOr[String] = js.native
  
  /** Specify cap borderColor of circular gauge
    * @Default {null}
    */
  var borderColor: js.UndefOr[String] = js.native
  
  /** Specify pointerCap borderWidth value of circular gauge
    * @Default {3}
    */
  var borderWidth: js.UndefOr[Double] = js.native
  
  /** Specify cap interiorGradient value of circular gauge
    * @Default {null}
    */
  var interiorGradient: js.UndefOr[js.Any] = js.native
  
  /** Specify pointerCap Radius value of circular gauge
    * @Default {7}
    */
  var radius: js.UndefOr[Double] = js.native
}
object ScalesPointerCap {
  
  @scala.inline
  def apply(): ScalesPointerCap = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScalesPointerCap]
  }
  
  @scala.inline
  implicit class ScalesPointerCapOps[Self <: ScalesPointerCap] (val x: Self) extends AnyVal {
    
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
    def setBorderWidth(value: Double): Self = this.set("borderWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderWidth: Self = this.set("borderWidth", js.undefined)
    
    @scala.inline
    def setInteriorGradient(value: js.Any): Self = this.set("interiorGradient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInteriorGradient: Self = this.set("interiorGradient", js.undefined)
    
    @scala.inline
    def setRadius(value: Double): Self = this.set("radius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRadius: Self = this.set("radius", js.undefined)
  }
}
