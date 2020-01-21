package typings.firebaseMessaging.apiMod

import typings.firebaseMessaging.internalDependenciesMod.FirebaseInternalDependencies
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/messaging/dist/core/api", "requestDeleteToken")
@js.native
object requestDeleteToken extends js.Object {
  def apply(firebaseDependencies: FirebaseInternalDependencies, token: String): js.Promise[Unit] = js.native
}

