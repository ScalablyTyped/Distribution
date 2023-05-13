package typings.firebaseFirestore.distLitePackagesFirestoreDistLiteIndexDotbrowserDotesm2017Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Xt_
  extends StObject
     with Jt {
  
  var field: Any
  
  def getFilters(): js.Array[Xt_]
  
  def getFirstInequalityField(): Any
  
  def getFlattenedFilters(): js.Array[Xt_]
  
  def isInequality(): Boolean
  
  def matches(t: Any): Boolean | Unit
  
  def matchesComparison(t: Any): Boolean | Unit
  
  var op: Any
  
  var value: Any
}
object Xt_ {
  
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
  ): Xt_ = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], getFilters = js.Any.fromFunction0(getFilters), getFirstInequalityField = js.Any.fromFunction0(getFirstInequalityField), getFlattenedFilters = js.Any.fromFunction0(getFlattenedFilters), isInequality = js.Any.fromFunction0(isInequality), matches = js.Any.fromFunction1(matches), matchesComparison = js.Any.fromFunction1(matchesComparison), op = op.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Xt_]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Xt_] (val x: Self) extends AnyVal {
    
    inline def setField(value: Any): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setGetFilters(value: () => js.Array[Xt_]): Self = StObject.set(x, "getFilters", js.Any.fromFunction0(value))
    
    inline def setGetFirstInequalityField(value: () => Any): Self = StObject.set(x, "getFirstInequalityField", js.Any.fromFunction0(value))
    
    inline def setGetFlattenedFilters(value: () => js.Array[Xt_]): Self = StObject.set(x, "getFlattenedFilters", js.Any.fromFunction0(value))
    
    inline def setIsInequality(value: () => Boolean): Self = StObject.set(x, "isInequality", js.Any.fromFunction0(value))
    
    inline def setMatches(value: Any => Boolean | Unit): Self = StObject.set(x, "matches", js.Any.fromFunction1(value))
    
    inline def setMatchesComparison(value: Any => Boolean | Unit): Self = StObject.set(x, "matchesComparison", js.Any.fromFunction1(value))
    
    inline def setOp(value: Any): Self = StObject.set(x, "op", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
