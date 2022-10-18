package typings.fhir.r2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpecimenTreatment
  extends StObject
     with BackboneElement {
  
  var _description: js.UndefOr[Element] = js.undefined
  
  /**
    * Material used in the processing step.
    */
  var additive: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Textual description of procedure.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * A coded value specifying the procedure used to process the specimen.
    */
  var procedure: js.UndefOr[CodeableConcept] = js.undefined
}
object SpecimenTreatment {
  
  inline def apply(): SpecimenTreatment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpecimenTreatment]
  }
  
  extension [Self <: SpecimenTreatment](x: Self) {
    
    inline def setAdditive(value: js.Array[Reference]): Self = StObject.set(x, "additive", value.asInstanceOf[js.Any])
    
    inline def setAdditiveUndefined: Self = StObject.set(x, "additive", js.undefined)
    
    inline def setAdditiveVarargs(value: Reference*): Self = StObject.set(x, "additive", js.Array(value*))
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setProcedure(value: CodeableConcept): Self = StObject.set(x, "procedure", value.asInstanceOf[js.Any])
    
    inline def setProcedureUndefined: Self = StObject.set(x, "procedure", js.undefined)
    
    inline def set_description(value: Element): Self = StObject.set(x, "_description", value.asInstanceOf[js.Any])
    
    inline def set_descriptionUndefined: Self = StObject.set(x, "_description", js.undefined)
  }
}
