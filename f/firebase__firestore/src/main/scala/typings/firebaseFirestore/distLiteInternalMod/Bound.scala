package typings.firebaseFirestore.distLiteInternalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a bound of a query.
  *
  * The bound is specified with the given components representing a position and
  * whether it's just before or just after the position (relative to whatever the
  * query order is).
  *
  * The position represents a logical index position for a query. It's a prefix
  * of values for the (potentially implicit) order by clauses of a query.
  *
  * Bound provides a function to determine whether a document comes before or
  * after a bound. This is influenced by whether the position is just before or
  * just after the provided values.
  */
trait Bound extends StObject {
  
  val inclusive: Boolean
  
  val position: js.Array[Value]
}
object Bound {
  
  inline def apply(inclusive: Boolean, position: js.Array[Value]): Bound = {
    val __obj = js.Dynamic.literal(inclusive = inclusive.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bound]
  }
  
  extension [Self <: Bound](x: Self) {
    
    inline def setInclusive(value: Boolean): Self = StObject.set(x, "inclusive", value.asInstanceOf[js.Any])
    
    inline def setPosition(value: js.Array[Value]): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionVarargs(value: Value*): Self = StObject.set(x, "position", js.Array(value*))
  }
}
