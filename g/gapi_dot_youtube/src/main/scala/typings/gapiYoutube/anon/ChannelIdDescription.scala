package typings.gapiYoutube.anon

import typings.gapiYoutube.GoogleApiYouTubeThumbnailResource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChannelIdDescription extends StObject {
  
  var channelId: String
  
  var description: String
  
  var thumbnails: GoogleApiYouTubeThumbnailResource
  
  var title: String
}
object ChannelIdDescription {
  
  inline def apply(
    channelId: String,
    description: String,
    thumbnails: GoogleApiYouTubeThumbnailResource,
    title: String
  ): ChannelIdDescription = {
    val __obj = js.Dynamic.literal(channelId = channelId.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], thumbnails = thumbnails.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelIdDescription]
  }
  
  extension [Self <: ChannelIdDescription](x: Self) {
    
    inline def setChannelId(value: String): Self = StObject.set(x, "channelId", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setThumbnails(value: GoogleApiYouTubeThumbnailResource): Self = StObject.set(x, "thumbnails", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
