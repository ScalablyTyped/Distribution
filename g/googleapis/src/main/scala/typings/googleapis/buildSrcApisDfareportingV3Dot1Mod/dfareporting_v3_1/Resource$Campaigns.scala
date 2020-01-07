package typings.googleapis.buildSrcApisDfareportingV3Dot1Mod.dfareporting_v3_1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/dfareporting/v3.1", "dfareporting_v3_1.Resource$Campaigns")
@js.native
class Resource$Campaigns protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * dfareporting.campaigns.get
    * @desc Gets one campaign by ID.
    * @alias dfareporting.campaigns.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.id Campaign ID.
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$Campaign] = js.native
  def get(callback: BodyResponseCallback[Schema$Campaign]): Unit = js.native
  def get(params: ParamsDollarResourceDollarCampaignsDollarGet): GaxiosPromise[Schema$Campaign] = js.native
  def get(
    params: ParamsDollarResourceDollarCampaignsDollarGet,
    callback: BodyResponseCallback[Schema$Campaign]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarCampaignsDollarGet,
    options: BodyResponseCallback[Schema$Campaign],
    callback: BodyResponseCallback[Schema$Campaign]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarCampaignsDollarGet, options: MethodOptions): GaxiosPromise[Schema$Campaign] = js.native
  def get(
    params: ParamsDollarResourceDollarCampaignsDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Campaign]
  ): Unit = js.native
  /**
    * dfareporting.campaigns.insert
    * @desc Inserts a new campaign.
    * @alias dfareporting.campaigns.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {().Campaign} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[Schema$Campaign] = js.native
  def insert(callback: BodyResponseCallback[Schema$Campaign]): Unit = js.native
  def insert(params: ParamsDollarResourceDollarCampaignsDollarInsert): GaxiosPromise[Schema$Campaign] = js.native
  def insert(
    params: ParamsDollarResourceDollarCampaignsDollarInsert,
    callback: BodyResponseCallback[Schema$Campaign]
  ): Unit = js.native
  def insert(
    params: ParamsDollarResourceDollarCampaignsDollarInsert,
    options: BodyResponseCallback[Schema$Campaign],
    callback: BodyResponseCallback[Schema$Campaign]
  ): Unit = js.native
  def insert(params: ParamsDollarResourceDollarCampaignsDollarInsert, options: MethodOptions): GaxiosPromise[Schema$Campaign] = js.native
  def insert(
    params: ParamsDollarResourceDollarCampaignsDollarInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Campaign]
  ): Unit = js.native
  /**
    * dfareporting.campaigns.list
    * @desc Retrieves a list of campaigns, possibly filtered. This method
    * supports paging.
    * @alias dfareporting.campaigns.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.advertiserGroupIds Select only campaigns whose advertisers belong to these advertiser groups.
    * @param {string=} params.advertiserIds Select only campaigns that belong to these advertisers.
    * @param {boolean=} params.archived Select only archived campaigns. Don't set this field to select both archived and non-archived campaigns.
    * @param {boolean=} params.atLeastOneOptimizationActivity Select only campaigns that have at least one optimization activity.
    * @param {string=} params.excludedIds Exclude campaigns with these IDs.
    * @param {string=} params.ids Select only campaigns with these IDs.
    * @param {integer=} params.maxResults Maximum number of results to return.
    * @param {string=} params.overriddenEventTagId Select only campaigns that have overridden this event tag ID.
    * @param {string=} params.pageToken Value of the nextPageToken from the previous result page.
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {string=} params.searchString Allows searching for campaigns by name or ID. Wildcards (*) are allowed. For example, "campaign*2015" will return campaigns with names like "campaign June 2015", "campaign April 2015", or simply "campaign 2015". Most of the searches also add wildcards implicitly at the start and the end of the search string. For example, a search string of "campaign" will match campaigns with name "my campaign", "campaign 2015", or simply "campaign".
    * @param {string=} params.sortField Field by which to sort the list.
    * @param {string=} params.sortOrder Order of sorted results.
    * @param {string=} params.subaccountId Select only campaigns that belong to this subaccount.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$CampaignsListResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$CampaignsListResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarCampaignsDollarList): GaxiosPromise[Schema$CampaignsListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarCampaignsDollarList,
    callback: BodyResponseCallback[Schema$CampaignsListResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarCampaignsDollarList,
    options: BodyResponseCallback[Schema$CampaignsListResponse],
    callback: BodyResponseCallback[Schema$CampaignsListResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarCampaignsDollarList, options: MethodOptions): GaxiosPromise[Schema$CampaignsListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarCampaignsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$CampaignsListResponse]
  ): Unit = js.native
  /**
    * dfareporting.campaigns.patch
    * @desc Updates an existing campaign. This method supports patch semantics.
    * @alias dfareporting.campaigns.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.id Campaign ID.
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {().Campaign} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[Schema$Campaign] = js.native
  def patch(callback: BodyResponseCallback[Schema$Campaign]): Unit = js.native
  def patch(params: ParamsDollarResourceDollarCampaignsDollarPatch): GaxiosPromise[Schema$Campaign] = js.native
  def patch(
    params: ParamsDollarResourceDollarCampaignsDollarPatch,
    callback: BodyResponseCallback[Schema$Campaign]
  ): Unit = js.native
  def patch(
    params: ParamsDollarResourceDollarCampaignsDollarPatch,
    options: BodyResponseCallback[Schema$Campaign],
    callback: BodyResponseCallback[Schema$Campaign]
  ): Unit = js.native
  def patch(params: ParamsDollarResourceDollarCampaignsDollarPatch, options: MethodOptions): GaxiosPromise[Schema$Campaign] = js.native
  def patch(
    params: ParamsDollarResourceDollarCampaignsDollarPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Campaign]
  ): Unit = js.native
  /**
    * dfareporting.campaigns.update
    * @desc Updates an existing campaign.
    * @alias dfareporting.campaigns.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {().Campaign} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[Schema$Campaign] = js.native
  def update(callback: BodyResponseCallback[Schema$Campaign]): Unit = js.native
  def update(params: ParamsDollarResourceDollarCampaignsDollarUpdate): GaxiosPromise[Schema$Campaign] = js.native
  def update(
    params: ParamsDollarResourceDollarCampaignsDollarUpdate,
    callback: BodyResponseCallback[Schema$Campaign]
  ): Unit = js.native
  def update(
    params: ParamsDollarResourceDollarCampaignsDollarUpdate,
    options: BodyResponseCallback[Schema$Campaign],
    callback: BodyResponseCallback[Schema$Campaign]
  ): Unit = js.native
  def update(params: ParamsDollarResourceDollarCampaignsDollarUpdate, options: MethodOptions): GaxiosPromise[Schema$Campaign] = js.native
  def update(
    params: ParamsDollarResourceDollarCampaignsDollarUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Campaign]
  ): Unit = js.native
}

