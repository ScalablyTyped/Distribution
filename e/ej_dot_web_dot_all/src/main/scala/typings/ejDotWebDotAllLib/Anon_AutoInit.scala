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

