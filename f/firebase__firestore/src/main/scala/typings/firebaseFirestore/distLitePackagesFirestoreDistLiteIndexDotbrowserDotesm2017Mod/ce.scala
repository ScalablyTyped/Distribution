package typings.firebaseFirestore.distLitePackagesFirestoreDistLiteIndexDotbrowserDotesm2017Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A Filter that implements the array-contains-any operator. */ trait ce
  extends StObject
     with Xt_
object ce {
  
  inline def apply(
    field: Any,
    getFilters: () => js.Array[Xt_],
    getFirstInequalityField: () => Any,
    getFlattenedFilters: () => js.Array[Xt_],
    isInequality: () => Boolean,
    matches: Any => Boolean | Unit,
    matchesComparison: Any => Boolean | Unit,
    op: Any,
    value: Any
  ): ce = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], getFilters = js.Any.fromFunction0(getFilters), getFirstInequalityField = js.Any.fromFunction0(getFirstInequalityField), getFlattenedFilters = js.Any.fromFunction0(getFlattenedFilters), isInequality = js.Any.fromFunction0(isInequality), matches = js.Any.fromFunction1(matches), matchesComparison = js.Any.fromFunction1(matchesComparison), op = op.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ce]
  }
}
