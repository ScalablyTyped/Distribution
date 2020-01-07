package typings.googleapis.buildSrcApisHealthcareV1alphaMod.healthcare_v1alpha

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/healthcare/v1alpha", "healthcare_v1alpha.Resource$Projects$Locations$Datasets")
@js.native
class ResourceDollarProjectsDollarLocationsDollarDatasets protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var annotationStores: ResourceDollarProjectsDollarLocationsDollarDatasetsDollarAnnotationstores = js.native
  var context: APIRequestContext = js.native
  var dicomStores: ResourceDollarProjectsDollarLocationsDollarDatasetsDollarDicomstores = js.native
  var fhirStores: ResourceDollarProjectsDollarLocationsDollarDatasetsDollarFhirstores = js.native
  var hl7V2Stores: ResourceDollarProjectsDollarLocationsDollarDatasetsDollarHl7v2stores = js.native
  var operations: ResourceDollarProjectsDollarLocationsDollarDatasetsDollarOperations = js.native
  /**
    * healthcare.projects.locations.datasets.create
    * @desc Creates a new health dataset.
    * @alias healthcare.projects.locations.datasets.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.datasetId The ID of the dataset that is being created. The string must match the following regex: `[\p{L}\p{N}_\-\.]{1,256}`.
    * @param {string} params.parent The name of the project in which the dataset should be created (e.g., `projects/{project_id}/locations/{location_id}`).
    * @param {().Dataset} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[Schema$Dataset] = js.native
  def create(callback: BodyResponseCallback[Schema$Dataset]): Unit = js.native
  def create(params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarCreate): GaxiosPromise[Schema$Dataset] = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarCreate,
    callback: BodyResponseCallback[Schema$Dataset]
  ): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarCreate,
    options: BodyResponseCallback[Schema$Dataset],
    callback: BodyResponseCallback[Schema$Dataset]
  ): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarCreate,
    options: MethodOptions
  ): GaxiosPromise[Schema$Dataset] = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Dataset]
  ): Unit = js.native
  /**
    * healthcare.projects.locations.datasets.deidentify
    * @desc Creates a new dataset containing de-identified data from the source
    * dataset. The metadata field type is OperationMetadata. If the request is
    * successful, the response field type is DeidentifySummary. If errors
    * occur, details field type is DeidentifyErrorDetails.
    * @alias healthcare.projects.locations.datasets.deidentify
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.sourceDataset Source dataset resource name. (e.g., `projects/{project_id}/locations/{location_id}/datasets/{dataset_id}`).
    * @param {().DeidentifyDatasetRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def deidentify(): GaxiosPromise[Schema$Operation] = js.native
  def deidentify(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def deidentify(params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarDeidentify): GaxiosPromise[Schema$Operation] = js.native
  def deidentify(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarDeidentify,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def deidentify(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarDeidentify,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def deidentify(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarDeidentify,
    options: MethodOptions
  ): GaxiosPromise[Schema$Operation] = js.native
  def deidentify(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarDeidentify,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  /**
    * healthcare.projects.locations.datasets.delete
    * @desc Deletes the specified health dataset and all data contained in the
    * dataset. Deleting a dataset does not affect the sources from which the
    * dataset was imported (if any).
    * @alias healthcare.projects.locations.datasets.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The name of the dataset to delete (e.g., `projects/{project_id}/locations/{location_id}/datasets/{dataset_id}`).
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Schema$Empty] = js.native
  def delete(callback: BodyResponseCallback[Schema$Empty]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarDelete): GaxiosPromise[Schema$Empty] = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarDelete,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarDelete,
    options: BodyResponseCallback[Schema$Empty],
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarDelete,
    options: MethodOptions
  ): GaxiosPromise[Schema$Empty] = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  /**
    * healthcare.projects.locations.datasets.get
    * @desc Gets any metadata associated with a dataset.
    * @alias healthcare.projects.locations.datasets.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The name of the dataset to read (e.g., `projects/{project_id}/locations/{location_id}/datasets/{dataset_id}`).
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$Dataset] = js.native
  def get(callback: BodyResponseCallback[Schema$Dataset]): Unit = js.native
  def get(params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarGet): GaxiosPromise[Schema$Dataset] = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarGet,
    callback: BodyResponseCallback[Schema$Dataset]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarGet,
    options: BodyResponseCallback[Schema$Dataset],
    callback: BodyResponseCallback[Schema$Dataset]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarGet,
    options: MethodOptions
  ): GaxiosPromise[Schema$Dataset] = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Dataset]
  ): Unit = js.native
  /**
    * healthcare.projects.locations.datasets.getIamPolicy
    * @desc Gets the access control policy for a resource. Returns an empty
    * policy if the resource exists and does not have a policy set.
    * @alias healthcare.projects.locations.datasets.getIamPolicy
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
  def getIamPolicy(params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarGetiampolicy): GaxiosPromise[Schema$Policy] = js.native
  def getIamPolicy(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarGetiampolicy,
    callback: BodyResponseCallback[Schema$Policy]
  ): Unit = js.native
  def getIamPolicy(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarGetiampolicy,
    options: BodyResponseCallback[Schema$Policy],
    callback: BodyResponseCallback[Schema$Policy]
  ): Unit = js.native
  def getIamPolicy(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarGetiampolicy,
    options: MethodOptions
  ): GaxiosPromise[Schema$Policy] = js.native
  def getIamPolicy(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarGetiampolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Policy]
  ): Unit = js.native
  /**
    * healthcare.projects.locations.datasets.list
    * @desc Lists the health datasets in the current project.
    * @alias healthcare.projects.locations.datasets.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer=} params.pageSize The maximum number of items to return. Capped to 100 if not specified. May not be larger than 1000.
    * @param {string=} params.pageToken The next_page_token value returned from a previous List request, if any.
    * @param {string} params.parent The name of the project whose datasets should be listed (e.g., `projects/{project_id}/locations/{location_id}`).
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$ListDatasetsResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$ListDatasetsResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarList): GaxiosPromise[Schema$ListDatasetsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarList,
    callback: BodyResponseCallback[Schema$ListDatasetsResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarList,
    options: BodyResponseCallback[Schema$ListDatasetsResponse],
    callback: BodyResponseCallback[Schema$ListDatasetsResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarList,
    options: MethodOptions
  ): GaxiosPromise[Schema$ListDatasetsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ListDatasetsResponse]
  ): Unit = js.native
  /**
    * healthcare.projects.locations.datasets.patch
    * @desc Updates dataset metadata.
    * @alias healthcare.projects.locations.datasets.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Output only. Resource name of the dataset, of the form `projects/{project_id}/locations/{location_id}/datasets/{dataset_id}`.
    * @param {string=} params.updateMask The update mask applies to the resource. For the `FieldMask` definition, see https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask
    * @param {().Dataset} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[Schema$Dataset] = js.native
  def patch(callback: BodyResponseCallback[Schema$Dataset]): Unit = js.native
  def patch(params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarPatch): GaxiosPromise[Schema$Dataset] = js.native
  def patch(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarPatch,
    callback: BodyResponseCallback[Schema$Dataset]
  ): Unit = js.native
  def patch(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarPatch,
    options: BodyResponseCallback[Schema$Dataset],
    callback: BodyResponseCallback[Schema$Dataset]
  ): Unit = js.native
  def patch(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarPatch,
    options: MethodOptions
  ): GaxiosPromise[Schema$Dataset] = js.native
  def patch(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Dataset]
  ): Unit = js.native
  /**
    * healthcare.projects.locations.datasets.setIamPolicy
    * @desc Sets the access control policy on the specified resource. Replaces
    * any existing policy.
    * @alias healthcare.projects.locations.datasets.setIamPolicy
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
  def setIamPolicy(params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarSetiampolicy): GaxiosPromise[Schema$Policy] = js.native
  def setIamPolicy(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarSetiampolicy,
    callback: BodyResponseCallback[Schema$Policy]
  ): Unit = js.native
  def setIamPolicy(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarSetiampolicy,
    options: BodyResponseCallback[Schema$Policy],
    callback: BodyResponseCallback[Schema$Policy]
  ): Unit = js.native
  def setIamPolicy(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarSetiampolicy,
    options: MethodOptions
  ): GaxiosPromise[Schema$Policy] = js.native
  def setIamPolicy(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarSetiampolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Policy]
  ): Unit = js.native
  /**
    * healthcare.projects.locations.datasets.testIamPermissions
    * @desc Returns permissions that a caller has on the specified resource. If
    * the resource does not exist, this will return an empty set of
    * permissions, not a NOT_FOUND error.  Note: This operation is designed to
    * be used for building permission-aware UIs and command-line tools, not for
    * authorization checking. This operation may "fail open" without warning.
    * @alias healthcare.projects.locations.datasets.testIamPermissions
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
  def testIamPermissions(params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarTestiampermissions): GaxiosPromise[Schema$TestIamPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarTestiampermissions,
    callback: BodyResponseCallback[Schema$TestIamPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarTestiampermissions,
    options: BodyResponseCallback[Schema$TestIamPermissionsResponse],
    callback: BodyResponseCallback[Schema$TestIamPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarTestiampermissions,
    options: MethodOptions
  ): GaxiosPromise[Schema$TestIamPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarTestiampermissions,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$TestIamPermissionsResponse]
  ): Unit = js.native
}

