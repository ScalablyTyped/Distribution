package typings.googleapis.buildSrcApisAndroidmanagementV1Mod.androidmanagement_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/androidmanagement/v1", "androidmanagement_v1.Resource$Enterprises$Webapps")
@js.native
class ResourceDollarEnterprisesDollarWebapps protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * androidmanagement.enterprises.webApps.create
    * @desc Creates a web app.
    * @alias androidmanagement.enterprises.webApps.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.parent The name of the enterprise in the form enterprises/{enterpriseId}.
    * @param {().WebApp} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[Schema$WebApp] = js.native
  def create(callback: BodyResponseCallback[Schema$WebApp]): Unit = js.native
  def create(params: ParamsDollarResourceDollarEnterprisesDollarWebappsDollarCreate): GaxiosPromise[Schema$WebApp] = js.native
  def create(
    params: ParamsDollarResourceDollarEnterprisesDollarWebappsDollarCreate,
    callback: BodyResponseCallback[Schema$WebApp]
  ): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarEnterprisesDollarWebappsDollarCreate,
    options: BodyResponseCallback[Schema$WebApp],
    callback: BodyResponseCallback[Schema$WebApp]
  ): Unit = js.native
  def create(params: ParamsDollarResourceDollarEnterprisesDollarWebappsDollarCreate, options: MethodOptions): GaxiosPromise[Schema$WebApp] = js.native
  def create(
    params: ParamsDollarResourceDollarEnterprisesDollarWebappsDollarCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$WebApp]
  ): Unit = js.native
  /**
    * androidmanagement.enterprises.webApps.delete
    * @desc Deletes a web app.
    * @alias androidmanagement.enterprises.webApps.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The name of the web app in the form enterprises/{enterpriseId}/webApps/{packageName}.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Schema$Empty] = js.native
  def delete(callback: BodyResponseCallback[Schema$Empty]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarEnterprisesDollarWebappsDollarDelete): GaxiosPromise[Schema$Empty] = js.native
  def delete(
    params: ParamsDollarResourceDollarEnterprisesDollarWebappsDollarDelete,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarEnterprisesDollarWebappsDollarDelete,
    options: BodyResponseCallback[Schema$Empty],
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def delete(params: ParamsDollarResourceDollarEnterprisesDollarWebappsDollarDelete, options: MethodOptions): GaxiosPromise[Schema$Empty] = js.native
  def delete(
    params: ParamsDollarResourceDollarEnterprisesDollarWebappsDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  /**
    * androidmanagement.enterprises.webApps.get
    * @desc Gets a web app.
    * @alias androidmanagement.enterprises.webApps.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The name of the web app in the form enterprises/{enterpriseId}/webApp/{packageName}.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$WebApp] = js.native
  def get(callback: BodyResponseCallback[Schema$WebApp]): Unit = js.native
  def get(params: ParamsDollarResourceDollarEnterprisesDollarWebappsDollarGet): GaxiosPromise[Schema$WebApp] = js.native
  def get(
    params: ParamsDollarResourceDollarEnterprisesDollarWebappsDollarGet,
    callback: BodyResponseCallback[Schema$WebApp]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarEnterprisesDollarWebappsDollarGet,
    options: BodyResponseCallback[Schema$WebApp],
    callback: BodyResponseCallback[Schema$WebApp]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarEnterprisesDollarWebappsDollarGet, options: MethodOptions): GaxiosPromise[Schema$WebApp] = js.native
  def get(
    params: ParamsDollarResourceDollarEnterprisesDollarWebappsDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$WebApp]
  ): Unit = js.native
  /**
    * androidmanagement.enterprises.webApps.list
    * @desc Lists web apps for a given enterprise.
    * @alias androidmanagement.enterprises.webApps.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer=} params.pageSize The requested page size. The actual page size may be fixed to a min or max value.
    * @param {string=} params.pageToken A token identifying a page of results returned by the server.
    * @param {string} params.parent The name of the enterprise in the form enterprises/{enterpriseId}.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$ListWebAppsResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$ListWebAppsResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarEnterprisesDollarWebappsDollarList): GaxiosPromise[Schema$ListWebAppsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarEnterprisesDollarWebappsDollarList,
    callback: BodyResponseCallback[Schema$ListWebAppsResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarEnterprisesDollarWebappsDollarList,
    options: BodyResponseCallback[Schema$ListWebAppsResponse],
    callback: BodyResponseCallback[Schema$ListWebAppsResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarEnterprisesDollarWebappsDollarList, options: MethodOptions): GaxiosPromise[Schema$ListWebAppsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarEnterprisesDollarWebappsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ListWebAppsResponse]
  ): Unit = js.native
  /**
    * androidmanagement.enterprises.webApps.patch
    * @desc Updates a web app.
    * @alias androidmanagement.enterprises.webApps.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The name of the web app in the form enterprises/{enterpriseId}/webApps/{packageName}.
    * @param {string=} params.updateMask The field mask indicating the fields to update. If not set, all modifiable fields will be modified.
    * @param {().WebApp} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[Schema$WebApp] = js.native
  def patch(callback: BodyResponseCallback[Schema$WebApp]): Unit = js.native
  def patch(params: ParamsDollarResourceDollarEnterprisesDollarWebappsDollarPatch): GaxiosPromise[Schema$WebApp] = js.native
  def patch(
    params: ParamsDollarResourceDollarEnterprisesDollarWebappsDollarPatch,
    callback: BodyResponseCallback[Schema$WebApp]
  ): Unit = js.native
  def patch(
    params: ParamsDollarResourceDollarEnterprisesDollarWebappsDollarPatch,
    options: BodyResponseCallback[Schema$WebApp],
    callback: BodyResponseCallback[Schema$WebApp]
  ): Unit = js.native
  def patch(params: ParamsDollarResourceDollarEnterprisesDollarWebappsDollarPatch, options: MethodOptions): GaxiosPromise[Schema$WebApp] = js.native
  def patch(
    params: ParamsDollarResourceDollarEnterprisesDollarWebappsDollarPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$WebApp]
  ): Unit = js.native
}

