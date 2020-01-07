package typings.googleapis.buildSrcApisCloudprivatecatalogproducerV1beta1Mod.cloudprivatecatalogproducer_v1beta1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/cloudprivatecatalogproducer/v1beta1", "cloudprivatecatalogproducer_v1beta1.Resource$Catalogs$Associations")
@js.native
class ResourceDollarCatalogsDollarAssociations protected () extends js.Object {
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
  def create(): GaxiosPromise[Schema$GoogleCloudPrivatecatalogproducerV1beta1Association] = js.native
  def create(callback: BodyResponseCallback[Schema$GoogleCloudPrivatecatalogproducerV1beta1Association]): Unit = js.native
  def create(params: ParamsDollarResourceDollarCatalogsDollarAssociationsDollarCreate): GaxiosPromise[Schema$GoogleCloudPrivatecatalogproducerV1beta1Association] = js.native
  def create(
    params: ParamsDollarResourceDollarCatalogsDollarAssociationsDollarCreate,
    callback: BodyResponseCallback[Schema$GoogleCloudPrivatecatalogproducerV1beta1Association]
  ): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarCatalogsDollarAssociationsDollarCreate,
    options: BodyResponseCallback[Schema$GoogleCloudPrivatecatalogproducerV1beta1Association],
    callback: BodyResponseCallback[Schema$GoogleCloudPrivatecatalogproducerV1beta1Association]
  ): Unit = js.native
  def create(params: ParamsDollarResourceDollarCatalogsDollarAssociationsDollarCreate, options: MethodOptions): GaxiosPromise[Schema$GoogleCloudPrivatecatalogproducerV1beta1Association] = js.native
  def create(
    params: ParamsDollarResourceDollarCatalogsDollarAssociationsDollarCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$GoogleCloudPrivatecatalogproducerV1beta1Association]
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
  def delete(): GaxiosPromise[Schema$GoogleProtobufEmpty] = js.native
  def delete(callback: BodyResponseCallback[Schema$GoogleProtobufEmpty]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarCatalogsDollarAssociationsDollarDelete): GaxiosPromise[Schema$GoogleProtobufEmpty] = js.native
  def delete(
    params: ParamsDollarResourceDollarCatalogsDollarAssociationsDollarDelete,
    callback: BodyResponseCallback[Schema$GoogleProtobufEmpty]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarCatalogsDollarAssociationsDollarDelete,
    options: BodyResponseCallback[Schema$GoogleProtobufEmpty],
    callback: BodyResponseCallback[Schema$GoogleProtobufEmpty]
  ): Unit = js.native
  def delete(params: ParamsDollarResourceDollarCatalogsDollarAssociationsDollarDelete, options: MethodOptions): GaxiosPromise[Schema$GoogleProtobufEmpty] = js.native
  def delete(
    params: ParamsDollarResourceDollarCatalogsDollarAssociationsDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$GoogleProtobufEmpty]
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
  def get(): GaxiosPromise[Schema$GoogleCloudPrivatecatalogproducerV1beta1Association] = js.native
  def get(callback: BodyResponseCallback[Schema$GoogleCloudPrivatecatalogproducerV1beta1Association]): Unit = js.native
  def get(params: ParamsDollarResourceDollarCatalogsDollarAssociationsDollarGet): GaxiosPromise[Schema$GoogleCloudPrivatecatalogproducerV1beta1Association] = js.native
  def get(
    params: ParamsDollarResourceDollarCatalogsDollarAssociationsDollarGet,
    callback: BodyResponseCallback[Schema$GoogleCloudPrivatecatalogproducerV1beta1Association]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarCatalogsDollarAssociationsDollarGet,
    options: BodyResponseCallback[Schema$GoogleCloudPrivatecatalogproducerV1beta1Association],
    callback: BodyResponseCallback[Schema$GoogleCloudPrivatecatalogproducerV1beta1Association]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarCatalogsDollarAssociationsDollarGet, options: MethodOptions): GaxiosPromise[Schema$GoogleCloudPrivatecatalogproducerV1beta1Association] = js.native
  def get(
    params: ParamsDollarResourceDollarCatalogsDollarAssociationsDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$GoogleCloudPrivatecatalogproducerV1beta1Association]
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
  def list(): GaxiosPromise[Schema$GoogleCloudPrivatecatalogproducerV1beta1ListAssociationsResponse] = js.native
  def list(
    callback: BodyResponseCallback[Schema$GoogleCloudPrivatecatalogproducerV1beta1ListAssociationsResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarCatalogsDollarAssociationsDollarList): GaxiosPromise[Schema$GoogleCloudPrivatecatalogproducerV1beta1ListAssociationsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarCatalogsDollarAssociationsDollarList,
    callback: BodyResponseCallback[Schema$GoogleCloudPrivatecatalogproducerV1beta1ListAssociationsResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarCatalogsDollarAssociationsDollarList,
    options: BodyResponseCallback[Schema$GoogleCloudPrivatecatalogproducerV1beta1ListAssociationsResponse],
    callback: BodyResponseCallback[Schema$GoogleCloudPrivatecatalogproducerV1beta1ListAssociationsResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarCatalogsDollarAssociationsDollarList, options: MethodOptions): GaxiosPromise[Schema$GoogleCloudPrivatecatalogproducerV1beta1ListAssociationsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarCatalogsDollarAssociationsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$GoogleCloudPrivatecatalogproducerV1beta1ListAssociationsResponse]
  ): Unit = js.native
}

