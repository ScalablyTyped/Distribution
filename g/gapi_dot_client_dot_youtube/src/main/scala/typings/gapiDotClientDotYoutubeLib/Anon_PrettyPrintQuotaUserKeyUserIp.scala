package typings
package gapiDotClientDotYoutubeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Anon_PrettyPrintQuotaUserKeyUserIp extends js.Object {
  /** Data format for the response. */
  var alt: js.UndefOr[java.lang.String] = js.undefined
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[java.lang.String] = js.undefined
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[java.lang.String] = js.undefined
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[java.lang.String] = js.undefined
  /**
                   * The onBehalfOfContentOwner parameter indicates that the authenticated user is acting on behalf of the content owner specified in the parameter value.
                   * This parameter is intended for YouTube content partners that own and manage many different YouTube channels. It allows content owners to authenticate
                   * once and get access to all their video and channel data, without having to provide authentication credentials for each individual channel. The actual
                   * CMS account that the user authenticates with needs to be linked to the specified YouTube content owner.
                   */
  var onBehalfOfContentOwner: js.UndefOr[java.lang.String] = js.undefined
  /**
                   * The part parameter serves two purposes in this operation. It identifies the properties that the write operation will set as well as the properties that
                   * the API response will include.
                   *
                   * The API currently only allows the parameter value to be set to either brandingSettings or invideoPromotion. (You cannot update both of those parts with
                   * a single request.)
                   *
                   * Note that this method overrides the existing values for all of the mutable properties that are contained in any parts that the parameter value
                   * specifies.
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

