package typings.expoLocation.locationTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LocationLastKnownOptions extends StObject {
  
  /**
    * Maximum age of the location in miliseconds.
    */
  var maxAge: js.UndefOr[Double] = js.undefined
  
  /**
    * Maximum radius of horizontal accuracy in meters.
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
