package typings.geolib.anon

import typings.geolib.esTypesMod.GeolibAltitudeInputValue
import typings.geolib.esTypesMod.GeolibInputAltitude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Elev
  extends StObject
     with GeolibInputAltitude {
  
  var elev: js.UndefOr[GeolibAltitudeInputValue] = js.undefined
}
object Elev {
  
  inline def apply(): Elev = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Elev]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Elev] (val x: Self) extends AnyVal {
    
    inline def setElev(value: GeolibAltitudeInputValue): Self = StObject.set(x, "elev", value.asInstanceOf[js.Any])
    
    inline def setElevUndefined: Self = StObject.set(x, "elev", js.undefined)
  }
}
