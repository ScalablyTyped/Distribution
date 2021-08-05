package typings.gapiYoutube.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChannelIdKind extends StObject {
  
  /**
    * The ID that YouTube uses to uniquely identify the channel, if the recommended resource is a channel. This property is only present if the resourceId.kind is youtube#channel.
    */
  var channelId: String
  
  /**
    * The type of the API resource.
    */
  var kind: String
  
  /**
    * The ID that YouTube uses to uniquely identify the video, if the recommended resource is a video. This property is only present if the resourceId.kind is youtube#video.
    */
  var videoId: String
}
object ChannelIdKind {
  
  inline def apply(channelId: String, kind: String, videoId: String): ChannelIdKind = {
    val __obj = js.Dynamic.literal(channelId = channelId.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], videoId = videoId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelIdKind]
  }
  
  extension [Self <: ChannelIdKind](x: Self) {
    
    inline def setChannelId(value: String): Self = StObject.set(x, "channelId", value.asInstanceOf[js.Any])
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setVideoId(value: String): Self = StObject.set(x, "videoId", value.asInstanceOf[js.Any])
  }
}
