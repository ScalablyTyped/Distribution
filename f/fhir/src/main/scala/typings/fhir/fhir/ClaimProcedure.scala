package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Procedures performed
  */
trait ClaimProcedure
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
object ClaimProcedure {
  
  @scala.inline
  def apply(sequence: positiveInt): ClaimProcedure = {
    val __obj = js.Dynamic.literal(sequence = sequence.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClaimProcedure]
  }
  
  @scala.inline
  implicit class ClaimProcedureMutableBuilder[Self <: ClaimProcedure] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDate(value: dateTime): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    @scala.inline
    def setProcedureCodeableConcept(value: CodeableConcept): Self = StObject.set(x, "procedureCodeableConcept", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProcedureCodeableConceptUndefined: Self = StObject.set(x, "procedureCodeableConcept", js.undefined)
    
    @scala.inline
    def setProcedureReference(value: Reference): Self = StObject.set(x, "procedureReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProcedureReferenceUndefined: Self = StObject.set(x, "procedureReference", js.undefined)
    
    @scala.inline
    def setSequence(value: positiveInt): Self = StObject.set(x, "sequence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_date(value: Element): Self = StObject.set(x, "_date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_dateUndefined: Self = StObject.set(x, "_date", js.undefined)
    
    @scala.inline
    def set_sequence(value: Element): Self = StObject.set(x, "_sequence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_sequenceUndefined: Self = StObject.set(x, "_sequence", js.undefined)
  }
}
