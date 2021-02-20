package typings.expoLocation.locationTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LocationLastKnownOptions extends StObject {
  
  /**
    * Maximum age of the location in miliseconds.
    */
  var maxAge: js.UndefOr[Double] = js.native
  
  /**
    * Maximum radius of horizontal accuracy in meters.
    */
  var requiredAccuracy: js.UndefOr[Double] = js.native
}
object LocationLastKnownOptions {
  
  @scala.inline
  def apply(): LocationLastKnownOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocationLastKnownOptions]
  }
  
  @scala.inline
  implicit class LocationLastKnownOptionsMutableBuilder[Self <: LocationLastKnownOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxAge(value: Double): Self = StObject.set(x, "maxAge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxAgeUndefined: Self = StObject.set(x, "maxAge", js.undefined)
    
    @scala.inline
    def setRequiredAccuracy(value: Double): Self = StObject.set(x, "requiredAccuracy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequiredAccuracyUndefined: Self = StObject.set(x, "requiredAccuracy", js.undefined)
  }
}
