package typings
package ejDotWebDotAllLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofwidget extends js.Object {
  val autoInit: scala.Boolean
  val registeredInstances: js.Array[_]
  val registeredWidgets: js.Array[_]
  def destroyAll(elements: stdLib.Element): scala.Unit
  def init(element: stdLib.Element): scala.Unit
  def register(pluginName: java.lang.String, className: java.lang.String, prototype: js.Any): scala.Unit
  def registerInstance(
    element: stdLib.Element,
    pluginName: java.lang.String,
    className: java.lang.String,
    prototype: js.Any
  ): scala.Unit
}

object Typeofwidget {
  @scala.inline
  def apply(
    autoInit: scala.Boolean,
    destroyAll: stdLib.Element => scala.Unit,
    init: stdLib.Element => scala.Unit,
    register: (java.lang.String, java.lang.String, js.Any) => scala.Unit,
    registerInstance: (stdLib.Element, java.lang.String, java.lang.String, js.Any) => scala.Unit,
    registeredInstances: js.Array[_],
    registeredWidgets: js.Array[_]
  ): Typeofwidget = {
    val __obj = js.Dynamic.literal(autoInit = autoInit, destroyAll = js.Any.fromFunction1(destroyAll), init = js.Any.fromFunction1(init), register = js.Any.fromFunction3(register), registerInstance = js.Any.fromFunction4(registerInstance), registeredInstances = registeredInstances, registeredWidgets = registeredWidgets)
  
    __obj.asInstanceOf[Typeofwidget]
  }
}

