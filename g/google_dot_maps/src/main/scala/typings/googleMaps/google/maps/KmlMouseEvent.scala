package typings.googleMaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The properties of a click event on a KML/KMZ or GeoRSS document.
  */
trait KmlMouseEvent extends StObject {
  
  /**
    * A <code>KmlFeatureData</code> object, containing information about the
    * clicked feature.
    */
  var featureData: KmlFeatureData | Null
  
  /**
    * The position at which to anchor an infowindow on the clicked feature.
    */
  var latLng: LatLng | Null
  
  /**
    * The offset to apply to an infowindow anchored on the clicked feature.
    */
  var pixelOffset: Size | Null
}
object KmlMouseEvent {
  
  inline def apply(): KmlMouseEvent = {
    val __obj = js.Dynamic.literal(featureData = null, latLng = null, pixelOffset = null)
    __obj.asInstanceOf[KmlMouseEvent]
  }
  
  extension [Self <: KmlMouseEvent](x: Self) {
    
    inline def setFeatureData(value: KmlFeatureData): Self = StObject.set(x, "featureData", value.asInstanceOf[js.Any])
    
    inline def setFeatureDataNull: Self = StObject.set(x, "featureData", null)
    
    inline def setLatLng(value: LatLng): Self = StObject.set(x, "latLng", value.asInstanceOf[js.Any])
    
    inline def setLatLngNull: Self = StObject.set(x, "latLng", null)
    
    inline def setPixelOffset(value: Size): Self = StObject.set(x, "pixelOffset", value.asInstanceOf[js.Any])
    
    inline def setPixelOffsetNull: Self = StObject.set(x, "pixelOffset", null)
  }
}
