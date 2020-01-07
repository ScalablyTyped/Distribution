package typings.googleapis.buildSrcApisAdexchangebuyer2V2beta1Mod.adexchangebuyer2_v2beta1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/adexchangebuyer2/v2beta1", "adexchangebuyer2_v2beta1.Resource$Accounts$Publisherprofiles")
@js.native
class ResourceDollarAccountsDollarPublisherprofiles protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * adexchangebuyer2.accounts.publisherProfiles.get
    * @desc Gets the requested publisher profile by id.
    * @alias adexchangebuyer2.accounts.publisherProfiles.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId Account ID of the buyer.
    * @param {string} params.publisherProfileId The id for the publisher profile to get.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$PublisherProfile] = js.native
  def get(callback: BodyResponseCallback[Schema$PublisherProfile]): Unit = js.native
  def get(params: ParamsDollarResourceDollarAccountsDollarPublisherprofilesDollarGet): GaxiosPromise[Schema$PublisherProfile] = js.native
  def get(
    params: ParamsDollarResourceDollarAccountsDollarPublisherprofilesDollarGet,
    callback: BodyResponseCallback[Schema$PublisherProfile]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarAccountsDollarPublisherprofilesDollarGet,
    options: BodyResponseCallback[Schema$PublisherProfile],
    callback: BodyResponseCallback[Schema$PublisherProfile]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarAccountsDollarPublisherprofilesDollarGet, options: MethodOptions): GaxiosPromise[Schema$PublisherProfile] = js.native
  def get(
    params: ParamsDollarResourceDollarAccountsDollarPublisherprofilesDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$PublisherProfile]
  ): Unit = js.native
  /**
    * adexchangebuyer2.accounts.publisherProfiles.list
    * @desc List all publisher profiles visible to the buyer
    * @alias adexchangebuyer2.accounts.publisherProfiles.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId Account ID of the buyer.
    * @param {integer=} params.pageSize Specify the number of results to include per page.
    * @param {string=} params.pageToken The page token as return from ListPublisherProfilesResponse.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$ListPublisherProfilesResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$ListPublisherProfilesResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarAccountsDollarPublisherprofilesDollarList): GaxiosPromise[Schema$ListPublisherProfilesResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarAccountsDollarPublisherprofilesDollarList,
    callback: BodyResponseCallback[Schema$ListPublisherProfilesResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarAccountsDollarPublisherprofilesDollarList,
    options: BodyResponseCallback[Schema$ListPublisherProfilesResponse],
    callback: BodyResponseCallback[Schema$ListPublisherProfilesResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarAccountsDollarPublisherprofilesDollarList,
    options: MethodOptions
  ): GaxiosPromise[Schema$ListPublisherProfilesResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarAccountsDollarPublisherprofilesDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ListPublisherProfilesResponse]
  ): Unit = js.native
}

