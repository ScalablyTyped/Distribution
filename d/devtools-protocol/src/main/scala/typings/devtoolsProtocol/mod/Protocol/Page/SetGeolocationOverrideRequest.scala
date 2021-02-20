package typings.devtoolsProtocol.mod.Protocol.Page

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SetGeolocationOverrideRequest extends StObject {
  
  /**
    * Mock accuracy
    */
  var accuracy: js.UndefOr[Double] = js.native
  
  /**
    * Mock latitude
    */
  var latitude: js.UndefOr[Double] = js.native
  
  /**
    * Mock longitude
    */
  var longitude: js.UndefOr[Double] = js.native
}
object SetGeolocationOverrideRequest {
  
  @scala.inline
  def apply(): SetGeolocationOverrideRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SetGeolocationOverrideRequest]
  }
  
  @scala.inline
  implicit class SetGeolocationOverrideRequestMutableBuilder[Self <: SetGeolocationOverrideRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccuracy(value: Double): Self = StObject.set(x, "accuracy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccuracyUndefined: Self = StObject.set(x, "accuracy", js.undefined)
    
    @scala.inline
    def setLatitude(value: Double): Self = StObject.set(x, "latitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLatitudeUndefined: Self = StObject.set(x, "latitude", js.undefined)
    
    @scala.inline
    def setLongitude(value: Double): Self = StObject.set(x, "longitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLongitudeUndefined: Self = StObject.set(x, "longitude", js.undefined)
  }
}
