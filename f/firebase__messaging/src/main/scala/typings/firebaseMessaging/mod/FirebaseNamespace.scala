package typings.firebaseMessaging.mod

import typings.firebaseMessaging.AnonCall
import typings.firebaseMessagingTypes.mod.FirebaseMessaging
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FirebaseNamespace extends js.Object {
  @JSName("messaging")
  var messaging_Original: AnonCall = js.native
  def messaging(): FirebaseMessaging = js.native
  def messaging(app: FirebaseApp): FirebaseMessaging = js.native
}

