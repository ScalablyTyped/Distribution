package typings.googleMaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StreetViewPanoRequest extends StObject {
  
  /**
    * Specifies the pano ID to search for.
    */
  var pano: js.UndefOr[Null | String] = js.undefined
}
object StreetViewPanoRequest {
  
  inline def apply(): StreetViewPanoRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StreetViewPanoRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StreetViewPanoRequest] (val x: Self) extends AnyVal {
    
    inline def setPano(value: String): Self = StObject.set(x, "pano", value.asInstanceOf[js.Any])
    
    inline def setPanoNull: Self = StObject.set(x, "pano", null)
    
    inline def setPanoUndefined: Self = StObject.set(x, "pano", js.undefined)
  }
}
