package typings.ejWebAll.ej

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ej.TableModel")
@js.native
class TableModel protected () extends js.Object {
  def this(name: String, jsonArray: js.Array[_], dataManager: DataManager, modelComputed: js.Any) = this()
  def bindTo(element: js.Any): Unit = js.native
  def get(index: Double): Unit = js.native
  def getChanges(): Changes = js.native
  def insert(json: js.Any): Unit = js.native
  def isDirty(): Boolean = js.native
  def length(): Double = js.native
  def off(eventName: String, handler: js.Any): Unit = js.native
  def on(eventName: String, handler: js.Any): Unit = js.native
  def rejectChanges(): Unit = js.native
  def remove(key: String): Unit = js.native
  def saveChanges(): Unit = js.native
  def setDataManager(dataManager: DataManager): Unit = js.native
  def setDirty(dirty: js.Any, model: js.Any): Unit = js.native
  def toArray(): js.Array[_] = js.native
  def update(value: js.Any): Unit = js.native
}

