package typings.ejWebAll.ej.datavisualization.Diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NodesPort extends js.Object {
  /** Sets the border color of the port
    * @Default {#1a1a1a}
    */
  var borderColor: js.UndefOr[String] = js.native
  /** Sets the stroke width of the port
    * @Default {1}
    */
  var borderWidth: js.UndefOr[Double] = js.native
  /** Defines the space to be left between the port bounds and its incoming and outgoing connections.
    * @Default {0}
    */
  var connectorPadding: js.UndefOr[Double] = js.native
  /** Defines whether connections can be created with the port
    * @Default {ej.datavisualization.Diagram.PortConstraints.Connect}
    */
  var constraints: js.UndefOr[PortConstraints | String] = js.native
  /** This property allows you to customize ports appearance using user-defined CSS.
    */
  var cssClass: js.UndefOr[String] = js.native
  /** Sets the fill color of the port
    * @Default {white}
    */
  var fillColor: js.UndefOr[String] = js.native
  /** Sets the unique identifier of the port
    */
  var name: js.UndefOr[String] = js.native
  /** Defines the position of the port as fraction/ ratio relative to node
    * @Default {ej.datavisualization.Diagram.Point(0, 0)}
    */
  var offset: js.UndefOr[js.Any] = js.native
  /** Sets the name of the node which contains this port.
    */
  var parent: js.UndefOr[String] = js.native
  /** Defines the path data to draw the port. Applicable, if the port shape is path.
    */
  var pathData: js.UndefOr[String] = js.native
  /** Defines the shape of the port.
    * @Default {ej.datavisualization.Diagram.PortShapes.Square}
    */
  var shape: js.UndefOr[PortShapes | String] = js.native
  /** Defines the size of the port
    * @Default {8}
    */
  var size: js.UndefOr[Double] = js.native
  /** Defines when the port should be visible.
    * @Default {ej.datavisualization.Diagram.PortVisibility.Default}
    */
  var visibility: js.UndefOr[PortVisibility | String] = js.native
}

object NodesPort {
  @scala.inline
  def apply(): NodesPort = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodesPort]
  }
  @scala.inline
  implicit class NodesPortOps[Self <: NodesPort] (val x: Self) extends AnyVal {
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
    def setConnectorPadding(value: Double): Self = this.set("connectorPadding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConnectorPadding: Self = this.set("connectorPadding", js.undefined)
    @scala.inline
    def setConstraints(value: PortConstraints | String): Self = this.set("constraints", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConstraints: Self = this.set("constraints", js.undefined)
    @scala.inline
    def setCssClass(value: String): Self = this.set("cssClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCssClass: Self = this.set("cssClass", js.undefined)
    @scala.inline
    def setFillColor(value: String): Self = this.set("fillColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFillColor: Self = this.set("fillColor", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setOffset(value: js.Any): Self = this.set("offset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
    @scala.inline
    def setParent(value: String): Self = this.set("parent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParent: Self = this.set("parent", js.undefined)
    @scala.inline
    def setPathData(value: String): Self = this.set("pathData", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePathData: Self = this.set("pathData", js.undefined)
    @scala.inline
    def setShape(value: PortShapes | String): Self = this.set("shape", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShape: Self = this.set("shape", js.undefined)
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    @scala.inline
    def setVisibility(value: PortVisibility | String): Self = this.set("visibility", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisibility: Self = this.set("visibility", js.undefined)
  }
  
}

