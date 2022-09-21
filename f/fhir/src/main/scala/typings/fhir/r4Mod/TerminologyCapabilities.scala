package typings.fhir.r4Mod

import typings.fhir.fhirStrings.active
import typings.fhir.fhirStrings.all
import typings.fhir.fhirStrings.capability
import typings.fhir.fhirStrings.draft
import typings.fhir.fhirStrings.explicit
import typings.fhir.fhirStrings.instance
import typings.fhir.fhirStrings.requirements
import typings.fhir.fhirStrings.retired
import typings.fhir.fhirStrings.unknown
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TerminologyCapabilities
  extends StObject
     with DomainResource
     with _FhirResource {
  
  var _codeSearch: js.UndefOr[Element] = js.undefined
  
  var _copyright: js.UndefOr[Element] = js.undefined
  
  var _date: js.UndefOr[Element] = js.undefined
  
  var _description: js.UndefOr[Element] = js.undefined
  
  var _experimental: js.UndefOr[Element] = js.undefined
  
  var _kind: js.UndefOr[Element] = js.undefined
  
  var _lockedDate: js.UndefOr[Element] = js.undefined
  
  var _name: js.UndefOr[Element] = js.undefined
  
  var _publisher: js.UndefOr[Element] = js.undefined
  
  var _purpose: js.UndefOr[Element] = js.undefined
  
  var _status: js.UndefOr[Element] = js.undefined
  
  var _title: js.UndefOr[Element] = js.undefined
  
  var _url: js.UndefOr[Element] = js.undefined
  
  var _version: js.UndefOr[Element] = js.undefined
  
  /**
    * Whether the $closure operation is supported.
    */
  var closure: js.UndefOr[TerminologyCapabilitiesClosure] = js.undefined
  
  /**
    * See notes on the [ValueSet](valueset.html#) resource.
    */
  var codeSearch: js.UndefOr[explicit | all] = js.undefined
  
  /**
    * The code system - identified by its system URL - may also be declared explicitly as a Code System Resource at /CodeSystem, but it might not be.
    */
  var codeSystem: js.UndefOr[js.Array[TerminologyCapabilitiesCodeSystem]] = js.undefined
  
  /**
    * May be a web site, an email address, a telephone number, etc.
    */
  var contact: js.UndefOr[js.Array[ContactDetail]] = js.undefined
  
  /**
    * A copyright statement relating to the terminology capabilities and/or its contents. Copyright statements are generally legal restrictions on the use and publishing of the terminology capabilities.
    */
  var copyright: js.UndefOr[String] = js.undefined
  
  /**
    * Note that this is not the same as the resource last-modified-date, since the resource may be a secondary representation of the terminology capabilities. Additional specific dates may be added as extensions or be found by consulting Provenances associated with past versions of the resource.
    */
  var date: String
  
  /**
    * This description can be used to capture details such as why the terminology capabilities was built, comments about misuse, instructions for clinical use and interpretation, literature references, examples from the paper world, etc. It is not a rendering of the terminology capabilities as conveyed in the 'text' field of the resource itself. This item SHOULD be populated unless the information is available from context (e.g. the language of the terminology capabilities is presumed to be the predominant language in the place the terminology capabilities was created).This does not need to be populated if the description is adequately implied by the software or implementation details.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * Information about the [ValueSet/$expand](valueset-operation-expand.html) operation.
    */
  var expansion: js.UndefOr[TerminologyCapabilitiesExpansion] = js.undefined
  
  /**
    * Allows filtering of terminology capabilitiess that are appropriate for use versus not.
    */
  var experimental: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Identifies a specific implementation instance that is described by the terminology capability statement - i.e. a particular installation, rather than the capabilities of a software program.
    */
  var implementation: js.UndefOr[TerminologyCapabilitiesImplementation] = js.undefined
  
  /**
    * It may be possible for the terminology capabilities to be used in jurisdictions other than those for which it was originally designed or intended.
    */
  var jurisdiction: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * The way that this statement is intended to be used, to describe an actual running instance of software, a particular product (kind, not instance of software) or a class of implementation (e.g. a desired purchase).
    */
  var kind: instance | capability | requirements
  
  /**
    * Whether the server supports lockedDate.
    */
  var lockedDate: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The name is not expected to be globally unique. The name should be a simple alphanumeric type name to ensure that it is machine-processing friendly.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Usually an organization but may be an individual. The publisher (or steward) of the terminology capabilities is the organization or individual primarily responsible for the maintenance and upkeep of the terminology capabilities. This is not necessarily the same individual or organization that developed and initially authored the content. The publisher is the primary point of contact for questions or issues with the terminology capabilities. This item SHOULD be populated unless the information is available from context.
    */
  var publisher: js.UndefOr[String] = js.undefined
  
  /**
    * This element does not describe the usage of the terminology capabilities. Instead, it provides traceability of ''why'' the resource is either needed or ''why'' it is defined as it is.  This may be used to point to source materials or specifications that drove the structure of this terminology capabilities.
    */
  var purpose: js.UndefOr[String] = js.undefined
  
  /** Resource Type Name (for serialization) */
  @JSName("resourceType")
  val resourceType_TerminologyCapabilities: typings.fhir.fhirStrings.TerminologyCapabilities
  
  /**
    * Software that is covered by this terminology capability statement.  It is used when the statement describes the capabilities of a particular software version, independent of an installation.
    */
  var software: js.UndefOr[TerminologyCapabilitiesSoftware] = js.undefined
  
  /**
    * Allows filtering of terminology capabilitiess that are appropriate for use versus not.This is not intended for use with actual capability statements, but where capability statements are used to describe possible or desired systems.
    */
  var status: draft | active | retired | unknown
  
  /**
    * This name does not need to be machine-processing friendly and may contain punctuation, white-space, etc.
    */
  var title: js.UndefOr[String] = js.undefined
  
  /**
    * Information about the [ConceptMap/$translate](conceptmap-operation-translate.html) operation.
    */
  var translation: js.UndefOr[TerminologyCapabilitiesTranslation] = js.undefined
  
  /**
    * Can be a urn:uuid: or a urn:oid: but real http: addresses are preferred.  Multiple instances may share the same URL if they have a distinct version.
    * The determination of when to create a new version of a resource (same url, new version) vs. defining a new artifact is up to the author.  Considerations for making this decision are found in [Technical and Business Versions](resource.html#versions).
    * In some cases, the resource can no longer be found at the stated url, but the url itself cannot change. Implementations can use the [meta.source](resource.html#meta) element to indicate where the current master source of the resource can be found.
    */
  var url: js.UndefOr[String] = js.undefined
  
  /**
    * When multiple useContexts are specified, there is no expectation that all or any of the contexts apply.
    */
  var useContext: js.UndefOr[js.Array[UsageContext]] = js.undefined
  
  /**
    * Information about the [ValueSet/$validate-code](valueset-operation-validate-code.html) operation.
    */
  var validateCode: js.UndefOr[TerminologyCapabilitiesValidateCode] = js.undefined
  
  /**
    * There may be different terminology capabilities instances that have the same identifier but different versions.  The version can be appended to the url in a reference to allow a reference to a particular business version of the terminology capabilities with the format [url]|[version].
    */
  var version: js.UndefOr[String] = js.undefined
}
object TerminologyCapabilities {
  
  inline def apply(
    date: String,
    kind: instance | capability | requirements,
    status: draft | active | retired | unknown
  ): TerminologyCapabilities = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], resourceType = "TerminologyCapabilities", status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[TerminologyCapabilities]
  }
  
  extension [Self <: TerminologyCapabilities](x: Self) {
    
    inline def setClosure(value: TerminologyCapabilitiesClosure): Self = StObject.set(x, "closure", value.asInstanceOf[js.Any])
    
    inline def setClosureUndefined: Self = StObject.set(x, "closure", js.undefined)
    
    inline def setCodeSearch(value: explicit | all): Self = StObject.set(x, "codeSearch", value.asInstanceOf[js.Any])
    
    inline def setCodeSearchUndefined: Self = StObject.set(x, "codeSearch", js.undefined)
    
    inline def setCodeSystem(value: js.Array[TerminologyCapabilitiesCodeSystem]): Self = StObject.set(x, "codeSystem", value.asInstanceOf[js.Any])
    
    inline def setCodeSystemUndefined: Self = StObject.set(x, "codeSystem", js.undefined)
    
    inline def setCodeSystemVarargs(value: TerminologyCapabilitiesCodeSystem*): Self = StObject.set(x, "codeSystem", js.Array(value*))
    
    inline def setContact(value: js.Array[ContactDetail]): Self = StObject.set(x, "contact", value.asInstanceOf[js.Any])
    
    inline def setContactUndefined: Self = StObject.set(x, "contact", js.undefined)
    
    inline def setContactVarargs(value: ContactDetail*): Self = StObject.set(x, "contact", js.Array(value*))
    
    inline def setCopyright(value: String): Self = StObject.set(x, "copyright", value.asInstanceOf[js.Any])
    
    inline def setCopyrightUndefined: Self = StObject.set(x, "copyright", js.undefined)
    
    inline def setDate(value: String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setExpansion(value: TerminologyCapabilitiesExpansion): Self = StObject.set(x, "expansion", value.asInstanceOf[js.Any])
    
    inline def setExpansionUndefined: Self = StObject.set(x, "expansion", js.undefined)
    
    inline def setExperimental(value: Boolean): Self = StObject.set(x, "experimental", value.asInstanceOf[js.Any])
    
    inline def setExperimentalUndefined: Self = StObject.set(x, "experimental", js.undefined)
    
    inline def setImplementation(value: TerminologyCapabilitiesImplementation): Self = StObject.set(x, "implementation", value.asInstanceOf[js.Any])
    
    inline def setImplementationUndefined: Self = StObject.set(x, "implementation", js.undefined)
    
    inline def setJurisdiction(value: js.Array[CodeableConcept]): Self = StObject.set(x, "jurisdiction", value.asInstanceOf[js.Any])
    
    inline def setJurisdictionUndefined: Self = StObject.set(x, "jurisdiction", js.undefined)
    
    inline def setJurisdictionVarargs(value: CodeableConcept*): Self = StObject.set(x, "jurisdiction", js.Array(value*))
    
    inline def setKind(value: instance | capability | requirements): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setLockedDate(value: Boolean): Self = StObject.set(x, "lockedDate", value.asInstanceOf[js.Any])
    
    inline def setLockedDateUndefined: Self = StObject.set(x, "lockedDate", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPublisher(value: String): Self = StObject.set(x, "publisher", value.asInstanceOf[js.Any])
    
    inline def setPublisherUndefined: Self = StObject.set(x, "publisher", js.undefined)
    
    inline def setPurpose(value: String): Self = StObject.set(x, "purpose", value.asInstanceOf[js.Any])
    
    inline def setPurposeUndefined: Self = StObject.set(x, "purpose", js.undefined)
    
    inline def setResourceType(value: typings.fhir.fhirStrings.TerminologyCapabilities): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setSoftware(value: TerminologyCapabilitiesSoftware): Self = StObject.set(x, "software", value.asInstanceOf[js.Any])
    
    inline def setSoftwareUndefined: Self = StObject.set(x, "software", js.undefined)
    
    inline def setStatus(value: draft | active | retired | unknown): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setTranslation(value: TerminologyCapabilitiesTranslation): Self = StObject.set(x, "translation", value.asInstanceOf[js.Any])
    
    inline def setTranslationUndefined: Self = StObject.set(x, "translation", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    inline def setUseContext(value: js.Array[UsageContext]): Self = StObject.set(x, "useContext", value.asInstanceOf[js.Any])
    
    inline def setUseContextUndefined: Self = StObject.set(x, "useContext", js.undefined)
    
    inline def setUseContextVarargs(value: UsageContext*): Self = StObject.set(x, "useContext", js.Array(value*))
    
    inline def setValidateCode(value: TerminologyCapabilitiesValidateCode): Self = StObject.set(x, "validateCode", value.asInstanceOf[js.Any])
    
    inline def setValidateCodeUndefined: Self = StObject.set(x, "validateCode", js.undefined)
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    
    inline def set_codeSearch(value: Element): Self = StObject.set(x, "_codeSearch", value.asInstanceOf[js.Any])
    
    inline def set_codeSearchUndefined: Self = StObject.set(x, "_codeSearch", js.undefined)
    
    inline def set_copyright(value: Element): Self = StObject.set(x, "_copyright", value.asInstanceOf[js.Any])
    
    inline def set_copyrightUndefined: Self = StObject.set(x, "_copyright", js.undefined)
    
    inline def set_date(value: Element): Self = StObject.set(x, "_date", value.asInstanceOf[js.Any])
    
    inline def set_dateUndefined: Self = StObject.set(x, "_date", js.undefined)
    
    inline def set_description(value: Element): Self = StObject.set(x, "_description", value.asInstanceOf[js.Any])
    
    inline def set_descriptionUndefined: Self = StObject.set(x, "_description", js.undefined)
    
    inline def set_experimental(value: Element): Self = StObject.set(x, "_experimental", value.asInstanceOf[js.Any])
    
    inline def set_experimentalUndefined: Self = StObject.set(x, "_experimental", js.undefined)
    
    inline def set_kind(value: Element): Self = StObject.set(x, "_kind", value.asInstanceOf[js.Any])
    
    inline def set_kindUndefined: Self = StObject.set(x, "_kind", js.undefined)
    
    inline def set_lockedDate(value: Element): Self = StObject.set(x, "_lockedDate", value.asInstanceOf[js.Any])
    
    inline def set_lockedDateUndefined: Self = StObject.set(x, "_lockedDate", js.undefined)
    
    inline def set_name(value: Element): Self = StObject.set(x, "_name", value.asInstanceOf[js.Any])
    
    inline def set_nameUndefined: Self = StObject.set(x, "_name", js.undefined)
    
    inline def set_publisher(value: Element): Self = StObject.set(x, "_publisher", value.asInstanceOf[js.Any])
    
    inline def set_publisherUndefined: Self = StObject.set(x, "_publisher", js.undefined)
    
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
