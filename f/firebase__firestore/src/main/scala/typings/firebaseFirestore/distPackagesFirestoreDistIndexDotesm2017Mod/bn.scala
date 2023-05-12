package typings.firebaseFirestore.distPackagesFirestoreDistIndexDotesm2017Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Filter that matches on key fields within an array. */ trait bn
  extends StObject
     with mn {
  
  var keys: Any
}
object bn {
  
  inline def apply(
    field: Any,
    getFilters: () => js.Array[mn],
    getFirstInequalityField: () => Any,
    getFlattenedFilters: () => js.Array[mn],
    isInequality: () => Boolean,
    keys: Any,
    matches: Any => Boolean | Unit,
    matchesComparison: Any => Boolean | Unit,
    op: Any,
    value: Any
  ): bn = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], getFilters = js.Any.fromFunction0(getFilters), getFirstInequalityField = js.Any.fromFunction0(getFirstInequalityField), getFlattenedFilters = js.Any.fromFunction0(getFlattenedFilters), isInequality = js.Any.fromFunction0(isInequality), keys = keys.asInstanceOf[js.Any], matches = js.Any.fromFunction1(matches), matchesComparison = js.Any.fromFunction1(matchesComparison), op = op.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[bn]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: bn] (val x: Self) extends AnyVal {
    
    inline def setKeys(value: Any): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
  }
}
