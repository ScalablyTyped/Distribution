package typings.googleCloudFirestore.FirebaseFirestore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FieldValue extends StObject {
  
  /**
    * Returns true if this `FieldValue` is equal to the provided one.
    *
    * @param other The `FieldValue` to compare against.
    * @return true if this `FieldValue` is equal to the provided one.
    */
  def isEqual(other: FieldValue): Boolean
}
object FieldValue {
  
  @scala.inline
  def apply(isEqual: FieldValue => Boolean): FieldValue = {
    val __obj = js.Dynamic.literal(isEqual = js.Any.fromFunction1(isEqual))
    __obj.asInstanceOf[FieldValue]
  }
  
  @scala.inline
  implicit class FieldValueMutableBuilder[Self <: FieldValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsEqual(value: FieldValue => Boolean): Self = StObject.set(x, "isEqual", js.Any.fromFunction1(value))
  }
}
