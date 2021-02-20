package typings.ejWebAll.ej

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Model extends StObject {
  
  def bindTo(element: js.Any): Unit = js.native
  
  def changeState(state: Boolean, args: js.Any): Unit = js.native
  
  def computes(value: js.Any): Unit = js.native
  
  var formElements: js.Array[String] = js.native
  
  def get(field: String): js.Any = js.native
  
  def markCommit(): Unit = js.native
  
  def markDelete(): Unit = js.native
  
  def off(eventName: String, handler: js.Any): Unit = js.native
  
  def on(eventName: String, handler: js.Any): Unit = js.native
  
  def properties(): js.Any = js.native
  
  def revert(suspendEvent: js.Any): Unit = js.native
  
  def save(dm: DataManager, key: String): Unit = js.native
  
  def set(field: String, value: js.Any): Unit = js.native
  
  def unbind(element: js.Any): Unit = js.native
}
object Model {
  
  @scala.inline
  def apply(
    bindTo: js.Any => Unit,
    changeState: (Boolean, js.Any) => Unit,
    computes: js.Any => Unit,
    formElements: js.Array[String],
    get: String => js.Any,
    markCommit: () => Unit,
    markDelete: () => Unit,
    off: (String, js.Any) => Unit,
    on: (String, js.Any) => Unit,
    properties: () => js.Any,
    revert: js.Any => Unit,
    save: (DataManager, String) => Unit,
    set: (String, js.Any) => Unit,
    unbind: js.Any => Unit
  ): Model = {
    val __obj = js.Dynamic.literal(bindTo = js.Any.fromFunction1(bindTo), changeState = js.Any.fromFunction2(changeState), computes = js.Any.fromFunction1(computes), formElements = formElements.asInstanceOf[js.Any], get = js.Any.fromFunction1(get), markCommit = js.Any.fromFunction0(markCommit), markDelete = js.Any.fromFunction0(markDelete), off = js.Any.fromFunction2(off), on = js.Any.fromFunction2(on), properties = js.Any.fromFunction0(properties), revert = js.Any.fromFunction1(revert), save = js.Any.fromFunction2(save), set = js.Any.fromFunction2(set), unbind = js.Any.fromFunction1(unbind))
    __obj.asInstanceOf[Model]
  }
  
  @scala.inline
  implicit class ModelMutableBuilder[Self <: Model] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBindTo(value: js.Any => Unit): Self = StObject.set(x, "bindTo", js.Any.fromFunction1(value))
    
    @scala.inline
    def setChangeState(value: (Boolean, js.Any) => Unit): Self = StObject.set(x, "changeState", js.Any.fromFunction2(value))
    
    @scala.inline
    def setComputes(value: js.Any => Unit): Self = StObject.set(x, "computes", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFormElements(value: js.Array[String]): Self = StObject.set(x, "formElements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormElementsVarargs(value: String*): Self = StObject.set(x, "formElements", js.Array(value :_*))
    
    @scala.inline
    def setGet(value: String => js.Any): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMarkCommit(value: () => Unit): Self = StObject.set(x, "markCommit", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMarkDelete(value: () => Unit): Self = StObject.set(x, "markDelete", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOff(value: (String, js.Any) => Unit): Self = StObject.set(x, "off", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOn(value: (String, js.Any) => Unit): Self = StObject.set(x, "on", js.Any.fromFunction2(value))
    
    @scala.inline
    def setProperties(value: () => js.Any): Self = StObject.set(x, "properties", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRevert(value: js.Any => Unit): Self = StObject.set(x, "revert", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSave(value: (DataManager, String) => Unit): Self = StObject.set(x, "save", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSet(value: (String, js.Any) => Unit): Self = StObject.set(x, "set", js.Any.fromFunction2(value))
    
    @scala.inline
    def setUnbind(value: js.Any => Unit): Self = StObject.set(x, "unbind", js.Any.fromFunction1(value))
  }
}
