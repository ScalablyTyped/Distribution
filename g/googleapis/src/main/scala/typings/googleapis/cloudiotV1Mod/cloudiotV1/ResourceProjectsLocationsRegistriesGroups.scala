package typings.googleapis.cloudiotV1Mod.cloudiotV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/cloudiot/v1", "cloudiot_v1.Resource$Projects$Locations$Registries$Groups")
@js.native
class ResourceProjectsLocationsRegistriesGroups protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  var devices: ResourceProjectsLocationsRegistriesGroupsDevices = js.native
  /**
    * cloudiot.projects.locations.registries.groups.bindDeviceToGateway
    * @desc Associates the device with the gateway.
    * @alias cloudiot.projects.locations.registries.groups.bindDeviceToGateway
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
  def bindDeviceToGateway(params: ParamsResourceProjectsLocationsRegistriesGroupsBinddevicetogateway): GaxiosPromise[SchemaBindDeviceToGatewayResponse] = js.native
  def bindDeviceToGateway(
    params: ParamsResourceProjectsLocationsRegistriesGroupsBinddevicetogateway,
    callback: BodyResponseCallback[SchemaBindDeviceToGatewayResponse]
  ): Unit = js.native
  def bindDeviceToGateway(
    params: ParamsResourceProjectsLocationsRegistriesGroupsBinddevicetogateway,
    options: BodyResponseCallback[SchemaBindDeviceToGatewayResponse],
    callback: BodyResponseCallback[SchemaBindDeviceToGatewayResponse]
  ): Unit = js.native
  def bindDeviceToGateway(params: ParamsResourceProjectsLocationsRegistriesGroupsBinddevicetogateway, options: MethodOptions): GaxiosPromise[SchemaBindDeviceToGatewayResponse] = js.native
  def bindDeviceToGateway(
    params: ParamsResourceProjectsLocationsRegistriesGroupsBinddevicetogateway,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaBindDeviceToGatewayResponse]
  ): Unit = js.native
  /**
    * cloudiot.projects.locations.registries.groups.getIamPolicy
    * @desc Gets the access control policy for a resource. Returns an empty
    * policy if the resource exists and does not have a policy set.
    * @alias cloudiot.projects.locations.registries.groups.getIamPolicy
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
  def getIamPolicy(params: ParamsResourceProjectsLocationsRegistriesGroupsGetiampolicy): GaxiosPromise[SchemaPolicy] = js.native
  def getIamPolicy(
    params: ParamsResourceProjectsLocationsRegistriesGroupsGetiampolicy,
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  def getIamPolicy(
    params: ParamsResourceProjectsLocationsRegistriesGroupsGetiampolicy,
    options: BodyResponseCallback[SchemaPolicy],
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  def getIamPolicy(params: ParamsResourceProjectsLocationsRegistriesGroupsGetiampolicy, options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
  def getIamPolicy(
    params: ParamsResourceProjectsLocationsRegistriesGroupsGetiampolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  /**
    * cloudiot.projects.locations.registries.groups.setIamPolicy
    * @desc Sets the access control policy on the specified resource. Replaces
    * any existing policy.
    * @alias cloudiot.projects.locations.registries.groups.setIamPolicy
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
  def setIamPolicy(params: ParamsResourceProjectsLocationsRegistriesGroupsSetiampolicy): GaxiosPromise[SchemaPolicy] = js.native
  def setIamPolicy(
    params: ParamsResourceProjectsLocationsRegistriesGroupsSetiampolicy,
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  def setIamPolicy(
    params: ParamsResourceProjectsLocationsRegistriesGroupsSetiampolicy,
    options: BodyResponseCallback[SchemaPolicy],
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  def setIamPolicy(params: ParamsResourceProjectsLocationsRegistriesGroupsSetiampolicy, options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
  def setIamPolicy(
    params: ParamsResourceProjectsLocationsRegistriesGroupsSetiampolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  /**
    * cloudiot.projects.locations.registries.groups.testIamPermissions
    * @desc Returns permissions that a caller has on the specified resource. If
    * the resource does not exist, this will return an empty set of
    * permissions, not a NOT_FOUND error.
    * @alias cloudiot.projects.locations.registries.groups.testIamPermissions
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
  def testIamPermissions(params: ParamsResourceProjectsLocationsRegistriesGroupsTestiampermissions): GaxiosPromise[SchemaTestIamPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsResourceProjectsLocationsRegistriesGroupsTestiampermissions,
    callback: BodyResponseCallback[SchemaTestIamPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(
    params: ParamsResourceProjectsLocationsRegistriesGroupsTestiampermissions,
    options: BodyResponseCallback[SchemaTestIamPermissionsResponse],
    callback: BodyResponseCallback[SchemaTestIamPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(params: ParamsResourceProjectsLocationsRegistriesGroupsTestiampermissions, options: MethodOptions): GaxiosPromise[SchemaTestIamPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsResourceProjectsLocationsRegistriesGroupsTestiampermissions,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTestIamPermissionsResponse]
  ): Unit = js.native
  /**
    * cloudiot.projects.locations.registries.groups.unbindDeviceFromGateway
    * @desc Deletes the association between the device and the gateway.
    * @alias
    * cloudiot.projects.locations.registries.groups.unbindDeviceFromGateway
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
  def unbindDeviceFromGateway(params: ParamsResourceProjectsLocationsRegistriesGroupsUnbinddevicefromgateway): GaxiosPromise[SchemaUnbindDeviceFromGatewayResponse] = js.native
  def unbindDeviceFromGateway(
    params: ParamsResourceProjectsLocationsRegistriesGroupsUnbinddevicefromgateway,
    callback: BodyResponseCallback[SchemaUnbindDeviceFromGatewayResponse]
  ): Unit = js.native
  def unbindDeviceFromGateway(
    params: ParamsResourceProjectsLocationsRegistriesGroupsUnbinddevicefromgateway,
    options: BodyResponseCallback[SchemaUnbindDeviceFromGatewayResponse],
    callback: BodyResponseCallback[SchemaUnbindDeviceFromGatewayResponse]
  ): Unit = js.native
  def unbindDeviceFromGateway(
    params: ParamsResourceProjectsLocationsRegistriesGroupsUnbinddevicefromgateway,
    options: MethodOptions
  ): GaxiosPromise[SchemaUnbindDeviceFromGatewayResponse] = js.native
  def unbindDeviceFromGateway(
    params: ParamsResourceProjectsLocationsRegistriesGroupsUnbinddevicefromgateway,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaUnbindDeviceFromGatewayResponse]
  ): Unit = js.native
}

