package typings.ejWebAll.ej.datavisualization.LinearGauge

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScalesLabelsDistanceFromScale extends js.Object {
  
  /** Specifies the xDistanceFromScale of labels.
    * @Default {-10}
    */
  var x: js.UndefOr[Double] = js.native
  
  /** Specifies the yDistanceFromScale of labels.
    * @Default {0}
    */
  var y: js.UndefOr[Double] = js.native
}
object ScalesLabelsDistanceFromScale {
  
  @scala.inline
  def apply(): ScalesLabelsDistanceFromScale = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScalesLabelsDistanceFromScale]
  }
  
  @scala.inline
  implicit class ScalesLabelsDistanceFromScaleOps[Self <: ScalesLabelsDistanceFromScale] (val x: Self) extends AnyVal {
    
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
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteX: Self = this.set("x", js.undefined)
    
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteY: Self = this.set("y", js.undefined)
  }
}
