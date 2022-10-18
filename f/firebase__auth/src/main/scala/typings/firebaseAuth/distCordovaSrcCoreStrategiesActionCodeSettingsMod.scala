package typings.firebaseAuth

import typings.firebaseAuth.distCordovaSrcApiAuthenticationEmailAndPasswordMod.GetOobCodeRequest
import typings.firebaseAuth.distCordovaSrcModelPublicTypesMod.ActionCodeSettings
import typings.firebaseAuth.distCordovaSrcModelPublicTypesMod.Auth
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCordovaSrcCoreStrategiesActionCodeSettingsMod {
  
  @JSImport("@firebase/auth/dist/cordova/src/core/strategies/action_code_settings", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def setActionCodeSettingsOnRequest(auth: Auth, request: GetOobCodeRequest, actionCodeSettings: ActionCodeSettings): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("_setActionCodeSettingsOnRequest")(auth.asInstanceOf[js.Any], request.asInstanceOf[js.Any], actionCodeSettings.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
