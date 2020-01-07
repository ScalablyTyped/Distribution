package typings.googleapis.buildSrcApisDfareportingV3Dot2Mod.dfareporting_v3_2

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/dfareporting/v3.2", "dfareporting_v3_2.Resource$Floodlightactivities")
@js.native
class Resource$Floodlightactivities protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * dfareporting.floodlightActivities.delete
    * @desc Deletes an existing floodlight activity.
    * @alias dfareporting.floodlightActivities.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.id Floodlight activity ID.
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarFloodlightactivitiesDollarDelete): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsDollarResourceDollarFloodlightactivitiesDollarDelete,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarFloodlightactivitiesDollarDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(params: ParamsDollarResourceDollarFloodlightactivitiesDollarDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsDollarResourceDollarFloodlightactivitiesDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * dfareporting.floodlightActivities.generatetag
    * @desc Generates a tag for a floodlight activity.
    * @alias dfareporting.floodlightActivities.generatetag
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.floodlightActivityId Floodlight activity ID for which we want to generate a tag.
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def generatetag(): GaxiosPromise[Schema$FloodlightActivitiesGenerateTagResponse] = js.native
  def generatetag(callback: BodyResponseCallback[Schema$FloodlightActivitiesGenerateTagResponse]): Unit = js.native
  def generatetag(params: ParamsDollarResourceDollarFloodlightactivitiesDollarGeneratetag): GaxiosPromise[Schema$FloodlightActivitiesGenerateTagResponse] = js.native
  def generatetag(
    params: ParamsDollarResourceDollarFloodlightactivitiesDollarGeneratetag,
    callback: BodyResponseCallback[Schema$FloodlightActivitiesGenerateTagResponse]
  ): Unit = js.native
  def generatetag(
    params: ParamsDollarResourceDollarFloodlightactivitiesDollarGeneratetag,
    options: BodyResponseCallback[Schema$FloodlightActivitiesGenerateTagResponse],
    callback: BodyResponseCallback[Schema$FloodlightActivitiesGenerateTagResponse]
  ): Unit = js.native
  def generatetag(params: ParamsDollarResourceDollarFloodlightactivitiesDollarGeneratetag, options: MethodOptions): GaxiosPromise[Schema$FloodlightActivitiesGenerateTagResponse] = js.native
  def generatetag(
    params: ParamsDollarResourceDollarFloodlightactivitiesDollarGeneratetag,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$FloodlightActivitiesGenerateTagResponse]
  ): Unit = js.native
  /**
    * dfareporting.floodlightActivities.get
    * @desc Gets one floodlight activity by ID.
    * @alias dfareporting.floodlightActivities.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.id Floodlight activity ID.
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$FloodlightActivity] = js.native
  def get(callback: BodyResponseCallback[Schema$FloodlightActivity]): Unit = js.native
  def get(params: ParamsDollarResourceDollarFloodlightactivitiesDollarGet): GaxiosPromise[Schema$FloodlightActivity] = js.native
  def get(
    params: ParamsDollarResourceDollarFloodlightactivitiesDollarGet,
    callback: BodyResponseCallback[Schema$FloodlightActivity]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarFloodlightactivitiesDollarGet,
    options: BodyResponseCallback[Schema$FloodlightActivity],
    callback: BodyResponseCallback[Schema$FloodlightActivity]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarFloodlightactivitiesDollarGet, options: MethodOptions): GaxiosPromise[Schema$FloodlightActivity] = js.native
  def get(
    params: ParamsDollarResourceDollarFloodlightactivitiesDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$FloodlightActivity]
  ): Unit = js.native
  /**
    * dfareporting.floodlightActivities.insert
    * @desc Inserts a new floodlight activity.
    * @alias dfareporting.floodlightActivities.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {().FloodlightActivity} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[Schema$FloodlightActivity] = js.native
  def insert(callback: BodyResponseCallback[Schema$FloodlightActivity]): Unit = js.native
  def insert(params: ParamsDollarResourceDollarFloodlightactivitiesDollarInsert): GaxiosPromise[Schema$FloodlightActivity] = js.native
  def insert(
    params: ParamsDollarResourceDollarFloodlightactivitiesDollarInsert,
    callback: BodyResponseCallback[Schema$FloodlightActivity]
  ): Unit = js.native
  def insert(
    params: ParamsDollarResourceDollarFloodlightactivitiesDollarInsert,
    options: BodyResponseCallback[Schema$FloodlightActivity],
    callback: BodyResponseCallback[Schema$FloodlightActivity]
  ): Unit = js.native
  def insert(params: ParamsDollarResourceDollarFloodlightactivitiesDollarInsert, options: MethodOptions): GaxiosPromise[Schema$FloodlightActivity] = js.native
  def insert(
    params: ParamsDollarResourceDollarFloodlightactivitiesDollarInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$FloodlightActivity]
  ): Unit = js.native
  /**
    * dfareporting.floodlightActivities.list
    * @desc Retrieves a list of floodlight activities, possibly filtered. This
    * method supports paging.
    * @alias dfareporting.floodlightActivities.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.advertiserId Select only floodlight activities for the specified advertiser ID. Must specify either ids, advertiserId, or floodlightConfigurationId for a non-empty result.
    * @param {string=} params.floodlightActivityGroupIds Select only floodlight activities with the specified floodlight activity group IDs.
    * @param {string=} params.floodlightActivityGroupName Select only floodlight activities with the specified floodlight activity group name.
    * @param {string=} params.floodlightActivityGroupTagString Select only floodlight activities with the specified floodlight activity group tag string.
    * @param {string=} params.floodlightActivityGroupType Select only floodlight activities with the specified floodlight activity group type.
    * @param {string=} params.floodlightConfigurationId Select only floodlight activities for the specified floodlight configuration ID. Must specify either ids, advertiserId, or floodlightConfigurationId for a non-empty result.
    * @param {string=} params.ids Select only floodlight activities with the specified IDs. Must specify either ids, advertiserId, or floodlightConfigurationId for a non-empty result.
    * @param {integer=} params.maxResults Maximum number of results to return.
    * @param {string=} params.pageToken Value of the nextPageToken from the previous result page.
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {string=} params.searchString Allows searching for objects by name or ID. Wildcards (*) are allowed. For example, "floodlightactivity*2015" will return objects with names like "floodlightactivity June 2015", "floodlightactivity April 2015", or simply "floodlightactivity 2015". Most of the searches also add wildcards implicitly at the start and the end of the search string. For example, a search string of "floodlightactivity" will match objects with name "my floodlightactivity activity", "floodlightactivity 2015", or simply "floodlightactivity".
    * @param {string=} params.sortField Field by which to sort the list.
    * @param {string=} params.sortOrder Order of sorted results.
    * @param {string=} params.tagString Select only floodlight activities with the specified tag string.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$FloodlightActivitiesListResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$FloodlightActivitiesListResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarFloodlightactivitiesDollarList): GaxiosPromise[Schema$FloodlightActivitiesListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarFloodlightactivitiesDollarList,
    callback: BodyResponseCallback[Schema$FloodlightActivitiesListResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarFloodlightactivitiesDollarList,
    options: BodyResponseCallback[Schema$FloodlightActivitiesListResponse],
    callback: BodyResponseCallback[Schema$FloodlightActivitiesListResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarFloodlightactivitiesDollarList, options: MethodOptions): GaxiosPromise[Schema$FloodlightActivitiesListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarFloodlightactivitiesDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$FloodlightActivitiesListResponse]
  ): Unit = js.native
  /**
    * dfareporting.floodlightActivities.patch
    * @desc Updates an existing floodlight activity. This method supports patch
    * semantics.
    * @alias dfareporting.floodlightActivities.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.id Floodlight activity ID.
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {().FloodlightActivity} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[Schema$FloodlightActivity] = js.native
  def patch(callback: BodyResponseCallback[Schema$FloodlightActivity]): Unit = js.native
  def patch(params: ParamsDollarResourceDollarFloodlightactivitiesDollarPatch): GaxiosPromise[Schema$FloodlightActivity] = js.native
  def patch(
    params: ParamsDollarResourceDollarFloodlightactivitiesDollarPatch,
    callback: BodyResponseCallback[Schema$FloodlightActivity]
  ): Unit = js.native
  def patch(
    params: ParamsDollarResourceDollarFloodlightactivitiesDollarPatch,
    options: BodyResponseCallback[Schema$FloodlightActivity],
    callback: BodyResponseCallback[Schema$FloodlightActivity]
  ): Unit = js.native
  def patch(params: ParamsDollarResourceDollarFloodlightactivitiesDollarPatch, options: MethodOptions): GaxiosPromise[Schema$FloodlightActivity] = js.native
  def patch(
    params: ParamsDollarResourceDollarFloodlightactivitiesDollarPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$FloodlightActivity]
  ): Unit = js.native
  /**
    * dfareporting.floodlightActivities.update
    * @desc Updates an existing floodlight activity.
    * @alias dfareporting.floodlightActivities.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {().FloodlightActivity} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[Schema$FloodlightActivity] = js.native
  def update(callback: BodyResponseCallback[Schema$FloodlightActivity]): Unit = js.native
  def update(params: ParamsDollarResourceDollarFloodlightactivitiesDollarUpdate): GaxiosPromise[Schema$FloodlightActivity] = js.native
  def update(
    params: ParamsDollarResourceDollarFloodlightactivitiesDollarUpdate,
    callback: BodyResponseCallback[Schema$FloodlightActivity]
  ): Unit = js.native
  def update(
    params: ParamsDollarResourceDollarFloodlightactivitiesDollarUpdate,
    options: BodyResponseCallback[Schema$FloodlightActivity],
    callback: BodyResponseCallback[Schema$FloodlightActivity]
  ): Unit = js.native
  def update(params: ParamsDollarResourceDollarFloodlightactivitiesDollarUpdate, options: MethodOptions): GaxiosPromise[Schema$FloodlightActivity] = js.native
  def update(
    params: ParamsDollarResourceDollarFloodlightactivitiesDollarUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$FloodlightActivity]
  ): Unit = js.native
}

