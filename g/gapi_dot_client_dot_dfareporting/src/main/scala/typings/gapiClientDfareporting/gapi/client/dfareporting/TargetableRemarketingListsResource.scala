package typings.gapiClientDfareporting.gapi.client.dfareporting

import typings.gapiClient.gapi.client.Request
import typings.gapiClientDfareporting.anon.ActiveAdvertiserId
import typings.gapiClientDfareporting.anon.Fields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TargetableRemarketingListsResource extends js.Object {
  /** Gets one remarketing list by ID. */
  def get(request: Fields): Request[TargetableRemarketingList] = js.native
  /** Retrieves a list of targetable remarketing lists, possibly filtered. This method supports paging. */
  def list(request: ActiveAdvertiserId): Request[TargetableRemarketingListsListResponse] = js.native
}

object TargetableRemarketingListsResource {
  @scala.inline
  def apply(
    get: Fields => Request[TargetableRemarketingList],
    list: ActiveAdvertiserId => Request[TargetableRemarketingListsListResponse]
  ): TargetableRemarketingListsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[TargetableRemarketingListsResource]
  }
  @scala.inline
  implicit class TargetableRemarketingListsResourceOps[Self <: TargetableRemarketingListsResource] (val x: Self) extends AnyVal {
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
    def setGet(value: Fields => Request[TargetableRemarketingList]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: ActiveAdvertiserId => Request[TargetableRemarketingListsListResponse]): Self = this.set("list", js.Any.fromFunction1(value))
  }
  
}

