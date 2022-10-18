package typings.geolib.anon

import typings.geolib.esTypesMod.GeolibAltitudeInputValue
import typings.geolib.esTypesMod.GeolibInputAltitude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Alt
  extends StObject
     with GeolibInputAltitude {
  
  var alt: js.UndefOr[GeolibAltitudeInputValue] = js.undefined
}
object Alt {
  
  inline def apply(): Alt = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Alt]
  }
  
  extension [Self <: Alt](x: Self) {
    
    inline def setAlt(value: GeolibAltitudeInputValue): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
    
    inline def setAltUndefined: Self = StObject.set(x, "alt", js.undefined)
  }
}
