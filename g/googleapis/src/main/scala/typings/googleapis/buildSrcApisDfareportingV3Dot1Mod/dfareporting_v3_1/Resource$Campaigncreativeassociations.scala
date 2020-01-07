package typings.googleapis.buildSrcApisDfareportingV3Dot1Mod.dfareporting_v3_1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/dfareporting/v3.1", "dfareporting_v3_1.Resource$Campaigncreativeassociations")
@js.native
class Resource$Campaigncreativeassociations protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * dfareporting.campaignCreativeAssociations.insert
    * @desc Associates a creative with the specified campaign. This method
    * creates a default ad with dimensions matching the creative in the
    * campaign if such a default ad does not exist already.
    * @alias dfareporting.campaignCreativeAssociations.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.campaignId Campaign ID in this association.
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {().CampaignCreativeAssociation} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[Schema$CampaignCreativeAssociation] = js.native
  def insert(callback: BodyResponseCallback[Schema$CampaignCreativeAssociation]): Unit = js.native
  def insert(params: ParamsDollarResourceDollarCampaigncreativeassociationsDollarInsert): GaxiosPromise[Schema$CampaignCreativeAssociation] = js.native
  def insert(
    params: ParamsDollarResourceDollarCampaigncreativeassociationsDollarInsert,
    callback: BodyResponseCallback[Schema$CampaignCreativeAssociation]
  ): Unit = js.native
  def insert(
    params: ParamsDollarResourceDollarCampaigncreativeassociationsDollarInsert,
    options: BodyResponseCallback[Schema$CampaignCreativeAssociation],
    callback: BodyResponseCallback[Schema$CampaignCreativeAssociation]
  ): Unit = js.native
  def insert(params: ParamsDollarResourceDollarCampaigncreativeassociationsDollarInsert, options: MethodOptions): GaxiosPromise[Schema$CampaignCreativeAssociation] = js.native
  def insert(
    params: ParamsDollarResourceDollarCampaigncreativeassociationsDollarInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$CampaignCreativeAssociation]
  ): Unit = js.native
  /**
    * dfareporting.campaignCreativeAssociations.list
    * @desc Retrieves the list of creative IDs associated with the specified
    * campaign. This method supports paging.
    * @alias dfareporting.campaignCreativeAssociations.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.campaignId Campaign ID in this association.
    * @param {integer=} params.maxResults Maximum number of results to return.
    * @param {string=} params.pageToken Value of the nextPageToken from the previous result page.
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {string=} params.sortOrder Order of sorted results.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$CampaignCreativeAssociationsListResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$CampaignCreativeAssociationsListResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarCampaigncreativeassociationsDollarList): GaxiosPromise[Schema$CampaignCreativeAssociationsListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarCampaigncreativeassociationsDollarList,
    callback: BodyResponseCallback[Schema$CampaignCreativeAssociationsListResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarCampaigncreativeassociationsDollarList,
    options: BodyResponseCallback[Schema$CampaignCreativeAssociationsListResponse],
    callback: BodyResponseCallback[Schema$CampaignCreativeAssociationsListResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarCampaigncreativeassociationsDollarList, options: MethodOptions): GaxiosPromise[Schema$CampaignCreativeAssociationsListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarCampaigncreativeassociationsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$CampaignCreativeAssociationsListResponse]
  ): Unit = js.native
}

