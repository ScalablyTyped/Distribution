package typings.ejWebAll.anon

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Typeofwidget extends StObject {
  
  val autoInit: Boolean
  
  def destroyAll(elements: Element): Unit
  
  def init(element: Element): Unit
  
  def register(pluginName: String, className: String, prototype: js.Any): Unit
  
  def registerInstance(element: Element, pluginName: String, className: String, prototype: js.Any): Unit
  
  val registeredInstances: js.Array[js.Any]
  
  val registeredWidgets: js.Array[js.Any]
}
object Typeofwidget {
  
  inline def apply(
    autoInit: Boolean,
    destroyAll: Element => Unit,
    init: Element => Unit,
    register: (String, String, js.Any) => Unit,
    registerInstance: (Element, String, String, js.Any) => Unit,
    registeredInstances: js.Array[js.Any],
    registeredWidgets: js.Array[js.Any]
  ): Typeofwidget = {
    val __obj = js.Dynamic.literal(autoInit = autoInit.asInstanceOf[js.Any], destroyAll = js.Any.fromFunction1(destroyAll), init = js.Any.fromFunction1(init), register = js.Any.fromFunction3(register), registerInstance = js.Any.fromFunction4(registerInstance), registeredInstances = registeredInstances.asInstanceOf[js.Any], registeredWidgets = registeredWidgets.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofwidget]
  }
  
  extension [Self <: Typeofwidget](x: Self) {
    
    inline def setAutoInit(value: Boolean): Self = StObject.set(x, "autoInit", value.asInstanceOf[js.Any])
    
    inline def setDestroyAll(value: Element => Unit): Self = StObject.set(x, "destroyAll", js.Any.fromFunction1(value))
    
    inline def setInit(value: Element => Unit): Self = StObject.set(x, "init", js.Any.fromFunction1(value))
    
    inline def setRegister(value: (String, String, js.Any) => Unit): Self = StObject.set(x, "register", js.Any.fromFunction3(value))
    
    inline def setRegisterInstance(value: (Element, String, String, js.Any) => Unit): Self = StObject.set(x, "registerInstance", js.Any.fromFunction4(value))
    
    inline def setRegisteredInstances(value: js.Array[js.Any]): Self = StObject.set(x, "registeredInstances", value.asInstanceOf[js.Any])
    
    inline def setRegisteredInstancesVarargs(value: js.Any*): Self = StObject.set(x, "registeredInstances", js.Array(value :_*))
    
    inline def setRegisteredWidgets(value: js.Array[js.Any]): Self = StObject.set(x, "registeredWidgets", value.asInstanceOf[js.Any])
    
    inline def setRegisteredWidgetsVarargs(value: js.Any*): Self = StObject.set(x, "registeredWidgets", js.Array(value :_*))
  }
}
