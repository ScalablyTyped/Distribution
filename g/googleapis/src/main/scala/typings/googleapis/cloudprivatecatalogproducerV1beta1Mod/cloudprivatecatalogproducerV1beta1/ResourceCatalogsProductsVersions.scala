package typings.googleapis.cloudprivatecatalogproducerV1beta1Mod.cloudprivatecatalogproducerV1beta1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/cloudprivatecatalogproducer/v1beta1", "cloudprivatecatalogproducer_v1beta1.Resource$Catalogs$Products$Versions")
@js.native
class ResourceCatalogsProductsVersions protected () extends StObject {
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
  def create(): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def create(callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]): Unit = js.native
  def create(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def create(params: ParamsResourceCatalogsProductsVersionsCreate): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def create(
    params: ParamsResourceCatalogsProductsVersionsCreate,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def create(
    params: ParamsResourceCatalogsProductsVersionsCreate,
    options: BodyResponseCallback[SchemaGoogleLongrunningOperation],
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def create(params: ParamsResourceCatalogsProductsVersionsCreate, options: MethodOptions): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def create(
    params: ParamsResourceCatalogsProductsVersionsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
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
  def delete(): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]): Unit = js.native
  def delete(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(params: ParamsResourceCatalogsProductsVersionsDelete): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(
    params: ParamsResourceCatalogsProductsVersionsDelete,
    callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  def delete(
    params: ParamsResourceCatalogsProductsVersionsDelete,
    options: BodyResponseCallback[SchemaGoogleProtobufEmpty],
    callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceCatalogsProductsVersionsDelete, options: MethodOptions): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(
    params: ParamsResourceCatalogsProductsVersionsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]
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
  def get(): GaxiosPromise[SchemaGoogleCloudPrivatecatalogproducerV1beta1Version] = js.native
  def get(callback: BodyResponseCallback[SchemaGoogleCloudPrivatecatalogproducerV1beta1Version]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaGoogleCloudPrivatecatalogproducerV1beta1Version] = js.native
  def get(params: ParamsResourceCatalogsProductsVersionsGet): GaxiosPromise[SchemaGoogleCloudPrivatecatalogproducerV1beta1Version] = js.native
  def get(
    params: ParamsResourceCatalogsProductsVersionsGet,
    callback: BodyResponseCallback[SchemaGoogleCloudPrivatecatalogproducerV1beta1Version]
  ): Unit = js.native
  def get(
    params: ParamsResourceCatalogsProductsVersionsGet,
    options: BodyResponseCallback[SchemaGoogleCloudPrivatecatalogproducerV1beta1Version],
    callback: BodyResponseCallback[SchemaGoogleCloudPrivatecatalogproducerV1beta1Version]
  ): Unit = js.native
  def get(params: ParamsResourceCatalogsProductsVersionsGet, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudPrivatecatalogproducerV1beta1Version] = js.native
  def get(
    params: ParamsResourceCatalogsProductsVersionsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudPrivatecatalogproducerV1beta1Version]
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
  def list(): GaxiosPromise[SchemaGoogleCloudPrivatecatalogproducerV1beta1ListVersionsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaGoogleCloudPrivatecatalogproducerV1beta1ListVersionsResponse]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaGoogleCloudPrivatecatalogproducerV1beta1ListVersionsResponse] = js.native
  def list(params: ParamsResourceCatalogsProductsVersionsList): GaxiosPromise[SchemaGoogleCloudPrivatecatalogproducerV1beta1ListVersionsResponse] = js.native
  def list(
    params: ParamsResourceCatalogsProductsVersionsList,
    callback: BodyResponseCallback[SchemaGoogleCloudPrivatecatalogproducerV1beta1ListVersionsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceCatalogsProductsVersionsList,
    options: BodyResponseCallback[SchemaGoogleCloudPrivatecatalogproducerV1beta1ListVersionsResponse],
    callback: BodyResponseCallback[SchemaGoogleCloudPrivatecatalogproducerV1beta1ListVersionsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceCatalogsProductsVersionsList, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudPrivatecatalogproducerV1beta1ListVersionsResponse] = js.native
  def list(
    params: ParamsResourceCatalogsProductsVersionsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudPrivatecatalogproducerV1beta1ListVersionsResponse]
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
  def patch(): GaxiosPromise[SchemaGoogleCloudPrivatecatalogproducerV1beta1Version] = js.native
  def patch(callback: BodyResponseCallback[SchemaGoogleCloudPrivatecatalogproducerV1beta1Version]): Unit = js.native
  def patch(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaGoogleCloudPrivatecatalogproducerV1beta1Version] = js.native
  def patch(params: ParamsResourceCatalogsProductsVersionsPatch): GaxiosPromise[SchemaGoogleCloudPrivatecatalogproducerV1beta1Version] = js.native
  def patch(
    params: ParamsResourceCatalogsProductsVersionsPatch,
    callback: BodyResponseCallback[SchemaGoogleCloudPrivatecatalogproducerV1beta1Version]
  ): Unit = js.native
  def patch(
    params: ParamsResourceCatalogsProductsVersionsPatch,
    options: BodyResponseCallback[SchemaGoogleCloudPrivatecatalogproducerV1beta1Version],
    callback: BodyResponseCallback[SchemaGoogleCloudPrivatecatalogproducerV1beta1Version]
  ): Unit = js.native
  def patch(params: ParamsResourceCatalogsProductsVersionsPatch, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudPrivatecatalogproducerV1beta1Version] = js.native
  def patch(
    params: ParamsResourceCatalogsProductsVersionsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudPrivatecatalogproducerV1beta1Version]
  ): Unit = js.native
}
