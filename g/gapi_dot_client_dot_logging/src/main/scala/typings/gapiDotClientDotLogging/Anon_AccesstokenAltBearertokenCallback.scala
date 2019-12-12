package typings.gapiDotClientDotLogging

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_AccesstokenAltBearertokenCallback extends js.Object {
  /** V1 error format. */
  @JSName("$.xgafv")
  var `$.xgafv`: js.UndefOr[String] = js.native
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
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[String] = js.native
  /**
    * Required. The resource name of the exclusion to update:
    * "projects/[PROJECT_ID]/exclusions/[EXCLUSION_ID]"
    * "organizations/[ORGANIZATION_ID]/exclusions/[EXCLUSION_ID]"
    * "billingAccounts/[BILLING_ACCOUNT_ID]/exclusions/[EXCLUSION_ID]"
    * "folders/[FOLDER_ID]/exclusions/[EXCLUSION_ID]"
    * Example: "projects/my-project-id/exclusions/my-exclusion-id".
    */
  var name: String = js.native
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[String] = js.native
  /** Pretty-print response. */
  var pp: js.UndefOr[Boolean] = js.native
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[Boolean] = js.native
  /** Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters. */
  var quotaUser: js.UndefOr[String] = js.native
  /**
    * Required. A nonempty list of fields to change in the existing exclusion. New values for the fields are taken from the corresponding fields in the
    * LogExclusion included in this request. Fields not mentioned in update_mask are not changed and are ignored in the request.For example, to change the
    * filter and description of an exclusion, specify an update_mask of "filter,description".
    */
  var updateMask: js.UndefOr[String] = js.native
  /** Legacy upload protocol for media (e.g. "media", "multipart"). */
  var uploadType: js.UndefOr[String] = js.native
  /** Upload protocol for media (e.g. "raw", "multipart"). */
  var upload_protocol: js.UndefOr[String] = js.native
}

