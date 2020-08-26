package typings.gapiClientGames.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MaxCompletedMatches extends js.Object {
  /** Data format for the response. */
  var alt: js.UndefOr[String] = js.native
  /** The last-seen mutation timestamp. */
  var consistencyToken: js.UndefOr[String] = js.native
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[String] = js.native
  /**
    * True if match data should be returned in the response. Note that not all data will necessarily be returned if include_match_data is true; the server
    * may decide to only return data for some of the matches to limit download size for the client. The remainder of the data for these matches will be
    * retrievable on request.
    */
  var includeMatchData: js.UndefOr[Boolean] = js.native
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[String] = js.native
  /** The preferred language to use for strings returned by this method. */
  var language: js.UndefOr[String] = js.native
  /** The maximum number of completed or canceled matches to return in the response. If not set, all matches returned could be completed or canceled. */
  var maxCompletedMatches: js.UndefOr[Double] = js.native
  /**
    * The maximum number of matches to return in the response, used for paging. For any response, the actual number of matches to return may be less than the
    * specified maxResults.
    */
  var maxResults: js.UndefOr[Double] = js.native
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[String] = js.native
  /** The token returned by the previous request. */
  var pageToken: js.UndefOr[String] = js.native
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[Boolean] = js.native
  /**
    * Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters.
    * Overrides userIp if both are provided.
    */
  var quotaUser: js.UndefOr[String] = js.native
  /** IP address of the site where the request originates. Use this if you want to enforce per-user limits. */
  var userIp: js.UndefOr[String] = js.native
}

object MaxCompletedMatches {
  @scala.inline
  def apply(): MaxCompletedMatches = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaxCompletedMatches]
  }
  @scala.inline
  implicit class MaxCompletedMatchesOps[Self <: MaxCompletedMatches] (val x: Self) extends AnyVal {
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
    def setAlt(value: String): Self = this.set("alt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlt: Self = this.set("alt", js.undefined)
    @scala.inline
    def setConsistencyToken(value: String): Self = this.set("consistencyToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConsistencyToken: Self = this.set("consistencyToken", js.undefined)
    @scala.inline
    def setFields(value: String): Self = this.set("fields", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFields: Self = this.set("fields", js.undefined)
    @scala.inline
    def setIncludeMatchData(value: Boolean): Self = this.set("includeMatchData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncludeMatchData: Self = this.set("includeMatchData", js.undefined)
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    @scala.inline
    def setLanguage(value: String): Self = this.set("language", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLanguage: Self = this.set("language", js.undefined)
    @scala.inline
    def setMaxCompletedMatches(value: Double): Self = this.set("maxCompletedMatches", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxCompletedMatches: Self = this.set("maxCompletedMatches", js.undefined)
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
    def setUserIp(value: String): Self = this.set("userIp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserIp: Self = this.set("userIp", js.undefined)
  }
  
}

