package typings.gapiYoutube.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Type extends StObject {
  
  /**
    * The promoted items type.
    */
  var `type`: String
  
  /**
    * If the promoted item represents a video, then this value is present and identifies the YouTube ID that YouTube assigned to identify that video. This field is only present if the type propertys value is video.
    */
  var videoId: String
}
object Type {
  
  @scala.inline
  def apply(`type`: String, videoId: String): Type = {
    val __obj = js.Dynamic.literal(videoId = videoId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type]
  }
  
  @scala.inline
  implicit class TypeMutableBuilder[Self <: Type] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideoId(value: String): Self = StObject.set(x, "videoId", value.asInstanceOf[js.Any])
  }
}
