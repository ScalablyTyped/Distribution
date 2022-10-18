package typings.firebaseFirestore.distLiteInternalMod

import typings.firebaseFirestore.anon.`21`
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An ObjectValue represents a MapValue in the Firestore Proto and offers the
  * ability to add and remove fields (via the ObjectValueBuilder).
  */
trait ObjectValue extends StObject {
  
  /**
    * Modifies `fieldsMap` by adding, replacing or deleting the specified
    * entries.
    */
  /* private */ var applyChanges: Any
  
  /**
    * Removes the field at the specified path. If there is no field at the
    * specified path, nothing is changed.
    *
    * @param path - The field path to remove.
    */
  def delete(path: FieldPath2): Unit
  
  /**
    * Returns the value at the given path or null.
    *
    * @param path - the path to search
    * @returns The value at the path or null if the path is not set.
    */
  def field(path: FieldPath2): Value | Null
  
  /**
    * Returns the map that contains the leaf element of `path`. If the parent
    * entry does not yet exist, or if it is not a map, a new map will be created.
    */
  /* private */ var getFieldsMap: Any
  
  def isEqual(other: ObjectValue): Boolean
  
  /**
    * Sets the field to the provided value.
    *
    * @param path - The field path to set.
    * @param value - The value to set.
    */
  def set(path: FieldPath2, value: Value): Unit
  
  /**
    * Sets the provided fields to the provided values.
    *
    * @param data - A map of fields to values (or null for deletes).
    */
  def setAll(data: Map[FieldPath2, Value | Null]): Unit
  
  val value: `21`
}
object ObjectValue {
  
  inline def apply(
    applyChanges: Any,
    delete: FieldPath2 => Unit,
    field: FieldPath2 => Value | Null,
    getFieldsMap: Any,
    isEqual: ObjectValue => Boolean,
    set: (FieldPath2, Value) => Unit,
    setAll: Map[FieldPath2, Value | Null] => Unit,
    value: `21`
  ): ObjectValue = {
    val __obj = js.Dynamic.literal(applyChanges = applyChanges.asInstanceOf[js.Any], delete = js.Any.fromFunction1(delete), field = js.Any.fromFunction1(field), getFieldsMap = getFieldsMap.asInstanceOf[js.Any], isEqual = js.Any.fromFunction1(isEqual), set = js.Any.fromFunction2(set), setAll = js.Any.fromFunction1(setAll), value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectValue]
  }
  
  extension [Self <: ObjectValue](x: Self) {
    
    inline def setApplyChanges(value: Any): Self = StObject.set(x, "applyChanges", value.asInstanceOf[js.Any])
    
    inline def setDelete(value: FieldPath2 => Unit): Self = StObject.set(x, "delete", js.Any.fromFunction1(value))
    
    inline def setField(value: FieldPath2 => Value | Null): Self = StObject.set(x, "field", js.Any.fromFunction1(value))
    
    inline def setGetFieldsMap(value: Any): Self = StObject.set(x, "getFieldsMap", value.asInstanceOf[js.Any])
    
    inline def setIsEqual(value: ObjectValue => Boolean): Self = StObject.set(x, "isEqual", js.Any.fromFunction1(value))
    
    inline def setSet(value: (FieldPath2, Value) => Unit): Self = StObject.set(x, "set", js.Any.fromFunction2(value))
    
    inline def setSetAll(value: Map[FieldPath2, Value | Null] => Unit): Self = StObject.set(x, "setAll", js.Any.fromFunction1(value))
    
    inline def setValue(value: `21`): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
