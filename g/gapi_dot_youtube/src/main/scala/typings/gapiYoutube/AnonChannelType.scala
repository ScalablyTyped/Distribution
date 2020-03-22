package typings.gapiYoutube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonChannelType extends js.Object {
  /**
    * The channelId parameter indicates that the API response should only contain resources created by the channel
    */
  var channelId: js.UndefOr[String] = js.undefined
  /**
    * The channelType parameter lets you restrict a search to a particular type of channel.
    */
  var channelType: js.UndefOr[String] = js.undefined
  /**
    * The forContentOwner parameter restricts the search to only retrieve resources owned by the content owner specified by the onBehalfOfContentOwner parameter. The user must be authenticated as a CMS account linked to the specified content owner and onBehalfOfContentOwner must be provided.
    */
  var forContentOwner: js.UndefOr[Boolean] = js.undefined
  /**
    * The forMine parameter restricts the search to only retrieve videos owned by the authenticated user.
    */
  var forMine: js.UndefOr[Boolean] = js.undefined
  /**
    * The maxResults parameter specifies the maximum number of items that should be returned in the result set.
    */
  var maxResults: js.UndefOr[Double] = js.undefined
  /**
    * The onBehalfOfContentOwner parameter indicates that the authenticated user is acting on behalf of the content owner specified in the parameter value. This parameter is intended for YouTube content partners that own and manage many different YouTube channels. It allows content owners to authenticate once and get access to all their video and channel data, without having to provide authentication credentials for each individual channel. The actual CMS account that the user authenticates with needs to be linked to the specified YouTube content owner.
    */
  var onBehalfOfContentOwner: js.UndefOr[String] = js.undefined
  /**
    * The order parameter specifies the method that will be used to order resources in the API response.
    */
  var order: js.UndefOr[String] = js.undefined
  /**
    * The pageToken parameter identifies a specific page in the result set that should be returned. In an API response, the nextPageToken and prevPageToken properties identify other pages that could be retrieved.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  /**
    * The part parameter specifies a comma-separated list of one or more search resource properties that the API response will include. The part names that you can include in the parameter value are id and snippet. If the parameter identifies a property that contains child properties, the child properties will be included in the response. For example, in a search result, the snippet property contains other properties that identify the result's title, description, and so forth. If you set part=snippet, the API response will also contain all of those nested properties.
    */
  var part: String
  /**
    * The publishedAfter parameter indicates that the API response should only contain resources created after the specified time. The value is an RFC 3339 formatted date-time value (1970-01-01T00:00:00Z).
    */
  var publishedAfter: js.UndefOr[String] = js.undefined
  /**
    * The publishedBefore parameter indicates that the API response should only contain resources created before the specified time. The value is an RFC 3339 formatted date-time value (1970-01-01T00:00:00Z).
    */
  var publishedBefore: js.UndefOr[String] = js.undefined
  /**
    * The q parameter specifies the query term to search for.
    */
  var q: js.UndefOr[String] = js.undefined
  /**
    * The regionCode parameter instructs the API to return search results for the specified country. The parameter value is an ISO 3166-1 alpha-2 country code.
    */
  var regionCode: js.UndefOr[String] = js.undefined
  /**
    * The relatedToVideoId parameter retrieves a list of videos that are related to the video that the parameter value identifies. The parameter value must be set to a YouTube video ID and, if you are using this parameter, the type parameter must be set to video.
    */
  var relatedToVideoId: js.UndefOr[String] = js.undefined
  /**
    * The safeSearch parameter indicates whether the search results should include restricted content as well as standard content.
    */
  var safeSearch: js.UndefOr[String] = js.undefined
  /**
    * The topicId parameter indicates that the API response should only contain resources associated with the specified topic. The value identifies a Freebase topic ID.
    */
  var topicId: js.UndefOr[String] = js.undefined
  /**
    * The type parameter restricts a search query to only retrieve a particular type of resource.
    */
  var `type`: js.UndefOr[String] = js.undefined
  /**
    * The videoCaption parameter indicates whether the API should filter video search results based on whether they have captions.
    */
  var videoCaption: js.UndefOr[String] = js.undefined
  /**
    * The videoCategoryId parameter filters video search results based on their category.
    */
  var videoCategoryId: js.UndefOr[String] = js.undefined
  /**
    * The videoDefinition parameter lets you restrict a search to only include either high definition (HD) or standard definition (SD) videos. HD videos are available for playback in at least 720p, though higher resolutions, like 1080p, might also be available.
    */
  var videoDefinition: js.UndefOr[String] = js.undefined
  /**
    * The videoDimension parameter lets you restrict a search to only retrieve 2D or 3D videos.
    */
  var videoDimension: js.UndefOr[String] = js.undefined
  /**
    * The videoDuration parameter filters video search results based on their duration.
    */
  var videoDuration: js.UndefOr[String] = js.undefined
  /**
    * The videoEmbeddable parameter lets you to restrict a search to only videos that can be embedded into a webpage.
    */
  var videoEmbeddable: js.UndefOr[String] = js.undefined
  /**
    * The videoLicense parameter filters search results to only include videos with a particular license. YouTube lets video uploaders choose to attach either the Creative Commons license or the standard YouTube license to each of their videos.
    */
  var videoLicense: js.UndefOr[String] = js.undefined
  /**
    * The videoSyndicated parameter lets you to restrict a search to only videos that can be played outside youtube.com.
    */
  var videoSyndicated: js.UndefOr[String] = js.undefined
  /**
    * The videoType parameter lets you restrict a search to a particular type of videos.
    */
  var videoType: js.UndefOr[String] = js.undefined
}

object AnonChannelType {
  @scala.inline
  def apply(
    part: String,
    channelId: String = null,
    channelType: String = null,
    forContentOwner: js.UndefOr[Boolean] = js.undefined,
    forMine: js.UndefOr[Boolean] = js.undefined,
    maxResults: Int | Double = null,
    onBehalfOfContentOwner: String = null,
    order: String = null,
    pageToken: String = null,
    publishedAfter: String = null,
    publishedBefore: String = null,
    q: String = null,
    regionCode: String = null,
    relatedToVideoId: String = null,
    safeSearch: String = null,
    topicId: String = null,
    `type`: String = null,
    videoCaption: String = null,
    videoCategoryId: String = null,
    videoDefinition: String = null,
    videoDimension: String = null,
    videoDuration: String = null,
    videoEmbeddable: String = null,
    videoLicense: String = null,
    videoSyndicated: String = null,
    videoType: String = null
  ): AnonChannelType = {
    val __obj = js.Dynamic.literal(part = part.asInstanceOf[js.Any])
    if (channelId != null) __obj.updateDynamic("channelId")(channelId.asInstanceOf[js.Any])
    if (channelType != null) __obj.updateDynamic("channelType")(channelType.asInstanceOf[js.Any])
    if (!js.isUndefined(forContentOwner)) __obj.updateDynamic("forContentOwner")(forContentOwner.asInstanceOf[js.Any])
    if (!js.isUndefined(forMine)) __obj.updateDynamic("forMine")(forMine.asInstanceOf[js.Any])
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    if (onBehalfOfContentOwner != null) __obj.updateDynamic("onBehalfOfContentOwner")(onBehalfOfContentOwner.asInstanceOf[js.Any])
    if (order != null) __obj.updateDynamic("order")(order.asInstanceOf[js.Any])
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken.asInstanceOf[js.Any])
    if (publishedAfter != null) __obj.updateDynamic("publishedAfter")(publishedAfter.asInstanceOf[js.Any])
    if (publishedBefore != null) __obj.updateDynamic("publishedBefore")(publishedBefore.asInstanceOf[js.Any])
    if (q != null) __obj.updateDynamic("q")(q.asInstanceOf[js.Any])
    if (regionCode != null) __obj.updateDynamic("regionCode")(regionCode.asInstanceOf[js.Any])
    if (relatedToVideoId != null) __obj.updateDynamic("relatedToVideoId")(relatedToVideoId.asInstanceOf[js.Any])
    if (safeSearch != null) __obj.updateDynamic("safeSearch")(safeSearch.asInstanceOf[js.Any])
    if (topicId != null) __obj.updateDynamic("topicId")(topicId.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (videoCaption != null) __obj.updateDynamic("videoCaption")(videoCaption.asInstanceOf[js.Any])
    if (videoCategoryId != null) __obj.updateDynamic("videoCategoryId")(videoCategoryId.asInstanceOf[js.Any])
    if (videoDefinition != null) __obj.updateDynamic("videoDefinition")(videoDefinition.asInstanceOf[js.Any])
    if (videoDimension != null) __obj.updateDynamic("videoDimension")(videoDimension.asInstanceOf[js.Any])
    if (videoDuration != null) __obj.updateDynamic("videoDuration")(videoDuration.asInstanceOf[js.Any])
    if (videoEmbeddable != null) __obj.updateDynamic("videoEmbeddable")(videoEmbeddable.asInstanceOf[js.Any])
    if (videoLicense != null) __obj.updateDynamic("videoLicense")(videoLicense.asInstanceOf[js.Any])
    if (videoSyndicated != null) __obj.updateDynamic("videoSyndicated")(videoSyndicated.asInstanceOf[js.Any])
    if (videoType != null) __obj.updateDynamic("videoType")(videoType.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonChannelType]
  }
}

