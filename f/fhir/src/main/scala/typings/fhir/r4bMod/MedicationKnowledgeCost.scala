package typings.fhir.r4bMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MedicationKnowledgeCost
  extends StObject
     with BackboneElement {
  
  var _source: js.UndefOr[Element] = js.undefined
  
  /**
    * The price of the medication.
    */
  var cost: Money
  
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
  
  inline def apply(cost: Money, `type`: CodeableConcept): MedicationKnowledgeCost = {
    val __obj = js.Dynamic.literal(cost = cost.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MedicationKnowledgeCost]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MedicationKnowledgeCost] (val x: Self) extends AnyVal {
    
    inline def setCost(value: Money): Self = StObject.set(x, "cost", value.asInstanceOf[js.Any])
    
    inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    inline def setType(value: CodeableConcept): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def set_source(value: Element): Self = StObject.set(x, "_source", value.asInstanceOf[js.Any])
    
    inline def set_sourceUndefined: Self = StObject.set(x, "_source", js.undefined)
  }
}
