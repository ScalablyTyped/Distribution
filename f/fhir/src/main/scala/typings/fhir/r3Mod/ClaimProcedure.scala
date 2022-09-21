package typings.fhir.r3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClaimProcedure
  extends StObject
     with BackboneElement {
  
  var _date: js.UndefOr[Element] = js.undefined
  
  /**
    * SB DateTime??
    */
  var date: js.UndefOr[String] = js.undefined
  
  /**
    * The procedure code.
    */
  var procedureCodeableConcept: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * The procedure code.
    */
  var procedureReference: js.UndefOr[Reference] = js.undefined
  
  /**
    * Sequence of procedures which serves to order and provide a link.
    */
  var sequence: Double
}
object ClaimProcedure {
  
  inline def apply(sequence: Double): ClaimProcedure = {
    val __obj = js.Dynamic.literal(sequence = sequence.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClaimProcedure]
  }
  
  extension [Self <: ClaimProcedure](x: Self) {
    
    inline def setDate(value: String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    inline def setProcedureCodeableConcept(value: CodeableConcept): Self = StObject.set(x, "procedureCodeableConcept", value.asInstanceOf[js.Any])
    
    inline def setProcedureCodeableConceptUndefined: Self = StObject.set(x, "procedureCodeableConcept", js.undefined)
    
    inline def setProcedureReference(value: Reference): Self = StObject.set(x, "procedureReference", value.asInstanceOf[js.Any])
    
    inline def setProcedureReferenceUndefined: Self = StObject.set(x, "procedureReference", js.undefined)
    
    inline def setSequence(value: Double): Self = StObject.set(x, "sequence", value.asInstanceOf[js.Any])
    
    inline def set_date(value: Element): Self = StObject.set(x, "_date", value.asInstanceOf[js.Any])
    
    inline def set_dateUndefined: Self = StObject.set(x, "_date", js.undefined)
  }
}
