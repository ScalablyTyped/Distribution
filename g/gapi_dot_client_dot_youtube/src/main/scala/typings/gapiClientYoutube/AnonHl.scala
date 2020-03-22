package typings.gapiClientYoutube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHl extends js.Object {
  /** Data format for the response. */
  var alt: js.UndefOr[String] = js.undefined
  /** The channelId parameter specifies a YouTube channel ID. The API will only return that channel's channelSections. */
  var channelId: js.UndefOr[String] = js.undefined
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[String] = js.undefined
  /**
    * The hl parameter indicates that the snippet.localized property values in the returned channelSection resources should be in the specified language if
    * localized values for that language are available. For example, if the API request specifies hl=de, the snippet.localized properties in the API response
    * will contain German titles if German titles are available. Channel owners can provide localized channel section titles using either the
    * channelSections.insert or channelSections.update method.
    */
  var hl: js.UndefOr[String] = js.undefined
  /**
    * The id parameter specifies a comma-separated list of the YouTube channelSection ID(s) for the resource(s) that are being retrieved. In a channelSection
    * resource, the id property specifies the YouTube channelSection ID.
    */
  var id: js.UndefOr[String] = js.undefined
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[String] = js.undefined
  /** Set this parameter's value to true to retrieve a feed of the authenticated user's channelSections. */
  var mine: js.UndefOr[Boolean] = js.undefined
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[String] = js.undefined
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
    * The part parameter specifies a comma-separated list of one or more channelSection resource properties that the API response will include. The part
    * names that you can include in the parameter value are id, snippet, and contentDetails.
    *
    * If the parameter identifies a property that contains child properties, the child properties will be included in the response. For example, in a
    * channelSection resource, the snippet property contains other properties, such as a display title for the channelSection. If you set part=snippet, the
    * API response will also contain all of those nested properties.
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
}

object AnonHl {
  @scala.inline
  def apply(
    part: String,
    alt: String = null,
    channelId: String = null,
    fields: String = null,
    hl: String = null,
    id: String = null,
    key: String = null,
    mine: js.UndefOr[Boolean] = js.undefined,
    oauth_token: String = null,
    onBehalfOfContentOwner: String = null,
    prettyPrint: js.UndefOr[Boolean] = js.undefined,
    quotaUser: String = null,
    userIp: String = null
  ): AnonHl = {
    val __obj = js.Dynamic.literal(part = part.asInstanceOf[js.Any])
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    if (channelId != null) __obj.updateDynamic("channelId")(channelId.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (hl != null) __obj.updateDynamic("hl")(hl.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (!js.isUndefined(mine)) __obj.updateDynamic("mine")(mine.asInstanceOf[js.Any])
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token.asInstanceOf[js.Any])
    if (onBehalfOfContentOwner != null) __obj.updateDynamic("onBehalfOfContentOwner")(onBehalfOfContentOwner.asInstanceOf[js.Any])
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint.asInstanceOf[js.Any])
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser.asInstanceOf[js.Any])
    if (userIp != null) __obj.updateDynamic("userIp")(userIp.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonHl]
  }
}

