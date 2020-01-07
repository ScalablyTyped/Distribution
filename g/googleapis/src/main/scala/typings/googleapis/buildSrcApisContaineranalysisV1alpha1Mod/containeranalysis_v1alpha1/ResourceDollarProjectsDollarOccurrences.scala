package typings.googleapis.buildSrcApisContaineranalysisV1alpha1Mod.containeranalysis_v1alpha1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/containeranalysis/v1alpha1", "containeranalysis_v1alpha1.Resource$Projects$Occurrences")
@js.native
class ResourceDollarProjectsDollarOccurrences protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * containeranalysis.projects.occurrences.create
    * @desc Creates a new `Occurrence`. Use this method to create `Occurrences`
    * for a resource.
    * @alias containeranalysis.projects.occurrences.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.name The name of the project.  Should be of the form "projects/{project_id}". @Deprecated
    * @param {string} params.parent This field contains the project Id for example: "projects/{project_id}"
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
    * @desc Deletes the given `Occurrence` from the system. Use this when an
    * `Occurrence` is no longer applicable for the given resource.
    * @alias containeranalysis.projects.occurrences.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The name of the occurrence in the form of "projects/{project_id}/occurrences/{OCCURRENCE_ID}"
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
    * @desc Returns the requested `Occurrence`.
    * @alias containeranalysis.projects.occurrences.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The name of the occurrence of the form "projects/{project_id}/occurrences/{OCCURRENCE_ID}"
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
    * @desc Gets the access control policy for a note or an `Occurrence`
    * resource. Requires `containeranalysis.notes.setIamPolicy` or
    * `containeranalysis.occurrences.setIamPolicy` permission if the resource
    * is a note or occurrence, respectively. Attempting to call this method on
    * a resource without the required permission will result in a
    * `PERMISSION_DENIED` error. Attempting to call this method on a
    * non-existent resource will result in a `NOT_FOUND` error if the user has
    * list permission on the project, or a `PERMISSION_DENIED` error otherwise.
    * The resource takes the following formats:
    * `projects/{PROJECT_ID}/occurrences/{OCCURRENCE_ID}` for occurrences and
    * projects/{PROJECT_ID}/notes/{NOTE_ID} for notes
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
    * @desc Gets the `Note` attached to the given `Occurrence`.
    * @alias containeranalysis.projects.occurrences.getNotes
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The name of the occurrence in the form "projects/{project_id}/occurrences/{OCCURRENCE_ID}"
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
    * @param {string} params.parent This contains the project Id for example: projects/{project_id}
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def getVulnerabilitySummary(): GaxiosPromise[Schema$GetVulnzOccurrencesSummaryResponse] = js.native
  def getVulnerabilitySummary(callback: BodyResponseCallback[Schema$GetVulnzOccurrencesSummaryResponse]): Unit = js.native
  def getVulnerabilitySummary(params: ParamsDollarResourceDollarProjectsDollarOccurrencesDollarGetvulnerabilitysummary): GaxiosPromise[Schema$GetVulnzOccurrencesSummaryResponse] = js.native
  def getVulnerabilitySummary(
    params: ParamsDollarResourceDollarProjectsDollarOccurrencesDollarGetvulnerabilitysummary,
    callback: BodyResponseCallback[Schema$GetVulnzOccurrencesSummaryResponse]
  ): Unit = js.native
  def getVulnerabilitySummary(
    params: ParamsDollarResourceDollarProjectsDollarOccurrencesDollarGetvulnerabilitysummary,
    options: BodyResponseCallback[Schema$GetVulnzOccurrencesSummaryResponse],
    callback: BodyResponseCallback[Schema$GetVulnzOccurrencesSummaryResponse]
  ): Unit = js.native
  def getVulnerabilitySummary(
    params: ParamsDollarResourceDollarProjectsDollarOccurrencesDollarGetvulnerabilitysummary,
    options: MethodOptions
  ): GaxiosPromise[Schema$GetVulnzOccurrencesSummaryResponse] = js.native
  def getVulnerabilitySummary(
    params: ParamsDollarResourceDollarProjectsDollarOccurrencesDollarGetvulnerabilitysummary,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$GetVulnzOccurrencesSummaryResponse]
  ): Unit = js.native
  /**
    * containeranalysis.projects.occurrences.list
    * @desc Lists active `Occurrences` for a given project matching the
    * filters.
    * @alias containeranalysis.projects.occurrences.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.filter The filter expression.
    * @param {string=} params.kind The kind of occurrences to filter on.
    * @param {string=} params.name The name field contains the project Id. For example: "projects/{project_id} @Deprecated
    * @param {integer=} params.pageSize Number of occurrences to return in the list.
    * @param {string=} params.pageToken Token to provide to skip to a particular spot in the list.
    * @param {string} params.parent This contains the project Id for example: projects/{project_id}.
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
    * @desc Updates an existing occurrence.
    * @alias containeranalysis.projects.occurrences.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The name of the occurrence. Should be of the form "projects/{project_id}/occurrences/{OCCURRENCE_ID}".
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
    * @desc Sets the access control policy on the specified `Note` or
    * `Occurrence`. Requires `containeranalysis.notes.setIamPolicy` or
    * `containeranalysis.occurrences.setIamPolicy` permission if the resource
    * is a `Note` or an `Occurrence`, respectively. Attempting to call this
    * method without these permissions will result in a ` `PERMISSION_DENIED`
    * error. Attempting to call this method on a non-existent resource will
    * result in a `NOT_FOUND` error if the user has
    * `containeranalysis.notes.list` permission on a `Note` or
    * `containeranalysis.occurrences.list` on an `Occurrence`, or a
    * `PERMISSION_DENIED` error otherwise. The resource takes the following
    * formats: `projects/{projectid}/occurrences/{occurrenceid}` for
    * occurrences and projects/{projectid}/notes/{noteid} for notes
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
    * occurrence resource. Requires list permission on the project (for
    * example, "storage.objects.list" on the containing bucket for testing
    * permission of an object). Attempting to call this method on a
    * non-existent resource will result in a `NOT_FOUND` error if the user has
    * list permission on the project, or a `PERMISSION_DENIED` error otherwise.
    * The resource takes the following formats:
    * `projects/{PROJECT_ID}/occurrences/{OCCURRENCE_ID}` for `Occurrences` and
    * `projects/{PROJECT_ID}/notes/{NOTE_ID}` for `Notes`
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

