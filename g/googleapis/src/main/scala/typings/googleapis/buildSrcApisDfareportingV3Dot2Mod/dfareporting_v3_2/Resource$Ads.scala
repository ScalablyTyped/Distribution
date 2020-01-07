package typings.googleapis.buildSrcApisDfareportingV3Dot2Mod.dfareporting_v3_2

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/dfareporting/v3.2", "dfareporting_v3_2.Resource$Ads")
@js.native
class Resource$Ads protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * dfareporting.ads.get
    * @desc Gets one ad by ID.
    * @alias dfareporting.ads.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.id Ad ID.
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$Ad] = js.native
  def get(callback: BodyResponseCallback[Schema$Ad]): Unit = js.native
  def get(params: ParamsDollarResourceDollarAdsDollarGet): GaxiosPromise[Schema$Ad] = js.native
  def get(params: ParamsDollarResourceDollarAdsDollarGet, callback: BodyResponseCallback[Schema$Ad]): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarAdsDollarGet,
    options: BodyResponseCallback[Schema$Ad],
    callback: BodyResponseCallback[Schema$Ad]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarAdsDollarGet, options: MethodOptions): GaxiosPromise[Schema$Ad] = js.native
  def get(
    params: ParamsDollarResourceDollarAdsDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Ad]
  ): Unit = js.native
  /**
    * dfareporting.ads.insert
    * @desc Inserts a new ad.
    * @alias dfareporting.ads.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {().Ad} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[Schema$Ad] = js.native
  def insert(callback: BodyResponseCallback[Schema$Ad]): Unit = js.native
  def insert(params: ParamsDollarResourceDollarAdsDollarInsert): GaxiosPromise[Schema$Ad] = js.native
  def insert(params: ParamsDollarResourceDollarAdsDollarInsert, callback: BodyResponseCallback[Schema$Ad]): Unit = js.native
  def insert(
    params: ParamsDollarResourceDollarAdsDollarInsert,
    options: BodyResponseCallback[Schema$Ad],
    callback: BodyResponseCallback[Schema$Ad]
  ): Unit = js.native
  def insert(params: ParamsDollarResourceDollarAdsDollarInsert, options: MethodOptions): GaxiosPromise[Schema$Ad] = js.native
  def insert(
    params: ParamsDollarResourceDollarAdsDollarInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Ad]
  ): Unit = js.native
  /**
    * dfareporting.ads.list
    * @desc Retrieves a list of ads, possibly filtered. This method supports
    * paging.
    * @alias dfareporting.ads.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {boolean=} params.active Select only active ads.
    * @param {string=} params.advertiserId Select only ads with this advertiser ID.
    * @param {boolean=} params.archived Select only archived ads.
    * @param {string=} params.audienceSegmentIds Select only ads with these audience segment IDs.
    * @param {string=} params.campaignIds Select only ads with these campaign IDs.
    * @param {string=} params.compatibility Select default ads with the specified compatibility. Applicable when type is AD_SERVING_DEFAULT_AD. DISPLAY and DISPLAY_INTERSTITIAL refer to rendering either on desktop or on mobile devices for regular or interstitial ads, respectively. APP and APP_INTERSTITIAL are for rendering in mobile apps. IN_STREAM_VIDEO refers to rendering an in-stream video ads developed with the VAST standard.
    * @param {string=} params.creativeIds Select only ads with these creative IDs assigned.
    * @param {string=} params.creativeOptimizationConfigurationIds Select only ads with these creative optimization configuration IDs.
    * @param {boolean=} params.dynamicClickTracker Select only dynamic click trackers. Applicable when type is AD_SERVING_CLICK_TRACKER. If true, select dynamic click trackers. If false, select static click trackers. Leave unset to select both.
    * @param {string=} params.ids Select only ads with these IDs.
    * @param {string=} params.landingPageIds Select only ads with these landing page IDs.
    * @param {integer=} params.maxResults Maximum number of results to return.
    * @param {string=} params.overriddenEventTagId Select only ads with this event tag override ID.
    * @param {string=} params.pageToken Value of the nextPageToken from the previous result page.
    * @param {string=} params.placementIds Select only ads with these placement IDs assigned.
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {string=} params.remarketingListIds Select only ads whose list targeting expression use these remarketing list IDs.
    * @param {string=} params.searchString Allows searching for objects by name or ID. Wildcards (*) are allowed. For example, "ad*2015" will return objects with names like "ad June 2015", "ad April 2015", or simply "ad 2015". Most of the searches also add wildcards implicitly at the start and the end of the search string. For example, a search string of "ad" will match objects with name "my ad", "ad 2015", or simply "ad".
    * @param {string=} params.sizeIds Select only ads with these size IDs.
    * @param {string=} params.sortField Field by which to sort the list.
    * @param {string=} params.sortOrder Order of sorted results.
    * @param {boolean=} params.sslCompliant Select only ads that are SSL-compliant.
    * @param {boolean=} params.sslRequired Select only ads that require SSL.
    * @param {string=} params.type Select only ads with these types.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$AdsListResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$AdsListResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarAdsDollarList): GaxiosPromise[Schema$AdsListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarAdsDollarList,
    callback: BodyResponseCallback[Schema$AdsListResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarAdsDollarList,
    options: BodyResponseCallback[Schema$AdsListResponse],
    callback: BodyResponseCallback[Schema$AdsListResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarAdsDollarList, options: MethodOptions): GaxiosPromise[Schema$AdsListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarAdsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$AdsListResponse]
  ): Unit = js.native
  /**
    * dfareporting.ads.patch
    * @desc Updates an existing ad. This method supports patch semantics.
    * @alias dfareporting.ads.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.id Ad ID.
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {().Ad} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[Schema$Ad] = js.native
  def patch(callback: BodyResponseCallback[Schema$Ad]): Unit = js.native
  def patch(params: ParamsDollarResourceDollarAdsDollarPatch): GaxiosPromise[Schema$Ad] = js.native
  def patch(params: ParamsDollarResourceDollarAdsDollarPatch, callback: BodyResponseCallback[Schema$Ad]): Unit = js.native
  def patch(
    params: ParamsDollarResourceDollarAdsDollarPatch,
    options: BodyResponseCallback[Schema$Ad],
    callback: BodyResponseCallback[Schema$Ad]
  ): Unit = js.native
  def patch(params: ParamsDollarResourceDollarAdsDollarPatch, options: MethodOptions): GaxiosPromise[Schema$Ad] = js.native
  def patch(
    params: ParamsDollarResourceDollarAdsDollarPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Ad]
  ): Unit = js.native
  /**
    * dfareporting.ads.update
    * @desc Updates an existing ad.
    * @alias dfareporting.ads.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {().Ad} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[Schema$Ad] = js.native
  def update(callback: BodyResponseCallback[Schema$Ad]): Unit = js.native
  def update(params: ParamsDollarResourceDollarAdsDollarUpdate): GaxiosPromise[Schema$Ad] = js.native
  def update(params: ParamsDollarResourceDollarAdsDollarUpdate, callback: BodyResponseCallback[Schema$Ad]): Unit = js.native
  def update(
    params: ParamsDollarResourceDollarAdsDollarUpdate,
    options: BodyResponseCallback[Schema$Ad],
    callback: BodyResponseCallback[Schema$Ad]
  ): Unit = js.native
  def update(params: ParamsDollarResourceDollarAdsDollarUpdate, options: MethodOptions): GaxiosPromise[Schema$Ad] = js.native
  def update(
    params: ParamsDollarResourceDollarAdsDollarUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Ad]
  ): Unit = js.native
}

