package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A statement of system capabilities
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.fhir.fhir.Resource because Already inherited */ trait CapabilityStatement extends DomainResource {
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
    status: code,
    _acceptUnknown: Element = null,
    _copyright: Element = null,
    _date: Element = null,
    _description: Element = null,
    _experimental: Element = null,
    _fhirVersion: Element = null,
    _format: js.Array[Element] = null,
    _id: Element = null,
    _implementationGuide: js.Array[Element] = null,
    _implicitRules: Element = null,
    _instantiates: js.Array[Element] = null,
    _kind: Element = null,
    _language: Element = null,
    _name: Element = null,
    _patchFormat: js.Array[Element] = null,
    _publisher: Element = null,
    _purpose: Element = null,
    _resourceType: Element = null,
    _status: Element = null,
    _title: Element = null,
    _url: Element = null,
    _version: Element = null,
    contact: js.Array[ContactDetail] = null,
    contained: js.Array[Resource] = null,
    copyright: markdown = null,
    description: markdown = null,
    document: js.Array[CapabilityStatementDocument] = null,
    experimental: js.UndefOr[Boolean] = js.undefined,
    extension: js.Array[Extension] = null,
    id: id = null,
    implementation: CapabilityStatementImplementation = null,
    implementationGuide: js.Array[uri] = null,
    implicitRules: uri = null,
    instantiates: js.Array[uri] = null,
    jurisdiction: js.Array[CodeableConcept] = null,
    language: code = null,
    messaging: js.Array[CapabilityStatementMessaging] = null,
    meta: Meta = null,
    modifierExtension: js.Array[Extension] = null,
    name: String = null,
    patchFormat: js.Array[code] = null,
    profile: js.Array[Reference] = null,
    publisher: String = null,
    purpose: markdown = null,
    resourceType: code = null,
    rest: js.Array[CapabilityStatementRest] = null,
    software: CapabilityStatementSoftware = null,
    text: Narrative = null,
    title: String = null,
    url: uri = null,
    useContext: js.Array[UsageContext] = null,
    version: String = null
  ): CapabilityStatement = {
    val __obj = js.Dynamic.literal(acceptUnknown = acceptUnknown, date = date, fhirVersion = fhirVersion, format = format, kind = kind, status = status)
    if (_acceptUnknown != null) __obj.updateDynamic("_acceptUnknown")(_acceptUnknown)
    if (_copyright != null) __obj.updateDynamic("_copyright")(_copyright)
    if (_date != null) __obj.updateDynamic("_date")(_date)
    if (_description != null) __obj.updateDynamic("_description")(_description)
    if (_experimental != null) __obj.updateDynamic("_experimental")(_experimental)
    if (_fhirVersion != null) __obj.updateDynamic("_fhirVersion")(_fhirVersion)
    if (_format != null) __obj.updateDynamic("_format")(_format)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (_implementationGuide != null) __obj.updateDynamic("_implementationGuide")(_implementationGuide)
    if (_implicitRules != null) __obj.updateDynamic("_implicitRules")(_implicitRules)
    if (_instantiates != null) __obj.updateDynamic("_instantiates")(_instantiates)
    if (_kind != null) __obj.updateDynamic("_kind")(_kind)
    if (_language != null) __obj.updateDynamic("_language")(_language)
    if (_name != null) __obj.updateDynamic("_name")(_name)
    if (_patchFormat != null) __obj.updateDynamic("_patchFormat")(_patchFormat)
    if (_publisher != null) __obj.updateDynamic("_publisher")(_publisher)
    if (_purpose != null) __obj.updateDynamic("_purpose")(_purpose)
    if (_resourceType != null) __obj.updateDynamic("_resourceType")(_resourceType)
    if (_status != null) __obj.updateDynamic("_status")(_status)
    if (_title != null) __obj.updateDynamic("_title")(_title)
    if (_url != null) __obj.updateDynamic("_url")(_url)
    if (_version != null) __obj.updateDynamic("_version")(_version)
    if (contact != null) __obj.updateDynamic("contact")(contact)
    if (contained != null) __obj.updateDynamic("contained")(contained)
    if (copyright != null) __obj.updateDynamic("copyright")(copyright)
    if (description != null) __obj.updateDynamic("description")(description)
    if (document != null) __obj.updateDynamic("document")(document)
    if (!js.isUndefined(experimental)) __obj.updateDynamic("experimental")(experimental)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (id != null) __obj.updateDynamic("id")(id)
    if (implementation != null) __obj.updateDynamic("implementation")(implementation)
    if (implementationGuide != null) __obj.updateDynamic("implementationGuide")(implementationGuide)
    if (implicitRules != null) __obj.updateDynamic("implicitRules")(implicitRules)
    if (instantiates != null) __obj.updateDynamic("instantiates")(instantiates)
    if (jurisdiction != null) __obj.updateDynamic("jurisdiction")(jurisdiction)
    if (language != null) __obj.updateDynamic("language")(language)
    if (messaging != null) __obj.updateDynamic("messaging")(messaging)
    if (meta != null) __obj.updateDynamic("meta")(meta)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    if (name != null) __obj.updateDynamic("name")(name)
    if (patchFormat != null) __obj.updateDynamic("patchFormat")(patchFormat)
    if (profile != null) __obj.updateDynamic("profile")(profile)
    if (publisher != null) __obj.updateDynamic("publisher")(publisher)
    if (purpose != null) __obj.updateDynamic("purpose")(purpose)
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType)
    if (rest != null) __obj.updateDynamic("rest")(rest)
    if (software != null) __obj.updateDynamic("software")(software)
    if (text != null) __obj.updateDynamic("text")(text)
    if (title != null) __obj.updateDynamic("title")(title)
    if (url != null) __obj.updateDynamic("url")(url)
    if (useContext != null) __obj.updateDynamic("useContext")(useContext)
    if (version != null) __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[CapabilityStatement]
  }
}

