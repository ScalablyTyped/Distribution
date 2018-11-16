package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ConnectionChangeEventArgs extends js.Object {
  /** parameter defines whether to cancel the change or not
               */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** parameter returns the new source node or target node of the connector
               */
  var connection: js.UndefOr[java.lang.String] = js.undefined
  /** parameter returns the id of the diagram
               */
  var diagramId: js.UndefOr[java.lang.String] = js.undefined
  /** parameter returns the connection that is changed between nodes, ports or points
               */
  var element: js.UndefOr[js.Any] = js.undefined
  /** parameter returns the new source port or target port of the connector
               */
  var port: js.UndefOr[js.Any] = js.undefined
}

