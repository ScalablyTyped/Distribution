package typings.googleapis.buildSrcApisDfareportingV3Dot3Mod.dfareporting_v3_3

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/dfareporting/v3.3", "dfareporting_v3_3.Resource$Advertisers")
@js.native
class Resource$Advertisers protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * dfareporting.advertisers.get
    * @desc Gets one advertiser by ID.
    * @alias dfareporting.advertisers.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.id Advertiser ID.
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$Advertiser] = js.native
  def get(callback: BodyResponseCallback[Schema$Advertiser]): Unit = js.native
  def get(params: ParamsDollarResourceDollarAdvertisersDollarGet): GaxiosPromise[Schema$Advertiser] = js.native
  def get(
    params: ParamsDollarResourceDollarAdvertisersDollarGet,
    callback: BodyResponseCallback[Schema$Advertiser]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarAdvertisersDollarGet,
    options: BodyResponseCallback[Schema$Advertiser],
    callback: BodyResponseCallback[Schema$Advertiser]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarAdvertisersDollarGet, options: MethodOptions): GaxiosPromise[Schema$Advertiser] = js.native
  def get(
    params: ParamsDollarResourceDollarAdvertisersDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Advertiser]
  ): Unit = js.native
  /**
    * dfareporting.advertisers.insert
    * @desc Inserts a new advertiser.
    * @alias dfareporting.advertisers.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {().Advertiser} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[Schema$Advertiser] = js.native
  def insert(callback: BodyResponseCallback[Schema$Advertiser]): Unit = js.native
  def insert(params: ParamsDollarResourceDollarAdvertisersDollarInsert): GaxiosPromise[Schema$Advertiser] = js.native
  def insert(
    params: ParamsDollarResourceDollarAdvertisersDollarInsert,
    callback: BodyResponseCallback[Schema$Advertiser]
  ): Unit = js.native
  def insert(
    params: ParamsDollarResourceDollarAdvertisersDollarInsert,
    options: BodyResponseCallback[Schema$Advertiser],
    callback: BodyResponseCallback[Schema$Advertiser]
  ): Unit = js.native
  def insert(params: ParamsDollarResourceDollarAdvertisersDollarInsert, options: MethodOptions): GaxiosPromise[Schema$Advertiser] = js.native
  def insert(
    params: ParamsDollarResourceDollarAdvertisersDollarInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Advertiser]
  ): Unit = js.native
  /**
    * dfareporting.advertisers.list
    * @desc Retrieves a list of advertisers, possibly filtered. This method
    * supports paging.
    * @alias dfareporting.advertisers.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.advertiserGroupIds Select only advertisers with these advertiser group IDs.
    * @param {string=} params.floodlightConfigurationIds Select only advertisers with these floodlight configuration IDs.
    * @param {string=} params.ids Select only advertisers with these IDs.
    * @param {boolean=} params.includeAdvertisersWithoutGroupsOnly Select only advertisers which do not belong to any advertiser group.
    * @param {integer=} params.maxResults Maximum number of results to return.
    * @param {boolean=} params.onlyParent Select only advertisers which use another advertiser's floodlight configuration.
    * @param {string=} params.pageToken Value of the nextPageToken from the previous result page.
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {string=} params.searchString Allows searching for objects by name or ID. Wildcards (*) are allowed. For example, "advertiser*2015" will return objects with names like "advertiser June 2015", "advertiser April 2015", or simply "advertiser 2015". Most of the searches also add wildcards implicitly at the start and the end of the search string. For example, a search string of "advertiser" will match objects with name "my advertiser", "advertiser 2015", or simply "advertiser".
    * @param {string=} params.sortField Field by which to sort the list.
    * @param {string=} params.sortOrder Order of sorted results.
    * @param {string=} params.status Select only advertisers with the specified status.
    * @param {string=} params.subaccountId Select only advertisers with these subaccount IDs.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$AdvertisersListResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$AdvertisersListResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarAdvertisersDollarList): GaxiosPromise[Schema$AdvertisersListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarAdvertisersDollarList,
    callback: BodyResponseCallback[Schema$AdvertisersListResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarAdvertisersDollarList,
    options: BodyResponseCallback[Schema$AdvertisersListResponse],
    callback: BodyResponseCallback[Schema$AdvertisersListResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarAdvertisersDollarList, options: MethodOptions): GaxiosPromise[Schema$AdvertisersListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarAdvertisersDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$AdvertisersListResponse]
  ): Unit = js.native
  /**
    * dfareporting.advertisers.patch
    * @desc Updates an existing advertiser. This method supports patch
    * semantics.
    * @alias dfareporting.advertisers.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.id Advertiser ID.
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {().Advertiser} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[Schema$Advertiser] = js.native
  def patch(callback: BodyResponseCallback[Schema$Advertiser]): Unit = js.native
  def patch(params: ParamsDollarResourceDollarAdvertisersDollarPatch): GaxiosPromise[Schema$Advertiser] = js.native
  def patch(
    params: ParamsDollarResourceDollarAdvertisersDollarPatch,
    callback: BodyResponseCallback[Schema$Advertiser]
  ): Unit = js.native
  def patch(
    params: ParamsDollarResourceDollarAdvertisersDollarPatch,
    options: BodyResponseCallback[Schema$Advertiser],
    callback: BodyResponseCallback[Schema$Advertiser]
  ): Unit = js.native
  def patch(params: ParamsDollarResourceDollarAdvertisersDollarPatch, options: MethodOptions): GaxiosPromise[Schema$Advertiser] = js.native
  def patch(
    params: ParamsDollarResourceDollarAdvertisersDollarPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Advertiser]
  ): Unit = js.native
  /**
    * dfareporting.advertisers.update
    * @desc Updates an existing advertiser.
    * @alias dfareporting.advertisers.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {().Advertiser} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[Schema$Advertiser] = js.native
  def update(callback: BodyResponseCallback[Schema$Advertiser]): Unit = js.native
  def update(params: ParamsDollarResourceDollarAdvertisersDollarUpdate): GaxiosPromise[Schema$Advertiser] = js.native
  def update(
    params: ParamsDollarResourceDollarAdvertisersDollarUpdate,
    callback: BodyResponseCallback[Schema$Advertiser]
  ): Unit = js.native
  def update(
    params: ParamsDollarResourceDollarAdvertisersDollarUpdate,
    options: BodyResponseCallback[Schema$Advertiser],
    callback: BodyResponseCallback[Schema$Advertiser]
  ): Unit = js.native
  def update(params: ParamsDollarResourceDollarAdvertisersDollarUpdate, options: MethodOptions): GaxiosPromise[Schema$Advertiser] = js.native
  def update(
    params: ParamsDollarResourceDollarAdvertisersDollarUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Advertiser]
  ): Unit = js.native
}

