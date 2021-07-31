package typings.geolib.anon

import typings.geolib.typesMod.GeolibAltitudeInputValue
import typings.geolib.typesMod.GeolibInputAltitude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `0`
  extends StObject
     with GeolibInputAltitude {
  
  var altitude: js.UndefOr[GeolibAltitudeInputValue] = js.undefined
}
object `0` {
  
  @scala.inline
  def apply(): `0` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`0`]
  }
  
  @scala.inline
  implicit class `0MutableBuilder`[Self <: `0`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAltitude(value: GeolibAltitudeInputValue): Self = StObject.set(x, "altitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAltitudeUndefined: Self = StObject.set(x, "altitude", js.undefined)
  }
}
