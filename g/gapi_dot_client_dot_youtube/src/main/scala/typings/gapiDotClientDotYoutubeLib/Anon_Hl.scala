package typings
package gapiDotClientDotYoutubeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Anon_Hl extends js.Object {
  /** Data format for the response. */
  var alt: js.UndefOr[java.lang.String] = js.undefined
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[java.lang.String] = js.undefined
  /**
                   * The hl parameter instructs the API to retrieve localized resource metadata for a specific application language that the YouTube website supports. The
                   * parameter value must be a language code included in the list returned by the i18nLanguages.list method.
                   *
                   * If localized resource details are available in that language, the resource's snippet.localized object will contain the localized values. However, if
                   * localized details are not available, the snippet.localized object will contain resource details in the resource's default language.
                   */
  var hl: js.UndefOr[java.lang.String] = js.undefined
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[java.lang.String] = js.undefined
  /** The liveChatId parameter specifies the ID of the chat whose messages will be returned. */
  var liveChatId: java.lang.String
  /** The maxResults parameter specifies the maximum number of messages that should be returned in the result set. */
  var maxResults: js.UndefOr[scala.Double] = js.undefined
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[java.lang.String] = js.undefined
  /**
                   * The pageToken parameter identifies a specific page in the result set that should be returned. In an API response, the nextPageToken property identify
                   * other pages that could be retrieved.
                   */
  var pageToken: js.UndefOr[java.lang.String] = js.undefined
  /** The part parameter specifies the liveChatComment resource parts that the API response will include. Supported values are id and snippet. */
  var part: java.lang.String
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[scala.Boolean] = js.undefined
  /** The profileImageSize parameter specifies the size of the user profile pictures that should be returned in the result set. Default: 88. */
  var profileImageSize: js.UndefOr[scala.Double] = js.undefined
  /**
                   * Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters.
                   * Overrides userIp if both are provided.
                   */
  var quotaUser: js.UndefOr[java.lang.String] = js.undefined
  /** IP address of the site where the request originates. Use this if you want to enforce per-user limits. */
  var userIp: js.UndefOr[java.lang.String] = js.undefined
}

