package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaInstallFailureEvent extends StObject {
  
  /**
    * The Android ID of the device. This field will always be present.
    */
  var deviceId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Additional details on the failure if applicable.
    */
  var failureDetails: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The reason for the installation failure. This field will always be present.
    */
  var failureReason: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The id of the product (e.g. "app:com.google.android.gm") for which the install failure event occured. This field will always be present.
    */
  var productId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The ID of the user. This field will always be present.
    */
  var userId: js.UndefOr[String | Null] = js.undefined
}
object SchemaInstallFailureEvent {
  
  inline def apply(): SchemaInstallFailureEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInstallFailureEvent]
  }
  
  extension [Self <: SchemaInstallFailureEvent](x: Self) {
    
    inline def setDeviceId(value: String): Self = StObject.set(x, "deviceId", value.asInstanceOf[js.Any])
    
    inline def setDeviceIdNull: Self = StObject.set(x, "deviceId", null)
    
    inline def setDeviceIdUndefined: Self = StObject.set(x, "deviceId", js.undefined)
    
    inline def setFailureDetails(value: String): Self = StObject.set(x, "failureDetails", value.asInstanceOf[js.Any])
    
    inline def setFailureDetailsNull: Self = StObject.set(x, "failureDetails", null)
    
    inline def setFailureDetailsUndefined: Self = StObject.set(x, "failureDetails", js.undefined)
    
    inline def setFailureReason(value: String): Self = StObject.set(x, "failureReason", value.asInstanceOf[js.Any])
    
    inline def setFailureReasonNull: Self = StObject.set(x, "failureReason", null)
    
    inline def setFailureReasonUndefined: Self = StObject.set(x, "failureReason", js.undefined)
    
    inline def setProductId(value: String): Self = StObject.set(x, "productId", value.asInstanceOf[js.Any])
    
    inline def setProductIdNull: Self = StObject.set(x, "productId", null)
    
    inline def setProductIdUndefined: Self = StObject.set(x, "productId", js.undefined)
    
    inline def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    
    inline def setUserIdNull: Self = StObject.set(x, "userId", null)
    
    inline def setUserIdUndefined: Self = StObject.set(x, "userId", js.undefined)
  }
}
