package typings.googleapis.androidmanagementV1Mod.androidmanagementV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/androidmanagement/v1", "androidmanagement_v1.Resource$Enterprises$Webapps")
@js.native
class ResourceEnterprisesWebapps protected () extends StObject {
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
  def create(): GaxiosPromise[SchemaWebApp] = js.native
  def create(callback: BodyResponseCallback[SchemaWebApp]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaWebApp] = js.native
  def create(params: ParamsResourceEnterprisesWebappsCreate): GaxiosPromise[SchemaWebApp] = js.native
  def create(params: ParamsResourceEnterprisesWebappsCreate, callback: BodyResponseCallback[SchemaWebApp]): Unit = js.native
  def create(
    params: ParamsResourceEnterprisesWebappsCreate,
    options: BodyResponseCallback[SchemaWebApp],
    callback: BodyResponseCallback[SchemaWebApp]
  ): Unit = js.native
  def create(params: ParamsResourceEnterprisesWebappsCreate, options: MethodOptions): GaxiosPromise[SchemaWebApp] = js.native
  def create(
    params: ParamsResourceEnterprisesWebappsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaWebApp]
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
  def delete(): GaxiosPromise[SchemaEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceEnterprisesWebappsDelete): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceEnterprisesWebappsDelete, callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(
    params: ParamsResourceEnterprisesWebappsDelete,
    options: BodyResponseCallback[SchemaEmpty],
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceEnterprisesWebappsDelete, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceEnterprisesWebappsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
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
  def get(): GaxiosPromise[SchemaWebApp] = js.native
  def get(callback: BodyResponseCallback[SchemaWebApp]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaWebApp] = js.native
  def get(params: ParamsResourceEnterprisesWebappsGet): GaxiosPromise[SchemaWebApp] = js.native
  def get(params: ParamsResourceEnterprisesWebappsGet, callback: BodyResponseCallback[SchemaWebApp]): Unit = js.native
  def get(
    params: ParamsResourceEnterprisesWebappsGet,
    options: BodyResponseCallback[SchemaWebApp],
    callback: BodyResponseCallback[SchemaWebApp]
  ): Unit = js.native
  def get(params: ParamsResourceEnterprisesWebappsGet, options: MethodOptions): GaxiosPromise[SchemaWebApp] = js.native
  def get(
    params: ParamsResourceEnterprisesWebappsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaWebApp]
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
  def list(): GaxiosPromise[SchemaListWebAppsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListWebAppsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListWebAppsResponse] = js.native
  def list(params: ParamsResourceEnterprisesWebappsList): GaxiosPromise[SchemaListWebAppsResponse] = js.native
  def list(
    params: ParamsResourceEnterprisesWebappsList,
    callback: BodyResponseCallback[SchemaListWebAppsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceEnterprisesWebappsList,
    options: BodyResponseCallback[SchemaListWebAppsResponse],
    callback: BodyResponseCallback[SchemaListWebAppsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceEnterprisesWebappsList, options: MethodOptions): GaxiosPromise[SchemaListWebAppsResponse] = js.native
  def list(
    params: ParamsResourceEnterprisesWebappsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListWebAppsResponse]
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
  def patch(): GaxiosPromise[SchemaWebApp] = js.native
  def patch(callback: BodyResponseCallback[SchemaWebApp]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaWebApp] = js.native
  def patch(params: ParamsResourceEnterprisesWebappsPatch): GaxiosPromise[SchemaWebApp] = js.native
  def patch(params: ParamsResourceEnterprisesWebappsPatch, callback: BodyResponseCallback[SchemaWebApp]): Unit = js.native
  def patch(
    params: ParamsResourceEnterprisesWebappsPatch,
    options: BodyResponseCallback[SchemaWebApp],
    callback: BodyResponseCallback[SchemaWebApp]
  ): Unit = js.native
  def patch(params: ParamsResourceEnterprisesWebappsPatch, options: MethodOptions): GaxiosPromise[SchemaWebApp] = js.native
  def patch(
    params: ParamsResourceEnterprisesWebappsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaWebApp]
  ): Unit = js.native
}
