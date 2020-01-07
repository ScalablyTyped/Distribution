package typings.googleapis.buildSrcApisCloudprivatecatalogproducerV1beta1Mod.cloudprivatecatalogproducer_v1beta1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/cloudprivatecatalogproducer/v1beta1", "cloudprivatecatalogproducer_v1beta1.Resource$Catalogs")
@js.native
class Resource$Catalogs protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var associations: ResourceDollarCatalogsDollarAssociations = js.native
  var context: APIRequestContext = js.native
  var products: ResourceDollarCatalogsDollarProducts = js.native
  /**
    * cloudprivatecatalogproducer.catalogs.create
    * @desc Creates a new Catalog resource.
    * @alias cloudprivatecatalogproducer.catalogs.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().GoogleCloudPrivatecatalogproducerV1beta1Catalog} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[Schema$GoogleLongrunningOperation] = js.native
  def create(callback: BodyResponseCallback[Schema$GoogleLongrunningOperation]): Unit = js.native
  def create(params: ParamsDollarResourceDollarCatalogsDollarCreate): GaxiosPromise[Schema$GoogleLongrunningOperation] = js.native
  def create(
    params: ParamsDollarResourceDollarCatalogsDollarCreate,
    callback: BodyResponseCallback[Schema$GoogleLongrunningOperation]
  ): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarCatalogsDollarCreate,
    options: BodyResponseCallback[Schema$GoogleLongrunningOperation],
    callback: BodyResponseCallback[Schema$GoogleLongrunningOperation]
  ): Unit = js.native
  def create(params: ParamsDollarResourceDollarCatalogsDollarCreate, options: MethodOptions): GaxiosPromise[Schema$GoogleLongrunningOperation] = js.native
  def create(
    params: ParamsDollarResourceDollarCatalogsDollarCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$GoogleLongrunningOperation]
  ): Unit = js.native
  /**
    * cloudprivatecatalogproducer.catalogs.delete
    * @desc Soft deletes an existing Catalog and all resources under it. The
    * catalog can only be deleted if there is no associations under it or
    * DeleteCatalogRequest.force is true. The delete operation can be recovered
    * by the PrivateCatalogProducer.UndeleteCatalog method.
    * @alias cloudprivatecatalogproducer.catalogs.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {boolean=} params.force Forces deletion of the `Catalog` and its `Association` resources. If the `Catalog` is still associated with other resources and force is not set to true, then the operation fails.
    * @param {string} params.name The resource name of the catalog.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Schema$GoogleCloudPrivatecatalogproducerV1beta1Catalog] = js.native
  def delete(callback: BodyResponseCallback[Schema$GoogleCloudPrivatecatalogproducerV1beta1Catalog]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarCatalogsDollarDelete): GaxiosPromise[Schema$GoogleCloudPrivatecatalogproducerV1beta1Catalog] = js.native
  def delete(
    params: ParamsDollarResourceDollarCatalogsDollarDelete,
    callback: BodyResponseCallback[Schema$GoogleCloudPrivatecatalogproducerV1beta1Catalog]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarCatalogsDollarDelete,
    options: BodyResponseCallback[Schema$GoogleCloudPrivatecatalogproducerV1beta1Catalog],
    callback: BodyResponseCallback[Schema$GoogleCloudPrivatecatalogproducerV1beta1Catalog]
  ): Unit = js.native
  def delete(params: ParamsDollarResourceDollarCatalogsDollarDelete, options: MethodOptions): GaxiosPromise[Schema$GoogleCloudPrivatecatalogproducerV1beta1Catalog] = js.native
  def delete(
    params: ParamsDollarResourceDollarCatalogsDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$GoogleCloudPrivatecatalogproducerV1beta1Catalog]
  ): Unit = js.native
  /**
    * cloudprivatecatalogproducer.catalogs.get
    * @desc Returns the requested Catalog resource.
    * @alias cloudprivatecatalogproducer.catalogs.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The resource name of the catalog.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$GoogleCloudPrivatecatalogproducerV1beta1Catalog] = js.native
  def get(callback: BodyResponseCallback[Schema$GoogleCloudPrivatecatalogproducerV1beta1Catalog]): Unit = js.native
  def get(params: ParamsDollarResourceDollarCatalogsDollarGet): GaxiosPromise[Schema$GoogleCloudPrivatecatalogproducerV1beta1Catalog] = js.native
  def get(
    params: ParamsDollarResourceDollarCatalogsDollarGet,
    callback: BodyResponseCallback[Schema$GoogleCloudPrivatecatalogproducerV1beta1Catalog]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarCatalogsDollarGet,
    options: BodyResponseCallback[Schema$GoogleCloudPrivatecatalogproducerV1beta1Catalog],
    callback: BodyResponseCallback[Schema$GoogleCloudPrivatecatalogproducerV1beta1Catalog]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarCatalogsDollarGet, options: MethodOptions): GaxiosPromise[Schema$GoogleCloudPrivatecatalogproducerV1beta1Catalog] = js.native
  def get(
    params: ParamsDollarResourceDollarCatalogsDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$GoogleCloudPrivatecatalogproducerV1beta1Catalog]
  ): Unit = js.native
  /**
    * cloudprivatecatalogproducer.catalogs.getIamPolicy
    * @desc Gets IAM policy for the specified Catalog.
    * @alias cloudprivatecatalogproducer.catalogs.getIamPolicy
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.resource_ REQUIRED: The resource for which the policy is being requested. See the operation documentation for the appropriate value for this field.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def getIamPolicy(): GaxiosPromise[Schema$GoogleIamV1Policy] = js.native
  def getIamPolicy(callback: BodyResponseCallback[Schema$GoogleIamV1Policy]): Unit = js.native
  def getIamPolicy(params: ParamsDollarResourceDollarCatalogsDollarGetiampolicy): GaxiosPromise[Schema$GoogleIamV1Policy] = js.native
  def getIamPolicy(
    params: ParamsDollarResourceDollarCatalogsDollarGetiampolicy,
    callback: BodyResponseCallback[Schema$GoogleIamV1Policy]
  ): Unit = js.native
  def getIamPolicy(
    params: ParamsDollarResourceDollarCatalogsDollarGetiampolicy,
    options: BodyResponseCallback[Schema$GoogleIamV1Policy],
    callback: BodyResponseCallback[Schema$GoogleIamV1Policy]
  ): Unit = js.native
  def getIamPolicy(params: ParamsDollarResourceDollarCatalogsDollarGetiampolicy, options: MethodOptions): GaxiosPromise[Schema$GoogleIamV1Policy] = js.native
  def getIamPolicy(
    params: ParamsDollarResourceDollarCatalogsDollarGetiampolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$GoogleIamV1Policy]
  ): Unit = js.native
  /**
    * cloudprivatecatalogproducer.catalogs.list
    * @desc Lists Catalog resources that the producer has access to, within the
    * scope of the parent resource.
    * @alias cloudprivatecatalogproducer.catalogs.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer=} params.pageSize The maximum number of catalogs to return.
    * @param {string=} params.pageToken A pagination token returned from a previous call to ListCatalogs that indicates where this listing should continue from. This field is optional.
    * @param {string=} params.parent The resource name of the parent resource.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$GoogleCloudPrivatecatalogproducerV1beta1ListCatalogsResponse] = js.native
  def list(
    callback: BodyResponseCallback[Schema$GoogleCloudPrivatecatalogproducerV1beta1ListCatalogsResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarCatalogsDollarList): GaxiosPromise[Schema$GoogleCloudPrivatecatalogproducerV1beta1ListCatalogsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarCatalogsDollarList,
    callback: BodyResponseCallback[Schema$GoogleCloudPrivatecatalogproducerV1beta1ListCatalogsResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarCatalogsDollarList,
    options: BodyResponseCallback[Schema$GoogleCloudPrivatecatalogproducerV1beta1ListCatalogsResponse],
    callback: BodyResponseCallback[Schema$GoogleCloudPrivatecatalogproducerV1beta1ListCatalogsResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarCatalogsDollarList, options: MethodOptions): GaxiosPromise[Schema$GoogleCloudPrivatecatalogproducerV1beta1ListCatalogsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarCatalogsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$GoogleCloudPrivatecatalogproducerV1beta1ListCatalogsResponse]
  ): Unit = js.native
  /**
    * cloudprivatecatalogproducer.catalogs.patch
    * @desc Updates a specific Catalog resource.
    * @alias cloudprivatecatalogproducer.catalogs.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Output only. The resource name of the catalog, in the format `catalogs/{catalog_id}'.  A unique identifier for the catalog, which is generated by catalog service.
    * @param {string=} params.updateMask Field mask that controls which fields of the catalog should be updated.
    * @param {().GoogleCloudPrivatecatalogproducerV1beta1Catalog} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[Schema$GoogleCloudPrivatecatalogproducerV1beta1Catalog] = js.native
  def patch(callback: BodyResponseCallback[Schema$GoogleCloudPrivatecatalogproducerV1beta1Catalog]): Unit = js.native
  def patch(params: ParamsDollarResourceDollarCatalogsDollarPatch): GaxiosPromise[Schema$GoogleCloudPrivatecatalogproducerV1beta1Catalog] = js.native
  def patch(
    params: ParamsDollarResourceDollarCatalogsDollarPatch,
    callback: BodyResponseCallback[Schema$GoogleCloudPrivatecatalogproducerV1beta1Catalog]
  ): Unit = js.native
  def patch(
    params: ParamsDollarResourceDollarCatalogsDollarPatch,
    options: BodyResponseCallback[Schema$GoogleCloudPrivatecatalogproducerV1beta1Catalog],
    callback: BodyResponseCallback[Schema$GoogleCloudPrivatecatalogproducerV1beta1Catalog]
  ): Unit = js.native
  def patch(params: ParamsDollarResourceDollarCatalogsDollarPatch, options: MethodOptions): GaxiosPromise[Schema$GoogleCloudPrivatecatalogproducerV1beta1Catalog] = js.native
  def patch(
    params: ParamsDollarResourceDollarCatalogsDollarPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$GoogleCloudPrivatecatalogproducerV1beta1Catalog]
  ): Unit = js.native
  /**
    * cloudprivatecatalogproducer.catalogs.setIamPolicy
    * @desc Sets the IAM policy for the specified Catalog.
    * @alias cloudprivatecatalogproducer.catalogs.setIamPolicy
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.resource_ REQUIRED: The resource for which the policy is being specified. See the operation documentation for the appropriate value for this field.
    * @param {().GoogleIamV1SetIamPolicyRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def setIamPolicy(): GaxiosPromise[Schema$GoogleIamV1Policy] = js.native
  def setIamPolicy(callback: BodyResponseCallback[Schema$GoogleIamV1Policy]): Unit = js.native
  def setIamPolicy(params: ParamsDollarResourceDollarCatalogsDollarSetiampolicy): GaxiosPromise[Schema$GoogleIamV1Policy] = js.native
  def setIamPolicy(
    params: ParamsDollarResourceDollarCatalogsDollarSetiampolicy,
    callback: BodyResponseCallback[Schema$GoogleIamV1Policy]
  ): Unit = js.native
  def setIamPolicy(
    params: ParamsDollarResourceDollarCatalogsDollarSetiampolicy,
    options: BodyResponseCallback[Schema$GoogleIamV1Policy],
    callback: BodyResponseCallback[Schema$GoogleIamV1Policy]
  ): Unit = js.native
  def setIamPolicy(params: ParamsDollarResourceDollarCatalogsDollarSetiampolicy, options: MethodOptions): GaxiosPromise[Schema$GoogleIamV1Policy] = js.native
  def setIamPolicy(
    params: ParamsDollarResourceDollarCatalogsDollarSetiampolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$GoogleIamV1Policy]
  ): Unit = js.native
  /**
    * cloudprivatecatalogproducer.catalogs.testIamPermissions
    * @desc Tests the IAM permissions for the specified Catalog.
    * @alias cloudprivatecatalogproducer.catalogs.testIamPermissions
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.resource_ REQUIRED: The resource for which the policy detail is being requested. See the operation documentation for the appropriate value for this field.
    * @param {().GoogleIamV1TestIamPermissionsRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def testIamPermissions(): GaxiosPromise[Schema$GoogleIamV1TestIamPermissionsResponse] = js.native
  def testIamPermissions(callback: BodyResponseCallback[Schema$GoogleIamV1TestIamPermissionsResponse]): Unit = js.native
  def testIamPermissions(params: ParamsDollarResourceDollarCatalogsDollarTestiampermissions): GaxiosPromise[Schema$GoogleIamV1TestIamPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsDollarResourceDollarCatalogsDollarTestiampermissions,
    callback: BodyResponseCallback[Schema$GoogleIamV1TestIamPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(
    params: ParamsDollarResourceDollarCatalogsDollarTestiampermissions,
    options: BodyResponseCallback[Schema$GoogleIamV1TestIamPermissionsResponse],
    callback: BodyResponseCallback[Schema$GoogleIamV1TestIamPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(params: ParamsDollarResourceDollarCatalogsDollarTestiampermissions, options: MethodOptions): GaxiosPromise[Schema$GoogleIamV1TestIamPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsDollarResourceDollarCatalogsDollarTestiampermissions,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$GoogleIamV1TestIamPermissionsResponse]
  ): Unit = js.native
  /**
    * cloudprivatecatalogproducer.catalogs.undelete
    * @desc Undeletes a deleted Catalog and all resources under it.
    * @alias cloudprivatecatalogproducer.catalogs.undelete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The resource name of the catalog.
    * @param {().GoogleCloudPrivatecatalogproducerV1beta1UndeleteCatalogRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def undelete(): GaxiosPromise[Schema$GoogleCloudPrivatecatalogproducerV1beta1Catalog] = js.native
  def undelete(callback: BodyResponseCallback[Schema$GoogleCloudPrivatecatalogproducerV1beta1Catalog]): Unit = js.native
  def undelete(params: ParamsDollarResourceDollarCatalogsDollarUndelete): GaxiosPromise[Schema$GoogleCloudPrivatecatalogproducerV1beta1Catalog] = js.native
  def undelete(
    params: ParamsDollarResourceDollarCatalogsDollarUndelete,
    callback: BodyResponseCallback[Schema$GoogleCloudPrivatecatalogproducerV1beta1Catalog]
  ): Unit = js.native
  def undelete(
    params: ParamsDollarResourceDollarCatalogsDollarUndelete,
    options: BodyResponseCallback[Schema$GoogleCloudPrivatecatalogproducerV1beta1Catalog],
    callback: BodyResponseCallback[Schema$GoogleCloudPrivatecatalogproducerV1beta1Catalog]
  ): Unit = js.native
  def undelete(params: ParamsDollarResourceDollarCatalogsDollarUndelete, options: MethodOptions): GaxiosPromise[Schema$GoogleCloudPrivatecatalogproducerV1beta1Catalog] = js.native
  def undelete(
    params: ParamsDollarResourceDollarCatalogsDollarUndelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$GoogleCloudPrivatecatalogproducerV1beta1Catalog]
  ): Unit = js.native
}

