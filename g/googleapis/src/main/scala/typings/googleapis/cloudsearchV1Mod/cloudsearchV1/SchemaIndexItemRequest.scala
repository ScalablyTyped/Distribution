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
  def apply(): SchemaIndexItemRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaIndexItemRequest]
  }
  @scala.inline
  implicit class SchemaIndexItemRequestOps[Self <: SchemaIndexItemRequest] (val x: Self) extends AnyVal {
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
    def setConnectorName(value: String): Self = this.set("connectorName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConnectorName: Self = this.set("connectorName", js.undefined)
    @scala.inline
    def setDebugOptions(value: SchemaDebugOptions): Self = this.set("debugOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDebugOptions: Self = this.set("debugOptions", js.undefined)
    @scala.inline
    def setIndexItemOptions(value: SchemaIndexItemOptions): Self = this.set("indexItemOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndexItemOptions: Self = this.set("indexItemOptions", js.undefined)
    @scala.inline
    def setItem(value: SchemaItem): Self = this.set("item", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItem: Self = this.set("item", js.undefined)
    @scala.inline
    def setMode(value: String): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
  }
  
}

