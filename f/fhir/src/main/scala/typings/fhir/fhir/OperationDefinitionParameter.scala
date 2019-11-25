package typings.fhir.fhir

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
    val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], use = use.asInstanceOf[js.Any])
    if (_documentation != null) __obj.updateDynamic("_documentation")(_documentation.asInstanceOf[js.Any])
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_max != null) __obj.updateDynamic("_max")(_max.asInstanceOf[js.Any])
    if (_min != null) __obj.updateDynamic("_min")(_min.asInstanceOf[js.Any])
    if (_name != null) __obj.updateDynamic("_name")(_name.asInstanceOf[js.Any])
    if (_searchType != null) __obj.updateDynamic("_searchType")(_searchType.asInstanceOf[js.Any])
    if (_type != null) __obj.updateDynamic("_type")(_type.asInstanceOf[js.Any])
    if (_use != null) __obj.updateDynamic("_use")(_use.asInstanceOf[js.Any])
    if (binding != null) __obj.updateDynamic("binding")(binding.asInstanceOf[js.Any])
    if (documentation != null) __obj.updateDynamic("documentation")(documentation.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    if (part != null) __obj.updateDynamic("part")(part.asInstanceOf[js.Any])
    if (profile != null) __obj.updateDynamic("profile")(profile.asInstanceOf[js.Any])
    if (searchType != null) __obj.updateDynamic("searchType")(searchType.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[OperationDefinitionParameter]
  }
}

