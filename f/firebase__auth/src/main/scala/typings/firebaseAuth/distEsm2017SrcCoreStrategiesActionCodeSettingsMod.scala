package typings.firebaseAuth

import typings.firebaseAuth.distEsm2017SrcApiAuthenticationEmailAndPasswordMod.GetOobCodeRequest
import typings.firebaseAuth.distEsm2017SrcModelPublicTypesMod.ActionCodeSettings
import typings.firebaseAuth.distEsm2017SrcModelPublicTypesMod.Auth
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsm2017SrcCoreStrategiesActionCodeSettingsMod {
  
  @JSImport("@firebase/auth/dist/esm2017/src/core/strategies/action_code_settings", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def setActionCodeSettingsOnRequest(auth: Auth, request: GetOobCodeRequest, actionCodeSettings: ActionCodeSettings): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("_setActionCodeSettingsOnRequest")(auth.asInstanceOf[js.Any], request.asInstanceOf[js.Any], actionCodeSettings.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
