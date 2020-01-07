package typings.googleapis.buildSrcApisContaineranalysisV1beta1Mod.containeranalysis_v1beta1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/containeranalysis/v1beta1", "containeranalysis_v1beta1.Resource$Projects$Occurrences")
@js.native
class ResourceDollarProjectsDollarOccurrences protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * containeranalysis.projects.occurrences.batchCreate
    * @desc Creates new occurrences in batch.
    * @alias containeranalysis.projects.occurrences.batchCreate
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.parent The name of the project in the form of `projects/[PROJECT_ID]`, under which the occurrences are to be created.
    * @param {().BatchCreateOccurrencesRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def batchCreate(): GaxiosPromise[Schema$BatchCreateOccurrencesResponse] = js.native
  def batchCreate(callback: BodyResponseCallback[Schema$BatchCreateOccurrencesResponse]): Unit = js.native
  def batchCreate(params: ParamsDollarResourceDollarProjectsDollarOccurrencesDollarBatchcreate): GaxiosPromise[Schema$BatchCreateOccurrencesResponse] = js.native
  def batchCreate(
    params: ParamsDollarResourceDollarProjectsDollarOccurrencesDollarBatchcreate,
    callback: BodyResponseCallback[Schema$BatchCreateOccurrencesResponse]
  ): Unit = js.native
  def batchCreate(
    params: ParamsDollarResourceDollarProjectsDollarOccurrencesDollarBatchcreate,
    options: BodyResponseCallback[Schema$BatchCreateOccurrencesResponse],
    callback: BodyResponseCallback[Schema$BatchCreateOccurrencesResponse]
  ): Unit = js.native
  def batchCreate(
    params: ParamsDollarResourceDollarProjectsDollarOccurrencesDollarBatchcreate,
    options: MethodOptions
  ): GaxiosPromise[Schema$BatchCreateOccurrencesResponse] = js.native
  def batchCreate(
    params: ParamsDollarResourceDollarProjectsDollarOccurrencesDollarBatchcreate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$BatchCreateOccurrencesResponse]
  ): Unit = js.native
  /**
    * containeranalysis.projects.occurrences.create
    * @desc Creates a new occurrence.
    * @alias containeranalysis.projects.occurrences.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.parent The name of the project in the form of `projects/[PROJECT_ID]`, under which the occurrence is to be created.
    * @param {().Occurrence} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[Schema$Occurrence] = js.native
  def create(callback: BodyResponseCallback[Schema$Occurrence]): Unit = js.native
  def create(params: ParamsDollarResourceDollarProjectsDollarOccurrencesDollarCreate): GaxiosPromise[Schema$Occurrence] = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarOccurrencesDollarCreate,
    callback: BodyResponseCallback[Schema$Occurrence]
  ): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarOccurrencesDollarCreate,
    options: BodyResponseCallback[Schema$Occurrence],
    callback: BodyResponseCallback[Schema$Occurrence]
  ): Unit = js.native
  def create(params: ParamsDollarResourceDollarProjectsDollarOccurrencesDollarCreate, options: MethodOptions): GaxiosPromise[Schema$Occurrence] = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarOccurrencesDollarCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Occurrence]
  ): Unit = js.native
  /**
    * containeranalysis.projects.occurrences.delete
    * @desc Deletes the specified occurrence. For example, use this method to
    * delete an occurrence when the occurrence is no longer applicable for the
    * given resource.
    * @alias containeranalysis.projects.occurrences.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The name of the occurrence in the form of `projects/[PROJECT_ID]/occurrences/[OCCURRENCE_ID]`.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Schema$Empty] = js.native
  def delete(callback: BodyResponseCallback[Schema$Empty]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarProjectsDollarOccurrencesDollarDelete): GaxiosPromise[Schema$Empty] = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarOccurrencesDollarDelete,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarOccurrencesDollarDelete,
    options: BodyResponseCallback[Schema$Empty],
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def delete(params: ParamsDollarResourceDollarProjectsDollarOccurrencesDollarDelete, options: MethodOptions): GaxiosPromise[Schema$Empty] = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarOccurrencesDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  /**
    * containeranalysis.projects.occurrences.get
    * @desc Gets the specified occurrence.
    * @alias containeranalysis.projects.occurrences.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The name of the occurrence in the form of `projects/[PROJECT_ID]/occurrences/[OCCURRENCE_ID]`.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$Occurrence] = js.native
  def get(callback: BodyResponseCallback[Schema$Occurrence]): Unit = js.native
  def get(params: ParamsDollarResourceDollarProjectsDollarOccurrencesDollarGet): GaxiosPromise[Schema$Occurrence] = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarOccurrencesDollarGet,
    callback: BodyResponseCallback[Schema$Occurrence]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarOccurrencesDollarGet,
    options: BodyResponseCallback[Schema$Occurrence],
    callback: BodyResponseCallback[Schema$Occurrence]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarProjectsDollarOccurrencesDollarGet, options: MethodOptions): GaxiosPromise[Schema$Occurrence] = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarOccurrencesDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Occurrence]
  ): Unit = js.native
  /**
    * containeranalysis.projects.occurrences.getIamPolicy
    * @desc Gets the access control policy for a note or an occurrence
    * resource. Requires `containeranalysis.notes.setIamPolicy` or
    * `containeranalysis.occurrences.setIamPolicy` permission if the resource
    * is a note or occurrence, respectively.  The resource takes the format
    * `projects/[PROJECT_ID]/notes/[NOTE_ID]` for notes and
    * `projects/[PROJECT_ID]/occurrences/[OCCURRENCE_ID]` for occurrences.
    * @alias containeranalysis.projects.occurrences.getIamPolicy
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
  def getIamPolicy(params: ParamsDollarResourceDollarProjectsDollarOccurrencesDollarGetiampolicy): GaxiosPromise[Schema$Policy] = js.native
  def getIamPolicy(
    params: ParamsDollarResourceDollarProjectsDollarOccurrencesDollarGetiampolicy,
    callback: BodyResponseCallback[Schema$Policy]
  ): Unit = js.native
  def getIamPolicy(
    params: ParamsDollarResourceDollarProjectsDollarOccurrencesDollarGetiampolicy,
    options: BodyResponseCallback[Schema$Policy],
    callback: BodyResponseCallback[Schema$Policy]
  ): Unit = js.native
  def getIamPolicy(
    params: ParamsDollarResourceDollarProjectsDollarOccurrencesDollarGetiampolicy,
    options: MethodOptions
  ): GaxiosPromise[Schema$Policy] = js.native
  def getIamPolicy(
    params: ParamsDollarResourceDollarProjectsDollarOccurrencesDollarGetiampolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Policy]
  ): Unit = js.native
  /**
    * containeranalysis.projects.occurrences.getNotes
    * @desc Gets the note attached to the specified occurrence. Consumer
    * projects can use this method to get a note that belongs to a provider
    * project.
    * @alias containeranalysis.projects.occurrences.getNotes
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The name of the occurrence in the form of `projects/[PROJECT_ID]/occurrences/[OCCURRENCE_ID]`.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def getNotes(): GaxiosPromise[Schema$Note] = js.native
  def getNotes(callback: BodyResponseCallback[Schema$Note]): Unit = js.native
  def getNotes(params: ParamsDollarResourceDollarProjectsDollarOccurrencesDollarGetnotes): GaxiosPromise[Schema$Note] = js.native
  def getNotes(
    params: ParamsDollarResourceDollarProjectsDollarOccurrencesDollarGetnotes,
    callback: BodyResponseCallback[Schema$Note]
  ): Unit = js.native
  def getNotes(
    params: ParamsDollarResourceDollarProjectsDollarOccurrencesDollarGetnotes,
    options: BodyResponseCallback[Schema$Note],
    callback: BodyResponseCallback[Schema$Note]
  ): Unit = js.native
  def getNotes(params: ParamsDollarResourceDollarProjectsDollarOccurrencesDollarGetnotes, options: MethodOptions): GaxiosPromise[Schema$Note] = js.native
  def getNotes(
    params: ParamsDollarResourceDollarProjectsDollarOccurrencesDollarGetnotes,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Note]
  ): Unit = js.native
  /**
    * containeranalysis.projects.occurrences.getVulnerabilitySummary
    * @desc Gets a summary of the number and severity of occurrences.
    * @alias containeranalysis.projects.occurrences.getVulnerabilitySummary
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.filter The filter expression.
    * @param {string} params.parent The name of the project to get a vulnerability summary for in the form of `projects/[PROJECT_ID]`.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def getVulnerabilitySummary(): GaxiosPromise[Schema$VulnerabilityOccurrencesSummary] = js.native
  def getVulnerabilitySummary(callback: BodyResponseCallback[Schema$VulnerabilityOccurrencesSummary]): Unit = js.native
  def getVulnerabilitySummary(params: ParamsDollarResourceDollarProjectsDollarOccurrencesDollarGetvulnerabilitysummary): GaxiosPromise[Schema$VulnerabilityOccurrencesSummary] = js.native
  def getVulnerabilitySummary(
    params: ParamsDollarResourceDollarProjectsDollarOccurrencesDollarGetvulnerabilitysummary,
    callback: BodyResponseCallback[Schema$VulnerabilityOccurrencesSummary]
  ): Unit = js.native
  def getVulnerabilitySummary(
    params: ParamsDollarResourceDollarProjectsDollarOccurrencesDollarGetvulnerabilitysummary,
    options: BodyResponseCallback[Schema$VulnerabilityOccurrencesSummary],
    callback: BodyResponseCallback[Schema$VulnerabilityOccurrencesSummary]
  ): Unit = js.native
  def getVulnerabilitySummary(
    params: ParamsDollarResourceDollarProjectsDollarOccurrencesDollarGetvulnerabilitysummary,
    options: MethodOptions
  ): GaxiosPromise[Schema$VulnerabilityOccurrencesSummary] = js.native
  def getVulnerabilitySummary(
    params: ParamsDollarResourceDollarProjectsDollarOccurrencesDollarGetvulnerabilitysummary,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$VulnerabilityOccurrencesSummary]
  ): Unit = js.native
  /**
    * containeranalysis.projects.occurrences.list
    * @desc Lists occurrences for the specified project.
    * @alias containeranalysis.projects.occurrences.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.filter The filter expression.
    * @param {integer=} params.pageSize Number of occurrences to return in the list. Must be positive. Max allowed page size is 1000. If not specified, page size defaults to 20.
    * @param {string=} params.pageToken Token to provide to skip to a particular spot in the list.
    * @param {string} params.parent The name of the project to list occurrences for in the form of `projects/[PROJECT_ID]`.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$ListOccurrencesResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$ListOccurrencesResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarProjectsDollarOccurrencesDollarList): GaxiosPromise[Schema$ListOccurrencesResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarOccurrencesDollarList,
    callback: BodyResponseCallback[Schema$ListOccurrencesResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarOccurrencesDollarList,
    options: BodyResponseCallback[Schema$ListOccurrencesResponse],
    callback: BodyResponseCallback[Schema$ListOccurrencesResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarProjectsDollarOccurrencesDollarList, options: MethodOptions): GaxiosPromise[Schema$ListOccurrencesResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarOccurrencesDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ListOccurrencesResponse]
  ): Unit = js.native
  /**
    * containeranalysis.projects.occurrences.patch
    * @desc Updates the specified occurrence.
    * @alias containeranalysis.projects.occurrences.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The name of the occurrence in the form of `projects/[PROJECT_ID]/occurrences/[OCCURRENCE_ID]`.
    * @param {string=} params.updateMask The fields to update.
    * @param {().Occurrence} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[Schema$Occurrence] = js.native
  def patch(callback: BodyResponseCallback[Schema$Occurrence]): Unit = js.native
  def patch(params: ParamsDollarResourceDollarProjectsDollarOccurrencesDollarPatch): GaxiosPromise[Schema$Occurrence] = js.native
  def patch(
    params: ParamsDollarResourceDollarProjectsDollarOccurrencesDollarPatch,
    callback: BodyResponseCallback[Schema$Occurrence]
  ): Unit = js.native
  def patch(
    params: ParamsDollarResourceDollarProjectsDollarOccurrencesDollarPatch,
    options: BodyResponseCallback[Schema$Occurrence],
    callback: BodyResponseCallback[Schema$Occurrence]
  ): Unit = js.native
  def patch(params: ParamsDollarResourceDollarProjectsDollarOccurrencesDollarPatch, options: MethodOptions): GaxiosPromise[Schema$Occurrence] = js.native
  def patch(
    params: ParamsDollarResourceDollarProjectsDollarOccurrencesDollarPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Occurrence]
  ): Unit = js.native
  /**
    * containeranalysis.projects.occurrences.setIamPolicy
    * @desc Sets the access control policy on the specified note or occurrence.
    * Requires `containeranalysis.notes.setIamPolicy` or
    * `containeranalysis.occurrences.setIamPolicy` permission if the resource
    * is a note or an occurrence, respectively.  The resource takes the format
    * `projects/[PROJECT_ID]/notes/[NOTE_ID]` for notes and
    * `projects/[PROJECT_ID]/occurrences/[OCCURRENCE_ID]` for occurrences.
    * @alias containeranalysis.projects.occurrences.setIamPolicy
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
  def setIamPolicy(params: ParamsDollarResourceDollarProjectsDollarOccurrencesDollarSetiampolicy): GaxiosPromise[Schema$Policy] = js.native
  def setIamPolicy(
    params: ParamsDollarResourceDollarProjectsDollarOccurrencesDollarSetiampolicy,
    callback: BodyResponseCallback[Schema$Policy]
  ): Unit = js.native
  def setIamPolicy(
    params: ParamsDollarResourceDollarProjectsDollarOccurrencesDollarSetiampolicy,
    options: BodyResponseCallback[Schema$Policy],
    callback: BodyResponseCallback[Schema$Policy]
  ): Unit = js.native
  def setIamPolicy(
    params: ParamsDollarResourceDollarProjectsDollarOccurrencesDollarSetiampolicy,
    options: MethodOptions
  ): GaxiosPromise[Schema$Policy] = js.native
  def setIamPolicy(
    params: ParamsDollarResourceDollarProjectsDollarOccurrencesDollarSetiampolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Policy]
  ): Unit = js.native
  /**
    * containeranalysis.projects.occurrences.testIamPermissions
    * @desc Returns the permissions that a caller has on the specified note or
    * occurrence. Requires list permission on the project (for example,
    * `containeranalysis.notes.list`).  The resource takes the format
    * `projects/[PROJECT_ID]/notes/[NOTE_ID]` for notes and
    * `projects/[PROJECT_ID]/occurrences/[OCCURRENCE_ID]` for occurrences.
    * @alias containeranalysis.projects.occurrences.testIamPermissions
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
  def testIamPermissions(params: ParamsDollarResourceDollarProjectsDollarOccurrencesDollarTestiampermissions): GaxiosPromise[Schema$TestIamPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsDollarResourceDollarProjectsDollarOccurrencesDollarTestiampermissions,
    callback: BodyResponseCallback[Schema$TestIamPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(
    params: ParamsDollarResourceDollarProjectsDollarOccurrencesDollarTestiampermissions,
    options: BodyResponseCallback[Schema$TestIamPermissionsResponse],
    callback: BodyResponseCallback[Schema$TestIamPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(
    params: ParamsDollarResourceDollarProjectsDollarOccurrencesDollarTestiampermissions,
    options: MethodOptions
  ): GaxiosPromise[Schema$TestIamPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsDollarResourceDollarProjectsDollarOccurrencesDollarTestiampermissions,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$TestIamPermissionsResponse]
  ): Unit = js.native
}

