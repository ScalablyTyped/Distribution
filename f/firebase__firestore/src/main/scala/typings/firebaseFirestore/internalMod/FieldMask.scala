package typings.firebaseFirestore.internalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides a set of fields that can be used to partially patch a document.
  * FieldMask is used in conjunction with ObjectValue.
  * Examples:
  *   foo - Overwrites foo entirely with the provided value. If foo is not
  *         present in the companion ObjectValue, the field is deleted.
  *   foo.bar - Overwrites only the field bar of the object foo.
  *             If foo is not an object, foo is replaced with an object
  *             containing foo
  */
trait FieldMask extends StObject {
  
  /**
    * Verifies that `fieldPath` is included by at least one field in this field
    * mask.
    *
    * This is an O(n) operation, where `n` is the size of the field mask.
    */
  def covers(fieldPath: _FieldPath): Boolean
  
  val fields: js.Array[_FieldPath]
  
  def isEqual(other: FieldMask): Boolean
  
  /**
    * Returns a new FieldMask object that is the result of adding all the given
    * fields paths to this field mask.
    */
  def unionWith(extraFields: js.Array[_FieldPath]): FieldMask
}
object FieldMask {
  
  inline def apply(
    covers: _FieldPath => Boolean,
    fields: js.Array[_FieldPath],
    isEqual: FieldMask => Boolean,
    unionWith: js.Array[_FieldPath] => FieldMask
  ): FieldMask = {
    val __obj = js.Dynamic.literal(covers = js.Any.fromFunction1(covers), fields = fields.asInstanceOf[js.Any], isEqual = js.Any.fromFunction1(isEqual), unionWith = js.Any.fromFunction1(unionWith))
    __obj.asInstanceOf[FieldMask]
  }
  
  extension [Self <: FieldMask](x: Self) {
    
    inline def setCovers(value: _FieldPath => Boolean): Self = StObject.set(x, "covers", js.Any.fromFunction1(value))
    
    inline def setFields(value: js.Array[_FieldPath]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsVarargs(value: _FieldPath*): Self = StObject.set(x, "fields", js.Array(value*))
    
    inline def setIsEqual(value: FieldMask => Boolean): Self = StObject.set(x, "isEqual", js.Any.fromFunction1(value))
    
    inline def setUnionWith(value: js.Array[_FieldPath] => FieldMask): Self = StObject.set(x, "unionWith", js.Any.fromFunction1(value))
  }
}
