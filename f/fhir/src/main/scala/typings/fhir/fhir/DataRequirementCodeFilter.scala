package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * What codes are expected
  */
trait DataRequirementCodeFilter
  extends StObject
     with Element {
  
  /**
    * Contains extended information for property 'path'.
    */
  var _path: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'valueCode'.
    */
  var _valueCode: js.UndefOr[js.Array[Element]] = js.undefined
  
  /**
    * Contains extended information for property 'valueSetString'.
    */
  var _valueSetString: js.UndefOr[Element] = js.undefined
  
  /**
    * The code-valued attribute of the filter
    */
  var path: String
  
  /**
    * What code is expected
    */
  var valueCode: js.UndefOr[js.Array[code]] = js.undefined
  
  /**
    * What CodeableConcept is expected
    */
  var valueCodeableConcept: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * What Coding is expected
    */
  var valueCoding: js.UndefOr[js.Array[Coding]] = js.undefined
  
  /**
    * Valueset for the filter
    */
  var valueSetReference: js.UndefOr[Reference] = js.undefined
  
  /**
    * Valueset for the filter
    */
  var valueSetString: js.UndefOr[String] = js.undefined
}
object DataRequirementCodeFilter {
  
  @scala.inline
  def apply(path: String): DataRequirementCodeFilter = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataRequirementCodeFilter]
  }
  
  @scala.inline
  implicit class DataRequirementCodeFilterMutableBuilder[Self <: DataRequirementCodeFilter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueCode(value: js.Array[code]): Self = StObject.set(x, "valueCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueCodeUndefined: Self = StObject.set(x, "valueCode", js.undefined)
    
    @scala.inline
    def setValueCodeVarargs(value: code*): Self = StObject.set(x, "valueCode", js.Array(value :_*))
    
    @scala.inline
    def setValueCodeableConcept(value: js.Array[CodeableConcept]): Self = StObject.set(x, "valueCodeableConcept", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueCodeableConceptUndefined: Self = StObject.set(x, "valueCodeableConcept", js.undefined)
    
    @scala.inline
    def setValueCodeableConceptVarargs(value: CodeableConcept*): Self = StObject.set(x, "valueCodeableConcept", js.Array(value :_*))
    
    @scala.inline
    def setValueCoding(value: js.Array[Coding]): Self = StObject.set(x, "valueCoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueCodingUndefined: Self = StObject.set(x, "valueCoding", js.undefined)
    
    @scala.inline
    def setValueCodingVarargs(value: Coding*): Self = StObject.set(x, "valueCoding", js.Array(value :_*))
    
    @scala.inline
    def setValueSetReference(value: Reference): Self = StObject.set(x, "valueSetReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueSetReferenceUndefined: Self = StObject.set(x, "valueSetReference", js.undefined)
    
    @scala.inline
    def setValueSetString(value: String): Self = StObject.set(x, "valueSetString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueSetStringUndefined: Self = StObject.set(x, "valueSetString", js.undefined)
    
    @scala.inline
    def set_path(value: Element): Self = StObject.set(x, "_path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_pathUndefined: Self = StObject.set(x, "_path", js.undefined)
    
    @scala.inline
    def set_valueCode(value: js.Array[Element]): Self = StObject.set(x, "_valueCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_valueCodeUndefined: Self = StObject.set(x, "_valueCode", js.undefined)
    
    @scala.inline
    def set_valueCodeVarargs(value: Element*): Self = StObject.set(x, "_valueCode", js.Array(value :_*))
    
    @scala.inline
    def set_valueSetString(value: Element): Self = StObject.set(x, "_valueSetString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_valueSetStringUndefined: Self = StObject.set(x, "_valueSetString", js.undefined)
  }
}
