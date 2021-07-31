package typings.gapiYoutube.anon

import typings.gapiYoutube.GoogleApiYouTubeThumbnailResource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Thumbnails extends StObject {
  
  /**
    * The value that YouTube uses to uniquely identify the channel that published the resource that the search result identifies.
    */
  var channelId: String
  
  /**
    * The title of the channel that published the resource that the search result identifies.
    */
  var channelTitle: String
  
  /**
    * A description of the search result.
    */
  var description: String
  
  /**
    * The creation date and time of the resource that the search result identifies. The value is specified in ISO 8601 (YYYY-MM-DDThh:mm:ss.sZ) format.
    */
  var publishedAt: String
  
  /**
    * A map of thumbnail images associated with the search result. For each object in the map, the key is the name of the thumbnail image, and the value is an object that contains other information about the thumbnail.
    */
  var thumbnails: GoogleApiYouTubeThumbnailResource
  
  /**
    * The title of the search result.
    */
  var title: String
}
object Thumbnails {
  
  @scala.inline
  def apply(
    channelId: String,
    channelTitle: String,
    description: String,
    publishedAt: String,
    thumbnails: GoogleApiYouTubeThumbnailResource,
    title: String
  ): Thumbnails = {
    val __obj = js.Dynamic.literal(channelId = channelId.asInstanceOf[js.Any], channelTitle = channelTitle.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], publishedAt = publishedAt.asInstanceOf[js.Any], thumbnails = thumbnails.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Thumbnails]
  }
  
  @scala.inline
  implicit class ThumbnailsMutableBuilder[Self <: Thumbnails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChannelId(value: String): Self = StObject.set(x, "channelId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelTitle(value: String): Self = StObject.set(x, "channelTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublishedAt(value: String): Self = StObject.set(x, "publishedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumbnails(value: GoogleApiYouTubeThumbnailResource): Self = StObject.set(x, "thumbnails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
