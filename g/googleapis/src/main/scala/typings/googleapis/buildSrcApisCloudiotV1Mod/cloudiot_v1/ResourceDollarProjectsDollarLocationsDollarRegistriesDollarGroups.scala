package typings.googleapis.buildSrcApisCloudiotV1Mod.cloudiot_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/cloudiot/v1", "cloudiot_v1.Resource$Projects$Locations$Registries$Groups")
@js.native
class ResourceDollarProjectsDollarLocationsDollarRegistriesDollarGroups protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  var devices: ResourceDollarProjectsDollarLocationsDollarRegistriesDollarGroupsDollarDevices = js.native
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
  def bindDeviceToGateway(): GaxiosPromise[Schema$BindDeviceToGatewayResponse] = js.native
  def bindDeviceToGateway(callback: BodyResponseCallback[Schema$BindDeviceToGatewayResponse]): Unit = js.native
  def bindDeviceToGateway(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarRegistriesDollarGroupsDollarBinddevicetogateway
  ): GaxiosPromise[Schema$BindDeviceToGatewayResponse] = js.native
  def bindDeviceToGateway(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarRegistriesDollarGroupsDollarBinddevicetogateway,
    callback: BodyResponseCallback[Schema$BindDeviceToGatewayResponse]
  ): Unit = js.native
  def bindDeviceToGateway(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarRegistriesDollarGroupsDollarBinddevicetogateway,
    options: BodyResponseCallback[Schema$BindDeviceToGatewayResponse],
    callback: BodyResponseCallback[Schema$BindDeviceToGatewayResponse]
  ): Unit = js.native
  def bindDeviceToGateway(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarRegistriesDollarGroupsDollarBinddevicetogateway,
    options: MethodOptions
  ): GaxiosPromise[Schema$BindDeviceToGatewayResponse] = js.native
  def bindDeviceToGateway(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarRegistriesDollarGroupsDollarBinddevicetogateway,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$BindDeviceToGatewayResponse]
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
  def getIamPolicy(): GaxiosPromise[Schema$Policy] = js.native
  def getIamPolicy(callback: BodyResponseCallback[Schema$Policy]): Unit = js.native
  def getIamPolicy(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarRegistriesDollarGroupsDollarGetiampolicy
  ): GaxiosPromise[Schema$Policy] = js.native
  def getIamPolicy(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarRegistriesDollarGroupsDollarGetiampolicy,
    callback: BodyResponseCallback[Schema$Policy]
  ): Unit = js.native
  def getIamPolicy(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarRegistriesDollarGroupsDollarGetiampolicy,
    options: BodyResponseCallback[Schema$Policy],
    callback: BodyResponseCallback[Schema$Policy]
  ): Unit = js.native
  def getIamPolicy(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarRegistriesDollarGroupsDollarGetiampolicy,
    options: MethodOptions
  ): GaxiosPromise[Schema$Policy] = js.native
  def getIamPolicy(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarRegistriesDollarGroupsDollarGetiampolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Policy]
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
  def setIamPolicy(): GaxiosPromise[Schema$Policy] = js.native
  def setIamPolicy(callback: BodyResponseCallback[Schema$Policy]): Unit = js.native
  def setIamPolicy(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarRegistriesDollarGroupsDollarSetiampolicy
  ): GaxiosPromise[Schema$Policy] = js.native
  def setIamPolicy(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarRegistriesDollarGroupsDollarSetiampolicy,
    callback: BodyResponseCallback[Schema$Policy]
  ): Unit = js.native
  def setIamPolicy(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarRegistriesDollarGroupsDollarSetiampolicy,
    options: BodyResponseCallback[Schema$Policy],
    callback: BodyResponseCallback[Schema$Policy]
  ): Unit = js.native
  def setIamPolicy(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarRegistriesDollarGroupsDollarSetiampolicy,
    options: MethodOptions
  ): GaxiosPromise[Schema$Policy] = js.native
  def setIamPolicy(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarRegistriesDollarGroupsDollarSetiampolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Policy]
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
  def testIamPermissions(): GaxiosPromise[Schema$TestIamPermissionsResponse] = js.native
  def testIamPermissions(callback: BodyResponseCallback[Schema$TestIamPermissionsResponse]): Unit = js.native
  def testIamPermissions(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarRegistriesDollarGroupsDollarTestiampermissions
  ): GaxiosPromise[Schema$TestIamPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarRegistriesDollarGroupsDollarTestiampermissions,
    callback: BodyResponseCallback[Schema$TestIamPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarRegistriesDollarGroupsDollarTestiampermissions,
    options: BodyResponseCallback[Schema$TestIamPermissionsResponse],
    callback: BodyResponseCallback[Schema$TestIamPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarRegistriesDollarGroupsDollarTestiampermissions,
    options: MethodOptions
  ): GaxiosPromise[Schema$TestIamPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarRegistriesDollarGroupsDollarTestiampermissions,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$TestIamPermissionsResponse]
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
  def unbindDeviceFromGateway(): GaxiosPromise[Schema$UnbindDeviceFromGatewayResponse] = js.native
  def unbindDeviceFromGateway(callback: BodyResponseCallback[Schema$UnbindDeviceFromGatewayResponse]): Unit = js.native
  def unbindDeviceFromGateway(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarRegistriesDollarGroupsDollarUnbinddevicefromgateway
  ): GaxiosPromise[Schema$UnbindDeviceFromGatewayResponse] = js.native
  def unbindDeviceFromGateway(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarRegistriesDollarGroupsDollarUnbinddevicefromgateway,
    callback: BodyResponseCallback[Schema$UnbindDeviceFromGatewayResponse]
  ): Unit = js.native
  def unbindDeviceFromGateway(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarRegistriesDollarGroupsDollarUnbinddevicefromgateway,
    options: BodyResponseCallback[Schema$UnbindDeviceFromGatewayResponse],
    callback: BodyResponseCallback[Schema$UnbindDeviceFromGatewayResponse]
  ): Unit = js.native
  def unbindDeviceFromGateway(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarRegistriesDollarGroupsDollarUnbinddevicefromgateway,
    options: MethodOptions
  ): GaxiosPromise[Schema$UnbindDeviceFromGatewayResponse] = js.native
  def unbindDeviceFromGateway(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarRegistriesDollarGroupsDollarUnbinddevicefromgateway,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$UnbindDeviceFromGatewayResponse]
  ): Unit = js.native
}

