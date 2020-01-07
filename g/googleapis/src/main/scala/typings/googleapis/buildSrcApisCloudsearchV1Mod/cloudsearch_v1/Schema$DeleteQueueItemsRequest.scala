package typings.googleapis.buildSrcApisCloudsearchV1Mod.cloudsearch_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$DeleteQueueItemsRequest extends js.Object {
  /**
    * Name of connector making this call. &lt;br /&gt;Format:
    * datasources/{source_id}/connectors/{ID}
    */
  var connectorName: js.UndefOr[String] = js.native
  /**
    * Common debug options.
    */
  var debugOptions: js.UndefOr[Schema$DebugOptions] = js.native
  /**
    * Name of a queue to delete items from.
    */
  var queue: js.UndefOr[String] = js.native
}

object Schema$DeleteQueueItemsRequest {
  @scala.inline
  def apply(connectorName: String = null, debugOptions: Schema$DebugOptions = null, queue: String = null): Schema$DeleteQueueItemsRequest = {
    val __obj = js.Dynamic.literal()
    if (connectorName != null) __obj.updateDynamic("connectorName")(connectorName.asInstanceOf[js.Any])
    if (debugOptions != null) __obj.updateDynamic("debugOptions")(debugOptions.asInstanceOf[js.Any])
    if (queue != null) __obj.updateDynamic("queue")(queue.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$DeleteQueueItemsRequest]
  }
}

