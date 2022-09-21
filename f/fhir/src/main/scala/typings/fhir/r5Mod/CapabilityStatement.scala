package typings.fhir.r5Mod

import typings.fhir.fhirStrings.active
import typings.fhir.fhirStrings.capability
import typings.fhir.fhirStrings.draft
import typings.fhir.fhirStrings.instance
import typings.fhir.fhirStrings.requirements
import typings.fhir.fhirStrings.retired
import typings.fhir.fhirStrings.unknown
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CapabilityStatement
  extends StObject
     with DomainResource
     with _FhirResource {
  
  var _copyright: js.UndefOr[Element] = js.undefined
  
  var _date: js.UndefOr[Element] = js.undefined
  
  var _description: js.UndefOr[Element] = js.undefined
  
  var _experimental: js.UndefOr[Element] = js.undefined
  
  var _fhirVersion: js.UndefOr[Element] = js.undefined
  
  var _format: js.UndefOr[js.Array[Element]] = js.undefined
  
  var _implementationGuide: js.UndefOr[js.Array[Element]] = js.undefined
  
  var _imports: js.UndefOr[js.Array[Element]] = js.undefined
  
  var _instantiates: js.UndefOr[js.Array[Element]] = js.undefined
  
  var _kind: js.UndefOr[Element] = js.undefined
  
  var _name: js.UndefOr[Element] = js.undefined
  
  var _patchFormat: js.UndefOr[js.Array[Element]] = js.undefined
  
  var _publisher: js.UndefOr[Element] = js.undefined
  
  var _purpose: js.UndefOr[Element] = js.undefined
  
  var _status: js.UndefOr[Element] = js.undefined
  
  var _title: js.UndefOr[Element] = js.undefined
  
  var _url: js.UndefOr[Element] = js.undefined
  
  var _version: js.UndefOr[Element] = js.undefined
  
  /**
    * May be a web site, an email address, a telephone number, etc.
    */
  var contact: js.UndefOr[js.Array[ContactDetail]] = js.undefined
  
  /**
    * A copyright statement relating to the capability statement and/or its contents. Copyright statements are generally legal restrictions on the use and publishing of the capability statement.
    */
  var copyright: js.UndefOr[String] = js.undefined
  
  /**
    * Note that this is not the same as the resource last-modified-date, since the resource may be a secondary representation of the capability statement. Additional specific dates may be added as extensions or be found by consulting Provenances associated with past versions of the resource.
    */
  var date: String
  
  /**
    * This description can be used to capture details such as why the capability statement was built, comments about misuse, instructions for clinical use and interpretation, literature references, examples from the paper world, etc. It is not a rendering of the capability statement as conveyed in the 'text' field of the resource itself. This item SHOULD be populated unless the information is available from context (e.g. the language of the capability statement is presumed to be the predominant language in the place the capability statement was created).This does not need to be populated if the description is adequately implied by the software or implementation details.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * A document definition.
    */
  var document: js.UndefOr[js.Array[CapabilityStatementDocument]] = js.undefined
  
  /**
    * Allows filtering of capability statements that are appropriate for use versus not.
    */
  var experimental: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Servers may implement multiple versions (see [Managing Multiple Versions](versioning.html), and the [$versions](capabilitystatement-operation-versions.html) operation). If they do, and the CapabilityStatement is requested from the server, then this fhirVersion will be either the version requested, or the server's default version.
    */
  var fhirVersion: String
  
  /**
    * "xml", "json" and "ttl" are allowed, which describe the simple encodings described in the specification (and imply appropriate bundle support). Otherwise, mime types are legal here.
    */
  var format: js.Array[String]
  
  /**
    * Identifies a specific implementation instance that is described by the capability statement - i.e. a particular installation, rather than the capabilities of a software program.
    */
  var implementation: js.UndefOr[CapabilityStatementImplementation] = js.undefined
  
  /**
    * A list of implementation guides that the server does (or should) support in their entirety.
    */
  var implementationGuide: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * the contents of any directly or indirectly imported CapabilityStatements SHALL NOT overlap, i.e. they cannot refer to the same rest/resource, operations/name, searchparam/name, interaction/code, messaging/endpoint, document/mode pair.
    * A capability statement that imports another CapabilityStatement automatically instantiates it too (though this is often not a very useful statement for the kinds of CapabilityStatements that are suitable for importing).
    */
  var imports: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * HL7 defines the following Services: [Terminology Service](terminology-service.html).
    * Many [Implementation Guides](http://fhir.org/guides/registry) define additional services.
    */
  var instantiates: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * It may be possible for the capability statement to be used in jurisdictions other than those for which it was originally designed or intended.
    */
  var jurisdiction: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * The way that this statement is intended to be used, to describe an actual running instance of software, a particular product (kind, not instance of software) or a class of implementation (e.g. a desired purchase).
    */
  var kind: instance | capability | requirements
  
  /**
    * Multiple repetitions allow the documentation of multiple endpoints per solution.
    */
  var messaging: js.UndefOr[js.Array[CapabilityStatementMessaging]] = js.undefined
  
  /**
    * The name is not expected to be globally unique. The name should be a simple alphanumeric type name to ensure that it is machine-processing friendly.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * At present, the patch mime types application/json-patch+json and application/xml-patch+xml are legal. Generally, if a server supports PATCH, it would be expected to support the patch formats and match the formats it supports, but this is not always possible or necessary.
    */
  var patchFormat: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Usually an organization but may be an individual. The publisher (or steward) of the capability statement is the organization or individual primarily responsible for the maintenance and upkeep of the capability statement. This is not necessarily the same individual or organization that developed and initially authored the content. The publisher is the primary point of contact for questions or issues with the capability statement. This item SHOULD be populated unless the information is available from context.
    */
  var publisher: js.UndefOr[String] = js.undefined
  
  /**
    * This element does not describe the usage of the capability statement. Instead, it provides traceability of ''why'' the resource is either needed or ''why'' it is defined as it is.  This may be used to point to source materials or specifications that drove the structure of this capability statement.
    */
  var purpose: js.UndefOr[String] = js.undefined
  
  /** Resource Type Name (for serialization) */
  @JSName("resourceType")
  val resourceType_CapabilityStatement: typings.fhir.fhirStrings.CapabilityStatement
  
  /**
    * Multiple repetitions allow definition of both client and/or server behaviors or possibly behaviors under different configuration settings (for software or requirements statements).
    */
  var rest: js.UndefOr[js.Array[CapabilityStatementRest]] = js.undefined
  
  /**
    * Software that is covered by this capability statement.  It is used when the capability statement describes the capabilities of a particular software version, independent of an installation.
    */
  var software: js.UndefOr[CapabilityStatementSoftware] = js.undefined
  
  /**
    * Allows filtering of capability statements that are appropriate for use versus not.This is not intended for use with actual capability statements, but where capability statements are used to describe possible or desired systems.
    */
  var status: draft | active | retired | unknown
  
  /**
    * This name does not need to be machine-processing friendly and may contain punctuation, white-space, etc.
    */
  var title: js.UndefOr[String] = js.undefined
  
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
    * There may be different capability statement instances that have the same identifier but different versions.  The version can be appended to the url in a reference to allow a reference to a particular business version of the capability statement with the format [url]|[version].
    */
  var version: js.UndefOr[String] = js.undefined
}
object CapabilityStatement {
  
  inline def apply(
    date: String,
    fhirVersion: String,
    format: js.Array[String],
    kind: instance | capability | requirements,
    status: draft | active | retired | unknown
  ): CapabilityStatement = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], fhirVersion = fhirVersion.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], resourceType = "CapabilityStatement", status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[CapabilityStatement]
  }
  
  extension [Self <: CapabilityStatement](x: Self) {
    
    inline def setContact(value: js.Array[ContactDetail]): Self = StObject.set(x, "contact", value.asInstanceOf[js.Any])
    
    inline def setContactUndefined: Self = StObject.set(x, "contact", js.undefined)
    
    inline def setContactVarargs(value: ContactDetail*): Self = StObject.set(x, "contact", js.Array(value*))
    
    inline def setCopyright(value: String): Self = StObject.set(x, "copyright", value.asInstanceOf[js.Any])
    
    inline def setCopyrightUndefined: Self = StObject.set(x, "copyright", js.undefined)
    
    inline def setDate(value: String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDocument(value: js.Array[CapabilityStatementDocument]): Self = StObject.set(x, "document", value.asInstanceOf[js.Any])
    
    inline def setDocumentUndefined: Self = StObject.set(x, "document", js.undefined)
    
    inline def setDocumentVarargs(value: CapabilityStatementDocument*): Self = StObject.set(x, "document", js.Array(value*))
    
    inline def setExperimental(value: Boolean): Self = StObject.set(x, "experimental", value.asInstanceOf[js.Any])
    
    inline def setExperimentalUndefined: Self = StObject.set(x, "experimental", js.undefined)
    
    inline def setFhirVersion(value: String): Self = StObject.set(x, "fhirVersion", value.asInstanceOf[js.Any])
    
    inline def setFormat(value: js.Array[String]): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatVarargs(value: String*): Self = StObject.set(x, "format", js.Array(value*))
    
    inline def setImplementation(value: CapabilityStatementImplementation): Self = StObject.set(x, "implementation", value.asInstanceOf[js.Any])
    
    inline def setImplementationGuide(value: js.Array[String]): Self = StObject.set(x, "implementationGuide", value.asInstanceOf[js.Any])
    
    inline def setImplementationGuideUndefined: Self = StObject.set(x, "implementationGuide", js.undefined)
    
    inline def setImplementationGuideVarargs(value: String*): Self = StObject.set(x, "implementationGuide", js.Array(value*))
    
    inline def setImplementationUndefined: Self = StObject.set(x, "implementation", js.undefined)
    
    inline def setImports(value: js.Array[String]): Self = StObject.set(x, "imports", value.asInstanceOf[js.Any])
    
    inline def setImportsUndefined: Self = StObject.set(x, "imports", js.undefined)
    
    inline def setImportsVarargs(value: String*): Self = StObject.set(x, "imports", js.Array(value*))
    
    inline def setInstantiates(value: js.Array[String]): Self = StObject.set(x, "instantiates", value.asInstanceOf[js.Any])
    
    inline def setInstantiatesUndefined: Self = StObject.set(x, "instantiates", js.undefined)
    
    inline def setInstantiatesVarargs(value: String*): Self = StObject.set(x, "instantiates", js.Array(value*))
    
    inline def setJurisdiction(value: js.Array[CodeableConcept]): Self = StObject.set(x, "jurisdiction", value.asInstanceOf[js.Any])
    
    inline def setJurisdictionUndefined: Self = StObject.set(x, "jurisdiction", js.undefined)
    
    inline def setJurisdictionVarargs(value: CodeableConcept*): Self = StObject.set(x, "jurisdiction", js.Array(value*))
    
    inline def setKind(value: instance | capability | requirements): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setMessaging(value: js.Array[CapabilityStatementMessaging]): Self = StObject.set(x, "messaging", value.asInstanceOf[js.Any])
    
    inline def setMessagingUndefined: Self = StObject.set(x, "messaging", js.undefined)
    
    inline def setMessagingVarargs(value: CapabilityStatementMessaging*): Self = StObject.set(x, "messaging", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPatchFormat(value: js.Array[String]): Self = StObject.set(x, "patchFormat", value.asInstanceOf[js.Any])
    
    inline def setPatchFormatUndefined: Self = StObject.set(x, "patchFormat", js.undefined)
    
    inline def setPatchFormatVarargs(value: String*): Self = StObject.set(x, "patchFormat", js.Array(value*))
    
    inline def setPublisher(value: String): Self = StObject.set(x, "publisher", value.asInstanceOf[js.Any])
    
    inline def setPublisherUndefined: Self = StObject.set(x, "publisher", js.undefined)
    
    inline def setPurpose(value: String): Self = StObject.set(x, "purpose", value.asInstanceOf[js.Any])
    
    inline def setPurposeUndefined: Self = StObject.set(x, "purpose", js.undefined)
    
    inline def setResourceType(value: typings.fhir.fhirStrings.CapabilityStatement): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setRest(value: js.Array[CapabilityStatementRest]): Self = StObject.set(x, "rest", value.asInstanceOf[js.Any])
    
    inline def setRestUndefined: Self = StObject.set(x, "rest", js.undefined)
    
    inline def setRestVarargs(value: CapabilityStatementRest*): Self = StObject.set(x, "rest", js.Array(value*))
    
    inline def setSoftware(value: CapabilityStatementSoftware): Self = StObject.set(x, "software", value.asInstanceOf[js.Any])
    
    inline def setSoftwareUndefined: Self = StObject.set(x, "software", js.undefined)
    
    inline def setStatus(value: draft | active | retired | unknown): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    inline def setUseContext(value: js.Array[UsageContext]): Self = StObject.set(x, "useContext", value.asInstanceOf[js.Any])
    
    inline def setUseContextUndefined: Self = StObject.set(x, "useContext", js.undefined)
    
    inline def setUseContextVarargs(value: UsageContext*): Self = StObject.set(x, "useContext", js.Array(value*))
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    
    inline def set_copyright(value: Element): Self = StObject.set(x, "_copyright", value.asInstanceOf[js.Any])
    
    inline def set_copyrightUndefined: Self = StObject.set(x, "_copyright", js.undefined)
    
    inline def set_date(value: Element): Self = StObject.set(x, "_date", value.asInstanceOf[js.Any])
    
    inline def set_dateUndefined: Self = StObject.set(x, "_date", js.undefined)
    
    inline def set_description(value: Element): Self = StObject.set(x, "_description", value.asInstanceOf[js.Any])
    
    inline def set_descriptionUndefined: Self = StObject.set(x, "_description", js.undefined)
    
    inline def set_experimental(value: Element): Self = StObject.set(x, "_experimental", value.asInstanceOf[js.Any])
    
    inline def set_experimentalUndefined: Self = StObject.set(x, "_experimental", js.undefined)
    
    inline def set_fhirVersion(value: Element): Self = StObject.set(x, "_fhirVersion", value.asInstanceOf[js.Any])
    
    inline def set_fhirVersionUndefined: Self = StObject.set(x, "_fhirVersion", js.undefined)
    
    inline def set_format(value: js.Array[Element]): Self = StObject.set(x, "_format", value.asInstanceOf[js.Any])
    
    inline def set_formatUndefined: Self = StObject.set(x, "_format", js.undefined)
    
    inline def set_formatVarargs(value: Element*): Self = StObject.set(x, "_format", js.Array(value*))
    
    inline def set_implementationGuide(value: js.Array[Element]): Self = StObject.set(x, "_implementationGuide", value.asInstanceOf[js.Any])
    
    inline def set_implementationGuideUndefined: Self = StObject.set(x, "_implementationGuide", js.undefined)
    
    inline def set_implementationGuideVarargs(value: Element*): Self = StObject.set(x, "_implementationGuide", js.Array(value*))
    
    inline def set_imports(value: js.Array[Element]): Self = StObject.set(x, "_imports", value.asInstanceOf[js.Any])
    
    inline def set_importsUndefined: Self = StObject.set(x, "_imports", js.undefined)
    
    inline def set_importsVarargs(value: Element*): Self = StObject.set(x, "_imports", js.Array(value*))
    
    inline def set_instantiates(value: js.Array[Element]): Self = StObject.set(x, "_instantiates", value.asInstanceOf[js.Any])
    
    inline def set_instantiatesUndefined: Self = StObject.set(x, "_instantiates", js.undefined)
    
    inline def set_instantiatesVarargs(value: Element*): Self = StObject.set(x, "_instantiates", js.Array(value*))
    
    inline def set_kind(value: Element): Self = StObject.set(x, "_kind", value.asInstanceOf[js.Any])
    
    inline def set_kindUndefined: Self = StObject.set(x, "_kind", js.undefined)
    
    inline def set_name(value: Element): Self = StObject.set(x, "_name", value.asInstanceOf[js.Any])
    
    inline def set_nameUndefined: Self = StObject.set(x, "_name", js.undefined)
    
    inline def set_patchFormat(value: js.Array[Element]): Self = StObject.set(x, "_patchFormat", value.asInstanceOf[js.Any])
    
    inline def set_patchFormatUndefined: Self = StObject.set(x, "_patchFormat", js.undefined)
    
    inline def set_patchFormatVarargs(value: Element*): Self = StObject.set(x, "_patchFormat", js.Array(value*))
    
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
