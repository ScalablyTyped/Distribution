package typings.gapiClientPlaymoviespartner.gapi.client.playmoviespartner

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListOrdersResponse extends js.Object {
  /** See _List methods rules_ for info about this field. */
  var nextPageToken: js.UndefOr[String] = js.native
  /** List of Orders that match the request criteria. */
  var orders: js.UndefOr[js.Array[Order]] = js.native
  /** See _List methods rules_ for more information about this field. */
  var totalSize: js.UndefOr[Double] = js.native
}

object ListOrdersResponse {
  @scala.inline
  def apply(): ListOrdersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListOrdersResponse]
  }
  @scala.inline
  implicit class ListOrdersResponseOps[Self <: ListOrdersResponse] (val x: Self) extends AnyVal {
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
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
    @scala.inline
    def setOrdersVarargs(value: Order*): Self = this.set("orders", js.Array(value :_*))
    @scala.inline
    def setOrders(value: js.Array[Order]): Self = this.set("orders", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrders: Self = this.set("orders", js.undefined)
    @scala.inline
    def setTotalSize(value: Double): Self = this.set("totalSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTotalSize: Self = this.set("totalSize", js.undefined)
  }
  
}

