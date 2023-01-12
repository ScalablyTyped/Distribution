package typings.fhir.r4Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MedicationKnowledgeRegulatoryMaxDispense
  extends StObject
     with BackboneElement {
  
  /**
    * The period that applies to the maximum number of units.
    */
  var period: js.UndefOr[Duration] = js.undefined
  
  /**
    * The maximum number of units of the medication that can be dispensed.
    */
  var quantity: Quantity
}
object MedicationKnowledgeRegulatoryMaxDispense {
  
  inline def apply(quantity: Quantity): MedicationKnowledgeRegulatoryMaxDispense = {
    val __obj = js.Dynamic.literal(quantity = quantity.asInstanceOf[js.Any])
    __obj.asInstanceOf[MedicationKnowledgeRegulatoryMaxDispense]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MedicationKnowledgeRegulatoryMaxDispense] (val x: Self) extends AnyVal {
    
    inline def setPeriod(value: Duration): Self = StObject.set(x, "period", value.asInstanceOf[js.Any])
    
    inline def setPeriodUndefined: Self = StObject.set(x, "period", js.undefined)
    
    inline def setQuantity(value: Quantity): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
  }
}
