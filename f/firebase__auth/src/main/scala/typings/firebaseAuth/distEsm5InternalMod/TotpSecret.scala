package typings.firebaseAuth.distEsm5InternalMod

import typings.firebaseAuth.distEsm5SrcApiAccountManagementMfaMod.StartTotpMfaEnrollmentResponse
import typings.firebaseAuth.distEsm5SrcModelAuthMod.AuthInternal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/auth/dist/esm5/internal", "TotpSecret")
@js.native
/* private */ open class TotpSecret ()
  extends typings.firebaseAuth.distEsm5Mod.TotpSecret
/* static members */
object TotpSecret {
  
  @JSImport("@firebase/auth/dist/esm5/internal", "TotpSecret")
  @js.native
  val ^ : js.Any = js.native
  
  /** @internal */
  inline def _fromStartTotpMfaEnrollmentResponse(response: StartTotpMfaEnrollmentResponse, auth: AuthInternal): typings.firebaseAuth.distEsm5SrcMfaAssertionsTotpMod.TotpSecret = (^.asInstanceOf[js.Dynamic].applyDynamic("_fromStartTotpMfaEnrollmentResponse")(response.asInstanceOf[js.Any], auth.asInstanceOf[js.Any])).asInstanceOf[typings.firebaseAuth.distEsm5SrcMfaAssertionsTotpMod.TotpSecret]
}
