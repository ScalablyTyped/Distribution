package typings
package ejDotWebDotAllLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AutoInit extends js.Object {
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

object Anon_AutoInit {
  @scala.inline
  def apply(
    autoInit: scala.Boolean,
    destroyAll: js.Function1[stdLib.Element, scala.Unit],
    init: js.Function1[stdLib.Element, scala.Unit],
    register: js.Function3[java.lang.String, java.lang.String, js.Any, scala.Unit],
    registerInstance: js.Function4[stdLib.Element, java.lang.String, java.lang.String, js.Any, scala.Unit],
    registeredInstances: js.Array[_],
    registeredWidgets: js.Array[_]
  ): Anon_AutoInit = {
    val __obj = js.Dynamic.literal(autoInit = autoInit, destroyAll = destroyAll, init = init, register = register, registerInstance = registerInstance, registeredInstances = registeredInstances, registeredWidgets = registeredWidgets)
  
    __obj.asInstanceOf[Anon_AutoInit]
  }
}

