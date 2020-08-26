package typings.gapiClientDfareporting.gapi.client.dfareporting

import typings.gapiClient.gapi.client.Request
import typings.gapiClientDfareporting.anon.Id
import typings.gapiClientDfareporting.anon.InPlan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InventoryItemsResource extends js.Object {
  /** Gets one inventory item by ID. */
  def get(request: Id): Request[InventoryItem] = js.native
  /** Retrieves a list of inventory items, possibly filtered. This method supports paging. */
  def list(request: InPlan): Request[InventoryItemsListResponse] = js.native
}

object InventoryItemsResource {
  @scala.inline
  def apply(get: Id => Request[InventoryItem], list: InPlan => Request[InventoryItemsListResponse]): InventoryItemsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[InventoryItemsResource]
  }
  @scala.inline
  implicit class InventoryItemsResourceOps[Self <: InventoryItemsResource] (val x: Self) extends AnyVal {
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
    def setGet(value: Id => Request[InventoryItem]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: InPlan => Request[InventoryItemsListResponse]): Self = this.set("list", js.Any.fromFunction1(value))
  }
  
}

