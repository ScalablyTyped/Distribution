package typings.gapiClientGmail.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HistoryTypes extends js.Object {
  /** Data format for the response. */
  var alt: js.UndefOr[String] = js.native
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[String] = js.native
  /** History types to be returned by the function */
  var historyTypes: js.UndefOr[String] = js.native
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[String] = js.native
  /** Only return messages with a label matching the ID. */
  var labelId: js.UndefOr[String] = js.native
  /** The maximum number of history records to return. */
  var maxResults: js.UndefOr[Double] = js.native
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[String] = js.native
  /** Page token to retrieve a specific page of results in the list. */
  var pageToken: js.UndefOr[String] = js.native
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[Boolean] = js.native
  /**
    * Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters.
    * Overrides userIp if both are provided.
    */
  var quotaUser: js.UndefOr[String] = js.native
  /**
    * Required. Returns history records after the specified startHistoryId. The supplied startHistoryId should be obtained from the historyId of a message,
    * thread, or previous list response. History IDs increase chronologically but are not contiguous with random gaps in between valid IDs. Supplying an
    * invalid or out of date startHistoryId typically returns an HTTP 404 error code. A historyId is typically valid for at least a week, but in some rare
    * circumstances may be valid for only a few hours. If you receive an HTTP 404 error response, your application should perform a full sync. If you receive
    * no nextPageToken in the response, there are no updates to retrieve and you can store the returned historyId for a future request.
    */
  var startHistoryId: js.UndefOr[String] = js.native
  /** The user's email address. The special value me can be used to indicate the authenticated user. */
  var userId: String = js.native
  /** IP address of the site where the request originates. Use this if you want to enforce per-user limits. */
  var userIp: js.UndefOr[String] = js.native
}

object HistoryTypes {
  @scala.inline
  def apply(userId: String): HistoryTypes = {
    val __obj = js.Dynamic.literal(userId = userId.asInstanceOf[js.Any])
    __obj.asInstanceOf[HistoryTypes]
  }
  @scala.inline
  implicit class HistoryTypesOps[Self <: HistoryTypes] (val x: Self) extends AnyVal {
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
    def setUserId(value: String): Self = this.set("userId", value.asInstanceOf[js.Any])
    @scala.inline
    def setAlt(value: String): Self = this.set("alt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlt: Self = this.set("alt", js.undefined)
    @scala.inline
    def setFields(value: String): Self = this.set("fields", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFields: Self = this.set("fields", js.undefined)
    @scala.inline
    def setHistoryTypes(value: String): Self = this.set("historyTypes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHistoryTypes: Self = this.set("historyTypes", js.undefined)
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    @scala.inline
    def setLabelId(value: String): Self = this.set("labelId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelId: Self = this.set("labelId", js.undefined)
    @scala.inline
    def setMaxResults(value: Double): Self = this.set("maxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("maxResults", js.undefined)
    @scala.inline
    def setOauth_token(value: String): Self = this.set("oauth_token", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOauth_token: Self = this.set("oauth_token", js.undefined)
    @scala.inline
    def setPageToken(value: String): Self = this.set("pageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageToken: Self = this.set("pageToken", js.undefined)
    @scala.inline
    def setPrettyPrint(value: Boolean): Self = this.set("prettyPrint", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrettyPrint: Self = this.set("prettyPrint", js.undefined)
    @scala.inline
    def setQuotaUser(value: String): Self = this.set("quotaUser", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuotaUser: Self = this.set("quotaUser", js.undefined)
    @scala.inline
    def setStartHistoryId(value: String): Self = this.set("startHistoryId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartHistoryId: Self = this.set("startHistoryId", js.undefined)
    @scala.inline
    def setUserIp(value: String): Self = this.set("userIp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserIp: Self = this.set("userIp", js.undefined)
  }
  
}

