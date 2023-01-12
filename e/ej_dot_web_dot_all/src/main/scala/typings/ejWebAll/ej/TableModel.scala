package typings.ejWebAll.ej

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TableModel extends StObject {
  
  def bindTo(element: Any): Unit
  
  def get(index: Double): Unit
  
  def getChanges(): Changes
  
  def insert(json: Any): Unit
  
  def isDirty(): Boolean
  
  def length(): Double
  
  def off(eventName: String, handler: Any): Unit
  
  def on(eventName: String, handler: Any): Unit
  
  def rejectChanges(): Unit
  
  def remove(key: String): Unit
  
  def saveChanges(): Unit
  
  def setDataManager(dataManager: DataManager): Unit
  
  def setDirty(dirty: Any, model: Any): Unit
  
  def toArray(): js.Array[Any]
  
  def update(value: Any): Unit
}
object TableModel {
  
  inline def apply(
    bindTo: Any => Unit,
    get: Double => Unit,
    getChanges: () => Changes,
    insert: Any => Unit,
    isDirty: () => Boolean,
    length: () => Double,
    off: (String, Any) => Unit,
    on: (String, Any) => Unit,
    rejectChanges: () => Unit,
    remove: String => Unit,
    saveChanges: () => Unit,
    setDataManager: DataManager => Unit,
    setDirty: (Any, Any) => Unit,
    toArray: () => js.Array[Any],
    update: Any => Unit
  ): TableModel = {
    val __obj = js.Dynamic.literal(bindTo = js.Any.fromFunction1(bindTo), get = js.Any.fromFunction1(get), getChanges = js.Any.fromFunction0(getChanges), insert = js.Any.fromFunction1(insert), isDirty = js.Any.fromFunction0(isDirty), length = js.Any.fromFunction0(length), off = js.Any.fromFunction2(off), on = js.Any.fromFunction2(on), rejectChanges = js.Any.fromFunction0(rejectChanges), remove = js.Any.fromFunction1(remove), saveChanges = js.Any.fromFunction0(saveChanges), setDataManager = js.Any.fromFunction1(setDataManager), setDirty = js.Any.fromFunction2(setDirty), toArray = js.Any.fromFunction0(toArray), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[TableModel]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TableModel] (val x: Self) extends AnyVal {
    
    inline def setBindTo(value: Any => Unit): Self = StObject.set(x, "bindTo", js.Any.fromFunction1(value))
    
    inline def setGet(value: Double => Unit): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
    
    inline def setGetChanges(value: () => Changes): Self = StObject.set(x, "getChanges", js.Any.fromFunction0(value))
    
    inline def setInsert(value: Any => Unit): Self = StObject.set(x, "insert", js.Any.fromFunction1(value))
    
    inline def setIsDirty(value: () => Boolean): Self = StObject.set(x, "isDirty", js.Any.fromFunction0(value))
    
    inline def setLength(value: () => Double): Self = StObject.set(x, "length", js.Any.fromFunction0(value))
    
    inline def setOff(value: (String, Any) => Unit): Self = StObject.set(x, "off", js.Any.fromFunction2(value))
    
    inline def setOn(value: (String, Any) => Unit): Self = StObject.set(x, "on", js.Any.fromFunction2(value))
    
    inline def setRejectChanges(value: () => Unit): Self = StObject.set(x, "rejectChanges", js.Any.fromFunction0(value))
    
    inline def setRemove(value: String => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction1(value))
    
    inline def setSaveChanges(value: () => Unit): Self = StObject.set(x, "saveChanges", js.Any.fromFunction0(value))
    
    inline def setSetDataManager(value: DataManager => Unit): Self = StObject.set(x, "setDataManager", js.Any.fromFunction1(value))
    
    inline def setSetDirty(value: (Any, Any) => Unit): Self = StObject.set(x, "setDirty", js.Any.fromFunction2(value))
    
    inline def setToArray(value: () => js.Array[Any]): Self = StObject.set(x, "toArray", js.Any.fromFunction0(value))
    
    inline def setUpdate(value: Any => Unit): Self = StObject.set(x, "update", js.Any.fromFunction1(value))
  }
}
