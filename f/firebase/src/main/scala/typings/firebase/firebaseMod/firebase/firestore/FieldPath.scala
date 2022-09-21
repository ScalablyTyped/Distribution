package typings.firebase.firebaseMod.firebase.firestore

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
  
  inline def apply(isEqual: FieldPath => Boolean): FieldPath = {
    val __obj = js.Dynamic.literal(isEqual = js.Any.fromFunction1(isEqual))
    __obj.asInstanceOf[FieldPath]
  }
  
  extension [Self <: FieldPath](x: Self) {
    
    inline def setIsEqual(value: FieldPath => Boolean): Self = StObject.set(x, "isEqual", js.Any.fromFunction1(value))
  }
}
