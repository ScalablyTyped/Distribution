package typings.firebase.compatMod.firebase.auth

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The phone info options for multi-factor sign-in. Either multi-factor hint or
  * multi-factor UID and multi-factor session are required.
  */
trait PhoneMultiFactorSignInInfoOptions
  extends StObject
     with PhoneInfoOptions {
  
  var multiFactorHint: js.UndefOr[MultiFactorInfo] = js.undefined
  
  var multiFactorUid: js.UndefOr[String] = js.undefined
  
  var session: MultiFactorSession
}
object PhoneMultiFactorSignInInfoOptions {
  
  inline def apply(session: MultiFactorSession): PhoneMultiFactorSignInInfoOptions = {
    val __obj = js.Dynamic.literal(session = session.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhoneMultiFactorSignInInfoOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PhoneMultiFactorSignInInfoOptions] (val x: Self) extends AnyVal {
    
    inline def setMultiFactorHint(value: MultiFactorInfo): Self = StObject.set(x, "multiFactorHint", value.asInstanceOf[js.Any])
    
    inline def setMultiFactorHintUndefined: Self = StObject.set(x, "multiFactorHint", js.undefined)
    
    inline def setMultiFactorUid(value: String): Self = StObject.set(x, "multiFactorUid", value.asInstanceOf[js.Any])
    
    inline def setMultiFactorUidUndefined: Self = StObject.set(x, "multiFactorUid", js.undefined)
    
    inline def setSession(value: MultiFactorSession): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
  }
}
