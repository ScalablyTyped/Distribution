package typings.googleapis.buildSrcApisDfareportingV3Dot1Mod.dfareporting_v3_1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/dfareporting/v3.1", "dfareporting_v3_1.Resource$Creativegroups")
@js.native
class Resource$Creativegroups protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * dfareporting.creativeGroups.get
    * @desc Gets one creative group by ID.
    * @alias dfareporting.creativeGroups.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.id Creative group ID.
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$CreativeGroup] = js.native
  def get(callback: BodyResponseCallback[Schema$CreativeGroup]): Unit = js.native
  def get(params: ParamsDollarResourceDollarCreativegroupsDollarGet): GaxiosPromise[Schema$CreativeGroup] = js.native
  def get(
    params: ParamsDollarResourceDollarCreativegroupsDollarGet,
    callback: BodyResponseCallback[Schema$CreativeGroup]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarCreativegroupsDollarGet,
    options: BodyResponseCallback[Schema$CreativeGroup],
    callback: BodyResponseCallback[Schema$CreativeGroup]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarCreativegroupsDollarGet, options: MethodOptions): GaxiosPromise[Schema$CreativeGroup] = js.native
  def get(
    params: ParamsDollarResourceDollarCreativegroupsDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$CreativeGroup]
  ): Unit = js.native
  /**
    * dfareporting.creativeGroups.insert
    * @desc Inserts a new creative group.
    * @alias dfareporting.creativeGroups.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {().CreativeGroup} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[Schema$CreativeGroup] = js.native
  def insert(callback: BodyResponseCallback[Schema$CreativeGroup]): Unit = js.native
  def insert(params: ParamsDollarResourceDollarCreativegroupsDollarInsert): GaxiosPromise[Schema$CreativeGroup] = js.native
  def insert(
    params: ParamsDollarResourceDollarCreativegroupsDollarInsert,
    callback: BodyResponseCallback[Schema$CreativeGroup]
  ): Unit = js.native
  def insert(
    params: ParamsDollarResourceDollarCreativegroupsDollarInsert,
    options: BodyResponseCallback[Schema$CreativeGroup],
    callback: BodyResponseCallback[Schema$CreativeGroup]
  ): Unit = js.native
  def insert(params: ParamsDollarResourceDollarCreativegroupsDollarInsert, options: MethodOptions): GaxiosPromise[Schema$CreativeGroup] = js.native
  def insert(
    params: ParamsDollarResourceDollarCreativegroupsDollarInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$CreativeGroup]
  ): Unit = js.native
  /**
    * dfareporting.creativeGroups.list
    * @desc Retrieves a list of creative groups, possibly filtered. This method
    * supports paging.
    * @alias dfareporting.creativeGroups.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.advertiserIds Select only creative groups that belong to these advertisers.
    * @param {integer=} params.groupNumber Select only creative groups that belong to this subgroup.
    * @param {string=} params.ids Select only creative groups with these IDs.
    * @param {integer=} params.maxResults Maximum number of results to return.
    * @param {string=} params.pageToken Value of the nextPageToken from the previous result page.
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {string=} params.searchString Allows searching for creative groups by name or ID. Wildcards (*) are allowed. For example, "creativegroup*2015" will return creative groups with names like "creativegroup June 2015", "creativegroup April 2015", or simply "creativegroup 2015". Most of the searches also add wild-cards implicitly at the start and the end of the search string. For example, a search string of "creativegroup" will match creative groups with the name "my creativegroup", "creativegroup 2015", or simply "creativegroup".
    * @param {string=} params.sortField Field by which to sort the list.
    * @param {string=} params.sortOrder Order of sorted results.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$CreativeGroupsListResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$CreativeGroupsListResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarCreativegroupsDollarList): GaxiosPromise[Schema$CreativeGroupsListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarCreativegroupsDollarList,
    callback: BodyResponseCallback[Schema$CreativeGroupsListResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarCreativegroupsDollarList,
    options: BodyResponseCallback[Schema$CreativeGroupsListResponse],
    callback: BodyResponseCallback[Schema$CreativeGroupsListResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarCreativegroupsDollarList, options: MethodOptions): GaxiosPromise[Schema$CreativeGroupsListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarCreativegroupsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$CreativeGroupsListResponse]
  ): Unit = js.native
  /**
    * dfareporting.creativeGroups.patch
    * @desc Updates an existing creative group. This method supports patch
    * semantics.
    * @alias dfareporting.creativeGroups.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.id Creative group ID.
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {().CreativeGroup} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[Schema$CreativeGroup] = js.native
  def patch(callback: BodyResponseCallback[Schema$CreativeGroup]): Unit = js.native
  def patch(params: ParamsDollarResourceDollarCreativegroupsDollarPatch): GaxiosPromise[Schema$CreativeGroup] = js.native
  def patch(
    params: ParamsDollarResourceDollarCreativegroupsDollarPatch,
    callback: BodyResponseCallback[Schema$CreativeGroup]
  ): Unit = js.native
  def patch(
    params: ParamsDollarResourceDollarCreativegroupsDollarPatch,
    options: BodyResponseCallback[Schema$CreativeGroup],
    callback: BodyResponseCallback[Schema$CreativeGroup]
  ): Unit = js.native
  def patch(params: ParamsDollarResourceDollarCreativegroupsDollarPatch, options: MethodOptions): GaxiosPromise[Schema$CreativeGroup] = js.native
  def patch(
    params: ParamsDollarResourceDollarCreativegroupsDollarPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$CreativeGroup]
  ): Unit = js.native
  /**
    * dfareporting.creativeGroups.update
    * @desc Updates an existing creative group.
    * @alias dfareporting.creativeGroups.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {().CreativeGroup} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[Schema$CreativeGroup] = js.native
  def update(callback: BodyResponseCallback[Schema$CreativeGroup]): Unit = js.native
  def update(params: ParamsDollarResourceDollarCreativegroupsDollarUpdate): GaxiosPromise[Schema$CreativeGroup] = js.native
  def update(
    params: ParamsDollarResourceDollarCreativegroupsDollarUpdate,
    callback: BodyResponseCallback[Schema$CreativeGroup]
  ): Unit = js.native
  def update(
    params: ParamsDollarResourceDollarCreativegroupsDollarUpdate,
    options: BodyResponseCallback[Schema$CreativeGroup],
    callback: BodyResponseCallback[Schema$CreativeGroup]
  ): Unit = js.native
  def update(params: ParamsDollarResourceDollarCreativegroupsDollarUpdate, options: MethodOptions): GaxiosPromise[Schema$CreativeGroup] = js.native
  def update(
    params: ParamsDollarResourceDollarCreativegroupsDollarUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$CreativeGroup]
  ): Unit = js.native
}

