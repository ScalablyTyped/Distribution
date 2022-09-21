package typings.fhir.r4Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClaimProcedure
  extends StObject
     with BackboneElement {
  
  var _date: js.UndefOr[Element] = js.undefined
  
  /**
    * Date and optionally time the procedure was performed.
    */
  var date: js.UndefOr[String] = js.undefined
  
  /**
    * The code or reference to a Procedure resource which identifies the clinical intervention performed.
    */
  var procedureCodeableConcept: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * The code or reference to a Procedure resource which identifies the clinical intervention performed.
    */
  var procedureReference: js.UndefOr[Reference] = js.undefined
  
  /**
    * A number to uniquely identify procedure entries.
    */
  var sequence: Double
  
  /**
    * For example: primary, secondary.
    */
  var `type`: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * Unique Device Identifiers associated with this line item.
    */
  var udi: js.UndefOr[js.Array[Reference]] = js.undefined
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
    
    inline def setType(value: js.Array[CodeableConcept]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setTypeVarargs(value: CodeableConcept*): Self = StObject.set(x, "type", js.Array(value*))
    
    inline def setUdi(value: js.Array[Reference]): Self = StObject.set(x, "udi", value.asInstanceOf[js.Any])
    
    inline def setUdiUndefined: Self = StObject.set(x, "udi", js.undefined)
    
    inline def setUdiVarargs(value: Reference*): Self = StObject.set(x, "udi", js.Array(value*))
    
    inline def set_date(value: Element): Self = StObject.set(x, "_date", value.asInstanceOf[js.Any])
    
    inline def set_dateUndefined: Self = StObject.set(x, "_date", js.undefined)
  }
}
