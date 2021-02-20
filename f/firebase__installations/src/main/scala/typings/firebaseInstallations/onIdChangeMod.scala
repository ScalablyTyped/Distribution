package typings.firebaseInstallations

import typings.firebaseInstallations.firebaseDependenciesMod.FirebaseDependencies
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object onIdChangeMod {
  
  @JSImport("@firebase/installations/dist/src/functions/on-id-change", "onIdChange")
  @js.native
  def onIdChange(hasAppConfig: FirebaseDependencies, callback: IdChangeCallbackFn): IdChangeUnsubscribeFn = js.native
  
  type IdChangeCallbackFn = js.Function1[/* installationId */ String, Unit]
  
  type IdChangeUnsubscribeFn = js.Function0[Unit]
}
