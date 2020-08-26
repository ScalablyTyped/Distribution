package typings.googleapis.cloudprivatecatalogproducerV1beta1Mod.cloudprivatecatalogproducerV1beta1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/cloudprivatecatalogproducer/v1beta1", "cloudprivatecatalogproducer_v1beta1.Resource$Catalogs")
@js.native
class ResourceCatalogs protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var associations: ResourceCatalogsAssociations = js.native
  var context: APIRequestContext = js.native
  var products: ResourceCatalogsProducts = js.native
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
  def create(): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def create(callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]): Unit = js.native
  def create(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def create(params: ParamsResourceCatalogsCreate): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def create(
    params: ParamsResourceCatalogsCreate,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def create(
    params: ParamsResourceCatalogsCreate,
    options: BodyResponseCallback[SchemaGoogleLongrunningOperation],
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def create(params: ParamsResourceCatalogsCreate, options: MethodOptions): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def create(
    params: ParamsResourceCatalogsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
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
  def delete(): GaxiosPromise[SchemaGoogleCloudPrivatecatalogproducerV1beta1Catalog] = js.native
  def delete(callback: BodyResponseCallback[SchemaGoogleCloudPrivatecatalogproducerV1beta1Catalog]): Unit = js.native
  def delete(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaGoogleCloudPrivatecatalogproducerV1beta1Catalog] = js.native
  def delete(params: ParamsResourceCatalogsDelete): GaxiosPromise[SchemaGoogleCloudPrivatecatalogproducerV1beta1Catalog] = js.native
  def delete(
    params: ParamsResourceCatalogsDelete,
    callback: BodyResponseCallback[SchemaGoogleCloudPrivatecatalogproducerV1beta1Catalog]
  ): Unit = js.native
  def delete(
    params: ParamsResourceCatalogsDelete,
    options: BodyResponseCallback[SchemaGoogleCloudPrivatecatalogproducerV1beta1Catalog],
    callback: BodyResponseCallback[SchemaGoogleCloudPrivatecatalogproducerV1beta1Catalog]
  ): Unit = js.native
  def delete(params: ParamsResourceCatalogsDelete, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudPrivatecatalogproducerV1beta1Catalog] = js.native
  def delete(
    params: ParamsResourceCatalogsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudPrivatecatalogproducerV1beta1Catalog]
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
  def get(): GaxiosPromise[SchemaGoogleCloudPrivatecatalogproducerV1beta1Catalog] = js.native
  def get(callback: BodyResponseCallback[SchemaGoogleCloudPrivatecatalogproducerV1beta1Catalog]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaGoogleCloudPrivatecatalogproducerV1beta1Catalog] = js.native
  def get(params: ParamsResourceCatalogsGet): GaxiosPromise[SchemaGoogleCloudPrivatecatalogproducerV1beta1Catalog] = js.native
  def get(
    params: ParamsResourceCatalogsGet,
    callback: BodyResponseCallback[SchemaGoogleCloudPrivatecatalogproducerV1beta1Catalog]
  ): Unit = js.native
  def get(
    params: ParamsResourceCatalogsGet,
    options: BodyResponseCallback[SchemaGoogleCloudPrivatecatalogproducerV1beta1Catalog],
    callback: BodyResponseCallback[SchemaGoogleCloudPrivatecatalogproducerV1beta1Catalog]
  ): Unit = js.native
  def get(params: ParamsResourceCatalogsGet, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudPrivatecatalogproducerV1beta1Catalog] = js.native
  def get(
    params: ParamsResourceCatalogsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudPrivatecatalogproducerV1beta1Catalog]
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
  def getIamPolicy(): GaxiosPromise[SchemaGoogleIamV1Policy] = js.native
  def getIamPolicy(callback: BodyResponseCallback[SchemaGoogleIamV1Policy]): Unit = js.native
  def getIamPolicy(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaGoogleIamV1Policy] = js.native
  def getIamPolicy(params: ParamsResourceCatalogsGetiampolicy): GaxiosPromise[SchemaGoogleIamV1Policy] = js.native
  def getIamPolicy(
    params: ParamsResourceCatalogsGetiampolicy,
    callback: BodyResponseCallback[SchemaGoogleIamV1Policy]
  ): Unit = js.native
  def getIamPolicy(
    params: ParamsResourceCatalogsGetiampolicy,
    options: BodyResponseCallback[SchemaGoogleIamV1Policy],
    callback: BodyResponseCallback[SchemaGoogleIamV1Policy]
  ): Unit = js.native
  def getIamPolicy(params: ParamsResourceCatalogsGetiampolicy, options: MethodOptions): GaxiosPromise[SchemaGoogleIamV1Policy] = js.native
  def getIamPolicy(
    params: ParamsResourceCatalogsGetiampolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleIamV1Policy]
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
  def list(): GaxiosPromise[SchemaGoogleCloudPrivatecatalogproducerV1beta1ListCatalogsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaGoogleCloudPrivatecatalogproducerV1beta1ListCatalogsResponse]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaGoogleCloudPrivatecatalogproducerV1beta1ListCatalogsResponse] = js.native
  def list(params: ParamsResourceCatalogsList): GaxiosPromise[SchemaGoogleCloudPrivatecatalogproducerV1beta1ListCatalogsResponse] = js.native
  def list(
    params: ParamsResourceCatalogsList,
    callback: BodyResponseCallback[SchemaGoogleCloudPrivatecatalogproducerV1beta1ListCatalogsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceCatalogsList,
    options: BodyResponseCallback[SchemaGoogleCloudPrivatecatalogproducerV1beta1ListCatalogsResponse],
    callback: BodyResponseCallback[SchemaGoogleCloudPrivatecatalogproducerV1beta1ListCatalogsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceCatalogsList, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudPrivatecatalogproducerV1beta1ListCatalogsResponse] = js.native
  def list(
    params: ParamsResourceCatalogsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudPrivatecatalogproducerV1beta1ListCatalogsResponse]
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
  def patch(): GaxiosPromise[SchemaGoogleCloudPrivatecatalogproducerV1beta1Catalog] = js.native
  def patch(callback: BodyResponseCallback[SchemaGoogleCloudPrivatecatalogproducerV1beta1Catalog]): Unit = js.native
  def patch(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaGoogleCloudPrivatecatalogproducerV1beta1Catalog] = js.native
  def patch(params: ParamsResourceCatalogsPatch): GaxiosPromise[SchemaGoogleCloudPrivatecatalogproducerV1beta1Catalog] = js.native
  def patch(
    params: ParamsResourceCatalogsPatch,
    callback: BodyResponseCallback[SchemaGoogleCloudPrivatecatalogproducerV1beta1Catalog]
  ): Unit = js.native
  def patch(
    params: ParamsResourceCatalogsPatch,
    options: BodyResponseCallback[SchemaGoogleCloudPrivatecatalogproducerV1beta1Catalog],
    callback: BodyResponseCallback[SchemaGoogleCloudPrivatecatalogproducerV1beta1Catalog]
  ): Unit = js.native
  def patch(params: ParamsResourceCatalogsPatch, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudPrivatecatalogproducerV1beta1Catalog] = js.native
  def patch(
    params: ParamsResourceCatalogsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudPrivatecatalogproducerV1beta1Catalog]
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
  def setIamPolicy(): GaxiosPromise[SchemaGoogleIamV1Policy] = js.native
  def setIamPolicy(callback: BodyResponseCallback[SchemaGoogleIamV1Policy]): Unit = js.native
  def setIamPolicy(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaGoogleIamV1Policy] = js.native
  def setIamPolicy(params: ParamsResourceCatalogsSetiampolicy): GaxiosPromise[SchemaGoogleIamV1Policy] = js.native
  def setIamPolicy(
    params: ParamsResourceCatalogsSetiampolicy,
    callback: BodyResponseCallback[SchemaGoogleIamV1Policy]
  ): Unit = js.native
  def setIamPolicy(
    params: ParamsResourceCatalogsSetiampolicy,
    options: BodyResponseCallback[SchemaGoogleIamV1Policy],
    callback: BodyResponseCallback[SchemaGoogleIamV1Policy]
  ): Unit = js.native
  def setIamPolicy(params: ParamsResourceCatalogsSetiampolicy, options: MethodOptions): GaxiosPromise[SchemaGoogleIamV1Policy] = js.native
  def setIamPolicy(
    params: ParamsResourceCatalogsSetiampolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleIamV1Policy]
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
  def testIamPermissions(): GaxiosPromise[SchemaGoogleIamV1TestIamPermissionsResponse] = js.native
  def testIamPermissions(callback: BodyResponseCallback[SchemaGoogleIamV1TestIamPermissionsResponse]): Unit = js.native
  def testIamPermissions(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaGoogleIamV1TestIamPermissionsResponse] = js.native
  def testIamPermissions(params: ParamsResourceCatalogsTestiampermissions): GaxiosPromise[SchemaGoogleIamV1TestIamPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsResourceCatalogsTestiampermissions,
    callback: BodyResponseCallback[SchemaGoogleIamV1TestIamPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(
    params: ParamsResourceCatalogsTestiampermissions,
    options: BodyResponseCallback[SchemaGoogleIamV1TestIamPermissionsResponse],
    callback: BodyResponseCallback[SchemaGoogleIamV1TestIamPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(params: ParamsResourceCatalogsTestiampermissions, options: MethodOptions): GaxiosPromise[SchemaGoogleIamV1TestIamPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsResourceCatalogsTestiampermissions,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleIamV1TestIamPermissionsResponse]
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
  def undelete(): GaxiosPromise[SchemaGoogleCloudPrivatecatalogproducerV1beta1Catalog] = js.native
  def undelete(callback: BodyResponseCallback[SchemaGoogleCloudPrivatecatalogproducerV1beta1Catalog]): Unit = js.native
  def undelete(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaGoogleCloudPrivatecatalogproducerV1beta1Catalog] = js.native
  def undelete(params: ParamsResourceCatalogsUndelete): GaxiosPromise[SchemaGoogleCloudPrivatecatalogproducerV1beta1Catalog] = js.native
  def undelete(
    params: ParamsResourceCatalogsUndelete,
    callback: BodyResponseCallback[SchemaGoogleCloudPrivatecatalogproducerV1beta1Catalog]
  ): Unit = js.native
  def undelete(
    params: ParamsResourceCatalogsUndelete,
    options: BodyResponseCallback[SchemaGoogleCloudPrivatecatalogproducerV1beta1Catalog],
    callback: BodyResponseCallback[SchemaGoogleCloudPrivatecatalogproducerV1beta1Catalog]
  ): Unit = js.native
  def undelete(params: ParamsResourceCatalogsUndelete, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudPrivatecatalogproducerV1beta1Catalog] = js.native
  def undelete(
    params: ParamsResourceCatalogsUndelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudPrivatecatalogproducerV1beta1Catalog]
  ): Unit = js.native
}

