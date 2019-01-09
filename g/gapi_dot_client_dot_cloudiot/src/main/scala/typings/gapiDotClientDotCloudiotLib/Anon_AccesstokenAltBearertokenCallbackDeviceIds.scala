package typings
package gapiDotClientDotCloudiotLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AccesstokenAltBearertokenCallbackDeviceIds extends js.Object {
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
  /**
    * A list of device string identifiers. If empty, it will ignore this field.
    * For example, `['device0', 'device12']`. This field cannot hold more than
    * 10,000 entries.
    */
  var deviceIds: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A list of device numerical ids. If empty, it will ignore this field. This
    * field cannot hold more than 10,000 entries.
    */
  var deviceNumIds: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The fields of the `Device` resource to be returned in the response. The
    * fields `id`, and `num_id` are always returned by default, along with any
    * other fields specified.
    */
  var fieldMask: js.UndefOr[java.lang.String] = js.undefined
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[java.lang.String] = js.undefined
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[java.lang.String] = js.undefined
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The maximum number of devices to return in the response. If this value
    * is zero, the service will select a default size. A call may return fewer
    * objects than requested, but if there is a non-empty `page_token`, it
    * indicates that more entries are available.
    */
  var pageSize: js.UndefOr[scala.Double] = js.undefined
  /**
    * The value returned by the last `ListDevicesResponse`; indicates
    * that this is a continuation of a prior `ListDevices` call, and
    * that the system should return the next page of data.
    */
  var pageToken: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The device registry path. Required. For example,
    * `projects/my-project/locations/us-central1/registries/my-registry`.
    */
  var parent: java.lang.String
  /** Pretty-print response. */
  var pp: js.UndefOr[scala.Boolean] = js.undefined
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[scala.Boolean] = js.undefined
  /** Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters. */
  var quotaUser: js.UndefOr[java.lang.String] = js.undefined
  /** Legacy upload protocol for media (e.g. "media", "multipart"). */
  var uploadType: js.UndefOr[java.lang.String] = js.undefined
  /** Upload protocol for media (e.g. "raw", "multipart"). */
  var upload_protocol: js.UndefOr[java.lang.String] = js.undefined
}

