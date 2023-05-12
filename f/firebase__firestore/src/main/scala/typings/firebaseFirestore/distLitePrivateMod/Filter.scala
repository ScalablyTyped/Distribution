package typings.firebaseFirestore.distLitePrivateMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Filter extends StObject {
  
  def getFilters(): js.Array[Filter]
  
  def getFirstInequalityField(): (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FieldPath_2 */ Any) | Null
  
  def getFlattenedFilters(): js.Array[FieldFilter]
  
  def matches(doc: Document2): Boolean
}
object Filter {
  
  inline def apply(
    getFilters: () => js.Array[Filter],
    getFirstInequalityField: () => (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FieldPath_2 */ Any) | Null,
    getFlattenedFilters: () => js.Array[FieldFilter],
    matches: Document2 => Boolean
  ): Filter = {
    val __obj = js.Dynamic.literal(getFilters = js.Any.fromFunction0(getFilters), getFirstInequalityField = js.Any.fromFunction0(getFirstInequalityField), getFlattenedFilters = js.Any.fromFunction0(getFlattenedFilters), matches = js.Any.fromFunction1(matches))
    __obj.asInstanceOf[Filter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Filter] (val x: Self) extends AnyVal {
    
    inline def setGetFilters(value: () => js.Array[Filter]): Self = StObject.set(x, "getFilters", js.Any.fromFunction0(value))
    
    inline def setGetFirstInequalityField(
      value: () => (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FieldPath_2 */ Any) | Null
    ): Self = StObject.set(x, "getFirstInequalityField", js.Any.fromFunction0(value))
    
    inline def setGetFlattenedFilters(value: () => js.Array[FieldFilter]): Self = StObject.set(x, "getFlattenedFilters", js.Any.fromFunction0(value))
    
    inline def setMatches(value: Document2 => Boolean): Self = StObject.set(x, "matches", js.Any.fromFunction1(value))
  }
}
