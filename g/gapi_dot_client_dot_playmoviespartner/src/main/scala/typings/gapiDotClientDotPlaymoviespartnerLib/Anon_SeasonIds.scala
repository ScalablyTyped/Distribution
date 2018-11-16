package typings
package gapiDotClientDotPlaymoviespartnerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Anon_SeasonIds extends js.Object {
  /** V1 error format. */
  @JSName("$.xgafv")
  var `$.xgafv`: js.UndefOr[java.lang.String] = js.undefined
  /** OAuth access token. */
  var access_token: js.UndefOr[java.lang.String] = js.undefined
  /** REQUIRED. See _General rules_ for more information about this field. */
  var accountId: java.lang.String
  /** Data format for response. */
  var alt: js.UndefOr[java.lang.String] = js.undefined
  /** OAuth bearer token. */
  var bearer_token: js.UndefOr[java.lang.String] = js.undefined
  /** JSONP */
  var callback: js.UndefOr[java.lang.String] = js.undefined
  /**
                   * Filter StoreInfos that match (case-insensitive) any of the given country
                   * codes, using the "ISO 3166-1 alpha-2" format (examples: "US", "us", "Us").
                   */
  var countries: js.UndefOr[java.lang.String] = js.undefined
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[java.lang.String] = js.undefined
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[java.lang.String] = js.undefined
  /** Filter StoreInfos that match any of the given `mid`s. */
  var mids: js.UndefOr[java.lang.String] = js.undefined
  /**
                   * Filter that matches StoreInfos with a `name` or `show_name`
                   * that contains the given case-insensitive name.
                   */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[java.lang.String] = js.undefined
  /** See _List methods rules_ for info about this field. */
  var pageSize: js.UndefOr[scala.Double] = js.undefined
  /** See _List methods rules_ for info about this field. */
  var pageToken: js.UndefOr[java.lang.String] = js.undefined
  /** Pretty-print response. */
  var pp: js.UndefOr[scala.Boolean] = js.undefined
  /** See _List methods rules_ for info about this field. */
  var pphNames: js.UndefOr[java.lang.String] = js.undefined
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[scala.Boolean] = js.undefined
  /** Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters. */
  var quotaUser: js.UndefOr[java.lang.String] = js.undefined
  /** Filter StoreInfos that match any of the given `season_id`s. */
  var seasonIds: js.UndefOr[java.lang.String] = js.undefined
  /** See _List methods rules_ for info about this field. */
  var studioNames: js.UndefOr[java.lang.String] = js.undefined
  /** Legacy upload protocol for media (e.g. "media", "multipart"). */
  var uploadType: js.UndefOr[java.lang.String] = js.undefined
  /** Upload protocol for media (e.g. "raw", "multipart"). */
  var upload_protocol: js.UndefOr[java.lang.String] = js.undefined
  /**
                   * Filter StoreInfos that match a given `video_id`.
                   * NOTE: this field is deprecated and will be removed on V2; `video_ids`
                   * should be used instead.
                   */
  var videoId: js.UndefOr[java.lang.String] = js.undefined
  /** Filter StoreInfos that match any of the given `video_id`s. */
  var videoIds: js.UndefOr[java.lang.String] = js.undefined
}

