package typings.ejWebAll.ej

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Model extends StObject {
  
  def bindTo(element: Any): Unit
  
  def changeState(state: Boolean, args: Any): Unit
  
  def computes(value: Any): Unit
  
  var formElements: js.Array[String]
  
  def get(field: String): Any
  
  def markCommit(): Unit
  
  def markDelete(): Unit
  
  def off(eventName: String, handler: Any): Unit
  
  def on(eventName: String, handler: Any): Unit
  
  def properties(): Any
  
  def revert(suspendEvent: Any): Unit
  
  def save(dm: DataManager, key: String): Unit
  
  def set(field: String, value: Any): Unit
  
  def unbind(element: Any): Unit
}
object Model {
  
  inline def apply(
    bindTo: Any => Unit,
    changeState: (Boolean, Any) => Unit,
    computes: Any => Unit,
    formElements: js.Array[String],
    get: String => Any,
    markCommit: () => Unit,
    markDelete: () => Unit,
    off: (String, Any) => Unit,
    on: (String, Any) => Unit,
    properties: () => Any,
    revert: Any => Unit,
    save: (DataManager, String) => Unit,
    set: (String, Any) => Unit,
    unbind: Any => Unit
  ): Model = {
    val __obj = js.Dynamic.literal(bindTo = js.Any.fromFunction1(bindTo), changeState = js.Any.fromFunction2(changeState), computes = js.Any.fromFunction1(computes), formElements = formElements.asInstanceOf[js.Any], get = js.Any.fromFunction1(get), markCommit = js.Any.fromFunction0(markCommit), markDelete = js.Any.fromFunction0(markDelete), off = js.Any.fromFunction2(off), on = js.Any.fromFunction2(on), properties = js.Any.fromFunction0(properties), revert = js.Any.fromFunction1(revert), save = js.Any.fromFunction2(save), set = js.Any.fromFunction2(set), unbind = js.Any.fromFunction1(unbind))
    __obj.asInstanceOf[Model]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Model] (val x: Self) extends AnyVal {
    
    inline def setBindTo(value: Any => Unit): Self = StObject.set(x, "bindTo", js.Any.fromFunction1(value))
    
    inline def setChangeState(value: (Boolean, Any) => Unit): Self = StObject.set(x, "changeState", js.Any.fromFunction2(value))
    
    inline def setComputes(value: Any => Unit): Self = StObject.set(x, "computes", js.Any.fromFunction1(value))
    
    inline def setFormElements(value: js.Array[String]): Self = StObject.set(x, "formElements", value.asInstanceOf[js.Any])
    
    inline def setFormElementsVarargs(value: String*): Self = StObject.set(x, "formElements", js.Array(value*))
    
    inline def setGet(value: String => Any): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
    
    inline def setMarkCommit(value: () => Unit): Self = StObject.set(x, "markCommit", js.Any.fromFunction0(value))
    
    inline def setMarkDelete(value: () => Unit): Self = StObject.set(x, "markDelete", js.Any.fromFunction0(value))
    
    inline def setOff(value: (String, Any) => Unit): Self = StObject.set(x, "off", js.Any.fromFunction2(value))
    
    inline def setOn(value: (String, Any) => Unit): Self = StObject.set(x, "on", js.Any.fromFunction2(value))
    
    inline def setProperties(value: () => Any): Self = StObject.set(x, "properties", js.Any.fromFunction0(value))
    
    inline def setRevert(value: Any => Unit): Self = StObject.set(x, "revert", js.Any.fromFunction1(value))
    
    inline def setSave(value: (DataManager, String) => Unit): Self = StObject.set(x, "save", js.Any.fromFunction2(value))
    
    inline def setSet(value: (String, Any) => Unit): Self = StObject.set(x, "set", js.Any.fromFunction2(value))
    
    inline def setUnbind(value: Any => Unit): Self = StObject.set(x, "unbind", js.Any.fromFunction1(value))
  }
}
