package typings.finalForm

import typings.finalForm.mod.Subscriber
import typings.finalForm.mod.Subscription
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Notified[T /* <: js.Object */] extends StObject {
    
    var notified: Boolean = js.native
    
    def subscriber(value: T): Unit = js.native
    @JSName("subscriber")
    var subscriber_Original: Subscriber[T] = js.native
    
    var subscription: Subscription = js.native
  }
}
