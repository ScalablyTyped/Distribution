package typings.ejWebAll.anon

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Typeofwidget extends StObject {
  
  val autoInit: Boolean
  
  def destroyAll(elements: Element): Unit
  
  def init(element: Element): Unit
  
  def register(pluginName: String, className: String, prototype: Any): Unit
  
  def registerInstance(element: Element, pluginName: String, className: String, prototype: Any): Unit
  
  val registeredInstances: js.Array[Any]
  
  val registeredWidgets: js.Array[Any]
}
object Typeofwidget {
  
  inline def apply(
    autoInit: Boolean,
    destroyAll: Element => Unit,
    init: Element => Unit,
    register: (String, String, Any) => Unit,
    registerInstance: (Element, String, String, Any) => Unit,
    registeredInstances: js.Array[Any],
    registeredWidgets: js.Array[Any]
  ): Typeofwidget = {
    val __obj = js.Dynamic.literal(autoInit = autoInit.asInstanceOf[js.Any], destroyAll = js.Any.fromFunction1(destroyAll), init = js.Any.fromFunction1(init), register = js.Any.fromFunction3(register), registerInstance = js.Any.fromFunction4(registerInstance), registeredInstances = registeredInstances.asInstanceOf[js.Any], registeredWidgets = registeredWidgets.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofwidget]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Typeofwidget] (val x: Self) extends AnyVal {
    
    inline def setAutoInit(value: Boolean): Self = StObject.set(x, "autoInit", value.asInstanceOf[js.Any])
    
    inline def setDestroyAll(value: Element => Unit): Self = StObject.set(x, "destroyAll", js.Any.fromFunction1(value))
    
    inline def setInit(value: Element => Unit): Self = StObject.set(x, "init", js.Any.fromFunction1(value))
    
    inline def setRegister(value: (String, String, Any) => Unit): Self = StObject.set(x, "register", js.Any.fromFunction3(value))
    
    inline def setRegisterInstance(value: (Element, String, String, Any) => Unit): Self = StObject.set(x, "registerInstance", js.Any.fromFunction4(value))
    
    inline def setRegisteredInstances(value: js.Array[Any]): Self = StObject.set(x, "registeredInstances", value.asInstanceOf[js.Any])
    
    inline def setRegisteredInstancesVarargs(value: Any*): Self = StObject.set(x, "registeredInstances", js.Array(value*))
    
    inline def setRegisteredWidgets(value: js.Array[Any]): Self = StObject.set(x, "registeredWidgets", value.asInstanceOf[js.Any])
    
    inline def setRegisteredWidgetsVarargs(value: Any*): Self = StObject.set(x, "registeredWidgets", js.Array(value*))
  }
}
