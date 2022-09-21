package typings.googleMaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The representation of a panorama returned from the provider defined using
  * <code>registerPanoProvider</code>.
  */
trait StreetViewPanoramaData extends StObject {
  
  /**
    * Specifies the copyright text for this panorama.
    */
  var copyright: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the year and month in which the imagery in this panorama was
    * acquired. The date string is in the form YYYY-MM.
    */
  var imageDate: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the navigational links to adjacent panoramas.
    */
  var links: js.UndefOr[js.Array[StreetViewLink]] = js.undefined
  
  /**
    * Specifies the location meta-data for this panorama.
    */
  var location: js.UndefOr[StreetViewLocation] = js.undefined
  
  /**
    * Specifies the custom tiles for this panorama.
    */
  var tiles: StreetViewTileData
}
object StreetViewPanoramaData {
  
  inline def apply(tiles: StreetViewTileData): StreetViewPanoramaData = {
    val __obj = js.Dynamic.literal(tiles = tiles.asInstanceOf[js.Any])
    __obj.asInstanceOf[StreetViewPanoramaData]
  }
  
  extension [Self <: StreetViewPanoramaData](x: Self) {
    
    inline def setCopyright(value: String): Self = StObject.set(x, "copyright", value.asInstanceOf[js.Any])
    
    inline def setCopyrightUndefined: Self = StObject.set(x, "copyright", js.undefined)
    
    inline def setImageDate(value: String): Self = StObject.set(x, "imageDate", value.asInstanceOf[js.Any])
    
    inline def setImageDateUndefined: Self = StObject.set(x, "imageDate", js.undefined)
    
    inline def setLinks(value: js.Array[StreetViewLink]): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
    
    inline def setLinksUndefined: Self = StObject.set(x, "links", js.undefined)
    
    inline def setLinksVarargs(value: StreetViewLink*): Self = StObject.set(x, "links", js.Array(value*))
    
    inline def setLocation(value: StreetViewLocation): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setTiles(value: StreetViewTileData): Self = StObject.set(x, "tiles", value.asInstanceOf[js.Any])
  }
}
