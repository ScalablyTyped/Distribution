package typings.googleMaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImageMapTypeOptions extends StObject {
  
  /**
    * Alt text to display when this MapType&#39;s button is hovered over in the
    * MapTypeControl.
    */
  var alt: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Returns a string (URL) for given tile coordinate (x, y) and zoom level.
    */
  var getTileUrl: js.UndefOr[(js.Function2[/* a */ Point, /* b */ Double, String | Null]) | Null] = js.undefined
  
  /**
    * The maximum zoom level for the map when displaying this MapType.
    */
  var maxZoom: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The minimum zoom level for the map when displaying this MapType.
    * Optional.
    */
  var minZoom: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Name to display in the MapTypeControl.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The opacity to apply to the tiles. The opacity should be specified as a
    * float value between 0 and 1.0, where 0 is fully transparent and 1 is
    * fully opaque.
    */
  var opacity: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The tile size.
    */
  var tileSize: js.UndefOr[Size | Null] = js.undefined
}
object ImageMapTypeOptions {
  
  inline def apply(): ImageMapTypeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageMapTypeOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ImageMapTypeOptions] (val x: Self) extends AnyVal {
    
    inline def setAlt(value: String): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
    
    inline def setAltNull: Self = StObject.set(x, "alt", null)
    
    inline def setAltUndefined: Self = StObject.set(x, "alt", js.undefined)
    
    inline def setGetTileUrl(value: (/* a */ Point, /* b */ Double) => String | Null): Self = StObject.set(x, "getTileUrl", js.Any.fromFunction2(value))
    
    inline def setGetTileUrlNull: Self = StObject.set(x, "getTileUrl", null)
    
    inline def setGetTileUrlUndefined: Self = StObject.set(x, "getTileUrl", js.undefined)
    
    inline def setMaxZoom(value: Double): Self = StObject.set(x, "maxZoom", value.asInstanceOf[js.Any])
    
    inline def setMaxZoomNull: Self = StObject.set(x, "maxZoom", null)
    
    inline def setMaxZoomUndefined: Self = StObject.set(x, "maxZoom", js.undefined)
    
    inline def setMinZoom(value: Double): Self = StObject.set(x, "minZoom", value.asInstanceOf[js.Any])
    
    inline def setMinZoomNull: Self = StObject.set(x, "minZoom", null)
    
    inline def setMinZoomUndefined: Self = StObject.set(x, "minZoom", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setOpacityNull: Self = StObject.set(x, "opacity", null)
    
    inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    inline def setTileSize(value: Size): Self = StObject.set(x, "tileSize", value.asInstanceOf[js.Any])
    
    inline def setTileSizeNull: Self = StObject.set(x, "tileSize", null)
    
    inline def setTileSizeUndefined: Self = StObject.set(x, "tileSize", js.undefined)
  }
}
