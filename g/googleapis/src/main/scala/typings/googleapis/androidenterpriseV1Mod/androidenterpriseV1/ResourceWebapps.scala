package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/androidenterprise/v1", "androidenterprise_v1.Resource$Webapps")
@js.native
class ResourceWebapps protected () extends StObject {
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
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceWebappsDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceWebappsDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourceWebappsDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceWebappsDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceWebappsDelete, options: MethodOptions, callback: BodyResponseCallback[Unit]): Unit = js.native
  
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
  def get(): GaxiosPromise[SchemaWebApp] = js.native
  def get(callback: BodyResponseCallback[SchemaWebApp]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaWebApp] = js.native
  def get(params: ParamsResourceWebappsGet): GaxiosPromise[SchemaWebApp] = js.native
  def get(params: ParamsResourceWebappsGet, callback: BodyResponseCallback[SchemaWebApp]): Unit = js.native
  def get(
    params: ParamsResourceWebappsGet,
    options: BodyResponseCallback[SchemaWebApp],
    callback: BodyResponseCallback[SchemaWebApp]
  ): Unit = js.native
  def get(params: ParamsResourceWebappsGet, options: MethodOptions): GaxiosPromise[SchemaWebApp] = js.native
  def get(
    params: ParamsResourceWebappsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaWebApp]
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
  def insert(): GaxiosPromise[SchemaWebApp] = js.native
  def insert(callback: BodyResponseCallback[SchemaWebApp]): Unit = js.native
  def insert(params: Unit, options: MethodOptions): GaxiosPromise[SchemaWebApp] = js.native
  def insert(params: ParamsResourceWebappsInsert): GaxiosPromise[SchemaWebApp] = js.native
  def insert(params: ParamsResourceWebappsInsert, callback: BodyResponseCallback[SchemaWebApp]): Unit = js.native
  def insert(
    params: ParamsResourceWebappsInsert,
    options: BodyResponseCallback[SchemaWebApp],
    callback: BodyResponseCallback[SchemaWebApp]
  ): Unit = js.native
  def insert(params: ParamsResourceWebappsInsert, options: MethodOptions): GaxiosPromise[SchemaWebApp] = js.native
  def insert(
    params: ParamsResourceWebappsInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaWebApp]
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
  def list(): GaxiosPromise[SchemaWebAppsListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaWebAppsListResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaWebAppsListResponse] = js.native
  def list(params: ParamsResourceWebappsList): GaxiosPromise[SchemaWebAppsListResponse] = js.native
  def list(params: ParamsResourceWebappsList, callback: BodyResponseCallback[SchemaWebAppsListResponse]): Unit = js.native
  def list(
    params: ParamsResourceWebappsList,
    options: BodyResponseCallback[SchemaWebAppsListResponse],
    callback: BodyResponseCallback[SchemaWebAppsListResponse]
  ): Unit = js.native
  def list(params: ParamsResourceWebappsList, options: MethodOptions): GaxiosPromise[SchemaWebAppsListResponse] = js.native
  def list(
    params: ParamsResourceWebappsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaWebAppsListResponse]
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
  def patch(): GaxiosPromise[SchemaWebApp] = js.native
  def patch(callback: BodyResponseCallback[SchemaWebApp]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaWebApp] = js.native
  def patch(params: ParamsResourceWebappsPatch): GaxiosPromise[SchemaWebApp] = js.native
  def patch(params: ParamsResourceWebappsPatch, callback: BodyResponseCallback[SchemaWebApp]): Unit = js.native
  def patch(
    params: ParamsResourceWebappsPatch,
    options: BodyResponseCallback[SchemaWebApp],
    callback: BodyResponseCallback[SchemaWebApp]
  ): Unit = js.native
  def patch(params: ParamsResourceWebappsPatch, options: MethodOptions): GaxiosPromise[SchemaWebApp] = js.native
  def patch(
    params: ParamsResourceWebappsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaWebApp]
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
  def update(): GaxiosPromise[SchemaWebApp] = js.native
  def update(callback: BodyResponseCallback[SchemaWebApp]): Unit = js.native
  def update(params: Unit, options: MethodOptions): GaxiosPromise[SchemaWebApp] = js.native
  def update(params: ParamsResourceWebappsUpdate): GaxiosPromise[SchemaWebApp] = js.native
  def update(params: ParamsResourceWebappsUpdate, callback: BodyResponseCallback[SchemaWebApp]): Unit = js.native
  def update(
    params: ParamsResourceWebappsUpdate,
    options: BodyResponseCallback[SchemaWebApp],
    callback: BodyResponseCallback[SchemaWebApp]
  ): Unit = js.native
  def update(params: ParamsResourceWebappsUpdate, options: MethodOptions): GaxiosPromise[SchemaWebApp] = js.native
  def update(
    params: ParamsResourceWebappsUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaWebApp]
  ): Unit = js.native
}
