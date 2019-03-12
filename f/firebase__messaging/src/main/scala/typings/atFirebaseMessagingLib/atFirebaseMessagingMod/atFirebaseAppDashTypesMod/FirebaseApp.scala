package typings
package atFirebaseMessagingLib.atFirebaseMessagingMod.atFirebaseAppDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FirebaseApp extends js.Object {
  def messaging(): atFirebaseMessagingDashTypesLib.atFirebaseMessagingDashTypesMod.FirebaseMessaging
}

object FirebaseApp {
  @scala.inline
  def apply(messaging: () => atFirebaseMessagingDashTypesLib.atFirebaseMessagingDashTypesMod.FirebaseMessaging): FirebaseApp = {
    val __obj = js.Dynamic.literal(messaging = js.Any.fromFunction0(messaging))
  
    __obj.asInstanceOf[FirebaseApp]
  }
}

