package typings.gapiClientLogging

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPp extends js.Object {
  /** V1 error format. */
  @JSName("$.xgafv")
  var $Dotxgafv: js.UndefOr[String] = js.undefined
  /** OAuth access token. */
  var access_token: js.UndefOr[String] = js.undefined
  /** Data format for response. */
  var alt: js.UndefOr[String] = js.undefined
  /** OAuth bearer token. */
  var bearer_token: js.UndefOr[String] = js.undefined
  /** JSONP */
  var callback: js.UndefOr[String] = js.undefined
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[String] = js.undefined
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[String] = js.undefined
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[String] = js.undefined
  /** Pretty-print response. */
  var pp: js.UndefOr[Boolean] = js.undefined
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[Boolean] = js.undefined
  /** Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters. */
  var quotaUser: js.UndefOr[String] = js.undefined
  /**
    * Required. The full resource name of the sink to update, including the parent resource and the sink identifier:
    * "projects/[PROJECT_ID]/sinks/[SINK_ID]"
    * "organizations/[ORGANIZATION_ID]/sinks/[SINK_ID]"
    * "billingAccounts/[BILLING_ACCOUNT_ID]/sinks/[SINK_ID]"
    * "folders/[FOLDER_ID]/sinks/[SINK_ID]"
    * Example: "projects/my-project-id/sinks/my-sink-id".
    */
  var sinkName: String
  /**
    * Optional. See sinks.create for a description of this field. When updating a sink, the effect of this field on the value of writer_identity in the
    * updated sink depends on both the old and new values of this field:
    * If the old and new values of this field are both false or both true, then there is no change to the sink's writer_identity.
    * If the old value is false and the new value is true, then writer_identity is changed to a unique service account.
    * It is an error if the old value is true and the new value is set to false or defaulted to false.
    */
  var uniqueWriterIdentity: js.UndefOr[Boolean] = js.undefined
  /**
    * Optional. Field mask that specifies the fields in sink that need an update. A sink field will be overwritten if, and only if, it is in the update mask.
    * name and output only fields cannot be updated.An empty updateMask is temporarily treated as using the following mask for backwards compatibility
    * purposes:  destination,filter,includeChildren At some point in the future, behavior will be removed and specifying an empty updateMask will be an
    * error.For a detailed FieldMask definition, see https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmaskExample:
    * updateMask=filter.
    */
  var updateMask: js.UndefOr[String] = js.undefined
  /** Legacy upload protocol for media (e.g. "media", "multipart"). */
  var uploadType: js.UndefOr[String] = js.undefined
  /** Upload protocol for media (e.g. "raw", "multipart"). */
  var upload_protocol: js.UndefOr[String] = js.undefined
}

object AnonPp {
  @scala.inline
  def apply(
    sinkName: String,
    $Dotxgafv: String = null,
    access_token: String = null,
    alt: String = null,
    bearer_token: String = null,
    callback: String = null,
    fields: String = null,
    key: String = null,
    oauth_token: String = null,
    pp: js.UndefOr[Boolean] = js.undefined,
    prettyPrint: js.UndefOr[Boolean] = js.undefined,
    quotaUser: String = null,
    uniqueWriterIdentity: js.UndefOr[Boolean] = js.undefined,
    updateMask: String = null,
    uploadType: String = null,
    upload_protocol: String = null
  ): AnonPp = {
    val __obj = js.Dynamic.literal(sinkName = sinkName.asInstanceOf[js.Any])
    if ($Dotxgafv != null) __obj.updateDynamic("$.xgafv")($Dotxgafv.asInstanceOf[js.Any])
    if (access_token != null) __obj.updateDynamic("access_token")(access_token.asInstanceOf[js.Any])
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    if (bearer_token != null) __obj.updateDynamic("bearer_token")(bearer_token.asInstanceOf[js.Any])
    if (callback != null) __obj.updateDynamic("callback")(callback.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token.asInstanceOf[js.Any])
    if (!js.isUndefined(pp)) __obj.updateDynamic("pp")(pp.asInstanceOf[js.Any])
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint.asInstanceOf[js.Any])
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser.asInstanceOf[js.Any])
    if (!js.isUndefined(uniqueWriterIdentity)) __obj.updateDynamic("uniqueWriterIdentity")(uniqueWriterIdentity.asInstanceOf[js.Any])
    if (updateMask != null) __obj.updateDynamic("updateMask")(updateMask.asInstanceOf[js.Any])
    if (uploadType != null) __obj.updateDynamic("uploadType")(uploadType.asInstanceOf[js.Any])
    if (upload_protocol != null) __obj.updateDynamic("upload_protocol")(upload_protocol.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPp]
  }
}

