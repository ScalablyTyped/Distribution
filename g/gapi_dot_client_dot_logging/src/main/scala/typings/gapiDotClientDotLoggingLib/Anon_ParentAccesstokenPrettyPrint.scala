package typings
package gapiDotClientDotLoggingLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Anon_ParentAccesstokenPrettyPrint extends js.Object {
  /** V1 error format. */
  @JSName("$.xgafv")
  var `$.xgafv`: js.UndefOr[java.lang.String] = js.undefined
  /** OAuth access token. */
  var access_token: js.UndefOr[java.lang.String] = js.undefined
  /** Data format for response. */
  var alt: js.UndefOr[java.lang.String] = js.undefined
  /** OAuth bearer token. */
  var bearer_token: js.UndefOr[java.lang.String] = js.undefined
  /** JSONP */
  var callback: js.UndefOr[java.lang.String] = js.undefined
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[java.lang.String] = js.undefined
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[java.lang.String] = js.undefined
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[java.lang.String] = js.undefined
  /**
                   * Required. The resource in which to create the sink:
                   * "projects/[PROJECT_ID]"
                   * "organizations/[ORGANIZATION_ID]"
                   * "billingAccounts/[BILLING_ACCOUNT_ID]"
                   * "folders/[FOLDER_ID]"
                   * Examples: "projects/my-logging-project", "organizations/123456789".
                   */
  var parent: java.lang.String
  /** Pretty-print response. */
  var pp: js.UndefOr[scala.Boolean] = js.undefined
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[scala.Boolean] = js.undefined
  /** Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters. */
  var quotaUser: js.UndefOr[java.lang.String] = js.undefined
  /**
                   * Optional. Determines the kind of IAM identity returned as writer_identity in the new sink. If this value is omitted or set to false, and if the sink's
                   * parent is a project, then the value returned as writer_identity is the same group or service account used by Stackdriver Logging before the addition of
                   * writer identities to this API. The sink's destination must be in the same project as the sink itself.If this field is set to true, or if the sink is
                   * owned by a non-project resource such as an organization, then the value of writer_identity will be a unique service account used only for exports from
                   * the new sink. For more information, see writer_identity in LogSink.
                   */
  var uniqueWriterIdentity: js.UndefOr[scala.Boolean] = js.undefined
  /** Legacy upload protocol for media (e.g. "media", "multipart"). */
  var uploadType: js.UndefOr[java.lang.String] = js.undefined
  /** Upload protocol for media (e.g. "raw", "multipart"). */
  var upload_protocol: js.UndefOr[java.lang.String] = js.undefined
}

