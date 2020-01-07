package typings.googleapis.buildSrcApisYoutubeV3Mod.youtube_v3

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/youtube/v3", "youtube_v3.Resource$Channels")
@js.native
class Resource$Channels protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * youtube.channels.list
    * @desc Returns a collection of zero or more channel resources that match
    * the request criteria.
    * @alias youtube.channels.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.categoryId The categoryId parameter specifies a YouTube guide category, thereby requesting YouTube channels associated with that category.
    * @param {string=} params.forUsername The forUsername parameter specifies a YouTube username, thereby requesting the channel associated with that username.
    * @param {string=} params.hl The hl parameter should be used for filter out the properties that are not in the given language. Used for the brandingSettings part.
    * @param {string=} params.id The id parameter specifies a comma-separated list of the YouTube channel ID(s) for the resource(s) that are being retrieved. In a channel resource, the id property specifies the channel's YouTube channel ID.
    * @param {boolean=} params.managedByMe Note: This parameter is intended exclusively for YouTube content partners.  Set this parameter's value to true to instruct the API to only return channels managed by the content owner that the onBehalfOfContentOwner parameter specifies. The user must be authenticated as a CMS account linked to the specified content owner and onBehalfOfContentOwner must be provided.
    * @param {integer=} params.maxResults The maxResults parameter specifies the maximum number of items that should be returned in the result set.
    * @param {boolean=} params.mine Set this parameter's value to true to instruct the API to only return channels owned by the authenticated user.
    * @param {boolean=} params.mySubscribers Use the subscriptions.list method and its mySubscribers parameter to retrieve a list of subscribers to the authenticated user's channel.
    * @param {string=} params.onBehalfOfContentOwner Note: This parameter is intended exclusively for YouTube content partners.  The onBehalfOfContentOwner parameter indicates that the request's authorization credentials identify a YouTube CMS user who is acting on behalf of the content owner specified in the parameter value. This parameter is intended for YouTube content partners that own and manage many different YouTube channels. It allows content owners to authenticate once and get access to all their video and channel data, without having to provide authentication credentials for each individual channel. The CMS account that the user authenticates with must be linked to the specified YouTube content owner.
    * @param {string=} params.pageToken The pageToken parameter identifies a specific page in the result set that should be returned. In an API response, the nextPageToken and prevPageToken properties identify other pages that could be retrieved.
    * @param {string} params.part The part parameter specifies a comma-separated list of one or more channel resource properties that the API response will include.  If the parameter identifies a property that contains child properties, the child properties will be included in the response. For example, in a channel resource, the contentDetails property contains other properties, such as the uploads properties. As such, if you set part=contentDetails, the API response will also contain all of those nested properties.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$ChannelListResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$ChannelListResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarChannelsDollarList): GaxiosPromise[Schema$ChannelListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarChannelsDollarList,
    callback: BodyResponseCallback[Schema$ChannelListResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarChannelsDollarList,
    options: BodyResponseCallback[Schema$ChannelListResponse],
    callback: BodyResponseCallback[Schema$ChannelListResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarChannelsDollarList, options: MethodOptions): GaxiosPromise[Schema$ChannelListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarChannelsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ChannelListResponse]
  ): Unit = js.native
  /**
    * youtube.channels.update
    * @desc Updates a channel's metadata. Note that this method currently only
    * supports updates to the channel resource's brandingSettings and
    * invideoPromotion objects and their child properties.
    * @alias youtube.channels.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.onBehalfOfContentOwner The onBehalfOfContentOwner parameter indicates that the authenticated user is acting on behalf of the content owner specified in the parameter value. This parameter is intended for YouTube content partners that own and manage many different YouTube channels. It allows content owners to authenticate once and get access to all their video and channel data, without having to provide authentication credentials for each individual channel. The actual CMS account that the user authenticates with needs to be linked to the specified YouTube content owner.
    * @param {string} params.part The part parameter serves two purposes in this operation. It identifies the properties that the write operation will set as well as the properties that the API response will include.  The API currently only allows the parameter value to be set to either brandingSettings or invideoPromotion. (You cannot update both of those parts with a single request.)  Note that this method overrides the existing values for all of the mutable properties that are contained in any parts that the parameter value specifies.
    * @param {().Channel} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[Schema$Channel] = js.native
  def update(callback: BodyResponseCallback[Schema$Channel]): Unit = js.native
  def update(params: ParamsDollarResourceDollarChannelsDollarUpdate): GaxiosPromise[Schema$Channel] = js.native
  def update(
    params: ParamsDollarResourceDollarChannelsDollarUpdate,
    callback: BodyResponseCallback[Schema$Channel]
  ): Unit = js.native
  def update(
    params: ParamsDollarResourceDollarChannelsDollarUpdate,
    options: BodyResponseCallback[Schema$Channel],
    callback: BodyResponseCallback[Schema$Channel]
  ): Unit = js.native
  def update(params: ParamsDollarResourceDollarChannelsDollarUpdate, options: MethodOptions): GaxiosPromise[Schema$Channel] = js.native
  def update(
    params: ParamsDollarResourceDollarChannelsDollarUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Channel]
  ): Unit = js.native
}

