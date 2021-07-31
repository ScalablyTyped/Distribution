package typings.firebase.mod.firebase.firestore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FieldPath extends StObject {
  
  /**
    * Returns true if this `FieldPath` is equal to the provided one.
    *
    * @param other The `FieldPath` to compare against.
    * @return true if this `FieldPath` is equal to the provided one.
    */
  def isEqual(other: FieldPath): Boolean
}
object FieldPath {
  
  @scala.inline
  def apply(isEqual: FieldPath => Boolean): FieldPath = {
    val __obj = js.Dynamic.literal(isEqual = js.Any.fromFunction1(isEqual))
    __obj.asInstanceOf[FieldPath]
  }
  
  @scala.inline
  implicit class FieldPathMutableBuilder[Self <: FieldPath] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsEqual(value: FieldPath => Boolean): Self = StObject.set(x, "isEqual", js.Any.fromFunction1(value))
  }
}
