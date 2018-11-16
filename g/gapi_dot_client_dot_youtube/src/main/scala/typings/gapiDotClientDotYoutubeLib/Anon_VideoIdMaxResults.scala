package typings
package gapiDotClientDotYoutubeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Anon_VideoIdMaxResults extends js.Object {
  /** Data format for the response. */
  var alt: js.UndefOr[java.lang.String] = js.undefined
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[java.lang.String] = js.undefined
  /** The id parameter specifies a comma-separated list of one or more unique playlist item IDs. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[java.lang.String] = js.undefined
  /** The maxResults parameter specifies the maximum number of items that should be returned in the result set. */
  var maxResults: js.UndefOr[scala.Double] = js.undefined
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
                   * The part parameter specifies a comma-separated list of one or more playlistItem resource properties that the API response will include.
                   *
                   * If the parameter identifies a property that contains child properties, the child properties will be included in the response. For example, in a
                   * playlistItem resource, the snippet property contains numerous fields, including the title, description, position, and resourceId properties. As such,
                   * if you set part=snippet, the API response will contain all of those properties.
                   */
  var part: java.lang.String
  /**
                   * The playlistId parameter specifies the unique ID of the playlist for which you want to retrieve playlist items. Note that even though this is an
                   * optional parameter, every request to retrieve playlist items must specify a value for either the id parameter or the playlistId parameter.
                   */
  var playlistId: js.UndefOr[java.lang.String] = js.undefined
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[scala.Boolean] = js.undefined
  /**
                   * Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters.
                   * Overrides userIp if both are provided.
                   */
  var quotaUser: js.UndefOr[java.lang.String] = js.undefined
  /** IP address of the site where the request originates. Use this if you want to enforce per-user limits. */
  var userIp: js.UndefOr[java.lang.String] = js.undefined
  /** The videoId parameter specifies that the request should return only the playlist items that contain the specified video. */
  var videoId: js.UndefOr[java.lang.String] = js.undefined
}

