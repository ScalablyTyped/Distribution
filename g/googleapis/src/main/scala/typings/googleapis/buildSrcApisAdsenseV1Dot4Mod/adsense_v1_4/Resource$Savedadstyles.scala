package typings.googleapis.buildSrcApisAdsenseV1Dot4Mod.adsense_v1_4

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/adsense/v1.4", "adsense_v1_4.Resource$Savedadstyles")
@js.native
class Resource$Savedadstyles protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * adsense.savedadstyles.get
    * @desc Get a specific saved ad style from the user's account.
    * @alias adsense.savedadstyles.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.savedAdStyleId Saved ad style to retrieve.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$SavedAdStyle] = js.native
  def get(callback: BodyResponseCallback[Schema$SavedAdStyle]): Unit = js.native
  def get(params: ParamsDollarResourceDollarSavedadstylesDollarGet): GaxiosPromise[Schema$SavedAdStyle] = js.native
  def get(
    params: ParamsDollarResourceDollarSavedadstylesDollarGet,
    callback: BodyResponseCallback[Schema$SavedAdStyle]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarSavedadstylesDollarGet,
    options: BodyResponseCallback[Schema$SavedAdStyle],
    callback: BodyResponseCallback[Schema$SavedAdStyle]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarSavedadstylesDollarGet, options: MethodOptions): GaxiosPromise[Schema$SavedAdStyle] = js.native
  def get(
    params: ParamsDollarResourceDollarSavedadstylesDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$SavedAdStyle]
  ): Unit = js.native
  /**
    * adsense.savedadstyles.list
    * @desc List all saved ad styles in the user's account.
    * @alias adsense.savedadstyles.list
    * @memberOf! ()
    *
    * @param {object=} params Parameters for request
    * @param {integer=} params.maxResults The maximum number of saved ad styles to include in the response, used for paging.
    * @param {string=} params.pageToken A continuation token, used to page through saved ad styles. To retrieve the next page, set this parameter to the value of "nextPageToken" from the previous response.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$SavedAdStyles] = js.native
  def list(callback: BodyResponseCallback[Schema$SavedAdStyles]): Unit = js.native
  def list(params: ParamsDollarResourceDollarSavedadstylesDollarList): GaxiosPromise[Schema$SavedAdStyles] = js.native
  def list(
    params: ParamsDollarResourceDollarSavedadstylesDollarList,
    callback: BodyResponseCallback[Schema$SavedAdStyles]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarSavedadstylesDollarList,
    options: BodyResponseCallback[Schema$SavedAdStyles],
    callback: BodyResponseCallback[Schema$SavedAdStyles]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarSavedadstylesDollarList, options: MethodOptions): GaxiosPromise[Schema$SavedAdStyles] = js.native
  def list(
    params: ParamsDollarResourceDollarSavedadstylesDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$SavedAdStyles]
  ): Unit = js.native
}

