package typings.gapiClientYoutube.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DisplaySlate extends js.Object {
  /** Data format for the response. */
  var alt: js.UndefOr[String] = js.undefined
  /** The displaySlate parameter specifies whether the slate is being enabled or disabled. */
  var displaySlate: js.UndefOr[Boolean] = js.undefined
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[String] = js.undefined
  /** The id parameter specifies the YouTube live broadcast ID that uniquely identifies the broadcast in which the slate is being updated. */
  var id: String
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[String] = js.undefined
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[String] = js.undefined
  /**
    * The offsetTimeMs parameter specifies a positive time offset when the specified slate change will occur. The value is measured in milliseconds from the
    * beginning of the broadcast's monitor stream, which is the time that the testing phase for the broadcast began. Even though it is specified in
    * milliseconds, the value is actually an approximation, and YouTube completes the requested action as closely as possible to that time.
    *
    * If you do not specify a value for this parameter, then YouTube performs the action as soon as possible. See the Getting started guide for more details.
    *
    * Important: You should only specify a value for this parameter if your broadcast stream is delayed.
    */
  var offsetTimeMs: js.UndefOr[String] = js.undefined
  /**
    * Note: This parameter is intended exclusively for YouTube content partners.
    *
    * The onBehalfOfContentOwner parameter indicates that the request's authorization credentials identify a YouTube CMS user who is acting on behalf of the
    * content owner specified in the parameter value. This parameter is intended for YouTube content partners that own and manage many different YouTube
    * channels. It allows content owners to authenticate once and get access to all their video and channel data, without having to provide authentication
    * credentials for each individual channel. The CMS account that the user authenticates with must be linked to the specified YouTube content owner.
    */
  var onBehalfOfContentOwner: js.UndefOr[String] = js.undefined
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
  var onBehalfOfContentOwnerChannel: js.UndefOr[String] = js.undefined
  /**
    * The part parameter specifies a comma-separated list of one or more liveBroadcast resource properties that the API response will include. The part names
    * that you can include in the parameter value are id, snippet, contentDetails, and status.
    */
  var part: String
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[Boolean] = js.undefined
  /**
    * Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters.
    * Overrides userIp if both are provided.
    */
  var quotaUser: js.UndefOr[String] = js.undefined
  /** IP address of the site where the request originates. Use this if you want to enforce per-user limits. */
  var userIp: js.UndefOr[String] = js.undefined
  /**
    * The walltime parameter specifies the wall clock time at which the specified slate change will occur. The value is specified in ISO 8601
    * (YYYY-MM-DDThh:mm:ss.sssZ) format.
    */
  var walltime: js.UndefOr[String] = js.undefined
}

object DisplaySlate {
  @scala.inline
  def apply(
    id: String,
    part: String,
    alt: String = null,
    displaySlate: js.UndefOr[Boolean] = js.undefined,
    fields: String = null,
    key: String = null,
    oauth_token: String = null,
    offsetTimeMs: String = null,
    onBehalfOfContentOwner: String = null,
    onBehalfOfContentOwnerChannel: String = null,
    prettyPrint: js.UndefOr[Boolean] = js.undefined,
    quotaUser: String = null,
    userIp: String = null,
    walltime: String = null
  ): DisplaySlate = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], part = part.asInstanceOf[js.Any])
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    if (!js.isUndefined(displaySlate)) __obj.updateDynamic("displaySlate")(displaySlate.get.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token.asInstanceOf[js.Any])
    if (offsetTimeMs != null) __obj.updateDynamic("offsetTimeMs")(offsetTimeMs.asInstanceOf[js.Any])
    if (onBehalfOfContentOwner != null) __obj.updateDynamic("onBehalfOfContentOwner")(onBehalfOfContentOwner.asInstanceOf[js.Any])
    if (onBehalfOfContentOwnerChannel != null) __obj.updateDynamic("onBehalfOfContentOwnerChannel")(onBehalfOfContentOwnerChannel.asInstanceOf[js.Any])
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint.get.asInstanceOf[js.Any])
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser.asInstanceOf[js.Any])
    if (userIp != null) __obj.updateDynamic("userIp")(userIp.asInstanceOf[js.Any])
    if (walltime != null) __obj.updateDynamic("walltime")(walltime.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisplaySlate]
  }
}

