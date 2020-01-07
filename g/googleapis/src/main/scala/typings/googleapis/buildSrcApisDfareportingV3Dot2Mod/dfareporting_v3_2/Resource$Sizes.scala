package typings.googleapis.buildSrcApisDfareportingV3Dot2Mod.dfareporting_v3_2

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/dfareporting/v3.2", "dfareporting_v3_2.Resource$Sizes")
@js.native
class Resource$Sizes protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * dfareporting.sizes.get
    * @desc Gets one size by ID.
    * @alias dfareporting.sizes.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.id Size ID.
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$Size] = js.native
  def get(callback: BodyResponseCallback[Schema$Size]): Unit = js.native
  def get(params: ParamsDollarResourceDollarSizesDollarGet): GaxiosPromise[Schema$Size] = js.native
  def get(params: ParamsDollarResourceDollarSizesDollarGet, callback: BodyResponseCallback[Schema$Size]): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarSizesDollarGet,
    options: BodyResponseCallback[Schema$Size],
    callback: BodyResponseCallback[Schema$Size]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarSizesDollarGet, options: MethodOptions): GaxiosPromise[Schema$Size] = js.native
  def get(
    params: ParamsDollarResourceDollarSizesDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Size]
  ): Unit = js.native
  /**
    * dfareporting.sizes.insert
    * @desc Inserts a new size.
    * @alias dfareporting.sizes.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {().Size} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[Schema$Size] = js.native
  def insert(callback: BodyResponseCallback[Schema$Size]): Unit = js.native
  def insert(params: ParamsDollarResourceDollarSizesDollarInsert): GaxiosPromise[Schema$Size] = js.native
  def insert(params: ParamsDollarResourceDollarSizesDollarInsert, callback: BodyResponseCallback[Schema$Size]): Unit = js.native
  def insert(
    params: ParamsDollarResourceDollarSizesDollarInsert,
    options: BodyResponseCallback[Schema$Size],
    callback: BodyResponseCallback[Schema$Size]
  ): Unit = js.native
  def insert(params: ParamsDollarResourceDollarSizesDollarInsert, options: MethodOptions): GaxiosPromise[Schema$Size] = js.native
  def insert(
    params: ParamsDollarResourceDollarSizesDollarInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Size]
  ): Unit = js.native
  /**
    * dfareporting.sizes.list
    * @desc Retrieves a list of sizes, possibly filtered. Retrieved sizes are
    * globally unique and may include values not currently in use by your
    * account. Due to this, the list of sizes returned by this method may
    * differ from the list seen in the Trafficking UI.
    * @alias dfareporting.sizes.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer=} params.height Select only sizes with this height.
    * @param {boolean=} params.iabStandard Select only IAB standard sizes.
    * @param {string=} params.ids Select only sizes with these IDs.
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {integer=} params.width Select only sizes with this width.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$SizesListResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$SizesListResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarSizesDollarList): GaxiosPromise[Schema$SizesListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarSizesDollarList,
    callback: BodyResponseCallback[Schema$SizesListResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarSizesDollarList,
    options: BodyResponseCallback[Schema$SizesListResponse],
    callback: BodyResponseCallback[Schema$SizesListResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarSizesDollarList, options: MethodOptions): GaxiosPromise[Schema$SizesListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarSizesDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$SizesListResponse]
  ): Unit = js.native
}

