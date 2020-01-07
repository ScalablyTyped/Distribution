package typings.googleapis.buildSrcApisDfareportingV3Dot2Mod.dfareporting_v3_2

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/dfareporting/v3.2", "dfareporting_v3_2.Resource$Floodlightactivitygroups")
@js.native
class Resource$Floodlightactivitygroups protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * dfareporting.floodlightActivityGroups.get
    * @desc Gets one floodlight activity group by ID.
    * @alias dfareporting.floodlightActivityGroups.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.id Floodlight activity Group ID.
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$FloodlightActivityGroup] = js.native
  def get(callback: BodyResponseCallback[Schema$FloodlightActivityGroup]): Unit = js.native
  def get(params: ParamsDollarResourceDollarFloodlightactivitygroupsDollarGet): GaxiosPromise[Schema$FloodlightActivityGroup] = js.native
  def get(
    params: ParamsDollarResourceDollarFloodlightactivitygroupsDollarGet,
    callback: BodyResponseCallback[Schema$FloodlightActivityGroup]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarFloodlightactivitygroupsDollarGet,
    options: BodyResponseCallback[Schema$FloodlightActivityGroup],
    callback: BodyResponseCallback[Schema$FloodlightActivityGroup]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarFloodlightactivitygroupsDollarGet, options: MethodOptions): GaxiosPromise[Schema$FloodlightActivityGroup] = js.native
  def get(
    params: ParamsDollarResourceDollarFloodlightactivitygroupsDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$FloodlightActivityGroup]
  ): Unit = js.native
  /**
    * dfareporting.floodlightActivityGroups.insert
    * @desc Inserts a new floodlight activity group.
    * @alias dfareporting.floodlightActivityGroups.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {().FloodlightActivityGroup} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[Schema$FloodlightActivityGroup] = js.native
  def insert(callback: BodyResponseCallback[Schema$FloodlightActivityGroup]): Unit = js.native
  def insert(params: ParamsDollarResourceDollarFloodlightactivitygroupsDollarInsert): GaxiosPromise[Schema$FloodlightActivityGroup] = js.native
  def insert(
    params: ParamsDollarResourceDollarFloodlightactivitygroupsDollarInsert,
    callback: BodyResponseCallback[Schema$FloodlightActivityGroup]
  ): Unit = js.native
  def insert(
    params: ParamsDollarResourceDollarFloodlightactivitygroupsDollarInsert,
    options: BodyResponseCallback[Schema$FloodlightActivityGroup],
    callback: BodyResponseCallback[Schema$FloodlightActivityGroup]
  ): Unit = js.native
  def insert(params: ParamsDollarResourceDollarFloodlightactivitygroupsDollarInsert, options: MethodOptions): GaxiosPromise[Schema$FloodlightActivityGroup] = js.native
  def insert(
    params: ParamsDollarResourceDollarFloodlightactivitygroupsDollarInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$FloodlightActivityGroup]
  ): Unit = js.native
  /**
    * dfareporting.floodlightActivityGroups.list
    * @desc Retrieves a list of floodlight activity groups, possibly filtered.
    * This method supports paging.
    * @alias dfareporting.floodlightActivityGroups.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.advertiserId Select only floodlight activity groups with the specified advertiser ID. Must specify either advertiserId or floodlightConfigurationId for a non-empty result.
    * @param {string=} params.floodlightConfigurationId Select only floodlight activity groups with the specified floodlight configuration ID. Must specify either advertiserId, or floodlightConfigurationId for a non-empty result.
    * @param {string=} params.ids Select only floodlight activity groups with the specified IDs. Must specify either advertiserId or floodlightConfigurationId for a non-empty result.
    * @param {integer=} params.maxResults Maximum number of results to return.
    * @param {string=} params.pageToken Value of the nextPageToken from the previous result page.
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {string=} params.searchString Allows searching for objects by name or ID. Wildcards (*) are allowed. For example, "floodlightactivitygroup*2015" will return objects with names like "floodlightactivitygroup June 2015", "floodlightactivitygroup April 2015", or simply "floodlightactivitygroup 2015". Most of the searches also add wildcards implicitly at the start and the end of the search string. For example, a search string of "floodlightactivitygroup" will match objects with name "my floodlightactivitygroup activity", "floodlightactivitygroup 2015", or simply "floodlightactivitygroup".
    * @param {string=} params.sortField Field by which to sort the list.
    * @param {string=} params.sortOrder Order of sorted results.
    * @param {string=} params.type Select only floodlight activity groups with the specified floodlight activity group type.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$FloodlightActivityGroupsListResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$FloodlightActivityGroupsListResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarFloodlightactivitygroupsDollarList): GaxiosPromise[Schema$FloodlightActivityGroupsListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarFloodlightactivitygroupsDollarList,
    callback: BodyResponseCallback[Schema$FloodlightActivityGroupsListResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarFloodlightactivitygroupsDollarList,
    options: BodyResponseCallback[Schema$FloodlightActivityGroupsListResponse],
    callback: BodyResponseCallback[Schema$FloodlightActivityGroupsListResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarFloodlightactivitygroupsDollarList, options: MethodOptions): GaxiosPromise[Schema$FloodlightActivityGroupsListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarFloodlightactivitygroupsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$FloodlightActivityGroupsListResponse]
  ): Unit = js.native
  /**
    * dfareporting.floodlightActivityGroups.patch
    * @desc Updates an existing floodlight activity group. This method supports
    * patch semantics.
    * @alias dfareporting.floodlightActivityGroups.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.id Floodlight activity Group ID.
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {().FloodlightActivityGroup} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[Schema$FloodlightActivityGroup] = js.native
  def patch(callback: BodyResponseCallback[Schema$FloodlightActivityGroup]): Unit = js.native
  def patch(params: ParamsDollarResourceDollarFloodlightactivitygroupsDollarPatch): GaxiosPromise[Schema$FloodlightActivityGroup] = js.native
  def patch(
    params: ParamsDollarResourceDollarFloodlightactivitygroupsDollarPatch,
    callback: BodyResponseCallback[Schema$FloodlightActivityGroup]
  ): Unit = js.native
  def patch(
    params: ParamsDollarResourceDollarFloodlightactivitygroupsDollarPatch,
    options: BodyResponseCallback[Schema$FloodlightActivityGroup],
    callback: BodyResponseCallback[Schema$FloodlightActivityGroup]
  ): Unit = js.native
  def patch(params: ParamsDollarResourceDollarFloodlightactivitygroupsDollarPatch, options: MethodOptions): GaxiosPromise[Schema$FloodlightActivityGroup] = js.native
  def patch(
    params: ParamsDollarResourceDollarFloodlightactivitygroupsDollarPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$FloodlightActivityGroup]
  ): Unit = js.native
  /**
    * dfareporting.floodlightActivityGroups.update
    * @desc Updates an existing floodlight activity group.
    * @alias dfareporting.floodlightActivityGroups.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {().FloodlightActivityGroup} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[Schema$FloodlightActivityGroup] = js.native
  def update(callback: BodyResponseCallback[Schema$FloodlightActivityGroup]): Unit = js.native
  def update(params: ParamsDollarResourceDollarFloodlightactivitygroupsDollarUpdate): GaxiosPromise[Schema$FloodlightActivityGroup] = js.native
  def update(
    params: ParamsDollarResourceDollarFloodlightactivitygroupsDollarUpdate,
    callback: BodyResponseCallback[Schema$FloodlightActivityGroup]
  ): Unit = js.native
  def update(
    params: ParamsDollarResourceDollarFloodlightactivitygroupsDollarUpdate,
    options: BodyResponseCallback[Schema$FloodlightActivityGroup],
    callback: BodyResponseCallback[Schema$FloodlightActivityGroup]
  ): Unit = js.native
  def update(params: ParamsDollarResourceDollarFloodlightactivitygroupsDollarUpdate, options: MethodOptions): GaxiosPromise[Schema$FloodlightActivityGroup] = js.native
  def update(
    params: ParamsDollarResourceDollarFloodlightactivitygroupsDollarUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$FloodlightActivityGroup]
  ): Unit = js.native
}

