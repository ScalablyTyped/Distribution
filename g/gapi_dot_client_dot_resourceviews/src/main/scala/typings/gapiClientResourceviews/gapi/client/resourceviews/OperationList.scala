package typings.gapiClientResourceviews.gapi.client.resourceviews

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OperationList extends js.Object {
  /** Unique identifier for the resource; defined by the server (output only). */
  var id: js.UndefOr[String] = js.native
  /** The operation resources. */
  var items: js.UndefOr[js.Array[Operation]] = js.native
  /** Type of resource. */
  var kind: js.UndefOr[String] = js.native
  /** A token used to continue a truncated list request (output only). */
  var nextPageToken: js.UndefOr[String] = js.native
  /** Server defined URL for this resource (output only). */
  var selfLink: js.UndefOr[String] = js.native
}

object OperationList {
  @scala.inline
  def apply(): OperationList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OperationList]
  }
  @scala.inline
  implicit class OperationListOps[Self <: OperationList] (val x: Self) extends AnyVal {
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setItemsVarargs(value: Operation*): Self = this.set("items", js.Array(value :_*))
    @scala.inline
    def setItems(value: js.Array[Operation]): Self = this.set("items", value.asInstanceOf[js.Any])
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
    @scala.inline
    def setSelfLink(value: String): Self = this.set("selfLink", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelfLink: Self = this.set("selfLink", js.undefined)
  }
  
}

