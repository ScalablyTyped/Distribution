package typings.googleapis.buildSrcApisServicebrokerV1Mod.servicebroker_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/servicebroker/v1", "servicebroker_v1.Resource$V1")
@js.native
class Resource$V1 protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * servicebroker.getIamPolicy
    * @desc Gets the access control policy for a resource. Returns an empty
    * policy if the resource exists and does not have a policy set.
    * @alias servicebroker.getIamPolicy
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.resource_ REQUIRED: The resource for which the policy is being requested. See the operation documentation for the appropriate value for this field.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def getIamPolicy(): GaxiosPromise[Schema$GoogleIamV1__Policy] = js.native
  def getIamPolicy(callback: BodyResponseCallback[Schema$GoogleIamV1__Policy]): Unit = js.native
  def getIamPolicy(params: ParamsDollarResourceDollarV1DollarGetiampolicy): GaxiosPromise[Schema$GoogleIamV1__Policy] = js.native
  def getIamPolicy(
    params: ParamsDollarResourceDollarV1DollarGetiampolicy,
    callback: BodyResponseCallback[Schema$GoogleIamV1__Policy]
  ): Unit = js.native
  def getIamPolicy(
    params: ParamsDollarResourceDollarV1DollarGetiampolicy,
    options: BodyResponseCallback[Schema$GoogleIamV1__Policy],
    callback: BodyResponseCallback[Schema$GoogleIamV1__Policy]
  ): Unit = js.native
  def getIamPolicy(params: ParamsDollarResourceDollarV1DollarGetiampolicy, options: MethodOptions): GaxiosPromise[Schema$GoogleIamV1__Policy] = js.native
  def getIamPolicy(
    params: ParamsDollarResourceDollarV1DollarGetiampolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$GoogleIamV1__Policy]
  ): Unit = js.native
  /**
    * servicebroker.setIamPolicy
    * @desc Sets the access control policy on the specified resource. Replaces
    * any existing policy.
    * @alias servicebroker.setIamPolicy
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.resource_ REQUIRED: The resource for which the policy is being specified. See the operation documentation for the appropriate value for this field.
    * @param {().GoogleIamV1__SetIamPolicyRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def setIamPolicy(): GaxiosPromise[Schema$GoogleIamV1__Policy] = js.native
  def setIamPolicy(callback: BodyResponseCallback[Schema$GoogleIamV1__Policy]): Unit = js.native
  def setIamPolicy(params: ParamsDollarResourceDollarV1DollarSetiampolicy): GaxiosPromise[Schema$GoogleIamV1__Policy] = js.native
  def setIamPolicy(
    params: ParamsDollarResourceDollarV1DollarSetiampolicy,
    callback: BodyResponseCallback[Schema$GoogleIamV1__Policy]
  ): Unit = js.native
  def setIamPolicy(
    params: ParamsDollarResourceDollarV1DollarSetiampolicy,
    options: BodyResponseCallback[Schema$GoogleIamV1__Policy],
    callback: BodyResponseCallback[Schema$GoogleIamV1__Policy]
  ): Unit = js.native
  def setIamPolicy(params: ParamsDollarResourceDollarV1DollarSetiampolicy, options: MethodOptions): GaxiosPromise[Schema$GoogleIamV1__Policy] = js.native
  def setIamPolicy(
    params: ParamsDollarResourceDollarV1DollarSetiampolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$GoogleIamV1__Policy]
  ): Unit = js.native
  /**
    * servicebroker.testIamPermissions
    * @desc Returns permissions that a caller has on the specified resource. If
    * the resource does not exist, this will return an empty set of
    * permissions, not a NOT_FOUND error.  Note: This operation is designed to
    * be used for building permission-aware UIs and command-line tools, not for
    * authorization checking. This operation may "fail open" without warning.
    * @alias servicebroker.testIamPermissions
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.resource_ REQUIRED: The resource for which the policy detail is being requested. See the operation documentation for the appropriate value for this field.
    * @param {().GoogleIamV1__TestIamPermissionsRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def testIamPermissions(): GaxiosPromise[Schema$GoogleIamV1__TestIamPermissionsResponse] = js.native
  def testIamPermissions(callback: BodyResponseCallback[Schema$GoogleIamV1__TestIamPermissionsResponse]): Unit = js.native
  def testIamPermissions(params: ParamsDollarResourceDollarV1DollarTestiampermissions): GaxiosPromise[Schema$GoogleIamV1__TestIamPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsDollarResourceDollarV1DollarTestiampermissions,
    callback: BodyResponseCallback[Schema$GoogleIamV1__TestIamPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(
    params: ParamsDollarResourceDollarV1DollarTestiampermissions,
    options: BodyResponseCallback[Schema$GoogleIamV1__TestIamPermissionsResponse],
    callback: BodyResponseCallback[Schema$GoogleIamV1__TestIamPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(params: ParamsDollarResourceDollarV1DollarTestiampermissions, options: MethodOptions): GaxiosPromise[Schema$GoogleIamV1__TestIamPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsDollarResourceDollarV1DollarTestiampermissions,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$GoogleIamV1__TestIamPermissionsResponse]
  ): Unit = js.native
}

