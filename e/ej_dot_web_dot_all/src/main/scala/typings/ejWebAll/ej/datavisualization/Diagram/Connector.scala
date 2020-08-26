package typings.ejWebAll.ej.datavisualization.Diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Connector extends js.Object {
  /** To maintain additional information about connectors
    * @Default {null}
    */
  var addInfo: js.UndefOr[js.Any] = js.native
  /** Defines the width of the line bridges
    * @Default {10}
    */
  var bridgeSpace: js.UndefOr[Double] = js.native
  /** Enables or disables the behaviors of connectors.
    * @Default {ej.datavisualization.Diagram.ConnectorConstraints.Default}
    */
  var constraints: js.UndefOr[ConnectorConstraints | String] = js.native
  /** Defines the radius of the rounded corner
    * @Default {0}
    */
  var cornerRadius: js.UndefOr[Double] = js.native
  /** This property allows you to customize connectors appearance using user-defined CSS.
    */
  var cssClass: js.UndefOr[String] = js.native
  /** Sets the horizontal alignment of the connector. Applicable, if the parent of the connector is a container.
    * @Default {ej.datavisualization.Diagram.HorizontalAlignment.Left}
    */
  var horizontalAlign: js.UndefOr[HorizontalAlignment | String] = js.native
  /** A collection of JSON objects where each object represents a label.
    * @Default {[]}
    */
  var labels: js.UndefOr[js.Array[ConnectorsLabel]] = js.native
  /** Sets the stroke color of the connector
    * @Default {black}
    */
  var lineColor: js.UndefOr[String] = js.native
  /** Sets the pattern of dashes and gaps used to stroke the path of the connector
    */
  var lineDashArray: js.UndefOr[String] = js.native
  /** Defines the padding value to ease the interaction with connectors
    * @Default {10}
    */
  var lineHitPadding: js.UndefOr[Double] = js.native
  /** Sets the width of the line
    * @Default {1}
    */
  var lineWidth: js.UndefOr[Double] = js.native
  /** Defines the minimum space to be left between the bottom of parent bounds and the connector. Applicable, if the parent is a container.
    * @Default {0}
    */
  var marginBottom: js.UndefOr[Double] = js.native
  /** Defines the minimum space to be left between the left of parent bounds and the connector. Applicable, if the parent is a container.
    * @Default {0}
    */
  var marginLeft: js.UndefOr[Double] = js.native
  /** Defines the minimum space to be left between the right of parent bounds and the connector. Applicable, if the parent is a container.
    * @Default {0}
    */
  var marginRight: js.UndefOr[Double] = js.native
  /** Defines the minimum space to be left between the top of parent bounds and the connector. Applicable, if the parent is a container.
    * @Default {0}
    */
  var marginTop: js.UndefOr[Double] = js.native
  /** Sets a unique name for the connector
    */
  var name: js.UndefOr[String] = js.native
  /** Defines the transparency of the connector
    * @Default {1}
    */
  var opacity: js.UndefOr[Double] = js.native
  /** Defines the size and preview size of the node to add that to symbol palette. To explore palette item, refer Palette Item
    * @Default {null}
    */
  var paletteItem: js.UndefOr[js.Any] = js.native
  /** Sets the parent name of the connector.
    */
  var parent: js.UndefOr[String] = js.native
  /** An array of JSON objects where each object represents a segment
    * @Default {[ { type:straight } ]}
    */
  var segments: js.UndefOr[js.Array[ConnectorsSegment]] = js.native
  /** Defines the role/meaning of the connector
    * @Default {null}
    */
  var shape: js.UndefOr[ConnectorsShape] = js.native
  /** Defines the source decorator of the connector
    * @Default {{ shape:arrow, width: 8, height:8, borderColor:black, fillColor:black }}
    */
  var sourceDecorator: js.UndefOr[ConnectorsSourceDecorator] = js.native
  /** Sets the source node of the connector
    */
  var sourceNode: js.UndefOr[String] = js.native
  /** Defines the space to be left between the source node and the source point of a connector
    * @Default {0}
    */
  var sourcePadding: js.UndefOr[Double] = js.native
  /** Describes the start point of the connector
    * @Default {ej.datavisualization.Diagram.Point()}
    */
  var sourcePoint: js.UndefOr[ConnectorsSourcePoint] = js.native
  /** Sets the source port of the connector
    */
  var sourcePort: js.UndefOr[String] = js.native
  /** Defines the target decorator of the connector
    * @Default {{ shape:arrow, width: 8, height:8, borderColor:black, fillColor:black }}
    */
  var targetDecorator: js.UndefOr[ConnectorsTargetDecorator] = js.native
  /** Sets the target node of the connector
    */
  var targetNode: js.UndefOr[String] = js.native
  /** Defines the space to be left between the target node and the target point of the connector
    * @Default {0}
    */
  var targetPadding: js.UndefOr[Double] = js.native
  /** Describes the end point of the connector
    * @Default {ej.datavisualization.Diagram.Point()}
    */
  var targetPoint: js.UndefOr[ConnectorsSourcePoint] = js.native
  /** Sets the targetPort of the connector
    */
  var targetPort: js.UndefOr[String] = js.native
  /** Defines the tooltip that should be shown when the mouse hovers over connector. For tooltip properties, refer Tooltip
    * @Default {null}
    */
  var tooltip: js.UndefOr[js.Any] = js.native
  /** To set the vertical alignment of connector (Applicable,if the parent is group).
    * @Default {ej.datavisualization.Diagram.VerticalAlignment.Top}
    */
  var verticalAlign: js.UndefOr[VerticalAlignment | String] = js.native
  /** Enables or disables the visibility of connector
    * @Default {true}
    */
  var visible: js.UndefOr[Boolean] = js.native
  /** Sets the z-index of the connector
    * @Default {0}
    */
  var zOrder: js.UndefOr[Double] = js.native
}

object Connector {
  @scala.inline
  def apply(): Connector = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Connector]
  }
  @scala.inline
  implicit class ConnectorOps[Self <: Connector] (val x: Self) extends AnyVal {
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
    def setAddInfo(value: js.Any): Self = this.set("addInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddInfo: Self = this.set("addInfo", js.undefined)
    @scala.inline
    def setBridgeSpace(value: Double): Self = this.set("bridgeSpace", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBridgeSpace: Self = this.set("bridgeSpace", js.undefined)
    @scala.inline
    def setConstraints(value: ConnectorConstraints | String): Self = this.set("constraints", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConstraints: Self = this.set("constraints", js.undefined)
    @scala.inline
    def setCornerRadius(value: Double): Self = this.set("cornerRadius", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCornerRadius: Self = this.set("cornerRadius", js.undefined)
    @scala.inline
    def setCssClass(value: String): Self = this.set("cssClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCssClass: Self = this.set("cssClass", js.undefined)
    @scala.inline
    def setHorizontalAlign(value: HorizontalAlignment | String): Self = this.set("horizontalAlign", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHorizontalAlign: Self = this.set("horizontalAlign", js.undefined)
    @scala.inline
    def setLabelsVarargs(value: ConnectorsLabel*): Self = this.set("labels", js.Array(value :_*))
    @scala.inline
    def setLabels(value: js.Array[ConnectorsLabel]): Self = this.set("labels", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabels: Self = this.set("labels", js.undefined)
    @scala.inline
    def setLineColor(value: String): Self = this.set("lineColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLineColor: Self = this.set("lineColor", js.undefined)
    @scala.inline
    def setLineDashArray(value: String): Self = this.set("lineDashArray", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLineDashArray: Self = this.set("lineDashArray", js.undefined)
    @scala.inline
    def setLineHitPadding(value: Double): Self = this.set("lineHitPadding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLineHitPadding: Self = this.set("lineHitPadding", js.undefined)
    @scala.inline
    def setLineWidth(value: Double): Self = this.set("lineWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLineWidth: Self = this.set("lineWidth", js.undefined)
    @scala.inline
    def setMarginBottom(value: Double): Self = this.set("marginBottom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarginBottom: Self = this.set("marginBottom", js.undefined)
    @scala.inline
    def setMarginLeft(value: Double): Self = this.set("marginLeft", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarginLeft: Self = this.set("marginLeft", js.undefined)
    @scala.inline
    def setMarginRight(value: Double): Self = this.set("marginRight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarginRight: Self = this.set("marginRight", js.undefined)
    @scala.inline
    def setMarginTop(value: Double): Self = this.set("marginTop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarginTop: Self = this.set("marginTop", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setOpacity(value: Double): Self = this.set("opacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
    @scala.inline
    def setPaletteItem(value: js.Any): Self = this.set("paletteItem", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaletteItem: Self = this.set("paletteItem", js.undefined)
    @scala.inline
    def setParent(value: String): Self = this.set("parent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParent: Self = this.set("parent", js.undefined)
    @scala.inline
    def setSegmentsVarargs(value: ConnectorsSegment*): Self = this.set("segments", js.Array(value :_*))
    @scala.inline
    def setSegments(value: js.Array[ConnectorsSegment]): Self = this.set("segments", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSegments: Self = this.set("segments", js.undefined)
    @scala.inline
    def setShape(value: ConnectorsShape): Self = this.set("shape", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShape: Self = this.set("shape", js.undefined)
    @scala.inline
    def setSourceDecorator(value: ConnectorsSourceDecorator): Self = this.set("sourceDecorator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceDecorator: Self = this.set("sourceDecorator", js.undefined)
    @scala.inline
    def setSourceNode(value: String): Self = this.set("sourceNode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceNode: Self = this.set("sourceNode", js.undefined)
    @scala.inline
    def setSourcePadding(value: Double): Self = this.set("sourcePadding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourcePadding: Self = this.set("sourcePadding", js.undefined)
    @scala.inline
    def setSourcePoint(value: ConnectorsSourcePoint): Self = this.set("sourcePoint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourcePoint: Self = this.set("sourcePoint", js.undefined)
    @scala.inline
    def setSourcePort(value: String): Self = this.set("sourcePort", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourcePort: Self = this.set("sourcePort", js.undefined)
    @scala.inline
    def setTargetDecorator(value: ConnectorsTargetDecorator): Self = this.set("targetDecorator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargetDecorator: Self = this.set("targetDecorator", js.undefined)
    @scala.inline
    def setTargetNode(value: String): Self = this.set("targetNode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargetNode: Self = this.set("targetNode", js.undefined)
    @scala.inline
    def setTargetPadding(value: Double): Self = this.set("targetPadding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargetPadding: Self = this.set("targetPadding", js.undefined)
    @scala.inline
    def setTargetPoint(value: ConnectorsSourcePoint): Self = this.set("targetPoint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargetPoint: Self = this.set("targetPoint", js.undefined)
    @scala.inline
    def setTargetPort(value: String): Self = this.set("targetPort", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargetPort: Self = this.set("targetPort", js.undefined)
    @scala.inline
    def setTooltip(value: js.Any): Self = this.set("tooltip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTooltip: Self = this.set("tooltip", js.undefined)
    @scala.inline
    def setVerticalAlign(value: VerticalAlignment | String): Self = this.set("verticalAlign", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVerticalAlign: Self = this.set("verticalAlign", js.undefined)
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
    @scala.inline
    def setZOrder(value: Double): Self = this.set("zOrder", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZOrder: Self = this.set("zOrder", js.undefined)
  }
  
}

