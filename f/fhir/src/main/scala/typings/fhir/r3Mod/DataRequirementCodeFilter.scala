package typings.fhir.r3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataRequirementCodeFilter
  extends StObject
     with Element {
  
  var _path: js.UndefOr[Element] = js.undefined
  
  var _valueCode: js.UndefOr[js.Array[Element]] = js.undefined
  
  var _valueSetString: js.UndefOr[Element] = js.undefined
  
  /**
    * The code-valued attribute of the filter. The specified path must be resolvable from the type of the required data. The path is allowed to contain qualifiers (.) to traverse sub-elements, as well as indexers ([x]) to traverse multiple-cardinality sub-elements. Note that the index must be an integer constant. The path must resolve to an element of type code, Coding, or CodeableConcept.
    */
  var path: String
  
  /**
    * The codes for the code filter. Only one of valueSet, valueCode, valueCoding, or valueCodeableConcept may be specified. If values are given, the filter will return only those data items for which the code-valued attribute specified by the path has a value that is one of the specified codes.
    */
  var valueCode: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The CodeableConcepts for the code filter. Only one of valueSet, valueCode, valueConding, or valueCodeableConcept may be specified. If values are given, the filter will return only those data items for which the code-valued attribute specified by the path has a value that is one of the specified CodeableConcepts.
    */
  var valueCodeableConcept: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * The Codings for the code filter. Only one of valueSet, valueCode, valueConding, or valueCodeableConcept may be specified. If values are given, the filter will return only those data items for which the code-valued attribute specified by the path has a value that is one of the specified Codings.
    */
  var valueCoding: js.UndefOr[js.Array[Coding]] = js.undefined
  
  /**
    * The valueset for the code filter. The valueSet and value elements are exclusive. If valueSet is specified, the filter will return only those data items for which the value of the code-valued element specified in the path is a member of the specified valueset.
    */
  var valueSetReference: js.UndefOr[Reference] = js.undefined
  
  /**
    * The valueset for the code filter. The valueSet and value elements are exclusive. If valueSet is specified, the filter will return only those data items for which the value of the code-valued element specified in the path is a member of the specified valueset.
    */
  var valueSetString: js.UndefOr[String] = js.undefined
}
object DataRequirementCodeFilter {
  
  inline def apply(path: String): DataRequirementCodeFilter = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataRequirementCodeFilter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DataRequirementCodeFilter] (val x: Self) extends AnyVal {
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setValueCode(value: js.Array[String]): Self = StObject.set(x, "valueCode", value.asInstanceOf[js.Any])
    
    inline def setValueCodeUndefined: Self = StObject.set(x, "valueCode", js.undefined)
    
    inline def setValueCodeVarargs(value: String*): Self = StObject.set(x, "valueCode", js.Array(value*))
    
    inline def setValueCodeableConcept(value: js.Array[CodeableConcept]): Self = StObject.set(x, "valueCodeableConcept", value.asInstanceOf[js.Any])
    
    inline def setValueCodeableConceptUndefined: Self = StObject.set(x, "valueCodeableConcept", js.undefined)
    
    inline def setValueCodeableConceptVarargs(value: CodeableConcept*): Self = StObject.set(x, "valueCodeableConcept", js.Array(value*))
    
    inline def setValueCoding(value: js.Array[Coding]): Self = StObject.set(x, "valueCoding", value.asInstanceOf[js.Any])
    
    inline def setValueCodingUndefined: Self = StObject.set(x, "valueCoding", js.undefined)
    
    inline def setValueCodingVarargs(value: Coding*): Self = StObject.set(x, "valueCoding", js.Array(value*))
    
    inline def setValueSetReference(value: Reference): Self = StObject.set(x, "valueSetReference", value.asInstanceOf[js.Any])
    
    inline def setValueSetReferenceUndefined: Self = StObject.set(x, "valueSetReference", js.undefined)
    
    inline def setValueSetString(value: String): Self = StObject.set(x, "valueSetString", value.asInstanceOf[js.Any])
    
    inline def setValueSetStringUndefined: Self = StObject.set(x, "valueSetString", js.undefined)
    
    inline def set_path(value: Element): Self = StObject.set(x, "_path", value.asInstanceOf[js.Any])
    
    inline def set_pathUndefined: Self = StObject.set(x, "_path", js.undefined)
    
    inline def set_valueCode(value: js.Array[Element]): Self = StObject.set(x, "_valueCode", value.asInstanceOf[js.Any])
    
    inline def set_valueCodeUndefined: Self = StObject.set(x, "_valueCode", js.undefined)
    
    inline def set_valueCodeVarargs(value: Element*): Self = StObject.set(x, "_valueCode", js.Array(value*))
    
    inline def set_valueSetString(value: Element): Self = StObject.set(x, "_valueSetString", value.asInstanceOf[js.Any])
    
    inline def set_valueSetStringUndefined: Self = StObject.set(x, "_valueSetString", js.undefined)
  }
}
