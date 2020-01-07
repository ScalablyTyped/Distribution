package typings.googleapis.buildSrcApisCloudprivatecatalogproducerV1beta1Mod.cloudprivatecatalogproducer_v1beta1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/cloudprivatecatalogproducer/v1beta1", "cloudprivatecatalogproducer_v1beta1.Resource$Catalogs$Products")
@js.native
class ResourceDollarCatalogsDollarProducts protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  var icons: ResourceDollarCatalogsDollarProductsDollarIcons = js.native
  var versions: ResourceDollarCatalogsDollarProductsDollarVersions = js.native
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
  def copy(): GaxiosPromise[Schema$GoogleLongrunningOperation] = js.native
  def copy(callback: BodyResponseCallback[Schema$GoogleLongrunningOperation]): Unit = js.native
  def copy(params: ParamsDollarResourceDollarCatalogsDollarProductsDollarCopy): GaxiosPromise[Schema$GoogleLongrunningOperation] = js.native
  def copy(
    params: ParamsDollarResourceDollarCatalogsDollarProductsDollarCopy,
    callback: BodyResponseCallback[Schema$GoogleLongrunningOperation]
  ): Unit = js.native
  def copy(
    params: ParamsDollarResourceDollarCatalogsDollarProductsDollarCopy,
    options: BodyResponseCallback[Schema$GoogleLongrunningOperation],
    callback: BodyResponseCallback[Schema$GoogleLongrunningOperation]
  ): Unit = js.native
  def copy(params: ParamsDollarResourceDollarCatalogsDollarProductsDollarCopy, options: MethodOptions): GaxiosPromise[Schema$GoogleLongrunningOperation] = js.native
  def copy(
    params: ParamsDollarResourceDollarCatalogsDollarProductsDollarCopy,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$GoogleLongrunningOperation]
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
  def create(): GaxiosPromise[Schema$GoogleCloudPrivatecatalogproducerV1beta1Product] = js.native
  def create(callback: BodyResponseCallback[Schema$GoogleCloudPrivatecatalogproducerV1beta1Product]): Unit = js.native
  def create(params: ParamsDollarResourceDollarCatalogsDollarProductsDollarCreate): GaxiosPromise[Schema$GoogleCloudPrivatecatalogproducerV1beta1Product] = js.native
  def create(
    params: ParamsDollarResourceDollarCatalogsDollarProductsDollarCreate,
    callback: BodyResponseCallback[Schema$GoogleCloudPrivatecatalogproducerV1beta1Product]
  ): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarCatalogsDollarProductsDollarCreate,
    options: BodyResponseCallback[Schema$GoogleCloudPrivatecatalogproducerV1beta1Product],
    callback: BodyResponseCallback[Schema$GoogleCloudPrivatecatalogproducerV1beta1Product]
  ): Unit = js.native
  def create(params: ParamsDollarResourceDollarCatalogsDollarProductsDollarCreate, options: MethodOptions): GaxiosPromise[Schema$GoogleCloudPrivatecatalogproducerV1beta1Product] = js.native
  def create(
    params: ParamsDollarResourceDollarCatalogsDollarProductsDollarCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$GoogleCloudPrivatecatalogproducerV1beta1Product]
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
  def delete(): GaxiosPromise[Schema$GoogleProtobufEmpty] = js.native
  def delete(callback: BodyResponseCallback[Schema$GoogleProtobufEmpty]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarCatalogsDollarProductsDollarDelete): GaxiosPromise[Schema$GoogleProtobufEmpty] = js.native
  def delete(
    params: ParamsDollarResourceDollarCatalogsDollarProductsDollarDelete,
    callback: BodyResponseCallback[Schema$GoogleProtobufEmpty]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarCatalogsDollarProductsDollarDelete,
    options: BodyResponseCallback[Schema$GoogleProtobufEmpty],
    callback: BodyResponseCallback[Schema$GoogleProtobufEmpty]
  ): Unit = js.native
  def delete(params: ParamsDollarResourceDollarCatalogsDollarProductsDollarDelete, options: MethodOptions): GaxiosPromise[Schema$GoogleProtobufEmpty] = js.native
  def delete(
    params: ParamsDollarResourceDollarCatalogsDollarProductsDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$GoogleProtobufEmpty]
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
  def get(): GaxiosPromise[Schema$GoogleCloudPrivatecatalogproducerV1beta1Product] = js.native
  def get(callback: BodyResponseCallback[Schema$GoogleCloudPrivatecatalogproducerV1beta1Product]): Unit = js.native
  def get(params: ParamsDollarResourceDollarCatalogsDollarProductsDollarGet): GaxiosPromise[Schema$GoogleCloudPrivatecatalogproducerV1beta1Product] = js.native
  def get(
    params: ParamsDollarResourceDollarCatalogsDollarProductsDollarGet,
    callback: BodyResponseCallback[Schema$GoogleCloudPrivatecatalogproducerV1beta1Product]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarCatalogsDollarProductsDollarGet,
    options: BodyResponseCallback[Schema$GoogleCloudPrivatecatalogproducerV1beta1Product],
    callback: BodyResponseCallback[Schema$GoogleCloudPrivatecatalogproducerV1beta1Product]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarCatalogsDollarProductsDollarGet, options: MethodOptions): GaxiosPromise[Schema$GoogleCloudPrivatecatalogproducerV1beta1Product] = js.native
  def get(
    params: ParamsDollarResourceDollarCatalogsDollarProductsDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$GoogleCloudPrivatecatalogproducerV1beta1Product]
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
  def list(): GaxiosPromise[Schema$GoogleCloudPrivatecatalogproducerV1beta1ListProductsResponse] = js.native
  def list(
    callback: BodyResponseCallback[Schema$GoogleCloudPrivatecatalogproducerV1beta1ListProductsResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarCatalogsDollarProductsDollarList): GaxiosPromise[Schema$GoogleCloudPrivatecatalogproducerV1beta1ListProductsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarCatalogsDollarProductsDollarList,
    callback: BodyResponseCallback[Schema$GoogleCloudPrivatecatalogproducerV1beta1ListProductsResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarCatalogsDollarProductsDollarList,
    options: BodyResponseCallback[Schema$GoogleCloudPrivatecatalogproducerV1beta1ListProductsResponse],
    callback: BodyResponseCallback[Schema$GoogleCloudPrivatecatalogproducerV1beta1ListProductsResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarCatalogsDollarProductsDollarList, options: MethodOptions): GaxiosPromise[Schema$GoogleCloudPrivatecatalogproducerV1beta1ListProductsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarCatalogsDollarProductsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$GoogleCloudPrivatecatalogproducerV1beta1ListProductsResponse]
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
  def patch(): GaxiosPromise[Schema$GoogleCloudPrivatecatalogproducerV1beta1Product] = js.native
  def patch(callback: BodyResponseCallback[Schema$GoogleCloudPrivatecatalogproducerV1beta1Product]): Unit = js.native
  def patch(params: ParamsDollarResourceDollarCatalogsDollarProductsDollarPatch): GaxiosPromise[Schema$GoogleCloudPrivatecatalogproducerV1beta1Product] = js.native
  def patch(
    params: ParamsDollarResourceDollarCatalogsDollarProductsDollarPatch,
    callback: BodyResponseCallback[Schema$GoogleCloudPrivatecatalogproducerV1beta1Product]
  ): Unit = js.native
  def patch(
    params: ParamsDollarResourceDollarCatalogsDollarProductsDollarPatch,
    options: BodyResponseCallback[Schema$GoogleCloudPrivatecatalogproducerV1beta1Product],
    callback: BodyResponseCallback[Schema$GoogleCloudPrivatecatalogproducerV1beta1Product]
  ): Unit = js.native
  def patch(params: ParamsDollarResourceDollarCatalogsDollarProductsDollarPatch, options: MethodOptions): GaxiosPromise[Schema$GoogleCloudPrivatecatalogproducerV1beta1Product] = js.native
  def patch(
    params: ParamsDollarResourceDollarCatalogsDollarProductsDollarPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$GoogleCloudPrivatecatalogproducerV1beta1Product]
  ): Unit = js.native
}

