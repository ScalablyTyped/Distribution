package typings
package ejDotWebDotAllLib.ejNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ej.TableModel")
@js.native
class TableModel protected () extends js.Object {
  def this(name: java.lang.String, jsonArray: js.Array[_], dataManager: DataManager, modelComputed: js.Any) = this()
  def bindTo(element: js.Any): scala.Unit = js.native
  def get(index: scala.Double): scala.Unit = js.native
  def getChanges(): Changes = js.native
  def insert(json: js.Any): scala.Unit = js.native
  def isDirty(): scala.Boolean = js.native
  def length(): scala.Double = js.native
  def off(eventName: java.lang.String, handler: js.Any): scala.Unit = js.native
  def on(eventName: java.lang.String, handler: js.Any): scala.Unit = js.native
  def rejectChanges(): scala.Unit = js.native
  def remove(key: java.lang.String): scala.Unit = js.native
  def saveChanges(): scala.Unit = js.native
  def setDataManager(dataManager: DataManager): scala.Unit = js.native
  def setDirty(dirty: js.Any, model: js.Any): scala.Unit = js.native
  def toArray(): js.Array[_] = js.native
  def update(value: js.Any): scala.Unit = js.native
}

