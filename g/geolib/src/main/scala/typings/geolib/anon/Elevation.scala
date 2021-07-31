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
  
  @scala.inline
  def apply(): Elevation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Elevation]
  }
  
  @scala.inline
  implicit class ElevationMutableBuilder[Self <: Elevation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setElevation(value: GeolibAltitudeInputValue): Self = StObject.set(x, "elevation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElevationUndefined: Self = StObject.set(x, "elevation", js.undefined)
  }
}
