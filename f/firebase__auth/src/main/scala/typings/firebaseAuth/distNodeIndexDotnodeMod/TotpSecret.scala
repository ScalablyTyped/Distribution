package typings.firebaseAuth.distNodeIndexDotnodeMod

import typings.firebaseAuth.distNodeSrcApiAccountManagementMfaMod.StartTotpMfaEnrollmentResponse
import typings.firebaseAuth.distNodeSrcModelAuthMod.AuthInternal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/auth/dist/node/index.node", "TotpSecret")
@js.native
/* private */ open class TotpSecret ()
  extends typings.firebaseAuth.distNodeMod.TotpSecret
/* static members */
object TotpSecret {
  
  @JSImport("@firebase/auth/dist/node/index.node", "TotpSecret")
  @js.native
  val ^ : js.Any = js.native
  
  /** @internal */
  inline def _fromStartTotpMfaEnrollmentResponse(response: StartTotpMfaEnrollmentResponse, auth: AuthInternal): typings.firebaseAuth.distNodeSrcMfaAssertionsTotpMod.TotpSecret = (^.asInstanceOf[js.Dynamic].applyDynamic("_fromStartTotpMfaEnrollmentResponse")(response.asInstanceOf[js.Any], auth.asInstanceOf[js.Any])).asInstanceOf[typings.firebaseAuth.distNodeSrcMfaAssertionsTotpMod.TotpSecret]
}
