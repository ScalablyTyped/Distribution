package typings.gapiClientSqladmin.gapi.client.sqladmin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstancesListResponse extends js.Object {
  /** List of database instance resources. */
  var items: js.UndefOr[js.Array[DatabaseInstance]] = js.native
  /** This is always sql#instancesList. */
  var kind: js.UndefOr[String] = js.native
  /** The continuation token, used to page through large result sets. Provide this value in a subsequent request to return the next page of results. */
  var nextPageToken: js.UndefOr[String] = js.native
}

object InstancesListResponse {
  @scala.inline
  def apply(): InstancesListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstancesListResponse]
  }
  @scala.inline
  implicit class InstancesListResponseOps[Self <: InstancesListResponse] (val x: Self) extends AnyVal {
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
    def setItemsVarargs(value: DatabaseInstance*): Self = this.set("items", js.Array(value :_*))
    @scala.inline
    def setItems(value: js.Array[DatabaseInstance]): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
  }
  
}

