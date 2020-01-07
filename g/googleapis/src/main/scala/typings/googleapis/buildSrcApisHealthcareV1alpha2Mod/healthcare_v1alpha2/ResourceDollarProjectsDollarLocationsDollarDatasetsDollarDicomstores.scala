package typings.googleapis.buildSrcApisHealthcareV1alpha2Mod.healthcare_v1alpha2

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/healthcare/v1alpha2", "healthcare_v1alpha2.Resource$Projects$Locations$Datasets$Dicomstores")
@js.native
class ResourceDollarProjectsDollarLocationsDollarDatasetsDollarDicomstores protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  var dicomWeb: ResourceDollarProjectsDollarLocationsDollarDatasetsDollarDicomstoresDollarDicomweb = js.native
  /**
    * healthcare.projects.locations.datasets.dicomStores.create
    * @desc Creates a new DICOM store within the parent dataset.
    * @alias healthcare.projects.locations.datasets.dicomStores.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.dicomStoreId The ID of the DICOM store that is being created. Any string value up to 256 characters in length.
    * @param {string} params.parent The name of the dataset this DICOM store belongs to.
    * @param {().DicomStore} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[Schema$DicomStore] = js.native
  def create(callback: BodyResponseCallback[Schema$DicomStore]): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarDicomstoresDollarCreate
  ): GaxiosPromise[Schema$DicomStore] = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarDicomstoresDollarCreate,
    callback: BodyResponseCallback[Schema$DicomStore]
  ): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarDicomstoresDollarCreate,
    options: BodyResponseCallback[Schema$DicomStore],
    callback: BodyResponseCallback[Schema$DicomStore]
  ): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarDicomstoresDollarCreate,
    options: MethodOptions
  ): GaxiosPromise[Schema$DicomStore] = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarDicomstoresDollarCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$DicomStore]
  ): Unit = js.native
  /**
    * healthcare.projects.locations.datasets.dicomStores.delete
    * @desc Deletes the specified DICOM store and removes all images that are
    * contained within it.
    * @alias healthcare.projects.locations.datasets.dicomStores.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The resource name of the DICOM store to delete.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Schema$Empty] = js.native
  def delete(callback: BodyResponseCallback[Schema$Empty]): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarDicomstoresDollarDelete
  ): GaxiosPromise[Schema$Empty] = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarDicomstoresDollarDelete,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarDicomstoresDollarDelete,
    options: BodyResponseCallback[Schema$Empty],
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarDicomstoresDollarDelete,
    options: MethodOptions
  ): GaxiosPromise[Schema$Empty] = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarDicomstoresDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  /**
    * healthcare.projects.locations.datasets.dicomStores.export
    * @desc Exports data to the specified destination by copying it from the
    * DICOM store. The metadata field type is OperationMetadata.
    * @alias healthcare.projects.locations.datasets.dicomStores.export
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The DICOM store resource name from which the data should be exported (e.g., `projects/{project_id}/locations/{location_id}/datasets/{dataset_id}/dicomStores/{dicom_store_id}`).
    * @param {().ExportDicomDataRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def export(): GaxiosPromise[Schema$Operation] = js.native
  def export(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def export(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarDicomstoresDollarExport
  ): GaxiosPromise[Schema$Operation] = js.native
  def export(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarDicomstoresDollarExport,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def export(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarDicomstoresDollarExport,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def export(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarDicomstoresDollarExport,
    options: MethodOptions
  ): GaxiosPromise[Schema$Operation] = js.native
  def export(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarDicomstoresDollarExport,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  /**
    * healthcare.projects.locations.datasets.dicomStores.get
    * @desc Gets the specified DICOM store.
    * @alias healthcare.projects.locations.datasets.dicomStores.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The resource name of the DICOM store to get.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$DicomStore] = js.native
  def get(callback: BodyResponseCallback[Schema$DicomStore]): Unit = js.native
  def get(params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarDicomstoresDollarGet): GaxiosPromise[Schema$DicomStore] = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarDicomstoresDollarGet,
    callback: BodyResponseCallback[Schema$DicomStore]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarDicomstoresDollarGet,
    options: BodyResponseCallback[Schema$DicomStore],
    callback: BodyResponseCallback[Schema$DicomStore]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarDicomstoresDollarGet,
    options: MethodOptions
  ): GaxiosPromise[Schema$DicomStore] = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarDicomstoresDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$DicomStore]
  ): Unit = js.native
  /**
    * healthcare.projects.locations.datasets.dicomStores.getIamPolicy
    * @desc Gets the access control policy for a resource. Returns an empty
    * policy if the resource exists and does not have a policy set.
    * @alias healthcare.projects.locations.datasets.dicomStores.getIamPolicy
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
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarDicomstoresDollarGetiampolicy
  ): GaxiosPromise[Schema$Policy] = js.native
  def getIamPolicy(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarDicomstoresDollarGetiampolicy,
    callback: BodyResponseCallback[Schema$Policy]
  ): Unit = js.native
  def getIamPolicy(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarDicomstoresDollarGetiampolicy,
    options: BodyResponseCallback[Schema$Policy],
    callback: BodyResponseCallback[Schema$Policy]
  ): Unit = js.native
  def getIamPolicy(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarDicomstoresDollarGetiampolicy,
    options: MethodOptions
  ): GaxiosPromise[Schema$Policy] = js.native
  def getIamPolicy(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarDicomstoresDollarGetiampolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Policy]
  ): Unit = js.native
  /**
    * healthcare.projects.locations.datasets.dicomStores.import
    * @desc Imports data into the DICOM store by copying it from the specified
    * source. For errors, the Operation will be populated with error details (in
    * the form of ImportDicomDataErrorDetails in error.details), which will hold
    * finer-grained error information. The metadata field type is
    * OperationMetadata.
    * @alias healthcare.projects.locations.datasets.dicomStores.import
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The name of the DICOM store resource into which the data is imported (e.g., `projects/{project_id}/locations/{location_id}/datasets/{dataset_id}/dicomStores/{dicom_store_id}`).
    * @param {().ImportDicomDataRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def `import`(): GaxiosPromise[Schema$Operation] = js.native
  def `import`(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def `import`(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarDicomstoresDollarImport
  ): GaxiosPromise[Schema$Operation] = js.native
  def `import`(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarDicomstoresDollarImport,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def `import`(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarDicomstoresDollarImport,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def `import`(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarDicomstoresDollarImport,
    options: MethodOptions
  ): GaxiosPromise[Schema$Operation] = js.native
  def `import`(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarDicomstoresDollarImport,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  /**
    * healthcare.projects.locations.datasets.dicomStores.list
    * @desc Lists the DICOM stores in the given dataset.
    * @alias healthcare.projects.locations.datasets.dicomStores.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.filter Restricts stores returned to those matching a filter. Syntax: https://cloud.google.com/appengine/docs/standard/python/search/query_strings Only filtering on labels is supported, for example `labels.key=value`.
    * @param {integer=} params.pageSize Limit on the number of DICOM stores to return in a single response. If zero the default page size of 100 is used.
    * @param {string=} params.pageToken The next_page_token value returned from the previous List request, if any.
    * @param {string} params.parent Name of the dataset.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$ListDicomStoresResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$ListDicomStoresResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarDicomstoresDollarList): GaxiosPromise[Schema$ListDicomStoresResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarDicomstoresDollarList,
    callback: BodyResponseCallback[Schema$ListDicomStoresResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarDicomstoresDollarList,
    options: BodyResponseCallback[Schema$ListDicomStoresResponse],
    callback: BodyResponseCallback[Schema$ListDicomStoresResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarDicomstoresDollarList,
    options: MethodOptions
  ): GaxiosPromise[Schema$ListDicomStoresResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarDicomstoresDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ListDicomStoresResponse]
  ): Unit = js.native
  /**
    * healthcare.projects.locations.datasets.dicomStores.patch
    * @desc Updates the specified DICOM store.
    * @alias healthcare.projects.locations.datasets.dicomStores.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Output only. Resource name of the DICOM store, of the form `projects/{project_id}/locations/{location_id}/datasets/{dataset_id}/dicomStores/{dicom_store_id}`.
    * @param {string=} params.updateMask The update mask applies to the resource. For the `FieldMask` definition, see https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask
    * @param {().DicomStore} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[Schema$DicomStore] = js.native
  def patch(callback: BodyResponseCallback[Schema$DicomStore]): Unit = js.native
  def patch(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarDicomstoresDollarPatch
  ): GaxiosPromise[Schema$DicomStore] = js.native
  def patch(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarDicomstoresDollarPatch,
    callback: BodyResponseCallback[Schema$DicomStore]
  ): Unit = js.native
  def patch(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarDicomstoresDollarPatch,
    options: BodyResponseCallback[Schema$DicomStore],
    callback: BodyResponseCallback[Schema$DicomStore]
  ): Unit = js.native
  def patch(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarDicomstoresDollarPatch,
    options: MethodOptions
  ): GaxiosPromise[Schema$DicomStore] = js.native
  def patch(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarDicomstoresDollarPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$DicomStore]
  ): Unit = js.native
  /**
    * healthcare.projects.locations.datasets.dicomStores.setIamPolicy
    * @desc Sets the access control policy on the specified resource. Replaces
    * any existing policy.
    * @alias healthcare.projects.locations.datasets.dicomStores.setIamPolicy
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
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarDicomstoresDollarSetiampolicy
  ): GaxiosPromise[Schema$Policy] = js.native
  def setIamPolicy(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarDicomstoresDollarSetiampolicy,
    callback: BodyResponseCallback[Schema$Policy]
  ): Unit = js.native
  def setIamPolicy(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarDicomstoresDollarSetiampolicy,
    options: BodyResponseCallback[Schema$Policy],
    callback: BodyResponseCallback[Schema$Policy]
  ): Unit = js.native
  def setIamPolicy(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarDicomstoresDollarSetiampolicy,
    options: MethodOptions
  ): GaxiosPromise[Schema$Policy] = js.native
  def setIamPolicy(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarDicomstoresDollarSetiampolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Policy]
  ): Unit = js.native
  /**
    * healthcare.projects.locations.datasets.dicomStores.testIamPermissions
    * @desc Returns permissions that a caller has on the specified resource. If
    * the resource does not exist, this will return an empty set of
    * permissions, not a NOT_FOUND error.  Note: This operation is designed to
    * be used for building permission-aware UIs and command-line tools, not for
    * authorization checking. This operation may "fail open" without warning.
    * @alias
    * healthcare.projects.locations.datasets.dicomStores.testIamPermissions
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
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarDicomstoresDollarTestiampermissions
  ): GaxiosPromise[Schema$TestIamPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarDicomstoresDollarTestiampermissions,
    callback: BodyResponseCallback[Schema$TestIamPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarDicomstoresDollarTestiampermissions,
    options: BodyResponseCallback[Schema$TestIamPermissionsResponse],
    callback: BodyResponseCallback[Schema$TestIamPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarDicomstoresDollarTestiampermissions,
    options: MethodOptions
  ): GaxiosPromise[Schema$TestIamPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarDicomstoresDollarTestiampermissions,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$TestIamPermissionsResponse]
  ): Unit = js.native
}

