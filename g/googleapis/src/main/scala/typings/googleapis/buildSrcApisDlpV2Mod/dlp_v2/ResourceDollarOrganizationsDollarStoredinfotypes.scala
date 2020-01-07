package typings.googleapis.buildSrcApisDlpV2Mod.dlp_v2

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/dlp/v2", "dlp_v2.Resource$Organizations$Storedinfotypes")
@js.native
class ResourceDollarOrganizationsDollarStoredinfotypes protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * dlp.organizations.storedInfoTypes.create
    * @desc Creates a pre-built stored infoType to be used for inspection. See
    * https://cloud.google.com/dlp/docs/creating-stored-infotypes to learn
    * more.
    * @alias dlp.organizations.storedInfoTypes.create
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
  def create(params: ParamsDollarResourceDollarOrganizationsDollarStoredinfotypesDollarCreate): GaxiosPromise[Schema$GooglePrivacyDlpV2StoredInfoType] = js.native
  def create(
    params: ParamsDollarResourceDollarOrganizationsDollarStoredinfotypesDollarCreate,
    callback: BodyResponseCallback[Schema$GooglePrivacyDlpV2StoredInfoType]
  ): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarOrganizationsDollarStoredinfotypesDollarCreate,
    options: BodyResponseCallback[Schema$GooglePrivacyDlpV2StoredInfoType],
    callback: BodyResponseCallback[Schema$GooglePrivacyDlpV2StoredInfoType]
  ): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarOrganizationsDollarStoredinfotypesDollarCreate,
    options: MethodOptions
  ): GaxiosPromise[Schema$GooglePrivacyDlpV2StoredInfoType] = js.native
  def create(
    params: ParamsDollarResourceDollarOrganizationsDollarStoredinfotypesDollarCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$GooglePrivacyDlpV2StoredInfoType]
  ): Unit = js.native
  /**
    * dlp.organizations.storedInfoTypes.delete
    * @desc Deletes a stored infoType. See
    * https://cloud.google.com/dlp/docs/creating-stored-infotypes to learn
    * more.
    * @alias dlp.organizations.storedInfoTypes.delete
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
  def delete(params: ParamsDollarResourceDollarOrganizationsDollarStoredinfotypesDollarDelete): GaxiosPromise[Schema$GoogleProtobufEmpty] = js.native
  def delete(
    params: ParamsDollarResourceDollarOrganizationsDollarStoredinfotypesDollarDelete,
    callback: BodyResponseCallback[Schema$GoogleProtobufEmpty]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarOrganizationsDollarStoredinfotypesDollarDelete,
    options: BodyResponseCallback[Schema$GoogleProtobufEmpty],
    callback: BodyResponseCallback[Schema$GoogleProtobufEmpty]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarOrganizationsDollarStoredinfotypesDollarDelete,
    options: MethodOptions
  ): GaxiosPromise[Schema$GoogleProtobufEmpty] = js.native
  def delete(
    params: ParamsDollarResourceDollarOrganizationsDollarStoredinfotypesDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$GoogleProtobufEmpty]
  ): Unit = js.native
  /**
    * dlp.organizations.storedInfoTypes.get
    * @desc Gets a stored infoType. See
    * https://cloud.google.com/dlp/docs/creating-stored-infotypes to learn
    * more.
    * @alias dlp.organizations.storedInfoTypes.get
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
  def get(params: ParamsDollarResourceDollarOrganizationsDollarStoredinfotypesDollarGet): GaxiosPromise[Schema$GooglePrivacyDlpV2StoredInfoType] = js.native
  def get(
    params: ParamsDollarResourceDollarOrganizationsDollarStoredinfotypesDollarGet,
    callback: BodyResponseCallback[Schema$GooglePrivacyDlpV2StoredInfoType]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarOrganizationsDollarStoredinfotypesDollarGet,
    options: BodyResponseCallback[Schema$GooglePrivacyDlpV2StoredInfoType],
    callback: BodyResponseCallback[Schema$GooglePrivacyDlpV2StoredInfoType]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarOrganizationsDollarStoredinfotypesDollarGet,
    options: MethodOptions
  ): GaxiosPromise[Schema$GooglePrivacyDlpV2StoredInfoType] = js.native
  def get(
    params: ParamsDollarResourceDollarOrganizationsDollarStoredinfotypesDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$GooglePrivacyDlpV2StoredInfoType]
  ): Unit = js.native
  /**
    * dlp.organizations.storedInfoTypes.list
    * @desc Lists stored infoTypes. See
    * https://cloud.google.com/dlp/docs/creating-stored-infotypes to learn
    * more.
    * @alias dlp.organizations.storedInfoTypes.list
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
  def list(params: ParamsDollarResourceDollarOrganizationsDollarStoredinfotypesDollarList): GaxiosPromise[Schema$GooglePrivacyDlpV2ListStoredInfoTypesResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarOrganizationsDollarStoredinfotypesDollarList,
    callback: BodyResponseCallback[Schema$GooglePrivacyDlpV2ListStoredInfoTypesResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarOrganizationsDollarStoredinfotypesDollarList,
    options: BodyResponseCallback[Schema$GooglePrivacyDlpV2ListStoredInfoTypesResponse],
    callback: BodyResponseCallback[Schema$GooglePrivacyDlpV2ListStoredInfoTypesResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarOrganizationsDollarStoredinfotypesDollarList,
    options: MethodOptions
  ): GaxiosPromise[Schema$GooglePrivacyDlpV2ListStoredInfoTypesResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarOrganizationsDollarStoredinfotypesDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$GooglePrivacyDlpV2ListStoredInfoTypesResponse]
  ): Unit = js.native
  /**
    * dlp.organizations.storedInfoTypes.patch
    * @desc Updates the stored infoType by creating a new version. The existing
    * version will continue to be used until the new version is ready. See
    * https://cloud.google.com/dlp/docs/creating-stored-infotypes to learn
    * more.
    * @alias dlp.organizations.storedInfoTypes.patch
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
  def patch(params: ParamsDollarResourceDollarOrganizationsDollarStoredinfotypesDollarPatch): GaxiosPromise[Schema$GooglePrivacyDlpV2StoredInfoType] = js.native
  def patch(
    params: ParamsDollarResourceDollarOrganizationsDollarStoredinfotypesDollarPatch,
    callback: BodyResponseCallback[Schema$GooglePrivacyDlpV2StoredInfoType]
  ): Unit = js.native
  def patch(
    params: ParamsDollarResourceDollarOrganizationsDollarStoredinfotypesDollarPatch,
    options: BodyResponseCallback[Schema$GooglePrivacyDlpV2StoredInfoType],
    callback: BodyResponseCallback[Schema$GooglePrivacyDlpV2StoredInfoType]
  ): Unit = js.native
  def patch(
    params: ParamsDollarResourceDollarOrganizationsDollarStoredinfotypesDollarPatch,
    options: MethodOptions
  ): GaxiosPromise[Schema$GooglePrivacyDlpV2StoredInfoType] = js.native
  def patch(
    params: ParamsDollarResourceDollarOrganizationsDollarStoredinfotypesDollarPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$GooglePrivacyDlpV2StoredInfoType]
  ): Unit = js.native
}

