package typings.googleapis.buildSrcApisHealthcareV1alphaMod.healthcare_v1alpha

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/healthcare/v1alpha", "healthcare_v1alpha.Resource$Projects$Locations$Datasets$Hl7v2stores")
@js.native
class ResourceDollarProjectsDollarLocationsDollarDatasetsDollarHl7v2stores protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  var messages: ResourceDollarProjectsDollarLocationsDollarDatasetsDollarHl7v2storesDollarMessages = js.native
  /**
    * healthcare.projects.locations.datasets.hl7V2Stores.create
    * @desc Creates a new HL7v2 store within the parent dataset.
    * @alias healthcare.projects.locations.datasets.hl7V2Stores.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.hl7V2StoreId The ID of the HL7v2 store that is being created. The string must match the following regex: `[\p{L}\p{N}_\-\.]{1,256}`.
    * @param {string} params.parent The name of the dataset this HL7v2 store belongs to.
    * @param {().Hl7V2Store} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[Schema$Hl7V2Store] = js.native
  def create(callback: BodyResponseCallback[Schema$Hl7V2Store]): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarHl7v2storesDollarCreate
  ): GaxiosPromise[Schema$Hl7V2Store] = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarHl7v2storesDollarCreate,
    callback: BodyResponseCallback[Schema$Hl7V2Store]
  ): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarHl7v2storesDollarCreate,
    options: BodyResponseCallback[Schema$Hl7V2Store],
    callback: BodyResponseCallback[Schema$Hl7V2Store]
  ): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarHl7v2storesDollarCreate,
    options: MethodOptions
  ): GaxiosPromise[Schema$Hl7V2Store] = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarHl7v2storesDollarCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Hl7V2Store]
  ): Unit = js.native
  /**
    * healthcare.projects.locations.datasets.hl7V2Stores.delete
    * @desc Deletes the specified HL7v2 store and removes all messages that are
    * contained within it.
    * @alias healthcare.projects.locations.datasets.hl7V2Stores.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The resource name of the HL7v2 store to delete.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Schema$Empty] = js.native
  def delete(callback: BodyResponseCallback[Schema$Empty]): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarHl7v2storesDollarDelete
  ): GaxiosPromise[Schema$Empty] = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarHl7v2storesDollarDelete,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarHl7v2storesDollarDelete,
    options: BodyResponseCallback[Schema$Empty],
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarHl7v2storesDollarDelete,
    options: MethodOptions
  ): GaxiosPromise[Schema$Empty] = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarHl7v2storesDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  /**
    * healthcare.projects.locations.datasets.hl7V2Stores.get
    * @desc Gets the specified HL7v2 store.
    * @alias healthcare.projects.locations.datasets.hl7V2Stores.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The resource name of the HL7v2 store to get.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$Hl7V2Store] = js.native
  def get(callback: BodyResponseCallback[Schema$Hl7V2Store]): Unit = js.native
  def get(params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarHl7v2storesDollarGet): GaxiosPromise[Schema$Hl7V2Store] = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarHl7v2storesDollarGet,
    callback: BodyResponseCallback[Schema$Hl7V2Store]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarHl7v2storesDollarGet,
    options: BodyResponseCallback[Schema$Hl7V2Store],
    callback: BodyResponseCallback[Schema$Hl7V2Store]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarHl7v2storesDollarGet,
    options: MethodOptions
  ): GaxiosPromise[Schema$Hl7V2Store] = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarHl7v2storesDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Hl7V2Store]
  ): Unit = js.native
  /**
    * healthcare.projects.locations.datasets.hl7V2Stores.getIamPolicy
    * @desc Gets the access control policy for a resource. Returns an empty
    * policy if the resource exists and does not have a policy set.
    * @alias healthcare.projects.locations.datasets.hl7V2Stores.getIamPolicy
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.resource_ REQUIRED: The resource for which the policy is being requested. See the operation documentation for the appropriate value for this field.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def getIamPolicy(): GaxiosPromise[Schema$Policy] = js.native
  def getIamPolicy(callback: BodyResponseCallback[Schema$Policy]): Unit = js.native
  def getIamPolicy(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarHl7v2storesDollarGetiampolicy
  ): GaxiosPromise[Schema$Policy] = js.native
  def getIamPolicy(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarHl7v2storesDollarGetiampolicy,
    callback: BodyResponseCallback[Schema$Policy]
  ): Unit = js.native
  def getIamPolicy(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarHl7v2storesDollarGetiampolicy,
    options: BodyResponseCallback[Schema$Policy],
    callback: BodyResponseCallback[Schema$Policy]
  ): Unit = js.native
  def getIamPolicy(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarHl7v2storesDollarGetiampolicy,
    options: MethodOptions
  ): GaxiosPromise[Schema$Policy] = js.native
  def getIamPolicy(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarHl7v2storesDollarGetiampolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Policy]
  ): Unit = js.native
  /**
    * healthcare.projects.locations.datasets.hl7V2Stores.list
    * @desc Lists the HL7v2 stores in the given dataset.
    * @alias healthcare.projects.locations.datasets.hl7V2Stores.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer=} params.pageSize Limit on the number of HL7v2 stores to return in a single response. If zero the default page size of 100 is used.
    * @param {string=} params.pageToken The next_page_token value returned from the previous List request, if any.
    * @param {string} params.parent Name of the dataset.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$ListHl7V2StoresResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$ListHl7V2StoresResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarHl7v2storesDollarList): GaxiosPromise[Schema$ListHl7V2StoresResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarHl7v2storesDollarList,
    callback: BodyResponseCallback[Schema$ListHl7V2StoresResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarHl7v2storesDollarList,
    options: BodyResponseCallback[Schema$ListHl7V2StoresResponse],
    callback: BodyResponseCallback[Schema$ListHl7V2StoresResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarHl7v2storesDollarList,
    options: MethodOptions
  ): GaxiosPromise[Schema$ListHl7V2StoresResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarHl7v2storesDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ListHl7V2StoresResponse]
  ): Unit = js.native
  /**
    * healthcare.projects.locations.datasets.hl7V2Stores.patch
    * @desc Updates the HL7v2 store.
    * @alias healthcare.projects.locations.datasets.hl7V2Stores.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Output only. Resource name of the HL7v2 store, of the form `projects/{project_id}/datasets/{dataset_id}/hl7V2Stores/{hl7v2_store_id}`.
    * @param {string=} params.updateMask The update mask applies to the resource. For the `FieldMask` definition, see https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask
    * @param {().Hl7V2Store} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[Schema$Hl7V2Store] = js.native
  def patch(callback: BodyResponseCallback[Schema$Hl7V2Store]): Unit = js.native
  def patch(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarHl7v2storesDollarPatch
  ): GaxiosPromise[Schema$Hl7V2Store] = js.native
  def patch(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarHl7v2storesDollarPatch,
    callback: BodyResponseCallback[Schema$Hl7V2Store]
  ): Unit = js.native
  def patch(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarHl7v2storesDollarPatch,
    options: BodyResponseCallback[Schema$Hl7V2Store],
    callback: BodyResponseCallback[Schema$Hl7V2Store]
  ): Unit = js.native
  def patch(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarHl7v2storesDollarPatch,
    options: MethodOptions
  ): GaxiosPromise[Schema$Hl7V2Store] = js.native
  def patch(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarHl7v2storesDollarPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Hl7V2Store]
  ): Unit = js.native
  /**
    * healthcare.projects.locations.datasets.hl7V2Stores.setIamPolicy
    * @desc Sets the access control policy on the specified resource. Replaces
    * any existing policy.
    * @alias healthcare.projects.locations.datasets.hl7V2Stores.setIamPolicy
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
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarHl7v2storesDollarSetiampolicy
  ): GaxiosPromise[Schema$Policy] = js.native
  def setIamPolicy(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarHl7v2storesDollarSetiampolicy,
    callback: BodyResponseCallback[Schema$Policy]
  ): Unit = js.native
  def setIamPolicy(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarHl7v2storesDollarSetiampolicy,
    options: BodyResponseCallback[Schema$Policy],
    callback: BodyResponseCallback[Schema$Policy]
  ): Unit = js.native
  def setIamPolicy(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarHl7v2storesDollarSetiampolicy,
    options: MethodOptions
  ): GaxiosPromise[Schema$Policy] = js.native
  def setIamPolicy(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarHl7v2storesDollarSetiampolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Policy]
  ): Unit = js.native
  /**
    * healthcare.projects.locations.datasets.hl7V2Stores.testIamPermissions
    * @desc Returns permissions that a caller has on the specified resource. If
    * the resource does not exist, this will return an empty set of
    * permissions, not a NOT_FOUND error.  Note: This operation is designed to
    * be used for building permission-aware UIs and command-line tools, not for
    * authorization checking. This operation may "fail open" without warning.
    * @alias
    * healthcare.projects.locations.datasets.hl7V2Stores.testIamPermissions
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
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarHl7v2storesDollarTestiampermissions
  ): GaxiosPromise[Schema$TestIamPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarHl7v2storesDollarTestiampermissions,
    callback: BodyResponseCallback[Schema$TestIamPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarHl7v2storesDollarTestiampermissions,
    options: BodyResponseCallback[Schema$TestIamPermissionsResponse],
    callback: BodyResponseCallback[Schema$TestIamPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarHl7v2storesDollarTestiampermissions,
    options: MethodOptions
  ): GaxiosPromise[Schema$TestIamPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarHl7v2storesDollarTestiampermissions,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$TestIamPermissionsResponse]
  ): Unit = js.native
}

