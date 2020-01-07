package typings.googleapis.buildSrcApisDlpV2Mod.dlp_v2

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/dlp/v2", "dlp_v2.Resource$Projects$Storedinfotypes")
@js.native
class ResourceDollarProjectsDollarStoredinfotypes protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * dlp.projects.storedInfoTypes.create
    * @desc Creates a pre-built stored infoType to be used for inspection. See
    * https://cloud.google.com/dlp/docs/creating-stored-infotypes to learn
    * more.
    * @alias dlp.projects.storedInfoTypes.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.parent The parent resource name, for example projects/my-project-id or organizations/my-org-id.
    * @param {().GooglePrivacyDlpV2CreateStoredInfoTypeRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[Schema$GooglePrivacyDlpV2StoredInfoType] = js.native
  def create(callback: BodyResponseCallback[Schema$GooglePrivacyDlpV2StoredInfoType]): Unit = js.native
  def create(params: ParamsDollarResourceDollarProjectsDollarStoredinfotypesDollarCreate): GaxiosPromise[Schema$GooglePrivacyDlpV2StoredInfoType] = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarStoredinfotypesDollarCreate,
    callback: BodyResponseCallback[Schema$GooglePrivacyDlpV2StoredInfoType]
  ): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarStoredinfotypesDollarCreate,
    options: BodyResponseCallback[Schema$GooglePrivacyDlpV2StoredInfoType],
    callback: BodyResponseCallback[Schema$GooglePrivacyDlpV2StoredInfoType]
  ): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarStoredinfotypesDollarCreate,
    options: MethodOptions
  ): GaxiosPromise[Schema$GooglePrivacyDlpV2StoredInfoType] = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarStoredinfotypesDollarCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$GooglePrivacyDlpV2StoredInfoType]
  ): Unit = js.native
  /**
    * dlp.projects.storedInfoTypes.delete
    * @desc Deletes a stored infoType. See
    * https://cloud.google.com/dlp/docs/creating-stored-infotypes to learn
    * more.
    * @alias dlp.projects.storedInfoTypes.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Resource name of the organization and storedInfoType to be deleted, for example `organizations/433245324/storedInfoTypes/432452342` or projects/project-id/storedInfoTypes/432452342.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Schema$GoogleProtobufEmpty] = js.native
  def delete(callback: BodyResponseCallback[Schema$GoogleProtobufEmpty]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarProjectsDollarStoredinfotypesDollarDelete): GaxiosPromise[Schema$GoogleProtobufEmpty] = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarStoredinfotypesDollarDelete,
    callback: BodyResponseCallback[Schema$GoogleProtobufEmpty]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarStoredinfotypesDollarDelete,
    options: BodyResponseCallback[Schema$GoogleProtobufEmpty],
    callback: BodyResponseCallback[Schema$GoogleProtobufEmpty]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarStoredinfotypesDollarDelete,
    options: MethodOptions
  ): GaxiosPromise[Schema$GoogleProtobufEmpty] = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarStoredinfotypesDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$GoogleProtobufEmpty]
  ): Unit = js.native
  /**
    * dlp.projects.storedInfoTypes.get
    * @desc Gets a stored infoType. See
    * https://cloud.google.com/dlp/docs/creating-stored-infotypes to learn
    * more.
    * @alias dlp.projects.storedInfoTypes.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Resource name of the organization and storedInfoType to be read, for example `organizations/433245324/storedInfoTypes/432452342` or projects/project-id/storedInfoTypes/432452342.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$GooglePrivacyDlpV2StoredInfoType] = js.native
  def get(callback: BodyResponseCallback[Schema$GooglePrivacyDlpV2StoredInfoType]): Unit = js.native
  def get(params: ParamsDollarResourceDollarProjectsDollarStoredinfotypesDollarGet): GaxiosPromise[Schema$GooglePrivacyDlpV2StoredInfoType] = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarStoredinfotypesDollarGet,
    callback: BodyResponseCallback[Schema$GooglePrivacyDlpV2StoredInfoType]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarStoredinfotypesDollarGet,
    options: BodyResponseCallback[Schema$GooglePrivacyDlpV2StoredInfoType],
    callback: BodyResponseCallback[Schema$GooglePrivacyDlpV2StoredInfoType]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarProjectsDollarStoredinfotypesDollarGet, options: MethodOptions): GaxiosPromise[Schema$GooglePrivacyDlpV2StoredInfoType] = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarStoredinfotypesDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$GooglePrivacyDlpV2StoredInfoType]
  ): Unit = js.native
  /**
    * dlp.projects.storedInfoTypes.list
    * @desc Lists stored infoTypes. See
    * https://cloud.google.com/dlp/docs/creating-stored-infotypes to learn
    * more.
    * @alias dlp.projects.storedInfoTypes.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.orderBy Optional comma separated list of fields to order by, followed by `asc` or `desc` postfix. This list is case-insensitive, default sorting order is ascending, redundant space characters are insignificant.  Example: `name asc, display_name, create_time desc`  Supported fields are:  - `create_time`: corresponds to time the most recent version of the resource was created. - `state`: corresponds to the state of the resource. - `name`: corresponds to resource name. - `display_name`: corresponds to info type's display name.
    * @param {integer=} params.pageSize Optional size of the page, can be limited by server. If zero server returns a page of max size 100.
    * @param {string=} params.pageToken Optional page token to continue retrieval. Comes from previous call to `ListStoredInfoTypes`.
    * @param {string} params.parent The parent resource name, for example projects/my-project-id or organizations/my-org-id.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$GooglePrivacyDlpV2ListStoredInfoTypesResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$GooglePrivacyDlpV2ListStoredInfoTypesResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarProjectsDollarStoredinfotypesDollarList): GaxiosPromise[Schema$GooglePrivacyDlpV2ListStoredInfoTypesResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarStoredinfotypesDollarList,
    callback: BodyResponseCallback[Schema$GooglePrivacyDlpV2ListStoredInfoTypesResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarStoredinfotypesDollarList,
    options: BodyResponseCallback[Schema$GooglePrivacyDlpV2ListStoredInfoTypesResponse],
    callback: BodyResponseCallback[Schema$GooglePrivacyDlpV2ListStoredInfoTypesResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarProjectsDollarStoredinfotypesDollarList, options: MethodOptions): GaxiosPromise[Schema$GooglePrivacyDlpV2ListStoredInfoTypesResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarStoredinfotypesDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$GooglePrivacyDlpV2ListStoredInfoTypesResponse]
  ): Unit = js.native
  /**
    * dlp.projects.storedInfoTypes.patch
    * @desc Updates the stored infoType by creating a new version. The existing
    * version will continue to be used until the new version is ready. See
    * https://cloud.google.com/dlp/docs/creating-stored-infotypes to learn
    * more.
    * @alias dlp.projects.storedInfoTypes.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Resource name of organization and storedInfoType to be updated, for example `organizations/433245324/storedInfoTypes/432452342` or projects/project-id/storedInfoTypes/432452342.
    * @param {().GooglePrivacyDlpV2UpdateStoredInfoTypeRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[Schema$GooglePrivacyDlpV2StoredInfoType] = js.native
  def patch(callback: BodyResponseCallback[Schema$GooglePrivacyDlpV2StoredInfoType]): Unit = js.native
  def patch(params: ParamsDollarResourceDollarProjectsDollarStoredinfotypesDollarPatch): GaxiosPromise[Schema$GooglePrivacyDlpV2StoredInfoType] = js.native
  def patch(
    params: ParamsDollarResourceDollarProjectsDollarStoredinfotypesDollarPatch,
    callback: BodyResponseCallback[Schema$GooglePrivacyDlpV2StoredInfoType]
  ): Unit = js.native
  def patch(
    params: ParamsDollarResourceDollarProjectsDollarStoredinfotypesDollarPatch,
    options: BodyResponseCallback[Schema$GooglePrivacyDlpV2StoredInfoType],
    callback: BodyResponseCallback[Schema$GooglePrivacyDlpV2StoredInfoType]
  ): Unit = js.native
  def patch(params: ParamsDollarResourceDollarProjectsDollarStoredinfotypesDollarPatch, options: MethodOptions): GaxiosPromise[Schema$GooglePrivacyDlpV2StoredInfoType] = js.native
  def patch(
    params: ParamsDollarResourceDollarProjectsDollarStoredinfotypesDollarPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$GooglePrivacyDlpV2StoredInfoType]
  ): Unit = js.native
}

