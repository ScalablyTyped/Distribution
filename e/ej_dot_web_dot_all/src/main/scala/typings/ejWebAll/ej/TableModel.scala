package typings.ejWebAll.ej

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableModel extends js.Object {
  def bindTo(element: js.Any): Unit
  def get(index: Double): Unit
  def getChanges(): Changes
  def insert(json: js.Any): Unit
  def isDirty(): Boolean
  def length(): Double
  def off(eventName: String, handler: js.Any): Unit
  def on(eventName: String, handler: js.Any): Unit
  def rejectChanges(): Unit
  def remove(key: String): Unit
  def saveChanges(): Unit
  def setDataManager(dataManager: DataManager): Unit
  def setDirty(dirty: js.Any, model: js.Any): Unit
  def toArray(): js.Array[_]
  def update(value: js.Any): Unit
}

object TableModel {
  @scala.inline
  def apply(
    bindTo: js.Any => Unit,
    get: Double => Unit,
    getChanges: () => Changes,
    insert: js.Any => Unit,
    isDirty: () => Boolean,
    length: () => Double,
    off: (String, js.Any) => Unit,
    on: (String, js.Any) => Unit,
    rejectChanges: () => Unit,
    remove: String => Unit,
    saveChanges: () => Unit,
    setDataManager: DataManager => Unit,
    setDirty: (js.Any, js.Any) => Unit,
    toArray: () => js.Array[_],
    update: js.Any => Unit
  ): TableModel = {
    val __obj = js.Dynamic.literal(bindTo = js.Any.fromFunction1(bindTo), get = js.Any.fromFunction1(get), getChanges = js.Any.fromFunction0(getChanges), insert = js.Any.fromFunction1(insert), isDirty = js.Any.fromFunction0(isDirty), length = js.Any.fromFunction0(length), off = js.Any.fromFunction2(off), on = js.Any.fromFunction2(on), rejectChanges = js.Any.fromFunction0(rejectChanges), remove = js.Any.fromFunction1(remove), saveChanges = js.Any.fromFunction0(saveChanges), setDataManager = js.Any.fromFunction1(setDataManager), setDirty = js.Any.fromFunction2(setDirty), toArray = js.Any.fromFunction0(toArray), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[TableModel]
  }
}

