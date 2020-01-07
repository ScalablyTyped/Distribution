package typings.googleapis.buildSrcApisCloudsearchV1Mod.cloudsearch_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/cloudsearch/v1", "cloudsearch_v1.Resource$Settings$Searchapplications")
@js.native
class ResourceDollarSettingsDollarSearchapplications protected () extends js.Object {
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
  def create(): GaxiosPromise[Schema$Operation] = js.native
  def create(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def create(params: ParamsDollarResourceDollarSettingsDollarSearchapplicationsDollarCreate): GaxiosPromise[Schema$Operation] = js.native
  def create(
    params: ParamsDollarResourceDollarSettingsDollarSearchapplicationsDollarCreate,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarSettingsDollarSearchapplicationsDollarCreate,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarSettingsDollarSearchapplicationsDollarCreate,
    options: MethodOptions
  ): GaxiosPromise[Schema$Operation] = js.native
  def create(
    params: ParamsDollarResourceDollarSettingsDollarSearchapplicationsDollarCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
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
  def delete(): GaxiosPromise[Schema$Operation] = js.native
  def delete(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarSettingsDollarSearchapplicationsDollarDelete): GaxiosPromise[Schema$Operation] = js.native
  def delete(
    params: ParamsDollarResourceDollarSettingsDollarSearchapplicationsDollarDelete,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarSettingsDollarSearchapplicationsDollarDelete,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarSettingsDollarSearchapplicationsDollarDelete,
    options: MethodOptions
  ): GaxiosPromise[Schema$Operation] = js.native
  def delete(
    params: ParamsDollarResourceDollarSettingsDollarSearchapplicationsDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
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
  def get(): GaxiosPromise[Schema$SearchApplication] = js.native
  def get(callback: BodyResponseCallback[Schema$SearchApplication]): Unit = js.native
  def get(params: ParamsDollarResourceDollarSettingsDollarSearchapplicationsDollarGet): GaxiosPromise[Schema$SearchApplication] = js.native
  def get(
    params: ParamsDollarResourceDollarSettingsDollarSearchapplicationsDollarGet,
    callback: BodyResponseCallback[Schema$SearchApplication]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarSettingsDollarSearchapplicationsDollarGet,
    options: BodyResponseCallback[Schema$SearchApplication],
    callback: BodyResponseCallback[Schema$SearchApplication]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarSettingsDollarSearchapplicationsDollarGet,
    options: MethodOptions
  ): GaxiosPromise[Schema$SearchApplication] = js.native
  def get(
    params: ParamsDollarResourceDollarSettingsDollarSearchapplicationsDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$SearchApplication]
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
  def list(): GaxiosPromise[Schema$ListSearchApplicationsResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$ListSearchApplicationsResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarSettingsDollarSearchapplicationsDollarList): GaxiosPromise[Schema$ListSearchApplicationsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarSettingsDollarSearchapplicationsDollarList,
    callback: BodyResponseCallback[Schema$ListSearchApplicationsResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarSettingsDollarSearchapplicationsDollarList,
    options: BodyResponseCallback[Schema$ListSearchApplicationsResponse],
    callback: BodyResponseCallback[Schema$ListSearchApplicationsResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarSettingsDollarSearchapplicationsDollarList,
    options: MethodOptions
  ): GaxiosPromise[Schema$ListSearchApplicationsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarSettingsDollarSearchapplicationsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ListSearchApplicationsResponse]
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
  def reset(): GaxiosPromise[Schema$Operation] = js.native
  def reset(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def reset(params: ParamsDollarResourceDollarSettingsDollarSearchapplicationsDollarReset): GaxiosPromise[Schema$Operation] = js.native
  def reset(
    params: ParamsDollarResourceDollarSettingsDollarSearchapplicationsDollarReset,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def reset(
    params: ParamsDollarResourceDollarSettingsDollarSearchapplicationsDollarReset,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def reset(
    params: ParamsDollarResourceDollarSettingsDollarSearchapplicationsDollarReset,
    options: MethodOptions
  ): GaxiosPromise[Schema$Operation] = js.native
  def reset(
    params: ParamsDollarResourceDollarSettingsDollarSearchapplicationsDollarReset,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
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
  def update(): GaxiosPromise[Schema$Operation] = js.native
  def update(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def update(params: ParamsDollarResourceDollarSettingsDollarSearchapplicationsDollarUpdate): GaxiosPromise[Schema$Operation] = js.native
  def update(
    params: ParamsDollarResourceDollarSettingsDollarSearchapplicationsDollarUpdate,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def update(
    params: ParamsDollarResourceDollarSettingsDollarSearchapplicationsDollarUpdate,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def update(
    params: ParamsDollarResourceDollarSettingsDollarSearchapplicationsDollarUpdate,
    options: MethodOptions
  ): GaxiosPromise[Schema$Operation] = js.native
  def update(
    params: ParamsDollarResourceDollarSettingsDollarSearchapplicationsDollarUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
}

