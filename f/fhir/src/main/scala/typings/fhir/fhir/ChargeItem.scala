package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Item containing charge code(s) associated with the provision of healthcare provider products
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.fhir.fhir.Resource because Already inherited */ trait ChargeItem
  extends StObject
     with DomainResource {
  
  /**
    * Contains extended information for property 'definition'.
    */
  var _definition: js.UndefOr[js.Array[Element]] = js.undefined
  
  /**
    * Contains extended information for property 'enteredDate'.
    */
  var _enteredDate: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'factorOverride'.
    */
  var _factorOverride: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'occurrenceDateTime'.
    */
  var _occurrenceDateTime: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'overrideReason'.
    */
  var _overrideReason: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.undefined
  
  /**
    * Account to place this charge
    */
  var account: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Anatomical location, if relevant
    */
  var bodysite: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * A code that identifies the charge, like a billing code
    */
  var code: CodeableConcept
  
  /**
    * Encounter / Episode associated with event
    */
  var context: js.UndefOr[Reference] = js.undefined
  
  /**
    * Defining information about the code of this charge item
    */
  var definition: js.UndefOr[js.Array[uri]] = js.undefined
  
  /**
    * Date the charge item was entered
    */
  var enteredDate: js.UndefOr[dateTime] = js.undefined
  
  /**
    * Individual who was entering
    */
  var enterer: js.UndefOr[Reference] = js.undefined
  
  /**
    * Factor overriding the associated rules
    */
  var factorOverride: js.UndefOr[decimal] = js.undefined
  
  /**
    * Business Identifier for item
    */
  var identifier: js.UndefOr[Identifier] = js.undefined
  
  /**
    * Comments made about the ChargeItem
    */
  var note: js.UndefOr[js.Array[Annotation]] = js.undefined
  
  /**
    * When the charged service was applied
    */
  var occurrenceDateTime: js.UndefOr[dateTime] = js.undefined
  
  /**
    * When the charged service was applied
    */
  var occurrencePeriod: js.UndefOr[Period] = js.undefined
  
  /**
    * When the charged service was applied
    */
  var occurrenceTiming: js.UndefOr[Timing] = js.undefined
  
  /**
    * Reason for overriding the list price/factor
    */
  var overrideReason: js.UndefOr[String] = js.undefined
  
  /**
    * Part of referenced ChargeItem
    */
  var partOf: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Who performed charged service
    */
  var participant: js.UndefOr[js.Array[ChargeItemParticipant]] = js.undefined
  
  /**
    * Organization providing the charged sevice
    */
  var performingOrganization: js.UndefOr[Reference] = js.undefined
  
  /**
    * Price overriding the associated rules
    */
  var priceOverride: js.UndefOr[Money] = js.undefined
  
  /**
    * Quantity of which the charge item has been serviced
    */
  var quantity: js.UndefOr[Quantity] = js.undefined
  
  /**
    * Why was the charged  service rendered?
    */
  var reason: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * Organization requesting the charged service
    */
  var requestingOrganization: js.UndefOr[Reference] = js.undefined
  
  /**
    * Which rendered service is being charged?
    */
  var service: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * planned | billable | not-billable | aborted | billed | entered-in-error | unknown
    */
  var status: code
  
  /**
    * Individual service was done for/to
    */
  var subject: Reference
  
  /**
    * Further information supporting the this charge
    */
  var supportingInformation: js.UndefOr[js.Array[Reference]] = js.undefined
}
object ChargeItem {
  
  @scala.inline
  def apply(code: CodeableConcept, status: code, subject: Reference): ChargeItem = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChargeItem]
  }
  
  @scala.inline
  implicit class ChargeItemMutableBuilder[Self <: ChargeItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccount(value: js.Array[Reference]): Self = StObject.set(x, "account", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountUndefined: Self = StObject.set(x, "account", js.undefined)
    
    @scala.inline
    def setAccountVarargs(value: Reference*): Self = StObject.set(x, "account", js.Array(value :_*))
    
    @scala.inline
    def setBodysite(value: js.Array[CodeableConcept]): Self = StObject.set(x, "bodysite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodysiteUndefined: Self = StObject.set(x, "bodysite", js.undefined)
    
    @scala.inline
    def setBodysiteVarargs(value: CodeableConcept*): Self = StObject.set(x, "bodysite", js.Array(value :_*))
    
    @scala.inline
    def setCode(value: CodeableConcept): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContext(value: Reference): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    @scala.inline
    def setDefinition(value: js.Array[uri]): Self = StObject.set(x, "definition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefinitionUndefined: Self = StObject.set(x, "definition", js.undefined)
    
    @scala.inline
    def setDefinitionVarargs(value: uri*): Self = StObject.set(x, "definition", js.Array(value :_*))
    
    @scala.inline
    def setEnteredDate(value: dateTime): Self = StObject.set(x, "enteredDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnteredDateUndefined: Self = StObject.set(x, "enteredDate", js.undefined)
    
    @scala.inline
    def setEnterer(value: Reference): Self = StObject.set(x, "enterer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntererUndefined: Self = StObject.set(x, "enterer", js.undefined)
    
    @scala.inline
    def setFactorOverride(value: decimal): Self = StObject.set(x, "factorOverride", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFactorOverrideUndefined: Self = StObject.set(x, "factorOverride", js.undefined)
    
    @scala.inline
    def setIdentifier(value: Identifier): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    @scala.inline
    def setNote(value: js.Array[Annotation]): Self = StObject.set(x, "note", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoteUndefined: Self = StObject.set(x, "note", js.undefined)
    
    @scala.inline
    def setNoteVarargs(value: Annotation*): Self = StObject.set(x, "note", js.Array(value :_*))
    
    @scala.inline
    def setOccurrenceDateTime(value: dateTime): Self = StObject.set(x, "occurrenceDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOccurrenceDateTimeUndefined: Self = StObject.set(x, "occurrenceDateTime", js.undefined)
    
    @scala.inline
    def setOccurrencePeriod(value: Period): Self = StObject.set(x, "occurrencePeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOccurrencePeriodUndefined: Self = StObject.set(x, "occurrencePeriod", js.undefined)
    
    @scala.inline
    def setOccurrenceTiming(value: Timing): Self = StObject.set(x, "occurrenceTiming", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOccurrenceTimingUndefined: Self = StObject.set(x, "occurrenceTiming", js.undefined)
    
    @scala.inline
    def setOverrideReason(value: String): Self = StObject.set(x, "overrideReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverrideReasonUndefined: Self = StObject.set(x, "overrideReason", js.undefined)
    
    @scala.inline
    def setPartOf(value: js.Array[Reference]): Self = StObject.set(x, "partOf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartOfUndefined: Self = StObject.set(x, "partOf", js.undefined)
    
    @scala.inline
    def setPartOfVarargs(value: Reference*): Self = StObject.set(x, "partOf", js.Array(value :_*))
    
    @scala.inline
    def setParticipant(value: js.Array[ChargeItemParticipant]): Self = StObject.set(x, "participant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParticipantUndefined: Self = StObject.set(x, "participant", js.undefined)
    
    @scala.inline
    def setParticipantVarargs(value: ChargeItemParticipant*): Self = StObject.set(x, "participant", js.Array(value :_*))
    
    @scala.inline
    def setPerformingOrganization(value: Reference): Self = StObject.set(x, "performingOrganization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPerformingOrganizationUndefined: Self = StObject.set(x, "performingOrganization", js.undefined)
    
    @scala.inline
    def setPriceOverride(value: Money): Self = StObject.set(x, "priceOverride", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPriceOverrideUndefined: Self = StObject.set(x, "priceOverride", js.undefined)
    
    @scala.inline
    def setQuantity(value: Quantity): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuantityUndefined: Self = StObject.set(x, "quantity", js.undefined)
    
    @scala.inline
    def setReason(value: js.Array[CodeableConcept]): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
    
    @scala.inline
    def setReasonVarargs(value: CodeableConcept*): Self = StObject.set(x, "reason", js.Array(value :_*))
    
    @scala.inline
    def setRequestingOrganization(value: Reference): Self = StObject.set(x, "requestingOrganization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestingOrganizationUndefined: Self = StObject.set(x, "requestingOrganization", js.undefined)
    
    @scala.inline
    def setService(value: js.Array[Reference]): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceUndefined: Self = StObject.set(x, "service", js.undefined)
    
    @scala.inline
    def setServiceVarargs(value: Reference*): Self = StObject.set(x, "service", js.Array(value :_*))
    
    @scala.inline
    def setStatus(value: code): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubject(value: Reference): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportingInformation(value: js.Array[Reference]): Self = StObject.set(x, "supportingInformation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportingInformationUndefined: Self = StObject.set(x, "supportingInformation", js.undefined)
    
    @scala.inline
    def setSupportingInformationVarargs(value: Reference*): Self = StObject.set(x, "supportingInformation", js.Array(value :_*))
    
    @scala.inline
    def set_definition(value: js.Array[Element]): Self = StObject.set(x, "_definition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_definitionUndefined: Self = StObject.set(x, "_definition", js.undefined)
    
    @scala.inline
    def set_definitionVarargs(value: Element*): Self = StObject.set(x, "_definition", js.Array(value :_*))
    
    @scala.inline
    def set_enteredDate(value: Element): Self = StObject.set(x, "_enteredDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_enteredDateUndefined: Self = StObject.set(x, "_enteredDate", js.undefined)
    
    @scala.inline
    def set_factorOverride(value: Element): Self = StObject.set(x, "_factorOverride", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_factorOverrideUndefined: Self = StObject.set(x, "_factorOverride", js.undefined)
    
    @scala.inline
    def set_occurrenceDateTime(value: Element): Self = StObject.set(x, "_occurrenceDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_occurrenceDateTimeUndefined: Self = StObject.set(x, "_occurrenceDateTime", js.undefined)
    
    @scala.inline
    def set_overrideReason(value: Element): Self = StObject.set(x, "_overrideReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_overrideReasonUndefined: Self = StObject.set(x, "_overrideReason", js.undefined)
    
    @scala.inline
    def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
  }
}
