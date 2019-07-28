package typings.atFirebaseMessaging.atFirebaseMessagingMod.atFirebaseAppDashTypesMod

import typings.atFirebaseMessagingDashTypes.atFirebaseMessagingDashTypesMod.FirebaseMessaging
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FirebaseApp extends js.Object {
  def messaging(): FirebaseMessaging
}

object FirebaseApp {
  @scala.inline
  def apply(messaging: () => FirebaseMessaging): FirebaseApp = {
    val __obj = js.Dynamic.literal(messaging = js.Any.fromFunction0(messaging))
  
    __obj.asInstanceOf[FirebaseApp]
  }
}

