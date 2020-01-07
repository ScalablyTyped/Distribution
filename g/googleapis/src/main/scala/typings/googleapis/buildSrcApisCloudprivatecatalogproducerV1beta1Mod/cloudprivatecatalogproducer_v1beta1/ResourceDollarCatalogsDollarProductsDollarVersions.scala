package typings.googleapis.buildSrcApisCloudprivatecatalogproducerV1beta1Mod.cloudprivatecatalogproducer_v1beta1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/cloudprivatecatalogproducer/v1beta1", "cloudprivatecatalogproducer_v1beta1.Resource$Catalogs$Products$Versions")
@js.native
class ResourceDollarCatalogsDollarProductsDollarVersions protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * cloudprivatecatalogproducer.catalogs.products.versions.create
    * @desc Creates a Version instance under a given Product.
    * @alias cloudprivatecatalogproducer.catalogs.products.versions.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.parent The product name of the new version's parent.
    * @param {().GoogleCloudPrivatecatalogproducerV1beta1Version} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[Schema$GoogleLongrunningOperation] = js.native
  def create(callback: BodyResponseCallback[Schema$GoogleLongrunningOperation]): Unit = js.native
  def create(params: ParamsDollarResourceDollarCatalogsDollarProductsDollarVersionsDollarCreate): GaxiosPromise[Schema$GoogleLongrunningOperation] = js.native
  def create(
    params: ParamsDollarResourceDollarCatalogsDollarProductsDollarVersionsDollarCreate,
    callback: BodyResponseCallback[Schema$GoogleLongrunningOperation]
  ): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarCatalogsDollarProductsDollarVersionsDollarCreate,
    options: BodyResponseCallback[Schema$GoogleLongrunningOperation],
    callback: BodyResponseCallback[Schema$GoogleLongrunningOperation]
  ): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarCatalogsDollarProductsDollarVersionsDollarCreate,
    options: MethodOptions
  ): GaxiosPromise[Schema$GoogleLongrunningOperation] = js.native
  def create(
    params: ParamsDollarResourceDollarCatalogsDollarProductsDollarVersionsDollarCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$GoogleLongrunningOperation]
  ): Unit = js.native
  /**
    * cloudprivatecatalogproducer.catalogs.products.versions.delete
    * @desc Hard deletes a Version.
    * @alias cloudprivatecatalogproducer.catalogs.products.versions.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The resource name of the version.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Schema$GoogleProtobufEmpty] = js.native
  def delete(callback: BodyResponseCallback[Schema$GoogleProtobufEmpty]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarCatalogsDollarProductsDollarVersionsDollarDelete): GaxiosPromise[Schema$GoogleProtobufEmpty] = js.native
  def delete(
    params: ParamsDollarResourceDollarCatalogsDollarProductsDollarVersionsDollarDelete,
    callback: BodyResponseCallback[Schema$GoogleProtobufEmpty]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarCatalogsDollarProductsDollarVersionsDollarDelete,
    options: BodyResponseCallback[Schema$GoogleProtobufEmpty],
    callback: BodyResponseCallback[Schema$GoogleProtobufEmpty]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarCatalogsDollarProductsDollarVersionsDollarDelete,
    options: MethodOptions
  ): GaxiosPromise[Schema$GoogleProtobufEmpty] = js.native
  def delete(
    params: ParamsDollarResourceDollarCatalogsDollarProductsDollarVersionsDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$GoogleProtobufEmpty]
  ): Unit = js.native
  /**
    * cloudprivatecatalogproducer.catalogs.products.versions.get
    * @desc Returns the requested Version resource.
    * @alias cloudprivatecatalogproducer.catalogs.products.versions.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The resource name of the version.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$GoogleCloudPrivatecatalogproducerV1beta1Version] = js.native
  def get(callback: BodyResponseCallback[Schema$GoogleCloudPrivatecatalogproducerV1beta1Version]): Unit = js.native
  def get(params: ParamsDollarResourceDollarCatalogsDollarProductsDollarVersionsDollarGet): GaxiosPromise[Schema$GoogleCloudPrivatecatalogproducerV1beta1Version] = js.native
  def get(
    params: ParamsDollarResourceDollarCatalogsDollarProductsDollarVersionsDollarGet,
    callback: BodyResponseCallback[Schema$GoogleCloudPrivatecatalogproducerV1beta1Version]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarCatalogsDollarProductsDollarVersionsDollarGet,
    options: BodyResponseCallback[Schema$GoogleCloudPrivatecatalogproducerV1beta1Version],
    callback: BodyResponseCallback[Schema$GoogleCloudPrivatecatalogproducerV1beta1Version]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarCatalogsDollarProductsDollarVersionsDollarGet,
    options: MethodOptions
  ): GaxiosPromise[Schema$GoogleCloudPrivatecatalogproducerV1beta1Version] = js.native
  def get(
    params: ParamsDollarResourceDollarCatalogsDollarProductsDollarVersionsDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$GoogleCloudPrivatecatalogproducerV1beta1Version]
  ): Unit = js.native
  /**
    * cloudprivatecatalogproducer.catalogs.products.versions.list
    * @desc Lists Version resources that the producer has access to, within the
    * scope of the parent Product.
    * @alias cloudprivatecatalogproducer.catalogs.products.versions.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer=} params.pageSize The maximum number of versions to return.
    * @param {string=} params.pageToken A pagination token returned from a previous call to ListVersions that indicates where this listing should continue from. This field is optional.
    * @param {string} params.parent The resource name of the parent resource.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$GoogleCloudPrivatecatalogproducerV1beta1ListVersionsResponse] = js.native
  def list(
    callback: BodyResponseCallback[Schema$GoogleCloudPrivatecatalogproducerV1beta1ListVersionsResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarCatalogsDollarProductsDollarVersionsDollarList): GaxiosPromise[Schema$GoogleCloudPrivatecatalogproducerV1beta1ListVersionsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarCatalogsDollarProductsDollarVersionsDollarList,
    callback: BodyResponseCallback[Schema$GoogleCloudPrivatecatalogproducerV1beta1ListVersionsResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarCatalogsDollarProductsDollarVersionsDollarList,
    options: BodyResponseCallback[Schema$GoogleCloudPrivatecatalogproducerV1beta1ListVersionsResponse],
    callback: BodyResponseCallback[Schema$GoogleCloudPrivatecatalogproducerV1beta1ListVersionsResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarCatalogsDollarProductsDollarVersionsDollarList,
    options: MethodOptions
  ): GaxiosPromise[Schema$GoogleCloudPrivatecatalogproducerV1beta1ListVersionsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarCatalogsDollarProductsDollarVersionsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$GoogleCloudPrivatecatalogproducerV1beta1ListVersionsResponse]
  ): Unit = js.native
  /**
    * cloudprivatecatalogproducer.catalogs.products.versions.patch
    * @desc Updates a specific Version resource.
    * @alias cloudprivatecatalogproducer.catalogs.products.versions.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Required. The resource name of the version, in the format `catalogs/{catalog_id}/products/{product_id}/versions/a-z*[a-z0-9]'.  A unique identifier for the version under a product, which can't be changed after the version is created. The final segment of the name must between 1 and 63 characters in length.
    * @param {string=} params.updateMask Field mask that controls which fields of the version should be updated.
    * @param {().GoogleCloudPrivatecatalogproducerV1beta1Version} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[Schema$GoogleCloudPrivatecatalogproducerV1beta1Version] = js.native
  def patch(callback: BodyResponseCallback[Schema$GoogleCloudPrivatecatalogproducerV1beta1Version]): Unit = js.native
  def patch(params: ParamsDollarResourceDollarCatalogsDollarProductsDollarVersionsDollarPatch): GaxiosPromise[Schema$GoogleCloudPrivatecatalogproducerV1beta1Version] = js.native
  def patch(
    params: ParamsDollarResourceDollarCatalogsDollarProductsDollarVersionsDollarPatch,
    callback: BodyResponseCallback[Schema$GoogleCloudPrivatecatalogproducerV1beta1Version]
  ): Unit = js.native
  def patch(
    params: ParamsDollarResourceDollarCatalogsDollarProductsDollarVersionsDollarPatch,
    options: BodyResponseCallback[Schema$GoogleCloudPrivatecatalogproducerV1beta1Version],
    callback: BodyResponseCallback[Schema$GoogleCloudPrivatecatalogproducerV1beta1Version]
  ): Unit = js.native
  def patch(
    params: ParamsDollarResourceDollarCatalogsDollarProductsDollarVersionsDollarPatch,
    options: MethodOptions
  ): GaxiosPromise[Schema$GoogleCloudPrivatecatalogproducerV1beta1Version] = js.native
  def patch(
    params: ParamsDollarResourceDollarCatalogsDollarProductsDollarVersionsDollarPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$GoogleCloudPrivatecatalogproducerV1beta1Version]
  ): Unit = js.native
}

