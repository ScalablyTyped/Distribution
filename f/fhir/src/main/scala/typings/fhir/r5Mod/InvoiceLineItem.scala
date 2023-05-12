package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InvoiceLineItem
  extends StObject
     with BackboneElement {
  
  var _servicedDate: js.UndefOr[Element] = js.undefined
  
  /**
    * The ChargeItem contains information such as the billing code, date, amount etc. If no further details are required for the lineItem, inline billing codes can be added using the CodeableConcept data type instead of the Reference.
    */
  var chargeItemCodeableConcept: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * The ChargeItem contains information such as the billing code, date, amount etc. If no further details are required for the lineItem, inline billing codes can be added using the CodeableConcept data type instead of the Reference.
    */
  var chargeItemReference: js.UndefOr[Reference] = js.undefined
  
  /**
    * The price for a ChargeItem may be calculated as a base price with surcharges/deductions that apply in certain conditions. A ChargeItemDefinition resource that defines the prices, factors and conditions that apply to a billing code is currently under development. The priceComponent element can be used to offer transparency to the recipient of the Invoice as to how the prices have been calculated.
    */
  var priceComponent: js.UndefOr[js.Array[MonetaryComponent]] = js.undefined
  
  /**
    * Sequence in which the items appear on the invoice.
    */
  var sequence: js.UndefOr[Double] = js.undefined
  
  /**
    * Date/time(s) range when this service was delivered or completed.
    */
  var servicedDate: js.UndefOr[String] = js.undefined
  
  /**
    * Date/time(s) range when this service was delivered or completed.
    */
  var servicedPeriod: js.UndefOr[Period] = js.undefined
}
object InvoiceLineItem {
  
  inline def apply(): InvoiceLineItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InvoiceLineItem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InvoiceLineItem] (val x: Self) extends AnyVal {
    
    inline def setChargeItemCodeableConcept(value: CodeableConcept): Self = StObject.set(x, "chargeItemCodeableConcept", value.asInstanceOf[js.Any])
    
    inline def setChargeItemCodeableConceptUndefined: Self = StObject.set(x, "chargeItemCodeableConcept", js.undefined)
    
    inline def setChargeItemReference(value: Reference): Self = StObject.set(x, "chargeItemReference", value.asInstanceOf[js.Any])
    
    inline def setChargeItemReferenceUndefined: Self = StObject.set(x, "chargeItemReference", js.undefined)
    
    inline def setPriceComponent(value: js.Array[MonetaryComponent]): Self = StObject.set(x, "priceComponent", value.asInstanceOf[js.Any])
    
    inline def setPriceComponentUndefined: Self = StObject.set(x, "priceComponent", js.undefined)
    
    inline def setPriceComponentVarargs(value: MonetaryComponent*): Self = StObject.set(x, "priceComponent", js.Array(value*))
    
    inline def setSequence(value: Double): Self = StObject.set(x, "sequence", value.asInstanceOf[js.Any])
    
    inline def setSequenceUndefined: Self = StObject.set(x, "sequence", js.undefined)
    
    inline def setServicedDate(value: String): Self = StObject.set(x, "servicedDate", value.asInstanceOf[js.Any])
    
    inline def setServicedDateUndefined: Self = StObject.set(x, "servicedDate", js.undefined)
    
    inline def setServicedPeriod(value: Period): Self = StObject.set(x, "servicedPeriod", value.asInstanceOf[js.Any])
    
    inline def setServicedPeriodUndefined: Self = StObject.set(x, "servicedPeriod", js.undefined)
    
    inline def set_servicedDate(value: Element): Self = StObject.set(x, "_servicedDate", value.asInstanceOf[js.Any])
    
    inline def set_servicedDateUndefined: Self = StObject.set(x, "_servicedDate", js.undefined)
  }
}
