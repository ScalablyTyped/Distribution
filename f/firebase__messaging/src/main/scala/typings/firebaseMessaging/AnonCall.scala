package typings.firebaseMessaging

import typings.firebaseMessaging.mod.FirebaseApp
import typings.firebaseMessagingTypes.mod.FirebaseMessaging
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCall extends js.Object {
  def apply(): FirebaseMessaging = js.native
  def apply(app: FirebaseApp): FirebaseMessaging = js.native
  def isSupported(): Boolean = js.native
}

