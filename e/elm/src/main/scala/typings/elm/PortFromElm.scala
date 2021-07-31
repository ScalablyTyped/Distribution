package typings.elm

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PortFromElm[V] extends StObject {
  
  def subscribe(handler: js.Function1[/* value */ V, Unit]): Unit
  
  def unsubscribe(handler: js.Function1[/* value */ V, Unit]): Unit
}
object PortFromElm {
  
  @scala.inline
  def apply[V](
    subscribe: js.Function1[/* value */ V, Unit] => Unit,
    unsubscribe: js.Function1[/* value */ V, Unit] => Unit
  ): PortFromElm[V] = {
    val __obj = js.Dynamic.literal(subscribe = js.Any.fromFunction1(subscribe), unsubscribe = js.Any.fromFunction1(unsubscribe))
    __obj.asInstanceOf[PortFromElm[V]]
  }
  
  @scala.inline
  implicit class PortFromElmMutableBuilder[Self <: PortFromElm[?], V] (val x: Self & PortFromElm[V]) extends AnyVal {
    
    @scala.inline
    def setSubscribe(value: js.Function1[/* value */ V, Unit] => Unit): Self = StObject.set(x, "subscribe", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUnsubscribe(value: js.Function1[/* value */ V, Unit] => Unit): Self = StObject.set(x, "unsubscribe", js.Any.fromFunction1(value))
  }
}
