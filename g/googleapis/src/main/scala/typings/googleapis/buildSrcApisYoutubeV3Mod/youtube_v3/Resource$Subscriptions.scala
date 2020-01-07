package typings.googleapis.buildSrcApisYoutubeV3Mod.youtube_v3

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/youtube/v3", "youtube_v3.Resource$Subscriptions")
@js.native
class Resource$Subscriptions protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * youtube.subscriptions.delete
    * @desc Deletes a subscription.
    * @alias youtube.subscriptions.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.id The id parameter specifies the YouTube subscription ID for the resource that is being deleted. In a subscription resource, the id property specifies the YouTube subscription ID.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarSubscriptionsDollarDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsDollarResourceDollarSubscriptionsDollarDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarSubscriptionsDollarDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(params: ParamsDollarResourceDollarSubscriptionsDollarDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsDollarResourceDollarSubscriptionsDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * youtube.subscriptions.insert
    * @desc Adds a subscription for the authenticated user's channel.
    * @alias youtube.subscriptions.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.part The part parameter serves two purposes in this operation. It identifies the properties that the write operation will set as well as the properties that the API response will include.
    * @param {().Subscription} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[Schema$Subscription] = js.native
  def insert(callback: BodyResponseCallback[Schema$Subscription]): Unit = js.native
  def insert(params: ParamsDollarResourceDollarSubscriptionsDollarInsert): GaxiosPromise[Schema$Subscription] = js.native
  def insert(
    params: ParamsDollarResourceDollarSubscriptionsDollarInsert,
    callback: BodyResponseCallback[Schema$Subscription]
  ): Unit = js.native
  def insert(
    params: ParamsDollarResourceDollarSubscriptionsDollarInsert,
    options: BodyResponseCallback[Schema$Subscription],
    callback: BodyResponseCallback[Schema$Subscription]
  ): Unit = js.native
  def insert(params: ParamsDollarResourceDollarSubscriptionsDollarInsert, options: MethodOptions): GaxiosPromise[Schema$Subscription] = js.native
  def insert(
    params: ParamsDollarResourceDollarSubscriptionsDollarInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Subscription]
  ): Unit = js.native
  /**
    * youtube.subscriptions.list
    * @desc Returns subscription resources that match the API request criteria.
    * @alias youtube.subscriptions.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.channelId The channelId parameter specifies a YouTube channel ID. The API will only return that channel's subscriptions.
    * @param {string=} params.forChannelId The forChannelId parameter specifies a comma-separated list of channel IDs. The API response will then only contain subscriptions matching those channels.
    * @param {string=} params.id The id parameter specifies a comma-separated list of the YouTube subscription ID(s) for the resource(s) that are being retrieved. In a subscription resource, the id property specifies the YouTube subscription ID.
    * @param {integer=} params.maxResults The maxResults parameter specifies the maximum number of items that should be returned in the result set.
    * @param {boolean=} params.mine Set this parameter's value to true to retrieve a feed of the authenticated user's subscriptions.
    * @param {boolean=} params.myRecentSubscribers Set this parameter's value to true to retrieve a feed of the subscribers of the authenticated user in reverse chronological order (newest first).
    * @param {boolean=} params.mySubscribers Set this parameter's value to true to retrieve a feed of the subscribers of the authenticated user in no particular order.
    * @param {string=} params.onBehalfOfContentOwner Note: This parameter is intended exclusively for YouTube content partners.  The onBehalfOfContentOwner parameter indicates that the request's authorization credentials identify a YouTube CMS user who is acting on behalf of the content owner specified in the parameter value. This parameter is intended for YouTube content partners that own and manage many different YouTube channels. It allows content owners to authenticate once and get access to all their video and channel data, without having to provide authentication credentials for each individual channel. The CMS account that the user authenticates with must be linked to the specified YouTube content owner.
    * @param {string=} params.onBehalfOfContentOwnerChannel This parameter can only be used in a properly authorized request. Note: This parameter is intended exclusively for YouTube content partners.  The onBehalfOfContentOwnerChannel parameter specifies the YouTube channel ID of the channel to which a video is being added. This parameter is required when a request specifies a value for the onBehalfOfContentOwner parameter, and it can only be used in conjunction with that parameter. In addition, the request must be authorized using a CMS account that is linked to the content owner that the onBehalfOfContentOwner parameter specifies. Finally, the channel that the onBehalfOfContentOwnerChannel parameter value specifies must be linked to the content owner that the onBehalfOfContentOwner parameter specifies.  This parameter is intended for YouTube content partners that own and manage many different YouTube channels. It allows content owners to authenticate once and perform actions on behalf of the channel specified in the parameter value, without having to provide authentication credentials for each separate channel.
    * @param {string=} params.order The order parameter specifies the method that will be used to sort resources in the API response.
    * @param {string=} params.pageToken The pageToken parameter identifies a specific page in the result set that should be returned. In an API response, the nextPageToken and prevPageToken properties identify other pages that could be retrieved.
    * @param {string} params.part The part parameter specifies a comma-separated list of one or more subscription resource properties that the API response will include.  If the parameter identifies a property that contains child properties, the child properties will be included in the response. For example, in a subscription resource, the snippet property contains other properties, such as a display title for the subscription. If you set part=snippet, the API response will also contain all of those nested properties.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$SubscriptionListResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$SubscriptionListResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarSubscriptionsDollarList): GaxiosPromise[Schema$SubscriptionListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarSubscriptionsDollarList,
    callback: BodyResponseCallback[Schema$SubscriptionListResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarSubscriptionsDollarList,
    options: BodyResponseCallback[Schema$SubscriptionListResponse],
    callback: BodyResponseCallback[Schema$SubscriptionListResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarSubscriptionsDollarList, options: MethodOptions): GaxiosPromise[Schema$SubscriptionListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarSubscriptionsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$SubscriptionListResponse]
  ): Unit = js.native
}

