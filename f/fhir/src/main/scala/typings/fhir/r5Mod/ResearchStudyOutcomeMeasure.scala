package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResearchStudyOutcomeMeasure
  extends StObject
     with BackboneElement {
  
  var _description: js.UndefOr[Element] = js.undefined
  
  var _name: js.UndefOr[Element] = js.undefined
  
  /**
    * Description of the outcome.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * Label for the outcome.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Structured outcome definition.
    */
  var reference: js.UndefOr[Reference] = js.undefined
  
  /**
    * The parameter or characteristic being assessed as one of the values by which the study is assessed.
    */
  var `type`: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
}
object ResearchStudyOutcomeMeasure {
  
  inline def apply(): ResearchStudyOutcomeMeasure = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResearchStudyOutcomeMeasure]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResearchStudyOutcomeMeasure] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setReference(value: Reference): Self = StObject.set(x, "reference", value.asInstanceOf[js.Any])
    
    inline def setReferenceUndefined: Self = StObject.set(x, "reference", js.undefined)
    
    inline def setType(value: js.Array[CodeableConcept]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setTypeVarargs(value: CodeableConcept*): Self = StObject.set(x, "type", js.Array(value*))
    
    inline def set_description(value: Element): Self = StObject.set(x, "_description", value.asInstanceOf[js.Any])
    
    inline def set_descriptionUndefined: Self = StObject.set(x, "_description", js.undefined)
    
    inline def set_name(value: Element): Self = StObject.set(x, "_name", value.asInstanceOf[js.Any])
    
    inline def set_nameUndefined: Self = StObject.set(x, "_name", js.undefined)
  }
}
