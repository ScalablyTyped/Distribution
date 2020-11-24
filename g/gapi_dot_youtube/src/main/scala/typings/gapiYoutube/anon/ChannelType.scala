package typings.gapiYoutube.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChannelType extends js.Object {
  
  /**
    * The channelId parameter indicates that the API response should only contain resources created by the channel
    */
  var channelId: js.UndefOr[String] = js.native
  
  /**
    * The channelType parameter lets you restrict a search to a particular type of channel.
    */
  var channelType: js.UndefOr[String] = js.native
  
  /**
    * The forContentOwner parameter restricts the search to only retrieve resources owned by the content owner specified by the onBehalfOfContentOwner parameter. The user must be authenticated as a CMS account linked to the specified content owner and onBehalfOfContentOwner must be provided.
    */
  var forContentOwner: js.UndefOr[Boolean] = js.native
  
  /**
    * The forMine parameter restricts the search to only retrieve videos owned by the authenticated user.
    */
  var forMine: js.UndefOr[Boolean] = js.native
  
  /**
    * The maxResults parameter specifies the maximum number of items that should be returned in the result set.
    */
  var maxResults: js.UndefOr[Double] = js.native
  
  /**
    * The onBehalfOfContentOwner parameter indicates that the authenticated user is acting on behalf of the content owner specified in the parameter value. This parameter is intended for YouTube content partners that own and manage many different YouTube channels. It allows content owners to authenticate once and get access to all their video and channel data, without having to provide authentication credentials for each individual channel. The actual CMS account that the user authenticates with needs to be linked to the specified YouTube content owner.
    */
  var onBehalfOfContentOwner: js.UndefOr[String] = js.native
  
  /**
    * The order parameter specifies the method that will be used to order resources in the API response.
    */
  var order: js.UndefOr[String] = js.native
  
  /**
    * The pageToken parameter identifies a specific page in the result set that should be returned. In an API response, the nextPageToken and prevPageToken properties identify other pages that could be retrieved.
    */
  var pageToken: js.UndefOr[String] = js.native
  
  /**
    * The part parameter specifies a comma-separated list of one or more search resource properties that the API response will include. The part names that you can include in the parameter value are id and snippet. If the parameter identifies a property that contains child properties, the child properties will be included in the response. For example, in a search result, the snippet property contains other properties that identify the result's title, description, and so forth. If you set part=snippet, the API response will also contain all of those nested properties.
    */
  var part: String = js.native
  
  /**
    * The publishedAfter parameter indicates that the API response should only contain resources created after the specified time. The value is an RFC 3339 formatted date-time value (1970-01-01T00:00:00Z).
    */
  var publishedAfter: js.UndefOr[String] = js.native
  
  /**
    * The publishedBefore parameter indicates that the API response should only contain resources created before the specified time. The value is an RFC 3339 formatted date-time value (1970-01-01T00:00:00Z).
    */
  var publishedBefore: js.UndefOr[String] = js.native
  
  /**
    * The q parameter specifies the query term to search for.
    */
  var q: js.UndefOr[String] = js.native
  
  /**
    * The regionCode parameter instructs the API to return search results for the specified country. The parameter value is an ISO 3166-1 alpha-2 country code.
    */
  var regionCode: js.UndefOr[String] = js.native
  
  /**
    * The relatedToVideoId parameter retrieves a list of videos that are related to the video that the parameter value identifies. The parameter value must be set to a YouTube video ID and, if you are using this parameter, the type parameter must be set to video.
    */
  var relatedToVideoId: js.UndefOr[String] = js.native
  
  /**
    * The safeSearch parameter indicates whether the search results should include restricted content as well as standard content.
    */
  var safeSearch: js.UndefOr[String] = js.native
  
  /**
    * The topicId parameter indicates that the API response should only contain resources associated with the specified topic. The value identifies a Freebase topic ID.
    */
  var topicId: js.UndefOr[String] = js.native
  
  /**
    * The type parameter restricts a search query to only retrieve a particular type of resource.
    */
  var `type`: js.UndefOr[String] = js.native
  
  /**
    * The videoCaption parameter indicates whether the API should filter video search results based on whether they have captions.
    */
  var videoCaption: js.UndefOr[String] = js.native
  
  /**
    * The videoCategoryId parameter filters video search results based on their category.
    */
  var videoCategoryId: js.UndefOr[String] = js.native
  
  /**
    * The videoDefinition parameter lets you restrict a search to only include either high definition (HD) or standard definition (SD) videos. HD videos are available for playback in at least 720p, though higher resolutions, like 1080p, might also be available.
    */
  var videoDefinition: js.UndefOr[String] = js.native
  
  /**
    * The videoDimension parameter lets you restrict a search to only retrieve 2D or 3D videos.
    */
  var videoDimension: js.UndefOr[String] = js.native
  
  /**
    * The videoDuration parameter filters video search results based on their duration.
    */
  var videoDuration: js.UndefOr[String] = js.native
  
  /**
    * The videoEmbeddable parameter lets you to restrict a search to only videos that can be embedded into a webpage.
    */
  var videoEmbeddable: js.UndefOr[String] = js.native
  
  /**
    * The videoLicense parameter filters search results to only include videos with a particular license. YouTube lets video uploaders choose to attach either the Creative Commons license or the standard YouTube license to each of their videos.
    */
  var videoLicense: js.UndefOr[String] = js.native
  
  /**
    * The videoSyndicated parameter lets you to restrict a search to only videos that can be played outside youtube.com.
    */
  var videoSyndicated: js.UndefOr[String] = js.native
  
  /**
    * The videoType parameter lets you restrict a search to a particular type of videos.
    */
  var videoType: js.UndefOr[String] = js.native
}
object ChannelType {
  
  @scala.inline
  def apply(part: String): ChannelType = {
    val __obj = js.Dynamic.literal(part = part.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelType]
  }
  
  @scala.inline
  implicit class ChannelTypeOps[Self <: ChannelType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setPart(value: String): Self = this.set("part", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelId(value: String): Self = this.set("channelId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChannelId: Self = this.set("channelId", js.undefined)
    
    @scala.inline
    def setChannelType(value: String): Self = this.set("channelType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChannelType: Self = this.set("channelType", js.undefined)
    
    @scala.inline
    def setForContentOwner(value: Boolean): Self = this.set("forContentOwner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForContentOwner: Self = this.set("forContentOwner", js.undefined)
    
    @scala.inline
    def setForMine(value: Boolean): Self = this.set("forMine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForMine: Self = this.set("forMine", js.undefined)
    
    @scala.inline
    def setMaxResults(value: Double): Self = this.set("maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxResults: Self = this.set("maxResults", js.undefined)
    
    @scala.inline
    def setOnBehalfOfContentOwner(value: String): Self = this.set("onBehalfOfContentOwner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnBehalfOfContentOwner: Self = this.set("onBehalfOfContentOwner", js.undefined)
    
    @scala.inline
    def setOrder(value: String): Self = this.set("order", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrder: Self = this.set("order", js.undefined)
    
    @scala.inline
    def setPageToken(value: String): Self = this.set("pageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageToken: Self = this.set("pageToken", js.undefined)
    
    @scala.inline
    def setPublishedAfter(value: String): Self = this.set("publishedAfter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePublishedAfter: Self = this.set("publishedAfter", js.undefined)
    
    @scala.inline
    def setPublishedBefore(value: String): Self = this.set("publishedBefore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePublishedBefore: Self = this.set("publishedBefore", js.undefined)
    
    @scala.inline
    def setQ(value: String): Self = this.set("q", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQ: Self = this.set("q", js.undefined)
    
    @scala.inline
    def setRegionCode(value: String): Self = this.set("regionCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegionCode: Self = this.set("regionCode", js.undefined)
    
    @scala.inline
    def setRelatedToVideoId(value: String): Self = this.set("relatedToVideoId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRelatedToVideoId: Self = this.set("relatedToVideoId", js.undefined)
    
    @scala.inline
    def setSafeSearch(value: String): Self = this.set("safeSearch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSafeSearch: Self = this.set("safeSearch", js.undefined)
    
    @scala.inline
    def setTopicId(value: String): Self = this.set("topicId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTopicId: Self = this.set("topicId", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setVideoCaption(value: String): Self = this.set("videoCaption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVideoCaption: Self = this.set("videoCaption", js.undefined)
    
    @scala.inline
    def setVideoCategoryId(value: String): Self = this.set("videoCategoryId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVideoCategoryId: Self = this.set("videoCategoryId", js.undefined)
    
    @scala.inline
    def setVideoDefinition(value: String): Self = this.set("videoDefinition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVideoDefinition: Self = this.set("videoDefinition", js.undefined)
    
    @scala.inline
    def setVideoDimension(value: String): Self = this.set("videoDimension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVideoDimension: Self = this.set("videoDimension", js.undefined)
    
    @scala.inline
    def setVideoDuration(value: String): Self = this.set("videoDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVideoDuration: Self = this.set("videoDuration", js.undefined)
    
    @scala.inline
    def setVideoEmbeddable(value: String): Self = this.set("videoEmbeddable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVideoEmbeddable: Self = this.set("videoEmbeddable", js.undefined)
    
    @scala.inline
    def setVideoLicense(value: String): Self = this.set("videoLicense", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVideoLicense: Self = this.set("videoLicense", js.undefined)
    
    @scala.inline
    def setVideoSyndicated(value: String): Self = this.set("videoSyndicated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVideoSyndicated: Self = this.set("videoSyndicated", js.undefined)
    
    @scala.inline
    def setVideoType(value: String): Self = this.set("videoType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVideoType: Self = this.set("videoType", js.undefined)
  }
}
