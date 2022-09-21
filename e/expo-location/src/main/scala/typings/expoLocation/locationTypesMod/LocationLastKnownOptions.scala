package typings.expoLocation.locationTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LocationLastKnownOptions extends StObject {
  
  /**
    * A number of milliseconds after which the last known location starts to be invalid and thus
    * `null` is returned.
    */
  var maxAge: js.UndefOr[Double] = js.undefined
  
  /**
    * The maximum radius of uncertainty for the location, measured in meters. If the last known
    * location's accuracy radius is bigger (less accurate) then `null` is returned.
    */
  var requiredAccuracy: js.UndefOr[Double] = js.undefined
}
object LocationLastKnownOptions {
  
  inline def apply(): LocationLastKnownOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocationLastKnownOptions]
  }
  
  extension [Self <: LocationLastKnownOptions](x: Self) {
    
    inline def setMaxAge(value: Double): Self = StObject.set(x, "maxAge", value.asInstanceOf[js.Any])
    
    inline def setMaxAgeUndefined: Self = StObject.set(x, "maxAge", js.undefined)
    
    inline def setRequiredAccuracy(value: Double): Self = StObject.set(x, "requiredAccuracy", value.asInstanceOf[js.Any])
    
    inline def setRequiredAccuracyUndefined: Self = StObject.set(x, "requiredAccuracy", js.undefined)
  }
}
