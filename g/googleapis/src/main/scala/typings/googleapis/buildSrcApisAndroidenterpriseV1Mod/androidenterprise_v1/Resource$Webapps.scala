package typings.googleapis.buildSrcApisAndroidenterpriseV1Mod.androidenterprise_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/androidenterprise/v1", "androidenterprise_v1.Resource$Webapps")
@js.native
class Resource$Webapps protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * androidenterprise.webapps.delete
    * @desc Deletes an existing web app.
    * @alias androidenterprise.webapps.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.enterpriseId The ID of the enterprise.
    * @param {string} params.webAppId The ID of the web app.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarWebappsDollarDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsDollarResourceDollarWebappsDollarDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarWebappsDollarDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(params: ParamsDollarResourceDollarWebappsDollarDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsDollarResourceDollarWebappsDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * androidenterprise.webapps.get
    * @desc Gets an existing web app.
    * @alias androidenterprise.webapps.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.enterpriseId The ID of the enterprise.
    * @param {string} params.webAppId The ID of the web app.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$WebApp] = js.native
  def get(callback: BodyResponseCallback[Schema$WebApp]): Unit = js.native
  def get(params: ParamsDollarResourceDollarWebappsDollarGet): GaxiosPromise[Schema$WebApp] = js.native
  def get(params: ParamsDollarResourceDollarWebappsDollarGet, callback: BodyResponseCallback[Schema$WebApp]): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarWebappsDollarGet,
    options: BodyResponseCallback[Schema$WebApp],
    callback: BodyResponseCallback[Schema$WebApp]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarWebappsDollarGet, options: MethodOptions): GaxiosPromise[Schema$WebApp] = js.native
  def get(
    params: ParamsDollarResourceDollarWebappsDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$WebApp]
  ): Unit = js.native
  /**
    * androidenterprise.webapps.insert
    * @desc Creates a new web app for the enterprise.
    * @alias androidenterprise.webapps.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.enterpriseId The ID of the enterprise.
    * @param {().WebApp} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[Schema$WebApp] = js.native
  def insert(callback: BodyResponseCallback[Schema$WebApp]): Unit = js.native
  def insert(params: ParamsDollarResourceDollarWebappsDollarInsert): GaxiosPromise[Schema$WebApp] = js.native
  def insert(
    params: ParamsDollarResourceDollarWebappsDollarInsert,
    callback: BodyResponseCallback[Schema$WebApp]
  ): Unit = js.native
  def insert(
    params: ParamsDollarResourceDollarWebappsDollarInsert,
    options: BodyResponseCallback[Schema$WebApp],
    callback: BodyResponseCallback[Schema$WebApp]
  ): Unit = js.native
  def insert(params: ParamsDollarResourceDollarWebappsDollarInsert, options: MethodOptions): GaxiosPromise[Schema$WebApp] = js.native
  def insert(
    params: ParamsDollarResourceDollarWebappsDollarInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$WebApp]
  ): Unit = js.native
  /**
    * androidenterprise.webapps.list
    * @desc Retrieves the details of all web apps for a given enterprise.
    * @alias androidenterprise.webapps.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.enterpriseId The ID of the enterprise.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$WebAppsListResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$WebAppsListResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarWebappsDollarList): GaxiosPromise[Schema$WebAppsListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarWebappsDollarList,
    callback: BodyResponseCallback[Schema$WebAppsListResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarWebappsDollarList,
    options: BodyResponseCallback[Schema$WebAppsListResponse],
    callback: BodyResponseCallback[Schema$WebAppsListResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarWebappsDollarList, options: MethodOptions): GaxiosPromise[Schema$WebAppsListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarWebappsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$WebAppsListResponse]
  ): Unit = js.native
  /**
    * androidenterprise.webapps.patch
    * @desc Updates an existing web app. This method supports patch semantics.
    * @alias androidenterprise.webapps.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.enterpriseId The ID of the enterprise.
    * @param {string} params.webAppId The ID of the web app.
    * @param {().WebApp} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[Schema$WebApp] = js.native
  def patch(callback: BodyResponseCallback[Schema$WebApp]): Unit = js.native
  def patch(params: ParamsDollarResourceDollarWebappsDollarPatch): GaxiosPromise[Schema$WebApp] = js.native
  def patch(
    params: ParamsDollarResourceDollarWebappsDollarPatch,
    callback: BodyResponseCallback[Schema$WebApp]
  ): Unit = js.native
  def patch(
    params: ParamsDollarResourceDollarWebappsDollarPatch,
    options: BodyResponseCallback[Schema$WebApp],
    callback: BodyResponseCallback[Schema$WebApp]
  ): Unit = js.native
  def patch(params: ParamsDollarResourceDollarWebappsDollarPatch, options: MethodOptions): GaxiosPromise[Schema$WebApp] = js.native
  def patch(
    params: ParamsDollarResourceDollarWebappsDollarPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$WebApp]
  ): Unit = js.native
  /**
    * androidenterprise.webapps.update
    * @desc Updates an existing web app.
    * @alias androidenterprise.webapps.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.enterpriseId The ID of the enterprise.
    * @param {string} params.webAppId The ID of the web app.
    * @param {().WebApp} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[Schema$WebApp] = js.native
  def update(callback: BodyResponseCallback[Schema$WebApp]): Unit = js.native
  def update(params: ParamsDollarResourceDollarWebappsDollarUpdate): GaxiosPromise[Schema$WebApp] = js.native
  def update(
    params: ParamsDollarResourceDollarWebappsDollarUpdate,
    callback: BodyResponseCallback[Schema$WebApp]
  ): Unit = js.native
  def update(
    params: ParamsDollarResourceDollarWebappsDollarUpdate,
    options: BodyResponseCallback[Schema$WebApp],
    callback: BodyResponseCallback[Schema$WebApp]
  ): Unit = js.native
  def update(params: ParamsDollarResourceDollarWebappsDollarUpdate, options: MethodOptions): GaxiosPromise[Schema$WebApp] = js.native
  def update(
    params: ParamsDollarResourceDollarWebappsDollarUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$WebApp]
  ): Unit = js.native
}

