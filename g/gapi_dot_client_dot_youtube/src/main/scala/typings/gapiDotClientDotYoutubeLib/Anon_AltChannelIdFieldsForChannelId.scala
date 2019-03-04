package typings
package gapiDotClientDotYoutubeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AltChannelIdFieldsForChannelId extends js.Object {
  /** Data format for the response. */
  var alt: js.UndefOr[java.lang.String] = js.undefined
  /** The channelId parameter specifies a YouTube channel ID. The API will only return that channel's subscriptions. */
  var channelId: js.UndefOr[java.lang.String] = js.undefined
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The forChannelId parameter specifies a comma-separated list of channel IDs. The API response will then only contain subscriptions matching those
    * channels.
    */
  var forChannelId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The id parameter specifies a comma-separated list of the YouTube subscription ID(s) for the resource(s) that are being retrieved. In a subscription
    * resource, the id property specifies the YouTube subscription ID.
    */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[java.lang.String] = js.undefined
  /** The maxResults parameter specifies the maximum number of items that should be returned in the result set. */
  var maxResults: js.UndefOr[scala.Double] = js.undefined
  /** Set this parameter's value to true to retrieve a feed of the authenticated user's subscriptions. */
  var mine: js.UndefOr[scala.Boolean] = js.undefined
  /** Set this parameter's value to true to retrieve a feed of the subscribers of the authenticated user in reverse chronological order (newest first). */
  var myRecentSubscribers: js.UndefOr[scala.Boolean] = js.undefined
  /** Set this parameter's value to true to retrieve a feed of the subscribers of the authenticated user in no particular order. */
  var mySubscribers: js.UndefOr[scala.Boolean] = js.undefined
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Note: This parameter is intended exclusively for YouTube content partners.
    *
    * The onBehalfOfContentOwner parameter indicates that the request's authorization credentials identify a YouTube CMS user who is acting on behalf of the
    * content owner specified in the parameter value. This parameter is intended for YouTube content partners that own and manage many different YouTube
    * channels. It allows content owners to authenticate once and get access to all their video and channel data, without having to provide authentication
    * credentials for each individual channel. The CMS account that the user authenticates with must be linked to the specified YouTube content owner.
    */
  var onBehalfOfContentOwner: js.UndefOr[java.lang.String] = js.undefined
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
  var onBehalfOfContentOwnerChannel: js.UndefOr[java.lang.String] = js.undefined
  /** The order parameter specifies the method that will be used to sort resources in the API response. */
  var order: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The pageToken parameter identifies a specific page in the result set that should be returned. In an API response, the nextPageToken and prevPageToken
    * properties identify other pages that could be retrieved.
    */
  var pageToken: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The part parameter specifies a comma-separated list of one or more subscription resource properties that the API response will include.
    *
    * If the parameter identifies a property that contains child properties, the child properties will be included in the response. For example, in a
    * subscription resource, the snippet property contains other properties, such as a display title for the subscription. If you set part=snippet, the API
    * response will also contain all of those nested properties.
    */
  var part: java.lang.String
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters.
    * Overrides userIp if both are provided.
    */
  var quotaUser: js.UndefOr[java.lang.String] = js.undefined
  /** IP address of the site where the request originates. Use this if you want to enforce per-user limits. */
  var userIp: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_AltChannelIdFieldsForChannelId {
  @scala.inline
  def apply(
    part: java.lang.String,
    alt: java.lang.String = null,
    channelId: java.lang.String = null,
    fields: java.lang.String = null,
    forChannelId: java.lang.String = null,
    id: java.lang.String = null,
    key: java.lang.String = null,
    maxResults: scala.Int | scala.Double = null,
    mine: js.UndefOr[scala.Boolean] = js.undefined,
    myRecentSubscribers: js.UndefOr[scala.Boolean] = js.undefined,
    mySubscribers: js.UndefOr[scala.Boolean] = js.undefined,
    oauth_token: java.lang.String = null,
    onBehalfOfContentOwner: java.lang.String = null,
    onBehalfOfContentOwnerChannel: java.lang.String = null,
    order: java.lang.String = null,
    pageToken: java.lang.String = null,
    prettyPrint: js.UndefOr[scala.Boolean] = js.undefined,
    quotaUser: java.lang.String = null,
    userIp: java.lang.String = null
  ): Anon_AltChannelIdFieldsForChannelId = {
    val __obj = js.Dynamic.literal(part = part)
    if (alt != null) __obj.updateDynamic("alt")(alt)
    if (channelId != null) __obj.updateDynamic("channelId")(channelId)
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (forChannelId != null) __obj.updateDynamic("forChannelId")(forChannelId)
    if (id != null) __obj.updateDynamic("id")(id)
    if (key != null) __obj.updateDynamic("key")(key)
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    if (!js.isUndefined(mine)) __obj.updateDynamic("mine")(mine)
    if (!js.isUndefined(myRecentSubscribers)) __obj.updateDynamic("myRecentSubscribers")(myRecentSubscribers)
    if (!js.isUndefined(mySubscribers)) __obj.updateDynamic("mySubscribers")(mySubscribers)
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token)
    if (onBehalfOfContentOwner != null) __obj.updateDynamic("onBehalfOfContentOwner")(onBehalfOfContentOwner)
    if (onBehalfOfContentOwnerChannel != null) __obj.updateDynamic("onBehalfOfContentOwnerChannel")(onBehalfOfContentOwnerChannel)
    if (order != null) __obj.updateDynamic("order")(order)
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken)
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint)
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser)
    if (userIp != null) __obj.updateDynamic("userIp")(userIp)
    __obj.asInstanceOf[Anon_AltChannelIdFieldsForChannelId]
  }
}

