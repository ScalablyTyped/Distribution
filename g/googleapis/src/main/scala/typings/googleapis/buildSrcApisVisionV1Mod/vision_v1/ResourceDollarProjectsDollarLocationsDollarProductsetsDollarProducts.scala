package typings.googleapis.buildSrcApisVisionV1Mod.vision_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/vision/v1", "vision_v1.Resource$Projects$Locations$Productsets$Products")
@js.native
class ResourceDollarProjectsDollarLocationsDollarProductsetsDollarProducts protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * vision.projects.locations.productSets.products.list
    * @desc Lists the Products in a ProductSet, in an unspecified order. If the
    * ProductSet does not exist, the products field of the response will be
    * empty.  Possible errors:  * Returns INVALID_ARGUMENT if page_size is
    * greater than 100 or less than 1.
    * @alias vision.projects.locations.productSets.products.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The ProductSet resource for which to retrieve Products.  Format is: `projects/PROJECT_ID/locations/LOC_ID/productSets/PRODUCT_SET_ID`
    * @param {integer=} params.pageSize The maximum number of items to return. Default 10, maximum 100.
    * @param {string=} params.pageToken The next_page_token returned from a previous List request, if any.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$ListProductsInProductSetResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$ListProductsInProductSetResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarProjectsDollarLocationsDollarProductsetsDollarProductsDollarList): GaxiosPromise[Schema$ListProductsInProductSetResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarProductsetsDollarProductsDollarList,
    callback: BodyResponseCallback[Schema$ListProductsInProductSetResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarProductsetsDollarProductsDollarList,
    options: BodyResponseCallback[Schema$ListProductsInProductSetResponse],
    callback: BodyResponseCallback[Schema$ListProductsInProductSetResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarProductsetsDollarProductsDollarList,
    options: MethodOptions
  ): GaxiosPromise[Schema$ListProductsInProductSetResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarProductsetsDollarProductsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ListProductsInProductSetResponse]
  ): Unit = js.native
}

