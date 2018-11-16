package typings
package gapiDotClientDotYoutubeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Anon_MineMaxResultsPrettyPrint extends js.Object {
  /** Data format for the response. */
  var alt: js.UndefOr[java.lang.String] = js.undefined
  /** The broadcastStatus parameter filters the API response to only include broadcasts with the specified status. */
  var broadcastStatus: js.UndefOr[java.lang.String] = js.undefined
  /**
                   * The broadcastType parameter filters the API response to only include broadcasts with the specified type. This is only compatible with the mine filter
                   * for now.
                   */
  var broadcastType: js.UndefOr[java.lang.String] = js.undefined
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[java.lang.String] = js.undefined
  /**
                   * The id parameter specifies a comma-separated list of YouTube broadcast IDs that identify the broadcasts being retrieved. In a liveBroadcast resource,
                   * the id property specifies the broadcast's ID.
                   */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[java.lang.String] = js.undefined
  /** The maxResults parameter specifies the maximum number of items that should be returned in the result set. */
  var maxResults: js.UndefOr[scala.Double] = js.undefined
  /**
                   * The mine parameter can be used to instruct the API to only return broadcasts owned by the authenticated user. Set the parameter value to true to only
                   * retrieve your own broadcasts.
                   */
  var mine: js.UndefOr[scala.Boolean] = js.undefined
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
  /**
                   * The pageToken parameter identifies a specific page in the result set that should be returned. In an API response, the nextPageToken and prevPageToken
                   * properties identify other pages that could be retrieved.
                   */
  var pageToken: js.UndefOr[java.lang.String] = js.undefined
  /**
                   * The part parameter specifies a comma-separated list of one or more liveBroadcast resource properties that the API response will include. The part names
                   * that you can include in the parameter value are id, snippet, contentDetails, and status.
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

