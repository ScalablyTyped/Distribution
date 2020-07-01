package typings.googleapis.cloudiotV1Mod.cloudiotV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceProjectsLocationsRegistriesDevicesList extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * A list of device string IDs. For example, `['device0', 'device12']`. If
    * empty, this field is ignored. Maximum IDs: 10,000
    */
  var deviceIds: js.UndefOr[js.Array[String]] = js.native
  /**
    * A list of device numeric IDs. If empty, this field is ignored. Maximum
    * IDs: 10,000.
    */
  var deviceNumIds: js.UndefOr[js.Array[String]] = js.native
  /**
    * The fields of the `Device` resource to be returned in the response. The
    * fields `id` and `num_id` are always returned, along with any other fields
    * specified.
    */
  var fieldMask: js.UndefOr[String] = js.native
  /**
    * If set, returns only the gateways with which the specified device is
    * associated. The device ID can be numeric (`num_id`) or the user-defined
    * string (`id`). For example, if `456` is specified, returns only the
    * gateways to which the device with `num_id` 456 is bound.
    */
  @JSName("gatewayListOptions.associationsDeviceId")
  var gatewayListOptionsDotassociationsDeviceId: js.UndefOr[String] = js.native
  /**
    * If set, only devices associated with the specified gateway are returned.
    * The gateway ID can be numeric (`num_id`) or the user-defined string
    * (`id`). For example, if `123` is specified, only devices bound to the
    * gateway with `num_id` 123 are returned.
    */
  @JSName("gatewayListOptions.associationsGatewayId")
  var gatewayListOptionsDotassociationsGatewayId: js.UndefOr[String] = js.native
  /**
    * If `GATEWAY` is specified, only gateways are returned. If `NON_GATEWAY`
    * is specified, only non-gateway devices are returned. If
    * `GATEWAY_TYPE_UNSPECIFIED` is specified, all devices are returned.
    */
  @JSName("gatewayListOptions.gatewayType")
  var gatewayListOptionsDotgatewayType: js.UndefOr[String] = js.native
  /**
    * The maximum number of devices to return in the response. If this value is
    * zero, the service will select a default size. A call may return fewer
    * objects than requested. A non-empty `next_page_token` in the response
    * indicates that more data is available.
    */
  var pageSize: js.UndefOr[Double] = js.native
  /**
    * The value returned by the last `ListDevicesResponse`; indicates that this
    * is a continuation of a prior `ListDevices` call and the system should
    * return the next page of data.
    */
  var pageToken: js.UndefOr[String] = js.native
  /**
    * The device registry path. Required. For example,
    * `projects/my-project/locations/us-central1/registries/my-registry`.
    */
  var parent: js.UndefOr[String] = js.native
}

object ParamsResourceProjectsLocationsRegistriesDevicesList {
  @scala.inline
  def apply(
    $Dotxgafv: String = null,
    access_token: String = null,
    alt: String = null,
    auth: String | OAuth2Client | JWT | Compute | UserRefreshClient = null,
    callback: String = null,
    deviceIds: js.Array[String] = null,
    deviceNumIds: js.Array[String] = null,
    fieldMask: String = null,
    fields: String = null,
    gatewayListOptionsDotassociationsDeviceId: String = null,
    gatewayListOptionsDotassociationsGatewayId: String = null,
    gatewayListOptionsDotgatewayType: String = null,
    key: String = null,
    oauth_token: String = null,
    pageSize: js.UndefOr[Double] = js.undefined,
    pageToken: String = null,
    parent: String = null,
    prettyPrint: js.UndefOr[Boolean] = js.undefined,
    quotaUser: String = null,
    uploadType: String = null,
    upload_protocol: String = null
  ): ParamsResourceProjectsLocationsRegistriesDevicesList = {
    val __obj = js.Dynamic.literal()
    if ($Dotxgafv != null) __obj.updateDynamic("$.xgafv")($Dotxgafv.asInstanceOf[js.Any])
    if (access_token != null) __obj.updateDynamic("access_token")(access_token.asInstanceOf[js.Any])
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    if (auth != null) __obj.updateDynamic("auth")(auth.asInstanceOf[js.Any])
    if (callback != null) __obj.updateDynamic("callback")(callback.asInstanceOf[js.Any])
    if (deviceIds != null) __obj.updateDynamic("deviceIds")(deviceIds.asInstanceOf[js.Any])
    if (deviceNumIds != null) __obj.updateDynamic("deviceNumIds")(deviceNumIds.asInstanceOf[js.Any])
    if (fieldMask != null) __obj.updateDynamic("fieldMask")(fieldMask.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (gatewayListOptionsDotassociationsDeviceId != null) __obj.updateDynamic("gatewayListOptions.associationsDeviceId")(gatewayListOptionsDotassociationsDeviceId.asInstanceOf[js.Any])
    if (gatewayListOptionsDotassociationsGatewayId != null) __obj.updateDynamic("gatewayListOptions.associationsGatewayId")(gatewayListOptionsDotassociationsGatewayId.asInstanceOf[js.Any])
    if (gatewayListOptionsDotgatewayType != null) __obj.updateDynamic("gatewayListOptions.gatewayType")(gatewayListOptionsDotgatewayType.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token.asInstanceOf[js.Any])
    if (!js.isUndefined(pageSize)) __obj.updateDynamic("pageSize")(pageSize.get.asInstanceOf[js.Any])
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken.asInstanceOf[js.Any])
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint.get.asInstanceOf[js.Any])
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser.asInstanceOf[js.Any])
    if (uploadType != null) __obj.updateDynamic("uploadType")(uploadType.asInstanceOf[js.Any])
    if (upload_protocol != null) __obj.updateDynamic("upload_protocol")(upload_protocol.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsResourceProjectsLocationsRegistriesDevicesList]
  }
}

