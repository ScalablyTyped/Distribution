package typings.googleapis.buildSrcApisAndroidpublisherV3Mod.androidpublisher_v3

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/androidpublisher/v3", "androidpublisher_v3.Resource$Inappproducts")
@js.native
class Resource$Inappproducts protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * androidpublisher.inappproducts.delete
    * @desc Delete an in-app product for an app.
    * @alias androidpublisher.inappproducts.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.packageName Unique identifier for the Android app with the in-app product; for example, "com.spiffygame".
    * @param {string} params.sku Unique identifier for the in-app product.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarInappproductsDollarDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsDollarResourceDollarInappproductsDollarDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarInappproductsDollarDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(params: ParamsDollarResourceDollarInappproductsDollarDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsDollarResourceDollarInappproductsDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * androidpublisher.inappproducts.get
    * @desc Returns information about the in-app product specified.
    * @alias androidpublisher.inappproducts.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.packageName
    * @param {string} params.sku Unique identifier for the in-app product.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$InAppProduct] = js.native
  def get(callback: BodyResponseCallback[Schema$InAppProduct]): Unit = js.native
  def get(params: ParamsDollarResourceDollarInappproductsDollarGet): GaxiosPromise[Schema$InAppProduct] = js.native
  def get(
    params: ParamsDollarResourceDollarInappproductsDollarGet,
    callback: BodyResponseCallback[Schema$InAppProduct]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarInappproductsDollarGet,
    options: BodyResponseCallback[Schema$InAppProduct],
    callback: BodyResponseCallback[Schema$InAppProduct]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarInappproductsDollarGet, options: MethodOptions): GaxiosPromise[Schema$InAppProduct] = js.native
  def get(
    params: ParamsDollarResourceDollarInappproductsDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$InAppProduct]
  ): Unit = js.native
  /**
    * androidpublisher.inappproducts.insert
    * @desc Creates a new in-app product for an app.
    * @alias androidpublisher.inappproducts.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {boolean=} params.autoConvertMissingPrices If true the prices for all regions targeted by the parent app that don't have a price specified for this in-app product will be auto converted to the target currency based on the default price. Defaults to false.
    * @param {string} params.packageName Unique identifier for the Android app; for example, "com.spiffygame".
    * @param {().InAppProduct} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[Schema$InAppProduct] = js.native
  def insert(callback: BodyResponseCallback[Schema$InAppProduct]): Unit = js.native
  def insert(params: ParamsDollarResourceDollarInappproductsDollarInsert): GaxiosPromise[Schema$InAppProduct] = js.native
  def insert(
    params: ParamsDollarResourceDollarInappproductsDollarInsert,
    callback: BodyResponseCallback[Schema$InAppProduct]
  ): Unit = js.native
  def insert(
    params: ParamsDollarResourceDollarInappproductsDollarInsert,
    options: BodyResponseCallback[Schema$InAppProduct],
    callback: BodyResponseCallback[Schema$InAppProduct]
  ): Unit = js.native
  def insert(params: ParamsDollarResourceDollarInappproductsDollarInsert, options: MethodOptions): GaxiosPromise[Schema$InAppProduct] = js.native
  def insert(
    params: ParamsDollarResourceDollarInappproductsDollarInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$InAppProduct]
  ): Unit = js.native
  /**
    * androidpublisher.inappproducts.list
    * @desc List all the in-app products for an Android app, both subscriptions
    * and managed in-app products..
    * @alias androidpublisher.inappproducts.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer=} params.maxResults
    * @param {string} params.packageName Unique identifier for the Android app with in-app products; for example, "com.spiffygame".
    * @param {integer=} params.startIndex
    * @param {string=} params.token
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$InappproductsListResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$InappproductsListResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarInappproductsDollarList): GaxiosPromise[Schema$InappproductsListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarInappproductsDollarList,
    callback: BodyResponseCallback[Schema$InappproductsListResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarInappproductsDollarList,
    options: BodyResponseCallback[Schema$InappproductsListResponse],
    callback: BodyResponseCallback[Schema$InappproductsListResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarInappproductsDollarList, options: MethodOptions): GaxiosPromise[Schema$InappproductsListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarInappproductsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$InappproductsListResponse]
  ): Unit = js.native
  /**
    * androidpublisher.inappproducts.patch
    * @desc Updates the details of an in-app product. This method supports
    * patch semantics.
    * @alias androidpublisher.inappproducts.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {boolean=} params.autoConvertMissingPrices If true the prices for all regions targeted by the parent app that don't have a price specified for this in-app product will be auto converted to the target currency based on the default price. Defaults to false.
    * @param {string} params.packageName Unique identifier for the Android app with the in-app product; for example, "com.spiffygame".
    * @param {string} params.sku Unique identifier for the in-app product.
    * @param {().InAppProduct} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[Schema$InAppProduct] = js.native
  def patch(callback: BodyResponseCallback[Schema$InAppProduct]): Unit = js.native
  def patch(params: ParamsDollarResourceDollarInappproductsDollarPatch): GaxiosPromise[Schema$InAppProduct] = js.native
  def patch(
    params: ParamsDollarResourceDollarInappproductsDollarPatch,
    callback: BodyResponseCallback[Schema$InAppProduct]
  ): Unit = js.native
  def patch(
    params: ParamsDollarResourceDollarInappproductsDollarPatch,
    options: BodyResponseCallback[Schema$InAppProduct],
    callback: BodyResponseCallback[Schema$InAppProduct]
  ): Unit = js.native
  def patch(params: ParamsDollarResourceDollarInappproductsDollarPatch, options: MethodOptions): GaxiosPromise[Schema$InAppProduct] = js.native
  def patch(
    params: ParamsDollarResourceDollarInappproductsDollarPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$InAppProduct]
  ): Unit = js.native
  /**
    * androidpublisher.inappproducts.update
    * @desc Updates the details of an in-app product.
    * @alias androidpublisher.inappproducts.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {boolean=} params.autoConvertMissingPrices If true the prices for all regions targeted by the parent app that don't have a price specified for this in-app product will be auto converted to the target currency based on the default price. Defaults to false.
    * @param {string} params.packageName Unique identifier for the Android app with the in-app product; for example, "com.spiffygame".
    * @param {string} params.sku Unique identifier for the in-app product.
    * @param {().InAppProduct} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[Schema$InAppProduct] = js.native
  def update(callback: BodyResponseCallback[Schema$InAppProduct]): Unit = js.native
  def update(params: ParamsDollarResourceDollarInappproductsDollarUpdate): GaxiosPromise[Schema$InAppProduct] = js.native
  def update(
    params: ParamsDollarResourceDollarInappproductsDollarUpdate,
    callback: BodyResponseCallback[Schema$InAppProduct]
  ): Unit = js.native
  def update(
    params: ParamsDollarResourceDollarInappproductsDollarUpdate,
    options: BodyResponseCallback[Schema$InAppProduct],
    callback: BodyResponseCallback[Schema$InAppProduct]
  ): Unit = js.native
  def update(params: ParamsDollarResourceDollarInappproductsDollarUpdate, options: MethodOptions): GaxiosPromise[Schema$InAppProduct] = js.native
  def update(
    params: ParamsDollarResourceDollarInappproductsDollarUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$InAppProduct]
  ): Unit = js.native
}

