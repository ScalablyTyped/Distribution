package typings.ejWebAll.ej

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TableModel extends js.Object {
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
  @scala.inline
  implicit class TableModelOps[Self <: TableModel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBindTo(value: js.Any => Unit): Self = this.set("bindTo", js.Any.fromFunction1(value))
    @scala.inline
    def setGet(value: Double => Unit): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setGetChanges(value: () => Changes): Self = this.set("getChanges", js.Any.fromFunction0(value))
    @scala.inline
    def setInsert(value: js.Any => Unit): Self = this.set("insert", js.Any.fromFunction1(value))
    @scala.inline
    def setIsDirty(value: () => Boolean): Self = this.set("isDirty", js.Any.fromFunction0(value))
    @scala.inline
    def setLength(value: () => Double): Self = this.set("length", js.Any.fromFunction0(value))
    @scala.inline
    def setOff(value: (String, js.Any) => Unit): Self = this.set("off", js.Any.fromFunction2(value))
    @scala.inline
    def setOn(value: (String, js.Any) => Unit): Self = this.set("on", js.Any.fromFunction2(value))
    @scala.inline
    def setRejectChanges(value: () => Unit): Self = this.set("rejectChanges", js.Any.fromFunction0(value))
    @scala.inline
    def setRemove(value: String => Unit): Self = this.set("remove", js.Any.fromFunction1(value))
    @scala.inline
    def setSaveChanges(value: () => Unit): Self = this.set("saveChanges", js.Any.fromFunction0(value))
    @scala.inline
    def setSetDataManager(value: DataManager => Unit): Self = this.set("setDataManager", js.Any.fromFunction1(value))
    @scala.inline
    def setSetDirty(value: (js.Any, js.Any) => Unit): Self = this.set("setDirty", js.Any.fromFunction2(value))
    @scala.inline
    def setToArray(value: () => js.Array[_]): Self = this.set("toArray", js.Any.fromFunction0(value))
    @scala.inline
    def setUpdate(value: js.Any => Unit): Self = this.set("update", js.Any.fromFunction1(value))
  }
  
}

