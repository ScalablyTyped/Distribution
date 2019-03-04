package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A set of rules about how FHIR is used
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- fhirLib.fhirNs.Resource because Already inherited */ trait ImplementationGuide extends DomainResource {
  /**
    * Contains extended information for property 'binary'.
    */
  var _binary: js.UndefOr[js.Array[Element]] = js.undefined
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
    * Contains extended information for property 'name'.
    */
  var _name: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'publisher'.
    */
  var _publisher: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'url'.
    */
  var _url: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'version'.
    */
  var _version: js.UndefOr[Element] = js.undefined
  /**
    * Image, css, script, etc.
    */
  var binary: js.UndefOr[js.Array[uri]] = js.undefined
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
  var date: js.UndefOr[dateTime] = js.undefined
  /**
    * Another Implementation guide this depends on
    */
  var dependency: js.UndefOr[js.Array[ImplementationGuideDependency]] = js.undefined
  /**
    * Natural language description of the implementation guide
    */
  var description: js.UndefOr[markdown] = js.undefined
  /**
    * For testing purposes, not real usage
    */
  var experimental: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * FHIR Version this Implementation Guide targets
    */
  var fhirVersion: js.UndefOr[id] = js.undefined
  /**
    * Profiles that apply globally
    */
  var global: js.UndefOr[js.Array[ImplementationGuideGlobal]] = js.undefined
  /**
    * Intended jurisdiction for implementation guide (if applicable)
    */
  var jurisdiction: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  /**
    * Name for this implementation guide (computer friendly)
    */
  var name: java.lang.String
  /**
    * Group of resources as used in .page.package
    */
  var `package`: js.UndefOr[js.Array[ImplementationGuidePackage]] = js.undefined
  /**
    * Page/Section in the Guide
    */
  var page: js.UndefOr[ImplementationGuidePage] = js.undefined
  /**
    * Name of the publisher (organization or individual)
    */
  var publisher: js.UndefOr[java.lang.String] = js.undefined
  /**
    * draft | active | retired | unknown
    */
  var status: code
  /**
    * Logical URI to reference this implementation guide (globally unique)
    */
  var url: uri
  /**
    * Context the content is intended to support
    */
  var useContext: js.UndefOr[js.Array[UsageContext]] = js.undefined
  /**
    * Business version of the implementation guide
    */
  var version: js.UndefOr[java.lang.String] = js.undefined
}

object ImplementationGuide {
  @scala.inline
  def apply(
    name: java.lang.String,
    status: code,
    url: uri,
    _binary: js.Array[Element] = null,
    _copyright: Element = null,
    _date: Element = null,
    _description: Element = null,
    _experimental: Element = null,
    _fhirVersion: Element = null,
    _id: Element = null,
    _implicitRules: Element = null,
    _language: Element = null,
    _name: Element = null,
    _publisher: Element = null,
    _resourceType: Element = null,
    _status: Element = null,
    _url: Element = null,
    _version: Element = null,
    binary: js.Array[uri] = null,
    contact: js.Array[ContactDetail] = null,
    contained: js.Array[Resource] = null,
    copyright: markdown = null,
    date: dateTime = null,
    dependency: js.Array[ImplementationGuideDependency] = null,
    description: markdown = null,
    experimental: js.UndefOr[scala.Boolean] = js.undefined,
    extension: js.Array[Extension] = null,
    fhirVersion: id = null,
    global: js.Array[ImplementationGuideGlobal] = null,
    id: id = null,
    implicitRules: uri = null,
    jurisdiction: js.Array[CodeableConcept] = null,
    language: code = null,
    meta: Meta = null,
    modifierExtension: js.Array[Extension] = null,
    `package`: js.Array[ImplementationGuidePackage] = null,
    page: ImplementationGuidePage = null,
    publisher: java.lang.String = null,
    resourceType: code = null,
    text: Narrative = null,
    useContext: js.Array[UsageContext] = null,
    version: java.lang.String = null
  ): ImplementationGuide = {
    val __obj = js.Dynamic.literal(name = name, status = status, url = url)
    if (_binary != null) __obj.updateDynamic("_binary")(_binary)
    if (_copyright != null) __obj.updateDynamic("_copyright")(_copyright)
    if (_date != null) __obj.updateDynamic("_date")(_date)
    if (_description != null) __obj.updateDynamic("_description")(_description)
    if (_experimental != null) __obj.updateDynamic("_experimental")(_experimental)
    if (_fhirVersion != null) __obj.updateDynamic("_fhirVersion")(_fhirVersion)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (_implicitRules != null) __obj.updateDynamic("_implicitRules")(_implicitRules)
    if (_language != null) __obj.updateDynamic("_language")(_language)
    if (_name != null) __obj.updateDynamic("_name")(_name)
    if (_publisher != null) __obj.updateDynamic("_publisher")(_publisher)
    if (_resourceType != null) __obj.updateDynamic("_resourceType")(_resourceType)
    if (_status != null) __obj.updateDynamic("_status")(_status)
    if (_url != null) __obj.updateDynamic("_url")(_url)
    if (_version != null) __obj.updateDynamic("_version")(_version)
    if (binary != null) __obj.updateDynamic("binary")(binary)
    if (contact != null) __obj.updateDynamic("contact")(contact)
    if (contained != null) __obj.updateDynamic("contained")(contained)
    if (copyright != null) __obj.updateDynamic("copyright")(copyright)
    if (date != null) __obj.updateDynamic("date")(date)
    if (dependency != null) __obj.updateDynamic("dependency")(dependency)
    if (description != null) __obj.updateDynamic("description")(description)
    if (!js.isUndefined(experimental)) __obj.updateDynamic("experimental")(experimental)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (fhirVersion != null) __obj.updateDynamic("fhirVersion")(fhirVersion)
    if (global != null) __obj.updateDynamic("global")(global)
    if (id != null) __obj.updateDynamic("id")(id)
    if (implicitRules != null) __obj.updateDynamic("implicitRules")(implicitRules)
    if (jurisdiction != null) __obj.updateDynamic("jurisdiction")(jurisdiction)
    if (language != null) __obj.updateDynamic("language")(language)
    if (meta != null) __obj.updateDynamic("meta")(meta)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    if (`package` != null) __obj.updateDynamic("package")(`package`)
    if (page != null) __obj.updateDynamic("page")(page)
    if (publisher != null) __obj.updateDynamic("publisher")(publisher)
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType)
    if (text != null) __obj.updateDynamic("text")(text)
    if (useContext != null) __obj.updateDynamic("useContext")(useContext)
    if (version != null) __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[ImplementationGuide]
  }
}

