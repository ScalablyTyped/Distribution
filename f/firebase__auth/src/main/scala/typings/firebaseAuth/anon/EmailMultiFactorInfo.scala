package typings.firebaseAuth.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EmailMultiFactorInfo extends StObject {
  
  var email: js.UndefOr[String | Null] = js.undefined
  
  var multiFactorInfo: js.UndefOr[typings.firebaseAuth.modelPublicTypesMod.MultiFactorInfo | Null] = js.undefined
  
  var previousEmail: js.UndefOr[String | Null] = js.undefined
}
object EmailMultiFactorInfo {
  
  inline def apply(): EmailMultiFactorInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EmailMultiFactorInfo]
  }
  
  extension [Self <: EmailMultiFactorInfo](x: Self) {
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEmailNull: Self = StObject.set(x, "email", null)
    
    inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    inline def setMultiFactorInfo(value: typings.firebaseAuth.modelPublicTypesMod.MultiFactorInfo): Self = StObject.set(x, "multiFactorInfo", value.asInstanceOf[js.Any])
    
    inline def setMultiFactorInfoNull: Self = StObject.set(x, "multiFactorInfo", null)
    
    inline def setMultiFactorInfoUndefined: Self = StObject.set(x, "multiFactorInfo", js.undefined)
    
    inline def setPreviousEmail(value: String): Self = StObject.set(x, "previousEmail", value.asInstanceOf[js.Any])
    
    inline def setPreviousEmailNull: Self = StObject.set(x, "previousEmail", null)
    
    inline def setPreviousEmailUndefined: Self = StObject.set(x, "previousEmail", js.undefined)
  }
}
