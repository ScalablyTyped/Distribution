package typings.fhir.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Codes in the value set
  */
trait ValueSetExpansionContains extends BackboneElement {
  /**
    * Contains extended information for property 'abstract'.
    */
  var _abstract: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'code'.
    */
  var _code: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'display'.
    */
  var _display: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'inactive'.
    */
  var _inactive: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'system'.
    */
  var _system: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'version'.
    */
  var _version: js.UndefOr[Element] = js.undefined
  /**
    * If user cannot select this entry
    */
  var `abstract`: js.UndefOr[Boolean] = js.undefined
  /**
    * Code - if blank, this is not a selectable code
    */
  var code: js.UndefOr[typings.fhir.fhirNs.code] = js.undefined
  /**
    * Codes contained under this entry
    */
  var contains: js.UndefOr[js.Array[ValueSetExpansionContains]] = js.undefined
  /**
    * Additional representations for this item
    */
  var designation: js.UndefOr[js.Array[ValueSetComposeIncludeConceptDesignation]] = js.undefined
  /**
    * User display for the concept
    */
  var display: js.UndefOr[String] = js.undefined
  /**
    * If concept is inactive in the code system
    */
  var inactive: js.UndefOr[Boolean] = js.undefined
  /**
    * System value for the code
    */
  var system: js.UndefOr[uri] = js.undefined
  /**
    * Version in which this code/display is defined
    */
  var version: js.UndefOr[String] = js.undefined
}

object ValueSetExpansionContains {
  @scala.inline
  def apply(
    _abstract: Element = null,
    _code: Element = null,
    _display: Element = null,
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    _inactive: Element = null,
    _system: Element = null,
    _version: Element = null,
    `abstract`: js.UndefOr[Boolean] = js.undefined,
    code: code = null,
    contains: js.Array[ValueSetExpansionContains] = null,
    designation: js.Array[ValueSetComposeIncludeConceptDesignation] = null,
    display: String = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[String] = null,
    id: String = null,
    inactive: js.UndefOr[Boolean] = js.undefined,
    modifierExtension: js.Array[Extension] = null,
    system: uri = null,
    version: String = null
  ): ValueSetExpansionContains = {
    val __obj = js.Dynamic.literal()
    if (_abstract != null) __obj.updateDynamic("_abstract")(_abstract)
    if (_code != null) __obj.updateDynamic("_code")(_code)
    if (_display != null) __obj.updateDynamic("_display")(_display)
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (_inactive != null) __obj.updateDynamic("_inactive")(_inactive)
    if (_system != null) __obj.updateDynamic("_system")(_system)
    if (_version != null) __obj.updateDynamic("_version")(_version)
    if (!js.isUndefined(`abstract`)) __obj.updateDynamic("abstract")(`abstract`)
    if (code != null) __obj.updateDynamic("code")(code)
    if (contains != null) __obj.updateDynamic("contains")(contains)
    if (designation != null) __obj.updateDynamic("designation")(designation)
    if (display != null) __obj.updateDynamic("display")(display)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments)
    if (id != null) __obj.updateDynamic("id")(id)
    if (!js.isUndefined(inactive)) __obj.updateDynamic("inactive")(inactive)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    if (system != null) __obj.updateDynamic("system")(system)
    if (version != null) __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[ValueSetExpansionContains]
  }
}

