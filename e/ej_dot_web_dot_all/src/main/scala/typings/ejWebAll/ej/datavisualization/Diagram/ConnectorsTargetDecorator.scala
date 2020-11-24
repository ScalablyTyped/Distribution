package typings.ejWebAll.ej.datavisualization.Diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConnectorsTargetDecorator extends js.Object {
  
  /** Sets the border color of the decorator
    * @Default {black}
    */
  var borderColor: js.UndefOr[String] = js.native
  
  /** This property allows you to customize targetDecorator appearance using user-defined CSS.
    */
  var cssClass: js.UndefOr[String] = js.native
  
  /** Sets the color with which the decorator will be filled
    * @Default {black}
    */
  var fillColor: js.UndefOr[String] = js.native
  
  /** Defines the height of the target decorator
    * @Default {8}
    */
  var height: js.UndefOr[Double] = js.native
  
  /** Defines the custom shape of the target decorator
    */
  var pathData: js.UndefOr[String] = js.native
  
  /** Defines the shape of the target decorator.
    * @Default {ej.datavisualization.Diagram.DecoratorShapes.Arrow}
    */
  var shape: js.UndefOr[DecoratorShapes | String] = js.native
  
  /** Defines the width of the target decorator
    * @Default {8}
    */
  var width: js.UndefOr[Double] = js.native
}
object ConnectorsTargetDecorator {
  
  @scala.inline
  def apply(): ConnectorsTargetDecorator = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectorsTargetDecorator]
  }
  
  @scala.inline
  implicit class ConnectorsTargetDecoratorOps[Self <: ConnectorsTargetDecorator] (val x: Self) extends AnyVal {
    
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
    def setBorderColor(value: String): Self = this.set("borderColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderColor: Self = this.set("borderColor", js.undefined)
    
    @scala.inline
    def setCssClass(value: String): Self = this.set("cssClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCssClass: Self = this.set("cssClass", js.undefined)
    
    @scala.inline
    def setFillColor(value: String): Self = this.set("fillColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFillColor: Self = this.set("fillColor", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setPathData(value: String): Self = this.set("pathData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePathData: Self = this.set("pathData", js.undefined)
    
    @scala.inline
    def setShape(value: DecoratorShapes | String): Self = this.set("shape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShape: Self = this.set("shape", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
