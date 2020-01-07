package typings.googleapis.buildSrcApisHealthcareV1alpha2Mod.healthcare_v1alpha2

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/healthcare/v1alpha2", "healthcare_v1alpha2.Resource$Projects$Locations$Datasets$Fhirstores")
@js.native
class ResourceDollarProjectsDollarLocationsDollarDatasetsDollarFhirstores protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  var fhir: ResourceDollarProjectsDollarLocationsDollarDatasetsDollarFhirstoresDollarFhir = js.native
  var securityLabels: ResourceDollarProjectsDollarLocationsDollarDatasetsDollarFhirstoresDollarSecuritylabels = js.native
  /**
    * healthcare.projects.locations.datasets.fhirStores.create
    * @desc Creates a new FHIR store within the parent dataset.
    * @alias healthcare.projects.locations.datasets.fhirStores.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.fhirStoreId The ID of the FHIR store that is being created. The string must match the following regex: `[\p{L}\p{N}_\-\.]{1,256}`.
    * @param {string} params.parent The name of the dataset this FHIR store belongs to.
    * @param {().FhirStore} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[Schema$FhirStore] = js.native
  def create(callback: BodyResponseCallback[Schema$FhirStore]): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarFhirstoresDollarCreate
  ): GaxiosPromise[Schema$FhirStore] = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarFhirstoresDollarCreate,
    callback: BodyResponseCallback[Schema$FhirStore]
  ): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarFhirstoresDollarCreate,
    options: BodyResponseCallback[Schema$FhirStore],
    callback: BodyResponseCallback[Schema$FhirStore]
  ): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarFhirstoresDollarCreate,
    options: MethodOptions
  ): GaxiosPromise[Schema$FhirStore] = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarFhirstoresDollarCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$FhirStore]
  ): Unit = js.native
  /**
    * healthcare.projects.locations.datasets.fhirStores.delete
    * @desc Deletes the specified FHIR store and removes all resources within
    * it.
    * @alias healthcare.projects.locations.datasets.fhirStores.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The resource name of the FHIR store to delete.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Schema$Empty] = js.native
  def delete(callback: BodyResponseCallback[Schema$Empty]): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarFhirstoresDollarDelete
  ): GaxiosPromise[Schema$Empty] = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarFhirstoresDollarDelete,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarFhirstoresDollarDelete,
    options: BodyResponseCallback[Schema$Empty],
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarFhirstoresDollarDelete,
    options: MethodOptions
  ): GaxiosPromise[Schema$Empty] = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarFhirstoresDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  /**
    * healthcare.projects.locations.datasets.fhirStores.executeBundle
    * @desc Executes all the requests in the given Bundle.
    * @alias healthcare.projects.locations.datasets.fhirStores.executeBundle
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.parent Name of the FHIR store in which this bundle will be executed.
    * @param {().HttpBody} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def executeBundle(): GaxiosPromise[Schema$HttpBody] = js.native
  def executeBundle(callback: BodyResponseCallback[Schema$HttpBody]): Unit = js.native
  def executeBundle(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarFhirstoresDollarExecutebundle
  ): GaxiosPromise[Schema$HttpBody] = js.native
  def executeBundle(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarFhirstoresDollarExecutebundle,
    callback: BodyResponseCallback[Schema$HttpBody]
  ): Unit = js.native
  def executeBundle(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarFhirstoresDollarExecutebundle,
    options: BodyResponseCallback[Schema$HttpBody],
    callback: BodyResponseCallback[Schema$HttpBody]
  ): Unit = js.native
  def executeBundle(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarFhirstoresDollarExecutebundle,
    options: MethodOptions
  ): GaxiosPromise[Schema$HttpBody] = js.native
  def executeBundle(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarFhirstoresDollarExecutebundle,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$HttpBody]
  ): Unit = js.native
  /**
    * healthcare.projects.locations.datasets.fhirStores.export
    * @desc Export resources from the FHIR store to the specified destination.
    * This method returns an Operation that can be used to track the status of
    * the export by calling GetOperation.  Immediate fatal errors appear in the
    * error field. Otherwise, when the operation finishes, a detailed response
    * of type ExportResourcesResponse is returned in the response field. The
    * metadata field type for this operation is OperationMetadata.
    * @alias healthcare.projects.locations.datasets.fhirStores.export
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The name of the FHIR store to export resource from. The name should be in the format of `projects/{project_id}/locations/{location_id}/datasets/{dataset_id}/fhirStores/{fhir_store_id}`.
    * @param {().ExportResourcesRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def export(): GaxiosPromise[Schema$Operation] = js.native
  def export(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def export(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarFhirstoresDollarExport
  ): GaxiosPromise[Schema$Operation] = js.native
  def export(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarFhirstoresDollarExport,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def export(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarFhirstoresDollarExport,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def export(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarFhirstoresDollarExport,
    options: MethodOptions
  ): GaxiosPromise[Schema$Operation] = js.native
  def export(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarFhirstoresDollarExport,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  /**
    * healthcare.projects.locations.datasets.fhirStores.get
    * @desc Gets the configuration of the specified FHIR store.
    * @alias healthcare.projects.locations.datasets.fhirStores.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The resource name of the FHIR store to get.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$FhirStore] = js.native
  def get(callback: BodyResponseCallback[Schema$FhirStore]): Unit = js.native
  def get(params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarFhirstoresDollarGet): GaxiosPromise[Schema$FhirStore] = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarFhirstoresDollarGet,
    callback: BodyResponseCallback[Schema$FhirStore]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarFhirstoresDollarGet,
    options: BodyResponseCallback[Schema$FhirStore],
    callback: BodyResponseCallback[Schema$FhirStore]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarFhirstoresDollarGet,
    options: MethodOptions
  ): GaxiosPromise[Schema$FhirStore] = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarFhirstoresDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$FhirStore]
  ): Unit = js.native
  /**
    * healthcare.projects.locations.datasets.fhirStores.getIamPolicy
    * @desc Gets the access control policy for a FHIR store or security label
    * within a FHIR store. Returns NOT_FOUND error if the resource does not
    * exist. Returns an empty policy if the resource exists but does not have a
    * policy set.  Authorization requires the Google IAM permission
    * 'healthcare.fhirStores.getIamPolicy' for a FHIR store or
    * 'healthcare.securityLabels.getIamPolicy' for a security label
    * @alias healthcare.projects.locations.datasets.fhirStores.getIamPolicy
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
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarFhirstoresDollarGetiampolicy
  ): GaxiosPromise[Schema$Policy] = js.native
  def getIamPolicy(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarFhirstoresDollarGetiampolicy,
    callback: BodyResponseCallback[Schema$Policy]
  ): Unit = js.native
  def getIamPolicy(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarFhirstoresDollarGetiampolicy,
    options: BodyResponseCallback[Schema$Policy],
    callback: BodyResponseCallback[Schema$Policy]
  ): Unit = js.native
  def getIamPolicy(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarFhirstoresDollarGetiampolicy,
    options: MethodOptions
  ): GaxiosPromise[Schema$Policy] = js.native
  def getIamPolicy(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarFhirstoresDollarGetiampolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Policy]
  ): Unit = js.native
  /**
    * healthcare.projects.locations.datasets.fhirStores.getMetadata
    * @desc Gets the FHIR capability statement for the store, which contains a
    * description of functionality supported by the server.
    * @alias healthcare.projects.locations.datasets.fhirStores.getMetadata
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Name of the FHIR store to retrieve the capabilities for.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def getMetadata(): GaxiosPromise[Schema$HttpBody] = js.native
  def getMetadata(callback: BodyResponseCallback[Schema$HttpBody]): Unit = js.native
  def getMetadata(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarFhirstoresDollarGetmetadata
  ): GaxiosPromise[Schema$HttpBody] = js.native
  def getMetadata(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarFhirstoresDollarGetmetadata,
    callback: BodyResponseCallback[Schema$HttpBody]
  ): Unit = js.native
  def getMetadata(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarFhirstoresDollarGetmetadata,
    options: BodyResponseCallback[Schema$HttpBody],
    callback: BodyResponseCallback[Schema$HttpBody]
  ): Unit = js.native
  def getMetadata(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarFhirstoresDollarGetmetadata,
    options: MethodOptions
  ): GaxiosPromise[Schema$HttpBody] = js.native
  def getMetadata(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarFhirstoresDollarGetmetadata,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$HttpBody]
  ): Unit = js.native
  /**
    * healthcare.projects.locations.datasets.fhirStores.import
    * @desc Import resources to the FHIR store by loading data from the specified
    * sources. Each resource must have a client-supplied ID, which is retained by
    * the server.  The import operation is idempotent. Upon retry, the most recent
    * data (matching the client-supplied ID) is overwritten, without creating a new
    * resource version. If partial failures occur during the import, successful
    * changes are not rolled back.  If history imports are enabled
    * (enable_history_import is set in the FHIR store's configuration), you can
    * import historical versions of a resource by supplying a bundle of type
    * `history`. The historical versions in the bundle must have `lastUpdated`
    * timestamps. If a current or historical version with the supplied resource ID
    * already exists, the bundle is rejected.  This method returns an Operation
    * that can be used to track the status of the import by calling GetOperation.
    * Immediate fatal errors appear in the error field. Otherwise, when the
    * operation finishes, a detailed response of type ImportResourcesResponse is
    * returned in the response field. The metadata field type for this operation is
    * OperationMetadata.
    * @alias healthcare.projects.locations.datasets.fhirStores.import
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The name of the FHIR store to import FHIR resources to. The name should be in the format of `projects/{project_id}/locations/{location_id}/datasets/{dataset_id}/fhirStores/{fhir_store_id}`.
    * @param {().ImportResourcesRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def `import`(): GaxiosPromise[Schema$Operation] = js.native
  def `import`(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def `import`(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarFhirstoresDollarImport
  ): GaxiosPromise[Schema$Operation] = js.native
  def `import`(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarFhirstoresDollarImport,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def `import`(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarFhirstoresDollarImport,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def `import`(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarFhirstoresDollarImport,
    options: MethodOptions
  ): GaxiosPromise[Schema$Operation] = js.native
  def `import`(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarFhirstoresDollarImport,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  /**
    * healthcare.projects.locations.datasets.fhirStores.list
    * @desc Lists the FHIR stores in the given dataset.
    * @alias healthcare.projects.locations.datasets.fhirStores.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.filter Restricts stores returned to those matching a filter. Syntax: https://cloud.google.com/appengine/docs/standard/python/search/query_strings Only filtering on labels is supported, for example `labels.key=value`.
    * @param {integer=} params.pageSize Limit on the number of FHIR stores to return in a single response.  If zero the default page size of 100 is used.
    * @param {string=} params.pageToken The next_page_token value returned from the previous List request, if any.
    * @param {string} params.parent Name of the dataset.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$ListFhirStoresResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$ListFhirStoresResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarFhirstoresDollarList): GaxiosPromise[Schema$ListFhirStoresResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarFhirstoresDollarList,
    callback: BodyResponseCallback[Schema$ListFhirStoresResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarFhirstoresDollarList,
    options: BodyResponseCallback[Schema$ListFhirStoresResponse],
    callback: BodyResponseCallback[Schema$ListFhirStoresResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarFhirstoresDollarList,
    options: MethodOptions
  ): GaxiosPromise[Schema$ListFhirStoresResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarFhirstoresDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ListFhirStoresResponse]
  ): Unit = js.native
  /**
    * healthcare.projects.locations.datasets.fhirStores.patch
    * @desc Updates the configuration of the specified FHIR store.
    * @alias healthcare.projects.locations.datasets.fhirStores.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Output only. Resource name of the FHIR store, of the form `projects/{project_id}/datasets/{dataset_id}/fhirStores/{fhir_store_id}`.
    * @param {string=} params.updateMask The update mask applies to the resource. For the `FieldMask` definition, see https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask
    * @param {().FhirStore} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[Schema$FhirStore] = js.native
  def patch(callback: BodyResponseCallback[Schema$FhirStore]): Unit = js.native
  def patch(params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarFhirstoresDollarPatch): GaxiosPromise[Schema$FhirStore] = js.native
  def patch(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarFhirstoresDollarPatch,
    callback: BodyResponseCallback[Schema$FhirStore]
  ): Unit = js.native
  def patch(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarFhirstoresDollarPatch,
    options: BodyResponseCallback[Schema$FhirStore],
    callback: BodyResponseCallback[Schema$FhirStore]
  ): Unit = js.native
  def patch(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarFhirstoresDollarPatch,
    options: MethodOptions
  ): GaxiosPromise[Schema$FhirStore] = js.native
  def patch(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarFhirstoresDollarPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$FhirStore]
  ): Unit = js.native
  /**
    * healthcare.projects.locations.datasets.fhirStores.setIamPolicy
    * @desc Sets the access control policy for a FHIR store or security label
    * within a FHIR store. Replaces any existing policy.  Authorization
    * requires the Google IAM permission 'healthcare.fhirStores.setIamPolicy'
    * for a FHIR store or 'healthcare.securityLabels.setIamPolicy' for a
    * security label
    * @alias healthcare.projects.locations.datasets.fhirStores.setIamPolicy
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
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarFhirstoresDollarSetiampolicy
  ): GaxiosPromise[Schema$Policy] = js.native
  def setIamPolicy(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarFhirstoresDollarSetiampolicy,
    callback: BodyResponseCallback[Schema$Policy]
  ): Unit = js.native
  def setIamPolicy(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarFhirstoresDollarSetiampolicy,
    options: BodyResponseCallback[Schema$Policy],
    callback: BodyResponseCallback[Schema$Policy]
  ): Unit = js.native
  def setIamPolicy(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarFhirstoresDollarSetiampolicy,
    options: MethodOptions
  ): GaxiosPromise[Schema$Policy] = js.native
  def setIamPolicy(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarFhirstoresDollarSetiampolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Policy]
  ): Unit = js.native
  /**
    * healthcare.projects.locations.datasets.fhirStores.testIamPermissions
    * @desc Returns permissions that a caller has on the specified resource. If
    * the resource does not exist, this will return an empty set of
    * permissions, not a NOT_FOUND error.  There is no permission required to
    * make this API call.
    * @alias
    * healthcare.projects.locations.datasets.fhirStores.testIamPermissions
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
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarFhirstoresDollarTestiampermissions
  ): GaxiosPromise[Schema$TestIamPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarFhirstoresDollarTestiampermissions,
    callback: BodyResponseCallback[Schema$TestIamPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarFhirstoresDollarTestiampermissions,
    options: BodyResponseCallback[Schema$TestIamPermissionsResponse],
    callback: BodyResponseCallback[Schema$TestIamPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarFhirstoresDollarTestiampermissions,
    options: MethodOptions
  ): GaxiosPromise[Schema$TestIamPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarFhirstoresDollarTestiampermissions,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$TestIamPermissionsResponse]
  ): Unit = js.native
}

