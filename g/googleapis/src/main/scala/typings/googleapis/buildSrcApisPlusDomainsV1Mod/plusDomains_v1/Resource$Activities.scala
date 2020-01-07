package typings.googleapis.buildSrcApisPlusDomainsV1Mod.plusDomains_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/plusDomains/v1", "plusDomains_v1.Resource$Activities")
@js.native
class Resource$Activities protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * plusDomains.activities.get
    * @desc Shut down. See https://developers.google.com/+/api-shutdown for
    * more details.
    * @alias plusDomains.activities.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.activityId The ID of the activity to get.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$Activity] = js.native
  def get(callback: BodyResponseCallback[Schema$Activity]): Unit = js.native
  def get(params: ParamsDollarResourceDollarActivitiesDollarGet): GaxiosPromise[Schema$Activity] = js.native
  def get(
    params: ParamsDollarResourceDollarActivitiesDollarGet,
    callback: BodyResponseCallback[Schema$Activity]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarActivitiesDollarGet,
    options: BodyResponseCallback[Schema$Activity],
    callback: BodyResponseCallback[Schema$Activity]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarActivitiesDollarGet, options: MethodOptions): GaxiosPromise[Schema$Activity] = js.native
  def get(
    params: ParamsDollarResourceDollarActivitiesDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Activity]
  ): Unit = js.native
  /**
    * plusDomains.activities.list
    * @desc Shut down. See https://developers.google.com/+/api-shutdown for
    * more details.
    * @alias plusDomains.activities.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.collection The collection of activities to list.
    * @param {integer=} params.maxResults The maximum number of activities to include in the response, which is used for paging. For any response, the actual number returned might be less than the specified maxResults.
    * @param {string=} params.pageToken The continuation token, which is used to page through large result sets. To get the next page of results, set this parameter to the value of "nextPageToken" from the previous response.
    * @param {string} params.userId The ID of the user to get activities for. The special value "me" can be used to indicate the authenticated user.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$ActivityFeed] = js.native
  def list(callback: BodyResponseCallback[Schema$ActivityFeed]): Unit = js.native
  def list(params: ParamsDollarResourceDollarActivitiesDollarList): GaxiosPromise[Schema$ActivityFeed] = js.native
  def list(
    params: ParamsDollarResourceDollarActivitiesDollarList,
    callback: BodyResponseCallback[Schema$ActivityFeed]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarActivitiesDollarList,
    options: BodyResponseCallback[Schema$ActivityFeed],
    callback: BodyResponseCallback[Schema$ActivityFeed]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarActivitiesDollarList, options: MethodOptions): GaxiosPromise[Schema$ActivityFeed] = js.native
  def list(
    params: ParamsDollarResourceDollarActivitiesDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ActivityFeed]
  ): Unit = js.native
}

