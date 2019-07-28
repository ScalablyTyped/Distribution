package typings.fhir.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Parameters for the operation/query
  */
trait OperationDefinitionParameter extends BackboneElement {
  /**
    * Contains extended information for property 'documentation'.
    */
  var _documentation: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'max'.
    */
  var _max: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'min'.
    */
  var _min: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'name'.
    */
  var _name: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'searchType'.
    */
  var _searchType: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'type'.
    */
  var _type: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'use'.
    */
  var _use: js.UndefOr[Element] = js.undefined
  /**
    * ValueSet details if this is coded
    */
  var binding: js.UndefOr[OperationDefinitionParameterBinding] = js.undefined
  /**
    * Description of meaning/use
    */
  var documentation: js.UndefOr[String] = js.undefined
  /**
    * Maximum Cardinality (a number or *)
    */
  var max: String
  /**
    * Minimum Cardinality
    */
  var min: integer
  /**
    * Name in Parameters.parameter.name or in URL
    */
  var name: code
  /**
    * Parts of a nested Parameter
    */
  var part: js.UndefOr[js.Array[OperationDefinitionParameter]] = js.undefined
  /**
    * Profile on the type
    */
  var profile: js.UndefOr[Reference] = js.undefined
  /**
    * number | date | string | token | reference | composite | quantity | uri
    */
  var searchType: js.UndefOr[code] = js.undefined
  /**
    * What type this parameter has
    */
  var `type`: js.UndefOr[code] = js.undefined
  /**
    * in | out
    */
  var use: code
}

object OperationDefinitionParameter {
  @scala.inline
  def apply(
    max: String,
    min: integer,
    name: code,
    use: code,
    _documentation: Element = null,
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    _max: Element = null,
    _min: Element = null,
    _name: Element = null,
    _searchType: Element = null,
    _type: Element = null,
    _use: Element = null,
    binding: OperationDefinitionParameterBinding = null,
    documentation: String = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[String] = null,
    id: String = null,
    modifierExtension: js.Array[Extension] = null,
    part: js.Array[OperationDefinitionParameter] = null,
    profile: Reference = null,
    searchType: code = null,
    `type`: code = null
  ): OperationDefinitionParameter = {
    val __obj = js.Dynamic.literal(max = max, min = min, name = name, use = use)
    if (_documentation != null) __obj.updateDynamic("_documentation")(_documentation)
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (_max != null) __obj.updateDynamic("_max")(_max)
    if (_min != null) __obj.updateDynamic("_min")(_min)
    if (_name != null) __obj.updateDynamic("_name")(_name)
    if (_searchType != null) __obj.updateDynamic("_searchType")(_searchType)
    if (_type != null) __obj.updateDynamic("_type")(_type)
    if (_use != null) __obj.updateDynamic("_use")(_use)
    if (binding != null) __obj.updateDynamic("binding")(binding)
    if (documentation != null) __obj.updateDynamic("documentation")(documentation)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments)
    if (id != null) __obj.updateDynamic("id")(id)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    if (part != null) __obj.updateDynamic("part")(part)
    if (profile != null) __obj.updateDynamic("profile")(profile)
    if (searchType != null) __obj.updateDynamic("searchType")(searchType)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[OperationDefinitionParameter]
  }
}

