package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A statement of system capabilities
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.fhir.fhir.Resource because Already inherited */ trait CapabilityStatement
  extends StObject
     with DomainResource {
  
  /**
    * Contains extended information for property 'acceptUnknown'.
    */
  var _acceptUnknown: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'copyright'.
    */
  var _copyright: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'date'.
    */
  var _date: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'description'.
    */
  var _description: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'experimental'.
    */
  var _experimental: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'fhirVersion'.
    */
  var _fhirVersion: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'format'.
    */
  var _format: js.UndefOr[js.Array[Element]] = js.undefined
  
  /**
    * Contains extended information for property 'implementationGuide'.
    */
  var _implementationGuide: js.UndefOr[js.Array[Element]] = js.undefined
  
  /**
    * Contains extended information for property 'instantiates'.
    */
  var _instantiates: js.UndefOr[js.Array[Element]] = js.undefined
  
  /**
    * Contains extended information for property 'kind'.
    */
  var _kind: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'name'.
    */
  var _name: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'patchFormat'.
    */
  var _patchFormat: js.UndefOr[js.Array[Element]] = js.undefined
  
  /**
    * Contains extended information for property 'publisher'.
    */
  var _publisher: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'purpose'.
    */
  var _purpose: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'title'.
    */
  var _title: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'url'.
    */
  var _url: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'version'.
    */
  var _version: js.UndefOr[Element] = js.undefined
  
  /**
    * no | extensions | elements | both
    */
  var acceptUnknown: code
  
  /**
    * Contact details for the publisher
    */
  var contact: js.UndefOr[js.Array[ContactDetail]] = js.undefined
  
  /**
    * Use and/or publishing restrictions
    */
  var copyright: js.UndefOr[markdown] = js.undefined
  
  /**
    * Date this was last changed
    */
  var date: dateTime
  
  /**
    * Natural language description of the capability statement
    */
  var description: js.UndefOr[markdown] = js.undefined
  
  /**
    * Document definition
    */
  var document: js.UndefOr[js.Array[CapabilityStatementDocument]] = js.undefined
  
  /**
    * For testing purposes, not real usage
    */
  var experimental: js.UndefOr[Boolean] = js.undefined
  
  /**
    * FHIR Version the system uses
    */
  var fhirVersion: id
  
  /**
    * formats supported (xml | json | ttl | mime type)
    */
  var format: js.Array[code]
  
  /**
    * If this describes a specific instance
    */
  var implementation: js.UndefOr[CapabilityStatementImplementation] = js.undefined
  
  /**
    * Implementation guides supported
    */
  var implementationGuide: js.UndefOr[js.Array[uri]] = js.undefined
  
  /**
    * Canonical URL of another capability statement this implements
    */
  var instantiates: js.UndefOr[js.Array[uri]] = js.undefined
  
  /**
    * Intended jurisdiction for capability statement (if applicable)
    */
  var jurisdiction: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * instance | capability | requirements
    */
  var kind: code
  
  /**
    * If messaging is supported
    */
  var messaging: js.UndefOr[js.Array[CapabilityStatementMessaging]] = js.undefined
  
  /**
    * Name for this capability statement (computer friendly)
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Patch formats supported
    */
  var patchFormat: js.UndefOr[js.Array[code]] = js.undefined
  
  /**
    * Profiles for use cases supported
    */
  var profile: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Name of the publisher (organization or individual)
    */
  var publisher: js.UndefOr[String] = js.undefined
  
  /**
    * Why this capability statement is defined
    */
  var purpose: js.UndefOr[markdown] = js.undefined
  
  /**
    * If the endpoint is a RESTful one
    */
  var rest: js.UndefOr[js.Array[CapabilityStatementRest]] = js.undefined
  
  /**
    * Software that is covered by this capability statement
    */
  var software: js.UndefOr[CapabilityStatementSoftware] = js.undefined
  
  /**
    * draft | active | retired | unknown
    */
  var status: code
  
  /**
    * Name for this capability statement (human friendly)
    */
  var title: js.UndefOr[String] = js.undefined
  
  /**
    * Logical URI to reference this capability statement (globally unique)
    */
  var url: js.UndefOr[uri] = js.undefined
  
  /**
    * Context the content is intended to support
    */
  var useContext: js.UndefOr[js.Array[UsageContext]] = js.undefined
  
  /**
    * Business version of the capability statement
    */
  var version: js.UndefOr[String] = js.undefined
}
object CapabilityStatement {
  
  @scala.inline
  def apply(
    acceptUnknown: code,
    date: dateTime,
    fhirVersion: id,
    format: js.Array[code],
    kind: code,
    status: code
  ): CapabilityStatement = {
    val __obj = js.Dynamic.literal(acceptUnknown = acceptUnknown.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], fhirVersion = fhirVersion.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[CapabilityStatement]
  }
  
  @scala.inline
  implicit class CapabilityStatementMutableBuilder[Self <: CapabilityStatement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAcceptUnknown(value: code): Self = StObject.set(x, "acceptUnknown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContact(value: js.Array[ContactDetail]): Self = StObject.set(x, "contact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContactUndefined: Self = StObject.set(x, "contact", js.undefined)
    
    @scala.inline
    def setContactVarargs(value: ContactDetail*): Self = StObject.set(x, "contact", js.Array(value :_*))
    
    @scala.inline
    def setCopyright(value: markdown): Self = StObject.set(x, "copyright", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCopyrightUndefined: Self = StObject.set(x, "copyright", js.undefined)
    
    @scala.inline
    def setDate(value: dateTime): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: markdown): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setDocument(value: js.Array[CapabilityStatementDocument]): Self = StObject.set(x, "document", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentUndefined: Self = StObject.set(x, "document", js.undefined)
    
    @scala.inline
    def setDocumentVarargs(value: CapabilityStatementDocument*): Self = StObject.set(x, "document", js.Array(value :_*))
    
    @scala.inline
    def setExperimental(value: Boolean): Self = StObject.set(x, "experimental", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExperimentalUndefined: Self = StObject.set(x, "experimental", js.undefined)
    
    @scala.inline
    def setFhirVersion(value: id): Self = StObject.set(x, "fhirVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormat(value: js.Array[code]): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatVarargs(value: code*): Self = StObject.set(x, "format", js.Array(value :_*))
    
    @scala.inline
    def setImplementation(value: CapabilityStatementImplementation): Self = StObject.set(x, "implementation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImplementationGuide(value: js.Array[uri]): Self = StObject.set(x, "implementationGuide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImplementationGuideUndefined: Self = StObject.set(x, "implementationGuide", js.undefined)
    
    @scala.inline
    def setImplementationGuideVarargs(value: uri*): Self = StObject.set(x, "implementationGuide", js.Array(value :_*))
    
    @scala.inline
    def setImplementationUndefined: Self = StObject.set(x, "implementation", js.undefined)
    
    @scala.inline
    def setInstantiates(value: js.Array[uri]): Self = StObject.set(x, "instantiates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstantiatesUndefined: Self = StObject.set(x, "instantiates", js.undefined)
    
    @scala.inline
    def setInstantiatesVarargs(value: uri*): Self = StObject.set(x, "instantiates", js.Array(value :_*))
    
    @scala.inline
    def setJurisdiction(value: js.Array[CodeableConcept]): Self = StObject.set(x, "jurisdiction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJurisdictionUndefined: Self = StObject.set(x, "jurisdiction", js.undefined)
    
    @scala.inline
    def setJurisdictionVarargs(value: CodeableConcept*): Self = StObject.set(x, "jurisdiction", js.Array(value :_*))
    
    @scala.inline
    def setKind(value: code): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessaging(value: js.Array[CapabilityStatementMessaging]): Self = StObject.set(x, "messaging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessagingUndefined: Self = StObject.set(x, "messaging", js.undefined)
    
    @scala.inline
    def setMessagingVarargs(value: CapabilityStatementMessaging*): Self = StObject.set(x, "messaging", js.Array(value :_*))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setPatchFormat(value: js.Array[code]): Self = StObject.set(x, "patchFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPatchFormatUndefined: Self = StObject.set(x, "patchFormat", js.undefined)
    
    @scala.inline
    def setPatchFormatVarargs(value: code*): Self = StObject.set(x, "patchFormat", js.Array(value :_*))
    
    @scala.inline
    def setProfile(value: js.Array[Reference]): Self = StObject.set(x, "profile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProfileUndefined: Self = StObject.set(x, "profile", js.undefined)
    
    @scala.inline
    def setProfileVarargs(value: Reference*): Self = StObject.set(x, "profile", js.Array(value :_*))
    
    @scala.inline
    def setPublisher(value: String): Self = StObject.set(x, "publisher", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublisherUndefined: Self = StObject.set(x, "publisher", js.undefined)
    
    @scala.inline
    def setPurpose(value: markdown): Self = StObject.set(x, "purpose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPurposeUndefined: Self = StObject.set(x, "purpose", js.undefined)
    
    @scala.inline
    def setRest(value: js.Array[CapabilityStatementRest]): Self = StObject.set(x, "rest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRestUndefined: Self = StObject.set(x, "rest", js.undefined)
    
    @scala.inline
    def setRestVarargs(value: CapabilityStatementRest*): Self = StObject.set(x, "rest", js.Array(value :_*))
    
    @scala.inline
    def setSoftware(value: CapabilityStatementSoftware): Self = StObject.set(x, "software", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSoftwareUndefined: Self = StObject.set(x, "software", js.undefined)
    
    @scala.inline
    def setStatus(value: code): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setUrl(value: uri): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    @scala.inline
    def setUseContext(value: js.Array[UsageContext]): Self = StObject.set(x, "useContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseContextUndefined: Self = StObject.set(x, "useContext", js.undefined)
    
    @scala.inline
    def setUseContextVarargs(value: UsageContext*): Self = StObject.set(x, "useContext", js.Array(value :_*))
    
    @scala.inline
    def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    
    @scala.inline
    def set_acceptUnknown(value: Element): Self = StObject.set(x, "_acceptUnknown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_acceptUnknownUndefined: Self = StObject.set(x, "_acceptUnknown", js.undefined)
    
    @scala.inline
    def set_copyright(value: Element): Self = StObject.set(x, "_copyright", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_copyrightUndefined: Self = StObject.set(x, "_copyright", js.undefined)
    
    @scala.inline
    def set_date(value: Element): Self = StObject.set(x, "_date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_dateUndefined: Self = StObject.set(x, "_date", js.undefined)
    
    @scala.inline
    def set_description(value: Element): Self = StObject.set(x, "_description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_descriptionUndefined: Self = StObject.set(x, "_description", js.undefined)
    
    @scala.inline
    def set_experimental(value: Element): Self = StObject.set(x, "_experimental", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_experimentalUndefined: Self = StObject.set(x, "_experimental", js.undefined)
    
    @scala.inline
    def set_fhirVersion(value: Element): Self = StObject.set(x, "_fhirVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_fhirVersionUndefined: Self = StObject.set(x, "_fhirVersion", js.undefined)
    
    @scala.inline
    def set_format(value: js.Array[Element]): Self = StObject.set(x, "_format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_formatUndefined: Self = StObject.set(x, "_format", js.undefined)
    
    @scala.inline
    def set_formatVarargs(value: Element*): Self = StObject.set(x, "_format", js.Array(value :_*))
    
    @scala.inline
    def set_implementationGuide(value: js.Array[Element]): Self = StObject.set(x, "_implementationGuide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_implementationGuideUndefined: Self = StObject.set(x, "_implementationGuide", js.undefined)
    
    @scala.inline
    def set_implementationGuideVarargs(value: Element*): Self = StObject.set(x, "_implementationGuide", js.Array(value :_*))
    
    @scala.inline
    def set_instantiates(value: js.Array[Element]): Self = StObject.set(x, "_instantiates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_instantiatesUndefined: Self = StObject.set(x, "_instantiates", js.undefined)
    
    @scala.inline
    def set_instantiatesVarargs(value: Element*): Self = StObject.set(x, "_instantiates", js.Array(value :_*))
    
    @scala.inline
    def set_kind(value: Element): Self = StObject.set(x, "_kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_kindUndefined: Self = StObject.set(x, "_kind", js.undefined)
    
    @scala.inline
    def set_name(value: Element): Self = StObject.set(x, "_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_nameUndefined: Self = StObject.set(x, "_name", js.undefined)
    
    @scala.inline
    def set_patchFormat(value: js.Array[Element]): Self = StObject.set(x, "_patchFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_patchFormatUndefined: Self = StObject.set(x, "_patchFormat", js.undefined)
    
    @scala.inline
    def set_patchFormatVarargs(value: Element*): Self = StObject.set(x, "_patchFormat", js.Array(value :_*))
    
    @scala.inline
    def set_publisher(value: Element): Self = StObject.set(x, "_publisher", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_publisherUndefined: Self = StObject.set(x, "_publisher", js.undefined)
    
    @scala.inline
    def set_purpose(value: Element): Self = StObject.set(x, "_purpose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_purposeUndefined: Self = StObject.set(x, "_purpose", js.undefined)
    
    @scala.inline
    def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
    
    @scala.inline
    def set_title(value: Element): Self = StObject.set(x, "_title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_titleUndefined: Self = StObject.set(x, "_title", js.undefined)
    
    @scala.inline
    def set_url(value: Element): Self = StObject.set(x, "_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_urlUndefined: Self = StObject.set(x, "_url", js.undefined)
    
    @scala.inline
    def set_version(value: Element): Self = StObject.set(x, "_version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_versionUndefined: Self = StObject.set(x, "_version", js.undefined)
  }
}
