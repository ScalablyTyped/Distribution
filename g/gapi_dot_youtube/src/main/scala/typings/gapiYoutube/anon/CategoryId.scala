package typings.gapiYoutube.anon

import typings.gapiYoutube.GoogleApiYouTubeThumbnailResource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CategoryId extends js.Object {
  /**
    * The YouTube video category associated with the video.
    */
  var categoryId: String = js.native
  /**
    * The ID that YouTube uses to uniquely identify the channel that the video was uploaded to.
    */
  var channelId: String = js.native
  /**
    * Channel title for the channel that the video belongs to.
    */
  var channelTitle: String = js.native
  /**
    * The videos description.
    */
  var description: String = js.native
  /**
    * The date and time that the video was uploaded. The value is specified in ISO 8601 (YYYY-MM-DDThh:mm:ss.sZ) format.
    */
  var publishedAt: String = js.native
  /**
    * A list of keyword tags associated with the video. Tags may contain spaces. This field is only visible to the videos uploader.
    */
  var tags: js.Array[String] = js.native
  /**
    * A map of thumbnail images associated with the video. For each object in the map, the key is the name of the thumbnail image, and the value is an object that contains other information about the thumbnail.
    */
  var thumbnails: GoogleApiYouTubeThumbnailResource = js.native
  /**
    * The videos title.
    */
  var title: String = js.native
}

object CategoryId {
  @scala.inline
  def apply(
    categoryId: String,
    channelId: String,
    channelTitle: String,
    description: String,
    publishedAt: String,
    tags: js.Array[String],
    thumbnails: GoogleApiYouTubeThumbnailResource,
    title: String
  ): CategoryId = {
    val __obj = js.Dynamic.literal(categoryId = categoryId.asInstanceOf[js.Any], channelId = channelId.asInstanceOf[js.Any], channelTitle = channelTitle.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], publishedAt = publishedAt.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], thumbnails = thumbnails.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[CategoryId]
  }
  @scala.inline
  implicit class CategoryIdOps[Self <: CategoryId] (val x: Self) extends AnyVal {
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
    def setCategoryId(value: String): Self = this.set("categoryId", value.asInstanceOf[js.Any])
    @scala.inline
    def setChannelId(value: String): Self = this.set("channelId", value.asInstanceOf[js.Any])
    @scala.inline
    def setChannelTitle(value: String): Self = this.set("channelTitle", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def setPublishedAt(value: String): Self = this.set("publishedAt", value.asInstanceOf[js.Any])
    @scala.inline
    def setTagsVarargs(value: String*): Self = this.set("tags", js.Array(value :_*))
    @scala.inline
    def setTags(value: js.Array[String]): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def setThumbnails(value: GoogleApiYouTubeThumbnailResource): Self = this.set("thumbnails", value.asInstanceOf[js.Any])
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
  }
  
}

