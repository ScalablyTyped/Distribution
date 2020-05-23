package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Definition of a parameter to a module
  */
trait ParameterDefinition extends Element {
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
    * Contains extended information for property 'type'.
    */
  var _type: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'use'.
    */
  var _use: js.UndefOr[Element] = js.undefined
  /**
    * A brief description of the parameter
    */
  var documentation: js.UndefOr[String] = js.undefined
  /**
    * Maximum cardinality (a number of *)
    */
  var max: js.UndefOr[String] = js.undefined
  /**
    * Minimum cardinality
    */
  var min: js.UndefOr[integer] = js.undefined
  /**
    * Name used to access the parameter value
    */
  var name: js.UndefOr[code] = js.undefined
  /**
    * What profile the value is expected to be
    */
  var profile: js.UndefOr[Reference] = js.undefined
  /**
    * What type of value
    */
  var `type`: code
  /**
    * in | out
    */
  var use: code
}

object ParameterDefinition {
  @scala.inline
  def apply(
    `type`: code,
    use: code,
    _documentation: Element = null,
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    _max: Element = null,
    _min: Element = null,
    _name: Element = null,
    _type: Element = null,
    _use: Element = null,
    documentation: String = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[String] = null,
    id: String = null,
    max: String = null,
    min: js.UndefOr[integer] = js.undefined,
    name: code = null,
    profile: Reference = null
  ): ParameterDefinition = {
    val __obj = js.Dynamic.literal(use = use.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (_documentation != null) __obj.updateDynamic("_documentation")(_documentation.asInstanceOf[js.Any])
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_max != null) __obj.updateDynamic("_max")(_max.asInstanceOf[js.Any])
    if (_min != null) __obj.updateDynamic("_min")(_min.asInstanceOf[js.Any])
    if (_name != null) __obj.updateDynamic("_name")(_name.asInstanceOf[js.Any])
    if (_type != null) __obj.updateDynamic("_type")(_type.asInstanceOf[js.Any])
    if (_use != null) __obj.updateDynamic("_use")(_use.asInstanceOf[js.Any])
    if (documentation != null) __obj.updateDynamic("documentation")(documentation.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (!js.isUndefined(min)) __obj.updateDynamic("min")(min.get.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (profile != null) __obj.updateDynamic("profile")(profile.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParameterDefinition]
  }
}

