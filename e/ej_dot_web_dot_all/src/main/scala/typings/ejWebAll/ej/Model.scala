package typings.ejWebAll.ej

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Model extends js.Object {
  
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
  implicit class ModelOps[Self <: Model] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBindTo(value: js.Any => Unit): Self = this.set("bindTo", js.Any.fromFunction1(value))
    
    @scala.inline
    def setChangeState(value: (Boolean, js.Any) => Unit): Self = this.set("changeState", js.Any.fromFunction2(value))
    
    @scala.inline
    def setComputes(value: js.Any => Unit): Self = this.set("computes", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFormElementsVarargs(value: String*): Self = this.set("formElements", js.Array(value :_*))
    
    @scala.inline
    def setFormElements(value: js.Array[String]): Self = this.set("formElements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGet(value: String => js.Any): Self = this.set("get", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMarkCommit(value: () => Unit): Self = this.set("markCommit", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMarkDelete(value: () => Unit): Self = this.set("markDelete", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOff(value: (String, js.Any) => Unit): Self = this.set("off", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOn(value: (String, js.Any) => Unit): Self = this.set("on", js.Any.fromFunction2(value))
    
    @scala.inline
    def setProperties(value: () => js.Any): Self = this.set("properties", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRevert(value: js.Any => Unit): Self = this.set("revert", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSave(value: (DataManager, String) => Unit): Self = this.set("save", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSet(value: (String, js.Any) => Unit): Self = this.set("set", js.Any.fromFunction2(value))
    
    @scala.inline
    def setUnbind(value: js.Any => Unit): Self = this.set("unbind", js.Any.fromFunction1(value))
  }
}
