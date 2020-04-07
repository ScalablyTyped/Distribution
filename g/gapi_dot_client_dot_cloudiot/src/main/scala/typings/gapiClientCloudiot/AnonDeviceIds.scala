package typings.gapiClientCloudiot

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDeviceIds extends js.Object {
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
  /**
    * A list of device string identifiers. If empty, it will ignore this field.
    * For example, `['device0', 'device12']`. This field cannot hold more than
    * 10,000 entries.
    */
  var deviceIds: js.UndefOr[String] = js.undefined
  /**
    * A list of device numerical ids. If empty, it will ignore this field. This
    * field cannot hold more than 10,000 entries.
    */
  var deviceNumIds: js.UndefOr[String] = js.undefined
  /**
    * The fields of the `Device` resource to be returned in the response. The
    * fields `id`, and `num_id` are always returned by default, along with any
    * other fields specified.
    */
  var fieldMask: js.UndefOr[String] = js.undefined
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[String] = js.undefined
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[String] = js.undefined
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[String] = js.undefined
  /**
    * The maximum number of devices to return in the response. If this value
    * is zero, the service will select a default size. A call may return fewer
    * objects than requested, but if there is a non-empty `page_token`, it
    * indicates that more entries are available.
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  /**
    * The value returned by the last `ListDevicesResponse`; indicates
    * that this is a continuation of a prior `ListDevices` call, and
    * that the system should return the next page of data.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  /**
    * The device registry path. Required. For example,
    * `projects/my-project/locations/us-central1/registries/my-registry`.
    */
  var parent: String
  /** Pretty-print response. */
  var pp: js.UndefOr[Boolean] = js.undefined
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[Boolean] = js.undefined
  /** Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters. */
  var quotaUser: js.UndefOr[String] = js.undefined
  /** Legacy upload protocol for media (e.g. "media", "multipart"). */
  var uploadType: js.UndefOr[String] = js.undefined
  /** Upload protocol for media (e.g. "raw", "multipart"). */
  var upload_protocol: js.UndefOr[String] = js.undefined
}

object AnonDeviceIds {
  @scala.inline
  def apply(
    parent: String,
    $Dotxgafv: String = null,
    access_token: String = null,
    alt: String = null,
    bearer_token: String = null,
    callback: String = null,
    deviceIds: String = null,
    deviceNumIds: String = null,
    fieldMask: String = null,
    fields: String = null,
    key: String = null,
    oauth_token: String = null,
    pageSize: Int | Double = null,
    pageToken: String = null,
    pp: js.UndefOr[Boolean] = js.undefined,
    prettyPrint: js.UndefOr[Boolean] = js.undefined,
    quotaUser: String = null,
    uploadType: String = null,
    upload_protocol: String = null
  ): AnonDeviceIds = {
    val __obj = js.Dynamic.literal(parent = parent.asInstanceOf[js.Any])
    if ($Dotxgafv != null) __obj.updateDynamic("$.xgafv")($Dotxgafv.asInstanceOf[js.Any])
    if (access_token != null) __obj.updateDynamic("access_token")(access_token.asInstanceOf[js.Any])
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    if (bearer_token != null) __obj.updateDynamic("bearer_token")(bearer_token.asInstanceOf[js.Any])
    if (callback != null) __obj.updateDynamic("callback")(callback.asInstanceOf[js.Any])
    if (deviceIds != null) __obj.updateDynamic("deviceIds")(deviceIds.asInstanceOf[js.Any])
    if (deviceNumIds != null) __obj.updateDynamic("deviceNumIds")(deviceNumIds.asInstanceOf[js.Any])
    if (fieldMask != null) __obj.updateDynamic("fieldMask")(fieldMask.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token.asInstanceOf[js.Any])
    if (pageSize != null) __obj.updateDynamic("pageSize")(pageSize.asInstanceOf[js.Any])
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken.asInstanceOf[js.Any])
    if (!js.isUndefined(pp)) __obj.updateDynamic("pp")(pp.asInstanceOf[js.Any])
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint.asInstanceOf[js.Any])
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser.asInstanceOf[js.Any])
    if (uploadType != null) __obj.updateDynamic("uploadType")(uploadType.asInstanceOf[js.Any])
    if (upload_protocol != null) __obj.updateDynamic("upload_protocol")(upload_protocol.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDeviceIds]
  }
}

