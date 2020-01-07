package typings.googleapis.buildSrcApisServicenetworkingV1betaMod.servicenetworking_v1beta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ListConnectionsResponse is the response to list peering states for the
  * given service and consumer project.
  */
@js.native
trait Schema$ListConnectionsResponse extends js.Object {
  /**
    * The list of Connections.
    */
  var connections: js.UndefOr[js.Array[Schema$Connection]] = js.native
}

object Schema$ListConnectionsResponse {
  @scala.inline
  def apply(connections: js.Array[Schema$Connection] = null): Schema$ListConnectionsResponse = {
    val __obj = js.Dynamic.literal()
    if (connections != null) __obj.updateDynamic("connections")(connections.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ListConnectionsResponse]
  }
}

