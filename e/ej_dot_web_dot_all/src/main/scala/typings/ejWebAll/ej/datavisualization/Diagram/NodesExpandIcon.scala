package typings.ejWebAll.ej.datavisualization.Diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NodesExpandIcon extends js.Object {
  
  /** Sets the border color for expand icon of node
    * @Default {black}
    */
  var borderColor: js.UndefOr[String] = js.native
  
  /** Sets the border width for expand icon of node
    * @Default {1}
    */
  var borderWidth: js.UndefOr[Double] = js.native
  
  /** Sets the fill color for expand icon of node
    * @Default {white}
    */
  var fillColor: js.UndefOr[String] = js.native
  
  /** Defines the height for expand icon of node
    * @Default {15}
    */
  var height: js.UndefOr[Double] = js.native
  
  /** Sets the horizontal alignment of the icon.
    * @Default {ej.datavisualization.Diagram.HorizontalAlignment.Center}
    */
  var horizontalAlignment: js.UndefOr[HorizontalAlignment | String] = js.native
  
  /** To set the margin for the expand icon of node
    * @Default {ej.datavisualization.Diagram.Margin()}
    */
  var margin: js.UndefOr[js.Any] = js.native
  
  /** Sets the fraction/ratio(relative to node) that defines the position of the icon
    * @Default {ej.datavisualization.Diagram.Point(0.5, 1)}
    */
  var offset: js.UndefOr[js.Any] = js.native
  
  /** Defines the shape of the expanded state of the node.
    * @Default {ej.datavisualization.Diagram.IconShapes.None}
    */
  var shape: js.UndefOr[IconShapes | String] = js.native
  
  /** Sets the vertical alignment of the icon.
    * @Default {ej.datavisualization.Diagram.VerticalAlignment.Center}
    */
  var verticalAlignment: js.UndefOr[VerticalAlignment | String] = js.native
}
object NodesExpandIcon {
  
  @scala.inline
  def apply(): NodesExpandIcon = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodesExpandIcon]
  }
  
  @scala.inline
  implicit class NodesExpandIconOps[Self <: NodesExpandIcon] (val x: Self) extends AnyVal {
    
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
    def setBorderWidth(value: Double): Self = this.set("borderWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderWidth: Self = this.set("borderWidth", js.undefined)
    
    @scala.inline
    def setFillColor(value: String): Self = this.set("fillColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFillColor: Self = this.set("fillColor", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setHorizontalAlignment(value: HorizontalAlignment | String): Self = this.set("horizontalAlignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHorizontalAlignment: Self = this.set("horizontalAlignment", js.undefined)
    
    @scala.inline
    def setMargin(value: js.Any): Self = this.set("margin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMargin: Self = this.set("margin", js.undefined)
    
    @scala.inline
    def setOffset(value: js.Any): Self = this.set("offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
    
    @scala.inline
    def setShape(value: IconShapes | String): Self = this.set("shape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShape: Self = this.set("shape", js.undefined)
    
    @scala.inline
    def setVerticalAlignment(value: VerticalAlignment | String): Self = this.set("verticalAlignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVerticalAlignment: Self = this.set("verticalAlignment", js.undefined)
  }
}
