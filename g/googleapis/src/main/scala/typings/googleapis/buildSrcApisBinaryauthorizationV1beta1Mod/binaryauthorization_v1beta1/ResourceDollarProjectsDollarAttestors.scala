package typings.googleapis.buildSrcApisBinaryauthorizationV1beta1Mod.binaryauthorization_v1beta1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/binaryauthorization/v1beta1", "binaryauthorization_v1beta1.Resource$Projects$Attestors")
@js.native
class ResourceDollarProjectsDollarAttestors protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * binaryauthorization.projects.attestors.create
    * @desc Creates an attestor, and returns a copy of the new attestor.
    * Returns NOT_FOUND if the project does not exist, INVALID_ARGUMENT if the
    * request is malformed, ALREADY_EXISTS if the attestor already exists.
    * @alias binaryauthorization.projects.attestors.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.attestorId Required. The attestors ID.
    * @param {string} params.parent Required. The parent of this attestor.
    * @param {().Attestor} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[Schema$Attestor] = js.native
  def create(callback: BodyResponseCallback[Schema$Attestor]): Unit = js.native
  def create(params: ParamsDollarResourceDollarProjectsDollarAttestorsDollarCreate): GaxiosPromise[Schema$Attestor] = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarAttestorsDollarCreate,
    callback: BodyResponseCallback[Schema$Attestor]
  ): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarAttestorsDollarCreate,
    options: BodyResponseCallback[Schema$Attestor],
    callback: BodyResponseCallback[Schema$Attestor]
  ): Unit = js.native
  def create(params: ParamsDollarResourceDollarProjectsDollarAttestorsDollarCreate, options: MethodOptions): GaxiosPromise[Schema$Attestor] = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarAttestorsDollarCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Attestor]
  ): Unit = js.native
  /**
    * binaryauthorization.projects.attestors.delete
    * @desc Deletes an attestor. Returns NOT_FOUND if the attestor does not
    * exist.
    * @alias binaryauthorization.projects.attestors.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Required. The name of the attestors to delete, in the format `projects/x/attestors/x`.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Schema$Empty] = js.native
  def delete(callback: BodyResponseCallback[Schema$Empty]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarProjectsDollarAttestorsDollarDelete): GaxiosPromise[Schema$Empty] = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarAttestorsDollarDelete,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarAttestorsDollarDelete,
    options: BodyResponseCallback[Schema$Empty],
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def delete(params: ParamsDollarResourceDollarProjectsDollarAttestorsDollarDelete, options: MethodOptions): GaxiosPromise[Schema$Empty] = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarAttestorsDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  /**
    * binaryauthorization.projects.attestors.get
    * @desc Gets an attestor. Returns NOT_FOUND if the attestor does not exist.
    * @alias binaryauthorization.projects.attestors.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Required. The name of the attestor to retrieve, in the format `projects/x/attestors/x`.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$Attestor] = js.native
  def get(callback: BodyResponseCallback[Schema$Attestor]): Unit = js.native
  def get(params: ParamsDollarResourceDollarProjectsDollarAttestorsDollarGet): GaxiosPromise[Schema$Attestor] = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarAttestorsDollarGet,
    callback: BodyResponseCallback[Schema$Attestor]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarAttestorsDollarGet,
    options: BodyResponseCallback[Schema$Attestor],
    callback: BodyResponseCallback[Schema$Attestor]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarProjectsDollarAttestorsDollarGet, options: MethodOptions): GaxiosPromise[Schema$Attestor] = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarAttestorsDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Attestor]
  ): Unit = js.native
  /**
    * binaryauthorization.projects.attestors.getIamPolicy
    * @desc Gets the access control policy for a resource. Returns an empty
    * policy if the resource exists and does not have a policy set.
    * @alias binaryauthorization.projects.attestors.getIamPolicy
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.resource_ REQUIRED: The resource for which the policy is being requested. See the operation documentation for the appropriate value for this field.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def getIamPolicy(): GaxiosPromise[Schema$IamPolicy] = js.native
  def getIamPolicy(callback: BodyResponseCallback[Schema$IamPolicy]): Unit = js.native
  def getIamPolicy(params: ParamsDollarResourceDollarProjectsDollarAttestorsDollarGetiampolicy): GaxiosPromise[Schema$IamPolicy] = js.native
  def getIamPolicy(
    params: ParamsDollarResourceDollarProjectsDollarAttestorsDollarGetiampolicy,
    callback: BodyResponseCallback[Schema$IamPolicy]
  ): Unit = js.native
  def getIamPolicy(
    params: ParamsDollarResourceDollarProjectsDollarAttestorsDollarGetiampolicy,
    options: BodyResponseCallback[Schema$IamPolicy],
    callback: BodyResponseCallback[Schema$IamPolicy]
  ): Unit = js.native
  def getIamPolicy(
    params: ParamsDollarResourceDollarProjectsDollarAttestorsDollarGetiampolicy,
    options: MethodOptions
  ): GaxiosPromise[Schema$IamPolicy] = js.native
  def getIamPolicy(
    params: ParamsDollarResourceDollarProjectsDollarAttestorsDollarGetiampolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$IamPolicy]
  ): Unit = js.native
  /**
    * binaryauthorization.projects.attestors.list
    * @desc Lists attestors. Returns INVALID_ARGUMENT if the project does not
    * exist.
    * @alias binaryauthorization.projects.attestors.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer=} params.pageSize Requested page size. The server may return fewer results than requested. If unspecified, the server will pick an appropriate default.
    * @param {string=} params.pageToken A token identifying a page of results the server should return. Typically, this is the value of ListAttestorsResponse.next_page_token returned from the previous call to the `ListAttestors` method.
    * @param {string} params.parent Required. The resource name of the project associated with the attestors, in the format `projects/x`.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$ListAttestorsResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$ListAttestorsResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarProjectsDollarAttestorsDollarList): GaxiosPromise[Schema$ListAttestorsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarAttestorsDollarList,
    callback: BodyResponseCallback[Schema$ListAttestorsResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarAttestorsDollarList,
    options: BodyResponseCallback[Schema$ListAttestorsResponse],
    callback: BodyResponseCallback[Schema$ListAttestorsResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarProjectsDollarAttestorsDollarList, options: MethodOptions): GaxiosPromise[Schema$ListAttestorsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarAttestorsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ListAttestorsResponse]
  ): Unit = js.native
  /**
    * binaryauthorization.projects.attestors.setIamPolicy
    * @desc Sets the access control policy on the specified resource. Replaces
    * any existing policy.
    * @alias binaryauthorization.projects.attestors.setIamPolicy
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.resource_ REQUIRED: The resource for which the policy is being specified. See the operation documentation for the appropriate value for this field.
    * @param {().SetIamPolicyRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def setIamPolicy(): GaxiosPromise[Schema$IamPolicy] = js.native
  def setIamPolicy(callback: BodyResponseCallback[Schema$IamPolicy]): Unit = js.native
  def setIamPolicy(params: ParamsDollarResourceDollarProjectsDollarAttestorsDollarSetiampolicy): GaxiosPromise[Schema$IamPolicy] = js.native
  def setIamPolicy(
    params: ParamsDollarResourceDollarProjectsDollarAttestorsDollarSetiampolicy,
    callback: BodyResponseCallback[Schema$IamPolicy]
  ): Unit = js.native
  def setIamPolicy(
    params: ParamsDollarResourceDollarProjectsDollarAttestorsDollarSetiampolicy,
    options: BodyResponseCallback[Schema$IamPolicy],
    callback: BodyResponseCallback[Schema$IamPolicy]
  ): Unit = js.native
  def setIamPolicy(
    params: ParamsDollarResourceDollarProjectsDollarAttestorsDollarSetiampolicy,
    options: MethodOptions
  ): GaxiosPromise[Schema$IamPolicy] = js.native
  def setIamPolicy(
    params: ParamsDollarResourceDollarProjectsDollarAttestorsDollarSetiampolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$IamPolicy]
  ): Unit = js.native
  /**
    * binaryauthorization.projects.attestors.testIamPermissions
    * @desc Returns permissions that a caller has on the specified resource. If
    * the resource does not exist, this will return an empty set of
    * permissions, not a NOT_FOUND error.  Note: This operation is designed to
    * be used for building permission-aware UIs and command-line tools, not for
    * authorization checking. This operation may "fail open" without warning.
    * @alias binaryauthorization.projects.attestors.testIamPermissions
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
  def testIamPermissions(params: ParamsDollarResourceDollarProjectsDollarAttestorsDollarTestiampermissions): GaxiosPromise[Schema$TestIamPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsDollarResourceDollarProjectsDollarAttestorsDollarTestiampermissions,
    callback: BodyResponseCallback[Schema$TestIamPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(
    params: ParamsDollarResourceDollarProjectsDollarAttestorsDollarTestiampermissions,
    options: BodyResponseCallback[Schema$TestIamPermissionsResponse],
    callback: BodyResponseCallback[Schema$TestIamPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(
    params: ParamsDollarResourceDollarProjectsDollarAttestorsDollarTestiampermissions,
    options: MethodOptions
  ): GaxiosPromise[Schema$TestIamPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsDollarResourceDollarProjectsDollarAttestorsDollarTestiampermissions,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$TestIamPermissionsResponse]
  ): Unit = js.native
  /**
    * binaryauthorization.projects.attestors.update
    * @desc Updates an attestor. Returns NOT_FOUND if the attestor does not
    * exist.
    * @alias binaryauthorization.projects.attestors.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Required. The resource name, in the format: `projects/x/attestors/x`. This field may not be updated.
    * @param {().Attestor} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[Schema$Attestor] = js.native
  def update(callback: BodyResponseCallback[Schema$Attestor]): Unit = js.native
  def update(params: ParamsDollarResourceDollarProjectsDollarAttestorsDollarUpdate): GaxiosPromise[Schema$Attestor] = js.native
  def update(
    params: ParamsDollarResourceDollarProjectsDollarAttestorsDollarUpdate,
    callback: BodyResponseCallback[Schema$Attestor]
  ): Unit = js.native
  def update(
    params: ParamsDollarResourceDollarProjectsDollarAttestorsDollarUpdate,
    options: BodyResponseCallback[Schema$Attestor],
    callback: BodyResponseCallback[Schema$Attestor]
  ): Unit = js.native
  def update(params: ParamsDollarResourceDollarProjectsDollarAttestorsDollarUpdate, options: MethodOptions): GaxiosPromise[Schema$Attestor] = js.native
  def update(
    params: ParamsDollarResourceDollarProjectsDollarAttestorsDollarUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Attestor]
  ): Unit = js.native
}

