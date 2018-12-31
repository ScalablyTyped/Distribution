package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodesPort extends js.Object {
  /** Sets the border color of the port
    * @Default {#1a1a1a}
    */
  var borderColor: js.UndefOr[java.lang.String] = js.undefined
  /** Sets the stroke width of the port
    * @Default {1}
    */
  var borderWidth: js.UndefOr[scala.Double] = js.undefined
  /** Defines the space to be left between the port bounds and its incoming and outgoing connections.
    * @Default {0}
    */
  var connectorPadding: js.UndefOr[scala.Double] = js.undefined
  /** Defines whether connections can be created with the port
    * @Default {ej.datavisualization.Diagram.PortConstraints.Connect}
    */
  var constraints: js.UndefOr[PortConstraints | java.lang.String] = js.undefined
  /** This property allows you to customize ports appearance using user-defined CSS.
    */
  var cssClass: js.UndefOr[java.lang.String] = js.undefined
  /** Sets the fill color of the port
    * @Default {white}
    */
  var fillColor: js.UndefOr[java.lang.String] = js.undefined
  /** Sets the unique identifier of the port
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** Defines the position of the port as fraction/ ratio relative to node
    * @Default {ej.datavisualization.Diagram.Point(0, 0)}
    */
  var offset: js.UndefOr[js.Any] = js.undefined
  /** Sets the name of the node which contains this port.
    */
  var parent: js.UndefOr[java.lang.String] = js.undefined
  /** Defines the path data to draw the port. Applicable, if the port shape is path.
    */
  var pathData: js.UndefOr[java.lang.String] = js.undefined
  /** Defines the shape of the port.
    * @Default {ej.datavisualization.Diagram.PortShapes.Square}
    */
  var shape: js.UndefOr[PortShapes | java.lang.String] = js.undefined
  /** Defines the size of the port
    * @Default {8}
    */
  var size: js.UndefOr[scala.Double] = js.undefined
  /** Defines when the port should be visible.
    * @Default {ej.datavisualization.Diagram.PortVisibility.Default}
    */
  var visibility: js.UndefOr[PortVisibility | java.lang.String] = js.undefined
}

