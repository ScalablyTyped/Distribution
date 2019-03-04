package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines behaviour and contraints on the ValueSet Expansion operation
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- fhirLib.fhirNs.Resource because Already inherited */ trait ExpansionProfile extends DomainResource {
  /**
    * Contains extended information for property 'activeOnly'.
    */
  var _activeOnly: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'date'.
    */
  var _date: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'description'.
    */
  var _description: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'displayLanguage'.
    */
  var _displayLanguage: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'excludeNested'.
    */
  var _excludeNested: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'excludeNotForUI'.
    */
  var _excludeNotForUI: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'excludePostCoordinated'.
    */
  var _excludePostCoordinated: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'experimental'.
    */
  var _experimental: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'includeDefinition'.
    */
  var _includeDefinition: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'includeDesignations'.
    */
  var _includeDesignations: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'limitedExpansion'.
    */
  var _limitedExpansion: js.UndefOr[Element] = js.undefined
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
    * Include or exclude inactive concepts in the expansion
    */
  var activeOnly: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Contact details for the publisher
    */
  var contact: js.UndefOr[js.Array[ContactDetail]] = js.undefined
  /**
    * Date this was last changed
    */
  var date: js.UndefOr[dateTime] = js.undefined
  /**
    * Natural language description of the expansion profile
    */
  var description: js.UndefOr[markdown] = js.undefined
  /**
    * When the expansion profile imposes designation contraints
    */
  var designation: js.UndefOr[ExpansionProfileDesignation] = js.undefined
  /**
    * Specify the language for the display element of codes in the value set expansion
    */
  var displayLanguage: js.UndefOr[code] = js.undefined
  /**
    * Nested codes in the expansion or not
    */
  var excludeNested: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Include or exclude codes which cannot be rendered in user interfaces in the value set expansion
    */
  var excludeNotForUI: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Include or exclude codes which are post coordinated expressions in the value set expansion
    */
  var excludePostCoordinated: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Systems/Versions to be exclude
    */
  var excludedSystem: js.UndefOr[ExpansionProfileExcludedSystem] = js.undefined
  /**
    * For testing purposes, not real usage
    */
  var experimental: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Fix use of a code system to a particular version
    */
  var fixedVersion: js.UndefOr[js.Array[ExpansionProfileFixedVersion]] = js.undefined
  /**
    * Additional identifier for the expansion profile
    */
  var identifier: js.UndefOr[Identifier] = js.undefined
  /**
    * Include or exclude the value set definition in the expansion
    */
  var includeDefinition: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Whether the expansion should include concept designations
    */
  var includeDesignations: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Intended jurisdiction for expansion profile (if applicable)
    */
  var jurisdiction: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  /**
    * Controls behaviour of the value set expand operation when value sets are too large to be completely expanded
    */
  var limitedExpansion: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Name for this expansion profile (computer friendly)
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Name of the publisher (organization or individual)
    */
  var publisher: js.UndefOr[java.lang.String] = js.undefined
  /**
    * draft | active | retired | unknown
    */
  var status: code
  /**
    * Logical URI to reference this expansion profile (globally unique)
    */
  var url: js.UndefOr[uri] = js.undefined
  /**
    * Context the content is intended to support
    */
  var useContext: js.UndefOr[js.Array[UsageContext]] = js.undefined
  /**
    * Business version of the expansion profile
    */
  var version: js.UndefOr[java.lang.String] = js.undefined
}

object ExpansionProfile {
  @scala.inline
  def apply(
    status: code,
    _activeOnly: Element = null,
    _date: Element = null,
    _description: Element = null,
    _displayLanguage: Element = null,
    _excludeNested: Element = null,
    _excludeNotForUI: Element = null,
    _excludePostCoordinated: Element = null,
    _experimental: Element = null,
    _id: Element = null,
    _implicitRules: Element = null,
    _includeDefinition: Element = null,
    _includeDesignations: Element = null,
    _language: Element = null,
    _limitedExpansion: Element = null,
    _name: Element = null,
    _publisher: Element = null,
    _resourceType: Element = null,
    _status: Element = null,
    _url: Element = null,
    _version: Element = null,
    activeOnly: js.UndefOr[scala.Boolean] = js.undefined,
    contact: js.Array[ContactDetail] = null,
    contained: js.Array[Resource] = null,
    date: dateTime = null,
    description: markdown = null,
    designation: ExpansionProfileDesignation = null,
    displayLanguage: code = null,
    excludeNested: js.UndefOr[scala.Boolean] = js.undefined,
    excludeNotForUI: js.UndefOr[scala.Boolean] = js.undefined,
    excludePostCoordinated: js.UndefOr[scala.Boolean] = js.undefined,
    excludedSystem: ExpansionProfileExcludedSystem = null,
    experimental: js.UndefOr[scala.Boolean] = js.undefined,
    extension: js.Array[Extension] = null,
    fixedVersion: js.Array[ExpansionProfileFixedVersion] = null,
    id: id = null,
    identifier: Identifier = null,
    implicitRules: uri = null,
    includeDefinition: js.UndefOr[scala.Boolean] = js.undefined,
    includeDesignations: js.UndefOr[scala.Boolean] = js.undefined,
    jurisdiction: js.Array[CodeableConcept] = null,
    language: code = null,
    limitedExpansion: js.UndefOr[scala.Boolean] = js.undefined,
    meta: Meta = null,
    modifierExtension: js.Array[Extension] = null,
    name: java.lang.String = null,
    publisher: java.lang.String = null,
    resourceType: code = null,
    text: Narrative = null,
    url: uri = null,
    useContext: js.Array[UsageContext] = null,
    version: java.lang.String = null
  ): ExpansionProfile = {
    val __obj = js.Dynamic.literal(status = status)
    if (_activeOnly != null) __obj.updateDynamic("_activeOnly")(_activeOnly)
    if (_date != null) __obj.updateDynamic("_date")(_date)
    if (_description != null) __obj.updateDynamic("_description")(_description)
    if (_displayLanguage != null) __obj.updateDynamic("_displayLanguage")(_displayLanguage)
    if (_excludeNested != null) __obj.updateDynamic("_excludeNested")(_excludeNested)
    if (_excludeNotForUI != null) __obj.updateDynamic("_excludeNotForUI")(_excludeNotForUI)
    if (_excludePostCoordinated != null) __obj.updateDynamic("_excludePostCoordinated")(_excludePostCoordinated)
    if (_experimental != null) __obj.updateDynamic("_experimental")(_experimental)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (_implicitRules != null) __obj.updateDynamic("_implicitRules")(_implicitRules)
    if (_includeDefinition != null) __obj.updateDynamic("_includeDefinition")(_includeDefinition)
    if (_includeDesignations != null) __obj.updateDynamic("_includeDesignations")(_includeDesignations)
    if (_language != null) __obj.updateDynamic("_language")(_language)
    if (_limitedExpansion != null) __obj.updateDynamic("_limitedExpansion")(_limitedExpansion)
    if (_name != null) __obj.updateDynamic("_name")(_name)
    if (_publisher != null) __obj.updateDynamic("_publisher")(_publisher)
    if (_resourceType != null) __obj.updateDynamic("_resourceType")(_resourceType)
    if (_status != null) __obj.updateDynamic("_status")(_status)
    if (_url != null) __obj.updateDynamic("_url")(_url)
    if (_version != null) __obj.updateDynamic("_version")(_version)
    if (!js.isUndefined(activeOnly)) __obj.updateDynamic("activeOnly")(activeOnly)
    if (contact != null) __obj.updateDynamic("contact")(contact)
    if (contained != null) __obj.updateDynamic("contained")(contained)
    if (date != null) __obj.updateDynamic("date")(date)
    if (description != null) __obj.updateDynamic("description")(description)
    if (designation != null) __obj.updateDynamic("designation")(designation)
    if (displayLanguage != null) __obj.updateDynamic("displayLanguage")(displayLanguage)
    if (!js.isUndefined(excludeNested)) __obj.updateDynamic("excludeNested")(excludeNested)
    if (!js.isUndefined(excludeNotForUI)) __obj.updateDynamic("excludeNotForUI")(excludeNotForUI)
    if (!js.isUndefined(excludePostCoordinated)) __obj.updateDynamic("excludePostCoordinated")(excludePostCoordinated)
    if (excludedSystem != null) __obj.updateDynamic("excludedSystem")(excludedSystem)
    if (!js.isUndefined(experimental)) __obj.updateDynamic("experimental")(experimental)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (fixedVersion != null) __obj.updateDynamic("fixedVersion")(fixedVersion)
    if (id != null) __obj.updateDynamic("id")(id)
    if (identifier != null) __obj.updateDynamic("identifier")(identifier)
    if (implicitRules != null) __obj.updateDynamic("implicitRules")(implicitRules)
    if (!js.isUndefined(includeDefinition)) __obj.updateDynamic("includeDefinition")(includeDefinition)
    if (!js.isUndefined(includeDesignations)) __obj.updateDynamic("includeDesignations")(includeDesignations)
    if (jurisdiction != null) __obj.updateDynamic("jurisdiction")(jurisdiction)
    if (language != null) __obj.updateDynamic("language")(language)
    if (!js.isUndefined(limitedExpansion)) __obj.updateDynamic("limitedExpansion")(limitedExpansion)
    if (meta != null) __obj.updateDynamic("meta")(meta)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    if (name != null) __obj.updateDynamic("name")(name)
    if (publisher != null) __obj.updateDynamic("publisher")(publisher)
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType)
    if (text != null) __obj.updateDynamic("text")(text)
    if (url != null) __obj.updateDynamic("url")(url)
    if (useContext != null) __obj.updateDynamic("useContext")(useContext)
    if (version != null) __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[ExpansionProfile]
  }
}

