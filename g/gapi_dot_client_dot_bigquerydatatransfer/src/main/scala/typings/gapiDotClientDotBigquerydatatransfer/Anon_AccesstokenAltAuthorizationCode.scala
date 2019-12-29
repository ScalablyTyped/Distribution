package typings.gapiDotClientDotBigquerydatatransfer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_AccesstokenAltAuthorizationCode extends js.Object {
  /** V1 error format. */
  @JSName("$.xgafv")
  var $Dotxgafv: js.UndefOr[String] = js.native
  /** OAuth access token. */
  var access_token: js.UndefOr[String] = js.native
  /** Data format for response. */
  var alt: js.UndefOr[String] = js.native
  /**
    * Optional OAuth2 authorization code to use with this transfer configuration.
    * This is required if new credentials are needed, as indicated by
    * `CheckValidCreds`.
    * In order to obtain authorization_code, please make a
    * request to
    * https://www.gstatic.com/bigquerydatatransfer/oauthz/auth?client_id=<datatransferapiclientid>&scope=<data_source_scopes>&redirect_uri=<redirect_uri>
    *
    * &#42; client_id should be OAuth client_id of BigQuery DTS API for the given
    * data source returned by ListDataSources method.
    * &#42; data_source_scopes are the scopes returned by ListDataSources method.
    * &#42; redirect_uri is an optional parameter. If not specified, then
    * authorization code is posted to the opener of authorization flow window.
    * Otherwise it will be sent to the redirect uri. A special value of
    * urn:ietf:wg:oauth:2.0:oob means that authorization code should be
    * returned in the title bar of the browser, with the page text prompting
    * the user to copy the code and paste it in the application.
    */
  var authorizationCode: js.UndefOr[String] = js.native
  /** OAuth bearer token. */
  var bearer_token: js.UndefOr[String] = js.native
  /** JSONP */
  var callback: js.UndefOr[String] = js.native
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[String] = js.native
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[String] = js.native
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[String] = js.native
  /**
    * The BigQuery project id where the transfer configuration should be created.
    * Must be in the format /projects/{project_id}/locations/{location_id}
    * or
    * /projects/{project_id}/locations/-
    * In case when '-' is specified as location_id, location is infered from
    * the destination dataset region.
    */
  var parent: String = js.native
  /** Pretty-print response. */
  var pp: js.UndefOr[Boolean] = js.native
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[Boolean] = js.native
  /** Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters. */
  var quotaUser: js.UndefOr[String] = js.native
  /** Legacy upload protocol for media (e.g. "media", "multipart"). */
  var uploadType: js.UndefOr[String] = js.native
  /** Upload protocol for media (e.g. "raw", "multipart"). */
  var upload_protocol: js.UndefOr[String] = js.native
}

