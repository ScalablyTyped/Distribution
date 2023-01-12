package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MedicationRequestDose
  extends StObject
     with BackboneElement {
  
  var _effectiveDosePeriod: js.UndefOr[Element] = js.undefined
  
  var _renderedDosageInstruction: js.UndefOr[Element] = js.undefined
  
  /**
    * There are examples where a medication request may include the option of an oral dose or an Intravenous or Intramuscular dose.  For example, "Ondansetron 8mg orally or IV twice a day as needed for nausea" or "Compazine® (prochlorperazine) 5-10mg PO or 25mg PR bid prn nausea or vomiting".  In these cases, two medication requests would be created that could be grouped together.  The decision on which dose and route of administration to use is based on the patient's condition at the time the dose is needed. In general, each prescribed drug will be a separate Medication Request.
    * When drug orders are grouped together at the time of order entry,  but each of the drugs can be manipulated independently e.g. changing the status of one order to "completed" or "cancelled", changing another order status to "on-hold", the method to "group" all of the medication requests together is to use  MedicationRequest.groupIdentifier element.  All of the orders grouped together in this manner will have the same groupIdentifier, and separately, each order in the group may have a unique identifier.
    * There are cases that require grouping of Medication orders together when it is necessary to specify optionality e.g. order two drugs at one time, but stating either of these drugs may be used to treat the patient.  The use of a RequestGroup should be used as a parent for the Medication orders that require this type of grouping. An example when it may be necessary to group medication orders together is when you specify timing relationships e.g. order drug "xyz" with dose 123, then taper the same drug to a different dose after some interval of time
    * precedence:
    * e.g. give drug "abc" followed by drug "def"
    * e.g. give drug 30 minutes before some procedure was performed
    * more generically this supports - hierarchical groups of actions, where each specific action references the action to be performed (in terms of a Request resource), and each group describes additional behavior, relationships, and applicable conditions between the actions in the overall group.
    * Note that one should NOT use the List or Composition resource to accomplish the above requirements.  You may use List or Composition for other business requirements, but not to address the specific requirements of grouping medication orders.
    */
  var dosageInstruction: js.UndefOr[js.Array[Dosage]] = js.undefined
  
  /**
    * The period over which the medication is to be taken.  Where there are multiple dosageInstruction lines (for example, tapering doses), this is the earliest date and the latest end date of the dosageInstructions.
    */
  var effectiveDosePeriod: js.UndefOr[String] = js.undefined
  
  /**
    * The full representation of the dose of the medication included in all dosage instructions.  To be used when multiple dosage instructions are included to represent complex dosing such as increasing or tapering doses.
    */
  var renderedDosageInstruction: js.UndefOr[String] = js.undefined
}
object MedicationRequestDose {
  
  inline def apply(): MedicationRequestDose = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MedicationRequestDose]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MedicationRequestDose] (val x: Self) extends AnyVal {
    
    inline def setDosageInstruction(value: js.Array[Dosage]): Self = StObject.set(x, "dosageInstruction", value.asInstanceOf[js.Any])
    
    inline def setDosageInstructionUndefined: Self = StObject.set(x, "dosageInstruction", js.undefined)
    
    inline def setDosageInstructionVarargs(value: Dosage*): Self = StObject.set(x, "dosageInstruction", js.Array(value*))
    
    inline def setEffectiveDosePeriod(value: String): Self = StObject.set(x, "effectiveDosePeriod", value.asInstanceOf[js.Any])
    
    inline def setEffectiveDosePeriodUndefined: Self = StObject.set(x, "effectiveDosePeriod", js.undefined)
    
    inline def setRenderedDosageInstruction(value: String): Self = StObject.set(x, "renderedDosageInstruction", value.asInstanceOf[js.Any])
    
    inline def setRenderedDosageInstructionUndefined: Self = StObject.set(x, "renderedDosageInstruction", js.undefined)
    
    inline def set_effectiveDosePeriod(value: Element): Self = StObject.set(x, "_effectiveDosePeriod", value.asInstanceOf[js.Any])
    
    inline def set_effectiveDosePeriodUndefined: Self = StObject.set(x, "_effectiveDosePeriod", js.undefined)
    
    inline def set_renderedDosageInstruction(value: Element): Self = StObject.set(x, "_renderedDosageInstruction", value.asInstanceOf[js.Any])
    
    inline def set_renderedDosageInstructionUndefined: Self = StObject.set(x, "_renderedDosageInstruction", js.undefined)
  }
}
