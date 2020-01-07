package typings.googleapis.buildSrcApisAndroidenterpriseV1Mod.androidenterprise_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/androidenterprise/v1", "androidenterprise_v1.Resource$Storelayoutpages")
@js.native
class Resource$Storelayoutpages protected () extends js.Object {
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
  def delete(params: ParamsDollarResourceDollarStorelayoutpagesDollarDelete): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsDollarResourceDollarStorelayoutpagesDollarDelete,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarStorelayoutpagesDollarDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(params: ParamsDollarResourceDollarStorelayoutpagesDollarDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsDollarResourceDollarStorelayoutpagesDollarDelete,
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
  def get(): GaxiosPromise[Schema$StorePage] = js.native
  def get(callback: BodyResponseCallback[Schema$StorePage]): Unit = js.native
  def get(params: ParamsDollarResourceDollarStorelayoutpagesDollarGet): GaxiosPromise[Schema$StorePage] = js.native
  def get(
    params: ParamsDollarResourceDollarStorelayoutpagesDollarGet,
    callback: BodyResponseCallback[Schema$StorePage]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarStorelayoutpagesDollarGet,
    options: BodyResponseCallback[Schema$StorePage],
    callback: BodyResponseCallback[Schema$StorePage]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarStorelayoutpagesDollarGet, options: MethodOptions): GaxiosPromise[Schema$StorePage] = js.native
  def get(
    params: ParamsDollarResourceDollarStorelayoutpagesDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$StorePage]
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
  def insert(): GaxiosPromise[Schema$StorePage] = js.native
  def insert(callback: BodyResponseCallback[Schema$StorePage]): Unit = js.native
  def insert(params: ParamsDollarResourceDollarStorelayoutpagesDollarInsert): GaxiosPromise[Schema$StorePage] = js.native
  def insert(
    params: ParamsDollarResourceDollarStorelayoutpagesDollarInsert,
    callback: BodyResponseCallback[Schema$StorePage]
  ): Unit = js.native
  def insert(
    params: ParamsDollarResourceDollarStorelayoutpagesDollarInsert,
    options: BodyResponseCallback[Schema$StorePage],
    callback: BodyResponseCallback[Schema$StorePage]
  ): Unit = js.native
  def insert(params: ParamsDollarResourceDollarStorelayoutpagesDollarInsert, options: MethodOptions): GaxiosPromise[Schema$StorePage] = js.native
  def insert(
    params: ParamsDollarResourceDollarStorelayoutpagesDollarInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$StorePage]
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
  def list(): GaxiosPromise[Schema$StoreLayoutPagesListResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$StoreLayoutPagesListResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarStorelayoutpagesDollarList): GaxiosPromise[Schema$StoreLayoutPagesListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarStorelayoutpagesDollarList,
    callback: BodyResponseCallback[Schema$StoreLayoutPagesListResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarStorelayoutpagesDollarList,
    options: BodyResponseCallback[Schema$StoreLayoutPagesListResponse],
    callback: BodyResponseCallback[Schema$StoreLayoutPagesListResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarStorelayoutpagesDollarList, options: MethodOptions): GaxiosPromise[Schema$StoreLayoutPagesListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarStorelayoutpagesDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$StoreLayoutPagesListResponse]
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
  def patch(): GaxiosPromise[Schema$StorePage] = js.native
  def patch(callback: BodyResponseCallback[Schema$StorePage]): Unit = js.native
  def patch(params: ParamsDollarResourceDollarStorelayoutpagesDollarPatch): GaxiosPromise[Schema$StorePage] = js.native
  def patch(
    params: ParamsDollarResourceDollarStorelayoutpagesDollarPatch,
    callback: BodyResponseCallback[Schema$StorePage]
  ): Unit = js.native
  def patch(
    params: ParamsDollarResourceDollarStorelayoutpagesDollarPatch,
    options: BodyResponseCallback[Schema$StorePage],
    callback: BodyResponseCallback[Schema$StorePage]
  ): Unit = js.native
  def patch(params: ParamsDollarResourceDollarStorelayoutpagesDollarPatch, options: MethodOptions): GaxiosPromise[Schema$StorePage] = js.native
  def patch(
    params: ParamsDollarResourceDollarStorelayoutpagesDollarPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$StorePage]
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
  def update(): GaxiosPromise[Schema$StorePage] = js.native
  def update(callback: BodyResponseCallback[Schema$StorePage]): Unit = js.native
  def update(params: ParamsDollarResourceDollarStorelayoutpagesDollarUpdate): GaxiosPromise[Schema$StorePage] = js.native
  def update(
    params: ParamsDollarResourceDollarStorelayoutpagesDollarUpdate,
    callback: BodyResponseCallback[Schema$StorePage]
  ): Unit = js.native
  def update(
    params: ParamsDollarResourceDollarStorelayoutpagesDollarUpdate,
    options: BodyResponseCallback[Schema$StorePage],
    callback: BodyResponseCallback[Schema$StorePage]
  ): Unit = js.native
  def update(params: ParamsDollarResourceDollarStorelayoutpagesDollarUpdate, options: MethodOptions): GaxiosPromise[Schema$StorePage] = js.native
  def update(
    params: ParamsDollarResourceDollarStorelayoutpagesDollarUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$StorePage]
  ): Unit = js.native
}

