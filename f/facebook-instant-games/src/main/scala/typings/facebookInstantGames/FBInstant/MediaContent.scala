package typings.facebookInstantGames.FBInstant

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Specify how we could get the content for the media.
  */
trait MediaContent extends StObject {
  
  /**
    * URL for the media that stores in the developers' server.
    */
  var url: String
}
object MediaContent {
  
  inline def apply(url: String): MediaContent = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaContent]
  }
  
  extension [Self <: MediaContent](x: Self) {
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
