package typings.googleapis.alertcenterV1beta1Mod.alertcenterV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaLoginDetails extends StObject {
  
  /**
    * Optional. The human-readable IP address (for example, `11.22.33.44`) that is associated with the warning event.
    */
  var ipAddress: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. The successful login time that is associated with the warning event. This isn't present for blocked login attempts.
    */
  var loginTime: js.UndefOr[String | Null] = js.undefined
}
object SchemaLoginDetails {
  
  inline def apply(): SchemaLoginDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLoginDetails]
  }
  
  extension [Self <: SchemaLoginDetails](x: Self) {
    
    inline def setIpAddress(value: String): Self = StObject.set(x, "ipAddress", value.asInstanceOf[js.Any])
    
    inline def setIpAddressNull: Self = StObject.set(x, "ipAddress", null)
    
    inline def setIpAddressUndefined: Self = StObject.set(x, "ipAddress", js.undefined)
    
    inline def setLoginTime(value: String): Self = StObject.set(x, "loginTime", value.asInstanceOf[js.Any])
    
    inline def setLoginTimeNull: Self = StObject.set(x, "loginTime", null)
    
    inline def setLoginTimeUndefined: Self = StObject.set(x, "loginTime", js.undefined)
  }
}
