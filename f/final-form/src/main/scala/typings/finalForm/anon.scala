package typings.finalForm

import typings.finalForm.mod.Subscriber
import typings.finalForm.mod.Subscription
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object anon extends js.Object {
  
  @js.native
  trait Notified[T /* <: js.Object */] extends js.Object {
    
    var notified: Boolean = js.native
    
    def subscriber(value: T): Unit = js.native
    @JSName("subscriber")
    var subscriber_Original: Subscriber[T] = js.native
    
    var subscription: Subscription = js.native
  }
}
