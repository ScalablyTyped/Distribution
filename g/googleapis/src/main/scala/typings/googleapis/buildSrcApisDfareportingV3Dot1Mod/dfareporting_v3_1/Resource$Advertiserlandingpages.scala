package typings.googleapis.buildSrcApisDfareportingV3Dot1Mod.dfareporting_v3_1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/dfareporting/v3.1", "dfareporting_v3_1.Resource$Advertiserlandingpages")
@js.native
class Resource$Advertiserlandingpages protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * dfareporting.advertiserLandingPages.get
    * @desc Gets one landing page by ID.
    * @alias dfareporting.advertiserLandingPages.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.id Landing page ID.
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$LandingPage] = js.native
  def get(callback: BodyResponseCallback[Schema$LandingPage]): Unit = js.native
  def get(params: ParamsDollarResourceDollarAdvertiserlandingpagesDollarGet): GaxiosPromise[Schema$LandingPage] = js.native
  def get(
    params: ParamsDollarResourceDollarAdvertiserlandingpagesDollarGet,
    callback: BodyResponseCallback[Schema$LandingPage]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarAdvertiserlandingpagesDollarGet,
    options: BodyResponseCallback[Schema$LandingPage],
    callback: BodyResponseCallback[Schema$LandingPage]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarAdvertiserlandingpagesDollarGet, options: MethodOptions): GaxiosPromise[Schema$LandingPage] = js.native
  def get(
    params: ParamsDollarResourceDollarAdvertiserlandingpagesDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$LandingPage]
  ): Unit = js.native
  /**
    * dfareporting.advertiserLandingPages.insert
    * @desc Inserts a new landing page.
    * @alias dfareporting.advertiserLandingPages.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {().LandingPage} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[Schema$LandingPage] = js.native
  def insert(callback: BodyResponseCallback[Schema$LandingPage]): Unit = js.native
  def insert(params: ParamsDollarResourceDollarAdvertiserlandingpagesDollarInsert): GaxiosPromise[Schema$LandingPage] = js.native
  def insert(
    params: ParamsDollarResourceDollarAdvertiserlandingpagesDollarInsert,
    callback: BodyResponseCallback[Schema$LandingPage]
  ): Unit = js.native
  def insert(
    params: ParamsDollarResourceDollarAdvertiserlandingpagesDollarInsert,
    options: BodyResponseCallback[Schema$LandingPage],
    callback: BodyResponseCallback[Schema$LandingPage]
  ): Unit = js.native
  def insert(params: ParamsDollarResourceDollarAdvertiserlandingpagesDollarInsert, options: MethodOptions): GaxiosPromise[Schema$LandingPage] = js.native
  def insert(
    params: ParamsDollarResourceDollarAdvertiserlandingpagesDollarInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$LandingPage]
  ): Unit = js.native
  /**
    * dfareporting.advertiserLandingPages.list
    * @desc Retrieves a list of landing pages.
    * @alias dfareporting.advertiserLandingPages.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.advertiserIds Select only landing pages that belong to these advertisers.
    * @param {boolean=} params.archived Select only archived landing pages. Don't set this field to select both archived and non-archived landing pages.
    * @param {string=} params.ids Select only landing pages with these IDs.
    * @param {integer=} params.maxResults Maximum number of results to return.
    * @param {string=} params.pageToken Value of the nextPageToken from the previous result page.
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {string=} params.searchString Allows searching for landing pages by name or ID. Wildcards (*) are allowed. For example, "landingpage*2017" will return landing pages with names like "landingpage July 2017", "landingpage March 2017", or simply "landingpage 2017". Most of the searches also add wildcards implicitly at the start and the end of the search string. For example, a search string of "landingpage" will match campaigns with name "my landingpage", "landingpage 2015", or simply "landingpage".
    * @param {string=} params.sortField Field by which to sort the list.
    * @param {string=} params.sortOrder Order of sorted results.
    * @param {string=} params.subaccountId Select only landing pages that belong to this subaccount.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$AdvertiserLandingPagesListResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$AdvertiserLandingPagesListResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarAdvertiserlandingpagesDollarList): GaxiosPromise[Schema$AdvertiserLandingPagesListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarAdvertiserlandingpagesDollarList,
    callback: BodyResponseCallback[Schema$AdvertiserLandingPagesListResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarAdvertiserlandingpagesDollarList,
    options: BodyResponseCallback[Schema$AdvertiserLandingPagesListResponse],
    callback: BodyResponseCallback[Schema$AdvertiserLandingPagesListResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarAdvertiserlandingpagesDollarList, options: MethodOptions): GaxiosPromise[Schema$AdvertiserLandingPagesListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarAdvertiserlandingpagesDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$AdvertiserLandingPagesListResponse]
  ): Unit = js.native
  /**
    * dfareporting.advertiserLandingPages.patch
    * @desc Updates an existing landing page. This method supports patch
    * semantics.
    * @alias dfareporting.advertiserLandingPages.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.id Landing page ID.
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {().LandingPage} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[Schema$LandingPage] = js.native
  def patch(callback: BodyResponseCallback[Schema$LandingPage]): Unit = js.native
  def patch(params: ParamsDollarResourceDollarAdvertiserlandingpagesDollarPatch): GaxiosPromise[Schema$LandingPage] = js.native
  def patch(
    params: ParamsDollarResourceDollarAdvertiserlandingpagesDollarPatch,
    callback: BodyResponseCallback[Schema$LandingPage]
  ): Unit = js.native
  def patch(
    params: ParamsDollarResourceDollarAdvertiserlandingpagesDollarPatch,
    options: BodyResponseCallback[Schema$LandingPage],
    callback: BodyResponseCallback[Schema$LandingPage]
  ): Unit = js.native
  def patch(params: ParamsDollarResourceDollarAdvertiserlandingpagesDollarPatch, options: MethodOptions): GaxiosPromise[Schema$LandingPage] = js.native
  def patch(
    params: ParamsDollarResourceDollarAdvertiserlandingpagesDollarPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$LandingPage]
  ): Unit = js.native
  /**
    * dfareporting.advertiserLandingPages.update
    * @desc Updates an existing landing page.
    * @alias dfareporting.advertiserLandingPages.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {().LandingPage} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[Schema$LandingPage] = js.native
  def update(callback: BodyResponseCallback[Schema$LandingPage]): Unit = js.native
  def update(params: ParamsDollarResourceDollarAdvertiserlandingpagesDollarUpdate): GaxiosPromise[Schema$LandingPage] = js.native
  def update(
    params: ParamsDollarResourceDollarAdvertiserlandingpagesDollarUpdate,
    callback: BodyResponseCallback[Schema$LandingPage]
  ): Unit = js.native
  def update(
    params: ParamsDollarResourceDollarAdvertiserlandingpagesDollarUpdate,
    options: BodyResponseCallback[Schema$LandingPage],
    callback: BodyResponseCallback[Schema$LandingPage]
  ): Unit = js.native
  def update(params: ParamsDollarResourceDollarAdvertiserlandingpagesDollarUpdate, options: MethodOptions): GaxiosPromise[Schema$LandingPage] = js.native
  def update(
    params: ParamsDollarResourceDollarAdvertiserlandingpagesDollarUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$LandingPage]
  ): Unit = js.native
}

