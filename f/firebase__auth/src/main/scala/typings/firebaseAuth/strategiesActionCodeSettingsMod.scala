package typings.firebaseAuth

import typings.firebaseAuth.apiAuthenticationEmailAndPasswordMod.GetOobCodeRequest
import typings.firebaseAuth.modelPublicTypesMod.ActionCodeSettings
import typings.firebaseAuth.modelPublicTypesMod.Auth
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object strategiesActionCodeSettingsMod {
  
  @JSImport("@firebase/auth/dist/esm2017/src/core/strategies/action_code_settings", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def setActionCodeSettingsOnRequest(auth: Auth, request: GetOobCodeRequest, actionCodeSettings: ActionCodeSettings): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("_setActionCodeSettingsOnRequest")(auth.asInstanceOf[js.Any], request.asInstanceOf[js.Any], actionCodeSettings.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
