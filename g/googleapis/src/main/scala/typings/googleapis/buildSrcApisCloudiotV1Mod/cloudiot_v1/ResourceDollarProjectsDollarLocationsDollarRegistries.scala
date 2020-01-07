package typings.googleapis.buildSrcApisCloudiotV1Mod.cloudiot_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/cloudiot/v1", "cloudiot_v1.Resource$Projects$Locations$Registries")
@js.native
class ResourceDollarProjectsDollarLocationsDollarRegistries protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  var devices: ResourceDollarProjectsDollarLocationsDollarRegistriesDollarDevices = js.native
  var groups: ResourceDollarProjectsDollarLocationsDollarRegistriesDollarGroups = js.native
  /**
    * cloudiot.projects.locations.registries.bindDeviceToGateway
    * @desc Associates the device with the gateway.
    * @alias cloudiot.projects.locations.registries.bindDeviceToGateway
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.parent The name of the registry. For example, `projects/example-project/locations/us-central1/registries/my-registry`.
    * @param {().BindDeviceToGatewayRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def bindDeviceToGateway(): GaxiosPromise[Schema$BindDeviceToGatewayResponse] = js.native
  def bindDeviceToGateway(callback: BodyResponseCallback[Schema$BindDeviceToGatewayResponse]): Unit = js.native
  def bindDeviceToGateway(params: ParamsDollarResourceDollarProjectsDollarLocationsDollarRegistriesDollarBinddevicetogateway): GaxiosPromise[Schema$BindDeviceToGatewayResponse] = js.native
  def bindDeviceToGateway(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarRegistriesDollarBinddevicetogateway,
    callback: BodyResponseCallback[Schema$BindDeviceToGatewayResponse]
  ): Unit = js.native
  def bindDeviceToGateway(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarRegistriesDollarBinddevicetogateway,
    options: BodyResponseCallback[Schema$BindDeviceToGatewayResponse],
    callback: BodyResponseCallback[Schema$BindDeviceToGatewayResponse]
  ): Unit = js.native
  def bindDeviceToGateway(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarRegistriesDollarBinddevicetogateway,
    options: MethodOptions
  ): GaxiosPromise[Schema$BindDeviceToGatewayResponse] = js.native
  def bindDeviceToGateway(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarRegistriesDollarBinddevicetogateway,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$BindDeviceToGatewayResponse]
  ): Unit = js.native
  /**
    * cloudiot.projects.locations.registries.create
    * @desc Creates a device registry that contains devices.
    * @alias cloudiot.projects.locations.registries.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.parent The project and cloud region where this device registry must be created. For example, `projects/example-project/locations/us-central1`.
    * @param {().DeviceRegistry} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[Schema$DeviceRegistry] = js.native
  def create(callback: BodyResponseCallback[Schema$DeviceRegistry]): Unit = js.native
  def create(params: ParamsDollarResourceDollarProjectsDollarLocationsDollarRegistriesDollarCreate): GaxiosPromise[Schema$DeviceRegistry] = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarRegistriesDollarCreate,
    callback: BodyResponseCallback[Schema$DeviceRegistry]
  ): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarRegistriesDollarCreate,
    options: BodyResponseCallback[Schema$DeviceRegistry],
    callback: BodyResponseCallback[Schema$DeviceRegistry]
  ): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarRegistriesDollarCreate,
    options: MethodOptions
  ): GaxiosPromise[Schema$DeviceRegistry] = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarRegistriesDollarCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$DeviceRegistry]
  ): Unit = js.native
  /**
    * cloudiot.projects.locations.registries.delete
    * @desc Deletes a device registry configuration.
    * @alias cloudiot.projects.locations.registries.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The name of the device registry. For example, `projects/example-project/locations/us-central1/registries/my-registry`.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Schema$Empty] = js.native
  def delete(callback: BodyResponseCallback[Schema$Empty]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarProjectsDollarLocationsDollarRegistriesDollarDelete): GaxiosPromise[Schema$Empty] = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarRegistriesDollarDelete,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarRegistriesDollarDelete,
    options: BodyResponseCallback[Schema$Empty],
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarRegistriesDollarDelete,
    options: MethodOptions
  ): GaxiosPromise[Schema$Empty] = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarRegistriesDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  /**
    * cloudiot.projects.locations.registries.get
    * @desc Gets a device registry configuration.
    * @alias cloudiot.projects.locations.registries.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The name of the device registry. For example, `projects/example-project/locations/us-central1/registries/my-registry`.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$DeviceRegistry] = js.native
  def get(callback: BodyResponseCallback[Schema$DeviceRegistry]): Unit = js.native
  def get(params: ParamsDollarResourceDollarProjectsDollarLocationsDollarRegistriesDollarGet): GaxiosPromise[Schema$DeviceRegistry] = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarRegistriesDollarGet,
    callback: BodyResponseCallback[Schema$DeviceRegistry]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarRegistriesDollarGet,
    options: BodyResponseCallback[Schema$DeviceRegistry],
    callback: BodyResponseCallback[Schema$DeviceRegistry]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarRegistriesDollarGet,
    options: MethodOptions
  ): GaxiosPromise[Schema$DeviceRegistry] = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarRegistriesDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$DeviceRegistry]
  ): Unit = js.native
  /**
    * cloudiot.projects.locations.registries.getIamPolicy
    * @desc Gets the access control policy for a resource. Returns an empty
    * policy if the resource exists and does not have a policy set.
    * @alias cloudiot.projects.locations.registries.getIamPolicy
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.resource_ REQUIRED: The resource for which the policy is being requested. See the operation documentation for the appropriate value for this field.
    * @param {().GetIamPolicyRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def getIamPolicy(): GaxiosPromise[Schema$Policy] = js.native
  def getIamPolicy(callback: BodyResponseCallback[Schema$Policy]): Unit = js.native
  def getIamPolicy(params: ParamsDollarResourceDollarProjectsDollarLocationsDollarRegistriesDollarGetiampolicy): GaxiosPromise[Schema$Policy] = js.native
  def getIamPolicy(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarRegistriesDollarGetiampolicy,
    callback: BodyResponseCallback[Schema$Policy]
  ): Unit = js.native
  def getIamPolicy(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarRegistriesDollarGetiampolicy,
    options: BodyResponseCallback[Schema$Policy],
    callback: BodyResponseCallback[Schema$Policy]
  ): Unit = js.native
  def getIamPolicy(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarRegistriesDollarGetiampolicy,
    options: MethodOptions
  ): GaxiosPromise[Schema$Policy] = js.native
  def getIamPolicy(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarRegistriesDollarGetiampolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Policy]
  ): Unit = js.native
  /**
    * cloudiot.projects.locations.registries.list
    * @desc Lists device registries.
    * @alias cloudiot.projects.locations.registries.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer=} params.pageSize The maximum number of registries to return in the response. If this value is zero, the service will select a default size. A call may return fewer objects than requested. A non-empty `next_page_token` in the response indicates that more data is available.
    * @param {string=} params.pageToken The value returned by the last `ListDeviceRegistriesResponse`; indicates that this is a continuation of a prior `ListDeviceRegistries` call and the system should return the next page of data.
    * @param {string} params.parent The project and cloud region path. For example, `projects/example-project/locations/us-central1`.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$ListDeviceRegistriesResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$ListDeviceRegistriesResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarProjectsDollarLocationsDollarRegistriesDollarList): GaxiosPromise[Schema$ListDeviceRegistriesResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarRegistriesDollarList,
    callback: BodyResponseCallback[Schema$ListDeviceRegistriesResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarRegistriesDollarList,
    options: BodyResponseCallback[Schema$ListDeviceRegistriesResponse],
    callback: BodyResponseCallback[Schema$ListDeviceRegistriesResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarRegistriesDollarList,
    options: MethodOptions
  ): GaxiosPromise[Schema$ListDeviceRegistriesResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarRegistriesDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ListDeviceRegistriesResponse]
  ): Unit = js.native
  /**
    * cloudiot.projects.locations.registries.patch
    * @desc Updates a device registry configuration.
    * @alias cloudiot.projects.locations.registries.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The resource path name. For example, `projects/example-project/locations/us-central1/registries/my-registry`.
    * @param {string=} params.updateMask Only updates the `device_registry` fields indicated by this mask. The field mask must not be empty, and it must not contain fields that are immutable or only set by the server. Mutable top-level fields: `event_notification_config`, `http_config`, `mqtt_config`, and `state_notification_config`.
    * @param {().DeviceRegistry} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[Schema$DeviceRegistry] = js.native
  def patch(callback: BodyResponseCallback[Schema$DeviceRegistry]): Unit = js.native
  def patch(params: ParamsDollarResourceDollarProjectsDollarLocationsDollarRegistriesDollarPatch): GaxiosPromise[Schema$DeviceRegistry] = js.native
  def patch(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarRegistriesDollarPatch,
    callback: BodyResponseCallback[Schema$DeviceRegistry]
  ): Unit = js.native
  def patch(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarRegistriesDollarPatch,
    options: BodyResponseCallback[Schema$DeviceRegistry],
    callback: BodyResponseCallback[Schema$DeviceRegistry]
  ): Unit = js.native
  def patch(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarRegistriesDollarPatch,
    options: MethodOptions
  ): GaxiosPromise[Schema$DeviceRegistry] = js.native
  def patch(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarRegistriesDollarPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$DeviceRegistry]
  ): Unit = js.native
  /**
    * cloudiot.projects.locations.registries.setIamPolicy
    * @desc Sets the access control policy on the specified resource. Replaces
    * any existing policy.
    * @alias cloudiot.projects.locations.registries.setIamPolicy
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.resource_ REQUIRED: The resource for which the policy is being specified. See the operation documentation for the appropriate value for this field.
    * @param {().SetIamPolicyRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def setIamPolicy(): GaxiosPromise[Schema$Policy] = js.native
  def setIamPolicy(callback: BodyResponseCallback[Schema$Policy]): Unit = js.native
  def setIamPolicy(params: ParamsDollarResourceDollarProjectsDollarLocationsDollarRegistriesDollarSetiampolicy): GaxiosPromise[Schema$Policy] = js.native
  def setIamPolicy(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarRegistriesDollarSetiampolicy,
    callback: BodyResponseCallback[Schema$Policy]
  ): Unit = js.native
  def setIamPolicy(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarRegistriesDollarSetiampolicy,
    options: BodyResponseCallback[Schema$Policy],
    callback: BodyResponseCallback[Schema$Policy]
  ): Unit = js.native
  def setIamPolicy(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarRegistriesDollarSetiampolicy,
    options: MethodOptions
  ): GaxiosPromise[Schema$Policy] = js.native
  def setIamPolicy(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarRegistriesDollarSetiampolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Policy]
  ): Unit = js.native
  /**
    * cloudiot.projects.locations.registries.testIamPermissions
    * @desc Returns permissions that a caller has on the specified resource. If
    * the resource does not exist, this will return an empty set of
    * permissions, not a NOT_FOUND error.
    * @alias cloudiot.projects.locations.registries.testIamPermissions
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.resource_ REQUIRED: The resource for which the policy detail is being requested. See the operation documentation for the appropriate value for this field.
    * @param {().TestIamPermissionsRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def testIamPermissions(): GaxiosPromise[Schema$TestIamPermissionsResponse] = js.native
  def testIamPermissions(callback: BodyResponseCallback[Schema$TestIamPermissionsResponse]): Unit = js.native
  def testIamPermissions(params: ParamsDollarResourceDollarProjectsDollarLocationsDollarRegistriesDollarTestiampermissions): GaxiosPromise[Schema$TestIamPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarRegistriesDollarTestiampermissions,
    callback: BodyResponseCallback[Schema$TestIamPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarRegistriesDollarTestiampermissions,
    options: BodyResponseCallback[Schema$TestIamPermissionsResponse],
    callback: BodyResponseCallback[Schema$TestIamPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarRegistriesDollarTestiampermissions,
    options: MethodOptions
  ): GaxiosPromise[Schema$TestIamPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarRegistriesDollarTestiampermissions,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$TestIamPermissionsResponse]
  ): Unit = js.native
  /**
    * cloudiot.projects.locations.registries.unbindDeviceFromGateway
    * @desc Deletes the association between the device and the gateway.
    * @alias cloudiot.projects.locations.registries.unbindDeviceFromGateway
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.parent The name of the registry. For example, `projects/example-project/locations/us-central1/registries/my-registry`.
    * @param {().UnbindDeviceFromGatewayRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def unbindDeviceFromGateway(): GaxiosPromise[Schema$UnbindDeviceFromGatewayResponse] = js.native
  def unbindDeviceFromGateway(callback: BodyResponseCallback[Schema$UnbindDeviceFromGatewayResponse]): Unit = js.native
  def unbindDeviceFromGateway(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarRegistriesDollarUnbinddevicefromgateway
  ): GaxiosPromise[Schema$UnbindDeviceFromGatewayResponse] = js.native
  def unbindDeviceFromGateway(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarRegistriesDollarUnbinddevicefromgateway,
    callback: BodyResponseCallback[Schema$UnbindDeviceFromGatewayResponse]
  ): Unit = js.native
  def unbindDeviceFromGateway(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarRegistriesDollarUnbinddevicefromgateway,
    options: BodyResponseCallback[Schema$UnbindDeviceFromGatewayResponse],
    callback: BodyResponseCallback[Schema$UnbindDeviceFromGatewayResponse]
  ): Unit = js.native
  def unbindDeviceFromGateway(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarRegistriesDollarUnbinddevicefromgateway,
    options: MethodOptions
  ): GaxiosPromise[Schema$UnbindDeviceFromGatewayResponse] = js.native
  def unbindDeviceFromGateway(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarRegistriesDollarUnbinddevicefromgateway,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$UnbindDeviceFromGatewayResponse]
  ): Unit = js.native
}

