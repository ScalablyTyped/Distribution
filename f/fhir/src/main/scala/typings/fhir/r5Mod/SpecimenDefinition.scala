package typings.fhir.r5Mod

import typings.fhir.fhirStrings.active
import typings.fhir.fhirStrings.draft
import typings.fhir.fhirStrings.retired
import typings.fhir.fhirStrings.unknown
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpecimenDefinition
  extends StObject
     with DomainResource
     with _FhirResource {
  
  var _approvalDate: js.UndefOr[Element] = js.undefined
  
  var _copyright: js.UndefOr[Element] = js.undefined
  
  var _date: js.UndefOr[Element] = js.undefined
  
  var _derivedFromCanonical: js.UndefOr[js.Array[Element]] = js.undefined
  
  var _derivedFromUri: js.UndefOr[js.Array[Element]] = js.undefined
  
  var _description: js.UndefOr[Element] = js.undefined
  
  var _experimental: js.UndefOr[Element] = js.undefined
  
  var _lastReviewDate: js.UndefOr[Element] = js.undefined
  
  var _purpose: js.UndefOr[Element] = js.undefined
  
  var _status: js.UndefOr[Element] = js.undefined
  
  var _timeAspect: js.UndefOr[Element] = js.undefined
  
  var _title: js.UndefOr[Element] = js.undefined
  
  var _url: js.UndefOr[Element] = js.undefined
  
  var _version: js.UndefOr[Element] = js.undefined
  
  /**
    * The date may be more recent than the approval date because of minor changes / editorial corrections.
    */
  var approvalDate: js.UndefOr[String] = js.undefined
  
  /**
    * The action to be performed for collecting the specimen.
    */
  var collection: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * May be a web site, an email address, a telephone number, etc.
    */
  var contact: js.UndefOr[js.Array[ContactDetail]] = js.undefined
  
  /**
    * Copyright statement relating to the SpecimenDefinition and/or its contents. Copyright statements are generally legal restrictions on the use and publishing of the SpecimenDefinition.
    */
  var copyright: js.UndefOr[String] = js.undefined
  
  /**
    * For draft definitions, indicates the date of initial creation. For active definitions, represents the date of activation. For withdrawn definitions, indicates the date of withdrawal.
    */
  var date: js.UndefOr[String] = js.undefined
  
  /**
    * The canonical URL pointing to another FHIR-defined SpecimenDefinition that is adhered to in whole or in part by this definition.
    */
  var derivedFromCanonical: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The URL pointing to an externally-defined type of specimen, guideline or other definition that is adhered to in whole or in part by this definition.
    */
  var derivedFromUri: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * This description can be used to capture details such as why the SpecimenDefinition was built, comments about misuse, instructions for clinical use and interpretation, literature references, examples from the paper world, etc. It is not a rendering of the module as conveyed in the text field of the resource itself. This item SHOULD be populated unless the information is available from context.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * The effective period for a SpecimenDefinition determines when the content is applicable for usage and is independent of publication and review dates.
    */
  var effectivePeriod: js.UndefOr[Period] = js.undefined
  
  /**
    * Allows filtering of SpecimenDefinition that are appropriate for use vs. not.
    */
  var experimental: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A business identifier assigned to this SpecimenDefinition.
    */
  var identifier: js.UndefOr[Identifier] = js.undefined
  
  /**
    * A jurisdiction in which the SpecimenDefinition is intended to be used.
    */
  var jurisdiction: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * If specified, this is usually after the approval date.
    */
  var lastReviewDate: js.UndefOr[String] = js.undefined
  
  /**
    * Preparation of the patient for specimen collection.
    */
  var patientPreparation: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * Helps establish the "authority/credibility" of the SpecimenDefinition. May also allow for contact.
    */
  var publisher: js.UndefOr[Reference] = js.undefined
  
  /**
    * This element does not describe the usage of the SpecimenDefinition. Rather it is for traceability of ''why'' the resource is either needed or ''why'' it is defined as it is. This may be used to point to source materials or specifications that drove the structure of this SpecimenDefinition.
    */
  var purpose: js.UndefOr[String] = js.undefined
  
  /** Resource Type Name (for serialization) */
  @JSName("resourceType")
  val resourceType_SpecimenDefinition: typings.fhir.fhirStrings.SpecimenDefinition
  
  /**
    * A nominal state-transition diagram can be found in the [[definition.html#statemachine | Definition pattern]] documentation
    * Unknown does not represent "other" - one of the defined statuses must apply. Unknown is used when the authoring system is not sure what the current status is.
    */
  var status: draft | active | retired | unknown
  
  /**
    * Examples: person, animal, device, water ….
    */
  var subjectCodeableConcept: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Examples: person, animal, device, water ….
    */
  var subjectReference: js.UndefOr[Reference] = js.undefined
  
  /**
    * Time aspect of specimen collection (duration or offset).
    */
  var timeAspect: js.UndefOr[String] = js.undefined
  
  /**
    * A short, descriptive, user-friendly title for the SpecimenDefinition.
    */
  var title: js.UndefOr[String] = js.undefined
  
  /**
    * The kind of material to be collected.
    */
  var typeCollected: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Specimen conditioned in a container as expected by the testing laboratory.
    */
  var typeTested: js.UndefOr[js.Array[SpecimenDefinitionTypeTested]] = js.undefined
  
  /**
    * Can be a urn:uuid: or a urn:oid:, but real http: addresses are preferred. This is the URI that will be used when making canonical references to this resource.
    */
  var url: js.UndefOr[String] = js.undefined
  
  /**
    * When multiple usageContexts are specified, there is no expectation for whether all or any of the contexts apply.
    */
  var useContext: js.UndefOr[js.Array[UsageContext]] = js.undefined
  
  /**
    * There may be multiple different instances of a SpecimenDefinition that have the same identifier but different versions.
    */
  var version: js.UndefOr[String] = js.undefined
}
object SpecimenDefinition {
  
  inline def apply(status: draft | active | retired | unknown): SpecimenDefinition = {
    val __obj = js.Dynamic.literal(resourceType = "SpecimenDefinition", status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpecimenDefinition]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SpecimenDefinition] (val x: Self) extends AnyVal {
    
    inline def setApprovalDate(value: String): Self = StObject.set(x, "approvalDate", value.asInstanceOf[js.Any])
    
    inline def setApprovalDateUndefined: Self = StObject.set(x, "approvalDate", js.undefined)
    
    inline def setCollection(value: js.Array[CodeableConcept]): Self = StObject.set(x, "collection", value.asInstanceOf[js.Any])
    
    inline def setCollectionUndefined: Self = StObject.set(x, "collection", js.undefined)
    
    inline def setCollectionVarargs(value: CodeableConcept*): Self = StObject.set(x, "collection", js.Array(value*))
    
    inline def setContact(value: js.Array[ContactDetail]): Self = StObject.set(x, "contact", value.asInstanceOf[js.Any])
    
    inline def setContactUndefined: Self = StObject.set(x, "contact", js.undefined)
    
    inline def setContactVarargs(value: ContactDetail*): Self = StObject.set(x, "contact", js.Array(value*))
    
    inline def setCopyright(value: String): Self = StObject.set(x, "copyright", value.asInstanceOf[js.Any])
    
    inline def setCopyrightUndefined: Self = StObject.set(x, "copyright", js.undefined)
    
    inline def setDate(value: String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    inline def setDerivedFromCanonical(value: js.Array[String]): Self = StObject.set(x, "derivedFromCanonical", value.asInstanceOf[js.Any])
    
    inline def setDerivedFromCanonicalUndefined: Self = StObject.set(x, "derivedFromCanonical", js.undefined)
    
    inline def setDerivedFromCanonicalVarargs(value: String*): Self = StObject.set(x, "derivedFromCanonical", js.Array(value*))
    
    inline def setDerivedFromUri(value: js.Array[String]): Self = StObject.set(x, "derivedFromUri", value.asInstanceOf[js.Any])
    
    inline def setDerivedFromUriUndefined: Self = StObject.set(x, "derivedFromUri", js.undefined)
    
    inline def setDerivedFromUriVarargs(value: String*): Self = StObject.set(x, "derivedFromUri", js.Array(value*))
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setEffectivePeriod(value: Period): Self = StObject.set(x, "effectivePeriod", value.asInstanceOf[js.Any])
    
    inline def setEffectivePeriodUndefined: Self = StObject.set(x, "effectivePeriod", js.undefined)
    
    inline def setExperimental(value: Boolean): Self = StObject.set(x, "experimental", value.asInstanceOf[js.Any])
    
    inline def setExperimentalUndefined: Self = StObject.set(x, "experimental", js.undefined)
    
    inline def setIdentifier(value: Identifier): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setJurisdiction(value: js.Array[CodeableConcept]): Self = StObject.set(x, "jurisdiction", value.asInstanceOf[js.Any])
    
    inline def setJurisdictionUndefined: Self = StObject.set(x, "jurisdiction", js.undefined)
    
    inline def setJurisdictionVarargs(value: CodeableConcept*): Self = StObject.set(x, "jurisdiction", js.Array(value*))
    
    inline def setLastReviewDate(value: String): Self = StObject.set(x, "lastReviewDate", value.asInstanceOf[js.Any])
    
    inline def setLastReviewDateUndefined: Self = StObject.set(x, "lastReviewDate", js.undefined)
    
    inline def setPatientPreparation(value: js.Array[CodeableConcept]): Self = StObject.set(x, "patientPreparation", value.asInstanceOf[js.Any])
    
    inline def setPatientPreparationUndefined: Self = StObject.set(x, "patientPreparation", js.undefined)
    
    inline def setPatientPreparationVarargs(value: CodeableConcept*): Self = StObject.set(x, "patientPreparation", js.Array(value*))
    
    inline def setPublisher(value: Reference): Self = StObject.set(x, "publisher", value.asInstanceOf[js.Any])
    
    inline def setPublisherUndefined: Self = StObject.set(x, "publisher", js.undefined)
    
    inline def setPurpose(value: String): Self = StObject.set(x, "purpose", value.asInstanceOf[js.Any])
    
    inline def setPurposeUndefined: Self = StObject.set(x, "purpose", js.undefined)
    
    inline def setResourceType(value: typings.fhir.fhirStrings.SpecimenDefinition): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: draft | active | retired | unknown): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setSubjectCodeableConcept(value: CodeableConcept): Self = StObject.set(x, "subjectCodeableConcept", value.asInstanceOf[js.Any])
    
    inline def setSubjectCodeableConceptUndefined: Self = StObject.set(x, "subjectCodeableConcept", js.undefined)
    
    inline def setSubjectReference(value: Reference): Self = StObject.set(x, "subjectReference", value.asInstanceOf[js.Any])
    
    inline def setSubjectReferenceUndefined: Self = StObject.set(x, "subjectReference", js.undefined)
    
    inline def setTimeAspect(value: String): Self = StObject.set(x, "timeAspect", value.asInstanceOf[js.Any])
    
    inline def setTimeAspectUndefined: Self = StObject.set(x, "timeAspect", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setTypeCollected(value: CodeableConcept): Self = StObject.set(x, "typeCollected", value.asInstanceOf[js.Any])
    
    inline def setTypeCollectedUndefined: Self = StObject.set(x, "typeCollected", js.undefined)
    
    inline def setTypeTested(value: js.Array[SpecimenDefinitionTypeTested]): Self = StObject.set(x, "typeTested", value.asInstanceOf[js.Any])
    
    inline def setTypeTestedUndefined: Self = StObject.set(x, "typeTested", js.undefined)
    
    inline def setTypeTestedVarargs(value: SpecimenDefinitionTypeTested*): Self = StObject.set(x, "typeTested", js.Array(value*))
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    inline def setUseContext(value: js.Array[UsageContext]): Self = StObject.set(x, "useContext", value.asInstanceOf[js.Any])
    
    inline def setUseContextUndefined: Self = StObject.set(x, "useContext", js.undefined)
    
    inline def setUseContextVarargs(value: UsageContext*): Self = StObject.set(x, "useContext", js.Array(value*))
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    
    inline def set_approvalDate(value: Element): Self = StObject.set(x, "_approvalDate", value.asInstanceOf[js.Any])
    
    inline def set_approvalDateUndefined: Self = StObject.set(x, "_approvalDate", js.undefined)
    
    inline def set_copyright(value: Element): Self = StObject.set(x, "_copyright", value.asInstanceOf[js.Any])
    
    inline def set_copyrightUndefined: Self = StObject.set(x, "_copyright", js.undefined)
    
    inline def set_date(value: Element): Self = StObject.set(x, "_date", value.asInstanceOf[js.Any])
    
    inline def set_dateUndefined: Self = StObject.set(x, "_date", js.undefined)
    
    inline def set_derivedFromCanonical(value: js.Array[Element]): Self = StObject.set(x, "_derivedFromCanonical", value.asInstanceOf[js.Any])
    
    inline def set_derivedFromCanonicalUndefined: Self = StObject.set(x, "_derivedFromCanonical", js.undefined)
    
    inline def set_derivedFromCanonicalVarargs(value: Element*): Self = StObject.set(x, "_derivedFromCanonical", js.Array(value*))
    
    inline def set_derivedFromUri(value: js.Array[Element]): Self = StObject.set(x, "_derivedFromUri", value.asInstanceOf[js.Any])
    
    inline def set_derivedFromUriUndefined: Self = StObject.set(x, "_derivedFromUri", js.undefined)
    
    inline def set_derivedFromUriVarargs(value: Element*): Self = StObject.set(x, "_derivedFromUri", js.Array(value*))
    
    inline def set_description(value: Element): Self = StObject.set(x, "_description", value.asInstanceOf[js.Any])
    
    inline def set_descriptionUndefined: Self = StObject.set(x, "_description", js.undefined)
    
    inline def set_experimental(value: Element): Self = StObject.set(x, "_experimental", value.asInstanceOf[js.Any])
    
    inline def set_experimentalUndefined: Self = StObject.set(x, "_experimental", js.undefined)
    
    inline def set_lastReviewDate(value: Element): Self = StObject.set(x, "_lastReviewDate", value.asInstanceOf[js.Any])
    
    inline def set_lastReviewDateUndefined: Self = StObject.set(x, "_lastReviewDate", js.undefined)
    
    inline def set_purpose(value: Element): Self = StObject.set(x, "_purpose", value.asInstanceOf[js.Any])
    
    inline def set_purposeUndefined: Self = StObject.set(x, "_purpose", js.undefined)
    
    inline def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    inline def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
    
    inline def set_timeAspect(value: Element): Self = StObject.set(x, "_timeAspect", value.asInstanceOf[js.Any])
    
    inline def set_timeAspectUndefined: Self = StObject.set(x, "_timeAspect", js.undefined)
    
    inline def set_title(value: Element): Self = StObject.set(x, "_title", value.asInstanceOf[js.Any])
    
    inline def set_titleUndefined: Self = StObject.set(x, "_title", js.undefined)
    
    inline def set_url(value: Element): Self = StObject.set(x, "_url", value.asInstanceOf[js.Any])
    
    inline def set_urlUndefined: Self = StObject.set(x, "_url", js.undefined)
    
    inline def set_version(value: Element): Self = StObject.set(x, "_version", value.asInstanceOf[js.Any])
    
    inline def set_versionUndefined: Self = StObject.set(x, "_version", js.undefined)
  }
}
