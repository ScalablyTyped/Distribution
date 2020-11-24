package typings.ejWebAll.ej.datavisualization.Diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NodesGradient extends js.Object {
  
  /** Paints the node with linear color transitions
    */
  var LinearGradient: js.UndefOr[NodesGradientLinearGradient] = js.native
  
  /** Paints the node with radial color transitions. A focal point defines the beginning of the gradient, and a circle defines the end point of the gradient.
    */
  var RadialGradient: js.UndefOr[NodesGradientRadialGradient] = js.native
  
  /** Defines the color and a position where the previous color transition ends and a new color transition starts
    */
  var Stop: js.UndefOr[NodesGradientStop] = js.native
}
object NodesGradient {
  
  @scala.inline
  def apply(): NodesGradient = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodesGradient]
  }
  
  @scala.inline
  implicit class NodesGradientOps[Self <: NodesGradient] (val x: Self) extends AnyVal {
    
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
    def setLinearGradient(value: NodesGradientLinearGradient): Self = this.set("LinearGradient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLinearGradient: Self = this.set("LinearGradient", js.undefined)
    
    @scala.inline
    def setRadialGradient(value: NodesGradientRadialGradient): Self = this.set("RadialGradient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRadialGradient: Self = this.set("RadialGradient", js.undefined)
    
    @scala.inline
    def setStop(value: NodesGradientStop): Self = this.set("Stop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStop: Self = this.set("Stop", js.undefined)
  }
}
