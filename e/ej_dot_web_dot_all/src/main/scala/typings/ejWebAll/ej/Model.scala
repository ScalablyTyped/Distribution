package typings.ejWebAll.ej

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Model extends js.Object {
  var formElements: js.Array[String]
  def bindTo(element: js.Any): Unit
  def changeState(state: Boolean, args: js.Any): Unit
  def computes(value: js.Any): Unit
  def get(field: String): js.Any
  def markCommit(): Unit
  def markDelete(): Unit
  def off(eventName: String, handler: js.Any): Unit
  def on(eventName: String, handler: js.Any): Unit
  def properties(): js.Any
  def revert(suspendEvent: js.Any): Unit
  def save(dm: DataManager, key: String): Unit
  def set(field: String, value: js.Any): Unit
  def unbind(element: js.Any): Unit
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
}

