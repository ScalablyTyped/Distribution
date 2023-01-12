package typings.fhir.r4Mod

import typings.fhir.fhirStrings.ascending
import typings.fhir.fhirStrings.descending
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataRequirementSort
  extends StObject
     with Element {
  
  var _direction: js.UndefOr[Element] = js.undefined
  
  var _path: js.UndefOr[Element] = js.undefined
  
  /**
    * The direction of the sort, ascending or descending.
    */
  var direction: ascending | descending
  
  /**
    * The attribute of the sort. The specified path must be resolvable from the type of the required data. The path is allowed to contain qualifiers (.) to traverse sub-elements, as well as indexers ([x]) to traverse multiple-cardinality sub-elements. Note that the index must be an integer constant.
    */
  var path: String
}
object DataRequirementSort {
  
  inline def apply(direction: ascending | descending, path: String): DataRequirementSort = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataRequirementSort]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DataRequirementSort] (val x: Self) extends AnyVal {
    
    inline def setDirection(value: ascending | descending): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def set_direction(value: Element): Self = StObject.set(x, "_direction", value.asInstanceOf[js.Any])
    
    inline def set_directionUndefined: Self = StObject.set(x, "_direction", js.undefined)
    
    inline def set_path(value: Element): Self = StObject.set(x, "_path", value.asInstanceOf[js.Any])
    
    inline def set_pathUndefined: Self = StObject.set(x, "_path", js.undefined)
  }
}
