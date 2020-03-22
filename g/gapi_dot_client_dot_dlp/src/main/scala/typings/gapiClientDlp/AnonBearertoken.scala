package typings.gapiClientDlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonBearertoken extends js.Object {
  /** V1 error format. */
  @JSName("$.xgafv")
  var $Dotxgafv: js.UndefOr[String] = js.native
  /** OAuth access token. */
  var access_token: js.UndefOr[String] = js.native
  /** Data format for response. */
  var alt: js.UndefOr[String] = js.native
  /** OAuth bearer token. */
  var bearer_token: js.UndefOr[String] = js.native
  /** JSONP */
  var callback: js.UndefOr[String] = js.native
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[String] = js.native
  /**
    * Restricts findings to items that match. Supports info_type and likelihood.
    *
    * Examples:
    *
    * - info_type=EMAIL_ADDRESS
    * - info_type=PHONE_NUMBER,EMAIL_ADDRESS
    * - likelihood=VERY_LIKELY
    * - likelihood=VERY_LIKELY,LIKELY
    * - info_type=EMAIL_ADDRESS,likelihood=VERY_LIKELY,LIKELY
    */
  var filter: js.UndefOr[String] = js.native
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[String] = js.native
  /**
    * Identifier of the results set returned as metadata of
    * the longrunning operation created by a call to InspectDataSource.
    * Should be in the format of `inspect/results/{id}`.
    */
  var name: String = js.native
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[String] = js.native
  /**
    * Maximum number of results to return.
    * If 0, the implementation selects a reasonable value.
    */
  var pageSize: js.UndefOr[Double] = js.native
  /**
    * The value returned by the last `ListInspectFindingsResponse`; indicates
    * that this is a continuation of a prior `ListInspectFindings` call, and that
    * the system should return the next page of data.
    */
  var pageToken: js.UndefOr[String] = js.native
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

