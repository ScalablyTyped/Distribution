package typings.ejDotWebDotAll.ejNs.datavisualizationNs.DiagramNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectionChangeEventArgs extends js.Object {
  /** parameter defines whether to cancel the change or not
    */
  var cancel: js.UndefOr[Boolean] = js.undefined
  /** parameter returns the new source node or target node of the connector
    */
  var connection: js.UndefOr[String] = js.undefined
  /** parameter returns the id of the diagram
    */
  var diagramId: js.UndefOr[String] = js.undefined
  /** parameter returns the connection that is changed between nodes, ports or points
    */
  var element: js.UndefOr[js.Any] = js.undefined
  /** parameter returns the new source port or target port of the connector
    */
  var port: js.UndefOr[js.Any] = js.undefined
}

object ConnectionChangeEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[Boolean] = js.undefined,
    connection: String = null,
    diagramId: String = null,
    element: js.Any = null,
    port: js.Any = null
  ): ConnectionChangeEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (connection != null) __obj.updateDynamic("connection")(connection)
    if (diagramId != null) __obj.updateDynamic("diagramId")(diagramId)
    if (element != null) __obj.updateDynamic("element")(element)
    if (port != null) __obj.updateDynamic("port")(port)
    __obj.asInstanceOf[ConnectionChangeEventArgs]
  }
}

