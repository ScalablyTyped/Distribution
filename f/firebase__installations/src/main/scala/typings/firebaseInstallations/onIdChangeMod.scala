package typings.firebaseInstallations

import typings.firebaseInstallations.firebaseDependenciesMod.FirebaseDependencies
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object onIdChangeMod {
  
  @JSImport("@firebase/installations/dist/src/functions/on-id-change", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def onIdChange(hasAppConfig: FirebaseDependencies, callback: IdChangeCallbackFn): IdChangeUnsubscribeFn = (^.asInstanceOf[js.Dynamic].applyDynamic("onIdChange")(hasAppConfig.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[IdChangeUnsubscribeFn]
  
  type IdChangeCallbackFn = js.Function1[/* installationId */ String, Unit]
  
  type IdChangeUnsubscribeFn = js.Function0[Unit]
}
