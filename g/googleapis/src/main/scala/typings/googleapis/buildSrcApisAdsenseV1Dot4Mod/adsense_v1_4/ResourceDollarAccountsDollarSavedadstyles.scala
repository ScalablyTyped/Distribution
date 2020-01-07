package typings.googleapis.buildSrcApisAdsenseV1Dot4Mod.adsense_v1_4

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/adsense/v1.4", "adsense_v1_4.Resource$Accounts$Savedadstyles")
@js.native
class ResourceDollarAccountsDollarSavedadstyles protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * adsense.accounts.savedadstyles.get
    * @desc List a specific saved ad style for the specified account.
    * @alias adsense.accounts.savedadstyles.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId Account for which to get the saved ad style.
    * @param {string} params.savedAdStyleId Saved ad style to retrieve.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$SavedAdStyle] = js.native
  def get(callback: BodyResponseCallback[Schema$SavedAdStyle]): Unit = js.native
  def get(params: ParamsDollarResourceDollarAccountsDollarSavedadstylesDollarGet): GaxiosPromise[Schema$SavedAdStyle] = js.native
  def get(
    params: ParamsDollarResourceDollarAccountsDollarSavedadstylesDollarGet,
    callback: BodyResponseCallback[Schema$SavedAdStyle]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarAccountsDollarSavedadstylesDollarGet,
    options: BodyResponseCallback[Schema$SavedAdStyle],
    callback: BodyResponseCallback[Schema$SavedAdStyle]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarAccountsDollarSavedadstylesDollarGet, options: MethodOptions): GaxiosPromise[Schema$SavedAdStyle] = js.native
  def get(
    params: ParamsDollarResourceDollarAccountsDollarSavedadstylesDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$SavedAdStyle]
  ): Unit = js.native
  /**
    * adsense.accounts.savedadstyles.list
    * @desc List all saved ad styles in the specified account.
    * @alias adsense.accounts.savedadstyles.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId Account for which to list saved ad styles.
    * @param {integer=} params.maxResults The maximum number of saved ad styles to include in the response, used for paging.
    * @param {string=} params.pageToken A continuation token, used to page through saved ad styles. To retrieve the next page, set this parameter to the value of "nextPageToken" from the previous response.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$SavedAdStyles] = js.native
  def list(callback: BodyResponseCallback[Schema$SavedAdStyles]): Unit = js.native
  def list(params: ParamsDollarResourceDollarAccountsDollarSavedadstylesDollarList): GaxiosPromise[Schema$SavedAdStyles] = js.native
  def list(
    params: ParamsDollarResourceDollarAccountsDollarSavedadstylesDollarList,
    callback: BodyResponseCallback[Schema$SavedAdStyles]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarAccountsDollarSavedadstylesDollarList,
    options: BodyResponseCallback[Schema$SavedAdStyles],
    callback: BodyResponseCallback[Schema$SavedAdStyles]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarAccountsDollarSavedadstylesDollarList, options: MethodOptions): GaxiosPromise[Schema$SavedAdStyles] = js.native
  def list(
    params: ParamsDollarResourceDollarAccountsDollarSavedadstylesDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$SavedAdStyles]
  ): Unit = js.native
}

