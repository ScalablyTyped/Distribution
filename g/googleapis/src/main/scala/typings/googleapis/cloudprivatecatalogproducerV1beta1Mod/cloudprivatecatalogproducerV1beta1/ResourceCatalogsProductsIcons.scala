package typings.googleapis.cloudprivatecatalogproducerV1beta1Mod.cloudprivatecatalogproducerV1beta1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/cloudprivatecatalogproducer/v1beta1", "cloudprivatecatalogproducer_v1beta1.Resource$Catalogs$Products$Icons")
@js.native
class ResourceCatalogsProductsIcons protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * cloudprivatecatalogproducer.catalogs.products.icons.upload
    * @desc Creates an Icon instance under a given Product. If Product only has
    * a default icon, a new Icon instance is created and associated with the
    * given Product. If Product already has a non-default icon, the action
    * creates a new Icon instance, associates the newly created Icon with the
    * given Product and deletes the old icon.
    * @alias cloudprivatecatalogproducer.catalogs.products.icons.upload
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.product The resource name of the product.
    * @param {().GoogleCloudPrivatecatalogproducerV1beta1UploadIconRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def upload(): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def upload(callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]): Unit = js.native
  def upload(params: ParamsResourceCatalogsProductsIconsUpload): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def upload(
    params: ParamsResourceCatalogsProductsIconsUpload,
    callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  def upload(
    params: ParamsResourceCatalogsProductsIconsUpload,
    options: BodyResponseCallback[SchemaGoogleProtobufEmpty],
    callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  def upload(params: ParamsResourceCatalogsProductsIconsUpload, options: MethodOptions): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def upload(
    params: ParamsResourceCatalogsProductsIconsUpload,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]
  ): Unit = js.native
}

