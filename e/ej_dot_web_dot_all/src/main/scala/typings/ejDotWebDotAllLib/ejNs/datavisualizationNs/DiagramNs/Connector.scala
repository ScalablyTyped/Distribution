package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Connector extends js.Object {
  /** To maintain additional information about connectors
    * @Default {null}
    */
  var addInfo: js.UndefOr[js.Any] = js.undefined
  /** Defines the width of the line bridges
    * @Default {10}
    */
  var bridgeSpace: js.UndefOr[scala.Double] = js.undefined
  /** Enables or disables the behaviors of connectors.
    * @Default {ej.datavisualization.Diagram.ConnectorConstraints.Default}
    */
  var constraints: js.UndefOr[ConnectorConstraints | java.lang.String] = js.undefined
  /** Defines the radius of the rounded corner
    * @Default {0}
    */
  var cornerRadius: js.UndefOr[scala.Double] = js.undefined
  /** This property allows you to customize connectors appearance using user-defined CSS.
    */
  var cssClass: js.UndefOr[java.lang.String] = js.undefined
  /** Sets the horizontal alignment of the connector. Applicable, if the parent of the connector is a container.
    * @Default {ej.datavisualization.Diagram.HorizontalAlignment.Left}
    */
  var horizontalAlign: js.UndefOr[HorizontalAlignment | java.lang.String] = js.undefined
  /** A collection of JSON objects where each object represents a label.
    * @Default {[]}
    */
  var labels: js.UndefOr[js.Array[ConnectorsLabel]] = js.undefined
  /** Sets the stroke color of the connector
    * @Default {black}
    */
  var lineColor: js.UndefOr[java.lang.String] = js.undefined
  /** Sets the pattern of dashes and gaps used to stroke the path of the connector
    */
  var lineDashArray: js.UndefOr[java.lang.String] = js.undefined
  /** Defines the padding value to ease the interaction with connectors
    * @Default {10}
    */
  var lineHitPadding: js.UndefOr[scala.Double] = js.undefined
  /** Sets the width of the line
    * @Default {1}
    */
  var lineWidth: js.UndefOr[scala.Double] = js.undefined
  /** Defines the minimum space to be left between the bottom of parent bounds and the connector. Applicable, if the parent is a container.
    * @Default {0}
    */
  var marginBottom: js.UndefOr[scala.Double] = js.undefined
  /** Defines the minimum space to be left between the left of parent bounds and the connector. Applicable, if the parent is a container.
    * @Default {0}
    */
  var marginLeft: js.UndefOr[scala.Double] = js.undefined
  /** Defines the minimum space to be left between the right of parent bounds and the connector. Applicable, if the parent is a container.
    * @Default {0}
    */
  var marginRight: js.UndefOr[scala.Double] = js.undefined
  /** Defines the minimum space to be left between the top of parent bounds and the connector. Applicable, if the parent is a container.
    * @Default {0}
    */
  var marginTop: js.UndefOr[scala.Double] = js.undefined
  /** Sets a unique name for the connector
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** Defines the transparency of the connector
    * @Default {1}
    */
  var opacity: js.UndefOr[scala.Double] = js.undefined
  /** Defines the size and preview size of the node to add that to symbol palette. To explore palette item, refer Palette Item
    * @Default {null}
    */
  var paletteItem: js.UndefOr[js.Any] = js.undefined
  /** Sets the parent name of the connector.
    */
  var parent: js.UndefOr[java.lang.String] = js.undefined
  /** An array of JSON objects where each object represents a segment
    * @Default {[ { type:straight } ]}
    */
  var segments: js.UndefOr[js.Array[ConnectorsSegment]] = js.undefined
  /** Defines the role/meaning of the connector
    * @Default {null}
    */
  var shape: js.UndefOr[ConnectorsShape] = js.undefined
  /** Defines the source decorator of the connector
    * @Default {{ shape:arrow, width: 8, height:8, borderColor:black, fillColor:black }}
    */
  var sourceDecorator: js.UndefOr[ConnectorsSourceDecorator] = js.undefined
  /** Sets the source node of the connector
    */
  var sourceNode: js.UndefOr[java.lang.String] = js.undefined
  /** Defines the space to be left between the source node and the source point of a connector
    * @Default {0}
    */
  var sourcePadding: js.UndefOr[scala.Double] = js.undefined
  /** Describes the start point of the connector
    * @Default {ej.datavisualization.Diagram.Point()}
    */
  var sourcePoint: js.UndefOr[ConnectorsSourcePoint] = js.undefined
  /** Sets the source port of the connector
    */
  var sourcePort: js.UndefOr[java.lang.String] = js.undefined
  /** Defines the target decorator of the connector
    * @Default {{ shape:arrow, width: 8, height:8, borderColor:black, fillColor:black }}
    */
  var targetDecorator: js.UndefOr[ConnectorsTargetDecorator] = js.undefined
  /** Sets the target node of the connector
    */
  var targetNode: js.UndefOr[java.lang.String] = js.undefined
  /** Defines the space to be left between the target node and the target point of the connector
    * @Default {0}
    */
  var targetPadding: js.UndefOr[scala.Double] = js.undefined
  /** Describes the end point of the connector
    * @Default {ej.datavisualization.Diagram.Point()}
    */
  var targetPoint: js.UndefOr[ConnectorsSourcePoint] = js.undefined
  /** Sets the targetPort of the connector
    */
  var targetPort: js.UndefOr[java.lang.String] = js.undefined
  /** Defines the tooltip that should be shown when the mouse hovers over connector. For tooltip properties, refer Tooltip
    * @Default {null}
    */
  var tooltip: js.UndefOr[js.Any] = js.undefined
  /** To set the vertical alignment of connector (Applicable,if the parent is group).
    * @Default {ej.datavisualization.Diagram.VerticalAlignment.Top}
    */
  var verticalAlign: js.UndefOr[VerticalAlignment | java.lang.String] = js.undefined
  /** Enables or disables the visibility of connector
    * @Default {true}
    */
  var visible: js.UndefOr[scala.Boolean] = js.undefined
  /** Sets the z-index of the connector
    * @Default {0}
    */
  var zOrder: js.UndefOr[scala.Double] = js.undefined
}

object Connector {
  @scala.inline
  def apply(
    addInfo: js.Any = null,
    bridgeSpace: scala.Int | scala.Double = null,
    constraints: ConnectorConstraints | java.lang.String = null,
    cornerRadius: scala.Int | scala.Double = null,
    cssClass: java.lang.String = null,
    horizontalAlign: HorizontalAlignment | java.lang.String = null,
    labels: js.Array[ConnectorsLabel] = null,
    lineColor: java.lang.String = null,
    lineDashArray: java.lang.String = null,
    lineHitPadding: scala.Int | scala.Double = null,
    lineWidth: scala.Int | scala.Double = null,
    marginBottom: scala.Int | scala.Double = null,
    marginLeft: scala.Int | scala.Double = null,
    marginRight: scala.Int | scala.Double = null,
    marginTop: scala.Int | scala.Double = null,
    name: java.lang.String = null,
    opacity: scala.Int | scala.Double = null,
    paletteItem: js.Any = null,
    parent: java.lang.String = null,
    segments: js.Array[ConnectorsSegment] = null,
    shape: ConnectorsShape = null,
    sourceDecorator: ConnectorsSourceDecorator = null,
    sourceNode: java.lang.String = null,
    sourcePadding: scala.Int | scala.Double = null,
    sourcePoint: ConnectorsSourcePoint = null,
    sourcePort: java.lang.String = null,
    targetDecorator: ConnectorsTargetDecorator = null,
    targetNode: java.lang.String = null,
    targetPadding: scala.Int | scala.Double = null,
    targetPoint: ConnectorsSourcePoint = null,
    targetPort: java.lang.String = null,
    tooltip: js.Any = null,
    verticalAlign: VerticalAlignment | java.lang.String = null,
    visible: js.UndefOr[scala.Boolean] = js.undefined,
    zOrder: scala.Int | scala.Double = null
  ): Connector = {
    val __obj = js.Dynamic.literal()
    if (addInfo != null) __obj.updateDynamic("addInfo")(addInfo)
    if (bridgeSpace != null) __obj.updateDynamic("bridgeSpace")(bridgeSpace.asInstanceOf[js.Any])
    if (constraints != null) __obj.updateDynamic("constraints")(constraints.asInstanceOf[js.Any])
    if (cornerRadius != null) __obj.updateDynamic("cornerRadius")(cornerRadius.asInstanceOf[js.Any])
    if (cssClass != null) __obj.updateDynamic("cssClass")(cssClass)
    if (horizontalAlign != null) __obj.updateDynamic("horizontalAlign")(horizontalAlign.asInstanceOf[js.Any])
    if (labels != null) __obj.updateDynamic("labels")(labels)
    if (lineColor != null) __obj.updateDynamic("lineColor")(lineColor)
    if (lineDashArray != null) __obj.updateDynamic("lineDashArray")(lineDashArray)
    if (lineHitPadding != null) __obj.updateDynamic("lineHitPadding")(lineHitPadding.asInstanceOf[js.Any])
    if (lineWidth != null) __obj.updateDynamic("lineWidth")(lineWidth.asInstanceOf[js.Any])
    if (marginBottom != null) __obj.updateDynamic("marginBottom")(marginBottom.asInstanceOf[js.Any])
    if (marginLeft != null) __obj.updateDynamic("marginLeft")(marginLeft.asInstanceOf[js.Any])
    if (marginRight != null) __obj.updateDynamic("marginRight")(marginRight.asInstanceOf[js.Any])
    if (marginTop != null) __obj.updateDynamic("marginTop")(marginTop.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (paletteItem != null) __obj.updateDynamic("paletteItem")(paletteItem)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    if (segments != null) __obj.updateDynamic("segments")(segments)
    if (shape != null) __obj.updateDynamic("shape")(shape)
    if (sourceDecorator != null) __obj.updateDynamic("sourceDecorator")(sourceDecorator)
    if (sourceNode != null) __obj.updateDynamic("sourceNode")(sourceNode)
    if (sourcePadding != null) __obj.updateDynamic("sourcePadding")(sourcePadding.asInstanceOf[js.Any])
    if (sourcePoint != null) __obj.updateDynamic("sourcePoint")(sourcePoint)
    if (sourcePort != null) __obj.updateDynamic("sourcePort")(sourcePort)
    if (targetDecorator != null) __obj.updateDynamic("targetDecorator")(targetDecorator)
    if (targetNode != null) __obj.updateDynamic("targetNode")(targetNode)
    if (targetPadding != null) __obj.updateDynamic("targetPadding")(targetPadding.asInstanceOf[js.Any])
    if (targetPoint != null) __obj.updateDynamic("targetPoint")(targetPoint)
    if (targetPort != null) __obj.updateDynamic("targetPort")(targetPort)
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip)
    if (verticalAlign != null) __obj.updateDynamic("verticalAlign")(verticalAlign.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    if (zOrder != null) __obj.updateDynamic("zOrder")(zOrder.asInstanceOf[js.Any])
    __obj.asInstanceOf[Connector]
  }
}

