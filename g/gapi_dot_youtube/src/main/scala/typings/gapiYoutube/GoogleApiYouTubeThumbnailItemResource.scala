package typings.gapiYoutube

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleApiYouTubeThumbnailItemResource extends StObject {
  
  /**
    * The images height.
    */
  var height: Double
  
  /**
    * The images URL.
    */
  var url: String
  
  /**
    * The images width.
    */
  var width: Double
}
object GoogleApiYouTubeThumbnailItemResource {
  
  inline def apply(height: Double, url: String, width: Double): GoogleApiYouTubeThumbnailItemResource = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleApiYouTubeThumbnailItemResource]
  }
  
  extension [Self <: GoogleApiYouTubeThumbnailItemResource](x: Self) {
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
