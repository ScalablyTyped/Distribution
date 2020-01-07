package typings.googleapis.buildSrcApisYoutubeV3Mod.youtube_v3

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/youtube/v3", "youtube_v3.Resource$Videos")
@js.native
class Resource$Videos protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * youtube.videos.delete
    * @desc Deletes a YouTube video.
    * @alias youtube.videos.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.id The id parameter specifies the YouTube video ID for the resource that is being deleted. In a video resource, the id property specifies the video's ID.
    * @param {string=} params.onBehalfOfContentOwner Note: This parameter is intended exclusively for YouTube content partners.  The onBehalfOfContentOwner parameter indicates that the request's authorization credentials identify a YouTube CMS user who is acting on behalf of the content owner specified in the parameter value. This parameter is intended for YouTube content partners that own and manage many different YouTube channels. It allows content owners to authenticate once and get access to all their video and channel data, without having to provide authentication credentials for each individual channel. The actual CMS account that the user authenticates with must be linked to the specified YouTube content owner.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarVideosDollarDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsDollarResourceDollarVideosDollarDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarVideosDollarDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(params: ParamsDollarResourceDollarVideosDollarDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsDollarResourceDollarVideosDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * youtube.videos.getRating
    * @desc Retrieves the ratings that the authorized user gave to a list of
    * specified videos.
    * @alias youtube.videos.getRating
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.id The id parameter specifies a comma-separated list of the YouTube video ID(s) for the resource(s) for which you are retrieving rating data. In a video resource, the id property specifies the video's ID.
    * @param {string=} params.onBehalfOfContentOwner Note: This parameter is intended exclusively for YouTube content partners.  The onBehalfOfContentOwner parameter indicates that the request's authorization credentials identify a YouTube CMS user who is acting on behalf of the content owner specified in the parameter value. This parameter is intended for YouTube content partners that own and manage many different YouTube channels. It allows content owners to authenticate once and get access to all their video and channel data, without having to provide authentication credentials for each individual channel. The CMS account that the user authenticates with must be linked to the specified YouTube content owner.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def getRating(): GaxiosPromise[Schema$VideoGetRatingResponse] = js.native
  def getRating(callback: BodyResponseCallback[Schema$VideoGetRatingResponse]): Unit = js.native
  def getRating(params: ParamsDollarResourceDollarVideosDollarGetrating): GaxiosPromise[Schema$VideoGetRatingResponse] = js.native
  def getRating(
    params: ParamsDollarResourceDollarVideosDollarGetrating,
    callback: BodyResponseCallback[Schema$VideoGetRatingResponse]
  ): Unit = js.native
  def getRating(
    params: ParamsDollarResourceDollarVideosDollarGetrating,
    options: BodyResponseCallback[Schema$VideoGetRatingResponse],
    callback: BodyResponseCallback[Schema$VideoGetRatingResponse]
  ): Unit = js.native
  def getRating(params: ParamsDollarResourceDollarVideosDollarGetrating, options: MethodOptions): GaxiosPromise[Schema$VideoGetRatingResponse] = js.native
  def getRating(
    params: ParamsDollarResourceDollarVideosDollarGetrating,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$VideoGetRatingResponse]
  ): Unit = js.native
  /**
    * youtube.videos.insert
    * @desc Uploads a video to YouTube and optionally sets the video's
    * metadata.
    * @alias youtube.videos.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {boolean=} params.autoLevels The autoLevels parameter indicates whether YouTube should automatically enhance the video's lighting and color.
    * @param {boolean=} params.notifySubscribers The notifySubscribers parameter indicates whether YouTube should send a notification about the new video to users who subscribe to the video's channel. A parameter value of True indicates that subscribers will be notified of newly uploaded videos. However, a channel owner who is uploading many videos might prefer to set the value to False to avoid sending a notification about each new video to the channel's subscribers.
    * @param {string=} params.onBehalfOfContentOwner Note: This parameter is intended exclusively for YouTube content partners.  The onBehalfOfContentOwner parameter indicates that the request's authorization credentials identify a YouTube CMS user who is acting on behalf of the content owner specified in the parameter value. This parameter is intended for YouTube content partners that own and manage many different YouTube channels. It allows content owners to authenticate once and get access to all their video and channel data, without having to provide authentication credentials for each individual channel. The CMS account that the user authenticates with must be linked to the specified YouTube content owner.
    * @param {string=} params.onBehalfOfContentOwnerChannel This parameter can only be used in a properly authorized request. Note: This parameter is intended exclusively for YouTube content partners.  The onBehalfOfContentOwnerChannel parameter specifies the YouTube channel ID of the channel to which a video is being added. This parameter is required when a request specifies a value for the onBehalfOfContentOwner parameter, and it can only be used in conjunction with that parameter. In addition, the request must be authorized using a CMS account that is linked to the content owner that the onBehalfOfContentOwner parameter specifies. Finally, the channel that the onBehalfOfContentOwnerChannel parameter value specifies must be linked to the content owner that the onBehalfOfContentOwner parameter specifies.  This parameter is intended for YouTube content partners that own and manage many different YouTube channels. It allows content owners to authenticate once and perform actions on behalf of the channel specified in the parameter value, without having to provide authentication credentials for each separate channel.
    * @param {string} params.part The part parameter serves two purposes in this operation. It identifies the properties that the write operation will set as well as the properties that the API response will include.  Note that not all parts contain properties that can be set when inserting or updating a video. For example, the statistics object encapsulates statistics that YouTube calculates for a video and does not contain values that you can set or modify. If the parameter value specifies a part that does not contain mutable values, that part will still be included in the API response.
    * @param {boolean=} params.stabilize The stabilize parameter indicates whether YouTube should adjust the video to remove shaky camera motions.
    * @param  {object} params.resource Media resource metadata
    * @param {object} params.media Media object
    * @param {string} params.media.mimeType Media mime-type
    * @param {string|object} params.media.body Media body contents
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[Schema$Video] = js.native
  def insert(callback: BodyResponseCallback[Schema$Video]): Unit = js.native
  def insert(params: ParamsDollarResourceDollarVideosDollarInsert): GaxiosPromise[Schema$Video] = js.native
  def insert(params: ParamsDollarResourceDollarVideosDollarInsert, callback: BodyResponseCallback[Schema$Video]): Unit = js.native
  def insert(
    params: ParamsDollarResourceDollarVideosDollarInsert,
    options: BodyResponseCallback[Schema$Video],
    callback: BodyResponseCallback[Schema$Video]
  ): Unit = js.native
  def insert(params: ParamsDollarResourceDollarVideosDollarInsert, options: MethodOptions): GaxiosPromise[Schema$Video] = js.native
  def insert(
    params: ParamsDollarResourceDollarVideosDollarInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Video]
  ): Unit = js.native
  /**
    * youtube.videos.list
    * @desc Returns a list of videos that match the API request parameters.
    * @alias youtube.videos.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.chart The chart parameter identifies the chart that you want to retrieve.
    * @param {string=} params.hl The hl parameter instructs the API to retrieve localized resource metadata for a specific application language that the YouTube website supports. The parameter value must be a language code included in the list returned by the i18nLanguages.list method.  If localized resource details are available in that language, the resource's snippet.localized object will contain the localized values. However, if localized details are not available, the snippet.localized object will contain resource details in the resource's default language.
    * @param {string=} params.id The id parameter specifies a comma-separated list of the YouTube video ID(s) for the resource(s) that are being retrieved. In a video resource, the id property specifies the video's ID.
    * @param {string=} params.locale DEPRECATED
    * @param {integer=} params.maxHeight The maxHeight parameter specifies a maximum height of the embedded player. If maxWidth is provided, maxHeight may not be reached in order to not violate the width request.
    * @param {integer=} params.maxResults The maxResults parameter specifies the maximum number of items that should be returned in the result set.  Note: This parameter is supported for use in conjunction with the myRating and chart parameters, but it is not supported for use in conjunction with the id parameter.
    * @param {integer=} params.maxWidth The maxWidth parameter specifies a maximum width of the embedded player. If maxHeight is provided, maxWidth may not be reached in order to not violate the height request.
    * @param {string=} params.myRating Set this parameter's value to like or dislike to instruct the API to only return videos liked or disliked by the authenticated user.
    * @param {string=} params.onBehalfOfContentOwner Note: This parameter is intended exclusively for YouTube content partners.  The onBehalfOfContentOwner parameter indicates that the request's authorization credentials identify a YouTube CMS user who is acting on behalf of the content owner specified in the parameter value. This parameter is intended for YouTube content partners that own and manage many different YouTube channels. It allows content owners to authenticate once and get access to all their video and channel data, without having to provide authentication credentials for each individual channel. The CMS account that the user authenticates with must be linked to the specified YouTube content owner.
    * @param {string=} params.pageToken The pageToken parameter identifies a specific page in the result set that should be returned. In an API response, the nextPageToken and prevPageToken properties identify other pages that could be retrieved.  Note: This parameter is supported for use in conjunction with the myRating and chart parameters, but it is not supported for use in conjunction with the id parameter.
    * @param {string} params.part The part parameter specifies a comma-separated list of one or more video resource properties that the API response will include.  If the parameter identifies a property that contains child properties, the child properties will be included in the response. For example, in a video resource, the snippet property contains the channelId, title, description, tags, and categoryId properties. As such, if you set part=snippet, the API response will contain all of those properties.
    * @param {string=} params.regionCode The regionCode parameter instructs the API to select a video chart available in the specified region. This parameter can only be used in conjunction with the chart parameter. The parameter value is an ISO 3166-1 alpha-2 country code.
    * @param {string=} params.videoCategoryId The videoCategoryId parameter identifies the video category for which the chart should be retrieved. This parameter can only be used in conjunction with the chart parameter. By default, charts are not restricted to a particular category.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$VideoListResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$VideoListResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarVideosDollarList): GaxiosPromise[Schema$VideoListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarVideosDollarList,
    callback: BodyResponseCallback[Schema$VideoListResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarVideosDollarList,
    options: BodyResponseCallback[Schema$VideoListResponse],
    callback: BodyResponseCallback[Schema$VideoListResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarVideosDollarList, options: MethodOptions): GaxiosPromise[Schema$VideoListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarVideosDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$VideoListResponse]
  ): Unit = js.native
  /**
    * youtube.videos.rate
    * @desc Add a like or dislike rating to a video or remove a rating from a
    * video.
    * @alias youtube.videos.rate
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.id The id parameter specifies the YouTube video ID of the video that is being rated or having its rating removed.
    * @param {string} params.rating Specifies the rating to record.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def rate(): GaxiosPromise[Unit] = js.native
  def rate(callback: BodyResponseCallback[Unit]): Unit = js.native
  def rate(params: ParamsDollarResourceDollarVideosDollarRate): GaxiosPromise[Unit] = js.native
  def rate(params: ParamsDollarResourceDollarVideosDollarRate, callback: BodyResponseCallback[Unit]): Unit = js.native
  def rate(
    params: ParamsDollarResourceDollarVideosDollarRate,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def rate(params: ParamsDollarResourceDollarVideosDollarRate, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def rate(
    params: ParamsDollarResourceDollarVideosDollarRate,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * youtube.videos.reportAbuse
    * @desc Report abuse for a video.
    * @alias youtube.videos.reportAbuse
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.onBehalfOfContentOwner Note: This parameter is intended exclusively for YouTube content partners.  The onBehalfOfContentOwner parameter indicates that the request's authorization credentials identify a YouTube CMS user who is acting on behalf of the content owner specified in the parameter value. This parameter is intended for YouTube content partners that own and manage many different YouTube channels. It allows content owners to authenticate once and get access to all their video and channel data, without having to provide authentication credentials for each individual channel. The CMS account that the user authenticates with must be linked to the specified YouTube content owner.
    * @param {().VideoAbuseReport} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def reportAbuse(): GaxiosPromise[Unit] = js.native
  def reportAbuse(callback: BodyResponseCallback[Unit]): Unit = js.native
  def reportAbuse(params: ParamsDollarResourceDollarVideosDollarReportabuse): GaxiosPromise[Unit] = js.native
  def reportAbuse(params: ParamsDollarResourceDollarVideosDollarReportabuse, callback: BodyResponseCallback[Unit]): Unit = js.native
  def reportAbuse(
    params: ParamsDollarResourceDollarVideosDollarReportabuse,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def reportAbuse(params: ParamsDollarResourceDollarVideosDollarReportabuse, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def reportAbuse(
    params: ParamsDollarResourceDollarVideosDollarReportabuse,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * youtube.videos.update
    * @desc Updates a video's metadata.
    * @alias youtube.videos.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.onBehalfOfContentOwner Note: This parameter is intended exclusively for YouTube content partners.  The onBehalfOfContentOwner parameter indicates that the request's authorization credentials identify a YouTube CMS user who is acting on behalf of the content owner specified in the parameter value. This parameter is intended for YouTube content partners that own and manage many different YouTube channels. It allows content owners to authenticate once and get access to all their video and channel data, without having to provide authentication credentials for each individual channel. The actual CMS account that the user authenticates with must be linked to the specified YouTube content owner.
    * @param {string} params.part The part parameter serves two purposes in this operation. It identifies the properties that the write operation will set as well as the properties that the API response will include.  Note that this method will override the existing values for all of the mutable properties that are contained in any parts that the parameter value specifies. For example, a video's privacy setting is contained in the status part. As such, if your request is updating a private video, and the request's part parameter value includes the status part, the video's privacy setting will be updated to whatever value the request body specifies. If the request body does not specify a value, the existing privacy setting will be removed and the video will revert to the default privacy setting.  In addition, not all parts contain properties that can be set when inserting or updating a video. For example, the statistics object encapsulates statistics that YouTube calculates for a video and does not contain values that you can set or modify. If the parameter value specifies a part that does not contain mutable values, that part will still be included in the API response.
    * @param {().Video} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[Schema$Video] = js.native
  def update(callback: BodyResponseCallback[Schema$Video]): Unit = js.native
  def update(params: ParamsDollarResourceDollarVideosDollarUpdate): GaxiosPromise[Schema$Video] = js.native
  def update(params: ParamsDollarResourceDollarVideosDollarUpdate, callback: BodyResponseCallback[Schema$Video]): Unit = js.native
  def update(
    params: ParamsDollarResourceDollarVideosDollarUpdate,
    options: BodyResponseCallback[Schema$Video],
    callback: BodyResponseCallback[Schema$Video]
  ): Unit = js.native
  def update(params: ParamsDollarResourceDollarVideosDollarUpdate, options: MethodOptions): GaxiosPromise[Schema$Video] = js.native
  def update(
    params: ParamsDollarResourceDollarVideosDollarUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Video]
  ): Unit = js.native
}

