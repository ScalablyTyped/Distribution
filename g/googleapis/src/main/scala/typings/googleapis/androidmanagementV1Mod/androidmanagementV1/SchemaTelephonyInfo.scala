package typings.googleapis.androidmanagementV1Mod.androidmanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTelephonyInfo extends StObject {
  
  /**
    * The carrier name associated with this SIM card.
    */
  var carrierName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The phone number associated with this SIM card.
    */
  var phoneNumber: js.UndefOr[String | Null] = js.undefined
}
object SchemaTelephonyInfo {
  
  inline def apply(): SchemaTelephonyInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTelephonyInfo]
  }
  
  extension [Self <: SchemaTelephonyInfo](x: Self) {
    
    inline def setCarrierName(value: String): Self = StObject.set(x, "carrierName", value.asInstanceOf[js.Any])
    
    inline def setCarrierNameNull: Self = StObject.set(x, "carrierName", null)
    
    inline def setCarrierNameUndefined: Self = StObject.set(x, "carrierName", js.undefined)
    
    inline def setPhoneNumber(value: String): Self = StObject.set(x, "phoneNumber", value.asInstanceOf[js.Any])
    
    inline def setPhoneNumberNull: Self = StObject.set(x, "phoneNumber", null)
    
    inline def setPhoneNumberUndefined: Self = StObject.set(x, "phoneNumber", js.undefined)
  }
}
