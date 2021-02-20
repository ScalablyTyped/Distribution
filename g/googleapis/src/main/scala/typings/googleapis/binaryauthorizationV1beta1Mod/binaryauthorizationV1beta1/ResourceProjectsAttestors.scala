package typings.googleapis.binaryauthorizationV1beta1Mod.binaryauthorizationV1beta1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/binaryauthorization/v1beta1", "binaryauthorization_v1beta1.Resource$Projects$Attestors")
@js.native
class ResourceProjectsAttestors protected () extends StObject {
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
  def create(): GaxiosPromise[SchemaAttestor] = js.native
  def create(callback: BodyResponseCallback[SchemaAttestor]): Unit = js.native
  def create(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaAttestor] = js.native
  def create(params: ParamsResourceProjectsAttestorsCreate): GaxiosPromise[SchemaAttestor] = js.native
  def create(params: ParamsResourceProjectsAttestorsCreate, callback: BodyResponseCallback[SchemaAttestor]): Unit = js.native
  def create(
    params: ParamsResourceProjectsAttestorsCreate,
    options: BodyResponseCallback[SchemaAttestor],
    callback: BodyResponseCallback[SchemaAttestor]
  ): Unit = js.native
  def create(params: ParamsResourceProjectsAttestorsCreate, options: MethodOptions): GaxiosPromise[SchemaAttestor] = js.native
  def create(
    params: ParamsResourceProjectsAttestorsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAttestor]
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
  def delete(): GaxiosPromise[SchemaEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceProjectsAttestorsDelete): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceProjectsAttestorsDelete, callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(
    params: ParamsResourceProjectsAttestorsDelete,
    options: BodyResponseCallback[SchemaEmpty],
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceProjectsAttestorsDelete, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsAttestorsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
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
  def get(): GaxiosPromise[SchemaAttestor] = js.native
  def get(callback: BodyResponseCallback[SchemaAttestor]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaAttestor] = js.native
  def get(params: ParamsResourceProjectsAttestorsGet): GaxiosPromise[SchemaAttestor] = js.native
  def get(params: ParamsResourceProjectsAttestorsGet, callback: BodyResponseCallback[SchemaAttestor]): Unit = js.native
  def get(
    params: ParamsResourceProjectsAttestorsGet,
    options: BodyResponseCallback[SchemaAttestor],
    callback: BodyResponseCallback[SchemaAttestor]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsAttestorsGet, options: MethodOptions): GaxiosPromise[SchemaAttestor] = js.native
  def get(
    params: ParamsResourceProjectsAttestorsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAttestor]
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
  def getIamPolicy(): GaxiosPromise[SchemaIamPolicy] = js.native
  def getIamPolicy(callback: BodyResponseCallback[SchemaIamPolicy]): Unit = js.native
  def getIamPolicy(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaIamPolicy] = js.native
  def getIamPolicy(params: ParamsResourceProjectsAttestorsGetiampolicy): GaxiosPromise[SchemaIamPolicy] = js.native
  def getIamPolicy(
    params: ParamsResourceProjectsAttestorsGetiampolicy,
    callback: BodyResponseCallback[SchemaIamPolicy]
  ): Unit = js.native
  def getIamPolicy(
    params: ParamsResourceProjectsAttestorsGetiampolicy,
    options: BodyResponseCallback[SchemaIamPolicy],
    callback: BodyResponseCallback[SchemaIamPolicy]
  ): Unit = js.native
  def getIamPolicy(params: ParamsResourceProjectsAttestorsGetiampolicy, options: MethodOptions): GaxiosPromise[SchemaIamPolicy] = js.native
  def getIamPolicy(
    params: ParamsResourceProjectsAttestorsGetiampolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaIamPolicy]
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
  def list(): GaxiosPromise[SchemaListAttestorsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListAttestorsResponse]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaListAttestorsResponse] = js.native
  def list(params: ParamsResourceProjectsAttestorsList): GaxiosPromise[SchemaListAttestorsResponse] = js.native
  def list(
    params: ParamsResourceProjectsAttestorsList,
    callback: BodyResponseCallback[SchemaListAttestorsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsAttestorsList,
    options: BodyResponseCallback[SchemaListAttestorsResponse],
    callback: BodyResponseCallback[SchemaListAttestorsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsAttestorsList, options: MethodOptions): GaxiosPromise[SchemaListAttestorsResponse] = js.native
  def list(
    params: ParamsResourceProjectsAttestorsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListAttestorsResponse]
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
  def setIamPolicy(): GaxiosPromise[SchemaIamPolicy] = js.native
  def setIamPolicy(callback: BodyResponseCallback[SchemaIamPolicy]): Unit = js.native
  def setIamPolicy(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaIamPolicy] = js.native
  def setIamPolicy(params: ParamsResourceProjectsAttestorsSetiampolicy): GaxiosPromise[SchemaIamPolicy] = js.native
  def setIamPolicy(
    params: ParamsResourceProjectsAttestorsSetiampolicy,
    callback: BodyResponseCallback[SchemaIamPolicy]
  ): Unit = js.native
  def setIamPolicy(
    params: ParamsResourceProjectsAttestorsSetiampolicy,
    options: BodyResponseCallback[SchemaIamPolicy],
    callback: BodyResponseCallback[SchemaIamPolicy]
  ): Unit = js.native
  def setIamPolicy(params: ParamsResourceProjectsAttestorsSetiampolicy, options: MethodOptions): GaxiosPromise[SchemaIamPolicy] = js.native
  def setIamPolicy(
    params: ParamsResourceProjectsAttestorsSetiampolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaIamPolicy]
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
  def testIamPermissions(): GaxiosPromise[SchemaTestIamPermissionsResponse] = js.native
  def testIamPermissions(callback: BodyResponseCallback[SchemaTestIamPermissionsResponse]): Unit = js.native
  def testIamPermissions(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaTestIamPermissionsResponse] = js.native
  def testIamPermissions(params: ParamsResourceProjectsAttestorsTestiampermissions): GaxiosPromise[SchemaTestIamPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsResourceProjectsAttestorsTestiampermissions,
    callback: BodyResponseCallback[SchemaTestIamPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(
    params: ParamsResourceProjectsAttestorsTestiampermissions,
    options: BodyResponseCallback[SchemaTestIamPermissionsResponse],
    callback: BodyResponseCallback[SchemaTestIamPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(params: ParamsResourceProjectsAttestorsTestiampermissions, options: MethodOptions): GaxiosPromise[SchemaTestIamPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsResourceProjectsAttestorsTestiampermissions,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTestIamPermissionsResponse]
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
  def update(): GaxiosPromise[SchemaAttestor] = js.native
  def update(callback: BodyResponseCallback[SchemaAttestor]): Unit = js.native
  def update(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaAttestor] = js.native
  def update(params: ParamsResourceProjectsAttestorsUpdate): GaxiosPromise[SchemaAttestor] = js.native
  def update(params: ParamsResourceProjectsAttestorsUpdate, callback: BodyResponseCallback[SchemaAttestor]): Unit = js.native
  def update(
    params: ParamsResourceProjectsAttestorsUpdate,
    options: BodyResponseCallback[SchemaAttestor],
    callback: BodyResponseCallback[SchemaAttestor]
  ): Unit = js.native
  def update(params: ParamsResourceProjectsAttestorsUpdate, options: MethodOptions): GaxiosPromise[SchemaAttestor] = js.native
  def update(
    params: ParamsResourceProjectsAttestorsUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAttestor]
  ): Unit = js.native
}
