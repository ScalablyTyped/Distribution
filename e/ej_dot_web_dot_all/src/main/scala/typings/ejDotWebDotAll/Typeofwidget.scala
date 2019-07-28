package typings.ejDotWebDotAll

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofwidget extends js.Object {
  val autoInit: Boolean
  val registeredInstances: js.Array[_]
  val registeredWidgets: js.Array[_]
  def destroyAll(elements: Element): Unit
  def init(element: Element): Unit
  def register(pluginName: String, className: String, prototype: js.Any): Unit
  def registerInstance(element: Element, pluginName: String, className: String, prototype: js.Any): Unit
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
    val __obj = js.Dynamic.literal(autoInit = autoInit, destroyAll = js.Any.fromFunction1(destroyAll), init = js.Any.fromFunction1(init), register = js.Any.fromFunction3(register), registerInstance = js.Any.fromFunction4(registerInstance), registeredInstances = registeredInstances, registeredWidgets = registeredWidgets)
  
    __obj.asInstanceOf[Typeofwidget]
  }
}

