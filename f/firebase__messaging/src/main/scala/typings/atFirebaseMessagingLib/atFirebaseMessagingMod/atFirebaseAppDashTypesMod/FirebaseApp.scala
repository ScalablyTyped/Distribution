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
  def apply(
    messaging: js.Function0[
      atFirebaseMessagingDashTypesLib.atFirebaseMessagingDashTypesMod.FirebaseMessaging
    ]
  ): FirebaseApp = {
    val __obj = js.Dynamic.literal(messaging = messaging)
  
    __obj.asInstanceOf[FirebaseApp]
  }
}

