package typings.googleapis.buildSrcApisDfareportingV3Dot1Mod.dfareporting_v3_1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/dfareporting/v3.1", "dfareporting_v3_1.Resource$Placementstrategies")
@js.native
class Resource$Placementstrategies protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * dfareporting.placementStrategies.delete
    * @desc Deletes an existing placement strategy.
    * @alias dfareporting.placementStrategies.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.id Placement strategy ID.
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarPlacementstrategiesDollarDelete): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsDollarResourceDollarPlacementstrategiesDollarDelete,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarPlacementstrategiesDollarDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(params: ParamsDollarResourceDollarPlacementstrategiesDollarDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsDollarResourceDollarPlacementstrategiesDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * dfareporting.placementStrategies.get
    * @desc Gets one placement strategy by ID.
    * @alias dfareporting.placementStrategies.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.id Placement strategy ID.
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$PlacementStrategy] = js.native
  def get(callback: BodyResponseCallback[Schema$PlacementStrategy]): Unit = js.native
  def get(params: ParamsDollarResourceDollarPlacementstrategiesDollarGet): GaxiosPromise[Schema$PlacementStrategy] = js.native
  def get(
    params: ParamsDollarResourceDollarPlacementstrategiesDollarGet,
    callback: BodyResponseCallback[Schema$PlacementStrategy]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarPlacementstrategiesDollarGet,
    options: BodyResponseCallback[Schema$PlacementStrategy],
    callback: BodyResponseCallback[Schema$PlacementStrategy]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarPlacementstrategiesDollarGet, options: MethodOptions): GaxiosPromise[Schema$PlacementStrategy] = js.native
  def get(
    params: ParamsDollarResourceDollarPlacementstrategiesDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$PlacementStrategy]
  ): Unit = js.native
  /**
    * dfareporting.placementStrategies.insert
    * @desc Inserts a new placement strategy.
    * @alias dfareporting.placementStrategies.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {().PlacementStrategy} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[Schema$PlacementStrategy] = js.native
  def insert(callback: BodyResponseCallback[Schema$PlacementStrategy]): Unit = js.native
  def insert(params: ParamsDollarResourceDollarPlacementstrategiesDollarInsert): GaxiosPromise[Schema$PlacementStrategy] = js.native
  def insert(
    params: ParamsDollarResourceDollarPlacementstrategiesDollarInsert,
    callback: BodyResponseCallback[Schema$PlacementStrategy]
  ): Unit = js.native
  def insert(
    params: ParamsDollarResourceDollarPlacementstrategiesDollarInsert,
    options: BodyResponseCallback[Schema$PlacementStrategy],
    callback: BodyResponseCallback[Schema$PlacementStrategy]
  ): Unit = js.native
  def insert(params: ParamsDollarResourceDollarPlacementstrategiesDollarInsert, options: MethodOptions): GaxiosPromise[Schema$PlacementStrategy] = js.native
  def insert(
    params: ParamsDollarResourceDollarPlacementstrategiesDollarInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$PlacementStrategy]
  ): Unit = js.native
  /**
    * dfareporting.placementStrategies.list
    * @desc Retrieves a list of placement strategies, possibly filtered. This
    * method supports paging.
    * @alias dfareporting.placementStrategies.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.ids Select only placement strategies with these IDs.
    * @param {integer=} params.maxResults Maximum number of results to return.
    * @param {string=} params.pageToken Value of the nextPageToken from the previous result page.
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {string=} params.searchString Allows searching for objects by name or ID. Wildcards (*) are allowed. For example, "placementstrategy*2015" will return objects with names like "placementstrategy June 2015", "placementstrategy April 2015", or simply "placementstrategy 2015". Most of the searches also add wildcards implicitly at the start and the end of the search string. For example, a search string of "placementstrategy" will match objects with name "my placementstrategy", "placementstrategy 2015", or simply "placementstrategy".
    * @param {string=} params.sortField Field by which to sort the list.
    * @param {string=} params.sortOrder Order of sorted results.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$PlacementStrategiesListResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$PlacementStrategiesListResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarPlacementstrategiesDollarList): GaxiosPromise[Schema$PlacementStrategiesListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarPlacementstrategiesDollarList,
    callback: BodyResponseCallback[Schema$PlacementStrategiesListResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarPlacementstrategiesDollarList,
    options: BodyResponseCallback[Schema$PlacementStrategiesListResponse],
    callback: BodyResponseCallback[Schema$PlacementStrategiesListResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarPlacementstrategiesDollarList, options: MethodOptions): GaxiosPromise[Schema$PlacementStrategiesListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarPlacementstrategiesDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$PlacementStrategiesListResponse]
  ): Unit = js.native
  /**
    * dfareporting.placementStrategies.patch
    * @desc Updates an existing placement strategy. This method supports patch
    * semantics.
    * @alias dfareporting.placementStrategies.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.id Placement strategy ID.
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {().PlacementStrategy} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[Schema$PlacementStrategy] = js.native
  def patch(callback: BodyResponseCallback[Schema$PlacementStrategy]): Unit = js.native
  def patch(params: ParamsDollarResourceDollarPlacementstrategiesDollarPatch): GaxiosPromise[Schema$PlacementStrategy] = js.native
  def patch(
    params: ParamsDollarResourceDollarPlacementstrategiesDollarPatch,
    callback: BodyResponseCallback[Schema$PlacementStrategy]
  ): Unit = js.native
  def patch(
    params: ParamsDollarResourceDollarPlacementstrategiesDollarPatch,
    options: BodyResponseCallback[Schema$PlacementStrategy],
    callback: BodyResponseCallback[Schema$PlacementStrategy]
  ): Unit = js.native
  def patch(params: ParamsDollarResourceDollarPlacementstrategiesDollarPatch, options: MethodOptions): GaxiosPromise[Schema$PlacementStrategy] = js.native
  def patch(
    params: ParamsDollarResourceDollarPlacementstrategiesDollarPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$PlacementStrategy]
  ): Unit = js.native
  /**
    * dfareporting.placementStrategies.update
    * @desc Updates an existing placement strategy.
    * @alias dfareporting.placementStrategies.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {().PlacementStrategy} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[Schema$PlacementStrategy] = js.native
  def update(callback: BodyResponseCallback[Schema$PlacementStrategy]): Unit = js.native
  def update(params: ParamsDollarResourceDollarPlacementstrategiesDollarUpdate): GaxiosPromise[Schema$PlacementStrategy] = js.native
  def update(
    params: ParamsDollarResourceDollarPlacementstrategiesDollarUpdate,
    callback: BodyResponseCallback[Schema$PlacementStrategy]
  ): Unit = js.native
  def update(
    params: ParamsDollarResourceDollarPlacementstrategiesDollarUpdate,
    options: BodyResponseCallback[Schema$PlacementStrategy],
    callback: BodyResponseCallback[Schema$PlacementStrategy]
  ): Unit = js.native
  def update(params: ParamsDollarResourceDollarPlacementstrategiesDollarUpdate, options: MethodOptions): GaxiosPromise[Schema$PlacementStrategy] = js.native
  def update(
    params: ParamsDollarResourceDollarPlacementstrategiesDollarUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$PlacementStrategy]
  ): Unit = js.native
}

