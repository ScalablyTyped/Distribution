package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Which other rules to apply in the context of this rule
  */
trait StructureMapGroupRuleDependent extends BackboneElement {
  /**
    * Contains extended information for property 'name'.
    */
  var _name: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'variable'.
    */
  var _variable: js.UndefOr[js.Array[Element]] = js.undefined
  /**
    * Name of a rule or group to apply
    */
  var name: id
  /**
    * Variable to pass to the rule or group
    */
  var variable: js.Array[java.lang.String]
}

object StructureMapGroupRuleDependent {
  @scala.inline
  def apply(
    name: id,
    variable: js.Array[java.lang.String],
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    _name: Element = null,
    _variable: js.Array[Element] = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[java.lang.String] = null,
    id: java.lang.String = null,
    modifierExtension: js.Array[Extension] = null
  ): StructureMapGroupRuleDependent = {
    val __obj = js.Dynamic.literal(name = name, variable = variable)
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (_name != null) __obj.updateDynamic("_name")(_name)
    if (_variable != null) __obj.updateDynamic("_variable")(_variable)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments)
    if (id != null) __obj.updateDynamic("id")(id)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    __obj.asInstanceOf[StructureMapGroupRuleDependent]
  }
}

