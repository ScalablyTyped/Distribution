package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaIndexItemRequest extends js.Object {
  /**
    * Name of connector making this call. &lt;br /&gt;Format:
    * datasources/{source_id}/connectors/{ID}
    */
  var connectorName: js.UndefOr[String] = js.native
  /**
    * Common debug options.
    */
  var debugOptions: js.UndefOr[SchemaDebugOptions] = js.native
  var indexItemOptions: js.UndefOr[SchemaIndexItemOptions] = js.native
  /**
    * Name of the item.  Format: datasources/{source_id}/items/{item_id}
    */
  var item: js.UndefOr[SchemaItem] = js.native
  /**
    * Required. The RequestMode for this request.
    */
  var mode: js.UndefOr[String] = js.native
}

object SchemaIndexItemRequest {
  @scala.inline
  def apply(
    connectorName: String = null,
    debugOptions: SchemaDebugOptions = null,
    indexItemOptions: SchemaIndexItemOptions = null,
    item: SchemaItem = null,
    mode: String = null
  ): SchemaIndexItemRequest = {
    val __obj = js.Dynamic.literal()
    if (connectorName != null) __obj.updateDynamic("connectorName")(connectorName.asInstanceOf[js.Any])
    if (debugOptions != null) __obj.updateDynamic("debugOptions")(debugOptions.asInstanceOf[js.Any])
    if (indexItemOptions != null) __obj.updateDynamic("indexItemOptions")(indexItemOptions.asInstanceOf[js.Any])
    if (item != null) __obj.updateDynamic("item")(item.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaIndexItemRequest]
  }
}

