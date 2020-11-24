package typings.ejWebAll.ej.datavisualization.Diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NodesGradientLinearGradient extends js.Object {
  
  /** Defines the different colors and the region of color transitions
    * @Default {[]}
    */
  var stops: js.UndefOr[js.Array[_]] = js.native
  
  /** Defines the type of gradient
    * @Default {linear}
    */
  var `type`: js.UndefOr[String] = js.native
  
  /** Defines the left most position(relative to node) of the rectangular region that needs to be painted
    * @Default {0}
    */
  var x1: js.UndefOr[Double] = js.native
  
  /** Defines the right most position(relative to node) of the rectangular region that needs to be painted
    * @Default {0}
    */
  var x2: js.UndefOr[Double] = js.native
  
  /** Defines the top most position(relative to node) of the rectangular region that needs to be painted
    * @Default {0}
    */
  var y1: js.UndefOr[Double] = js.native
  
  /** Defines the bottom most position(relative to node) of the rectangular region that needs to be painted
    * @Default {0}
    */
  var y2: js.UndefOr[Double] = js.native
}
object NodesGradientLinearGradient {
  
  @scala.inline
  def apply(): NodesGradientLinearGradient = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodesGradientLinearGradient]
  }
  
  @scala.inline
  implicit class NodesGradientLinearGradientOps[Self <: NodesGradientLinearGradient] (val x: Self) extends AnyVal {
    
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
    def setStopsVarargs(value: js.Any*): Self = this.set("stops", js.Array(value :_*))
    
    @scala.inline
    def setStops(value: js.Array[_]): Self = this.set("stops", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStops: Self = this.set("stops", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setX1(value: Double): Self = this.set("x1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteX1: Self = this.set("x1", js.undefined)
    
    @scala.inline
    def setX2(value: Double): Self = this.set("x2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteX2: Self = this.set("x2", js.undefined)
    
    @scala.inline
    def setY1(value: Double): Self = this.set("y1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteY1: Self = this.set("y1", js.undefined)
    
    @scala.inline
    def setY2(value: Double): Self = this.set("y2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteY2: Self = this.set("y2", js.undefined)
  }
}
