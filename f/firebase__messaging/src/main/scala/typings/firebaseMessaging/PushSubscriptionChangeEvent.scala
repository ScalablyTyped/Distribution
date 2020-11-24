package typings.firebaseMessaging

import typings.std.PushSubscription
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PushSubscriptionChangeEvent extends ExtendableEvent {
  
  val newSubscription: PushSubscription | Null = js.native
  
  val oldSubscription: PushSubscription | Null = js.native
}
