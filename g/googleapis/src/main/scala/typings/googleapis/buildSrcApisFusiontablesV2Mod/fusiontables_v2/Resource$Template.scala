package typings.googleapis.buildSrcApisFusiontablesV2Mod.fusiontables_v2

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/fusiontables/v2", "fusiontables_v2.Resource$Template")
@js.native
class Resource$Template protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * fusiontables.template.delete
    * @desc Deletes a template
    * @alias fusiontables.template.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.tableId Table from which the template is being deleted
    * @param {integer} params.templateId Identifier for the template which is being deleted
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarTemplateDollarDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsDollarResourceDollarTemplateDollarDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarTemplateDollarDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(params: ParamsDollarResourceDollarTemplateDollarDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsDollarResourceDollarTemplateDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * fusiontables.template.get
    * @desc Retrieves a specific template by its id
    * @alias fusiontables.template.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.tableId Table to which the template belongs
    * @param {integer} params.templateId Identifier for the template that is being requested
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$Template] = js.native
  def get(callback: BodyResponseCallback[Schema$Template]): Unit = js.native
  def get(params: ParamsDollarResourceDollarTemplateDollarGet): GaxiosPromise[Schema$Template] = js.native
  def get(
    params: ParamsDollarResourceDollarTemplateDollarGet,
    callback: BodyResponseCallback[Schema$Template]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarTemplateDollarGet,
    options: BodyResponseCallback[Schema$Template],
    callback: BodyResponseCallback[Schema$Template]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarTemplateDollarGet, options: MethodOptions): GaxiosPromise[Schema$Template] = js.native
  def get(
    params: ParamsDollarResourceDollarTemplateDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Template]
  ): Unit = js.native
  /**
    * fusiontables.template.insert
    * @desc Creates a new template for the table.
    * @alias fusiontables.template.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.tableId Table for which a new template is being created
    * @param {().Template} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[Schema$Template] = js.native
  def insert(callback: BodyResponseCallback[Schema$Template]): Unit = js.native
  def insert(params: ParamsDollarResourceDollarTemplateDollarInsert): GaxiosPromise[Schema$Template] = js.native
  def insert(
    params: ParamsDollarResourceDollarTemplateDollarInsert,
    callback: BodyResponseCallback[Schema$Template]
  ): Unit = js.native
  def insert(
    params: ParamsDollarResourceDollarTemplateDollarInsert,
    options: BodyResponseCallback[Schema$Template],
    callback: BodyResponseCallback[Schema$Template]
  ): Unit = js.native
  def insert(params: ParamsDollarResourceDollarTemplateDollarInsert, options: MethodOptions): GaxiosPromise[Schema$Template] = js.native
  def insert(
    params: ParamsDollarResourceDollarTemplateDollarInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Template]
  ): Unit = js.native
  /**
    * fusiontables.template.list
    * @desc Retrieves a list of templates.
    * @alias fusiontables.template.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer=} params.maxResults Maximum number of templates to return. Optional. Default is 5.
    * @param {string=} params.pageToken Continuation token specifying which results page to return. Optional.
    * @param {string} params.tableId Identifier for the table whose templates are being requested
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$TemplateList] = js.native
  def list(callback: BodyResponseCallback[Schema$TemplateList]): Unit = js.native
  def list(params: ParamsDollarResourceDollarTemplateDollarList): GaxiosPromise[Schema$TemplateList] = js.native
  def list(
    params: ParamsDollarResourceDollarTemplateDollarList,
    callback: BodyResponseCallback[Schema$TemplateList]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarTemplateDollarList,
    options: BodyResponseCallback[Schema$TemplateList],
    callback: BodyResponseCallback[Schema$TemplateList]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarTemplateDollarList, options: MethodOptions): GaxiosPromise[Schema$TemplateList] = js.native
  def list(
    params: ParamsDollarResourceDollarTemplateDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$TemplateList]
  ): Unit = js.native
  /**
    * fusiontables.template.patch
    * @desc Updates an existing template. This method supports patch semantics.
    * @alias fusiontables.template.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.tableId Table to which the updated template belongs
    * @param {integer} params.templateId Identifier for the template that is being updated
    * @param {().Template} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[Schema$Template] = js.native
  def patch(callback: BodyResponseCallback[Schema$Template]): Unit = js.native
  def patch(params: ParamsDollarResourceDollarTemplateDollarPatch): GaxiosPromise[Schema$Template] = js.native
  def patch(
    params: ParamsDollarResourceDollarTemplateDollarPatch,
    callback: BodyResponseCallback[Schema$Template]
  ): Unit = js.native
  def patch(
    params: ParamsDollarResourceDollarTemplateDollarPatch,
    options: BodyResponseCallback[Schema$Template],
    callback: BodyResponseCallback[Schema$Template]
  ): Unit = js.native
  def patch(params: ParamsDollarResourceDollarTemplateDollarPatch, options: MethodOptions): GaxiosPromise[Schema$Template] = js.native
  def patch(
    params: ParamsDollarResourceDollarTemplateDollarPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Template]
  ): Unit = js.native
  /**
    * fusiontables.template.update
    * @desc Updates an existing template
    * @alias fusiontables.template.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.tableId Table to which the updated template belongs
    * @param {integer} params.templateId Identifier for the template that is being updated
    * @param {().Template} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[Schema$Template] = js.native
  def update(callback: BodyResponseCallback[Schema$Template]): Unit = js.native
  def update(params: ParamsDollarResourceDollarTemplateDollarUpdate): GaxiosPromise[Schema$Template] = js.native
  def update(
    params: ParamsDollarResourceDollarTemplateDollarUpdate,
    callback: BodyResponseCallback[Schema$Template]
  ): Unit = js.native
  def update(
    params: ParamsDollarResourceDollarTemplateDollarUpdate,
    options: BodyResponseCallback[Schema$Template],
    callback: BodyResponseCallback[Schema$Template]
  ): Unit = js.native
  def update(params: ParamsDollarResourceDollarTemplateDollarUpdate, options: MethodOptions): GaxiosPromise[Schema$Template] = js.native
  def update(
    params: ParamsDollarResourceDollarTemplateDollarUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Template]
  ): Unit = js.native
}

