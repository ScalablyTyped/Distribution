package typings.googleapis.binaryauthorizationV1beta1Mod.binaryauthorizationV1beta1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/binaryauthorization/v1beta1", "binaryauthorization_v1beta1.Resource$Projects$Policy")
@js.native
class ResourceProjectsPolicy protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * binaryauthorization.projects.policy.getIamPolicy
    * @desc Gets the access control policy for a resource. Returns an empty
    * policy if the resource exists and does not have a policy set.
    * @alias binaryauthorization.projects.policy.getIamPolicy
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.resource_ REQUIRED: The resource for which the policy is being requested. See the operation documentation for the appropriate value for this field.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def getIamPolicy(): GaxiosPromise[SchemaIamPolicy] = js.native
  def getIamPolicy(callback: BodyResponseCallback[SchemaIamPolicy]): Unit = js.native
  def getIamPolicy(params: Unit, options: MethodOptions): GaxiosPromise[SchemaIamPolicy] = js.native
  def getIamPolicy(params: ParamsResourceProjectsPolicyGetiampolicy): GaxiosPromise[SchemaIamPolicy] = js.native
  def getIamPolicy(params: ParamsResourceProjectsPolicyGetiampolicy, callback: BodyResponseCallback[SchemaIamPolicy]): Unit = js.native
  def getIamPolicy(
    params: ParamsResourceProjectsPolicyGetiampolicy,
    options: BodyResponseCallback[SchemaIamPolicy],
    callback: BodyResponseCallback[SchemaIamPolicy]
  ): Unit = js.native
  def getIamPolicy(params: ParamsResourceProjectsPolicyGetiampolicy, options: MethodOptions): GaxiosPromise[SchemaIamPolicy] = js.native
  def getIamPolicy(
    params: ParamsResourceProjectsPolicyGetiampolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaIamPolicy]
  ): Unit = js.native
  
  /**
    * binaryauthorization.projects.policy.setIamPolicy
    * @desc Sets the access control policy on the specified resource. Replaces
    * any existing policy.
    * @alias binaryauthorization.projects.policy.setIamPolicy
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.resource_ REQUIRED: The resource for which the policy is being specified. See the operation documentation for the appropriate value for this field.
    * @param {().SetIamPolicyRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def setIamPolicy(): GaxiosPromise[SchemaIamPolicy] = js.native
  def setIamPolicy(callback: BodyResponseCallback[SchemaIamPolicy]): Unit = js.native
  def setIamPolicy(params: Unit, options: MethodOptions): GaxiosPromise[SchemaIamPolicy] = js.native
  def setIamPolicy(params: ParamsResourceProjectsPolicySetiampolicy): GaxiosPromise[SchemaIamPolicy] = js.native
  def setIamPolicy(params: ParamsResourceProjectsPolicySetiampolicy, callback: BodyResponseCallback[SchemaIamPolicy]): Unit = js.native
  def setIamPolicy(
    params: ParamsResourceProjectsPolicySetiampolicy,
    options: BodyResponseCallback[SchemaIamPolicy],
    callback: BodyResponseCallback[SchemaIamPolicy]
  ): Unit = js.native
  def setIamPolicy(params: ParamsResourceProjectsPolicySetiampolicy, options: MethodOptions): GaxiosPromise[SchemaIamPolicy] = js.native
  def setIamPolicy(
    params: ParamsResourceProjectsPolicySetiampolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaIamPolicy]
  ): Unit = js.native
  
  /**
    * binaryauthorization.projects.policy.testIamPermissions
    * @desc Returns permissions that a caller has on the specified resource. If
    * the resource does not exist, this will return an empty set of
    * permissions, not a NOT_FOUND error.  Note: This operation is designed to
    * be used for building permission-aware UIs and command-line tools, not for
    * authorization checking. This operation may "fail open" without warning.
    * @alias binaryauthorization.projects.policy.testIamPermissions
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
  def testIamPermissions(params: Unit, options: MethodOptions): GaxiosPromise[SchemaTestIamPermissionsResponse] = js.native
  def testIamPermissions(params: ParamsResourceProjectsPolicyTestiampermissions): GaxiosPromise[SchemaTestIamPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsResourceProjectsPolicyTestiampermissions,
    callback: BodyResponseCallback[SchemaTestIamPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(
    params: ParamsResourceProjectsPolicyTestiampermissions,
    options: BodyResponseCallback[SchemaTestIamPermissionsResponse],
    callback: BodyResponseCallback[SchemaTestIamPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(params: ParamsResourceProjectsPolicyTestiampermissions, options: MethodOptions): GaxiosPromise[SchemaTestIamPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsResourceProjectsPolicyTestiampermissions,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTestIamPermissionsResponse]
  ): Unit = js.native
}
