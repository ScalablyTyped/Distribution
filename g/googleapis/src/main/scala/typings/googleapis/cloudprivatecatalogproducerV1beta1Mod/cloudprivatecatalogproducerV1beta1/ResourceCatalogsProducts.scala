package typings.googleapis.cloudprivatecatalogproducerV1beta1Mod.cloudprivatecatalogproducerV1beta1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/cloudprivatecatalogproducer/v1beta1", "cloudprivatecatalogproducer_v1beta1.Resource$Catalogs$Products")
@js.native
class ResourceCatalogsProducts protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  var icons: ResourceCatalogsProductsIcons = js.native
  var versions: ResourceCatalogsProductsVersions = js.native
  /**
    * cloudprivatecatalogproducer.catalogs.products.copy
    * @desc Copies a Product under another Catalog.
    * @alias cloudprivatecatalogproducer.catalogs.products.copy
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The resource name of the current product that is copied from.
    * @param {().GoogleCloudPrivatecatalogproducerV1beta1CopyProductRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def copy(): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def copy(callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]): Unit = js.native
  def copy(params: ParamsResourceCatalogsProductsCopy): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def copy(
    params: ParamsResourceCatalogsProductsCopy,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def copy(
    params: ParamsResourceCatalogsProductsCopy,
    options: BodyResponseCallback[SchemaGoogleLongrunningOperation],
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def copy(params: ParamsResourceCatalogsProductsCopy, options: MethodOptions): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def copy(
    params: ParamsResourceCatalogsProductsCopy,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  /**
    * cloudprivatecatalogproducer.catalogs.products.create
    * @desc Creates a Product instance under a given Catalog.
    * @alias cloudprivatecatalogproducer.catalogs.products.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.parent The catalog name of the new product's parent.
    * @param {().GoogleCloudPrivatecatalogproducerV1beta1Product} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[SchemaGoogleCloudPrivatecatalogproducerV1beta1Product] = js.native
  def create(callback: BodyResponseCallback[SchemaGoogleCloudPrivatecatalogproducerV1beta1Product]): Unit = js.native
  def create(params: ParamsResourceCatalogsProductsCreate): GaxiosPromise[SchemaGoogleCloudPrivatecatalogproducerV1beta1Product] = js.native
  def create(
    params: ParamsResourceCatalogsProductsCreate,
    callback: BodyResponseCallback[SchemaGoogleCloudPrivatecatalogproducerV1beta1Product]
  ): Unit = js.native
  def create(
    params: ParamsResourceCatalogsProductsCreate,
    options: BodyResponseCallback[SchemaGoogleCloudPrivatecatalogproducerV1beta1Product],
    callback: BodyResponseCallback[SchemaGoogleCloudPrivatecatalogproducerV1beta1Product]
  ): Unit = js.native
  def create(params: ParamsResourceCatalogsProductsCreate, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudPrivatecatalogproducerV1beta1Product] = js.native
  def create(
    params: ParamsResourceCatalogsProductsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudPrivatecatalogproducerV1beta1Product]
  ): Unit = js.native
  /**
    * cloudprivatecatalogproducer.catalogs.products.delete
    * @desc Hard deletes a Product.
    * @alias cloudprivatecatalogproducer.catalogs.products.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The resource name of the product.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]): Unit = js.native
  def delete(params: ParamsResourceCatalogsProductsDelete): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(
    params: ParamsResourceCatalogsProductsDelete,
    callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  def delete(
    params: ParamsResourceCatalogsProductsDelete,
    options: BodyResponseCallback[SchemaGoogleProtobufEmpty],
    callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceCatalogsProductsDelete, options: MethodOptions): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(
    params: ParamsResourceCatalogsProductsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  /**
    * cloudprivatecatalogproducer.catalogs.products.get
    * @desc Returns the requested Product resource.
    * @alias cloudprivatecatalogproducer.catalogs.products.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The resource name of the product.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaGoogleCloudPrivatecatalogproducerV1beta1Product] = js.native
  def get(callback: BodyResponseCallback[SchemaGoogleCloudPrivatecatalogproducerV1beta1Product]): Unit = js.native
  def get(params: ParamsResourceCatalogsProductsGet): GaxiosPromise[SchemaGoogleCloudPrivatecatalogproducerV1beta1Product] = js.native
  def get(
    params: ParamsResourceCatalogsProductsGet,
    callback: BodyResponseCallback[SchemaGoogleCloudPrivatecatalogproducerV1beta1Product]
  ): Unit = js.native
  def get(
    params: ParamsResourceCatalogsProductsGet,
    options: BodyResponseCallback[SchemaGoogleCloudPrivatecatalogproducerV1beta1Product],
    callback: BodyResponseCallback[SchemaGoogleCloudPrivatecatalogproducerV1beta1Product]
  ): Unit = js.native
  def get(params: ParamsResourceCatalogsProductsGet, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudPrivatecatalogproducerV1beta1Product] = js.native
  def get(
    params: ParamsResourceCatalogsProductsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudPrivatecatalogproducerV1beta1Product]
  ): Unit = js.native
  /**
    * cloudprivatecatalogproducer.catalogs.products.list
    * @desc Lists Product resources that the producer has access to, within the
    * scope of the parent catalog.
    * @alias cloudprivatecatalogproducer.catalogs.products.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.filter A filter expression used to restrict the returned results based upon properties of the product.
    * @param {integer=} params.pageSize The maximum number of products to return.
    * @param {string=} params.pageToken A pagination token returned from a previous call to ListProducts that indicates where this listing should continue from. This field is optional.
    * @param {string} params.parent The resource name of the parent resource.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaGoogleCloudPrivatecatalogproducerV1beta1ListProductsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaGoogleCloudPrivatecatalogproducerV1beta1ListProductsResponse]): Unit = js.native
  def list(params: ParamsResourceCatalogsProductsList): GaxiosPromise[SchemaGoogleCloudPrivatecatalogproducerV1beta1ListProductsResponse] = js.native
  def list(
    params: ParamsResourceCatalogsProductsList,
    callback: BodyResponseCallback[SchemaGoogleCloudPrivatecatalogproducerV1beta1ListProductsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceCatalogsProductsList,
    options: BodyResponseCallback[SchemaGoogleCloudPrivatecatalogproducerV1beta1ListProductsResponse],
    callback: BodyResponseCallback[SchemaGoogleCloudPrivatecatalogproducerV1beta1ListProductsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceCatalogsProductsList, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudPrivatecatalogproducerV1beta1ListProductsResponse] = js.native
  def list(
    params: ParamsResourceCatalogsProductsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudPrivatecatalogproducerV1beta1ListProductsResponse]
  ): Unit = js.native
  /**
    * cloudprivatecatalogproducer.catalogs.products.patch
    * @desc Updates a specific Product resource.
    * @alias cloudprivatecatalogproducer.catalogs.products.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Required. The resource name of the product in the format `catalogs/{catalog_id}/products/a-z*[a-z0-9]'.  A unique identifier for the product under a catalog, which cannot be changed after the product is created. The final segment of the name must between 1 and 256 characters in length.
    * @param {string=} params.updateMask Field mask that controls which fields of the product should be updated.
    * @param {().GoogleCloudPrivatecatalogproducerV1beta1Product} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[SchemaGoogleCloudPrivatecatalogproducerV1beta1Product] = js.native
  def patch(callback: BodyResponseCallback[SchemaGoogleCloudPrivatecatalogproducerV1beta1Product]): Unit = js.native
  def patch(params: ParamsResourceCatalogsProductsPatch): GaxiosPromise[SchemaGoogleCloudPrivatecatalogproducerV1beta1Product] = js.native
  def patch(
    params: ParamsResourceCatalogsProductsPatch,
    callback: BodyResponseCallback[SchemaGoogleCloudPrivatecatalogproducerV1beta1Product]
  ): Unit = js.native
  def patch(
    params: ParamsResourceCatalogsProductsPatch,
    options: BodyResponseCallback[SchemaGoogleCloudPrivatecatalogproducerV1beta1Product],
    callback: BodyResponseCallback[SchemaGoogleCloudPrivatecatalogproducerV1beta1Product]
  ): Unit = js.native
  def patch(params: ParamsResourceCatalogsProductsPatch, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudPrivatecatalogproducerV1beta1Product] = js.native
  def patch(
    params: ParamsResourceCatalogsProductsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudPrivatecatalogproducerV1beta1Product]
  ): Unit = js.native
}

