package typings.gapiClientPlaymoviespartner

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAccesstokenAccountIdAltBearertokenCallbackCountries extends js.Object {
  /** V1 error format. */
  @JSName("$.xgafv")
  var $Dotxgafv: js.UndefOr[String] = js.native
  /** OAuth access token. */
  var access_token: js.UndefOr[String] = js.native
  /** REQUIRED. See _General rules_ for more information about this field. */
  var accountId: String = js.native
  /** Data format for response. */
  var alt: js.UndefOr[String] = js.native
  /** OAuth bearer token. */
  var bearer_token: js.UndefOr[String] = js.native
  /** JSONP */
  var callback: js.UndefOr[String] = js.native
  /**
    * Filter StoreInfos that match (case-insensitive) any of the given country
    * codes, using the "ISO 3166-1 alpha-2" format (examples: "US", "us", "Us").
    */
  var countries: js.UndefOr[String] = js.native
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[String] = js.native
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[String] = js.native
  /** Filter StoreInfos that match any of the given `mid`s. */
  var mids: js.UndefOr[String] = js.native
  /**
    * Filter that matches StoreInfos with a `name` or `show_name`
    * that contains the given case-insensitive name.
    */
  var name: js.UndefOr[String] = js.native
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[String] = js.native
  /** See _List methods rules_ for info about this field. */
  var pageSize: js.UndefOr[Double] = js.native
  /** See _List methods rules_ for info about this field. */
  var pageToken: js.UndefOr[String] = js.native
  /** Pretty-print response. */
  var pp: js.UndefOr[Boolean] = js.native
  /** See _List methods rules_ for info about this field. */
  var pphNames: js.UndefOr[String] = js.native
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[Boolean] = js.native
  /** Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters. */
  var quotaUser: js.UndefOr[String] = js.native
  /** Filter StoreInfos that match any of the given `season_id`s. */
  var seasonIds: js.UndefOr[String] = js.native
  /** See _List methods rules_ for info about this field. */
  var studioNames: js.UndefOr[String] = js.native
  /** Legacy upload protocol for media (e.g. "media", "multipart"). */
  var uploadType: js.UndefOr[String] = js.native
  /** Upload protocol for media (e.g. "raw", "multipart"). */
  var upload_protocol: js.UndefOr[String] = js.native
  /**
    * Filter StoreInfos that match a given `video_id`.
    * NOTE: this field is deprecated and will be removed on V2; `video_ids`
    * should be used instead.
    */
  var videoId: js.UndefOr[String] = js.native
  /** Filter StoreInfos that match any of the given `video_id`s. */
  var videoIds: js.UndefOr[String] = js.native
}

