package typings.googleapis.androidpublisherV3Mod.androidpublisherV3

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/androidpublisher/v3", "androidpublisher_v3.Resource$Inappproducts")
@js.native
class ResourceInappproducts protected () extends js.Object {
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
  def delete(params: ParamsResourceInappproductsDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceInappproductsDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourceInappproductsDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceInappproductsDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsResourceInappproductsDelete,
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
  def get(): GaxiosPromise[SchemaInAppProduct] = js.native
  def get(callback: BodyResponseCallback[SchemaInAppProduct]): Unit = js.native
  def get(params: ParamsResourceInappproductsGet): GaxiosPromise[SchemaInAppProduct] = js.native
  def get(params: ParamsResourceInappproductsGet, callback: BodyResponseCallback[SchemaInAppProduct]): Unit = js.native
  def get(
    params: ParamsResourceInappproductsGet,
    options: BodyResponseCallback[SchemaInAppProduct],
    callback: BodyResponseCallback[SchemaInAppProduct]
  ): Unit = js.native
  def get(params: ParamsResourceInappproductsGet, options: MethodOptions): GaxiosPromise[SchemaInAppProduct] = js.native
  def get(
    params: ParamsResourceInappproductsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaInAppProduct]
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
  def insert(): GaxiosPromise[SchemaInAppProduct] = js.native
  def insert(callback: BodyResponseCallback[SchemaInAppProduct]): Unit = js.native
  def insert(params: ParamsResourceInappproductsInsert): GaxiosPromise[SchemaInAppProduct] = js.native
  def insert(params: ParamsResourceInappproductsInsert, callback: BodyResponseCallback[SchemaInAppProduct]): Unit = js.native
  def insert(
    params: ParamsResourceInappproductsInsert,
    options: BodyResponseCallback[SchemaInAppProduct],
    callback: BodyResponseCallback[SchemaInAppProduct]
  ): Unit = js.native
  def insert(params: ParamsResourceInappproductsInsert, options: MethodOptions): GaxiosPromise[SchemaInAppProduct] = js.native
  def insert(
    params: ParamsResourceInappproductsInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaInAppProduct]
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
  def list(): GaxiosPromise[SchemaInappproductsListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaInappproductsListResponse]): Unit = js.native
  def list(params: ParamsResourceInappproductsList): GaxiosPromise[SchemaInappproductsListResponse] = js.native
  def list(
    params: ParamsResourceInappproductsList,
    callback: BodyResponseCallback[SchemaInappproductsListResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceInappproductsList,
    options: BodyResponseCallback[SchemaInappproductsListResponse],
    callback: BodyResponseCallback[SchemaInappproductsListResponse]
  ): Unit = js.native
  def list(params: ParamsResourceInappproductsList, options: MethodOptions): GaxiosPromise[SchemaInappproductsListResponse] = js.native
  def list(
    params: ParamsResourceInappproductsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaInappproductsListResponse]
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
  def patch(): GaxiosPromise[SchemaInAppProduct] = js.native
  def patch(callback: BodyResponseCallback[SchemaInAppProduct]): Unit = js.native
  def patch(params: ParamsResourceInappproductsPatch): GaxiosPromise[SchemaInAppProduct] = js.native
  def patch(params: ParamsResourceInappproductsPatch, callback: BodyResponseCallback[SchemaInAppProduct]): Unit = js.native
  def patch(
    params: ParamsResourceInappproductsPatch,
    options: BodyResponseCallback[SchemaInAppProduct],
    callback: BodyResponseCallback[SchemaInAppProduct]
  ): Unit = js.native
  def patch(params: ParamsResourceInappproductsPatch, options: MethodOptions): GaxiosPromise[SchemaInAppProduct] = js.native
  def patch(
    params: ParamsResourceInappproductsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaInAppProduct]
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
  def update(): GaxiosPromise[SchemaInAppProduct] = js.native
  def update(callback: BodyResponseCallback[SchemaInAppProduct]): Unit = js.native
  def update(params: ParamsResourceInappproductsUpdate): GaxiosPromise[SchemaInAppProduct] = js.native
  def update(params: ParamsResourceInappproductsUpdate, callback: BodyResponseCallback[SchemaInAppProduct]): Unit = js.native
  def update(
    params: ParamsResourceInappproductsUpdate,
    options: BodyResponseCallback[SchemaInAppProduct],
    callback: BodyResponseCallback[SchemaInAppProduct]
  ): Unit = js.native
  def update(params: ParamsResourceInappproductsUpdate, options: MethodOptions): GaxiosPromise[SchemaInAppProduct] = js.native
  def update(
    params: ParamsResourceInappproductsUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaInAppProduct]
  ): Unit = js.native
}

