package typings.ejWebAll.ej.datavisualization.Diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NodesGradientStop extends js.Object {
  
  /** Sets the color to be filled over the specified region
    */
  var color: js.UndefOr[String] = js.native
  
  /** Sets the position where the previous color transition ends and a new color transition starts
    * @Default {0}
    */
  var offset: js.UndefOr[Double] = js.native
  
  /** Describes the transparency level of the region
    * @Default {1}
    */
  var opacity: js.UndefOr[Double] = js.native
}
object NodesGradientStop {
  
  @scala.inline
  def apply(): NodesGradientStop = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodesGradientStop]
  }
  
  @scala.inline
  implicit class NodesGradientStopOps[Self <: NodesGradientStop] (val x: Self) extends AnyVal {
    
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
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setOffset(value: Double): Self = this.set("offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
    
    @scala.inline
    def setOpacity(value: Double): Self = this.set("opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
  }
}
