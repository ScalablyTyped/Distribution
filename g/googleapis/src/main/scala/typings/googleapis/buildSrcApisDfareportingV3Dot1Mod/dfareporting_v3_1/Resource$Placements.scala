package typings.googleapis.buildSrcApisDfareportingV3Dot1Mod.dfareporting_v3_1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/dfareporting/v3.1", "dfareporting_v3_1.Resource$Placements")
@js.native
class Resource$Placements protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * dfareporting.placements.generatetags
    * @desc Generates tags for a placement.
    * @alias dfareporting.placements.generatetags
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.campaignId Generate placements belonging to this campaign. This is a required field.
    * @param {string=} params.placementIds Generate tags for these placements.
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {string=} params.tagFormats Tag formats to generate for these placements.  Note: PLACEMENT_TAG_STANDARD can only be generated for 1x1 placements.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def generatetags(): GaxiosPromise[Schema$PlacementsGenerateTagsResponse] = js.native
  def generatetags(callback: BodyResponseCallback[Schema$PlacementsGenerateTagsResponse]): Unit = js.native
  def generatetags(params: ParamsDollarResourceDollarPlacementsDollarGeneratetags): GaxiosPromise[Schema$PlacementsGenerateTagsResponse] = js.native
  def generatetags(
    params: ParamsDollarResourceDollarPlacementsDollarGeneratetags,
    callback: BodyResponseCallback[Schema$PlacementsGenerateTagsResponse]
  ): Unit = js.native
  def generatetags(
    params: ParamsDollarResourceDollarPlacementsDollarGeneratetags,
    options: BodyResponseCallback[Schema$PlacementsGenerateTagsResponse],
    callback: BodyResponseCallback[Schema$PlacementsGenerateTagsResponse]
  ): Unit = js.native
  def generatetags(params: ParamsDollarResourceDollarPlacementsDollarGeneratetags, options: MethodOptions): GaxiosPromise[Schema$PlacementsGenerateTagsResponse] = js.native
  def generatetags(
    params: ParamsDollarResourceDollarPlacementsDollarGeneratetags,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$PlacementsGenerateTagsResponse]
  ): Unit = js.native
  /**
    * dfareporting.placements.get
    * @desc Gets one placement by ID.
    * @alias dfareporting.placements.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.id Placement ID.
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$Placement] = js.native
  def get(callback: BodyResponseCallback[Schema$Placement]): Unit = js.native
  def get(params: ParamsDollarResourceDollarPlacementsDollarGet): GaxiosPromise[Schema$Placement] = js.native
  def get(
    params: ParamsDollarResourceDollarPlacementsDollarGet,
    callback: BodyResponseCallback[Schema$Placement]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarPlacementsDollarGet,
    options: BodyResponseCallback[Schema$Placement],
    callback: BodyResponseCallback[Schema$Placement]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarPlacementsDollarGet, options: MethodOptions): GaxiosPromise[Schema$Placement] = js.native
  def get(
    params: ParamsDollarResourceDollarPlacementsDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Placement]
  ): Unit = js.native
  /**
    * dfareporting.placements.insert
    * @desc Inserts a new placement.
    * @alias dfareporting.placements.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {().Placement} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[Schema$Placement] = js.native
  def insert(callback: BodyResponseCallback[Schema$Placement]): Unit = js.native
  def insert(params: ParamsDollarResourceDollarPlacementsDollarInsert): GaxiosPromise[Schema$Placement] = js.native
  def insert(
    params: ParamsDollarResourceDollarPlacementsDollarInsert,
    callback: BodyResponseCallback[Schema$Placement]
  ): Unit = js.native
  def insert(
    params: ParamsDollarResourceDollarPlacementsDollarInsert,
    options: BodyResponseCallback[Schema$Placement],
    callback: BodyResponseCallback[Schema$Placement]
  ): Unit = js.native
  def insert(params: ParamsDollarResourceDollarPlacementsDollarInsert, options: MethodOptions): GaxiosPromise[Schema$Placement] = js.native
  def insert(
    params: ParamsDollarResourceDollarPlacementsDollarInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Placement]
  ): Unit = js.native
  /**
    * dfareporting.placements.list
    * @desc Retrieves a list of placements, possibly filtered. This method
    * supports paging.
    * @alias dfareporting.placements.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.advertiserIds Select only placements that belong to these advertisers.
    * @param {boolean=} params.archived Select only archived placements. Don't set this field to select both archived and non-archived placements.
    * @param {string=} params.campaignIds Select only placements that belong to these campaigns.
    * @param {string=} params.compatibilities Select only placements that are associated with these compatibilities. DISPLAY and DISPLAY_INTERSTITIAL refer to rendering either on desktop or on mobile devices for regular or interstitial ads respectively. APP and APP_INTERSTITIAL are for rendering in mobile apps. IN_STREAM_VIDEO refers to rendering in in-stream video ads developed with the VAST standard.
    * @param {string=} params.contentCategoryIds Select only placements that are associated with these content categories.
    * @param {string=} params.directorySiteIds Select only placements that are associated with these directory sites.
    * @param {string=} params.groupIds Select only placements that belong to these placement groups.
    * @param {string=} params.ids Select only placements with these IDs.
    * @param {string=} params.maxEndDate Select only placements or placement groups whose end date is on or before the specified maxEndDate. The date should be formatted as "yyyy-MM-dd".
    * @param {integer=} params.maxResults Maximum number of results to return.
    * @param {string=} params.maxStartDate Select only placements or placement groups whose start date is on or before the specified maxStartDate. The date should be formatted as "yyyy-MM-dd".
    * @param {string=} params.minEndDate Select only placements or placement groups whose end date is on or after the specified minEndDate. The date should be formatted as "yyyy-MM-dd".
    * @param {string=} params.minStartDate Select only placements or placement groups whose start date is on or after the specified minStartDate. The date should be formatted as "yyyy-MM-dd".
    * @param {string=} params.pageToken Value of the nextPageToken from the previous result page.
    * @param {string=} params.paymentSource Select only placements with this payment source.
    * @param {string=} params.placementStrategyIds Select only placements that are associated with these placement strategies.
    * @param {string=} params.pricingTypes Select only placements with these pricing types.
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {string=} params.searchString Allows searching for placements by name or ID. Wildcards (*) are allowed. For example, "placement*2015" will return placements with names like "placement June 2015", "placement May 2015", or simply "placements 2015". Most of the searches also add wildcards implicitly at the start and the end of the search string. For example, a search string of "placement" will match placements with name "my placement", "placement 2015", or simply "placement".
    * @param {string=} params.siteIds Select only placements that are associated with these sites.
    * @param {string=} params.sizeIds Select only placements that are associated with these sizes.
    * @param {string=} params.sortField Field by which to sort the list.
    * @param {string=} params.sortOrder Order of sorted results.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$PlacementsListResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$PlacementsListResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarPlacementsDollarList): GaxiosPromise[Schema$PlacementsListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarPlacementsDollarList,
    callback: BodyResponseCallback[Schema$PlacementsListResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarPlacementsDollarList,
    options: BodyResponseCallback[Schema$PlacementsListResponse],
    callback: BodyResponseCallback[Schema$PlacementsListResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarPlacementsDollarList, options: MethodOptions): GaxiosPromise[Schema$PlacementsListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarPlacementsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$PlacementsListResponse]
  ): Unit = js.native
  /**
    * dfareporting.placements.patch
    * @desc Updates an existing placement. This method supports patch
    * semantics.
    * @alias dfareporting.placements.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.id Placement ID.
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {().Placement} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[Schema$Placement] = js.native
  def patch(callback: BodyResponseCallback[Schema$Placement]): Unit = js.native
  def patch(params: ParamsDollarResourceDollarPlacementsDollarPatch): GaxiosPromise[Schema$Placement] = js.native
  def patch(
    params: ParamsDollarResourceDollarPlacementsDollarPatch,
    callback: BodyResponseCallback[Schema$Placement]
  ): Unit = js.native
  def patch(
    params: ParamsDollarResourceDollarPlacementsDollarPatch,
    options: BodyResponseCallback[Schema$Placement],
    callback: BodyResponseCallback[Schema$Placement]
  ): Unit = js.native
  def patch(params: ParamsDollarResourceDollarPlacementsDollarPatch, options: MethodOptions): GaxiosPromise[Schema$Placement] = js.native
  def patch(
    params: ParamsDollarResourceDollarPlacementsDollarPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Placement]
  ): Unit = js.native
  /**
    * dfareporting.placements.update
    * @desc Updates an existing placement.
    * @alias dfareporting.placements.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {().Placement} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[Schema$Placement] = js.native
  def update(callback: BodyResponseCallback[Schema$Placement]): Unit = js.native
  def update(params: ParamsDollarResourceDollarPlacementsDollarUpdate): GaxiosPromise[Schema$Placement] = js.native
  def update(
    params: ParamsDollarResourceDollarPlacementsDollarUpdate,
    callback: BodyResponseCallback[Schema$Placement]
  ): Unit = js.native
  def update(
    params: ParamsDollarResourceDollarPlacementsDollarUpdate,
    options: BodyResponseCallback[Schema$Placement],
    callback: BodyResponseCallback[Schema$Placement]
  ): Unit = js.native
  def update(params: ParamsDollarResourceDollarPlacementsDollarUpdate, options: MethodOptions): GaxiosPromise[Schema$Placement] = js.native
  def update(
    params: ParamsDollarResourceDollarPlacementsDollarUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Placement]
  ): Unit = js.native
}

