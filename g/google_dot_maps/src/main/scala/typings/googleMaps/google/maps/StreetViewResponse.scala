package typings.googleMaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The response resolved for a Promise from {@link
  * google.maps.StreetViewService.getPanorama}.
  */
trait StreetViewResponse extends StObject {
  
  /**
    * The representation of a panorama.
    */
  var data: StreetViewPanoramaData
}
object StreetViewResponse {
  
  inline def apply(data: StreetViewPanoramaData): StreetViewResponse = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[StreetViewResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StreetViewResponse] (val x: Self) extends AnyVal {
    
    inline def setData(value: StreetViewPanoramaData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}
