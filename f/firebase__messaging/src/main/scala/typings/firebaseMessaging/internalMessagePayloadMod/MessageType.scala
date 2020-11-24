package typings.firebaseMessaging.internalMessagePayloadMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait MessageType extends js.Object
@JSImport("@firebase/messaging/dist/interfaces/internal-message-payload", "MessageType")
@js.native
object MessageType extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[MessageType with String] = js.native
  
  @js.native
  sealed trait NOTIFICATION_CLICKED extends MessageType
  /* "notification-clicked" */ @js.native
  object NOTIFICATION_CLICKED extends TopLevel[NOTIFICATION_CLICKED with String]
  
  @js.native
  sealed trait PUSH_RECEIVED extends MessageType
  /* "push-received" */ @js.native
  object PUSH_RECEIVED extends TopLevel[PUSH_RECEIVED with String]
}
