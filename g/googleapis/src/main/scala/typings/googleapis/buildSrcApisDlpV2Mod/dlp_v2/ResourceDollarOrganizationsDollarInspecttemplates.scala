package typings.googleapis.buildSrcApisDlpV2Mod.dlp_v2

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/dlp/v2", "dlp_v2.Resource$Organizations$Inspecttemplates")
@js.native
class ResourceDollarOrganizationsDollarInspecttemplates protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * dlp.organizations.inspectTemplates.create
    * @desc Creates an InspectTemplate for re-using frequently used
    * configuration for inspecting content, images, and storage. See
    * https://cloud.google.com/dlp/docs/creating-templates to learn more.
    * @alias dlp.organizations.inspectTemplates.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.parent The parent resource name, for example projects/my-project-id or organizations/my-org-id.
    * @param {().GooglePrivacyDlpV2CreateInspectTemplateRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[Schema$GooglePrivacyDlpV2InspectTemplate] = js.native
  def create(callback: BodyResponseCallback[Schema$GooglePrivacyDlpV2InspectTemplate]): Unit = js.native
  def create(params: ParamsDollarResourceDollarOrganizationsDollarInspecttemplatesDollarCreate): GaxiosPromise[Schema$GooglePrivacyDlpV2InspectTemplate] = js.native
  def create(
    params: ParamsDollarResourceDollarOrganizationsDollarInspecttemplatesDollarCreate,
    callback: BodyResponseCallback[Schema$GooglePrivacyDlpV2InspectTemplate]
  ): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarOrganizationsDollarInspecttemplatesDollarCreate,
    options: BodyResponseCallback[Schema$GooglePrivacyDlpV2InspectTemplate],
    callback: BodyResponseCallback[Schema$GooglePrivacyDlpV2InspectTemplate]
  ): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarOrganizationsDollarInspecttemplatesDollarCreate,
    options: MethodOptions
  ): GaxiosPromise[Schema$GooglePrivacyDlpV2InspectTemplate] = js.native
  def create(
    params: ParamsDollarResourceDollarOrganizationsDollarInspecttemplatesDollarCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$GooglePrivacyDlpV2InspectTemplate]
  ): Unit = js.native
  /**
    * dlp.organizations.inspectTemplates.delete
    * @desc Deletes an InspectTemplate. See
    * https://cloud.google.com/dlp/docs/creating-templates to learn more.
    * @alias dlp.organizations.inspectTemplates.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Resource name of the organization and inspectTemplate to be deleted, for example `organizations/433245324/inspectTemplates/432452342` or projects/project-id/inspectTemplates/432452342.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Schema$GoogleProtobufEmpty] = js.native
  def delete(callback: BodyResponseCallback[Schema$GoogleProtobufEmpty]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarOrganizationsDollarInspecttemplatesDollarDelete): GaxiosPromise[Schema$GoogleProtobufEmpty] = js.native
  def delete(
    params: ParamsDollarResourceDollarOrganizationsDollarInspecttemplatesDollarDelete,
    callback: BodyResponseCallback[Schema$GoogleProtobufEmpty]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarOrganizationsDollarInspecttemplatesDollarDelete,
    options: BodyResponseCallback[Schema$GoogleProtobufEmpty],
    callback: BodyResponseCallback[Schema$GoogleProtobufEmpty]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarOrganizationsDollarInspecttemplatesDollarDelete,
    options: MethodOptions
  ): GaxiosPromise[Schema$GoogleProtobufEmpty] = js.native
  def delete(
    params: ParamsDollarResourceDollarOrganizationsDollarInspecttemplatesDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$GoogleProtobufEmpty]
  ): Unit = js.native
  /**
    * dlp.organizations.inspectTemplates.get
    * @desc Gets an InspectTemplate. See
    * https://cloud.google.com/dlp/docs/creating-templates to learn more.
    * @alias dlp.organizations.inspectTemplates.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Resource name of the organization and inspectTemplate to be read, for example `organizations/433245324/inspectTemplates/432452342` or projects/project-id/inspectTemplates/432452342.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$GooglePrivacyDlpV2InspectTemplate] = js.native
  def get(callback: BodyResponseCallback[Schema$GooglePrivacyDlpV2InspectTemplate]): Unit = js.native
  def get(params: ParamsDollarResourceDollarOrganizationsDollarInspecttemplatesDollarGet): GaxiosPromise[Schema$GooglePrivacyDlpV2InspectTemplate] = js.native
  def get(
    params: ParamsDollarResourceDollarOrganizationsDollarInspecttemplatesDollarGet,
    callback: BodyResponseCallback[Schema$GooglePrivacyDlpV2InspectTemplate]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarOrganizationsDollarInspecttemplatesDollarGet,
    options: BodyResponseCallback[Schema$GooglePrivacyDlpV2InspectTemplate],
    callback: BodyResponseCallback[Schema$GooglePrivacyDlpV2InspectTemplate]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarOrganizationsDollarInspecttemplatesDollarGet,
    options: MethodOptions
  ): GaxiosPromise[Schema$GooglePrivacyDlpV2InspectTemplate] = js.native
  def get(
    params: ParamsDollarResourceDollarOrganizationsDollarInspecttemplatesDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$GooglePrivacyDlpV2InspectTemplate]
  ): Unit = js.native
  /**
    * dlp.organizations.inspectTemplates.list
    * @desc Lists InspectTemplates. See
    * https://cloud.google.com/dlp/docs/creating-templates to learn more.
    * @alias dlp.organizations.inspectTemplates.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.orderBy Optional comma separated list of fields to order by, followed by `asc` or `desc` postfix. This list is case-insensitive, default sorting order is ascending, redundant space characters are insignificant.  Example: `name asc,update_time, create_time desc`  Supported fields are:  - `create_time`: corresponds to time the template was created. - `update_time`: corresponds to time the template was last updated. - `name`: corresponds to template's name. - `display_name`: corresponds to template's display name.
    * @param {integer=} params.pageSize Optional size of the page, can be limited by server. If zero server returns a page of max size 100.
    * @param {string=} params.pageToken Optional page token to continue retrieval. Comes from previous call to `ListInspectTemplates`.
    * @param {string} params.parent The parent resource name, for example projects/my-project-id or organizations/my-org-id.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$GooglePrivacyDlpV2ListInspectTemplatesResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$GooglePrivacyDlpV2ListInspectTemplatesResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarOrganizationsDollarInspecttemplatesDollarList): GaxiosPromise[Schema$GooglePrivacyDlpV2ListInspectTemplatesResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarOrganizationsDollarInspecttemplatesDollarList,
    callback: BodyResponseCallback[Schema$GooglePrivacyDlpV2ListInspectTemplatesResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarOrganizationsDollarInspecttemplatesDollarList,
    options: BodyResponseCallback[Schema$GooglePrivacyDlpV2ListInspectTemplatesResponse],
    callback: BodyResponseCallback[Schema$GooglePrivacyDlpV2ListInspectTemplatesResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarOrganizationsDollarInspecttemplatesDollarList,
    options: MethodOptions
  ): GaxiosPromise[Schema$GooglePrivacyDlpV2ListInspectTemplatesResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarOrganizationsDollarInspecttemplatesDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$GooglePrivacyDlpV2ListInspectTemplatesResponse]
  ): Unit = js.native
  /**
    * dlp.organizations.inspectTemplates.patch
    * @desc Updates the InspectTemplate. See
    * https://cloud.google.com/dlp/docs/creating-templates to learn more.
    * @alias dlp.organizations.inspectTemplates.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Resource name of organization and inspectTemplate to be updated, for example `organizations/433245324/inspectTemplates/432452342` or projects/project-id/inspectTemplates/432452342.
    * @param {().GooglePrivacyDlpV2UpdateInspectTemplateRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[Schema$GooglePrivacyDlpV2InspectTemplate] = js.native
  def patch(callback: BodyResponseCallback[Schema$GooglePrivacyDlpV2InspectTemplate]): Unit = js.native
  def patch(params: ParamsDollarResourceDollarOrganizationsDollarInspecttemplatesDollarPatch): GaxiosPromise[Schema$GooglePrivacyDlpV2InspectTemplate] = js.native
  def patch(
    params: ParamsDollarResourceDollarOrganizationsDollarInspecttemplatesDollarPatch,
    callback: BodyResponseCallback[Schema$GooglePrivacyDlpV2InspectTemplate]
  ): Unit = js.native
  def patch(
    params: ParamsDollarResourceDollarOrganizationsDollarInspecttemplatesDollarPatch,
    options: BodyResponseCallback[Schema$GooglePrivacyDlpV2InspectTemplate],
    callback: BodyResponseCallback[Schema$GooglePrivacyDlpV2InspectTemplate]
  ): Unit = js.native
  def patch(
    params: ParamsDollarResourceDollarOrganizationsDollarInspecttemplatesDollarPatch,
    options: MethodOptions
  ): GaxiosPromise[Schema$GooglePrivacyDlpV2InspectTemplate] = js.native
  def patch(
    params: ParamsDollarResourceDollarOrganizationsDollarInspecttemplatesDollarPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$GooglePrivacyDlpV2InspectTemplate]
  ): Unit = js.native
}

