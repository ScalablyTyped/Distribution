package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDeliveryMedium extends StObject {
  
  /**
    * Describes the medium the cent was sent/received. For example, if I receive an SMS via GV, the medium_type will be GV.
    */
  var mediumType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * In the case of multiple GV/native numbers, this defines the exact number to send from. It is used to differentiate mediums that have the same type, but different addresses (e.g. two android phones).
    */
  var selfPhone: js.UndefOr[SchemaVoicePhoneNumber] = js.undefined
}
object SchemaDeliveryMedium {
  
  inline def apply(): SchemaDeliveryMedium = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDeliveryMedium]
  }
  
  extension [Self <: SchemaDeliveryMedium](x: Self) {
    
    inline def setMediumType(value: String): Self = StObject.set(x, "mediumType", value.asInstanceOf[js.Any])
    
    inline def setMediumTypeNull: Self = StObject.set(x, "mediumType", null)
    
    inline def setMediumTypeUndefined: Self = StObject.set(x, "mediumType", js.undefined)
    
    inline def setSelfPhone(value: SchemaVoicePhoneNumber): Self = StObject.set(x, "selfPhone", value.asInstanceOf[js.Any])
    
    inline def setSelfPhoneUndefined: Self = StObject.set(x, "selfPhone", js.undefined)
  }
}
