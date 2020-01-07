package typings.googleapis.buildSrcApisContaineranalysisV1alpha1Mod.containeranalysis_v1alpha1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/containeranalysis/v1alpha1", "containeranalysis_v1alpha1.Resource$Providers$Notes")
@js.native
class ResourceDollarProvidersDollarNotes protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  var occurrences: ResourceDollarProvidersDollarNotesDollarOccurrences = js.native
  /**
    * containeranalysis.providers.notes.create
    * @desc Creates a new `Note`.
    * @alias containeranalysis.providers.notes.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The name of the project. Should be of the form "providers/{provider_id}". @Deprecated
    * @param {string=} params.noteId The ID to use for this note.
    * @param {string=} params.parent This field contains the project Id for example: "projects/{project_id}
    * @param {().Note} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[Schema$Note] = js.native
  def create(callback: BodyResponseCallback[Schema$Note]): Unit = js.native
  def create(params: ParamsDollarResourceDollarProvidersDollarNotesDollarCreate): GaxiosPromise[Schema$Note] = js.native
  def create(
    params: ParamsDollarResourceDollarProvidersDollarNotesDollarCreate,
    callback: BodyResponseCallback[Schema$Note]
  ): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarProvidersDollarNotesDollarCreate,
    options: BodyResponseCallback[Schema$Note],
    callback: BodyResponseCallback[Schema$Note]
  ): Unit = js.native
  def create(params: ParamsDollarResourceDollarProvidersDollarNotesDollarCreate, options: MethodOptions): GaxiosPromise[Schema$Note] = js.native
  def create(
    params: ParamsDollarResourceDollarProvidersDollarNotesDollarCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Note]
  ): Unit = js.native
  /**
    * containeranalysis.providers.notes.delete
    * @desc Deletes the given `Note` from the system.
    * @alias containeranalysis.providers.notes.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The name of the note in the form of "providers/{provider_id}/notes/{NOTE_ID}"
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Schema$Empty] = js.native
  def delete(callback: BodyResponseCallback[Schema$Empty]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarProvidersDollarNotesDollarDelete): GaxiosPromise[Schema$Empty] = js.native
  def delete(
    params: ParamsDollarResourceDollarProvidersDollarNotesDollarDelete,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarProvidersDollarNotesDollarDelete,
    options: BodyResponseCallback[Schema$Empty],
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def delete(params: ParamsDollarResourceDollarProvidersDollarNotesDollarDelete, options: MethodOptions): GaxiosPromise[Schema$Empty] = js.native
  def delete(
    params: ParamsDollarResourceDollarProvidersDollarNotesDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  /**
    * containeranalysis.providers.notes.get
    * @desc Returns the requested `Note`.
    * @alias containeranalysis.providers.notes.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The name of the note in the form of "providers/{provider_id}/notes/{NOTE_ID}"
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$Note] = js.native
  def get(callback: BodyResponseCallback[Schema$Note]): Unit = js.native
  def get(params: ParamsDollarResourceDollarProvidersDollarNotesDollarGet): GaxiosPromise[Schema$Note] = js.native
  def get(
    params: ParamsDollarResourceDollarProvidersDollarNotesDollarGet,
    callback: BodyResponseCallback[Schema$Note]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarProvidersDollarNotesDollarGet,
    options: BodyResponseCallback[Schema$Note],
    callback: BodyResponseCallback[Schema$Note]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarProvidersDollarNotesDollarGet, options: MethodOptions): GaxiosPromise[Schema$Note] = js.native
  def get(
    params: ParamsDollarResourceDollarProvidersDollarNotesDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Note]
  ): Unit = js.native
  /**
    * containeranalysis.providers.notes.getIamPolicy
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
    * @alias containeranalysis.providers.notes.getIamPolicy
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
  def getIamPolicy(params: ParamsDollarResourceDollarProvidersDollarNotesDollarGetiampolicy): GaxiosPromise[Schema$Policy] = js.native
  def getIamPolicy(
    params: ParamsDollarResourceDollarProvidersDollarNotesDollarGetiampolicy,
    callback: BodyResponseCallback[Schema$Policy]
  ): Unit = js.native
  def getIamPolicy(
    params: ParamsDollarResourceDollarProvidersDollarNotesDollarGetiampolicy,
    options: BodyResponseCallback[Schema$Policy],
    callback: BodyResponseCallback[Schema$Policy]
  ): Unit = js.native
  def getIamPolicy(params: ParamsDollarResourceDollarProvidersDollarNotesDollarGetiampolicy, options: MethodOptions): GaxiosPromise[Schema$Policy] = js.native
  def getIamPolicy(
    params: ParamsDollarResourceDollarProvidersDollarNotesDollarGetiampolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Policy]
  ): Unit = js.native
  /**
    * containeranalysis.providers.notes.list
    * @desc Lists all `Notes` for a given project.
    * @alias containeranalysis.providers.notes.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.filter The filter expression.
    * @param {string} params.name The name field will contain the project Id for example: "providers/{provider_id} @Deprecated
    * @param {integer=} params.pageSize Number of notes to return in the list.
    * @param {string=} params.pageToken Token to provide to skip to a particular spot in the list.
    * @param {string=} params.parent This field contains the project Id for example: "projects/{PROJECT_ID}".
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$ListNotesResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$ListNotesResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarProvidersDollarNotesDollarList): GaxiosPromise[Schema$ListNotesResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarProvidersDollarNotesDollarList,
    callback: BodyResponseCallback[Schema$ListNotesResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarProvidersDollarNotesDollarList,
    options: BodyResponseCallback[Schema$ListNotesResponse],
    callback: BodyResponseCallback[Schema$ListNotesResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarProvidersDollarNotesDollarList, options: MethodOptions): GaxiosPromise[Schema$ListNotesResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarProvidersDollarNotesDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ListNotesResponse]
  ): Unit = js.native
  /**
    * containeranalysis.providers.notes.patch
    * @desc Updates an existing `Note`.
    * @alias containeranalysis.providers.notes.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The name of the note. Should be of the form "projects/{provider_id}/notes/{note_id}".
    * @param {string=} params.updateMask The fields to update.
    * @param {().Note} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[Schema$Note] = js.native
  def patch(callback: BodyResponseCallback[Schema$Note]): Unit = js.native
  def patch(params: ParamsDollarResourceDollarProvidersDollarNotesDollarPatch): GaxiosPromise[Schema$Note] = js.native
  def patch(
    params: ParamsDollarResourceDollarProvidersDollarNotesDollarPatch,
    callback: BodyResponseCallback[Schema$Note]
  ): Unit = js.native
  def patch(
    params: ParamsDollarResourceDollarProvidersDollarNotesDollarPatch,
    options: BodyResponseCallback[Schema$Note],
    callback: BodyResponseCallback[Schema$Note]
  ): Unit = js.native
  def patch(params: ParamsDollarResourceDollarProvidersDollarNotesDollarPatch, options: MethodOptions): GaxiosPromise[Schema$Note] = js.native
  def patch(
    params: ParamsDollarResourceDollarProvidersDollarNotesDollarPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Note]
  ): Unit = js.native
  /**
    * containeranalysis.providers.notes.setIamPolicy
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
    * @alias containeranalysis.providers.notes.setIamPolicy
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
  def setIamPolicy(params: ParamsDollarResourceDollarProvidersDollarNotesDollarSetiampolicy): GaxiosPromise[Schema$Policy] = js.native
  def setIamPolicy(
    params: ParamsDollarResourceDollarProvidersDollarNotesDollarSetiampolicy,
    callback: BodyResponseCallback[Schema$Policy]
  ): Unit = js.native
  def setIamPolicy(
    params: ParamsDollarResourceDollarProvidersDollarNotesDollarSetiampolicy,
    options: BodyResponseCallback[Schema$Policy],
    callback: BodyResponseCallback[Schema$Policy]
  ): Unit = js.native
  def setIamPolicy(params: ParamsDollarResourceDollarProvidersDollarNotesDollarSetiampolicy, options: MethodOptions): GaxiosPromise[Schema$Policy] = js.native
  def setIamPolicy(
    params: ParamsDollarResourceDollarProvidersDollarNotesDollarSetiampolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Policy]
  ): Unit = js.native
  /**
    * containeranalysis.providers.notes.testIamPermissions
    * @desc Returns the permissions that a caller has on the specified note or
    * occurrence resource. Requires list permission on the project (for
    * example, "storage.objects.list" on the containing bucket for testing
    * permission of an object). Attempting to call this method on a
    * non-existent resource will result in a `NOT_FOUND` error if the user has
    * list permission on the project, or a `PERMISSION_DENIED` error otherwise.
    * The resource takes the following formats:
    * `projects/{PROJECT_ID}/occurrences/{OCCURRENCE_ID}` for `Occurrences` and
    * `projects/{PROJECT_ID}/notes/{NOTE_ID}` for `Notes`
    * @alias containeranalysis.providers.notes.testIamPermissions
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
  def testIamPermissions(params: ParamsDollarResourceDollarProvidersDollarNotesDollarTestiampermissions): GaxiosPromise[Schema$TestIamPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsDollarResourceDollarProvidersDollarNotesDollarTestiampermissions,
    callback: BodyResponseCallback[Schema$TestIamPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(
    params: ParamsDollarResourceDollarProvidersDollarNotesDollarTestiampermissions,
    options: BodyResponseCallback[Schema$TestIamPermissionsResponse],
    callback: BodyResponseCallback[Schema$TestIamPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(
    params: ParamsDollarResourceDollarProvidersDollarNotesDollarTestiampermissions,
    options: MethodOptions
  ): GaxiosPromise[Schema$TestIamPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsDollarResourceDollarProvidersDollarNotesDollarTestiampermissions,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$TestIamPermissionsResponse]
  ): Unit = js.native
}

