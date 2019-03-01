package typings
package gapiDotClientDotYoutubeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AltCategoryId extends js.Object {
  /** Data format for the response. */
  var alt: js.UndefOr[java.lang.String] = js.undefined
  /** The categoryId parameter specifies a YouTube guide category, thereby requesting YouTube channels associated with that category. */
  var categoryId: js.UndefOr[java.lang.String] = js.undefined
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[java.lang.String] = js.undefined
  /** The forUsername parameter specifies a YouTube username, thereby requesting the channel associated with that username. */
  var forUsername: js.UndefOr[java.lang.String] = js.undefined
  /** The hl parameter should be used for filter out the properties that are not in the given language. Used for the brandingSettings part. */
  var hl: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The id parameter specifies a comma-separated list of the YouTube channel ID(s) for the resource(s) that are being retrieved. In a channel resource, the
    * id property specifies the channel's YouTube channel ID.
    */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Note: This parameter is intended exclusively for YouTube content partners.
    *
    * Set this parameter's value to true to instruct the API to only return channels managed by the content owner that the onBehalfOfContentOwner parameter
    * specifies. The user must be authenticated as a CMS account linked to the specified content owner and onBehalfOfContentOwner must be provided.
    */
  var managedByMe: js.UndefOr[scala.Boolean] = js.undefined
  /** The maxResults parameter specifies the maximum number of items that should be returned in the result set. */
  var maxResults: js.UndefOr[scala.Double] = js.undefined
  /** Set this parameter's value to true to instruct the API to only return channels owned by the authenticated user. */
  var mine: js.UndefOr[scala.Boolean] = js.undefined
  /** Use the subscriptions.list method and its mySubscribers parameter to retrieve a list of subscribers to the authenticated user's channel. */
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
    * The pageToken parameter identifies a specific page in the result set that should be returned. In an API response, the nextPageToken and prevPageToken
    * properties identify other pages that could be retrieved.
    */
  var pageToken: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The part parameter specifies a comma-separated list of one or more channel resource properties that the API response will include.
    *
    * If the parameter identifies a property that contains child properties, the child properties will be included in the response. For example, in a channel
    * resource, the contentDetails property contains other properties, such as the uploads properties. As such, if you set part=contentDetails, the API
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

object Anon_AltCategoryId {
  @scala.inline
  def apply(
    part: java.lang.String,
    alt: java.lang.String = null,
    categoryId: java.lang.String = null,
    fields: java.lang.String = null,
    forUsername: java.lang.String = null,
    hl: java.lang.String = null,
    id: java.lang.String = null,
    key: java.lang.String = null,
    managedByMe: js.UndefOr[scala.Boolean] = js.undefined,
    maxResults: scala.Int | scala.Double = null,
    mine: js.UndefOr[scala.Boolean] = js.undefined,
    mySubscribers: js.UndefOr[scala.Boolean] = js.undefined,
    oauth_token: java.lang.String = null,
    onBehalfOfContentOwner: java.lang.String = null,
    pageToken: java.lang.String = null,
    prettyPrint: js.UndefOr[scala.Boolean] = js.undefined,
    quotaUser: java.lang.String = null,
    userIp: java.lang.String = null
  ): Anon_AltCategoryId = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("part")(part)
    if (alt != null) __obj.updateDynamic("alt")(alt)
    if (categoryId != null) __obj.updateDynamic("categoryId")(categoryId)
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (forUsername != null) __obj.updateDynamic("forUsername")(forUsername)
    if (hl != null) __obj.updateDynamic("hl")(hl)
    if (id != null) __obj.updateDynamic("id")(id)
    if (key != null) __obj.updateDynamic("key")(key)
    if (!js.isUndefined(managedByMe)) __obj.updateDynamic("managedByMe")(managedByMe)
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    if (!js.isUndefined(mine)) __obj.updateDynamic("mine")(mine)
    if (!js.isUndefined(mySubscribers)) __obj.updateDynamic("mySubscribers")(mySubscribers)
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token)
    if (onBehalfOfContentOwner != null) __obj.updateDynamic("onBehalfOfContentOwner")(onBehalfOfContentOwner)
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken)
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint)
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser)
    if (userIp != null) __obj.updateDynamic("userIp")(userIp)
    __obj.asInstanceOf[Anon_AltCategoryId]
  }
}

