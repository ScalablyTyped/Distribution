package typings.googleapis.buildSrcApisLoggingV2Mod.logging_v2

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/logging/v2", "logging_v2.Resource$Folders$Exclusions")
@js.native
class ResourceDollarFoldersDollarExclusions protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * logging.folders.exclusions.create
    * @desc Creates a new exclusion in a specified parent resource. Only log
    * entries belonging to that resource can be excluded. You can have up to 10
    * exclusions in a resource.
    * @alias logging.folders.exclusions.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.parent Required. The parent resource in which to create the exclusion: "projects/[PROJECT_ID]" "organizations/[ORGANIZATION_ID]" "billingAccounts/[BILLING_ACCOUNT_ID]" "folders/[FOLDER_ID]" Examples: "projects/my-logging-project", "organizations/123456789".
    * @param {().LogExclusion} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[Schema$LogExclusion] = js.native
  def create(callback: BodyResponseCallback[Schema$LogExclusion]): Unit = js.native
  def create(params: ParamsDollarResourceDollarFoldersDollarExclusionsDollarCreate): GaxiosPromise[Schema$LogExclusion] = js.native
  def create(
    params: ParamsDollarResourceDollarFoldersDollarExclusionsDollarCreate,
    callback: BodyResponseCallback[Schema$LogExclusion]
  ): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarFoldersDollarExclusionsDollarCreate,
    options: BodyResponseCallback[Schema$LogExclusion],
    callback: BodyResponseCallback[Schema$LogExclusion]
  ): Unit = js.native
  def create(params: ParamsDollarResourceDollarFoldersDollarExclusionsDollarCreate, options: MethodOptions): GaxiosPromise[Schema$LogExclusion] = js.native
  def create(
    params: ParamsDollarResourceDollarFoldersDollarExclusionsDollarCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$LogExclusion]
  ): Unit = js.native
  /**
    * logging.folders.exclusions.delete
    * @desc Deletes an exclusion.
    * @alias logging.folders.exclusions.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Required. The resource name of an existing exclusion to delete: "projects/[PROJECT_ID]/exclusions/[EXCLUSION_ID]" "organizations/[ORGANIZATION_ID]/exclusions/[EXCLUSION_ID]" "billingAccounts/[BILLING_ACCOUNT_ID]/exclusions/[EXCLUSION_ID]" "folders/[FOLDER_ID]/exclusions/[EXCLUSION_ID]" Example: "projects/my-project-id/exclusions/my-exclusion-id".
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Schema$Empty] = js.native
  def delete(callback: BodyResponseCallback[Schema$Empty]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarFoldersDollarExclusionsDollarDelete): GaxiosPromise[Schema$Empty] = js.native
  def delete(
    params: ParamsDollarResourceDollarFoldersDollarExclusionsDollarDelete,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarFoldersDollarExclusionsDollarDelete,
    options: BodyResponseCallback[Schema$Empty],
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def delete(params: ParamsDollarResourceDollarFoldersDollarExclusionsDollarDelete, options: MethodOptions): GaxiosPromise[Schema$Empty] = js.native
  def delete(
    params: ParamsDollarResourceDollarFoldersDollarExclusionsDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  /**
    * logging.folders.exclusions.get
    * @desc Gets the description of an exclusion.
    * @alias logging.folders.exclusions.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Required. The resource name of an existing exclusion: "projects/[PROJECT_ID]/exclusions/[EXCLUSION_ID]" "organizations/[ORGANIZATION_ID]/exclusions/[EXCLUSION_ID]" "billingAccounts/[BILLING_ACCOUNT_ID]/exclusions/[EXCLUSION_ID]" "folders/[FOLDER_ID]/exclusions/[EXCLUSION_ID]" Example: "projects/my-project-id/exclusions/my-exclusion-id".
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$LogExclusion] = js.native
  def get(callback: BodyResponseCallback[Schema$LogExclusion]): Unit = js.native
  def get(params: ParamsDollarResourceDollarFoldersDollarExclusionsDollarGet): GaxiosPromise[Schema$LogExclusion] = js.native
  def get(
    params: ParamsDollarResourceDollarFoldersDollarExclusionsDollarGet,
    callback: BodyResponseCallback[Schema$LogExclusion]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarFoldersDollarExclusionsDollarGet,
    options: BodyResponseCallback[Schema$LogExclusion],
    callback: BodyResponseCallback[Schema$LogExclusion]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarFoldersDollarExclusionsDollarGet, options: MethodOptions): GaxiosPromise[Schema$LogExclusion] = js.native
  def get(
    params: ParamsDollarResourceDollarFoldersDollarExclusionsDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$LogExclusion]
  ): Unit = js.native
  /**
    * logging.folders.exclusions.list
    * @desc Lists all the exclusions in a parent resource.
    * @alias logging.folders.exclusions.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer=} params.pageSize Optional. The maximum number of results to return from this request. Non-positive values are ignored. The presence of nextPageToken in the response indicates that more results might be available.
    * @param {string=} params.pageToken Optional. If present, then retrieve the next batch of results from the preceding call to this method. pageToken must be the value of nextPageToken from the previous response. The values of other method parameters should be identical to those in the previous call.
    * @param {string} params.parent Required. The parent resource whose exclusions are to be listed. "projects/[PROJECT_ID]" "organizations/[ORGANIZATION_ID]" "billingAccounts/[BILLING_ACCOUNT_ID]" "folders/[FOLDER_ID]"
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$ListExclusionsResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$ListExclusionsResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarFoldersDollarExclusionsDollarList): GaxiosPromise[Schema$ListExclusionsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarFoldersDollarExclusionsDollarList,
    callback: BodyResponseCallback[Schema$ListExclusionsResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarFoldersDollarExclusionsDollarList,
    options: BodyResponseCallback[Schema$ListExclusionsResponse],
    callback: BodyResponseCallback[Schema$ListExclusionsResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarFoldersDollarExclusionsDollarList, options: MethodOptions): GaxiosPromise[Schema$ListExclusionsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarFoldersDollarExclusionsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ListExclusionsResponse]
  ): Unit = js.native
  /**
    * logging.folders.exclusions.patch
    * @desc Changes one or more properties of an existing exclusion.
    * @alias logging.folders.exclusions.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Required. The resource name of the exclusion to update: "projects/[PROJECT_ID]/exclusions/[EXCLUSION_ID]" "organizations/[ORGANIZATION_ID]/exclusions/[EXCLUSION_ID]" "billingAccounts/[BILLING_ACCOUNT_ID]/exclusions/[EXCLUSION_ID]" "folders/[FOLDER_ID]/exclusions/[EXCLUSION_ID]" Example: "projects/my-project-id/exclusions/my-exclusion-id".
    * @param {string=} params.updateMask Required. A nonempty list of fields to change in the existing exclusion. New values for the fields are taken from the corresponding fields in the LogExclusion included in this request. Fields not mentioned in update_mask are not changed and are ignored in the request.For example, to change the filter and description of an exclusion, specify an update_mask of "filter,description".
    * @param {().LogExclusion} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[Schema$LogExclusion] = js.native
  def patch(callback: BodyResponseCallback[Schema$LogExclusion]): Unit = js.native
  def patch(params: ParamsDollarResourceDollarFoldersDollarExclusionsDollarPatch): GaxiosPromise[Schema$LogExclusion] = js.native
  def patch(
    params: ParamsDollarResourceDollarFoldersDollarExclusionsDollarPatch,
    callback: BodyResponseCallback[Schema$LogExclusion]
  ): Unit = js.native
  def patch(
    params: ParamsDollarResourceDollarFoldersDollarExclusionsDollarPatch,
    options: BodyResponseCallback[Schema$LogExclusion],
    callback: BodyResponseCallback[Schema$LogExclusion]
  ): Unit = js.native
  def patch(params: ParamsDollarResourceDollarFoldersDollarExclusionsDollarPatch, options: MethodOptions): GaxiosPromise[Schema$LogExclusion] = js.native
  def patch(
    params: ParamsDollarResourceDollarFoldersDollarExclusionsDollarPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$LogExclusion]
  ): Unit = js.native
}

