package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Transform Rule from source to target
  */
trait StructureMapGroupRule extends BackboneElement {
  /**
    * Contains extended information for property 'documentation'.
    */
  var _documentation: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'name'.
    */
  var _name: js.UndefOr[Element] = js.undefined
  /**
    * Which other rules to apply in the context of this rule
    */
  var dependent: js.UndefOr[js.Array[StructureMapGroupRuleDependent]] = js.undefined
  /**
    * Documentation for this instance of data
    */
  var documentation: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Name of the rule for internal references
    */
  var name: id
  /**
    * Rules contained in this rule
    */
  var rule: js.UndefOr[js.Array[StructureMapGroupRule]] = js.undefined
  /**
    * Source inputs to the mapping
    */
  var source: js.Array[StructureMapGroupRuleSource]
  /**
    * Content to create because of this mapping rule
    */
  var target: js.UndefOr[js.Array[StructureMapGroupRuleTarget]] = js.undefined
}

object StructureMapGroupRule {
  @scala.inline
  def apply(
    name: id,
    source: js.Array[StructureMapGroupRuleSource],
    _documentation: Element = null,
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    _name: Element = null,
    dependent: js.Array[StructureMapGroupRuleDependent] = null,
    documentation: java.lang.String = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[java.lang.String] = null,
    id: java.lang.String = null,
    modifierExtension: js.Array[Extension] = null,
    rule: js.Array[StructureMapGroupRule] = null,
    target: js.Array[StructureMapGroupRuleTarget] = null
  ): StructureMapGroupRule = {
    val __obj = js.Dynamic.literal(name = name, source = source)
    if (_documentation != null) __obj.updateDynamic("_documentation")(_documentation)
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (_name != null) __obj.updateDynamic("_name")(_name)
    if (dependent != null) __obj.updateDynamic("dependent")(dependent)
    if (documentation != null) __obj.updateDynamic("documentation")(documentation)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments)
    if (id != null) __obj.updateDynamic("id")(id)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    if (rule != null) __obj.updateDynamic("rule")(rule)
    if (target != null) __obj.updateDynamic("target")(target)
    __obj.asInstanceOf[StructureMapGroupRule]
  }
}

