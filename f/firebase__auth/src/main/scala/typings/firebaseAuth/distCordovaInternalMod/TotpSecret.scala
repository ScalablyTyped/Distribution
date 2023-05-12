package typings.firebaseAuth.distCordovaInternalMod

import typings.firebaseAuth.distCordovaSrcApiAccountManagementMfaMod.StartTotpMfaEnrollmentResponse
import typings.firebaseAuth.distCordovaSrcModelAuthMod.AuthInternal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/auth/dist/cordova/internal", "TotpSecret")
@js.native
/* private */ open class TotpSecret ()
  extends typings.firebaseAuth.distCordovaMod.TotpSecret
/* static members */
object TotpSecret {
  
  @JSImport("@firebase/auth/dist/cordova/internal", "TotpSecret")
  @js.native
  val ^ : js.Any = js.native
  
  /** @internal */
  inline def _fromStartTotpMfaEnrollmentResponse(response: StartTotpMfaEnrollmentResponse, auth: AuthInternal): typings.firebaseAuth.distCordovaSrcMfaAssertionsTotpMod.TotpSecret = (^.asInstanceOf[js.Dynamic].applyDynamic("_fromStartTotpMfaEnrollmentResponse")(response.asInstanceOf[js.Any], auth.asInstanceOf[js.Any])).asInstanceOf[typings.firebaseAuth.distCordovaSrcMfaAssertionsTotpMod.TotpSecret]
}
