package typings.gapiYoutube.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Rating extends StObject {
  
  /**
    * The rating that the authorized user gave to the video.
    */
  var rating: String
  
  /**
    * The ID that YouTube uses to uniquely identify the video.
    */
  var videoId: String
}
object Rating {
  
  inline def apply(rating: String, videoId: String): Rating = {
    val __obj = js.Dynamic.literal(rating = rating.asInstanceOf[js.Any], videoId = videoId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rating]
  }
  
  extension [Self <: Rating](x: Self) {
    
    inline def setRating(value: String): Self = StObject.set(x, "rating", value.asInstanceOf[js.Any])
    
    inline def setVideoId(value: String): Self = StObject.set(x, "videoId", value.asInstanceOf[js.Any])
  }
}
