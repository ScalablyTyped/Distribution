package typings.googleMaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A <code>StreetViewPanoRequest</code> is used with the
  * <code>getPanorama</code> to find a panorama with a specified ID.
  */
trait StreetViewPanoRequest extends StObject {
  
  /**
    * Specifies the pano ID to search for.
    */
  var pano: js.UndefOr[String | Null] = js.undefined
}
object StreetViewPanoRequest {
  
  inline def apply(): StreetViewPanoRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StreetViewPanoRequest]
  }
  
  extension [Self <: StreetViewPanoRequest](x: Self) {
    
    inline def setPano(value: String): Self = StObject.set(x, "pano", value.asInstanceOf[js.Any])
    
    inline def setPanoNull: Self = StObject.set(x, "pano", null)
    
    inline def setPanoUndefined: Self = StObject.set(x, "pano", js.undefined)
  }
}
