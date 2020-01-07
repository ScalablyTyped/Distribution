package typings.googleapis.buildSrcApisCloudsearchV1Mod.cloudsearch_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$PushItemRequest extends js.Object {
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
    * Item to push onto the queue.
    */
  var item: js.UndefOr[Schema$PushItem] = js.native
}

object Schema$PushItemRequest {
  @scala.inline
  def apply(
    connectorName: String = null,
    debugOptions: Schema$DebugOptions = null,
    item: Schema$PushItem = null
  ): Schema$PushItemRequest = {
    val __obj = js.Dynamic.literal()
    if (connectorName != null) __obj.updateDynamic("connectorName")(connectorName.asInstanceOf[js.Any])
    if (debugOptions != null) __obj.updateDynamic("debugOptions")(debugOptions.asInstanceOf[js.Any])
    if (item != null) __obj.updateDynamic("item")(item.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$PushItemRequest]
  }
}

