package typings.fhir.r3Mod

import typings.fhir.fhirStrings.`in-progress`
import typings.fhir.fhirStrings.`not-started`
import typings.fhir.fhirStrings.`on-hold`
import typings.fhir.fhirStrings.cancelled
import typings.fhir.fhirStrings.completed
import typings.fhir.fhirStrings.scheduled
import typings.fhir.fhirStrings.unknown
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
  
  var _statusReason: js.UndefOr[Element] = js.undefined
  
  /**
    * High-level categorization of the type of activity in a care plan.
    */
  var category: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Tends to be less relevant for activities involving particular products.  Codes should not convey negation - use "prohibited" instead.
    */
  var code: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Identifies the quantity expected to be consumed in a given day.
    */
  var dailyAmount: js.UndefOr[Quantity] = js.undefined
  
  /**
    * Identifies the protocol, questionnaire, guideline or other specification the planned activity should be conducted in accordance with.
    */
  var definition: js.UndefOr[Reference] = js.undefined
  
  /**
    * This provides a textual description of constraints on the intended activity occurrence, including relation to other activities.  It may also include objectives, pre-conditions and end-conditions.  Finally, it may convey specifics about the activity such as body site, method, route, etc.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * Internal reference that identifies the goals that this activity is intended to contribute towards meeting.
    */
  var goal: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * May reference a specific clinical location or may identify a type of location.
    */
  var location: js.UndefOr[Reference] = js.undefined
  
  /**
    * A performer MAY also be a participant in the care plan.
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
    * This element is labeled as a modifier because it marks an activity as an activity that is not to be performed.
    */
  var prohibited: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Identifies the quantity expected to be supplied, administered or consumed by the subject.
    */
  var quantity: js.UndefOr[Quantity] = js.undefined
  
  /**
    * This could be a diagnosis code.  If a full condition record exists or additional detail is needed, use reasonCondition instead.
    */
  var reasonCode: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * Conditions can be identified at the activity level that are not identified as reasons for the overall plan.
    */
  var reasonReference: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * The period, timing or frequency upon which the described activity is to occur.
    */
  var scheduledPeriod: js.UndefOr[Period] = js.undefined
  
  /**
    * The period, timing or frequency upon which the described activity is to occur.
    */
  var scheduledString: js.UndefOr[String] = js.undefined
  
  /**
    * The period, timing or frequency upon which the described activity is to occur.
    */
  var scheduledTiming: js.UndefOr[Timing] = js.undefined
  
  /**
    * Some aspects of status can be inferred based on the resources linked in actionTaken.  Note that "status" is only as current as the plan was most recently updated.
    * The unknown code is not to be used to convey other statuses.  The unknown code should be used when one of the statuses applies, but the authoring system doesn't know the current state of the activity.
    */
  var status: `not-started` | scheduled | `in-progress` | `on-hold` | completed | cancelled | unknown
  
  /**
    * Will generally not be present if status is "complete".  Be sure to prompt to update this (or at least remove the existing value) if the status is changed.
    */
  var statusReason: js.UndefOr[String] = js.undefined
}
object CarePlanActivityDetail {
  
  inline def apply(status: `not-started` | scheduled | `in-progress` | `on-hold` | completed | cancelled | unknown): CarePlanActivityDetail = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[CarePlanActivityDetail]
  }
  
  extension [Self <: CarePlanActivityDetail](x: Self) {
    
    inline def setCategory(value: CodeableConcept): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    inline def setCode(value: CodeableConcept): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setDailyAmount(value: Quantity): Self = StObject.set(x, "dailyAmount", value.asInstanceOf[js.Any])
    
    inline def setDailyAmountUndefined: Self = StObject.set(x, "dailyAmount", js.undefined)
    
    inline def setDefinition(value: Reference): Self = StObject.set(x, "definition", value.asInstanceOf[js.Any])
    
    inline def setDefinitionUndefined: Self = StObject.set(x, "definition", js.undefined)
    
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
    
    inline def setProhibitedUndefined: Self = StObject.set(x, "prohibited", js.undefined)
    
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
    
    inline def setStatus(value: `not-started` | scheduled | `in-progress` | `on-hold` | completed | cancelled | unknown): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusReason(value: String): Self = StObject.set(x, "statusReason", value.asInstanceOf[js.Any])
    
    inline def setStatusReasonUndefined: Self = StObject.set(x, "statusReason", js.undefined)
    
    inline def set_description(value: Element): Self = StObject.set(x, "_description", value.asInstanceOf[js.Any])
    
    inline def set_descriptionUndefined: Self = StObject.set(x, "_description", js.undefined)
    
    inline def set_prohibited(value: Element): Self = StObject.set(x, "_prohibited", value.asInstanceOf[js.Any])
    
    inline def set_prohibitedUndefined: Self = StObject.set(x, "_prohibited", js.undefined)
    
    inline def set_scheduledString(value: Element): Self = StObject.set(x, "_scheduledString", value.asInstanceOf[js.Any])
    
    inline def set_scheduledStringUndefined: Self = StObject.set(x, "_scheduledString", js.undefined)
    
    inline def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    inline def set_statusReason(value: Element): Self = StObject.set(x, "_statusReason", value.asInstanceOf[js.Any])
    
    inline def set_statusReasonUndefined: Self = StObject.set(x, "_statusReason", js.undefined)
    
    inline def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
  }
}
