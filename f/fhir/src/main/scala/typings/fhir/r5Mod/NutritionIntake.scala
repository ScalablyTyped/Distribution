package typings.fhir.r5Mod

import typings.fhir.fhirStrings.`entered-in-error`
import typings.fhir.fhirStrings.`in-progress`
import typings.fhir.fhirStrings.`not-done`
import typings.fhir.fhirStrings.`on-hold`
import typings.fhir.fhirStrings.completed
import typings.fhir.fhirStrings.preparation
import typings.fhir.fhirStrings.stopped
import typings.fhir.fhirStrings.unknown
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NutritionIntake
  extends StObject
     with DomainResource
     with _FhirResource {
  
  var _instantiatesCanonical: js.UndefOr[js.Array[Element]] = js.undefined
  
  var _instantiatesUri: js.UndefOr[js.Array[Element]] = js.undefined
  
  var _occurrenceDateTime: js.UndefOr[Element] = js.undefined
  
  var _recorded: js.UndefOr[Element] = js.undefined
  
  var _reportedBoolean: js.UndefOr[Element] = js.undefined
  
  var _status: js.UndefOr[Element] = js.undefined
  
  /**
    * A plan, proposal or order that is fulfilled in whole or in part by this event.
    */
  var basedOn: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Type of nutrition intake setting/reporting.
    */
  var code: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * What food or fluid product or item was consumed.
    */
  var consumedItem: js.Array[NutritionIntakeConsumedItem]
  
  /**
    * Likely references would be to AllergyIntolerance,  Observation or QuestionnaireAnswers.
    */
  var derivedFrom: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * The encounter that establishes the context for this NutritionIntake.
    */
  var encounter: js.UndefOr[Reference] = js.undefined
  
  /**
    * This is a business identifier, not a resource identifier.
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * Individual item nutrients are not currently included in the resource and will likely end up as a reference in nutritionProduct to represent the individual items.
    */
  var ingredientLabel: js.UndefOr[js.Array[NutritionIntakeIngredientLabel]] = js.undefined
  
  /**
    * Instantiates FHIR protocol or definition.
    */
  var instantiatesCanonical: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Instantiates external protocol or definition.
    */
  var instantiatesUri: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Where the intake occurred.
    */
  var location: js.UndefOr[Reference] = js.undefined
  
  /**
    * Provides extra information about the Nutrition Intake that is not conveyed by the other attributes.
    */
  var note: js.UndefOr[js.Array[Annotation]] = js.undefined
  
  /**
    * This attribute reflects the period over which the patient consumed the food fluid and is expected to be populated on the majority of NutritionIntake. If the food or fluid is still being taken and is expected to continue indefinitely at the time the usage is recorded, the "end" date will be omitted.  If the end date is known, then it is included as the "end date".  The date/time attribute supports a variety of dates - year, year/month and exact date.  If something more than this is required, this should be conveyed as text.
    */
  var occurrenceDateTime: js.UndefOr[String] = js.undefined
  
  /**
    * This attribute reflects the period over which the patient consumed the food fluid and is expected to be populated on the majority of NutritionIntake. If the food or fluid is still being taken and is expected to continue indefinitely at the time the usage is recorded, the "end" date will be omitted.  If the end date is known, then it is included as the "end date".  The date/time attribute supports a variety of dates - year, year/month and exact date.  If something more than this is required, this should be conveyed as text.
    */
  var occurrencePeriod: js.UndefOr[Period] = js.undefined
  
  /**
    * A larger event of which this particular event is a component or step.
    */
  var partOf: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Who performed the intake and how they were involved.
    */
  var performer: js.UndefOr[js.Array[NutritionIntakePerformer]] = js.undefined
  
  /**
    * A reason, Condition or observation for why the food or fluid is /was consumed.
    */
  var reason: js.UndefOr[js.Array[CodeableReference]] = js.undefined
  
  /**
    * The date when the Nutrition Intake was asserted by the information source.
    */
  var recorded: js.UndefOr[String] = js.undefined
  
  /**
    * The person or organization that provided the information about the consumption of this food or fluid. Note: Use derivedFrom when a NutritionIntake is derived from other resources.
    */
  var reportedBoolean: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The person or organization that provided the information about the consumption of this food or fluid. Note: Use derivedFrom when a NutritionIntake is derived from other resources.
    */
  var reportedReference: js.UndefOr[Reference] = js.undefined
  
  /** Resource Type Name (for serialization) */
  @JSName("resourceType")
  val resourceType_NutritionIntake: typings.fhir.fhirStrings.NutritionIntake
  
  /**
    * NutritionIntake is a statement at a point in time.  The status is only representative at the point when it was asserted.  The value set for NutritionIntake.status contains codes that assert the status of the consumption of the food or fluid by the patient (for example, stopped or on hold) as well as codes that assert the status of the Nutrition Intake itself (for example, entered in error).
    * This element is labeled as a modifier because the status contains codes that mark the resource as not currently valid.
    */
  var status: preparation | `in-progress` | `not-done` | `on-hold` | stopped | completed | `entered-in-error` | unknown
  
  /**
    * This is generally only used for "exception" statuses such as "not-taken", "on-hold", "cancelled" or "entered-in-error". The reason for performing the event at all is captured in reasonCode, not here.
    */
  var statusReason: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * The person, animal or group who is/was consuming the food or fluid.
    */
  var subject: Reference
}
object NutritionIntake {
  
  inline def apply(
    consumedItem: js.Array[NutritionIntakeConsumedItem],
    status: preparation | `in-progress` | `not-done` | `on-hold` | stopped | completed | `entered-in-error` | unknown,
    subject: Reference
  ): NutritionIntake = {
    val __obj = js.Dynamic.literal(consumedItem = consumedItem.asInstanceOf[js.Any], resourceType = "NutritionIntake", status = status.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[NutritionIntake]
  }
  
  extension [Self <: NutritionIntake](x: Self) {
    
    inline def setBasedOn(value: js.Array[Reference]): Self = StObject.set(x, "basedOn", value.asInstanceOf[js.Any])
    
    inline def setBasedOnUndefined: Self = StObject.set(x, "basedOn", js.undefined)
    
    inline def setBasedOnVarargs(value: Reference*): Self = StObject.set(x, "basedOn", js.Array(value*))
    
    inline def setCode(value: CodeableConcept): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setConsumedItem(value: js.Array[NutritionIntakeConsumedItem]): Self = StObject.set(x, "consumedItem", value.asInstanceOf[js.Any])
    
    inline def setConsumedItemVarargs(value: NutritionIntakeConsumedItem*): Self = StObject.set(x, "consumedItem", js.Array(value*))
    
    inline def setDerivedFrom(value: js.Array[Reference]): Self = StObject.set(x, "derivedFrom", value.asInstanceOf[js.Any])
    
    inline def setDerivedFromUndefined: Self = StObject.set(x, "derivedFrom", js.undefined)
    
    inline def setDerivedFromVarargs(value: Reference*): Self = StObject.set(x, "derivedFrom", js.Array(value*))
    
    inline def setEncounter(value: Reference): Self = StObject.set(x, "encounter", value.asInstanceOf[js.Any])
    
    inline def setEncounterUndefined: Self = StObject.set(x, "encounter", js.undefined)
    
    inline def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value*))
    
    inline def setIngredientLabel(value: js.Array[NutritionIntakeIngredientLabel]): Self = StObject.set(x, "ingredientLabel", value.asInstanceOf[js.Any])
    
    inline def setIngredientLabelUndefined: Self = StObject.set(x, "ingredientLabel", js.undefined)
    
    inline def setIngredientLabelVarargs(value: NutritionIntakeIngredientLabel*): Self = StObject.set(x, "ingredientLabel", js.Array(value*))
    
    inline def setInstantiatesCanonical(value: js.Array[String]): Self = StObject.set(x, "instantiatesCanonical", value.asInstanceOf[js.Any])
    
    inline def setInstantiatesCanonicalUndefined: Self = StObject.set(x, "instantiatesCanonical", js.undefined)
    
    inline def setInstantiatesCanonicalVarargs(value: String*): Self = StObject.set(x, "instantiatesCanonical", js.Array(value*))
    
    inline def setInstantiatesUri(value: js.Array[String]): Self = StObject.set(x, "instantiatesUri", value.asInstanceOf[js.Any])
    
    inline def setInstantiatesUriUndefined: Self = StObject.set(x, "instantiatesUri", js.undefined)
    
    inline def setInstantiatesUriVarargs(value: String*): Self = StObject.set(x, "instantiatesUri", js.Array(value*))
    
    inline def setLocation(value: Reference): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setNote(value: js.Array[Annotation]): Self = StObject.set(x, "note", value.asInstanceOf[js.Any])
    
    inline def setNoteUndefined: Self = StObject.set(x, "note", js.undefined)
    
    inline def setNoteVarargs(value: Annotation*): Self = StObject.set(x, "note", js.Array(value*))
    
    inline def setOccurrenceDateTime(value: String): Self = StObject.set(x, "occurrenceDateTime", value.asInstanceOf[js.Any])
    
    inline def setOccurrenceDateTimeUndefined: Self = StObject.set(x, "occurrenceDateTime", js.undefined)
    
    inline def setOccurrencePeriod(value: Period): Self = StObject.set(x, "occurrencePeriod", value.asInstanceOf[js.Any])
    
    inline def setOccurrencePeriodUndefined: Self = StObject.set(x, "occurrencePeriod", js.undefined)
    
    inline def setPartOf(value: js.Array[Reference]): Self = StObject.set(x, "partOf", value.asInstanceOf[js.Any])
    
    inline def setPartOfUndefined: Self = StObject.set(x, "partOf", js.undefined)
    
    inline def setPartOfVarargs(value: Reference*): Self = StObject.set(x, "partOf", js.Array(value*))
    
    inline def setPerformer(value: js.Array[NutritionIntakePerformer]): Self = StObject.set(x, "performer", value.asInstanceOf[js.Any])
    
    inline def setPerformerUndefined: Self = StObject.set(x, "performer", js.undefined)
    
    inline def setPerformerVarargs(value: NutritionIntakePerformer*): Self = StObject.set(x, "performer", js.Array(value*))
    
    inline def setReason(value: js.Array[CodeableReference]): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
    
    inline def setReasonVarargs(value: CodeableReference*): Self = StObject.set(x, "reason", js.Array(value*))
    
    inline def setRecorded(value: String): Self = StObject.set(x, "recorded", value.asInstanceOf[js.Any])
    
    inline def setRecordedUndefined: Self = StObject.set(x, "recorded", js.undefined)
    
    inline def setReportedBoolean(value: Boolean): Self = StObject.set(x, "reportedBoolean", value.asInstanceOf[js.Any])
    
    inline def setReportedBooleanUndefined: Self = StObject.set(x, "reportedBoolean", js.undefined)
    
    inline def setReportedReference(value: Reference): Self = StObject.set(x, "reportedReference", value.asInstanceOf[js.Any])
    
    inline def setReportedReferenceUndefined: Self = StObject.set(x, "reportedReference", js.undefined)
    
    inline def setResourceType(value: typings.fhir.fhirStrings.NutritionIntake): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setStatus(
      value: preparation | `in-progress` | `not-done` | `on-hold` | stopped | completed | `entered-in-error` | unknown
    ): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusReason(value: js.Array[CodeableConcept]): Self = StObject.set(x, "statusReason", value.asInstanceOf[js.Any])
    
    inline def setStatusReasonUndefined: Self = StObject.set(x, "statusReason", js.undefined)
    
    inline def setStatusReasonVarargs(value: CodeableConcept*): Self = StObject.set(x, "statusReason", js.Array(value*))
    
    inline def setSubject(value: Reference): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    inline def set_instantiatesCanonical(value: js.Array[Element]): Self = StObject.set(x, "_instantiatesCanonical", value.asInstanceOf[js.Any])
    
    inline def set_instantiatesCanonicalUndefined: Self = StObject.set(x, "_instantiatesCanonical", js.undefined)
    
    inline def set_instantiatesCanonicalVarargs(value: Element*): Self = StObject.set(x, "_instantiatesCanonical", js.Array(value*))
    
    inline def set_instantiatesUri(value: js.Array[Element]): Self = StObject.set(x, "_instantiatesUri", value.asInstanceOf[js.Any])
    
    inline def set_instantiatesUriUndefined: Self = StObject.set(x, "_instantiatesUri", js.undefined)
    
    inline def set_instantiatesUriVarargs(value: Element*): Self = StObject.set(x, "_instantiatesUri", js.Array(value*))
    
    inline def set_occurrenceDateTime(value: Element): Self = StObject.set(x, "_occurrenceDateTime", value.asInstanceOf[js.Any])
    
    inline def set_occurrenceDateTimeUndefined: Self = StObject.set(x, "_occurrenceDateTime", js.undefined)
    
    inline def set_recorded(value: Element): Self = StObject.set(x, "_recorded", value.asInstanceOf[js.Any])
    
    inline def set_recordedUndefined: Self = StObject.set(x, "_recorded", js.undefined)
    
    inline def set_reportedBoolean(value: Element): Self = StObject.set(x, "_reportedBoolean", value.asInstanceOf[js.Any])
    
    inline def set_reportedBooleanUndefined: Self = StObject.set(x, "_reportedBoolean", js.undefined)
    
    inline def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    inline def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
  }
}
