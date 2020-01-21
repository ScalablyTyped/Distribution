package typings.firebaseInstallations

import typings.firebaseInstallations.firebaseDependenciesMod.FirebaseDependencies
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/installations/dist/src/functions/on-id-change", JSImport.Namespace)
@js.native
object onIdChangeMod extends js.Object {
  def onIdChange(hasAppConfig: FirebaseDependencies, callback: IdChangeCallbackFn): IdChangeUnsubscribeFn = js.native
  type IdChangeCallbackFn = js.Function1[/* installationId */ String, Unit]
  type IdChangeUnsubscribeFn = js.Function0[Unit]
}

