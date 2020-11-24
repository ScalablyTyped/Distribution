package typings.emissary.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISubscriber extends js.Object {
  
  def addSubscription(subscription: js.Any): ISubscription = js.native
  
  def subscribe(eventEmitterOrSubscription: js.Any, args: js.Any*): ISubscription = js.native
  
  def subscribeToCommand(eventEmitter: js.Any, args: js.Any*): ISubscription = js.native
  
  def subscribeWith(eventEmitter: js.Any, methodName: String, args: js.Any): ISubscription = js.native
  
  def unsubscribe(): js.Any = js.native
  def unsubscribe(`object`: js.Any): js.Any = js.native
}
