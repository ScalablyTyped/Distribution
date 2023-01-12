package typings.formatcoords

import typings.formatcoords.mod.CoordsFormatOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait FnCall extends StObject {
    
    def apply(): String = js.native
    def apply(formatString: String): String = js.native
    def apply(formatString: String, latLonSeparator: String): String = js.native
    def apply(formatString: String, options: CoordsFormatOptions): String = js.native
    def apply(formatString: Unit, options: CoordsFormatOptions): String = js.native
    def apply(options: CoordsFormatOptions): String = js.native
  }
  
  trait Lat extends StObject {
    
    var lat: Double
    
    var lng: Double
  }
  object Lat {
    
    inline def apply(lat: Double, lng: Double): Lat = {
      val __obj = js.Dynamic.literal(lat = lat.asInstanceOf[js.Any], lng = lng.asInstanceOf[js.Any])
      __obj.asInstanceOf[Lat]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Lat] (val x: Self) extends AnyVal {
      
      inline def setLat(value: Double): Self = StObject.set(x, "lat", value.asInstanceOf[js.Any])
      
      inline def setLng(value: Double): Self = StObject.set(x, "lng", value.asInstanceOf[js.Any])
    }
  }
}
