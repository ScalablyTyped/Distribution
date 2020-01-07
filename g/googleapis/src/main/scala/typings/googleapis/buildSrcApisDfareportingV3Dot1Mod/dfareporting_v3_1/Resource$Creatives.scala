package typings.googleapis.buildSrcApisDfareportingV3Dot1Mod.dfareporting_v3_1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/dfareporting/v3.1", "dfareporting_v3_1.Resource$Creatives")
@js.native
class Resource$Creatives protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * dfareporting.creatives.get
    * @desc Gets one creative by ID.
    * @alias dfareporting.creatives.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.id Creative ID.
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$Creative] = js.native
  def get(callback: BodyResponseCallback[Schema$Creative]): Unit = js.native
  def get(params: ParamsDollarResourceDollarCreativesDollarGet): GaxiosPromise[Schema$Creative] = js.native
  def get(
    params: ParamsDollarResourceDollarCreativesDollarGet,
    callback: BodyResponseCallback[Schema$Creative]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarCreativesDollarGet,
    options: BodyResponseCallback[Schema$Creative],
    callback: BodyResponseCallback[Schema$Creative]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarCreativesDollarGet, options: MethodOptions): GaxiosPromise[Schema$Creative] = js.native
  def get(
    params: ParamsDollarResourceDollarCreativesDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Creative]
  ): Unit = js.native
  /**
    * dfareporting.creatives.insert
    * @desc Inserts a new creative.
    * @alias dfareporting.creatives.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {().Creative} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[Schema$Creative] = js.native
  def insert(callback: BodyResponseCallback[Schema$Creative]): Unit = js.native
  def insert(params: ParamsDollarResourceDollarCreativesDollarInsert): GaxiosPromise[Schema$Creative] = js.native
  def insert(
    params: ParamsDollarResourceDollarCreativesDollarInsert,
    callback: BodyResponseCallback[Schema$Creative]
  ): Unit = js.native
  def insert(
    params: ParamsDollarResourceDollarCreativesDollarInsert,
    options: BodyResponseCallback[Schema$Creative],
    callback: BodyResponseCallback[Schema$Creative]
  ): Unit = js.native
  def insert(params: ParamsDollarResourceDollarCreativesDollarInsert, options: MethodOptions): GaxiosPromise[Schema$Creative] = js.native
  def insert(
    params: ParamsDollarResourceDollarCreativesDollarInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Creative]
  ): Unit = js.native
  /**
    * dfareporting.creatives.list
    * @desc Retrieves a list of creatives, possibly filtered. This method
    * supports paging.
    * @alias dfareporting.creatives.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {boolean=} params.active Select only active creatives. Leave blank to select active and inactive creatives.
    * @param {string=} params.advertiserId Select only creatives with this advertiser ID.
    * @param {boolean=} params.archived Select only archived creatives. Leave blank to select archived and unarchived creatives.
    * @param {string=} params.campaignId Select only creatives with this campaign ID.
    * @param {string=} params.companionCreativeIds Select only in-stream video creatives with these companion IDs.
    * @param {string=} params.creativeFieldIds Select only creatives with these creative field IDs.
    * @param {string=} params.ids Select only creatives with these IDs.
    * @param {integer=} params.maxResults Maximum number of results to return.
    * @param {string=} params.pageToken Value of the nextPageToken from the previous result page.
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {string=} params.renderingIds Select only creatives with these rendering IDs.
    * @param {string=} params.searchString Allows searching for objects by name or ID. Wildcards (*) are allowed. For example, "creative*2015" will return objects with names like "creative June 2015", "creative April 2015", or simply "creative 2015". Most of the searches also add wildcards implicitly at the start and the end of the search string. For example, a search string of "creative" will match objects with name "my creative", "creative 2015", or simply "creative".
    * @param {string=} params.sizeIds Select only creatives with these size IDs.
    * @param {string=} params.sortField Field by which to sort the list.
    * @param {string=} params.sortOrder Order of sorted results.
    * @param {string=} params.studioCreativeId Select only creatives corresponding to this Studio creative ID.
    * @param {string=} params.types Select only creatives with these creative types.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$CreativesListResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$CreativesListResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarCreativesDollarList): GaxiosPromise[Schema$CreativesListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarCreativesDollarList,
    callback: BodyResponseCallback[Schema$CreativesListResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarCreativesDollarList,
    options: BodyResponseCallback[Schema$CreativesListResponse],
    callback: BodyResponseCallback[Schema$CreativesListResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarCreativesDollarList, options: MethodOptions): GaxiosPromise[Schema$CreativesListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarCreativesDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$CreativesListResponse]
  ): Unit = js.native
  /**
    * dfareporting.creatives.patch
    * @desc Updates an existing creative. This method supports patch semantics.
    * @alias dfareporting.creatives.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.id Creative ID.
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {().Creative} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[Schema$Creative] = js.native
  def patch(callback: BodyResponseCallback[Schema$Creative]): Unit = js.native
  def patch(params: ParamsDollarResourceDollarCreativesDollarPatch): GaxiosPromise[Schema$Creative] = js.native
  def patch(
    params: ParamsDollarResourceDollarCreativesDollarPatch,
    callback: BodyResponseCallback[Schema$Creative]
  ): Unit = js.native
  def patch(
    params: ParamsDollarResourceDollarCreativesDollarPatch,
    options: BodyResponseCallback[Schema$Creative],
    callback: BodyResponseCallback[Schema$Creative]
  ): Unit = js.native
  def patch(params: ParamsDollarResourceDollarCreativesDollarPatch, options: MethodOptions): GaxiosPromise[Schema$Creative] = js.native
  def patch(
    params: ParamsDollarResourceDollarCreativesDollarPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Creative]
  ): Unit = js.native
  /**
    * dfareporting.creatives.update
    * @desc Updates an existing creative.
    * @alias dfareporting.creatives.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {().Creative} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[Schema$Creative] = js.native
  def update(callback: BodyResponseCallback[Schema$Creative]): Unit = js.native
  def update(params: ParamsDollarResourceDollarCreativesDollarUpdate): GaxiosPromise[Schema$Creative] = js.native
  def update(
    params: ParamsDollarResourceDollarCreativesDollarUpdate,
    callback: BodyResponseCallback[Schema$Creative]
  ): Unit = js.native
  def update(
    params: ParamsDollarResourceDollarCreativesDollarUpdate,
    options: BodyResponseCallback[Schema$Creative],
    callback: BodyResponseCallback[Schema$Creative]
  ): Unit = js.native
  def update(params: ParamsDollarResourceDollarCreativesDollarUpdate, options: MethodOptions): GaxiosPromise[Schema$Creative] = js.native
  def update(
    params: ParamsDollarResourceDollarCreativesDollarUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Creative]
  ): Unit = js.native
}

