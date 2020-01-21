package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/cloudsearch/v1", "cloudsearch_v1.Resource$Settings$Searchapplications")
@js.native
class ResourceSettingsSearchapplications protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * cloudsearch.settings.searchapplications.create
    * @desc Creates a search application.
    * @alias cloudsearch.settings.searchapplications.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().SearchApplication} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[SchemaOperation] = js.native
  def create(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def create(params: ParamsResourceSettingsSearchapplicationsCreate): GaxiosPromise[SchemaOperation] = js.native
  def create(
    params: ParamsResourceSettingsSearchapplicationsCreate,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def create(
    params: ParamsResourceSettingsSearchapplicationsCreate,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def create(params: ParamsResourceSettingsSearchapplicationsCreate, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def create(
    params: ParamsResourceSettingsSearchapplicationsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * cloudsearch.settings.searchapplications.delete
    * @desc Deletes a search application.
    * @alias cloudsearch.settings.searchapplications.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {boolean=} params.debugOptions.enableDebugging If set, the request will enable debugging features of Cloud Search. Only turn on this field, if asked by Google to help with debugging.
    * @param {string} params.name The name of the search application to be deleted. <br />Format: applications/{application_id}.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[SchemaOperation] = js.native
  def delete(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def delete(params: ParamsResourceSettingsSearchapplicationsDelete): GaxiosPromise[SchemaOperation] = js.native
  def delete(
    params: ParamsResourceSettingsSearchapplicationsDelete,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def delete(
    params: ParamsResourceSettingsSearchapplicationsDelete,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def delete(params: ParamsResourceSettingsSearchapplicationsDelete, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def delete(
    params: ParamsResourceSettingsSearchapplicationsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * cloudsearch.settings.searchapplications.get
    * @desc Gets the specified search application.
    * @alias cloudsearch.settings.searchapplications.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {boolean=} params.debugOptions.enableDebugging If set, the request will enable debugging features of Cloud Search. Only turn on this field, if asked by Google to help with debugging.
    * @param {string} params.name Name of the search application. <br />Format: applications/{application_id}.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaSearchApplication] = js.native
  def get(callback: BodyResponseCallback[SchemaSearchApplication]): Unit = js.native
  def get(params: ParamsResourceSettingsSearchapplicationsGet): GaxiosPromise[SchemaSearchApplication] = js.native
  def get(
    params: ParamsResourceSettingsSearchapplicationsGet,
    callback: BodyResponseCallback[SchemaSearchApplication]
  ): Unit = js.native
  def get(
    params: ParamsResourceSettingsSearchapplicationsGet,
    options: BodyResponseCallback[SchemaSearchApplication],
    callback: BodyResponseCallback[SchemaSearchApplication]
  ): Unit = js.native
  def get(params: ParamsResourceSettingsSearchapplicationsGet, options: MethodOptions): GaxiosPromise[SchemaSearchApplication] = js.native
  def get(
    params: ParamsResourceSettingsSearchapplicationsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSearchApplication]
  ): Unit = js.native
  /**
    * cloudsearch.settings.searchapplications.list
    * @desc Lists all search applications.
    * @alias cloudsearch.settings.searchapplications.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {boolean=} params.debugOptions.enableDebugging If set, the request will enable debugging features of Cloud Search. Only turn on this field, if asked by Google to help with debugging.
    * @param {integer=} params.pageSize The maximum number of items to return.
    * @param {string=} params.pageToken The next_page_token value returned from a previous List request, if any. <br/> The default value is 10
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaListSearchApplicationsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListSearchApplicationsResponse]): Unit = js.native
  def list(params: ParamsResourceSettingsSearchapplicationsList): GaxiosPromise[SchemaListSearchApplicationsResponse] = js.native
  def list(
    params: ParamsResourceSettingsSearchapplicationsList,
    callback: BodyResponseCallback[SchemaListSearchApplicationsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceSettingsSearchapplicationsList,
    options: BodyResponseCallback[SchemaListSearchApplicationsResponse],
    callback: BodyResponseCallback[SchemaListSearchApplicationsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceSettingsSearchapplicationsList, options: MethodOptions): GaxiosPromise[SchemaListSearchApplicationsResponse] = js.native
  def list(
    params: ParamsResourceSettingsSearchapplicationsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListSearchApplicationsResponse]
  ): Unit = js.native
  /**
    * cloudsearch.settings.searchapplications.reset
    * @desc Resets a search application to default settings. This will return
    * an empty response.
    * @alias cloudsearch.settings.searchapplications.reset
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The name of the search application to be reset. <br />Format: applications/{application_id}.
    * @param {().ResetSearchApplicationRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def reset(): GaxiosPromise[SchemaOperation] = js.native
  def reset(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def reset(params: ParamsResourceSettingsSearchapplicationsReset): GaxiosPromise[SchemaOperation] = js.native
  def reset(
    params: ParamsResourceSettingsSearchapplicationsReset,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def reset(
    params: ParamsResourceSettingsSearchapplicationsReset,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def reset(params: ParamsResourceSettingsSearchapplicationsReset, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def reset(
    params: ParamsResourceSettingsSearchapplicationsReset,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * cloudsearch.settings.searchapplications.update
    * @desc Updates a search application.
    * @alias cloudsearch.settings.searchapplications.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Name of the Search Application. <br />Format: searchapplications/{application_id}.
    * @param {().SearchApplication} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[SchemaOperation] = js.native
  def update(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def update(params: ParamsResourceSettingsSearchapplicationsUpdate): GaxiosPromise[SchemaOperation] = js.native
  def update(
    params: ParamsResourceSettingsSearchapplicationsUpdate,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def update(
    params: ParamsResourceSettingsSearchapplicationsUpdate,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def update(params: ParamsResourceSettingsSearchapplicationsUpdate, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def update(
    params: ParamsResourceSettingsSearchapplicationsUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
}

