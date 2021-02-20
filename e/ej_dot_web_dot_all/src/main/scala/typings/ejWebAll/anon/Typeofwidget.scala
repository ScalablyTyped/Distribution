package typings.ejWebAll.anon

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofwidget extends StObject {
  
  val autoInit: Boolean = js.native
  
  def destroyAll(elements: Element): Unit = js.native
  
  def init(element: Element): Unit = js.native
  
  def register(pluginName: String, className: String, prototype: js.Any): Unit = js.native
  
  def registerInstance(element: Element, pluginName: String, className: String, prototype: js.Any): Unit = js.native
  
  val registeredInstances: js.Array[_] = js.native
  
  val registeredWidgets: js.Array[_] = js.native
}
object Typeofwidget {
  
  @scala.inline
  def apply(
    autoInit: Boolean,
    destroyAll: Element => Unit,
    init: Element => Unit,
    register: (String, String, js.Any) => Unit,
    registerInstance: (Element, String, String, js.Any) => Unit,
    registeredInstances: js.Array[_],
    registeredWidgets: js.Array[_]
  ): Typeofwidget = {
    val __obj = js.Dynamic.literal(autoInit = autoInit.asInstanceOf[js.Any], destroyAll = js.Any.fromFunction1(destroyAll), init = js.Any.fromFunction1(init), register = js.Any.fromFunction3(register), registerInstance = js.Any.fromFunction4(registerInstance), registeredInstances = registeredInstances.asInstanceOf[js.Any], registeredWidgets = registeredWidgets.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofwidget]
  }
  
  @scala.inline
  implicit class TypeofwidgetMutableBuilder[Self <: Typeofwidget] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoInit(value: Boolean): Self = StObject.set(x, "autoInit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestroyAll(value: Element => Unit): Self = StObject.set(x, "destroyAll", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInit(value: Element => Unit): Self = StObject.set(x, "init", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRegister(value: (String, String, js.Any) => Unit): Self = StObject.set(x, "register", js.Any.fromFunction3(value))
    
    @scala.inline
    def setRegisterInstance(value: (Element, String, String, js.Any) => Unit): Self = StObject.set(x, "registerInstance", js.Any.fromFunction4(value))
    
    @scala.inline
    def setRegisteredInstances(value: js.Array[_]): Self = StObject.set(x, "registeredInstances", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegisteredInstancesVarargs(value: js.Any*): Self = StObject.set(x, "registeredInstances", js.Array(value :_*))
    
    @scala.inline
    def setRegisteredWidgets(value: js.Array[_]): Self = StObject.set(x, "registeredWidgets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegisteredWidgetsVarargs(value: js.Any*): Self = StObject.set(x, "registeredWidgets", js.Array(value :_*))
  }
}
