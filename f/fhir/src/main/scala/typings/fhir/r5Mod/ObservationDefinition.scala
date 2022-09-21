package typings.fhir.r5Mod

import typings.fhir.fhirStrings.active
import typings.fhir.fhirStrings.boolean
import typings.fhir.fhirStrings.dateTime
import typings.fhir.fhirStrings.draft
import typings.fhir.fhirStrings.integer
import typings.fhir.fhirStrings.retired
import typings.fhir.fhirStrings.string
import typings.fhir.fhirStrings.time
import typings.fhir.fhirStrings.unknown
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ObservationDefinition
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
  
  var _multipleResultsAllowed: js.UndefOr[Element] = js.undefined
  
  var _name: js.UndefOr[Element] = js.undefined
  
  var _permittedDataType: js.UndefOr[js.Array[Element]] = js.undefined
  
  var _preferredReportName: js.UndefOr[Element] = js.undefined
  
  var _purpose: js.UndefOr[Element] = js.undefined
  
  var _status: js.UndefOr[Element] = js.undefined
  
  var _title: js.UndefOr[Element] = js.undefined
  
  var _url: js.UndefOr[Element] = js.undefined
  
  var _version: js.UndefOr[Element] = js.undefined
  
  /**
    * The date may be more recent than the approval date because of minor changes / editorial corrections.
    */
  var approvalDate: js.UndefOr[String] = js.undefined
  
  /**
    * Only used if the defined observation is to be made directly on a body part and if this body part is not implied by code found in ObservationDefinition.code. Not used for in vitro diagnostic observations.
    * Example: 14975008 |Forearm structure|.
    */
  var bodySite: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * This element allows various categorization schemes based on the owner’s definition of the category and effectively multiple categories can be used for one instance of ObservationDefinition. The level of granularity is defined by the category concepts in the value set.
    */
  var category: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * Describes what will be observed. Sometimes this is called the observation "name".
    */
  var code: CodeableConcept
  
  /**
    * Some observations have multiple component observations, expressed as separate code value pairs.
    */
  var component: js.UndefOr[js.Array[ObservationDefinitionComponent]] = js.undefined
  
  /**
    * May be a web site, an email address, a telephone number, etc.
    */
  var contact: js.UndefOr[js.Array[ContactDetail]] = js.undefined
  
  /**
    * Copyright statement relating to the ObservationDefinition and/or its contents. Copyright statements are generally legal restrictions on the use and publishing of the ObservationDefinition.
    */
  var copyright: js.UndefOr[String] = js.undefined
  
  /**
    * Note that this is not the same as the resource last-modified-date, since the resource may be a secondary representation of the ObservationDefinition. Additional specific dates may be added as extensions or be found by consulting Provenances associated with past versions of the resource.
    */
  var date: js.UndefOr[String] = js.undefined
  
  /**
    * The canonical URL pointing to another FHIR-defined ObservationDefinition that is adhered to in whole or in part by this definition.
    */
  var derivedFromCanonical: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The URL pointing to an externally-defined observation definition, guideline or other definition that is adhered to in whole or in part by this definition.
    */
  var derivedFromUri: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * This description can be used to capture details such as why the ObservationDefinition was built, comments about misuse, instructions for clinical use and interpretation, literature references, examples from the paper world, etc. It is not a rendering of the module as conveyed in the text field of the resource itself. This item SHOULD be populated unless the information is available from context.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * When multiple occurrences of device are present, they are to be combined with a logical OR: at least one of the specified devices is used to produce the observation.
    */
  var device: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * The effective period for an ObservationDefinition determines when the content is applicable for usage and is independent of publication and review dates. For example, an observation intended to be used for the year 2021 might be published in 2020.
    */
  var effectivePeriod: js.UndefOr[Period] = js.undefined
  
  /**
    * Allows filtering of ObservationDefinition that are appropriate for use vs. not.
    */
  var experimental: js.UndefOr[Boolean] = js.undefined
  
  /**
    * This ObservationDefinition defines a group  observation (e.g. a battery, a panel of tests, a set of vital sign measurements) that includes the target as a member of the group.
    */
  var hasMember: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * This is a business identifier, not a resource identifier. It is best practice for the identifier to only appear on a single resource instance, however business practices may occasionally dictate that multiple resource instances with the same identifier can exist - possibly even with different resource types.
    */
  var identifier: js.UndefOr[Identifier] = js.undefined
  
  /**
    * It may be possible for the ObservationDefinition to be used in jurisdictions other than those for which it was originally designed or intended.
    */
  var jurisdiction: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * If specified, this is usually after the approval date.
    */
  var lastReviewDate: js.UndefOr[String] = js.undefined
  
  /**
    * Only used if not implicit in observation code
    * Example: 702659008 |Automated count technique|.
    */
  var method: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * An example of observation allowing multiple results is "bacteria identified by culture". Conversely, the measurement of a potassium level allows a single result.
    */
  var multipleResultsAllowed: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The name is not expected to be globally unique. The name should be a simple alphanumeric type name to ensure that it is machine-processing friendly.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * The type of individual/organization/device that is expected to act upon instances of this definition.
    */
  var performerType: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * The data types allowed for the value element of the instance observations conforming to this ObservationDefinition.
    */
  var permittedDataType: js.UndefOr[
    js.Array[
      typings.fhir.fhirStrings.Quantity | typings.fhir.fhirStrings.CodeableConcept | string | boolean | integer | typings.fhir.fhirStrings.Range | typings.fhir.fhirStrings.Ratio | typings.fhir.fhirStrings.SampledData | time | dateTime | typings.fhir.fhirStrings.Period
    ]
  ] = js.undefined
  
  /**
    * The preferred name to be used when reporting the results of observations conforming to this ObservationDefinition.
    */
  var preferredReportName: js.UndefOr[String] = js.undefined
  
  /**
    * Helps establish the "authority/credibility" of the ObservationDefinition. May also allow for contact.
    */
  var publisher: js.UndefOr[Reference] = js.undefined
  
  /**
    * This element does not describe the usage of the ObservationDefinition. Rather it is for traceability of ''why'' the resource is either needed or ''why'' it is defined as it is. This may be used to point to source materials or specifications that drove the structure of this ObservationDefinition.
    */
  var purpose: js.UndefOr[String] = js.undefined
  
  /**
    * A set of qualified values associated with a context and a set of conditions -  provides a range for quantitative and ordinal observations and a collection of value sets for qualitative observations.
    */
  var qualifiedValue: js.UndefOr[js.Array[ObservationDefinitionQualifiedValue]] = js.undefined
  
  /**
    * Characteristics for quantitative results of observations conforming to this ObservationDefinition.
    */
  var quantitativeDetails: js.UndefOr[ObservationDefinitionQuantitativeDetails] = js.undefined
  
  /** Resource Type Name (for serialization) */
  @JSName("resourceType")
  val resourceType_ObservationDefinition: typings.fhir.fhirStrings.ObservationDefinition
  
  /**
    * Only used for in vitro observations. When multiple occurrences of specimen are present, they are to be combined with a logical AND: all specified specimens  are needed for the observation.
    */
  var specimen: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * A nominal state-transition diagram can be found in the [[definition.html#statemachine | Definition pattern]] documentation
    * Unknown does not represent "other" - one of the defined statuses must apply. Unknown is used when the authoring system is not sure what the current status is.
    */
  var status: draft | active | retired | unknown
  
  /**
    * Examples: person, animal, device, air, surface ….
    */
  var subject: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * A short, descriptive, user-friendly title for the ObservationDefinition.
    */
  var title: js.UndefOr[String] = js.undefined
  
  /**
    * Can be a urn:uuid: or a urn:oid:, but real http: addresses are preferred. This is the URI that will be used when making canonical references to this resource.
    */
  var url: js.UndefOr[String] = js.undefined
  
  /**
    * When multiple usageContexts are specified, there is no expectation for whether all or any of the contexts apply.
    */
  var useContext: js.UndefOr[js.Array[UsageContext]] = js.undefined
  
  /**
    * There may be multiple different instances of a ObservationDefinition that have the same identifier but different versions.
    */
  var version: js.UndefOr[String] = js.undefined
}
object ObservationDefinition {
  
  inline def apply(code: CodeableConcept, status: draft | active | retired | unknown): ObservationDefinition = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], resourceType = "ObservationDefinition", status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObservationDefinition]
  }
  
  extension [Self <: ObservationDefinition](x: Self) {
    
    inline def setApprovalDate(value: String): Self = StObject.set(x, "approvalDate", value.asInstanceOf[js.Any])
    
    inline def setApprovalDateUndefined: Self = StObject.set(x, "approvalDate", js.undefined)
    
    inline def setBodySite(value: CodeableConcept): Self = StObject.set(x, "bodySite", value.asInstanceOf[js.Any])
    
    inline def setBodySiteUndefined: Self = StObject.set(x, "bodySite", js.undefined)
    
    inline def setCategory(value: js.Array[CodeableConcept]): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    inline def setCategoryVarargs(value: CodeableConcept*): Self = StObject.set(x, "category", js.Array(value*))
    
    inline def setCode(value: CodeableConcept): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setComponent(value: js.Array[ObservationDefinitionComponent]): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
    
    inline def setComponentVarargs(value: ObservationDefinitionComponent*): Self = StObject.set(x, "component", js.Array(value*))
    
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
    
    inline def setDevice(value: js.Array[Reference]): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
    
    inline def setDeviceUndefined: Self = StObject.set(x, "device", js.undefined)
    
    inline def setDeviceVarargs(value: Reference*): Self = StObject.set(x, "device", js.Array(value*))
    
    inline def setEffectivePeriod(value: Period): Self = StObject.set(x, "effectivePeriod", value.asInstanceOf[js.Any])
    
    inline def setEffectivePeriodUndefined: Self = StObject.set(x, "effectivePeriod", js.undefined)
    
    inline def setExperimental(value: Boolean): Self = StObject.set(x, "experimental", value.asInstanceOf[js.Any])
    
    inline def setExperimentalUndefined: Self = StObject.set(x, "experimental", js.undefined)
    
    inline def setHasMember(value: js.Array[Reference]): Self = StObject.set(x, "hasMember", value.asInstanceOf[js.Any])
    
    inline def setHasMemberUndefined: Self = StObject.set(x, "hasMember", js.undefined)
    
    inline def setHasMemberVarargs(value: Reference*): Self = StObject.set(x, "hasMember", js.Array(value*))
    
    inline def setIdentifier(value: Identifier): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setJurisdiction(value: js.Array[CodeableConcept]): Self = StObject.set(x, "jurisdiction", value.asInstanceOf[js.Any])
    
    inline def setJurisdictionUndefined: Self = StObject.set(x, "jurisdiction", js.undefined)
    
    inline def setJurisdictionVarargs(value: CodeableConcept*): Self = StObject.set(x, "jurisdiction", js.Array(value*))
    
    inline def setLastReviewDate(value: String): Self = StObject.set(x, "lastReviewDate", value.asInstanceOf[js.Any])
    
    inline def setLastReviewDateUndefined: Self = StObject.set(x, "lastReviewDate", js.undefined)
    
    inline def setMethod(value: CodeableConcept): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    inline def setMultipleResultsAllowed(value: Boolean): Self = StObject.set(x, "multipleResultsAllowed", value.asInstanceOf[js.Any])
    
    inline def setMultipleResultsAllowedUndefined: Self = StObject.set(x, "multipleResultsAllowed", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPerformerType(value: CodeableConcept): Self = StObject.set(x, "performerType", value.asInstanceOf[js.Any])
    
    inline def setPerformerTypeUndefined: Self = StObject.set(x, "performerType", js.undefined)
    
    inline def setPermittedDataType(
      value: js.Array[
          typings.fhir.fhirStrings.Quantity | typings.fhir.fhirStrings.CodeableConcept | string | boolean | integer | typings.fhir.fhirStrings.Range | typings.fhir.fhirStrings.Ratio | typings.fhir.fhirStrings.SampledData | time | dateTime | typings.fhir.fhirStrings.Period
        ]
    ): Self = StObject.set(x, "permittedDataType", value.asInstanceOf[js.Any])
    
    inline def setPermittedDataTypeUndefined: Self = StObject.set(x, "permittedDataType", js.undefined)
    
    inline def setPermittedDataTypeVarargs(
      value: (typings.fhir.fhirStrings.Quantity | typings.fhir.fhirStrings.CodeableConcept | string | boolean | integer | typings.fhir.fhirStrings.Range | typings.fhir.fhirStrings.Ratio | typings.fhir.fhirStrings.SampledData | time | dateTime | typings.fhir.fhirStrings.Period)*
    ): Self = StObject.set(x, "permittedDataType", js.Array(value*))
    
    inline def setPreferredReportName(value: String): Self = StObject.set(x, "preferredReportName", value.asInstanceOf[js.Any])
    
    inline def setPreferredReportNameUndefined: Self = StObject.set(x, "preferredReportName", js.undefined)
    
    inline def setPublisher(value: Reference): Self = StObject.set(x, "publisher", value.asInstanceOf[js.Any])
    
    inline def setPublisherUndefined: Self = StObject.set(x, "publisher", js.undefined)
    
    inline def setPurpose(value: String): Self = StObject.set(x, "purpose", value.asInstanceOf[js.Any])
    
    inline def setPurposeUndefined: Self = StObject.set(x, "purpose", js.undefined)
    
    inline def setQualifiedValue(value: js.Array[ObservationDefinitionQualifiedValue]): Self = StObject.set(x, "qualifiedValue", value.asInstanceOf[js.Any])
    
    inline def setQualifiedValueUndefined: Self = StObject.set(x, "qualifiedValue", js.undefined)
    
    inline def setQualifiedValueVarargs(value: ObservationDefinitionQualifiedValue*): Self = StObject.set(x, "qualifiedValue", js.Array(value*))
    
    inline def setQuantitativeDetails(value: ObservationDefinitionQuantitativeDetails): Self = StObject.set(x, "quantitativeDetails", value.asInstanceOf[js.Any])
    
    inline def setQuantitativeDetailsUndefined: Self = StObject.set(x, "quantitativeDetails", js.undefined)
    
    inline def setResourceType(value: typings.fhir.fhirStrings.ObservationDefinition): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setSpecimen(value: js.Array[Reference]): Self = StObject.set(x, "specimen", value.asInstanceOf[js.Any])
    
    inline def setSpecimenUndefined: Self = StObject.set(x, "specimen", js.undefined)
    
    inline def setSpecimenVarargs(value: Reference*): Self = StObject.set(x, "specimen", js.Array(value*))
    
    inline def setStatus(value: draft | active | retired | unknown): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setSubject(value: js.Array[CodeableConcept]): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    inline def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
    
    inline def setSubjectVarargs(value: CodeableConcept*): Self = StObject.set(x, "subject", js.Array(value*))
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
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
    
    inline def set_multipleResultsAllowed(value: Element): Self = StObject.set(x, "_multipleResultsAllowed", value.asInstanceOf[js.Any])
    
    inline def set_multipleResultsAllowedUndefined: Self = StObject.set(x, "_multipleResultsAllowed", js.undefined)
    
    inline def set_name(value: Element): Self = StObject.set(x, "_name", value.asInstanceOf[js.Any])
    
    inline def set_nameUndefined: Self = StObject.set(x, "_name", js.undefined)
    
    inline def set_permittedDataType(value: js.Array[Element]): Self = StObject.set(x, "_permittedDataType", value.asInstanceOf[js.Any])
    
    inline def set_permittedDataTypeUndefined: Self = StObject.set(x, "_permittedDataType", js.undefined)
    
    inline def set_permittedDataTypeVarargs(value: Element*): Self = StObject.set(x, "_permittedDataType", js.Array(value*))
    
    inline def set_preferredReportName(value: Element): Self = StObject.set(x, "_preferredReportName", value.asInstanceOf[js.Any])
    
    inline def set_preferredReportNameUndefined: Self = StObject.set(x, "_preferredReportName", js.undefined)
    
    inline def set_purpose(value: Element): Self = StObject.set(x, "_purpose", value.asInstanceOf[js.Any])
    
    inline def set_purposeUndefined: Self = StObject.set(x, "_purpose", js.undefined)
    
    inline def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    inline def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
    
    inline def set_title(value: Element): Self = StObject.set(x, "_title", value.asInstanceOf[js.Any])
    
    inline def set_titleUndefined: Self = StObject.set(x, "_title", js.undefined)
    
    inline def set_url(value: Element): Self = StObject.set(x, "_url", value.asInstanceOf[js.Any])
    
    inline def set_urlUndefined: Self = StObject.set(x, "_url", js.undefined)
    
    inline def set_version(value: Element): Self = StObject.set(x, "_version", value.asInstanceOf[js.Any])
    
    inline def set_versionUndefined: Self = StObject.set(x, "_version", js.undefined)
  }
}
