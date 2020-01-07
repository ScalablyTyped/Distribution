package typings.googleapis.buildSrcApisYoutubeV3Mod.youtube_v3

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/youtube/v3", "youtube_v3.Resource$Livebroadcasts")
@js.native
class Resource$Livebroadcasts protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * youtube.liveBroadcasts.bind
    * @desc Binds a YouTube broadcast to a stream or removes an existing
    * binding between a broadcast and a stream. A broadcast can only be bound
    * to one video stream, though a video stream may be bound to more than one
    * broadcast.
    * @alias youtube.liveBroadcasts.bind
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.id The id parameter specifies the unique ID of the broadcast that is being bound to a video stream.
    * @param {string=} params.onBehalfOfContentOwner Note: This parameter is intended exclusively for YouTube content partners.  The onBehalfOfContentOwner parameter indicates that the request's authorization credentials identify a YouTube CMS user who is acting on behalf of the content owner specified in the parameter value. This parameter is intended for YouTube content partners that own and manage many different YouTube channels. It allows content owners to authenticate once and get access to all their video and channel data, without having to provide authentication credentials for each individual channel. The CMS account that the user authenticates with must be linked to the specified YouTube content owner.
    * @param {string=} params.onBehalfOfContentOwnerChannel This parameter can only be used in a properly authorized request. Note: This parameter is intended exclusively for YouTube content partners.  The onBehalfOfContentOwnerChannel parameter specifies the YouTube channel ID of the channel to which a video is being added. This parameter is required when a request specifies a value for the onBehalfOfContentOwner parameter, and it can only be used in conjunction with that parameter. In addition, the request must be authorized using a CMS account that is linked to the content owner that the onBehalfOfContentOwner parameter specifies. Finally, the channel that the onBehalfOfContentOwnerChannel parameter value specifies must be linked to the content owner that the onBehalfOfContentOwner parameter specifies.  This parameter is intended for YouTube content partners that own and manage many different YouTube channels. It allows content owners to authenticate once and perform actions on behalf of the channel specified in the parameter value, without having to provide authentication credentials for each separate channel.
    * @param {string} params.part The part parameter specifies a comma-separated list of one or more liveBroadcast resource properties that the API response will include. The part names that you can include in the parameter value are id, snippet, contentDetails, and status.
    * @param {string=} params.streamId The streamId parameter specifies the unique ID of the video stream that is being bound to a broadcast. If this parameter is omitted, the API will remove any existing binding between the broadcast and a video stream.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def bind(): GaxiosPromise[Schema$LiveBroadcast] = js.native
  def bind(callback: BodyResponseCallback[Schema$LiveBroadcast]): Unit = js.native
  def bind(params: ParamsDollarResourceDollarLivebroadcastsDollarBind): GaxiosPromise[Schema$LiveBroadcast] = js.native
  def bind(
    params: ParamsDollarResourceDollarLivebroadcastsDollarBind,
    callback: BodyResponseCallback[Schema$LiveBroadcast]
  ): Unit = js.native
  def bind(
    params: ParamsDollarResourceDollarLivebroadcastsDollarBind,
    options: BodyResponseCallback[Schema$LiveBroadcast],
    callback: BodyResponseCallback[Schema$LiveBroadcast]
  ): Unit = js.native
  def bind(params: ParamsDollarResourceDollarLivebroadcastsDollarBind, options: MethodOptions): GaxiosPromise[Schema$LiveBroadcast] = js.native
  def bind(
    params: ParamsDollarResourceDollarLivebroadcastsDollarBind,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$LiveBroadcast]
  ): Unit = js.native
  /**
    * youtube.liveBroadcasts.control
    * @desc Controls the settings for a slate that can be displayed in the
    * broadcast stream.
    * @alias youtube.liveBroadcasts.control
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {boolean=} params.displaySlate The displaySlate parameter specifies whether the slate is being enabled or disabled.
    * @param {string} params.id The id parameter specifies the YouTube live broadcast ID that uniquely identifies the broadcast in which the slate is being updated.
    * @param {string=} params.offsetTimeMs The offsetTimeMs parameter specifies a positive time offset when the specified slate change will occur. The value is measured in milliseconds from the beginning of the broadcast's monitor stream, which is the time that the testing phase for the broadcast began. Even though it is specified in milliseconds, the value is actually an approximation, and YouTube completes the requested action as closely as possible to that time.  If you do not specify a value for this parameter, then YouTube performs the action as soon as possible. See the Getting started guide for more details.  Important: You should only specify a value for this parameter if your broadcast stream is delayed.
    * @param {string=} params.onBehalfOfContentOwner Note: This parameter is intended exclusively for YouTube content partners.  The onBehalfOfContentOwner parameter indicates that the request's authorization credentials identify a YouTube CMS user who is acting on behalf of the content owner specified in the parameter value. This parameter is intended for YouTube content partners that own and manage many different YouTube channels. It allows content owners to authenticate once and get access to all their video and channel data, without having to provide authentication credentials for each individual channel. The CMS account that the user authenticates with must be linked to the specified YouTube content owner.
    * @param {string=} params.onBehalfOfContentOwnerChannel This parameter can only be used in a properly authorized request. Note: This parameter is intended exclusively for YouTube content partners.  The onBehalfOfContentOwnerChannel parameter specifies the YouTube channel ID of the channel to which a video is being added. This parameter is required when a request specifies a value for the onBehalfOfContentOwner parameter, and it can only be used in conjunction with that parameter. In addition, the request must be authorized using a CMS account that is linked to the content owner that the onBehalfOfContentOwner parameter specifies. Finally, the channel that the onBehalfOfContentOwnerChannel parameter value specifies must be linked to the content owner that the onBehalfOfContentOwner parameter specifies.  This parameter is intended for YouTube content partners that own and manage many different YouTube channels. It allows content owners to authenticate once and perform actions on behalf of the channel specified in the parameter value, without having to provide authentication credentials for each separate channel.
    * @param {string} params.part The part parameter specifies a comma-separated list of one or more liveBroadcast resource properties that the API response will include. The part names that you can include in the parameter value are id, snippet, contentDetails, and status.
    * @param {string=} params.walltime The walltime parameter specifies the wall clock time at which the specified slate change will occur. The value is specified in ISO 8601 (YYYY-MM-DDThh:mm:ss.sssZ) format.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def control(): GaxiosPromise[Schema$LiveBroadcast] = js.native
  def control(callback: BodyResponseCallback[Schema$LiveBroadcast]): Unit = js.native
  def control(params: ParamsDollarResourceDollarLivebroadcastsDollarControl): GaxiosPromise[Schema$LiveBroadcast] = js.native
  def control(
    params: ParamsDollarResourceDollarLivebroadcastsDollarControl,
    callback: BodyResponseCallback[Schema$LiveBroadcast]
  ): Unit = js.native
  def control(
    params: ParamsDollarResourceDollarLivebroadcastsDollarControl,
    options: BodyResponseCallback[Schema$LiveBroadcast],
    callback: BodyResponseCallback[Schema$LiveBroadcast]
  ): Unit = js.native
  def control(params: ParamsDollarResourceDollarLivebroadcastsDollarControl, options: MethodOptions): GaxiosPromise[Schema$LiveBroadcast] = js.native
  def control(
    params: ParamsDollarResourceDollarLivebroadcastsDollarControl,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$LiveBroadcast]
  ): Unit = js.native
  /**
    * youtube.liveBroadcasts.delete
    * @desc Deletes a broadcast.
    * @alias youtube.liveBroadcasts.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.id The id parameter specifies the YouTube live broadcast ID for the resource that is being deleted.
    * @param {string=} params.onBehalfOfContentOwner Note: This parameter is intended exclusively for YouTube content partners.  The onBehalfOfContentOwner parameter indicates that the request's authorization credentials identify a YouTube CMS user who is acting on behalf of the content owner specified in the parameter value. This parameter is intended for YouTube content partners that own and manage many different YouTube channels. It allows content owners to authenticate once and get access to all their video and channel data, without having to provide authentication credentials for each individual channel. The CMS account that the user authenticates with must be linked to the specified YouTube content owner.
    * @param {string=} params.onBehalfOfContentOwnerChannel This parameter can only be used in a properly authorized request. Note: This parameter is intended exclusively for YouTube content partners.  The onBehalfOfContentOwnerChannel parameter specifies the YouTube channel ID of the channel to which a video is being added. This parameter is required when a request specifies a value for the onBehalfOfContentOwner parameter, and it can only be used in conjunction with that parameter. In addition, the request must be authorized using a CMS account that is linked to the content owner that the onBehalfOfContentOwner parameter specifies. Finally, the channel that the onBehalfOfContentOwnerChannel parameter value specifies must be linked to the content owner that the onBehalfOfContentOwner parameter specifies.  This parameter is intended for YouTube content partners that own and manage many different YouTube channels. It allows content owners to authenticate once and perform actions on behalf of the channel specified in the parameter value, without having to provide authentication credentials for each separate channel.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarLivebroadcastsDollarDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsDollarResourceDollarLivebroadcastsDollarDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarLivebroadcastsDollarDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(params: ParamsDollarResourceDollarLivebroadcastsDollarDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsDollarResourceDollarLivebroadcastsDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * youtube.liveBroadcasts.insert
    * @desc Creates a broadcast.
    * @alias youtube.liveBroadcasts.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.onBehalfOfContentOwner Note: This parameter is intended exclusively for YouTube content partners.  The onBehalfOfContentOwner parameter indicates that the request's authorization credentials identify a YouTube CMS user who is acting on behalf of the content owner specified in the parameter value. This parameter is intended for YouTube content partners that own and manage many different YouTube channels. It allows content owners to authenticate once and get access to all their video and channel data, without having to provide authentication credentials for each individual channel. The CMS account that the user authenticates with must be linked to the specified YouTube content owner.
    * @param {string=} params.onBehalfOfContentOwnerChannel This parameter can only be used in a properly authorized request. Note: This parameter is intended exclusively for YouTube content partners.  The onBehalfOfContentOwnerChannel parameter specifies the YouTube channel ID of the channel to which a video is being added. This parameter is required when a request specifies a value for the onBehalfOfContentOwner parameter, and it can only be used in conjunction with that parameter. In addition, the request must be authorized using a CMS account that is linked to the content owner that the onBehalfOfContentOwner parameter specifies. Finally, the channel that the onBehalfOfContentOwnerChannel parameter value specifies must be linked to the content owner that the onBehalfOfContentOwner parameter specifies.  This parameter is intended for YouTube content partners that own and manage many different YouTube channels. It allows content owners to authenticate once and perform actions on behalf of the channel specified in the parameter value, without having to provide authentication credentials for each separate channel.
    * @param {string} params.part The part parameter serves two purposes in this operation. It identifies the properties that the write operation will set as well as the properties that the API response will include.  The part properties that you can include in the parameter value are id, snippet, contentDetails, and status.
    * @param {().LiveBroadcast} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[Schema$LiveBroadcast] = js.native
  def insert(callback: BodyResponseCallback[Schema$LiveBroadcast]): Unit = js.native
  def insert(params: ParamsDollarResourceDollarLivebroadcastsDollarInsert): GaxiosPromise[Schema$LiveBroadcast] = js.native
  def insert(
    params: ParamsDollarResourceDollarLivebroadcastsDollarInsert,
    callback: BodyResponseCallback[Schema$LiveBroadcast]
  ): Unit = js.native
  def insert(
    params: ParamsDollarResourceDollarLivebroadcastsDollarInsert,
    options: BodyResponseCallback[Schema$LiveBroadcast],
    callback: BodyResponseCallback[Schema$LiveBroadcast]
  ): Unit = js.native
  def insert(params: ParamsDollarResourceDollarLivebroadcastsDollarInsert, options: MethodOptions): GaxiosPromise[Schema$LiveBroadcast] = js.native
  def insert(
    params: ParamsDollarResourceDollarLivebroadcastsDollarInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$LiveBroadcast]
  ): Unit = js.native
  /**
    * youtube.liveBroadcasts.list
    * @desc Returns a list of YouTube broadcasts that match the API request
    * parameters.
    * @alias youtube.liveBroadcasts.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.broadcastStatus The broadcastStatus parameter filters the API response to only include broadcasts with the specified status.
    * @param {string=} params.broadcastType The broadcastType parameter filters the API response to only include broadcasts with the specified type. This is only compatible with the mine filter for now.
    * @param {string=} params.id The id parameter specifies a comma-separated list of YouTube broadcast IDs that identify the broadcasts being retrieved. In a liveBroadcast resource, the id property specifies the broadcast's ID.
    * @param {integer=} params.maxResults The maxResults parameter specifies the maximum number of items that should be returned in the result set.
    * @param {boolean=} params.mine The mine parameter can be used to instruct the API to only return broadcasts owned by the authenticated user. Set the parameter value to true to only retrieve your own broadcasts.
    * @param {string=} params.onBehalfOfContentOwner Note: This parameter is intended exclusively for YouTube content partners.  The onBehalfOfContentOwner parameter indicates that the request's authorization credentials identify a YouTube CMS user who is acting on behalf of the content owner specified in the parameter value. This parameter is intended for YouTube content partners that own and manage many different YouTube channels. It allows content owners to authenticate once and get access to all their video and channel data, without having to provide authentication credentials for each individual channel. The CMS account that the user authenticates with must be linked to the specified YouTube content owner.
    * @param {string=} params.onBehalfOfContentOwnerChannel This parameter can only be used in a properly authorized request. Note: This parameter is intended exclusively for YouTube content partners.  The onBehalfOfContentOwnerChannel parameter specifies the YouTube channel ID of the channel to which a video is being added. This parameter is required when a request specifies a value for the onBehalfOfContentOwner parameter, and it can only be used in conjunction with that parameter. In addition, the request must be authorized using a CMS account that is linked to the content owner that the onBehalfOfContentOwner parameter specifies. Finally, the channel that the onBehalfOfContentOwnerChannel parameter value specifies must be linked to the content owner that the onBehalfOfContentOwner parameter specifies.  This parameter is intended for YouTube content partners that own and manage many different YouTube channels. It allows content owners to authenticate once and perform actions on behalf of the channel specified in the parameter value, without having to provide authentication credentials for each separate channel.
    * @param {string=} params.pageToken The pageToken parameter identifies a specific page in the result set that should be returned. In an API response, the nextPageToken and prevPageToken properties identify other pages that could be retrieved.
    * @param {string} params.part The part parameter specifies a comma-separated list of one or more liveBroadcast resource properties that the API response will include. The part names that you can include in the parameter value are id, snippet, contentDetails, and status.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$LiveBroadcastListResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$LiveBroadcastListResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarLivebroadcastsDollarList): GaxiosPromise[Schema$LiveBroadcastListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarLivebroadcastsDollarList,
    callback: BodyResponseCallback[Schema$LiveBroadcastListResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarLivebroadcastsDollarList,
    options: BodyResponseCallback[Schema$LiveBroadcastListResponse],
    callback: BodyResponseCallback[Schema$LiveBroadcastListResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarLivebroadcastsDollarList, options: MethodOptions): GaxiosPromise[Schema$LiveBroadcastListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarLivebroadcastsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$LiveBroadcastListResponse]
  ): Unit = js.native
  /**
    * youtube.liveBroadcasts.transition
    * @desc Changes the status of a YouTube live broadcast and initiates any
    * processes associated with the new status. For example, when you
    * transition a broadcast's status to testing, YouTube starts to transmit
    * video to that broadcast's monitor stream. Before calling this method, you
    * should confirm that the value of the status.streamStatus property for the
    * stream bound to your broadcast is active.
    * @alias youtube.liveBroadcasts.transition
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.broadcastStatus The broadcastStatus parameter identifies the state to which the broadcast is changing. Note that to transition a broadcast to either the testing or live state, the status.streamStatus must be active for the stream that the broadcast is bound to.
    * @param {string} params.id The id parameter specifies the unique ID of the broadcast that is transitioning to another status.
    * @param {string=} params.onBehalfOfContentOwner Note: This parameter is intended exclusively for YouTube content partners.  The onBehalfOfContentOwner parameter indicates that the request's authorization credentials identify a YouTube CMS user who is acting on behalf of the content owner specified in the parameter value. This parameter is intended for YouTube content partners that own and manage many different YouTube channels. It allows content owners to authenticate once and get access to all their video and channel data, without having to provide authentication credentials for each individual channel. The CMS account that the user authenticates with must be linked to the specified YouTube content owner.
    * @param {string=} params.onBehalfOfContentOwnerChannel This parameter can only be used in a properly authorized request. Note: This parameter is intended exclusively for YouTube content partners.  The onBehalfOfContentOwnerChannel parameter specifies the YouTube channel ID of the channel to which a video is being added. This parameter is required when a request specifies a value for the onBehalfOfContentOwner parameter, and it can only be used in conjunction with that parameter. In addition, the request must be authorized using a CMS account that is linked to the content owner that the onBehalfOfContentOwner parameter specifies. Finally, the channel that the onBehalfOfContentOwnerChannel parameter value specifies must be linked to the content owner that the onBehalfOfContentOwner parameter specifies.  This parameter is intended for YouTube content partners that own and manage many different YouTube channels. It allows content owners to authenticate once and perform actions on behalf of the channel specified in the parameter value, without having to provide authentication credentials for each separate channel.
    * @param {string} params.part The part parameter specifies a comma-separated list of one or more liveBroadcast resource properties that the API response will include. The part names that you can include in the parameter value are id, snippet, contentDetails, and status.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def transition(): GaxiosPromise[Schema$LiveBroadcast] = js.native
  def transition(callback: BodyResponseCallback[Schema$LiveBroadcast]): Unit = js.native
  def transition(params: ParamsDollarResourceDollarLivebroadcastsDollarTransition): GaxiosPromise[Schema$LiveBroadcast] = js.native
  def transition(
    params: ParamsDollarResourceDollarLivebroadcastsDollarTransition,
    callback: BodyResponseCallback[Schema$LiveBroadcast]
  ): Unit = js.native
  def transition(
    params: ParamsDollarResourceDollarLivebroadcastsDollarTransition,
    options: BodyResponseCallback[Schema$LiveBroadcast],
    callback: BodyResponseCallback[Schema$LiveBroadcast]
  ): Unit = js.native
  def transition(params: ParamsDollarResourceDollarLivebroadcastsDollarTransition, options: MethodOptions): GaxiosPromise[Schema$LiveBroadcast] = js.native
  def transition(
    params: ParamsDollarResourceDollarLivebroadcastsDollarTransition,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$LiveBroadcast]
  ): Unit = js.native
  /**
    * youtube.liveBroadcasts.update
    * @desc Updates a broadcast. For example, you could modify the broadcast
    * settings defined in the liveBroadcast resource's contentDetails object.
    * @alias youtube.liveBroadcasts.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.onBehalfOfContentOwner Note: This parameter is intended exclusively for YouTube content partners.  The onBehalfOfContentOwner parameter indicates that the request's authorization credentials identify a YouTube CMS user who is acting on behalf of the content owner specified in the parameter value. This parameter is intended for YouTube content partners that own and manage many different YouTube channels. It allows content owners to authenticate once and get access to all their video and channel data, without having to provide authentication credentials for each individual channel. The CMS account that the user authenticates with must be linked to the specified YouTube content owner.
    * @param {string=} params.onBehalfOfContentOwnerChannel This parameter can only be used in a properly authorized request. Note: This parameter is intended exclusively for YouTube content partners.  The onBehalfOfContentOwnerChannel parameter specifies the YouTube channel ID of the channel to which a video is being added. This parameter is required when a request specifies a value for the onBehalfOfContentOwner parameter, and it can only be used in conjunction with that parameter. In addition, the request must be authorized using a CMS account that is linked to the content owner that the onBehalfOfContentOwner parameter specifies. Finally, the channel that the onBehalfOfContentOwnerChannel parameter value specifies must be linked to the content owner that the onBehalfOfContentOwner parameter specifies.  This parameter is intended for YouTube content partners that own and manage many different YouTube channels. It allows content owners to authenticate once and perform actions on behalf of the channel specified in the parameter value, without having to provide authentication credentials for each separate channel.
    * @param {string} params.part The part parameter serves two purposes in this operation. It identifies the properties that the write operation will set as well as the properties that the API response will include.  The part properties that you can include in the parameter value are id, snippet, contentDetails, and status.  Note that this method will override the existing values for all of the mutable properties that are contained in any parts that the parameter value specifies. For example, a broadcast's privacy status is defined in the status part. As such, if your request is updating a private or unlisted broadcast, and the request's part parameter value includes the status part, the broadcast's privacy setting will be updated to whatever value the request body specifies. If the request body does not specify a value, the existing privacy setting will be removed and the broadcast will revert to the default privacy setting.
    * @param {().LiveBroadcast} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[Schema$LiveBroadcast] = js.native
  def update(callback: BodyResponseCallback[Schema$LiveBroadcast]): Unit = js.native
  def update(params: ParamsDollarResourceDollarLivebroadcastsDollarUpdate): GaxiosPromise[Schema$LiveBroadcast] = js.native
  def update(
    params: ParamsDollarResourceDollarLivebroadcastsDollarUpdate,
    callback: BodyResponseCallback[Schema$LiveBroadcast]
  ): Unit = js.native
  def update(
    params: ParamsDollarResourceDollarLivebroadcastsDollarUpdate,
    options: BodyResponseCallback[Schema$LiveBroadcast],
    callback: BodyResponseCallback[Schema$LiveBroadcast]
  ): Unit = js.native
  def update(params: ParamsDollarResourceDollarLivebroadcastsDollarUpdate, options: MethodOptions): GaxiosPromise[Schema$LiveBroadcast] = js.native
  def update(
    params: ParamsDollarResourceDollarLivebroadcastsDollarUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$LiveBroadcast]
  ): Unit = js.native
}

