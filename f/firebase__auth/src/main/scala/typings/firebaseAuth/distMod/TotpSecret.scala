package typings.firebaseAuth.distMod

import typings.firebaseAuth.distSrcApiAccountManagementMfaMod.StartTotpMfaEnrollmentResponse
import typings.firebaseAuth.distSrcModelAuthMod.AuthInternal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/auth/dist", "TotpSecret")
@js.native
/* private */ open class TotpSecret ()
  extends typings.firebaseAuth.distSrcMfaAssertionsTotpMod.TotpSecret
/* static members */
object TotpSecret {
  
  @JSImport("@firebase/auth/dist", "TotpSecret")
  @js.native
  val ^ : js.Any = js.native
  
  /** @internal */
  inline def _fromStartTotpMfaEnrollmentResponse(response: StartTotpMfaEnrollmentResponse, auth: AuthInternal): typings.firebaseAuth.distSrcMfaAssertionsTotpMod.TotpSecret = (^.asInstanceOf[js.Dynamic].applyDynamic("_fromStartTotpMfaEnrollmentResponse")(response.asInstanceOf[js.Any], auth.asInstanceOf[js.Any])).asInstanceOf[typings.firebaseAuth.distSrcMfaAssertionsTotpMod.TotpSecret]
}
