package typings.googleapis.buildSrcApisDfareportingV3Dot3Mod.dfareporting_v3_3

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/dfareporting/v3.3", "dfareporting_v3_3.Resource$Advertisergroups")
@js.native
class Resource$Advertisergroups protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * dfareporting.advertiserGroups.delete
    * @desc Deletes an existing advertiser group.
    * @alias dfareporting.advertiserGroups.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.id Advertiser group ID.
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarAdvertisergroupsDollarDelete): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsDollarResourceDollarAdvertisergroupsDollarDelete,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarAdvertisergroupsDollarDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(params: ParamsDollarResourceDollarAdvertisergroupsDollarDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsDollarResourceDollarAdvertisergroupsDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * dfareporting.advertiserGroups.get
    * @desc Gets one advertiser group by ID.
    * @alias dfareporting.advertiserGroups.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.id Advertiser group ID.
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$AdvertiserGroup] = js.native
  def get(callback: BodyResponseCallback[Schema$AdvertiserGroup]): Unit = js.native
  def get(params: ParamsDollarResourceDollarAdvertisergroupsDollarGet): GaxiosPromise[Schema$AdvertiserGroup] = js.native
  def get(
    params: ParamsDollarResourceDollarAdvertisergroupsDollarGet,
    callback: BodyResponseCallback[Schema$AdvertiserGroup]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarAdvertisergroupsDollarGet,
    options: BodyResponseCallback[Schema$AdvertiserGroup],
    callback: BodyResponseCallback[Schema$AdvertiserGroup]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarAdvertisergroupsDollarGet, options: MethodOptions): GaxiosPromise[Schema$AdvertiserGroup] = js.native
  def get(
    params: ParamsDollarResourceDollarAdvertisergroupsDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$AdvertiserGroup]
  ): Unit = js.native
  /**
    * dfareporting.advertiserGroups.insert
    * @desc Inserts a new advertiser group.
    * @alias dfareporting.advertiserGroups.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {().AdvertiserGroup} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[Schema$AdvertiserGroup] = js.native
  def insert(callback: BodyResponseCallback[Schema$AdvertiserGroup]): Unit = js.native
  def insert(params: ParamsDollarResourceDollarAdvertisergroupsDollarInsert): GaxiosPromise[Schema$AdvertiserGroup] = js.native
  def insert(
    params: ParamsDollarResourceDollarAdvertisergroupsDollarInsert,
    callback: BodyResponseCallback[Schema$AdvertiserGroup]
  ): Unit = js.native
  def insert(
    params: ParamsDollarResourceDollarAdvertisergroupsDollarInsert,
    options: BodyResponseCallback[Schema$AdvertiserGroup],
    callback: BodyResponseCallback[Schema$AdvertiserGroup]
  ): Unit = js.native
  def insert(params: ParamsDollarResourceDollarAdvertisergroupsDollarInsert, options: MethodOptions): GaxiosPromise[Schema$AdvertiserGroup] = js.native
  def insert(
    params: ParamsDollarResourceDollarAdvertisergroupsDollarInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$AdvertiserGroup]
  ): Unit = js.native
  /**
    * dfareporting.advertiserGroups.list
    * @desc Retrieves a list of advertiser groups, possibly filtered. This
    * method supports paging.
    * @alias dfareporting.advertiserGroups.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.ids Select only advertiser groups with these IDs.
    * @param {integer=} params.maxResults Maximum number of results to return.
    * @param {string=} params.pageToken Value of the nextPageToken from the previous result page.
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {string=} params.searchString Allows searching for objects by name or ID. Wildcards (*) are allowed. For example, "advertiser*2015" will return objects with names like "advertiser group June 2015", "advertiser group April 2015", or simply "advertiser group 2015". Most of the searches also add wildcards implicitly at the start and the end of the search string. For example, a search string of "advertisergroup" will match objects with name "my advertisergroup", "advertisergroup 2015", or simply "advertisergroup".
    * @param {string=} params.sortField Field by which to sort the list.
    * @param {string=} params.sortOrder Order of sorted results.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$AdvertiserGroupsListResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$AdvertiserGroupsListResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarAdvertisergroupsDollarList): GaxiosPromise[Schema$AdvertiserGroupsListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarAdvertisergroupsDollarList,
    callback: BodyResponseCallback[Schema$AdvertiserGroupsListResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarAdvertisergroupsDollarList,
    options: BodyResponseCallback[Schema$AdvertiserGroupsListResponse],
    callback: BodyResponseCallback[Schema$AdvertiserGroupsListResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarAdvertisergroupsDollarList, options: MethodOptions): GaxiosPromise[Schema$AdvertiserGroupsListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarAdvertisergroupsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$AdvertiserGroupsListResponse]
  ): Unit = js.native
  /**
    * dfareporting.advertiserGroups.patch
    * @desc Updates an existing advertiser group. This method supports patch
    * semantics.
    * @alias dfareporting.advertiserGroups.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.id Advertiser group ID.
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {().AdvertiserGroup} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[Schema$AdvertiserGroup] = js.native
  def patch(callback: BodyResponseCallback[Schema$AdvertiserGroup]): Unit = js.native
  def patch(params: ParamsDollarResourceDollarAdvertisergroupsDollarPatch): GaxiosPromise[Schema$AdvertiserGroup] = js.native
  def patch(
    params: ParamsDollarResourceDollarAdvertisergroupsDollarPatch,
    callback: BodyResponseCallback[Schema$AdvertiserGroup]
  ): Unit = js.native
  def patch(
    params: ParamsDollarResourceDollarAdvertisergroupsDollarPatch,
    options: BodyResponseCallback[Schema$AdvertiserGroup],
    callback: BodyResponseCallback[Schema$AdvertiserGroup]
  ): Unit = js.native
  def patch(params: ParamsDollarResourceDollarAdvertisergroupsDollarPatch, options: MethodOptions): GaxiosPromise[Schema$AdvertiserGroup] = js.native
  def patch(
    params: ParamsDollarResourceDollarAdvertisergroupsDollarPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$AdvertiserGroup]
  ): Unit = js.native
  /**
    * dfareporting.advertiserGroups.update
    * @desc Updates an existing advertiser group.
    * @alias dfareporting.advertiserGroups.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {().AdvertiserGroup} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[Schema$AdvertiserGroup] = js.native
  def update(callback: BodyResponseCallback[Schema$AdvertiserGroup]): Unit = js.native
  def update(params: ParamsDollarResourceDollarAdvertisergroupsDollarUpdate): GaxiosPromise[Schema$AdvertiserGroup] = js.native
  def update(
    params: ParamsDollarResourceDollarAdvertisergroupsDollarUpdate,
    callback: BodyResponseCallback[Schema$AdvertiserGroup]
  ): Unit = js.native
  def update(
    params: ParamsDollarResourceDollarAdvertisergroupsDollarUpdate,
    options: BodyResponseCallback[Schema$AdvertiserGroup],
    callback: BodyResponseCallback[Schema$AdvertiserGroup]
  ): Unit = js.native
  def update(params: ParamsDollarResourceDollarAdvertisergroupsDollarUpdate, options: MethodOptions): GaxiosPromise[Schema$AdvertiserGroup] = js.native
  def update(
    params: ParamsDollarResourceDollarAdvertisergroupsDollarUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$AdvertiserGroup]
  ): Unit = js.native
}

