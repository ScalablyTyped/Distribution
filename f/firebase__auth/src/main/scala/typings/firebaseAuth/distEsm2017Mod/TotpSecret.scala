package typings.firebaseAuth.distEsm2017Mod

import typings.firebaseAuth.distEsm2017SrcApiAccountManagementMfaMod.StartTotpMfaEnrollmentResponse
import typings.firebaseAuth.distEsm2017SrcModelAuthMod.AuthInternal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/auth/dist/esm2017", "TotpSecret")
@js.native
/* private */ open class TotpSecret ()
  extends typings.firebaseAuth.distEsm2017SrcMfaAssertionsTotpMod.TotpSecret
/* static members */
object TotpSecret {
  
  @JSImport("@firebase/auth/dist/esm2017", "TotpSecret")
  @js.native
  val ^ : js.Any = js.native
  
  /** @internal */
  inline def _fromStartTotpMfaEnrollmentResponse(response: StartTotpMfaEnrollmentResponse, auth: AuthInternal): typings.firebaseAuth.distEsm2017SrcMfaAssertionsTotpMod.TotpSecret = (^.asInstanceOf[js.Dynamic].applyDynamic("_fromStartTotpMfaEnrollmentResponse")(response.asInstanceOf[js.Any], auth.asInstanceOf[js.Any])).asInstanceOf[typings.firebaseAuth.distEsm2017SrcMfaAssertionsTotpMod.TotpSecret]
}
