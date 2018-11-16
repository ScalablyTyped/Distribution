package typings
package gapiDotClientDotYoutubeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Anon_HlMine extends js.Object {
  /** Data format for the response. */
  var alt: js.UndefOr[java.lang.String] = js.undefined
  /** The channelId parameter specifies a YouTube channel ID. The API will only return that channel's channelSections. */
  var channelId: js.UndefOr[java.lang.String] = js.undefined
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[java.lang.String] = js.undefined
  /**
                   * The hl parameter indicates that the snippet.localized property values in the returned channelSection resources should be in the specified language if
                   * localized values for that language are available. For example, if the API request specifies hl=de, the snippet.localized properties in the API response
                   * will contain German titles if German titles are available. Channel owners can provide localized channel section titles using either the
                   * channelSections.insert or channelSections.update method.
                   */
  var hl: js.UndefOr[java.lang.String] = js.undefined
  /**
                   * The id parameter specifies a comma-separated list of the YouTube channelSection ID(s) for the resource(s) that are being retrieved. In a channelSection
                   * resource, the id property specifies the YouTube channelSection ID.
                   */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[java.lang.String] = js.undefined
  /** Set this parameter's value to true to retrieve a feed of the authenticated user's channelSections. */
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
                   * The part parameter specifies a comma-separated list of one or more channelSection resource properties that the API response will include. The part
                   * names that you can include in the parameter value are id, snippet, and contentDetails.
                   *
                   * If the parameter identifies a property that contains child properties, the child properties will be included in the response. For example, in a
                   * channelSection resource, the snippet property contains other properties, such as a display title for the channelSection. If you set part=snippet, the
                   * API response will also contain all of those nested properties.
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

