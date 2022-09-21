package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataRequirementCodeFilter
  extends StObject
     with Element {
  
  var _path: js.UndefOr[Element] = js.undefined
  
  var _searchParam: js.UndefOr[Element] = js.undefined
  
  var _valueSet: js.UndefOr[Element] = js.undefined
  
  /**
    * The codes for the code filter. If values are given, the filter will return only those data items for which the code-valued attribute specified by the path has a value that is one of the specified codes. If codes are specified in addition to a value set, the filter returns items matching a code in the value set or one of the specified codes.
    */
  var code: js.UndefOr[js.Array[Coding]] = js.undefined
  
  /**
    * The path attribute contains a [Simple FHIRPath Subset](fhirpath.html#simple) that allows path traversal, but not calculation.
    */
  var path: js.UndefOr[String] = js.undefined
  
  /**
    * A token parameter that refers to a search parameter defined on the specified type of the DataRequirement, and which searches on elements of type code, Coding, or CodeableConcept.
    */
  var searchParam: js.UndefOr[String] = js.undefined
  
  /**
    * The valueset for the code filter. The valueSet and code elements are additive. If valueSet is specified, the filter will return only those data items for which the value of the code-valued element specified in the path is a member of the specified valueset.
    */
  var valueSet: js.UndefOr[String] = js.undefined
}
object DataRequirementCodeFilter {
  
  inline def apply(): DataRequirementCodeFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataRequirementCodeFilter]
  }
  
  extension [Self <: DataRequirementCodeFilter](x: Self) {
    
    inline def setCode(value: js.Array[Coding]): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setCodeVarargs(value: Coding*): Self = StObject.set(x, "code", js.Array(value*))
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setSearchParam(value: String): Self = StObject.set(x, "searchParam", value.asInstanceOf[js.Any])
    
    inline def setSearchParamUndefined: Self = StObject.set(x, "searchParam", js.undefined)
    
    inline def setValueSet(value: String): Self = StObject.set(x, "valueSet", value.asInstanceOf[js.Any])
    
    inline def setValueSetUndefined: Self = StObject.set(x, "valueSet", js.undefined)
    
    inline def set_path(value: Element): Self = StObject.set(x, "_path", value.asInstanceOf[js.Any])
    
    inline def set_pathUndefined: Self = StObject.set(x, "_path", js.undefined)
    
    inline def set_searchParam(value: Element): Self = StObject.set(x, "_searchParam", value.asInstanceOf[js.Any])
    
    inline def set_searchParamUndefined: Self = StObject.set(x, "_searchParam", js.undefined)
    
    inline def set_valueSet(value: Element): Self = StObject.set(x, "_valueSet", value.asInstanceOf[js.Any])
    
    inline def set_valueSetUndefined: Self = StObject.set(x, "_valueSet", js.undefined)
  }
}
