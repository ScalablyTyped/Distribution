package typings.firebaseFirestore.distLitePackagesFirestoreDistLiteIndexDotbrowserDotesm2017Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Filter that matches on key fields within an array. */ trait ee
  extends StObject
     with Jt {
  
  var keys: Any
}
object ee {
  
  inline def apply(
    field: Any,
    getFilters: () => js.Array[Jt],
    getFirstInequalityField: () => Any,
    getFlattenedFilters: () => js.Array[Jt],
    isInequality: () => Boolean,
    keys: Any,
    matches: Any => Boolean | Unit,
    matchesComparison: Any => Boolean | Unit,
    op: Any,
    value: Any
  ): ee = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], getFilters = js.Any.fromFunction0(getFilters), getFirstInequalityField = js.Any.fromFunction0(getFirstInequalityField), getFlattenedFilters = js.Any.fromFunction0(getFlattenedFilters), isInequality = js.Any.fromFunction0(isInequality), keys = keys.asInstanceOf[js.Any], matches = js.Any.fromFunction1(matches), matchesComparison = js.Any.fromFunction1(matchesComparison), op = op.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ee]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ee] (val x: Self) extends AnyVal {
    
    inline def setKeys(value: Any): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
  }
}
