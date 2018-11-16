package typings
package gapiDotClientDotYoutubeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Anon_PrettyPrintOnBehalfOfContentOwnerChannel extends js.Object {
  /** Data format for the response. */
  var alt: js.UndefOr[java.lang.String] = js.undefined
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[java.lang.String] = js.undefined
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[java.lang.String] = js.undefined
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
                   * The part parameter serves two purposes in this operation. It identifies the properties that the write operation will set as well as the properties that
                   * the API response will include.
                   *
                   * The part properties that you can include in the parameter value are id, snippet, contentDetails, and status.
                   *
                   * Note that this method will override the existing values for all of the mutable properties that are contained in any parts that the parameter value
                   * specifies. For example, a broadcast's privacy status is defined in the status part. As such, if your request is updating a private or unlisted
                   * broadcast, and the request's part parameter value includes the status part, the broadcast's privacy setting will be updated to whatever value the
                   * request body specifies. If the request body does not specify a value, the existing privacy setting will be removed and the broadcast will revert to the
                   * default privacy setting.
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

