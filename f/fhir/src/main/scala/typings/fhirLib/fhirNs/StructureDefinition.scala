package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Structural Definition
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- fhirLib.fhirNs.Resource because Already inherited */ trait StructureDefinition extends DomainResource {
  /**
    * Contains extended information for property 'abstract'.
    */
  var _abstract: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'baseDefinition'.
    */
  var _baseDefinition: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'context'.
    */
  var _context: js.UndefOr[js.Array[Element]] = js.undefined
  /**
    * Contains extended information for property 'contextInvariant'.
    */
  var _contextInvariant: js.UndefOr[js.Array[Element]] = js.undefined
  /**
    * Contains extended information for property 'contextType'.
    */
  var _contextType: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'copyright'.
    */
  var _copyright: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'date'.
    */
  var _date: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'derivation'.
    */
  var _derivation: js.UndefOr[Element] = js.undefined
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
    * Contains extended information for property 'kind'.
    */
  var _kind: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'name'.
    */
  var _name: js.UndefOr[Element] = js.undefined
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
    * Contains extended information for property 'type'.
    */
  var _type: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'url'.
    */
  var _url: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'version'.
    */
  var _version: js.UndefOr[Element] = js.undefined
  /**
    * Whether the structure is abstract
    */
  var `abstract`: scala.Boolean
  /**
    * Definition that this type is constrained/specialized from
    */
  var baseDefinition: js.UndefOr[uri] = js.undefined
  /**
    * Contact details for the publisher
    */
  var contact: js.UndefOr[js.Array[ContactDetail]] = js.undefined
  /**
    * Where the extension can be used in instances
    */
  var context: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * FHIRPath invariants - when the extension can be used
    */
  var contextInvariant: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * resource | datatype | extension
    */
  var contextType: js.UndefOr[code] = js.undefined
  /**
    * Use and/or publishing restrictions
    */
  var copyright: js.UndefOr[markdown] = js.undefined
  /**
    * Date this was last changed
    */
  var date: js.UndefOr[dateTime] = js.undefined
  /**
    * specialization | constraint - How relates to base definition
    */
  var derivation: js.UndefOr[code] = js.undefined
  /**
    * Natural language description of the structure definition
    */
  var description: js.UndefOr[markdown] = js.undefined
  /**
    * Differential view of the structure
    */
  var differential: js.UndefOr[StructureDefinitionDifferential] = js.undefined
  /**
    * For testing purposes, not real usage
    */
  var experimental: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * FHIR Version this StructureDefinition targets
    */
  var fhirVersion: js.UndefOr[id] = js.undefined
  /**
    * Additional identifier for the structure definition
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  /**
    * Intended jurisdiction for structure definition (if applicable)
    */
  var jurisdiction: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  /**
    * Assist with indexing and finding
    */
  var keyword: js.UndefOr[js.Array[Coding]] = js.undefined
  /**
    * primitive-type | complex-type | resource | logical
    */
  var kind: code
  /**
    * External specification that the content is mapped to
    */
  var mapping: js.UndefOr[js.Array[StructureDefinitionMapping]] = js.undefined
  /**
    * Name for this structure definition (computer friendly)
    */
  var name: java.lang.String
  /**
    * Name of the publisher (organization or individual)
    */
  var publisher: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Why this structure definition is defined
    */
  var purpose: js.UndefOr[markdown] = js.undefined
  /**
    * Snapshot view of the structure
    */
  var snapshot: js.UndefOr[StructureDefinitionSnapshot] = js.undefined
  /**
    * draft | active | retired | unknown
    */
  var status: code
  /**
    * Name for this structure definition (human friendly)
    */
  var title: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Type defined or constrained by this structure
    */
  var `type`: code
  /**
    * Logical URI to reference this structure definition (globally unique)
    */
  var url: uri
  /**
    * Context the content is intended to support
    */
  var useContext: js.UndefOr[js.Array[UsageContext]] = js.undefined
  /**
    * Business version of the structure definition
    */
  var version: js.UndefOr[java.lang.String] = js.undefined
}

object StructureDefinition {
  @scala.inline
  def apply(
    `abstract`: scala.Boolean,
    kind: code,
    name: java.lang.String,
    status: code,
    `type`: code,
    url: uri,
    _abstract: Element = null,
    _baseDefinition: Element = null,
    _context: js.Array[Element] = null,
    _contextInvariant: js.Array[Element] = null,
    _contextType: Element = null,
    _copyright: Element = null,
    _date: Element = null,
    _derivation: Element = null,
    _description: Element = null,
    _experimental: Element = null,
    _fhirVersion: Element = null,
    _id: Element = null,
    _implicitRules: Element = null,
    _kind: Element = null,
    _language: Element = null,
    _name: Element = null,
    _publisher: Element = null,
    _purpose: Element = null,
    _resourceType: Element = null,
    _status: Element = null,
    _title: Element = null,
    _type: Element = null,
    _url: Element = null,
    _version: Element = null,
    baseDefinition: uri = null,
    contact: js.Array[ContactDetail] = null,
    contained: js.Array[Resource] = null,
    context: js.Array[java.lang.String] = null,
    contextInvariant: js.Array[java.lang.String] = null,
    contextType: code = null,
    copyright: markdown = null,
    date: dateTime = null,
    derivation: code = null,
    description: markdown = null,
    differential: StructureDefinitionDifferential = null,
    experimental: js.UndefOr[scala.Boolean] = js.undefined,
    extension: js.Array[Extension] = null,
    fhirVersion: id = null,
    id: id = null,
    identifier: js.Array[Identifier] = null,
    implicitRules: uri = null,
    jurisdiction: js.Array[CodeableConcept] = null,
    keyword: js.Array[Coding] = null,
    language: code = null,
    mapping: js.Array[StructureDefinitionMapping] = null,
    meta: Meta = null,
    modifierExtension: js.Array[Extension] = null,
    publisher: java.lang.String = null,
    purpose: markdown = null,
    resourceType: code = null,
    snapshot: StructureDefinitionSnapshot = null,
    text: Narrative = null,
    title: java.lang.String = null,
    useContext: js.Array[UsageContext] = null,
    version: java.lang.String = null
  ): StructureDefinition = {
    val __obj = js.Dynamic.literal(kind = kind, name = name, status = status, url = url)
    __obj.updateDynamic("abstract")(`abstract`)
    __obj.updateDynamic("type")(`type`)
    if (_abstract != null) __obj.updateDynamic("_abstract")(_abstract)
    if (_baseDefinition != null) __obj.updateDynamic("_baseDefinition")(_baseDefinition)
    if (_context != null) __obj.updateDynamic("_context")(_context)
    if (_contextInvariant != null) __obj.updateDynamic("_contextInvariant")(_contextInvariant)
    if (_contextType != null) __obj.updateDynamic("_contextType")(_contextType)
    if (_copyright != null) __obj.updateDynamic("_copyright")(_copyright)
    if (_date != null) __obj.updateDynamic("_date")(_date)
    if (_derivation != null) __obj.updateDynamic("_derivation")(_derivation)
    if (_description != null) __obj.updateDynamic("_description")(_description)
    if (_experimental != null) __obj.updateDynamic("_experimental")(_experimental)
    if (_fhirVersion != null) __obj.updateDynamic("_fhirVersion")(_fhirVersion)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (_implicitRules != null) __obj.updateDynamic("_implicitRules")(_implicitRules)
    if (_kind != null) __obj.updateDynamic("_kind")(_kind)
    if (_language != null) __obj.updateDynamic("_language")(_language)
    if (_name != null) __obj.updateDynamic("_name")(_name)
    if (_publisher != null) __obj.updateDynamic("_publisher")(_publisher)
    if (_purpose != null) __obj.updateDynamic("_purpose")(_purpose)
    if (_resourceType != null) __obj.updateDynamic("_resourceType")(_resourceType)
    if (_status != null) __obj.updateDynamic("_status")(_status)
    if (_title != null) __obj.updateDynamic("_title")(_title)
    if (_type != null) __obj.updateDynamic("_type")(_type)
    if (_url != null) __obj.updateDynamic("_url")(_url)
    if (_version != null) __obj.updateDynamic("_version")(_version)
    if (baseDefinition != null) __obj.updateDynamic("baseDefinition")(baseDefinition)
    if (contact != null) __obj.updateDynamic("contact")(contact)
    if (contained != null) __obj.updateDynamic("contained")(contained)
    if (context != null) __obj.updateDynamic("context")(context)
    if (contextInvariant != null) __obj.updateDynamic("contextInvariant")(contextInvariant)
    if (contextType != null) __obj.updateDynamic("contextType")(contextType)
    if (copyright != null) __obj.updateDynamic("copyright")(copyright)
    if (date != null) __obj.updateDynamic("date")(date)
    if (derivation != null) __obj.updateDynamic("derivation")(derivation)
    if (description != null) __obj.updateDynamic("description")(description)
    if (differential != null) __obj.updateDynamic("differential")(differential)
    if (!js.isUndefined(experimental)) __obj.updateDynamic("experimental")(experimental)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (fhirVersion != null) __obj.updateDynamic("fhirVersion")(fhirVersion)
    if (id != null) __obj.updateDynamic("id")(id)
    if (identifier != null) __obj.updateDynamic("identifier")(identifier)
    if (implicitRules != null) __obj.updateDynamic("implicitRules")(implicitRules)
    if (jurisdiction != null) __obj.updateDynamic("jurisdiction")(jurisdiction)
    if (keyword != null) __obj.updateDynamic("keyword")(keyword)
    if (language != null) __obj.updateDynamic("language")(language)
    if (mapping != null) __obj.updateDynamic("mapping")(mapping)
    if (meta != null) __obj.updateDynamic("meta")(meta)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    if (publisher != null) __obj.updateDynamic("publisher")(publisher)
    if (purpose != null) __obj.updateDynamic("purpose")(purpose)
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType)
    if (snapshot != null) __obj.updateDynamic("snapshot")(snapshot)
    if (text != null) __obj.updateDynamic("text")(text)
    if (title != null) __obj.updateDynamic("title")(title)
    if (useContext != null) __obj.updateDynamic("useContext")(useContext)
    if (version != null) __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[StructureDefinition]
  }
}

