package typings.finalForm

import typings.finalForm.mod.Subscriber
import typings.finalForm.mod.Subscription
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Notified[T /* <: js.Object */] extends StObject {
    
    var notified: Boolean
    
    def subscriber(value: T): Unit
    @JSName("subscriber")
    var subscriber_Original: Subscriber[T]
    
    var subscription: Subscription
  }
  object Notified {
    
    @scala.inline
    def apply[T /* <: js.Object */](notified: Boolean, subscriber: T => Unit, subscription: Subscription): Notified[T] = {
      val __obj = js.Dynamic.literal(notified = notified.asInstanceOf[js.Any], subscriber = js.Any.fromFunction1(subscriber), subscription = subscription.asInstanceOf[js.Any])
      __obj.asInstanceOf[Notified[T]]
    }
    
    @scala.inline
    implicit class NotifiedMutableBuilder[Self <: Notified[?], T /* <: js.Object */] (val x: Self & Notified[T]) extends AnyVal {
      
      @scala.inline
      def setNotified(value: Boolean): Self = StObject.set(x, "notified", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubscriber(value: T => Unit): Self = StObject.set(x, "subscriber", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSubscription(value: Subscription): Self = StObject.set(x, "subscription", value.asInstanceOf[js.Any])
    }
  }
}
