package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A statement of system capabilities
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.fhir.fhir.Resource because Already inherited */ @js.native
trait CapabilityStatement extends DomainResource {
  /**
    * Contains extended information for property 'acceptUnknown'.
    */
  var _acceptUnknown: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'copyright'.
    */
  var _copyright: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'date'.
    */
  var _date: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'description'.
    */
  var _description: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'experimental'.
    */
  var _experimental: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'fhirVersion'.
    */
  var _fhirVersion: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'format'.
    */
  var _format: js.UndefOr[js.Array[Element]] = js.native
  /**
    * Contains extended information for property 'implementationGuide'.
    */
  var _implementationGuide: js.UndefOr[js.Array[Element]] = js.native
  /**
    * Contains extended information for property 'instantiates'.
    */
  var _instantiates: js.UndefOr[js.Array[Element]] = js.native
  /**
    * Contains extended information for property 'kind'.
    */
  var _kind: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'name'.
    */
  var _name: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'patchFormat'.
    */
  var _patchFormat: js.UndefOr[js.Array[Element]] = js.native
  /**
    * Contains extended information for property 'publisher'.
    */
  var _publisher: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'purpose'.
    */
  var _purpose: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'title'.
    */
  var _title: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'url'.
    */
  var _url: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'version'.
    */
  var _version: js.UndefOr[Element] = js.native
  /**
    * no | extensions | elements | both
    */
  var acceptUnknown: code = js.native
  /**
    * Contact details for the publisher
    */
  var contact: js.UndefOr[js.Array[ContactDetail]] = js.native
  /**
    * Use and/or publishing restrictions
    */
  var copyright: js.UndefOr[markdown] = js.native
  /**
    * Date this was last changed
    */
  var date: dateTime = js.native
  /**
    * Natural language description of the capability statement
    */
  var description: js.UndefOr[markdown] = js.native
  /**
    * Document definition
    */
  var document: js.UndefOr[js.Array[CapabilityStatementDocument]] = js.native
  /**
    * For testing purposes, not real usage
    */
  var experimental: js.UndefOr[Boolean] = js.native
  /**
    * FHIR Version the system uses
    */
  var fhirVersion: id = js.native
  /**
    * formats supported (xml | json | ttl | mime type)
    */
  var format: js.Array[code] = js.native
  /**
    * If this describes a specific instance
    */
  var implementation: js.UndefOr[CapabilityStatementImplementation] = js.native
  /**
    * Implementation guides supported
    */
  var implementationGuide: js.UndefOr[js.Array[uri]] = js.native
  /**
    * Canonical URL of another capability statement this implements
    */
  var instantiates: js.UndefOr[js.Array[uri]] = js.native
  /**
    * Intended jurisdiction for capability statement (if applicable)
    */
  var jurisdiction: js.UndefOr[js.Array[CodeableConcept]] = js.native
  /**
    * instance | capability | requirements
    */
  var kind: code = js.native
  /**
    * If messaging is supported
    */
  var messaging: js.UndefOr[js.Array[CapabilityStatementMessaging]] = js.native
  /**
    * Name for this capability statement (computer friendly)
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Patch formats supported
    */
  var patchFormat: js.UndefOr[js.Array[code]] = js.native
  /**
    * Profiles for use cases supported
    */
  var profile: js.UndefOr[js.Array[Reference]] = js.native
  /**
    * Name of the publisher (organization or individual)
    */
  var publisher: js.UndefOr[String] = js.native
  /**
    * Why this capability statement is defined
    */
  var purpose: js.UndefOr[markdown] = js.native
  /**
    * If the endpoint is a RESTful one
    */
  var rest: js.UndefOr[js.Array[CapabilityStatementRest]] = js.native
  /**
    * Software that is covered by this capability statement
    */
  var software: js.UndefOr[CapabilityStatementSoftware] = js.native
  /**
    * draft | active | retired | unknown
    */
  var status: code = js.native
  /**
    * Name for this capability statement (human friendly)
    */
  var title: js.UndefOr[String] = js.native
  /**
    * Logical URI to reference this capability statement (globally unique)
    */
  var url: js.UndefOr[uri] = js.native
  /**
    * Context the content is intended to support
    */
  var useContext: js.UndefOr[js.Array[UsageContext]] = js.native
  /**
    * Business version of the capability statement
    */
  var version: js.UndefOr[String] = js.native
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
  implicit class CapabilityStatementOps[Self <: CapabilityStatement] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAcceptUnknown(value: code): Self = this.set("acceptUnknown", value.asInstanceOf[js.Any])
    @scala.inline
    def setDate(value: dateTime): Self = this.set("date", value.asInstanceOf[js.Any])
    @scala.inline
    def setFhirVersion(value: id): Self = this.set("fhirVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def setFormatVarargs(value: code*): Self = this.set("format", js.Array(value :_*))
    @scala.inline
    def setFormat(value: js.Array[code]): Self = this.set("format", value.asInstanceOf[js.Any])
    @scala.inline
    def setKind(value: code): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: code): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def set_acceptUnknown(value: Element): Self = this.set("_acceptUnknown", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_acceptUnknown: Self = this.set("_acceptUnknown", js.undefined)
    @scala.inline
    def set_copyright(value: Element): Self = this.set("_copyright", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_copyright: Self = this.set("_copyright", js.undefined)
    @scala.inline
    def set_date(value: Element): Self = this.set("_date", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_date: Self = this.set("_date", js.undefined)
    @scala.inline
    def set_description(value: Element): Self = this.set("_description", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_description: Self = this.set("_description", js.undefined)
    @scala.inline
    def set_experimental(value: Element): Self = this.set("_experimental", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_experimental: Self = this.set("_experimental", js.undefined)
    @scala.inline
    def set_fhirVersion(value: Element): Self = this.set("_fhirVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_fhirVersion: Self = this.set("_fhirVersion", js.undefined)
    @scala.inline
    def set_formatVarargs(value: Element*): Self = this.set("_format", js.Array(value :_*))
    @scala.inline
    def set_format(value: js.Array[Element]): Self = this.set("_format", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_format: Self = this.set("_format", js.undefined)
    @scala.inline
    def set_implementationGuideVarargs(value: Element*): Self = this.set("_implementationGuide", js.Array(value :_*))
    @scala.inline
    def set_implementationGuide(value: js.Array[Element]): Self = this.set("_implementationGuide", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_implementationGuide: Self = this.set("_implementationGuide", js.undefined)
    @scala.inline
    def set_instantiatesVarargs(value: Element*): Self = this.set("_instantiates", js.Array(value :_*))
    @scala.inline
    def set_instantiates(value: js.Array[Element]): Self = this.set("_instantiates", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_instantiates: Self = this.set("_instantiates", js.undefined)
    @scala.inline
    def set_kind(value: Element): Self = this.set("_kind", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_kind: Self = this.set("_kind", js.undefined)
    @scala.inline
    def set_name(value: Element): Self = this.set("_name", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_name: Self = this.set("_name", js.undefined)
    @scala.inline
    def set_patchFormatVarargs(value: Element*): Self = this.set("_patchFormat", js.Array(value :_*))
    @scala.inline
    def set_patchFormat(value: js.Array[Element]): Self = this.set("_patchFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_patchFormat: Self = this.set("_patchFormat", js.undefined)
    @scala.inline
    def set_publisher(value: Element): Self = this.set("_publisher", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_publisher: Self = this.set("_publisher", js.undefined)
    @scala.inline
    def set_purpose(value: Element): Self = this.set("_purpose", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_purpose: Self = this.set("_purpose", js.undefined)
    @scala.inline
    def set_status(value: Element): Self = this.set("_status", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_status: Self = this.set("_status", js.undefined)
    @scala.inline
    def set_title(value: Element): Self = this.set("_title", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_title: Self = this.set("_title", js.undefined)
    @scala.inline
    def set_url(value: Element): Self = this.set("_url", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_url: Self = this.set("_url", js.undefined)
    @scala.inline
    def set_version(value: Element): Self = this.set("_version", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_version: Self = this.set("_version", js.undefined)
    @scala.inline
    def setContactVarargs(value: ContactDetail*): Self = this.set("contact", js.Array(value :_*))
    @scala.inline
    def setContact(value: js.Array[ContactDetail]): Self = this.set("contact", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContact: Self = this.set("contact", js.undefined)
    @scala.inline
    def setCopyright(value: markdown): Self = this.set("copyright", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCopyright: Self = this.set("copyright", js.undefined)
    @scala.inline
    def setDescription(value: markdown): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setDocumentVarargs(value: CapabilityStatementDocument*): Self = this.set("document", js.Array(value :_*))
    @scala.inline
    def setDocument(value: js.Array[CapabilityStatementDocument]): Self = this.set("document", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDocument: Self = this.set("document", js.undefined)
    @scala.inline
    def setExperimental(value: Boolean): Self = this.set("experimental", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExperimental: Self = this.set("experimental", js.undefined)
    @scala.inline
    def setImplementation(value: CapabilityStatementImplementation): Self = this.set("implementation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImplementation: Self = this.set("implementation", js.undefined)
    @scala.inline
    def setImplementationGuideVarargs(value: uri*): Self = this.set("implementationGuide", js.Array(value :_*))
    @scala.inline
    def setImplementationGuide(value: js.Array[uri]): Self = this.set("implementationGuide", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImplementationGuide: Self = this.set("implementationGuide", js.undefined)
    @scala.inline
    def setInstantiatesVarargs(value: uri*): Self = this.set("instantiates", js.Array(value :_*))
    @scala.inline
    def setInstantiates(value: js.Array[uri]): Self = this.set("instantiates", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstantiates: Self = this.set("instantiates", js.undefined)
    @scala.inline
    def setJurisdictionVarargs(value: CodeableConcept*): Self = this.set("jurisdiction", js.Array(value :_*))
    @scala.inline
    def setJurisdiction(value: js.Array[CodeableConcept]): Self = this.set("jurisdiction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJurisdiction: Self = this.set("jurisdiction", js.undefined)
    @scala.inline
    def setMessagingVarargs(value: CapabilityStatementMessaging*): Self = this.set("messaging", js.Array(value :_*))
    @scala.inline
    def setMessaging(value: js.Array[CapabilityStatementMessaging]): Self = this.set("messaging", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessaging: Self = this.set("messaging", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setPatchFormatVarargs(value: code*): Self = this.set("patchFormat", js.Array(value :_*))
    @scala.inline
    def setPatchFormat(value: js.Array[code]): Self = this.set("patchFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePatchFormat: Self = this.set("patchFormat", js.undefined)
    @scala.inline
    def setProfileVarargs(value: Reference*): Self = this.set("profile", js.Array(value :_*))
    @scala.inline
    def setProfile(value: js.Array[Reference]): Self = this.set("profile", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProfile: Self = this.set("profile", js.undefined)
    @scala.inline
    def setPublisher(value: String): Self = this.set("publisher", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePublisher: Self = this.set("publisher", js.undefined)
    @scala.inline
    def setPurpose(value: markdown): Self = this.set("purpose", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePurpose: Self = this.set("purpose", js.undefined)
    @scala.inline
    def setRestVarargs(value: CapabilityStatementRest*): Self = this.set("rest", js.Array(value :_*))
    @scala.inline
    def setRest(value: js.Array[CapabilityStatementRest]): Self = this.set("rest", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRest: Self = this.set("rest", js.undefined)
    @scala.inline
    def setSoftware(value: CapabilityStatementSoftware): Self = this.set("software", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSoftware: Self = this.set("software", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setUrl(value: uri): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
    @scala.inline
    def setUseContextVarargs(value: UsageContext*): Self = this.set("useContext", js.Array(value :_*))
    @scala.inline
    def setUseContext(value: js.Array[UsageContext]): Self = this.set("useContext", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseContext: Self = this.set("useContext", js.undefined)
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
  
}

