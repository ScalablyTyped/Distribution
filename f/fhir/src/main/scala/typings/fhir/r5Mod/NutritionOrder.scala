package typings.fhir.r5Mod

import typings.fhir.fhirStrings.`entered-in-error`
import typings.fhir.fhirStrings.`filler-order`
import typings.fhir.fhirStrings.`instance-order`
import typings.fhir.fhirStrings.`on-hold`
import typings.fhir.fhirStrings.`original-order`
import typings.fhir.fhirStrings.`reflex-order`
import typings.fhir.fhirStrings.active
import typings.fhir.fhirStrings.asap
import typings.fhir.fhirStrings.completed
import typings.fhir.fhirStrings.directive
import typings.fhir.fhirStrings.draft
import typings.fhir.fhirStrings.option
import typings.fhir.fhirStrings.order_
import typings.fhir.fhirStrings.plan
import typings.fhir.fhirStrings.proposal
import typings.fhir.fhirStrings.revoked
import typings.fhir.fhirStrings.routine
import typings.fhir.fhirStrings.stat
import typings.fhir.fhirStrings.unknown
import typings.fhir.fhirStrings.urgent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NutritionOrder
  extends StObject
     with DomainResource
     with _FhirResource {
  
  var _dateTime: js.UndefOr[Element] = js.undefined
  
  var _instantiates: js.UndefOr[js.Array[Element]] = js.undefined
  
  var _instantiatesCanonical: js.UndefOr[js.Array[Element]] = js.undefined
  
  var _instantiatesUri: js.UndefOr[js.Array[Element]] = js.undefined
  
  var _intent: js.UndefOr[Element] = js.undefined
  
  var _outsideFoodAllowed: js.UndefOr[Element] = js.undefined
  
  var _priority: js.UndefOr[Element] = js.undefined
  
  var _status: js.UndefOr[Element] = js.undefined
  
  /**
    * Information on a patient's food allergies and intolerances to inform healthcare personnel about the type of foods that the patient shouldn't receive or consume.
    */
  var allergyIntolerance: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * A plan or request that is fulfilled in whole or in part by this nutrition order.
    */
  var basedOn: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * The date and time that this nutrition order was requested.
    */
  var dateTime: String
  
  /**
    * An encounter that provides additional information about the healthcare context in which this request is made.
    */
  var encounter: js.UndefOr[Reference] = js.undefined
  
  /**
    * Feeding provided through the gastrointestinal tract via a tube, catheter, or stoma that delivers nutrition distal to the oral cavity.
    */
  var enteralFormula: js.UndefOr[NutritionOrderEnteralFormula] = js.undefined
  
  /**
    * Information on a patient's food allergies, intolerances and preferences to inform healthcare personnel about the type  of foods that the patient shouldn't receive or consume.
    */
  var excludeFoodModifier: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * Information on a patient's food preferences that inform healthcare personnel about the food that the patient should receive or consume.
    */
  var foodPreferenceModifier: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * A shared identifier common to all nutrition orders that were authorized more or less simultaneously by a single author, representing the composite or group identifier.
    */
  var groupIdentifier: js.UndefOr[Identifier] = js.undefined
  
  /**
    * The Identifier.type element can be to indicate filler vs. placer if needed.  This is explained in further detail [here](servicerequest.html#notes).
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * The URL pointing to a protocol, guideline, orderset or other definition that is adhered to in whole or in part by this NutritionOrder.
    */
  var instantiates: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Note: This is a business identifier, not a resource identifier (see [discussion](resource.html#identifiers)).  It is best practice for the identifier to only appear on a single resource instance, however business practices may occasionally dictate that multiple resource instances with the same identifier can exist - possibly even with different resource types.  For example, multiple Patient and a Person resource instance might share the same social insurance number.
    */
  var instantiatesCanonical: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * This might be an HTML page, PDF, etc. or could just be a non-resolvable URI identifier.
    */
  var instantiatesUri: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * When resources map to this element, they are free to define as many codes as necessary to cover their space and will map to "proposal, plan or order".  Can have multiple codes that map to one of these.  E.g. "original order", "encoded order", "reflex order" would all map to "order".  Expectation is that the set of codes is mutually exclusive or a strict all-encompassing hierarchy.
    */
  var intent: proposal | plan | directive | order_ | `original-order` | `reflex-order` | `filler-order` | `instance-order` | option
  
  /**
    * This element SHALL NOT be used to supply free text instructions for the diet which are represented in the `.oralDiet.instruction`, `supplement.instruction`, or `enteralFormula.administrationInstruction` elements.
    */
  var note: js.UndefOr[js.Array[Annotation]] = js.undefined
  
  /**
    * Diet given orally in contrast to enteral (tube) feeding.
    */
  var oralDiet: js.UndefOr[NutritionOrderOralDiet] = js.undefined
  
  /**
    * The practitioner that holds legal responsibility for ordering the diet, nutritional supplement, or formula feedings.
    */
  var orderer: js.UndefOr[Reference] = js.undefined
  
  /**
    * This modifier is used to convey whether a food item is allowed to be brought in by the patient and/or family.  If set to true, indicates that the receiving system does not need to supply the food item.
    */
  var outsideFoodAllowed: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The specified desired performer of the nutrition order.
    */
  var performer: js.UndefOr[js.Array[CodeableReference]] = js.undefined
  
  /**
    * Indicates how quickly the Nutrition Order should be addressed with respect to other        requests.
    */
  var priority: js.UndefOr[routine | urgent | asap | stat] = js.undefined
  
  /** Resource Type Name (for serialization) */
  @JSName("resourceType")
  val resourceType_NutritionOrder: typings.fhir.fhirStrings.NutritionOrder
  
  /**
    * Typically the system placing the order sets the status to "requested". Thereafter, the order is maintained by the receiver that updates the status as the request is handled.  This element is labeled as a modifier because the status contains codes that mark the resource as not currently valid.
    */
  var status: draft | active | `on-hold` | revoked | completed | `entered-in-error` | unknown
  
  /**
    * The person or set of individuals who needs the nutrition order for an oral diet, nutritional supplement and/or enteral or formula feeding.
    */
  var subject: Reference
  
  /**
    * Oral nutritional products given in order to add further nutritional value to the patient's diet.
    */
  var supplement: js.UndefOr[js.Array[NutritionOrderSupplement]] = js.undefined
  
  /**
    * Information to support fulfilling (i.e. dispensing or administering) of the nutrition,        for example, patient height and weight).
    */
  var supportingInformation: js.UndefOr[js.Array[Reference]] = js.undefined
}
object NutritionOrder {
  
  inline def apply(
    dateTime: String,
    intent: proposal | plan | directive | order_ | `original-order` | `reflex-order` | `filler-order` | `instance-order` | option,
    status: draft | active | `on-hold` | revoked | completed | `entered-in-error` | unknown,
    subject: Reference
  ): NutritionOrder = {
    val __obj = js.Dynamic.literal(dateTime = dateTime.asInstanceOf[js.Any], intent = intent.asInstanceOf[js.Any], resourceType = "NutritionOrder", status = status.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[NutritionOrder]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NutritionOrder] (val x: Self) extends AnyVal {
    
    inline def setAllergyIntolerance(value: js.Array[Reference]): Self = StObject.set(x, "allergyIntolerance", value.asInstanceOf[js.Any])
    
    inline def setAllergyIntoleranceUndefined: Self = StObject.set(x, "allergyIntolerance", js.undefined)
    
    inline def setAllergyIntoleranceVarargs(value: Reference*): Self = StObject.set(x, "allergyIntolerance", js.Array(value*))
    
    inline def setBasedOn(value: js.Array[Reference]): Self = StObject.set(x, "basedOn", value.asInstanceOf[js.Any])
    
    inline def setBasedOnUndefined: Self = StObject.set(x, "basedOn", js.undefined)
    
    inline def setBasedOnVarargs(value: Reference*): Self = StObject.set(x, "basedOn", js.Array(value*))
    
    inline def setDateTime(value: String): Self = StObject.set(x, "dateTime", value.asInstanceOf[js.Any])
    
    inline def setEncounter(value: Reference): Self = StObject.set(x, "encounter", value.asInstanceOf[js.Any])
    
    inline def setEncounterUndefined: Self = StObject.set(x, "encounter", js.undefined)
    
    inline def setEnteralFormula(value: NutritionOrderEnteralFormula): Self = StObject.set(x, "enteralFormula", value.asInstanceOf[js.Any])
    
    inline def setEnteralFormulaUndefined: Self = StObject.set(x, "enteralFormula", js.undefined)
    
    inline def setExcludeFoodModifier(value: js.Array[CodeableConcept]): Self = StObject.set(x, "excludeFoodModifier", value.asInstanceOf[js.Any])
    
    inline def setExcludeFoodModifierUndefined: Self = StObject.set(x, "excludeFoodModifier", js.undefined)
    
    inline def setExcludeFoodModifierVarargs(value: CodeableConcept*): Self = StObject.set(x, "excludeFoodModifier", js.Array(value*))
    
    inline def setFoodPreferenceModifier(value: js.Array[CodeableConcept]): Self = StObject.set(x, "foodPreferenceModifier", value.asInstanceOf[js.Any])
    
    inline def setFoodPreferenceModifierUndefined: Self = StObject.set(x, "foodPreferenceModifier", js.undefined)
    
    inline def setFoodPreferenceModifierVarargs(value: CodeableConcept*): Self = StObject.set(x, "foodPreferenceModifier", js.Array(value*))
    
    inline def setGroupIdentifier(value: Identifier): Self = StObject.set(x, "groupIdentifier", value.asInstanceOf[js.Any])
    
    inline def setGroupIdentifierUndefined: Self = StObject.set(x, "groupIdentifier", js.undefined)
    
    inline def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value*))
    
    inline def setInstantiates(value: js.Array[String]): Self = StObject.set(x, "instantiates", value.asInstanceOf[js.Any])
    
    inline def setInstantiatesCanonical(value: js.Array[String]): Self = StObject.set(x, "instantiatesCanonical", value.asInstanceOf[js.Any])
    
    inline def setInstantiatesCanonicalUndefined: Self = StObject.set(x, "instantiatesCanonical", js.undefined)
    
    inline def setInstantiatesCanonicalVarargs(value: String*): Self = StObject.set(x, "instantiatesCanonical", js.Array(value*))
    
    inline def setInstantiatesUndefined: Self = StObject.set(x, "instantiates", js.undefined)
    
    inline def setInstantiatesUri(value: js.Array[String]): Self = StObject.set(x, "instantiatesUri", value.asInstanceOf[js.Any])
    
    inline def setInstantiatesUriUndefined: Self = StObject.set(x, "instantiatesUri", js.undefined)
    
    inline def setInstantiatesUriVarargs(value: String*): Self = StObject.set(x, "instantiatesUri", js.Array(value*))
    
    inline def setInstantiatesVarargs(value: String*): Self = StObject.set(x, "instantiates", js.Array(value*))
    
    inline def setIntent(
      value: proposal | plan | directive | order_ | `original-order` | `reflex-order` | `filler-order` | `instance-order` | option
    ): Self = StObject.set(x, "intent", value.asInstanceOf[js.Any])
    
    inline def setNote(value: js.Array[Annotation]): Self = StObject.set(x, "note", value.asInstanceOf[js.Any])
    
    inline def setNoteUndefined: Self = StObject.set(x, "note", js.undefined)
    
    inline def setNoteVarargs(value: Annotation*): Self = StObject.set(x, "note", js.Array(value*))
    
    inline def setOralDiet(value: NutritionOrderOralDiet): Self = StObject.set(x, "oralDiet", value.asInstanceOf[js.Any])
    
    inline def setOralDietUndefined: Self = StObject.set(x, "oralDiet", js.undefined)
    
    inline def setOrderer(value: Reference): Self = StObject.set(x, "orderer", value.asInstanceOf[js.Any])
    
    inline def setOrdererUndefined: Self = StObject.set(x, "orderer", js.undefined)
    
    inline def setOutsideFoodAllowed(value: Boolean): Self = StObject.set(x, "outsideFoodAllowed", value.asInstanceOf[js.Any])
    
    inline def setOutsideFoodAllowedUndefined: Self = StObject.set(x, "outsideFoodAllowed", js.undefined)
    
    inline def setPerformer(value: js.Array[CodeableReference]): Self = StObject.set(x, "performer", value.asInstanceOf[js.Any])
    
    inline def setPerformerUndefined: Self = StObject.set(x, "performer", js.undefined)
    
    inline def setPerformerVarargs(value: CodeableReference*): Self = StObject.set(x, "performer", js.Array(value*))
    
    inline def setPriority(value: routine | urgent | asap | stat): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    
    inline def setResourceType(value: typings.fhir.fhirStrings.NutritionOrder): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: draft | active | `on-hold` | revoked | completed | `entered-in-error` | unknown): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setSubject(value: Reference): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    inline def setSupplement(value: js.Array[NutritionOrderSupplement]): Self = StObject.set(x, "supplement", value.asInstanceOf[js.Any])
    
    inline def setSupplementUndefined: Self = StObject.set(x, "supplement", js.undefined)
    
    inline def setSupplementVarargs(value: NutritionOrderSupplement*): Self = StObject.set(x, "supplement", js.Array(value*))
    
    inline def setSupportingInformation(value: js.Array[Reference]): Self = StObject.set(x, "supportingInformation", value.asInstanceOf[js.Any])
    
    inline def setSupportingInformationUndefined: Self = StObject.set(x, "supportingInformation", js.undefined)
    
    inline def setSupportingInformationVarargs(value: Reference*): Self = StObject.set(x, "supportingInformation", js.Array(value*))
    
    inline def set_dateTime(value: Element): Self = StObject.set(x, "_dateTime", value.asInstanceOf[js.Any])
    
    inline def set_dateTimeUndefined: Self = StObject.set(x, "_dateTime", js.undefined)
    
    inline def set_instantiates(value: js.Array[Element]): Self = StObject.set(x, "_instantiates", value.asInstanceOf[js.Any])
    
    inline def set_instantiatesCanonical(value: js.Array[Element]): Self = StObject.set(x, "_instantiatesCanonical", value.asInstanceOf[js.Any])
    
    inline def set_instantiatesCanonicalUndefined: Self = StObject.set(x, "_instantiatesCanonical", js.undefined)
    
    inline def set_instantiatesCanonicalVarargs(value: Element*): Self = StObject.set(x, "_instantiatesCanonical", js.Array(value*))
    
    inline def set_instantiatesUndefined: Self = StObject.set(x, "_instantiates", js.undefined)
    
    inline def set_instantiatesUri(value: js.Array[Element]): Self = StObject.set(x, "_instantiatesUri", value.asInstanceOf[js.Any])
    
    inline def set_instantiatesUriUndefined: Self = StObject.set(x, "_instantiatesUri", js.undefined)
    
    inline def set_instantiatesUriVarargs(value: Element*): Self = StObject.set(x, "_instantiatesUri", js.Array(value*))
    
    inline def set_instantiatesVarargs(value: Element*): Self = StObject.set(x, "_instantiates", js.Array(value*))
    
    inline def set_intent(value: Element): Self = StObject.set(x, "_intent", value.asInstanceOf[js.Any])
    
    inline def set_intentUndefined: Self = StObject.set(x, "_intent", js.undefined)
    
    inline def set_outsideFoodAllowed(value: Element): Self = StObject.set(x, "_outsideFoodAllowed", value.asInstanceOf[js.Any])
    
    inline def set_outsideFoodAllowedUndefined: Self = StObject.set(x, "_outsideFoodAllowed", js.undefined)
    
    inline def set_priority(value: Element): Self = StObject.set(x, "_priority", value.asInstanceOf[js.Any])
    
    inline def set_priorityUndefined: Self = StObject.set(x, "_priority", js.undefined)
    
    inline def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    inline def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
  }
}
