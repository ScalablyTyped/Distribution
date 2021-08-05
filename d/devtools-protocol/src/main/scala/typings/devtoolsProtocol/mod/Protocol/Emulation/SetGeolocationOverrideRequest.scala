package typings.devtoolsProtocol.mod.Protocol.Emulation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetGeolocationOverrideRequest extends StObject {
  
  /**
    * Mock accuracy
    */
  var accuracy: js.UndefOr[Double] = js.undefined
  
  /**
    * Mock latitude
    */
  var latitude: js.UndefOr[Double] = js.undefined
  
  /**
    * Mock longitude
    */
  var longitude: js.UndefOr[Double] = js.undefined
}
object SetGeolocationOverrideRequest {
  
  inline def apply(): SetGeolocationOverrideRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SetGeolocationOverrideRequest]
  }
  
  extension [Self <: SetGeolocationOverrideRequest](x: Self) {
    
    inline def setAccuracy(value: Double): Self = StObject.set(x, "accuracy", value.asInstanceOf[js.Any])
    
    inline def setAccuracyUndefined: Self = StObject.set(x, "accuracy", js.undefined)
    
    inline def setLatitude(value: Double): Self = StObject.set(x, "latitude", value.asInstanceOf[js.Any])
    
    inline def setLatitudeUndefined: Self = StObject.set(x, "latitude", js.undefined)
    
    inline def setLongitude(value: Double): Self = StObject.set(x, "longitude", value.asInstanceOf[js.Any])
    
    inline def setLongitudeUndefined: Self = StObject.set(x, "longitude", js.undefined)
  }
}
