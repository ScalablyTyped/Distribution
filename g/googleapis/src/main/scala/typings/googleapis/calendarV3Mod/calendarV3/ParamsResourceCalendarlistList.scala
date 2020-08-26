package typings.googleapis.calendarV3Mod.calendarV3

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceCalendarlistList extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Maximum number of entries returned on one result page. By default the
    * value is 100 entries. The page size can never be larger than 250 entries.
    * Optional.
    */
  var maxResults: js.UndefOr[Double] = js.native
  /**
    * The minimum access role for the user in the returned entries. Optional.
    * The default is no restriction.
    */
  var minAccessRole: js.UndefOr[String] = js.native
  /**
    * Token specifying which result page to return. Optional.
    */
  var pageToken: js.UndefOr[String] = js.native
  /**
    * Whether to include deleted calendar list entries in the result. Optional.
    * The default is False.
    */
  var showDeleted: js.UndefOr[Boolean] = js.native
  /**
    * Whether to show hidden entries. Optional. The default is False.
    */
  var showHidden: js.UndefOr[Boolean] = js.native
  /**
    * Token obtained from the nextSyncToken field returned on the last page of
    * results from the previous list request. It makes the result of this list
    * request contain only entries that have changed since then. If only
    * read-only fields such as calendar properties or ACLs have changed, the
    * entry won't be returned. All entries deleted and hidden since the
    * previous list request will always be in the result set and it is not
    * allowed to set showDeleted neither showHidden to False. To ensure client
    * state consistency minAccessRole query parameter cannot be specified
    * together with nextSyncToken. If the syncToken expires, the server will
    * respond with a 410 GONE response code and the client should clear its
    * storage and perform a full synchronization without any syncToken. Learn
    * more about incremental synchronization. Optional. The default is to
    * return all entries.
    */
  var syncToken: js.UndefOr[String] = js.native
}

object ParamsResourceCalendarlistList {
  @scala.inline
  def apply(): ParamsResourceCalendarlistList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceCalendarlistList]
  }
  @scala.inline
  implicit class ParamsResourceCalendarlistListOps[Self <: ParamsResourceCalendarlistList] (val x: Self) extends AnyVal {
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
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = this.set("auth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuth: Self = this.set("auth", js.undefined)
    @scala.inline
    def setMaxResults(value: Double): Self = this.set("maxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("maxResults", js.undefined)
    @scala.inline
    def setMinAccessRole(value: String): Self = this.set("minAccessRole", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinAccessRole: Self = this.set("minAccessRole", js.undefined)
    @scala.inline
    def setPageToken(value: String): Self = this.set("pageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageToken: Self = this.set("pageToken", js.undefined)
    @scala.inline
    def setShowDeleted(value: Boolean): Self = this.set("showDeleted", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowDeleted: Self = this.set("showDeleted", js.undefined)
    @scala.inline
    def setShowHidden(value: Boolean): Self = this.set("showHidden", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowHidden: Self = this.set("showHidden", js.undefined)
    @scala.inline
    def setSyncToken(value: String): Self = this.set("syncToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSyncToken: Self = this.set("syncToken", js.undefined)
  }
  
}

