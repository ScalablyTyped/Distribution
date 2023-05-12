package typings.googleMaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MapElementOptions extends StObject {
  
  /**
    * The initial Map center.
    */
  var center: js.UndefOr[Null | LatLng | LatLngLiteral] = js.undefined
  
  /**
    * The <a
    * href="https://developers.google.com/maps/documentation/get-map-id">Map
    * ID</a> of the map. This parameter cannot be set or changed after a map is
    * instantiated.
    */
  var mapId: js.UndefOr[Null | String] = js.undefined
  
  /**
    * The initial Map zoom level. Valid zoom values are numbers from zero up to
    * the supported <a
    * href="https://developers.google.com/maps/documentation/javascript/maxzoom">maximum
    * zoom level</a>. Larger zoom values correspond to a higher resolution.
    */
  var zoom: js.UndefOr[Null | Double] = js.undefined
}
object MapElementOptions {
  
  inline def apply(): MapElementOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MapElementOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MapElementOptions] (val x: Self) extends AnyVal {
    
    inline def setCenter(value: LatLng | LatLngLiteral): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
    
    inline def setCenterNull: Self = StObject.set(x, "center", null)
    
    inline def setCenterUndefined: Self = StObject.set(x, "center", js.undefined)
    
    inline def setMapId(value: String): Self = StObject.set(x, "mapId", value.asInstanceOf[js.Any])
    
    inline def setMapIdNull: Self = StObject.set(x, "mapId", null)
    
    inline def setMapIdUndefined: Self = StObject.set(x, "mapId", js.undefined)
    
    inline def setZoom(value: Double): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
    
    inline def setZoomNull: Self = StObject.set(x, "zoom", null)
    
    inline def setZoomUndefined: Self = StObject.set(x, "zoom", js.undefined)
  }
}
