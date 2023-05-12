package typings.firebaseFirestore.distPackagesFirestoreDistIndexDotesm2017Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait mn
  extends StObject
     with wn {
  
  var field: Any
  
  def getFilters(): js.Array[mn]
  
  def getFirstInequalityField(): Any
  
  def getFlattenedFilters(): js.Array[mn]
  
  def isInequality(): Boolean
  
  def matches(t: Any): Boolean | Unit
  
  def matchesComparison(t: Any): Boolean | Unit
  
  var op: Any
  
  var value: Any
}
object mn {
  
  inline def apply(
    field: Any,
    getFilters: () => js.Array[mn],
    getFirstInequalityField: () => Any,
    getFlattenedFilters: () => js.Array[mn],
    isInequality: () => Boolean,
    matches: Any => Boolean | Unit,
    matchesComparison: Any => Boolean | Unit,
    op: Any,
    value: Any
  ): mn = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], getFilters = js.Any.fromFunction0(getFilters), getFirstInequalityField = js.Any.fromFunction0(getFirstInequalityField), getFlattenedFilters = js.Any.fromFunction0(getFlattenedFilters), isInequality = js.Any.fromFunction0(isInequality), matches = js.Any.fromFunction1(matches), matchesComparison = js.Any.fromFunction1(matchesComparison), op = op.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[mn]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: mn] (val x: Self) extends AnyVal {
    
    inline def setField(value: Any): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setGetFilters(value: () => js.Array[mn]): Self = StObject.set(x, "getFilters", js.Any.fromFunction0(value))
    
    inline def setGetFirstInequalityField(value: () => Any): Self = StObject.set(x, "getFirstInequalityField", js.Any.fromFunction0(value))
    
    inline def setGetFlattenedFilters(value: () => js.Array[mn]): Self = StObject.set(x, "getFlattenedFilters", js.Any.fromFunction0(value))
    
    inline def setIsInequality(value: () => Boolean): Self = StObject.set(x, "isInequality", js.Any.fromFunction0(value))
    
    inline def setMatches(value: Any => Boolean | Unit): Self = StObject.set(x, "matches", js.Any.fromFunction1(value))
    
    inline def setMatchesComparison(value: Any => Boolean | Unit): Self = StObject.set(x, "matchesComparison", js.Any.fromFunction1(value))
    
    inline def setOp(value: Any): Self = StObject.set(x, "op", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
