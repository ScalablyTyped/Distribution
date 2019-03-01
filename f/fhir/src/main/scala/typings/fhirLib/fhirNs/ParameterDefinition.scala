package typings
package fhirLib.fhirNs

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
  var documentation: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Maximum cardinality (a number of *)
    */
  var max: js.UndefOr[java.lang.String] = js.undefined
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
    documentation: java.lang.String = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[java.lang.String] = null,
    id: java.lang.String = null,
    max: java.lang.String = null,
    min: js.UndefOr[integer] = js.undefined,
    name: code = null,
    profile: Reference = null
  ): ParameterDefinition = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("use")(use)
    if (_documentation != null) __obj.updateDynamic("_documentation")(_documentation)
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (_max != null) __obj.updateDynamic("_max")(_max)
    if (_min != null) __obj.updateDynamic("_min")(_min)
    if (_name != null) __obj.updateDynamic("_name")(_name)
    if (_type != null) __obj.updateDynamic("_type")(_type)
    if (_use != null) __obj.updateDynamic("_use")(_use)
    if (documentation != null) __obj.updateDynamic("documentation")(documentation)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments)
    if (id != null) __obj.updateDynamic("id")(id)
    if (max != null) __obj.updateDynamic("max")(max)
    if (!js.isUndefined(min)) __obj.updateDynamic("min")(min)
    if (name != null) __obj.updateDynamic("name")(name)
    if (profile != null) __obj.updateDynamic("profile")(profile)
    __obj.asInstanceOf[ParameterDefinition]
  }
}

