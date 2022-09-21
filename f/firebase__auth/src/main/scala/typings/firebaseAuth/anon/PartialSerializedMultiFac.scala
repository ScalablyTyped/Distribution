package typings.firebaseAuth.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@firebase/auth.@firebase/auth/dist/src/mfa/mfa_session.SerializedMultiFactorSession> */
trait PartialSerializedMultiFac extends StObject {
  
  var multiFactorSession: js.UndefOr[IdToken] = js.undefined
}
object PartialSerializedMultiFac {
  
  inline def apply(): PartialSerializedMultiFac = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialSerializedMultiFac]
  }
  
  extension [Self <: PartialSerializedMultiFac](x: Self) {
    
    inline def setMultiFactorSession(value: IdToken): Self = StObject.set(x, "multiFactorSession", value.asInstanceOf[js.Any])
    
    inline def setMultiFactorSessionUndefined: Self = StObject.set(x, "multiFactorSession", js.undefined)
  }
}
