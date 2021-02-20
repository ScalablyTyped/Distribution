package typings.gapiYoutube.anon

import typings.gapiYoutube.GoogleApiYouTubeThumbnailResource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChannelId extends StObject {
  
  /**
    * The ID that YouTube uses to uniquely identify the channel associated with the activity.
    */
  var channelId: String = js.native
  
  /**
    * Channel title for the channel responsible for this activity
    */
  var channelTitle: String = js.native
  
  /**
    * The description of the resource primarily associated with the activity.
    */
  var description: String = js.native
  
  /**
    * The group ID associated with the activity.
    */
  var groupId: String = js.native
  
  /**
    * The date and time that the activity occurred. The value is specified in ISO 8601 (YYYY-MM-DDThh:mm:ss.sZ) format.
    */
  var publishedAt: String = js.native
  
  /**
    * A map of thumbnail images associated with the resource that is primarily associated with the activity.
    */
  var thumbnails: GoogleApiYouTubeThumbnailResource = js.native
  
  /**
    * The title of the resource primarily associated with the activity.
    */
  var title: String = js.native
  
  /**
    * The type of activity that the resource describes.
    */
  var `type`: String = js.native
}
object ChannelId {
  
  @scala.inline
  def apply(
    channelId: String,
    channelTitle: String,
    description: String,
    groupId: String,
    publishedAt: String,
    thumbnails: GoogleApiYouTubeThumbnailResource,
    title: String,
    `type`: String
  ): ChannelId = {
    val __obj = js.Dynamic.literal(channelId = channelId.asInstanceOf[js.Any], channelTitle = channelTitle.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], groupId = groupId.asInstanceOf[js.Any], publishedAt = publishedAt.asInstanceOf[js.Any], thumbnails = thumbnails.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelId]
  }
  
  @scala.inline
  implicit class ChannelIdMutableBuilder[Self <: ChannelId] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChannelId(value: String): Self = StObject.set(x, "channelId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelTitle(value: String): Self = StObject.set(x, "channelTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupId(value: String): Self = StObject.set(x, "groupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublishedAt(value: String): Self = StObject.set(x, "publishedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumbnails(value: GoogleApiYouTubeThumbnailResource): Self = StObject.set(x, "thumbnails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
