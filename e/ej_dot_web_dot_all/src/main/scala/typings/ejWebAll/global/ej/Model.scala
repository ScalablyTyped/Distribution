package typings.ejWebAll.global.ej

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ej.Model")
@js.native
class Model protected ()
  extends typings.ejWebAll.ej.Model {
  def this(json: js.Any, table: String, name: String) = this()
  /* CompleteClass */
  override var formElements: js.Array[String] = js.native
  /* CompleteClass */
  override def bindTo(element: js.Any): Unit = js.native
  /* CompleteClass */
  override def changeState(state: Boolean, args: js.Any): Unit = js.native
  /* CompleteClass */
  override def computes(value: js.Any): Unit = js.native
  /* CompleteClass */
  override def get(field: String): js.Any = js.native
  /* CompleteClass */
  override def markCommit(): Unit = js.native
  /* CompleteClass */
  override def markDelete(): Unit = js.native
  /* CompleteClass */
  override def off(eventName: String, handler: js.Any): Unit = js.native
  /* CompleteClass */
  override def on(eventName: String, handler: js.Any): Unit = js.native
  /* CompleteClass */
  override def properties(): js.Any = js.native
  /* CompleteClass */
  override def revert(suspendEvent: js.Any): Unit = js.native
  /* CompleteClass */
  override def save(dm: typings.ejWebAll.ej.DataManager, key: String): Unit = js.native
  /* CompleteClass */
  override def set(field: String, value: js.Any): Unit = js.native
  /* CompleteClass */
  override def unbind(element: js.Any): Unit = js.native
}

