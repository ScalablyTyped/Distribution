package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/androidenterprise/v1", "androidenterprise_v1.Resource$Storelayoutpages")
@js.native
class ResourceStorelayoutpages protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * androidenterprise.storelayoutpages.delete
    * @desc Deletes a store page.
    * @alias androidenterprise.storelayoutpages.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.enterpriseId The ID of the enterprise.
    * @param {string} params.pageId The ID of the page.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceStorelayoutpagesDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceStorelayoutpagesDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourceStorelayoutpagesDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceStorelayoutpagesDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsResourceStorelayoutpagesDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  
  /**
    * androidenterprise.storelayoutpages.get
    * @desc Retrieves details of a store page.
    * @alias androidenterprise.storelayoutpages.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.enterpriseId The ID of the enterprise.
    * @param {string} params.pageId The ID of the page.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaStorePage] = js.native
  def get(callback: BodyResponseCallback[SchemaStorePage]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaStorePage] = js.native
  def get(params: ParamsResourceStorelayoutpagesGet): GaxiosPromise[SchemaStorePage] = js.native
  def get(params: ParamsResourceStorelayoutpagesGet, callback: BodyResponseCallback[SchemaStorePage]): Unit = js.native
  def get(
    params: ParamsResourceStorelayoutpagesGet,
    options: BodyResponseCallback[SchemaStorePage],
    callback: BodyResponseCallback[SchemaStorePage]
  ): Unit = js.native
  def get(params: ParamsResourceStorelayoutpagesGet, options: MethodOptions): GaxiosPromise[SchemaStorePage] = js.native
  def get(
    params: ParamsResourceStorelayoutpagesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaStorePage]
  ): Unit = js.native
  
  /**
    * androidenterprise.storelayoutpages.insert
    * @desc Inserts a new store page.
    * @alias androidenterprise.storelayoutpages.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.enterpriseId The ID of the enterprise.
    * @param {().StorePage} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[SchemaStorePage] = js.native
  def insert(callback: BodyResponseCallback[SchemaStorePage]): Unit = js.native
  def insert(params: Unit, options: MethodOptions): GaxiosPromise[SchemaStorePage] = js.native
  def insert(params: ParamsResourceStorelayoutpagesInsert): GaxiosPromise[SchemaStorePage] = js.native
  def insert(params: ParamsResourceStorelayoutpagesInsert, callback: BodyResponseCallback[SchemaStorePage]): Unit = js.native
  def insert(
    params: ParamsResourceStorelayoutpagesInsert,
    options: BodyResponseCallback[SchemaStorePage],
    callback: BodyResponseCallback[SchemaStorePage]
  ): Unit = js.native
  def insert(params: ParamsResourceStorelayoutpagesInsert, options: MethodOptions): GaxiosPromise[SchemaStorePage] = js.native
  def insert(
    params: ParamsResourceStorelayoutpagesInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaStorePage]
  ): Unit = js.native
  
  /**
    * androidenterprise.storelayoutpages.list
    * @desc Retrieves the details of all pages in the store.
    * @alias androidenterprise.storelayoutpages.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.enterpriseId The ID of the enterprise.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaStoreLayoutPagesListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaStoreLayoutPagesListResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaStoreLayoutPagesListResponse] = js.native
  def list(params: ParamsResourceStorelayoutpagesList): GaxiosPromise[SchemaStoreLayoutPagesListResponse] = js.native
  def list(
    params: ParamsResourceStorelayoutpagesList,
    callback: BodyResponseCallback[SchemaStoreLayoutPagesListResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceStorelayoutpagesList,
    options: BodyResponseCallback[SchemaStoreLayoutPagesListResponse],
    callback: BodyResponseCallback[SchemaStoreLayoutPagesListResponse]
  ): Unit = js.native
  def list(params: ParamsResourceStorelayoutpagesList, options: MethodOptions): GaxiosPromise[SchemaStoreLayoutPagesListResponse] = js.native
  def list(
    params: ParamsResourceStorelayoutpagesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaStoreLayoutPagesListResponse]
  ): Unit = js.native
  
  /**
    * androidenterprise.storelayoutpages.patch
    * @desc Updates the content of a store page. This method supports patch
    * semantics.
    * @alias androidenterprise.storelayoutpages.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.enterpriseId The ID of the enterprise.
    * @param {string} params.pageId The ID of the page.
    * @param {().StorePage} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[SchemaStorePage] = js.native
  def patch(callback: BodyResponseCallback[SchemaStorePage]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaStorePage] = js.native
  def patch(params: ParamsResourceStorelayoutpagesPatch): GaxiosPromise[SchemaStorePage] = js.native
  def patch(params: ParamsResourceStorelayoutpagesPatch, callback: BodyResponseCallback[SchemaStorePage]): Unit = js.native
  def patch(
    params: ParamsResourceStorelayoutpagesPatch,
    options: BodyResponseCallback[SchemaStorePage],
    callback: BodyResponseCallback[SchemaStorePage]
  ): Unit = js.native
  def patch(params: ParamsResourceStorelayoutpagesPatch, options: MethodOptions): GaxiosPromise[SchemaStorePage] = js.native
  def patch(
    params: ParamsResourceStorelayoutpagesPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaStorePage]
  ): Unit = js.native
  
  /**
    * androidenterprise.storelayoutpages.update
    * @desc Updates the content of a store page.
    * @alias androidenterprise.storelayoutpages.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.enterpriseId The ID of the enterprise.
    * @param {string} params.pageId The ID of the page.
    * @param {().StorePage} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[SchemaStorePage] = js.native
  def update(callback: BodyResponseCallback[SchemaStorePage]): Unit = js.native
  def update(params: Unit, options: MethodOptions): GaxiosPromise[SchemaStorePage] = js.native
  def update(params: ParamsResourceStorelayoutpagesUpdate): GaxiosPromise[SchemaStorePage] = js.native
  def update(params: ParamsResourceStorelayoutpagesUpdate, callback: BodyResponseCallback[SchemaStorePage]): Unit = js.native
  def update(
    params: ParamsResourceStorelayoutpagesUpdate,
    options: BodyResponseCallback[SchemaStorePage],
    callback: BodyResponseCallback[SchemaStorePage]
  ): Unit = js.native
  def update(params: ParamsResourceStorelayoutpagesUpdate, options: MethodOptions): GaxiosPromise[SchemaStorePage] = js.native
  def update(
    params: ParamsResourceStorelayoutpagesUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaStorePage]
  ): Unit = js.native
}
