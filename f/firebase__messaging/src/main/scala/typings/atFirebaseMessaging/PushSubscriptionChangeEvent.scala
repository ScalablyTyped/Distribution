package typings.atFirebaseMessaging

import typings.std.PushSubscription
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PushSubscriptionChangeEvent extends ExtendableEvent {
  val newSubscription: PushSubscription | Null = js.native
  val oldSubscription: PushSubscription | Null = js.native
}

