package typings.gapiClientYoutube.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LiveChatId extends js.Object {
  /** Data format for the response. */
  var alt: js.UndefOr[String] = js.native
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[String] = js.native
  /**
    * The hl parameter instructs the API to retrieve localized resource metadata for a specific application language that the YouTube website supports. The
    * parameter value must be a language code included in the list returned by the i18nLanguages.list method.
    *
    * If localized resource details are available in that language, the resource's snippet.localized object will contain the localized values. However, if
    * localized details are not available, the snippet.localized object will contain resource details in the resource's default language.
    */
  var hl: js.UndefOr[String] = js.native
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[String] = js.native
  /** The liveChatId parameter specifies the ID of the chat whose messages will be returned. */
  var liveChatId: String = js.native
  /** The maxResults parameter specifies the maximum number of messages that should be returned in the result set. */
  var maxResults: js.UndefOr[Double] = js.native
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[String] = js.native
  /**
    * The pageToken parameter identifies a specific page in the result set that should be returned. In an API response, the nextPageToken property identify
    * other pages that could be retrieved.
    */
  var pageToken: js.UndefOr[String] = js.native
  /** The part parameter specifies the liveChatComment resource parts that the API response will include. Supported values are id and snippet. */
  var part: String = js.native
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[Boolean] = js.native
  /** The profileImageSize parameter specifies the size of the user profile pictures that should be returned in the result set. Default: 88. */
  var profileImageSize: js.UndefOr[Double] = js.native
  /**
    * Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters.
    * Overrides userIp if both are provided.
    */
  var quotaUser: js.UndefOr[String] = js.native
  /** IP address of the site where the request originates. Use this if you want to enforce per-user limits. */
  var userIp: js.UndefOr[String] = js.native
}

object LiveChatId {
  @scala.inline
  def apply(liveChatId: String, part: String): LiveChatId = {
    val __obj = js.Dynamic.literal(liveChatId = liveChatId.asInstanceOf[js.Any], part = part.asInstanceOf[js.Any])
    __obj.asInstanceOf[LiveChatId]
  }
  @scala.inline
  implicit class LiveChatIdOps[Self <: LiveChatId] (val x: Self) extends AnyVal {
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
    def setLiveChatId(value: String): Self = this.set("liveChatId", value.asInstanceOf[js.Any])
    @scala.inline
    def setPart(value: String): Self = this.set("part", value.asInstanceOf[js.Any])
    @scala.inline
    def setAlt(value: String): Self = this.set("alt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlt: Self = this.set("alt", js.undefined)
    @scala.inline
    def setFields(value: String): Self = this.set("fields", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFields: Self = this.set("fields", js.undefined)
    @scala.inline
    def setHl(value: String): Self = this.set("hl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHl: Self = this.set("hl", js.undefined)
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
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
    def setProfileImageSize(value: Double): Self = this.set("profileImageSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProfileImageSize: Self = this.set("profileImageSize", js.undefined)
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

