package typings.googleapis.cloudprivatecatalogproducerV1beta1Mod.cloudprivatecatalogproducerV1beta1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/cloudprivatecatalogproducer/v1beta1", "cloudprivatecatalogproducer_v1beta1.Resource$Catalogs$Associations")
@js.native
class ResourceCatalogsAssociations protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * cloudprivatecatalogproducer.catalogs.associations.create
    * @desc Creates an Association instance under a given Catalog.
    * @alias cloudprivatecatalogproducer.catalogs.associations.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.parent The `Catalog` resource's name.
    * @param {().GoogleCloudPrivatecatalogproducerV1beta1CreateAssociationRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[SchemaGoogleCloudPrivatecatalogproducerV1beta1Association] = js.native
  def create(callback: BodyResponseCallback[SchemaGoogleCloudPrivatecatalogproducerV1beta1Association]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudPrivatecatalogproducerV1beta1Association] = js.native
  def create(params: ParamsResourceCatalogsAssociationsCreate): GaxiosPromise[SchemaGoogleCloudPrivatecatalogproducerV1beta1Association] = js.native
  def create(
    params: ParamsResourceCatalogsAssociationsCreate,
    callback: BodyResponseCallback[SchemaGoogleCloudPrivatecatalogproducerV1beta1Association]
  ): Unit = js.native
  def create(
    params: ParamsResourceCatalogsAssociationsCreate,
    options: BodyResponseCallback[SchemaGoogleCloudPrivatecatalogproducerV1beta1Association],
    callback: BodyResponseCallback[SchemaGoogleCloudPrivatecatalogproducerV1beta1Association]
  ): Unit = js.native
  def create(params: ParamsResourceCatalogsAssociationsCreate, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudPrivatecatalogproducerV1beta1Association] = js.native
  def create(
    params: ParamsResourceCatalogsAssociationsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudPrivatecatalogproducerV1beta1Association]
  ): Unit = js.native
  
  /**
    * cloudprivatecatalogproducer.catalogs.associations.delete
    * @desc Deletes the given Association.
    * @alias cloudprivatecatalogproducer.catalogs.associations.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The resource name of the `Association` to delete.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(params: ParamsResourceCatalogsAssociationsDelete): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(
    params: ParamsResourceCatalogsAssociationsDelete,
    callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  def delete(
    params: ParamsResourceCatalogsAssociationsDelete,
    options: BodyResponseCallback[SchemaGoogleProtobufEmpty],
    callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceCatalogsAssociationsDelete, options: MethodOptions): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(
    params: ParamsResourceCatalogsAssociationsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  
  /**
    * cloudprivatecatalogproducer.catalogs.associations.get
    * @desc Returns the requested Association resource.
    * @alias cloudprivatecatalogproducer.catalogs.associations.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The resource name of the `Association` to retrieve.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaGoogleCloudPrivatecatalogproducerV1beta1Association] = js.native
  def get(callback: BodyResponseCallback[SchemaGoogleCloudPrivatecatalogproducerV1beta1Association]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudPrivatecatalogproducerV1beta1Association] = js.native
  def get(params: ParamsResourceCatalogsAssociationsGet): GaxiosPromise[SchemaGoogleCloudPrivatecatalogproducerV1beta1Association] = js.native
  def get(
    params: ParamsResourceCatalogsAssociationsGet,
    callback: BodyResponseCallback[SchemaGoogleCloudPrivatecatalogproducerV1beta1Association]
  ): Unit = js.native
  def get(
    params: ParamsResourceCatalogsAssociationsGet,
    options: BodyResponseCallback[SchemaGoogleCloudPrivatecatalogproducerV1beta1Association],
    callback: BodyResponseCallback[SchemaGoogleCloudPrivatecatalogproducerV1beta1Association]
  ): Unit = js.native
  def get(params: ParamsResourceCatalogsAssociationsGet, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudPrivatecatalogproducerV1beta1Association] = js.native
  def get(
    params: ParamsResourceCatalogsAssociationsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudPrivatecatalogproducerV1beta1Association]
  ): Unit = js.native
  
  /**
    * cloudprivatecatalogproducer.catalogs.associations.list
    * @desc Lists all Association resources under a catalog.
    * @alias cloudprivatecatalogproducer.catalogs.associations.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer=} params.pageSize The maximum number of catalog associations to return.
    * @param {string=} params.pageToken A pagination token returned from the previous call to `ListAssociations`.
    * @param {string} params.parent The resource name of the `Catalog` whose `Associations` are being retrieved. In the format `catalogs/<catalog>`.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaGoogleCloudPrivatecatalogproducerV1beta1ListAssociationsResponse] = js.native
  def list(
    callback: BodyResponseCallback[SchemaGoogleCloudPrivatecatalogproducerV1beta1ListAssociationsResponse]
  ): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudPrivatecatalogproducerV1beta1ListAssociationsResponse] = js.native
  def list(params: ParamsResourceCatalogsAssociationsList): GaxiosPromise[SchemaGoogleCloudPrivatecatalogproducerV1beta1ListAssociationsResponse] = js.native
  def list(
    params: ParamsResourceCatalogsAssociationsList,
    callback: BodyResponseCallback[SchemaGoogleCloudPrivatecatalogproducerV1beta1ListAssociationsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceCatalogsAssociationsList,
    options: BodyResponseCallback[SchemaGoogleCloudPrivatecatalogproducerV1beta1ListAssociationsResponse],
    callback: BodyResponseCallback[SchemaGoogleCloudPrivatecatalogproducerV1beta1ListAssociationsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceCatalogsAssociationsList, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudPrivatecatalogproducerV1beta1ListAssociationsResponse] = js.native
  def list(
    params: ParamsResourceCatalogsAssociationsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudPrivatecatalogproducerV1beta1ListAssociationsResponse]
  ): Unit = js.native
}
