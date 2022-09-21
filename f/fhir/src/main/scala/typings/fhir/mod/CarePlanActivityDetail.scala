package typings.fhir.mod

import typings.fhir.fhirStrings.`in-progress`
import typings.fhir.fhirStrings.`not-started`
import typings.fhir.fhirStrings.`on-hold`
import typings.fhir.fhirStrings.cancelled
import typings.fhir.fhirStrings.completed
import typings.fhir.fhirStrings.scheduled
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CarePlanActivityDetail
  extends StObject
     with BackboneElement {
  
  var _description: js.UndefOr[Element] = js.undefined
  
  var _prohibited: js.UndefOr[Element] = js.undefined
  
  var _scheduledString: js.UndefOr[Element] = js.undefined
  
  var _status: js.UndefOr[Element] = js.undefined
  
  /**
    * May determine what types of extensions are permitted.
    */
  var category: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Allows matching performed to planned as well as validation against protocols.
    */
  var code: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Allows rough dose checking.
    */
  var dailyAmount: js.UndefOr[Quantity] = js.undefined
  
  /**
    * This provides a textual description of constraints on the intended activity occurrence, including relation to other activities.  It may also include objectives, pre-conditions and end-conditions.  Finally, it may convey specifics about the activity such as body site, method, route, etc.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * So that participants know the link explicitly.
    */
  var goal: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Helps in planning of activity.
    */
  var location: js.UndefOr[Reference] = js.undefined
  
  /**
    * Helps in planning of activity.
    */
  var performer: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Identifies the food, drug or other product to be consumed or supplied in the activity.
    */
  var productCodeableConcept: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Identifies the food, drug or other product to be consumed or supplied in the activity.
    */
  var productReference: js.UndefOr[Reference] = js.undefined
  
  /**
    * Captures intention to not do something that may have been previously typical.
    */
  var prohibited: Boolean
  
  /**
    * Identifies the quantity expected to be supplied, administered or consumed by the subject.
    */
  var quantity: js.UndefOr[Quantity] = js.undefined
  
  /**
    * Provides the rationale that drove the inclusion of this particular activity as part of the plan.
    */
  var reasonCode: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * Provides the health condition(s) that drove the inclusion of this particular activity as part of the plan.
    */
  var reasonReference: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Allows prompting for activities and detection of missed planned activities.
    */
  var scheduledPeriod: js.UndefOr[Period] = js.undefined
  
  /**
    * Allows prompting for activities and detection of missed planned activities.
    */
  var scheduledString: js.UndefOr[String] = js.undefined
  
  /**
    * Allows prompting for activities and detection of missed planned activities.
    */
  var scheduledTiming: js.UndefOr[Timing] = js.undefined
  
  /**
    * Indicates progress against the plan, whether the activity is still relevant for the plan.
    */
  var status: js.UndefOr[`not-started` | scheduled | `in-progress` | `on-hold` | completed | cancelled] = js.undefined
  
  /**
    * Provides reason why the activity isn't yet started, is on hold, was cancelled, etc.
    */
  var statusReason: js.UndefOr[CodeableConcept] = js.undefined
}
object CarePlanActivityDetail {
  
  inline def apply(prohibited: Boolean): CarePlanActivityDetail = {
    val __obj = js.Dynamic.literal(prohibited = prohibited.asInstanceOf[js.Any])
    __obj.asInstanceOf[CarePlanActivityDetail]
  }
  
  extension [Self <: CarePlanActivityDetail](x: Self) {
    
    inline def setCategory(value: CodeableConcept): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    inline def setCode(value: CodeableConcept): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setDailyAmount(value: Quantity): Self = StObject.set(x, "dailyAmount", value.asInstanceOf[js.Any])
    
    inline def setDailyAmountUndefined: Self = StObject.set(x, "dailyAmount", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setGoal(value: js.Array[Reference]): Self = StObject.set(x, "goal", value.asInstanceOf[js.Any])
    
    inline def setGoalUndefined: Self = StObject.set(x, "goal", js.undefined)
    
    inline def setGoalVarargs(value: Reference*): Self = StObject.set(x, "goal", js.Array(value*))
    
    inline def setLocation(value: Reference): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setPerformer(value: js.Array[Reference]): Self = StObject.set(x, "performer", value.asInstanceOf[js.Any])
    
    inline def setPerformerUndefined: Self = StObject.set(x, "performer", js.undefined)
    
    inline def setPerformerVarargs(value: Reference*): Self = StObject.set(x, "performer", js.Array(value*))
    
    inline def setProductCodeableConcept(value: CodeableConcept): Self = StObject.set(x, "productCodeableConcept", value.asInstanceOf[js.Any])
    
    inline def setProductCodeableConceptUndefined: Self = StObject.set(x, "productCodeableConcept", js.undefined)
    
    inline def setProductReference(value: Reference): Self = StObject.set(x, "productReference", value.asInstanceOf[js.Any])
    
    inline def setProductReferenceUndefined: Self = StObject.set(x, "productReference", js.undefined)
    
    inline def setProhibited(value: Boolean): Self = StObject.set(x, "prohibited", value.asInstanceOf[js.Any])
    
    inline def setQuantity(value: Quantity): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
    
    inline def setQuantityUndefined: Self = StObject.set(x, "quantity", js.undefined)
    
    inline def setReasonCode(value: js.Array[CodeableConcept]): Self = StObject.set(x, "reasonCode", value.asInstanceOf[js.Any])
    
    inline def setReasonCodeUndefined: Self = StObject.set(x, "reasonCode", js.undefined)
    
    inline def setReasonCodeVarargs(value: CodeableConcept*): Self = StObject.set(x, "reasonCode", js.Array(value*))
    
    inline def setReasonReference(value: js.Array[Reference]): Self = StObject.set(x, "reasonReference", value.asInstanceOf[js.Any])
    
    inline def setReasonReferenceUndefined: Self = StObject.set(x, "reasonReference", js.undefined)
    
    inline def setReasonReferenceVarargs(value: Reference*): Self = StObject.set(x, "reasonReference", js.Array(value*))
    
    inline def setScheduledPeriod(value: Period): Self = StObject.set(x, "scheduledPeriod", value.asInstanceOf[js.Any])
    
    inline def setScheduledPeriodUndefined: Self = StObject.set(x, "scheduledPeriod", js.undefined)
    
    inline def setScheduledString(value: String): Self = StObject.set(x, "scheduledString", value.asInstanceOf[js.Any])
    
    inline def setScheduledStringUndefined: Self = StObject.set(x, "scheduledString", js.undefined)
    
    inline def setScheduledTiming(value: Timing): Self = StObject.set(x, "scheduledTiming", value.asInstanceOf[js.Any])
    
    inline def setScheduledTimingUndefined: Self = StObject.set(x, "scheduledTiming", js.undefined)
    
    inline def setStatus(value: `not-started` | scheduled | `in-progress` | `on-hold` | completed | cancelled): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusReason(value: CodeableConcept): Self = StObject.set(x, "statusReason", value.asInstanceOf[js.Any])
    
    inline def setStatusReasonUndefined: Self = StObject.set(x, "statusReason", js.undefined)
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def set_description(value: Element): Self = StObject.set(x, "_description", value.asInstanceOf[js.Any])
    
    inline def set_descriptionUndefined: Self = StObject.set(x, "_description", js.undefined)
    
    inline def set_prohibited(value: Element): Self = StObject.set(x, "_prohibited", value.asInstanceOf[js.Any])
    
    inline def set_prohibitedUndefined: Self = StObject.set(x, "_prohibited", js.undefined)
    
    inline def set_scheduledString(value: Element): Self = StObject.set(x, "_scheduledString", value.asInstanceOf[js.Any])
    
    inline def set_scheduledStringUndefined: Self = StObject.set(x, "_scheduledString", js.undefined)
    
    inline def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    inline def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
  }
}
