package typings.firebaseFirestore.distInternalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An `AppliableConstraint` is an abstraction of a constraint that can be applied
  * to a Firestore query.
  */
trait AppliableConstraint extends StObject {
  
  /**
    * Takes the provided {@link Query} and returns a copy of the {@link Query} with this
    * {@link AppliableConstraint} applied.
    */
  def _apply[T](query: Query_[T]): Query_[T]
}
object AppliableConstraint {
  
  inline def apply(_apply: Query_[Any] => Query_[Any]): AppliableConstraint = {
    val __obj = js.Dynamic.literal(_apply = js.Any.fromFunction1(_apply))
    __obj.asInstanceOf[AppliableConstraint]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AppliableConstraint] (val x: Self) extends AnyVal {
    
    inline def set_apply(value: Query_[Any] => Query_[Any]): Self = StObject.set(x, "_apply", js.Any.fromFunction1(value))
  }
}
