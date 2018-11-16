package typings
package ejDotWebDotAllLib.ejNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ej.Model")
@js.native
class Model protected () extends js.Object {
  def this(json: js.Any, table: java.lang.String, name: java.lang.String) = this()
  var formElements: js.Array[java.lang.String] = js.native
  def bindTo(element: js.Any): scala.Unit = js.native
  def changeState(state: scala.Boolean, args: js.Any): scala.Unit = js.native
  def computes(value: js.Any): scala.Unit = js.native
  def get(field: java.lang.String): js.Any = js.native
  def markCommit(): scala.Unit = js.native
  def markDelete(): scala.Unit = js.native
  def off(eventName: java.lang.String, handler: js.Any): scala.Unit = js.native
  def on(eventName: java.lang.String, handler: js.Any): scala.Unit = js.native
  def properties(): js.Any = js.native
  def revert(suspendEvent: js.Any): scala.Unit = js.native
  def save(dm: DataManager, key: java.lang.String): scala.Unit = js.native
  def set(field: java.lang.String, value: js.Any): scala.Unit = js.native
  def unbind(element: js.Any): scala.Unit = js.native
}

