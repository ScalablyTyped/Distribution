package typings.ejDotWebDotAll.ej

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ej.Model")
@js.native
class Model protected () extends js.Object {
  def this(json: js.Any, table: String, name: String) = this()
  var formElements: js.Array[String] = js.native
  def bindTo(element: js.Any): Unit = js.native
  def changeState(state: Boolean, args: js.Any): Unit = js.native
  def computes(value: js.Any): Unit = js.native
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

