package typings.gapiClientYoutube.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DisplaySlate extends js.Object {
  /** Data format for the response. */
  var alt: js.UndefOr[String] = js.native
  /** The displaySlate parameter specifies whether the slate is being enabled or disabled. */
  var displaySlate: js.UndefOr[Boolean] = js.native
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[String] = js.native
  /** The id parameter specifies the YouTube live broadcast ID that uniquely identifies the broadcast in which the slate is being updated. */
  var id: String = js.native
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[String] = js.native
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[String] = js.native
  /**
    * The offsetTimeMs parameter specifies a positive time offset when the specified slate change will occur. The value is measured in milliseconds from the
    * beginning of the broadcast's monitor stream, which is the time that the testing phase for the broadcast began. Even though it is specified in
    * milliseconds, the value is actually an approximation, and YouTube completes the requested action as closely as possible to that time.
    *
    * If you do not specify a value for this parameter, then YouTube performs the action as soon as possible. See the Getting started guide for more details.
    *
    * Important: You should only specify a value for this parameter if your broadcast stream is delayed.
    */
  var offsetTimeMs: js.UndefOr[String] = js.native
  /**
    * Note: This parameter is intended exclusively for YouTube content partners.
    *
    * The onBehalfOfContentOwner parameter indicates that the request's authorization credentials identify a YouTube CMS user who is acting on behalf of the
    * content owner specified in the parameter value. This parameter is intended for YouTube content partners that own and manage many different YouTube
    * channels. It allows content owners to authenticate once and get access to all their video and channel data, without having to provide authentication
    * credentials for each individual channel. The CMS account that the user authenticates with must be linked to the specified YouTube content owner.
    */
  var onBehalfOfContentOwner: js.UndefOr[String] = js.native
  /**
    * This parameter can only be used in a properly authorized request. Note: This parameter is intended exclusively for YouTube content partners.
    *
    * The onBehalfOfContentOwnerChannel parameter specifies the YouTube channel ID of the channel to which a video is being added. This parameter is required
    * when a request specifies a value for the onBehalfOfContentOwner parameter, and it can only be used in conjunction with that parameter. In addition, the
    * request must be authorized using a CMS account that is linked to the content owner that the onBehalfOfContentOwner parameter specifies. Finally, the
    * channel that the onBehalfOfContentOwnerChannel parameter value specifies must be linked to the content owner that the onBehalfOfContentOwner parameter
    * specifies.
    *
    * This parameter is intended for YouTube content partners that own and manage many different YouTube channels. It allows content owners to authenticate
    * once and perform actions on behalf of the channel specified in the parameter value, without having to provide authentication credentials for each
    * separate channel.
    */
  var onBehalfOfContentOwnerChannel: js.UndefOr[String] = js.native
  /**
    * The part parameter specifies a comma-separated list of one or more liveBroadcast resource properties that the API response will include. The part names
    * that you can include in the parameter value are id, snippet, contentDetails, and status.
    */
  var part: String = js.native
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[Boolean] = js.native
  /**
    * Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters.
    * Overrides userIp if both are provided.
    */
  var quotaUser: js.UndefOr[String] = js.native
  /** IP address of the site where the request originates. Use this if you want to enforce per-user limits. */
  var userIp: js.UndefOr[String] = js.native
  /**
    * The walltime parameter specifies the wall clock time at which the specified slate change will occur. The value is specified in ISO 8601
    * (YYYY-MM-DDThh:mm:ss.sssZ) format.
    */
  var walltime: js.UndefOr[String] = js.native
}

object DisplaySlate {
  @scala.inline
  def apply(id: String, part: String): DisplaySlate = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], part = part.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisplaySlate]
  }
  @scala.inline
  implicit class DisplaySlateOps[Self <: DisplaySlate] (val x: Self) extends AnyVal {
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
    def setPart(value: String): Self = this.set("part", value.asInstanceOf[js.Any])
    @scala.inline
    def setAlt(value: String): Self = this.set("alt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlt: Self = this.set("alt", js.undefined)
    @scala.inline
    def setDisplaySlate(value: Boolean): Self = this.set("displaySlate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplaySlate: Self = this.set("displaySlate", js.undefined)
    @scala.inline
    def setFields(value: String): Self = this.set("fields", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFields: Self = this.set("fields", js.undefined)
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    @scala.inline
    def setOauth_token(value: String): Self = this.set("oauth_token", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOauth_token: Self = this.set("oauth_token", js.undefined)
    @scala.inline
    def setOffsetTimeMs(value: String): Self = this.set("offsetTimeMs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOffsetTimeMs: Self = this.set("offsetTimeMs", js.undefined)
    @scala.inline
    def setOnBehalfOfContentOwner(value: String): Self = this.set("onBehalfOfContentOwner", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnBehalfOfContentOwner: Self = this.set("onBehalfOfContentOwner", js.undefined)
    @scala.inline
    def setOnBehalfOfContentOwnerChannel(value: String): Self = this.set("onBehalfOfContentOwnerChannel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnBehalfOfContentOwnerChannel: Self = this.set("onBehalfOfContentOwnerChannel", js.undefined)
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
    @scala.inline
    def setWalltime(value: String): Self = this.set("walltime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWalltime: Self = this.set("walltime", js.undefined)
  }
  
}

