package typings.googleapis.buildSrcApisContaineranalysisV1beta1Mod.containeranalysis_v1beta1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/containeranalysis/v1beta1", "containeranalysis_v1beta1.Resource$Projects$Notes")
@js.native
class ResourceDollarProjectsDollarNotes protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  var occurrences: ResourceDollarProjectsDollarNotesDollarOccurrences = js.native
  /**
    * containeranalysis.projects.notes.batchCreate
    * @desc Creates new notes in batch.
    * @alias containeranalysis.projects.notes.batchCreate
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.parent The name of the project in the form of `projects/[PROJECT_ID]`, under which the notes are to be created.
    * @param {().BatchCreateNotesRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def batchCreate(): GaxiosPromise[Schema$BatchCreateNotesResponse] = js.native
  def batchCreate(callback: BodyResponseCallback[Schema$BatchCreateNotesResponse]): Unit = js.native
  def batchCreate(params: ParamsDollarResourceDollarProjectsDollarNotesDollarBatchcreate): GaxiosPromise[Schema$BatchCreateNotesResponse] = js.native
  def batchCreate(
    params: ParamsDollarResourceDollarProjectsDollarNotesDollarBatchcreate,
    callback: BodyResponseCallback[Schema$BatchCreateNotesResponse]
  ): Unit = js.native
  def batchCreate(
    params: ParamsDollarResourceDollarProjectsDollarNotesDollarBatchcreate,
    options: BodyResponseCallback[Schema$BatchCreateNotesResponse],
    callback: BodyResponseCallback[Schema$BatchCreateNotesResponse]
  ): Unit = js.native
  def batchCreate(params: ParamsDollarResourceDollarProjectsDollarNotesDollarBatchcreate, options: MethodOptions): GaxiosPromise[Schema$BatchCreateNotesResponse] = js.native
  def batchCreate(
    params: ParamsDollarResourceDollarProjectsDollarNotesDollarBatchcreate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$BatchCreateNotesResponse]
  ): Unit = js.native
  /**
    * containeranalysis.projects.notes.create
    * @desc Creates a new note.
    * @alias containeranalysis.projects.notes.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.noteId The ID to use for this note.
    * @param {string} params.parent The name of the project in the form of `projects/[PROJECT_ID]`, under which the note is to be created.
    * @param {().Note} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[Schema$Note] = js.native
  def create(callback: BodyResponseCallback[Schema$Note]): Unit = js.native
  def create(params: ParamsDollarResourceDollarProjectsDollarNotesDollarCreate): GaxiosPromise[Schema$Note] = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarNotesDollarCreate,
    callback: BodyResponseCallback[Schema$Note]
  ): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarNotesDollarCreate,
    options: BodyResponseCallback[Schema$Note],
    callback: BodyResponseCallback[Schema$Note]
  ): Unit = js.native
  def create(params: ParamsDollarResourceDollarProjectsDollarNotesDollarCreate, options: MethodOptions): GaxiosPromise[Schema$Note] = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarNotesDollarCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Note]
  ): Unit = js.native
  /**
    * containeranalysis.projects.notes.delete
    * @desc Deletes the specified note.
    * @alias containeranalysis.projects.notes.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The name of the note in the form of `projects/[PROVIDER_ID]/notes/[NOTE_ID]`.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Schema$Empty] = js.native
  def delete(callback: BodyResponseCallback[Schema$Empty]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarProjectsDollarNotesDollarDelete): GaxiosPromise[Schema$Empty] = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarNotesDollarDelete,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarNotesDollarDelete,
    options: BodyResponseCallback[Schema$Empty],
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def delete(params: ParamsDollarResourceDollarProjectsDollarNotesDollarDelete, options: MethodOptions): GaxiosPromise[Schema$Empty] = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarNotesDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  /**
    * containeranalysis.projects.notes.get
    * @desc Gets the specified note.
    * @alias containeranalysis.projects.notes.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The name of the note in the form of `projects/[PROVIDER_ID]/notes/[NOTE_ID]`.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$Note] = js.native
  def get(callback: BodyResponseCallback[Schema$Note]): Unit = js.native
  def get(params: ParamsDollarResourceDollarProjectsDollarNotesDollarGet): GaxiosPromise[Schema$Note] = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarNotesDollarGet,
    callback: BodyResponseCallback[Schema$Note]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarNotesDollarGet,
    options: BodyResponseCallback[Schema$Note],
    callback: BodyResponseCallback[Schema$Note]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarProjectsDollarNotesDollarGet, options: MethodOptions): GaxiosPromise[Schema$Note] = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarNotesDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Note]
  ): Unit = js.native
  /**
    * containeranalysis.projects.notes.getIamPolicy
    * @desc Gets the access control policy for a note or an occurrence
    * resource. Requires `containeranalysis.notes.setIamPolicy` or
    * `containeranalysis.occurrences.setIamPolicy` permission if the resource
    * is a note or occurrence, respectively.  The resource takes the format
    * `projects/[PROJECT_ID]/notes/[NOTE_ID]` for notes and
    * `projects/[PROJECT_ID]/occurrences/[OCCURRENCE_ID]` for occurrences.
    * @alias containeranalysis.projects.notes.getIamPolicy
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
  def getIamPolicy(params: ParamsDollarResourceDollarProjectsDollarNotesDollarGetiampolicy): GaxiosPromise[Schema$Policy] = js.native
  def getIamPolicy(
    params: ParamsDollarResourceDollarProjectsDollarNotesDollarGetiampolicy,
    callback: BodyResponseCallback[Schema$Policy]
  ): Unit = js.native
  def getIamPolicy(
    params: ParamsDollarResourceDollarProjectsDollarNotesDollarGetiampolicy,
    options: BodyResponseCallback[Schema$Policy],
    callback: BodyResponseCallback[Schema$Policy]
  ): Unit = js.native
  def getIamPolicy(params: ParamsDollarResourceDollarProjectsDollarNotesDollarGetiampolicy, options: MethodOptions): GaxiosPromise[Schema$Policy] = js.native
  def getIamPolicy(
    params: ParamsDollarResourceDollarProjectsDollarNotesDollarGetiampolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Policy]
  ): Unit = js.native
  /**
    * containeranalysis.projects.notes.list
    * @desc Lists notes for the specified project.
    * @alias containeranalysis.projects.notes.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.filter The filter expression.
    * @param {integer=} params.pageSize Number of notes to return in the list. Must be positive. Max allowed page size is 1000. If not specified, page size defaults to 20.
    * @param {string=} params.pageToken Token to provide to skip to a particular spot in the list.
    * @param {string} params.parent The name of the project to list notes for in the form of `projects/[PROJECT_ID]`.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$ListNotesResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$ListNotesResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarProjectsDollarNotesDollarList): GaxiosPromise[Schema$ListNotesResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarNotesDollarList,
    callback: BodyResponseCallback[Schema$ListNotesResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarNotesDollarList,
    options: BodyResponseCallback[Schema$ListNotesResponse],
    callback: BodyResponseCallback[Schema$ListNotesResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarProjectsDollarNotesDollarList, options: MethodOptions): GaxiosPromise[Schema$ListNotesResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarNotesDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ListNotesResponse]
  ): Unit = js.native
  /**
    * containeranalysis.projects.notes.patch
    * @desc Updates the specified note.
    * @alias containeranalysis.projects.notes.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The name of the note in the form of `projects/[PROVIDER_ID]/notes/[NOTE_ID]`.
    * @param {string=} params.updateMask The fields to update.
    * @param {().Note} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[Schema$Note] = js.native
  def patch(callback: BodyResponseCallback[Schema$Note]): Unit = js.native
  def patch(params: ParamsDollarResourceDollarProjectsDollarNotesDollarPatch): GaxiosPromise[Schema$Note] = js.native
  def patch(
    params: ParamsDollarResourceDollarProjectsDollarNotesDollarPatch,
    callback: BodyResponseCallback[Schema$Note]
  ): Unit = js.native
  def patch(
    params: ParamsDollarResourceDollarProjectsDollarNotesDollarPatch,
    options: BodyResponseCallback[Schema$Note],
    callback: BodyResponseCallback[Schema$Note]
  ): Unit = js.native
  def patch(params: ParamsDollarResourceDollarProjectsDollarNotesDollarPatch, options: MethodOptions): GaxiosPromise[Schema$Note] = js.native
  def patch(
    params: ParamsDollarResourceDollarProjectsDollarNotesDollarPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Note]
  ): Unit = js.native
  /**
    * containeranalysis.projects.notes.setIamPolicy
    * @desc Sets the access control policy on the specified note or occurrence.
    * Requires `containeranalysis.notes.setIamPolicy` or
    * `containeranalysis.occurrences.setIamPolicy` permission if the resource
    * is a note or an occurrence, respectively.  The resource takes the format
    * `projects/[PROJECT_ID]/notes/[NOTE_ID]` for notes and
    * `projects/[PROJECT_ID]/occurrences/[OCCURRENCE_ID]` for occurrences.
    * @alias containeranalysis.projects.notes.setIamPolicy
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
  def setIamPolicy(params: ParamsDollarResourceDollarProjectsDollarNotesDollarSetiampolicy): GaxiosPromise[Schema$Policy] = js.native
  def setIamPolicy(
    params: ParamsDollarResourceDollarProjectsDollarNotesDollarSetiampolicy,
    callback: BodyResponseCallback[Schema$Policy]
  ): Unit = js.native
  def setIamPolicy(
    params: ParamsDollarResourceDollarProjectsDollarNotesDollarSetiampolicy,
    options: BodyResponseCallback[Schema$Policy],
    callback: BodyResponseCallback[Schema$Policy]
  ): Unit = js.native
  def setIamPolicy(params: ParamsDollarResourceDollarProjectsDollarNotesDollarSetiampolicy, options: MethodOptions): GaxiosPromise[Schema$Policy] = js.native
  def setIamPolicy(
    params: ParamsDollarResourceDollarProjectsDollarNotesDollarSetiampolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Policy]
  ): Unit = js.native
  /**
    * containeranalysis.projects.notes.testIamPermissions
    * @desc Returns the permissions that a caller has on the specified note or
    * occurrence. Requires list permission on the project (for example,
    * `containeranalysis.notes.list`).  The resource takes the format
    * `projects/[PROJECT_ID]/notes/[NOTE_ID]` for notes and
    * `projects/[PROJECT_ID]/occurrences/[OCCURRENCE_ID]` for occurrences.
    * @alias containeranalysis.projects.notes.testIamPermissions
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
  def testIamPermissions(params: ParamsDollarResourceDollarProjectsDollarNotesDollarTestiampermissions): GaxiosPromise[Schema$TestIamPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsDollarResourceDollarProjectsDollarNotesDollarTestiampermissions,
    callback: BodyResponseCallback[Schema$TestIamPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(
    params: ParamsDollarResourceDollarProjectsDollarNotesDollarTestiampermissions,
    options: BodyResponseCallback[Schema$TestIamPermissionsResponse],
    callback: BodyResponseCallback[Schema$TestIamPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(
    params: ParamsDollarResourceDollarProjectsDollarNotesDollarTestiampermissions,
    options: MethodOptions
  ): GaxiosPromise[Schema$TestIamPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsDollarResourceDollarProjectsDollarNotesDollarTestiampermissions,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$TestIamPermissionsResponse]
  ): Unit = js.native
}

