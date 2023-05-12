package typings.fullcalendarCore.internalCommonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Store[Value] extends StObject {
  
  /* private */ var currentValue: Any
  
  /* private */ var handlers: Any
  
  def set(value: Value): Unit
  
  def subscribe(handler: js.Function1[/* value */ Value, Unit]): Unit
}
object Store {
  
  inline def apply[Value](
    currentValue: Any,
    handlers: Any,
    set: Value => Unit,
    subscribe: js.Function1[/* value */ Value, Unit] => Unit
  ): Store[Value] = {
    val __obj = js.Dynamic.literal(currentValue = currentValue.asInstanceOf[js.Any], handlers = handlers.asInstanceOf[js.Any], set = js.Any.fromFunction1(set), subscribe = js.Any.fromFunction1(subscribe))
    __obj.asInstanceOf[Store[Value]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Store[?], Value] (val x: Self & Store[Value]) extends AnyVal {
    
    inline def setCurrentValue(value: Any): Self = StObject.set(x, "currentValue", value.asInstanceOf[js.Any])
    
    inline def setHandlers(value: Any): Self = StObject.set(x, "handlers", value.asInstanceOf[js.Any])
    
    inline def setSet(value: Value => Unit): Self = StObject.set(x, "set", js.Any.fromFunction1(value))
    
    inline def setSubscribe(value: js.Function1[/* value */ Value, Unit] => Unit): Self = StObject.set(x, "subscribe", js.Any.fromFunction1(value))
  }
}
