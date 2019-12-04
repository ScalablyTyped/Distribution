package typings.atFirebaseMessaging.distSrcModelsWorkerDashPageDashMessageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MessageType extends js.Object

@JSImport("@firebase/messaging/dist/src/models/worker-page-message", "MessageType")
@js.native
object MessageType extends js.Object {
  @js.native
  sealed trait NOTIFICATION_CLICKED extends MessageType
  
  @js.native
  sealed trait PUSH_MSG_RECEIVED extends MessageType
  
  /* "notification-clicked" */ val NOTIFICATION_CLICKED: typings.atFirebaseMessaging.distSrcModelsWorkerDashPageDashMessageMod.MessageType.NOTIFICATION_CLICKED with String = js.native
  /* "push-msg-received" */ val PUSH_MSG_RECEIVED: typings.atFirebaseMessaging.distSrcModelsWorkerDashPageDashMessageMod.MessageType.PUSH_MSG_RECEIVED with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[MessageType with String] = js.native
}

