package typings.geolib.anon

import typings.geolib.typesMod.GeolibAltitudeInputValue
import typings.geolib.typesMod.GeolibInputAltitude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Elevation
  extends StObject
     with GeolibInputAltitude {
  
  var elevation: js.UndefOr[GeolibAltitudeInputValue] = js.undefined
}
object Elevation {
  
  inline def apply(): Elevation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Elevation]
  }
  
  extension [Self <: Elevation](x: Self) {
    
    inline def setElevation(value: GeolibAltitudeInputValue): Self = StObject.set(x, "elevation", value.asInstanceOf[js.Any])
    
    inline def setElevationUndefined: Self = StObject.set(x, "elevation", js.undefined)
  }
}
