package typings.firebaseFirestore.distLitePrivateMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FieldFilter
  extends StObject
     with Filter {
  
  val field: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FieldPath_2 */ Any
  
  def isInequality(): Boolean
  
  /* protected */ def matchesComparison(comparison: Double): Boolean
  
  val op: Operator
  
  val value: Value
}
object FieldFilter {
  
  inline def apply(
    field: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FieldPath_2 */ Any,
    getFilters: () => js.Array[Filter],
    getFirstInequalityField: () => (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FieldPath_2 */ Any) | Null,
    getFlattenedFilters: () => js.Array[FieldFilter],
    isInequality: () => Boolean,
    matches: Document2 => Boolean,
    matchesComparison: Double => Boolean,
    op: Operator,
    value: Value
  ): FieldFilter = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], getFilters = js.Any.fromFunction0(getFilters), getFirstInequalityField = js.Any.fromFunction0(getFirstInequalityField), getFlattenedFilters = js.Any.fromFunction0(getFlattenedFilters), isInequality = js.Any.fromFunction0(isInequality), matches = js.Any.fromFunction1(matches), matchesComparison = js.Any.fromFunction1(matchesComparison), op = op.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldFilter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FieldFilter] (val x: Self) extends AnyVal {
    
    inline def setField(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FieldPath_2 */ Any
    ): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setIsInequality(value: () => Boolean): Self = StObject.set(x, "isInequality", js.Any.fromFunction0(value))
    
    inline def setMatchesComparison(value: Double => Boolean): Self = StObject.set(x, "matchesComparison", js.Any.fromFunction1(value))
    
    inline def setOp(value: Operator): Self = StObject.set(x, "op", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Value): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
