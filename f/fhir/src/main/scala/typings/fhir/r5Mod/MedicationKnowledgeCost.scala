package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MedicationKnowledgeCost
  extends StObject
     with BackboneElement {
  
  var _source: js.UndefOr[Element] = js.undefined
  
  /**
    * The price or representation of the cost (for example, Band A, Band B or $, $$) of the medication.
    */
  var costCodeableConcept: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * The price or representation of the cost (for example, Band A, Band B or $, $$) of the medication.
    */
  var costMoney: js.UndefOr[Money] = js.undefined
  
  /**
    * The date range for which the cost information of the medication is effective.
    */
  var effectiveDate: js.UndefOr[js.Array[Period]] = js.undefined
  
  /**
    * The source or owner that assigns the price to the medication.
    */
  var source: js.UndefOr[String] = js.undefined
  
  /**
    * The category of the cost information.  For example, manufacturers' cost, patient cost, claim reimbursement cost, actual acquisition cost.
    */
  var `type`: CodeableConcept
}
object MedicationKnowledgeCost {
  
  inline def apply(`type`: CodeableConcept): MedicationKnowledgeCost = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MedicationKnowledgeCost]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MedicationKnowledgeCost] (val x: Self) extends AnyVal {
    
    inline def setCostCodeableConcept(value: CodeableConcept): Self = StObject.set(x, "costCodeableConcept", value.asInstanceOf[js.Any])
    
    inline def setCostCodeableConceptUndefined: Self = StObject.set(x, "costCodeableConcept", js.undefined)
    
    inline def setCostMoney(value: Money): Self = StObject.set(x, "costMoney", value.asInstanceOf[js.Any])
    
    inline def setCostMoneyUndefined: Self = StObject.set(x, "costMoney", js.undefined)
    
    inline def setEffectiveDate(value: js.Array[Period]): Self = StObject.set(x, "effectiveDate", value.asInstanceOf[js.Any])
    
    inline def setEffectiveDateUndefined: Self = StObject.set(x, "effectiveDate", js.undefined)
    
    inline def setEffectiveDateVarargs(value: Period*): Self = StObject.set(x, "effectiveDate", js.Array(value*))
    
    inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    inline def setType(value: CodeableConcept): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def set_source(value: Element): Self = StObject.set(x, "_source", value.asInstanceOf[js.Any])
    
    inline def set_sourceUndefined: Self = StObject.set(x, "_source", js.undefined)
  }
}
