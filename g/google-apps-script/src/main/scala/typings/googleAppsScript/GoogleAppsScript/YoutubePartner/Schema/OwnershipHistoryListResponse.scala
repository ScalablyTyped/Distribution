package typings.googleAppsScript.GoogleAppsScript.YoutubePartner.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OwnershipHistoryListResponse extends js.Object {
  var items: js.UndefOr[js.Array[RightsOwnershipHistory]] = js.native
  var kind: js.UndefOr[String] = js.native
}

object OwnershipHistoryListResponse {
  @scala.inline
  def apply(): OwnershipHistoryListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OwnershipHistoryListResponse]
  }
  @scala.inline
  implicit class OwnershipHistoryListResponseOps[Self <: OwnershipHistoryListResponse] (val x: Self) extends AnyVal {
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
    def setItemsVarargs(value: RightsOwnershipHistory*): Self = this.set("items", js.Array(value :_*))
    @scala.inline
    def setItems(value: js.Array[RightsOwnershipHistory]): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
  }
  
}

