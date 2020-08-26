package typings.googleapis.cloudiotV1Mod.cloudiotV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/cloudiot/v1", "cloudiot_v1.Resource$Projects$Locations$Registries")
@js.native
class ResourceProjectsLocationsRegistries protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  var devices: ResourceProjectsLocationsRegistriesDevices = js.native
  var groups: ResourceProjectsLocationsRegistriesGroups = js.native
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
  def bindDeviceToGateway(): GaxiosPromise[SchemaBindDeviceToGatewayResponse] = js.native
  def bindDeviceToGateway(callback: BodyResponseCallback[SchemaBindDeviceToGatewayResponse]): Unit = js.native
  def bindDeviceToGateway(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaBindDeviceToGatewayResponse] = js.native
  def bindDeviceToGateway(params: ParamsResourceProjectsLocationsRegistriesBinddevicetogateway): GaxiosPromise[SchemaBindDeviceToGatewayResponse] = js.native
  def bindDeviceToGateway(
    params: ParamsResourceProjectsLocationsRegistriesBinddevicetogateway,
    callback: BodyResponseCallback[SchemaBindDeviceToGatewayResponse]
  ): Unit = js.native
  def bindDeviceToGateway(
    params: ParamsResourceProjectsLocationsRegistriesBinddevicetogateway,
    options: BodyResponseCallback[SchemaBindDeviceToGatewayResponse],
    callback: BodyResponseCallback[SchemaBindDeviceToGatewayResponse]
  ): Unit = js.native
  def bindDeviceToGateway(params: ParamsResourceProjectsLocationsRegistriesBinddevicetogateway, options: MethodOptions): GaxiosPromise[SchemaBindDeviceToGatewayResponse] = js.native
  def bindDeviceToGateway(
    params: ParamsResourceProjectsLocationsRegistriesBinddevicetogateway,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaBindDeviceToGatewayResponse]
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
  def create(): GaxiosPromise[SchemaDeviceRegistry] = js.native
  def create(callback: BodyResponseCallback[SchemaDeviceRegistry]): Unit = js.native
  def create(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaDeviceRegistry] = js.native
  def create(params: ParamsResourceProjectsLocationsRegistriesCreate): GaxiosPromise[SchemaDeviceRegistry] = js.native
  def create(
    params: ParamsResourceProjectsLocationsRegistriesCreate,
    callback: BodyResponseCallback[SchemaDeviceRegistry]
  ): Unit = js.native
  def create(
    params: ParamsResourceProjectsLocationsRegistriesCreate,
    options: BodyResponseCallback[SchemaDeviceRegistry],
    callback: BodyResponseCallback[SchemaDeviceRegistry]
  ): Unit = js.native
  def create(params: ParamsResourceProjectsLocationsRegistriesCreate, options: MethodOptions): GaxiosPromise[SchemaDeviceRegistry] = js.native
  def create(
    params: ParamsResourceProjectsLocationsRegistriesCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaDeviceRegistry]
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
  def delete(): GaxiosPromise[SchemaEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceProjectsLocationsRegistriesDelete): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsRegistriesDelete,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def delete(
    params: ParamsResourceProjectsLocationsRegistriesDelete,
    options: BodyResponseCallback[SchemaEmpty],
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceProjectsLocationsRegistriesDelete, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsRegistriesDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
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
  def get(): GaxiosPromise[SchemaDeviceRegistry] = js.native
  def get(callback: BodyResponseCallback[SchemaDeviceRegistry]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaDeviceRegistry] = js.native
  def get(params: ParamsResourceProjectsLocationsRegistriesGet): GaxiosPromise[SchemaDeviceRegistry] = js.native
  def get(
    params: ParamsResourceProjectsLocationsRegistriesGet,
    callback: BodyResponseCallback[SchemaDeviceRegistry]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsLocationsRegistriesGet,
    options: BodyResponseCallback[SchemaDeviceRegistry],
    callback: BodyResponseCallback[SchemaDeviceRegistry]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsLocationsRegistriesGet, options: MethodOptions): GaxiosPromise[SchemaDeviceRegistry] = js.native
  def get(
    params: ParamsResourceProjectsLocationsRegistriesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaDeviceRegistry]
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
  def getIamPolicy(): GaxiosPromise[SchemaPolicy] = js.native
  def getIamPolicy(callback: BodyResponseCallback[SchemaPolicy]): Unit = js.native
  def getIamPolicy(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
  def getIamPolicy(params: ParamsResourceProjectsLocationsRegistriesGetiampolicy): GaxiosPromise[SchemaPolicy] = js.native
  def getIamPolicy(
    params: ParamsResourceProjectsLocationsRegistriesGetiampolicy,
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  def getIamPolicy(
    params: ParamsResourceProjectsLocationsRegistriesGetiampolicy,
    options: BodyResponseCallback[SchemaPolicy],
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  def getIamPolicy(params: ParamsResourceProjectsLocationsRegistriesGetiampolicy, options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
  def getIamPolicy(
    params: ParamsResourceProjectsLocationsRegistriesGetiampolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPolicy]
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
  def list(): GaxiosPromise[SchemaListDeviceRegistriesResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListDeviceRegistriesResponse]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaListDeviceRegistriesResponse] = js.native
  def list(params: ParamsResourceProjectsLocationsRegistriesList): GaxiosPromise[SchemaListDeviceRegistriesResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsRegistriesList,
    callback: BodyResponseCallback[SchemaListDeviceRegistriesResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsLocationsRegistriesList,
    options: BodyResponseCallback[SchemaListDeviceRegistriesResponse],
    callback: BodyResponseCallback[SchemaListDeviceRegistriesResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsLocationsRegistriesList, options: MethodOptions): GaxiosPromise[SchemaListDeviceRegistriesResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsRegistriesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListDeviceRegistriesResponse]
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
  def patch(): GaxiosPromise[SchemaDeviceRegistry] = js.native
  def patch(callback: BodyResponseCallback[SchemaDeviceRegistry]): Unit = js.native
  def patch(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaDeviceRegistry] = js.native
  def patch(params: ParamsResourceProjectsLocationsRegistriesPatch): GaxiosPromise[SchemaDeviceRegistry] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsRegistriesPatch,
    callback: BodyResponseCallback[SchemaDeviceRegistry]
  ): Unit = js.native
  def patch(
    params: ParamsResourceProjectsLocationsRegistriesPatch,
    options: BodyResponseCallback[SchemaDeviceRegistry],
    callback: BodyResponseCallback[SchemaDeviceRegistry]
  ): Unit = js.native
  def patch(params: ParamsResourceProjectsLocationsRegistriesPatch, options: MethodOptions): GaxiosPromise[SchemaDeviceRegistry] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsRegistriesPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaDeviceRegistry]
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
  def setIamPolicy(): GaxiosPromise[SchemaPolicy] = js.native
  def setIamPolicy(callback: BodyResponseCallback[SchemaPolicy]): Unit = js.native
  def setIamPolicy(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
  def setIamPolicy(params: ParamsResourceProjectsLocationsRegistriesSetiampolicy): GaxiosPromise[SchemaPolicy] = js.native
  def setIamPolicy(
    params: ParamsResourceProjectsLocationsRegistriesSetiampolicy,
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  def setIamPolicy(
    params: ParamsResourceProjectsLocationsRegistriesSetiampolicy,
    options: BodyResponseCallback[SchemaPolicy],
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  def setIamPolicy(params: ParamsResourceProjectsLocationsRegistriesSetiampolicy, options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
  def setIamPolicy(
    params: ParamsResourceProjectsLocationsRegistriesSetiampolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPolicy]
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
  def testIamPermissions(): GaxiosPromise[SchemaTestIamPermissionsResponse] = js.native
  def testIamPermissions(callback: BodyResponseCallback[SchemaTestIamPermissionsResponse]): Unit = js.native
  def testIamPermissions(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaTestIamPermissionsResponse] = js.native
  def testIamPermissions(params: ParamsResourceProjectsLocationsRegistriesTestiampermissions): GaxiosPromise[SchemaTestIamPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsResourceProjectsLocationsRegistriesTestiampermissions,
    callback: BodyResponseCallback[SchemaTestIamPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(
    params: ParamsResourceProjectsLocationsRegistriesTestiampermissions,
    options: BodyResponseCallback[SchemaTestIamPermissionsResponse],
    callback: BodyResponseCallback[SchemaTestIamPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(params: ParamsResourceProjectsLocationsRegistriesTestiampermissions, options: MethodOptions): GaxiosPromise[SchemaTestIamPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsResourceProjectsLocationsRegistriesTestiampermissions,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTestIamPermissionsResponse]
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
  def unbindDeviceFromGateway(): GaxiosPromise[SchemaUnbindDeviceFromGatewayResponse] = js.native
  def unbindDeviceFromGateway(callback: BodyResponseCallback[SchemaUnbindDeviceFromGatewayResponse]): Unit = js.native
  def unbindDeviceFromGateway(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaUnbindDeviceFromGatewayResponse] = js.native
  def unbindDeviceFromGateway(params: ParamsResourceProjectsLocationsRegistriesUnbinddevicefromgateway): GaxiosPromise[SchemaUnbindDeviceFromGatewayResponse] = js.native
  def unbindDeviceFromGateway(
    params: ParamsResourceProjectsLocationsRegistriesUnbinddevicefromgateway,
    callback: BodyResponseCallback[SchemaUnbindDeviceFromGatewayResponse]
  ): Unit = js.native
  def unbindDeviceFromGateway(
    params: ParamsResourceProjectsLocationsRegistriesUnbinddevicefromgateway,
    options: BodyResponseCallback[SchemaUnbindDeviceFromGatewayResponse],
    callback: BodyResponseCallback[SchemaUnbindDeviceFromGatewayResponse]
  ): Unit = js.native
  def unbindDeviceFromGateway(params: ParamsResourceProjectsLocationsRegistriesUnbinddevicefromgateway, options: MethodOptions): GaxiosPromise[SchemaUnbindDeviceFromGatewayResponse] = js.native
  def unbindDeviceFromGateway(
    params: ParamsResourceProjectsLocationsRegistriesUnbinddevicefromgateway,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaUnbindDeviceFromGatewayResponse]
  ): Unit = js.native
}

