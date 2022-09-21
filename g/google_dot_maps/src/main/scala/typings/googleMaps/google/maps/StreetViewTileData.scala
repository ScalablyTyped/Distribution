package typings.googleMaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The properties of the tile set used in a Street View panorama.
  */
trait StreetViewTileData extends StObject {
  
  /**
    * The heading (in degrees) at the center of the panoramic tiles.
    */
  var centerHeading: Double
  
  /**
    * Gets the tile image URL for the specified tile.<br/> This is a custom
    * method which you must implement, to supply your custom tiles. The API
    * calls this method, supplying the following parameters:</br>
    * <code>pano</code> is the panorama ID of the Street View tile.<br/>
    * <code>tileZoom</code> is the zoom level of the tile.<br/>
    * <code>tileX</code> is the x-coordinate of the tile.<br/>
    * <code>tileY</code> is the y-coordinate of the tile.<br/> Your custom
    * method must return the URL for the tile image.<br/>
    */
  def getTileUrl(pano: String, tileZoom: Double, tileX: Double, tileY: Double): String
  
  /**
    * The size (in pixels) at which tiles will be rendered.
    */
  var tileSize: Size
  
  /**
    * The size (in pixels) of the whole panorama&#39;s &quot;world&quot;.
    */
  var worldSize: Size
}
object StreetViewTileData {
  
  inline def apply(
    centerHeading: Double,
    getTileUrl: (String, Double, Double, Double) => String,
    tileSize: Size,
    worldSize: Size
  ): StreetViewTileData = {
    val __obj = js.Dynamic.literal(centerHeading = centerHeading.asInstanceOf[js.Any], getTileUrl = js.Any.fromFunction4(getTileUrl), tileSize = tileSize.asInstanceOf[js.Any], worldSize = worldSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[StreetViewTileData]
  }
  
  extension [Self <: StreetViewTileData](x: Self) {
    
    inline def setCenterHeading(value: Double): Self = StObject.set(x, "centerHeading", value.asInstanceOf[js.Any])
    
    inline def setGetTileUrl(value: (String, Double, Double, Double) => String): Self = StObject.set(x, "getTileUrl", js.Any.fromFunction4(value))
    
    inline def setTileSize(value: Size): Self = StObject.set(x, "tileSize", value.asInstanceOf[js.Any])
    
    inline def setWorldSize(value: Size): Self = StObject.set(x, "worldSize", value.asInstanceOf[js.Any])
  }
}
