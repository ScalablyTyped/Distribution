package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Procedures performed
  */
trait ExplanationOfBenefitProcedure
  extends StObject
     with BackboneElement {
  
  /**
    * Contains extended information for property 'date'.
    */
  var _date: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'sequence'.
    */
  var _sequence: js.UndefOr[Element] = js.undefined
  
  /**
    * When the procedure was performed
    */
  var date: js.UndefOr[dateTime] = js.undefined
  
  /**
    * Patient's list of procedures performed
    */
  var procedureCodeableConcept: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Patient's list of procedures performed
    */
  var procedureReference: js.UndefOr[Reference] = js.undefined
  
  /**
    * Procedure sequence for reference
    */
  var sequence: positiveInt
}
object ExplanationOfBenefitProcedure {
  
  inline def apply(sequence: positiveInt): ExplanationOfBenefitProcedure = {
    val __obj = js.Dynamic.literal(sequence = sequence.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExplanationOfBenefitProcedure]
  }
  
  extension [Self <: ExplanationOfBenefitProcedure](x: Self) {
    
    inline def setDate(value: dateTime): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    inline def setProcedureCodeableConcept(value: CodeableConcept): Self = StObject.set(x, "procedureCodeableConcept", value.asInstanceOf[js.Any])
    
    inline def setProcedureCodeableConceptUndefined: Self = StObject.set(x, "procedureCodeableConcept", js.undefined)
    
    inline def setProcedureReference(value: Reference): Self = StObject.set(x, "procedureReference", value.asInstanceOf[js.Any])
    
    inline def setProcedureReferenceUndefined: Self = StObject.set(x, "procedureReference", js.undefined)
    
    inline def setSequence(value: positiveInt): Self = StObject.set(x, "sequence", value.asInstanceOf[js.Any])
    
    inline def set_date(value: Element): Self = StObject.set(x, "_date", value.asInstanceOf[js.Any])
    
    inline def set_dateUndefined: Self = StObject.set(x, "_date", js.undefined)
    
    inline def set_sequence(value: Element): Self = StObject.set(x, "_sequence", value.asInstanceOf[js.Any])
    
    inline def set_sequenceUndefined: Self = StObject.set(x, "_sequence", js.undefined)
  }
}
