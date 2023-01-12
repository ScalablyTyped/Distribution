package typings.fhir.r4Mod

import typings.fhir.fhirStrings.`entered-in-error`
import typings.fhir.fhirStrings.`not-billable`
import typings.fhir.fhirStrings.aborted
import typings.fhir.fhirStrings.billable
import typings.fhir.fhirStrings.billed
import typings.fhir.fhirStrings.planned
import typings.fhir.fhirStrings.unknown
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChargeItem
  extends StObject
     with DomainResource
     with _FhirResource {
  
  var _definitionCanonical: js.UndefOr[js.Array[Element]] = js.undefined
  
  var _definitionUri: js.UndefOr[js.Array[Element]] = js.undefined
  
  var _enteredDate: js.UndefOr[Element] = js.undefined
  
  var _occurrenceDateTime: js.UndefOr[Element] = js.undefined
  
  var _overrideReason: js.UndefOr[Element] = js.undefined
  
  var _status: js.UndefOr[Element] = js.undefined
  
  /**
    * Systems posting the ChargeItems might not always be able to determine, which accounts the Items need to be places into. It is up to the postprocessing Financial System to apply internal rules to decide based on the Encounter/EpisodeOfCare/Patient/Coverage context and the type of ChargeItem, which Account is appropriate.
    */
  var account: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Only used if not implicit in code found in Condition.code. If the use case requires attributes from the BodySite resource (e.g. to identify and track separately) then use the standard extension [bodySite](extension-bodysite.html).  May be a summary code, or a reference to a very precise definition of the location, or both.
    */
  var bodysite: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * A code that identifies the charge, like a billing code.
    */
  var code: CodeableConcept
  
  /**
    * The encounter or episode of care that establishes the context for this event.
    */
  var context: js.UndefOr[Reference] = js.undefined
  
  /**
    * The costCenter could either be given as a reference to an Organization(Role) resource or as the identifier of the cost center determined by Reference.identifier.value and Reference.identifier.system, depending on use case requirements.
    */
  var costCenter: js.UndefOr[Reference] = js.undefined
  
  /**
    * References the source of pricing information, rules of application for the code this ChargeItem uses.
    */
  var definitionCanonical: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * References the (external) source of pricing information, rules of application for the code this ChargeItem uses.
    */
  var definitionUri: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The actual date when the service associated with the charge has been rendered is captured in occurrence[x].
    */
  var enteredDate: js.UndefOr[String] = js.undefined
  
  /**
    * The enterer is also the person considered responsible for factor/price overrides if applicable.
    */
  var enterer: js.UndefOr[Reference] = js.undefined
  
  /**
    * There is no reason to carry the factor in the instance of a ChargeItem unless special circumstances require a manual override. The factors are usually defined by a set of rules in a back catalogue of the billing codes  (see ChargeItem.definition). Derived profiles may require a ChargeItem.overrideReason to be provided if either factor or price are manually overridden.
    */
  var factorOverride: js.UndefOr[Double] = js.undefined
  
  /**
    * Identifiers assigned to this event performer or other systems.
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * Comments made about the event by the performer, subject or other participants.
    */
  var note: js.UndefOr[js.Array[Annotation]] = js.undefined
  
  /**
    * The list of types may be constrained as appropriate for the type of charge item.
    */
  var occurrenceDateTime: js.UndefOr[String] = js.undefined
  
  /**
    * The list of types may be constrained as appropriate for the type of charge item.
    */
  var occurrencePeriod: js.UndefOr[Period] = js.undefined
  
  /**
    * The list of types may be constrained as appropriate for the type of charge item.
    */
  var occurrenceTiming: js.UndefOr[Timing] = js.undefined
  
  /**
    * Derived Profiles may choose to add invariants requiring this field to be populated if either priceOverride or factorOverride have been filled.
    */
  var overrideReason: js.UndefOr[String] = js.undefined
  
  /**
    * ChargeItems can be grouped to larger ChargeItems covering the whole set.
    */
  var partOf: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Indicates who or what performed or participated in the charged service.
    */
  var performer: js.UndefOr[js.Array[ChargeItemPerformer]] = js.undefined
  
  /**
    * Practitioners and Devices can be associated with multiple organizations. It has to be made clear, on behalf of which Organization the services have been rendered.
    */
  var performingOrganization: js.UndefOr[Reference] = js.undefined
  
  /**
    * There is no reason to carry the price in the instance of a ChargeItem unless circumstances require a manual override. The list prices or are usually defined in a back catalogue of the billing codes  (see ChargeItem.definition). Derived profiles may require a ChargeItem.overrideReason to be provided if either factor or price are manually overridden.
    */
  var priceOverride: js.UndefOr[Money] = js.undefined
  
  /**
    * Identifies the device, food, drug or other product being charged either by type code or reference to an instance.
    */
  var productCodeableConcept: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Identifies the device, food, drug or other product being charged either by type code or reference to an instance.
    */
  var productReference: js.UndefOr[Reference] = js.undefined
  
  /**
    * In many cases this may just be a value, if the underlying units are implicit in the definition of the charge item code.
    */
  var quantity: js.UndefOr[Quantity] = js.undefined
  
  /**
    * If the application of the charge item requires a reason to be given, it can be captured here. Textual reasons can be captured using reasonCode.text.
    */
  var reason: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * The rendered Service might not be associated with a Request. This property indicates which Organization requested the services to be rendered. (In many cases, this may just be the Department associated with the Encounter.location).
    */
  var requestingOrganization: js.UndefOr[Reference] = js.undefined
  
  /** Resource Type Name (for serialization) */
  @JSName("resourceType")
  val resourceType_ChargeItem: typings.fhir.fhirStrings.ChargeItem
  
  /**
    * Indicated the rendered service that caused this charge.
    */
  var service: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Unknown does not represent "other" - one of the defined statuses must apply.  Unknown is used when the authoring system is not sure what the current status is.
    * This element is labeled as a modifier because the status contains the code entered-in-error that marks the charge item as not currently valid.
    */
  var status: planned | billable | `not-billable` | aborted | billed | `entered-in-error` | unknown
  
  /**
    * The individual or set of individuals the action is being or was performed on.
    */
  var subject: Reference
  
  /**
    * Further information supporting this charge.
    */
  var supportingInformation: js.UndefOr[js.Array[Reference]] = js.undefined
}
object ChargeItem {
  
  inline def apply(
    code: CodeableConcept,
    status: planned | billable | `not-billable` | aborted | billed | `entered-in-error` | unknown,
    subject: Reference
  ): ChargeItem = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], resourceType = "ChargeItem", status = status.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChargeItem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChargeItem] (val x: Self) extends AnyVal {
    
    inline def setAccount(value: js.Array[Reference]): Self = StObject.set(x, "account", value.asInstanceOf[js.Any])
    
    inline def setAccountUndefined: Self = StObject.set(x, "account", js.undefined)
    
    inline def setAccountVarargs(value: Reference*): Self = StObject.set(x, "account", js.Array(value*))
    
    inline def setBodysite(value: js.Array[CodeableConcept]): Self = StObject.set(x, "bodysite", value.asInstanceOf[js.Any])
    
    inline def setBodysiteUndefined: Self = StObject.set(x, "bodysite", js.undefined)
    
    inline def setBodysiteVarargs(value: CodeableConcept*): Self = StObject.set(x, "bodysite", js.Array(value*))
    
    inline def setCode(value: CodeableConcept): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setContext(value: Reference): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    inline def setCostCenter(value: Reference): Self = StObject.set(x, "costCenter", value.asInstanceOf[js.Any])
    
    inline def setCostCenterUndefined: Self = StObject.set(x, "costCenter", js.undefined)
    
    inline def setDefinitionCanonical(value: js.Array[String]): Self = StObject.set(x, "definitionCanonical", value.asInstanceOf[js.Any])
    
    inline def setDefinitionCanonicalUndefined: Self = StObject.set(x, "definitionCanonical", js.undefined)
    
    inline def setDefinitionCanonicalVarargs(value: String*): Self = StObject.set(x, "definitionCanonical", js.Array(value*))
    
    inline def setDefinitionUri(value: js.Array[String]): Self = StObject.set(x, "definitionUri", value.asInstanceOf[js.Any])
    
    inline def setDefinitionUriUndefined: Self = StObject.set(x, "definitionUri", js.undefined)
    
    inline def setDefinitionUriVarargs(value: String*): Self = StObject.set(x, "definitionUri", js.Array(value*))
    
    inline def setEnteredDate(value: String): Self = StObject.set(x, "enteredDate", value.asInstanceOf[js.Any])
    
    inline def setEnteredDateUndefined: Self = StObject.set(x, "enteredDate", js.undefined)
    
    inline def setEnterer(value: Reference): Self = StObject.set(x, "enterer", value.asInstanceOf[js.Any])
    
    inline def setEntererUndefined: Self = StObject.set(x, "enterer", js.undefined)
    
    inline def setFactorOverride(value: Double): Self = StObject.set(x, "factorOverride", value.asInstanceOf[js.Any])
    
    inline def setFactorOverrideUndefined: Self = StObject.set(x, "factorOverride", js.undefined)
    
    inline def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value*))
    
    inline def setNote(value: js.Array[Annotation]): Self = StObject.set(x, "note", value.asInstanceOf[js.Any])
    
    inline def setNoteUndefined: Self = StObject.set(x, "note", js.undefined)
    
    inline def setNoteVarargs(value: Annotation*): Self = StObject.set(x, "note", js.Array(value*))
    
    inline def setOccurrenceDateTime(value: String): Self = StObject.set(x, "occurrenceDateTime", value.asInstanceOf[js.Any])
    
    inline def setOccurrenceDateTimeUndefined: Self = StObject.set(x, "occurrenceDateTime", js.undefined)
    
    inline def setOccurrencePeriod(value: Period): Self = StObject.set(x, "occurrencePeriod", value.asInstanceOf[js.Any])
    
    inline def setOccurrencePeriodUndefined: Self = StObject.set(x, "occurrencePeriod", js.undefined)
    
    inline def setOccurrenceTiming(value: Timing): Self = StObject.set(x, "occurrenceTiming", value.asInstanceOf[js.Any])
    
    inline def setOccurrenceTimingUndefined: Self = StObject.set(x, "occurrenceTiming", js.undefined)
    
    inline def setOverrideReason(value: String): Self = StObject.set(x, "overrideReason", value.asInstanceOf[js.Any])
    
    inline def setOverrideReasonUndefined: Self = StObject.set(x, "overrideReason", js.undefined)
    
    inline def setPartOf(value: js.Array[Reference]): Self = StObject.set(x, "partOf", value.asInstanceOf[js.Any])
    
    inline def setPartOfUndefined: Self = StObject.set(x, "partOf", js.undefined)
    
    inline def setPartOfVarargs(value: Reference*): Self = StObject.set(x, "partOf", js.Array(value*))
    
    inline def setPerformer(value: js.Array[ChargeItemPerformer]): Self = StObject.set(x, "performer", value.asInstanceOf[js.Any])
    
    inline def setPerformerUndefined: Self = StObject.set(x, "performer", js.undefined)
    
    inline def setPerformerVarargs(value: ChargeItemPerformer*): Self = StObject.set(x, "performer", js.Array(value*))
    
    inline def setPerformingOrganization(value: Reference): Self = StObject.set(x, "performingOrganization", value.asInstanceOf[js.Any])
    
    inline def setPerformingOrganizationUndefined: Self = StObject.set(x, "performingOrganization", js.undefined)
    
    inline def setPriceOverride(value: Money): Self = StObject.set(x, "priceOverride", value.asInstanceOf[js.Any])
    
    inline def setPriceOverrideUndefined: Self = StObject.set(x, "priceOverride", js.undefined)
    
    inline def setProductCodeableConcept(value: CodeableConcept): Self = StObject.set(x, "productCodeableConcept", value.asInstanceOf[js.Any])
    
    inline def setProductCodeableConceptUndefined: Self = StObject.set(x, "productCodeableConcept", js.undefined)
    
    inline def setProductReference(value: Reference): Self = StObject.set(x, "productReference", value.asInstanceOf[js.Any])
    
    inline def setProductReferenceUndefined: Self = StObject.set(x, "productReference", js.undefined)
    
    inline def setQuantity(value: Quantity): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
    
    inline def setQuantityUndefined: Self = StObject.set(x, "quantity", js.undefined)
    
    inline def setReason(value: js.Array[CodeableConcept]): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
    
    inline def setReasonVarargs(value: CodeableConcept*): Self = StObject.set(x, "reason", js.Array(value*))
    
    inline def setRequestingOrganization(value: Reference): Self = StObject.set(x, "requestingOrganization", value.asInstanceOf[js.Any])
    
    inline def setRequestingOrganizationUndefined: Self = StObject.set(x, "requestingOrganization", js.undefined)
    
    inline def setResourceType(value: typings.fhir.fhirStrings.ChargeItem): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setService(value: js.Array[Reference]): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
    
    inline def setServiceUndefined: Self = StObject.set(x, "service", js.undefined)
    
    inline def setServiceVarargs(value: Reference*): Self = StObject.set(x, "service", js.Array(value*))
    
    inline def setStatus(value: planned | billable | `not-billable` | aborted | billed | `entered-in-error` | unknown): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setSubject(value: Reference): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    inline def setSupportingInformation(value: js.Array[Reference]): Self = StObject.set(x, "supportingInformation", value.asInstanceOf[js.Any])
    
    inline def setSupportingInformationUndefined: Self = StObject.set(x, "supportingInformation", js.undefined)
    
    inline def setSupportingInformationVarargs(value: Reference*): Self = StObject.set(x, "supportingInformation", js.Array(value*))
    
    inline def set_definitionCanonical(value: js.Array[Element]): Self = StObject.set(x, "_definitionCanonical", value.asInstanceOf[js.Any])
    
    inline def set_definitionCanonicalUndefined: Self = StObject.set(x, "_definitionCanonical", js.undefined)
    
    inline def set_definitionCanonicalVarargs(value: Element*): Self = StObject.set(x, "_definitionCanonical", js.Array(value*))
    
    inline def set_definitionUri(value: js.Array[Element]): Self = StObject.set(x, "_definitionUri", value.asInstanceOf[js.Any])
    
    inline def set_definitionUriUndefined: Self = StObject.set(x, "_definitionUri", js.undefined)
    
    inline def set_definitionUriVarargs(value: Element*): Self = StObject.set(x, "_definitionUri", js.Array(value*))
    
    inline def set_enteredDate(value: Element): Self = StObject.set(x, "_enteredDate", value.asInstanceOf[js.Any])
    
    inline def set_enteredDateUndefined: Self = StObject.set(x, "_enteredDate", js.undefined)
    
    inline def set_occurrenceDateTime(value: Element): Self = StObject.set(x, "_occurrenceDateTime", value.asInstanceOf[js.Any])
    
    inline def set_occurrenceDateTimeUndefined: Self = StObject.set(x, "_occurrenceDateTime", js.undefined)
    
    inline def set_overrideReason(value: Element): Self = StObject.set(x, "_overrideReason", value.asInstanceOf[js.Any])
    
    inline def set_overrideReasonUndefined: Self = StObject.set(x, "_overrideReason", js.undefined)
    
    inline def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    inline def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
  }
}
