package typings.gapiDotClientDotLogging

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_AccesstokenAltBearertokenCallbackFieldsKeyOauthtokenPp extends js.Object {
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
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[String] = js.native
  /** Pretty-print response. */
  var pp: js.UndefOr[Boolean] = js.native
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[Boolean] = js.native
  /** Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters. */
  var quotaUser: js.UndefOr[String] = js.native
  /**
    * Required. The full resource name of the sink to update, including the parent resource and the sink identifier:
    * "projects/[PROJECT_ID]/sinks/[SINK_ID]"
    * "organizations/[ORGANIZATION_ID]/sinks/[SINK_ID]"
    * "billingAccounts/[BILLING_ACCOUNT_ID]/sinks/[SINK_ID]"
    * "folders/[FOLDER_ID]/sinks/[SINK_ID]"
    * Example: "projects/my-project-id/sinks/my-sink-id".
    */
  var sinkName: String = js.native
  /**
    * Optional. See sinks.create for a description of this field. When updating a sink, the effect of this field on the value of writer_identity in the
    * updated sink depends on both the old and new values of this field:
    * If the old and new values of this field are both false or both true, then there is no change to the sink's writer_identity.
    * If the old value is false and the new value is true, then writer_identity is changed to a unique service account.
    * It is an error if the old value is true and the new value is set to false or defaulted to false.
    */
  var uniqueWriterIdentity: js.UndefOr[Boolean] = js.native
  /**
    * Optional. Field mask that specifies the fields in sink that need an update. A sink field will be overwritten if, and only if, it is in the update mask.
    * name and output only fields cannot be updated.An empty updateMask is temporarily treated as using the following mask for backwards compatibility
    * purposes:  destination,filter,includeChildren At some point in the future, behavior will be removed and specifying an empty updateMask will be an
    * error.For a detailed FieldMask definition, see https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmaskExample:
    * updateMask=filter.
    */
  var updateMask: js.UndefOr[String] = js.native
  /** Legacy upload protocol for media (e.g. "media", "multipart"). */
  var uploadType: js.UndefOr[String] = js.native
  /** Upload protocol for media (e.g. "raw", "multipart"). */
  var upload_protocol: js.UndefOr[String] = js.native
}

