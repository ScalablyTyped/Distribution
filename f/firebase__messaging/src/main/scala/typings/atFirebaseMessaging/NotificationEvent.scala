package typings.atFirebaseMessaging

import typings.std.Notification
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NotificationEvent extends ExtendableEvent {
  val action: String = js.native
  val notification: Notification = js.native
}

