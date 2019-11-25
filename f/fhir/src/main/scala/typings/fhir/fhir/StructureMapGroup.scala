package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Named sections for reader convenience
  */
trait StructureMapGroup extends BackboneElement {
  /**
    * Contains extended information for property 'documentation'.
    */
  var _documentation: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'extends'.
    */
  var _extends: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'name'.
    */
  var _name: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'typeMode'.
    */
  var _typeMode: js.UndefOr[Element] = js.undefined
  /**
    * Additional description/explaination for group
    */
  var documentation: js.UndefOr[String] = js.undefined
  /**
    * Another group that this group adds rules to
    */
  var `extends`: js.UndefOr[id] = js.undefined
  /**
    * Named instance provided when invoking the map
    */
  var input: js.Array[StructureMapGroupInput]
  /**
    * Human-readable label
    */
  var name: id
  /**
    * Transform Rule from source to target
    */
  var rule: js.Array[StructureMapGroupRule]
  /**
    * none | types | type-and-types
    */
  var typeMode: code
}

object StructureMapGroup {
  @scala.inline
  def apply(
    input: js.Array[StructureMapGroupInput],
    name: id,
    rule: js.Array[StructureMapGroupRule],
    typeMode: code,
    _documentation: Element = null,
    _extends: Element = null,
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    _name: Element = null,
    _typeMode: Element = null,
    documentation: String = null,
    `extends`: id = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[String] = null,
    id: String = null,
    modifierExtension: js.Array[Extension] = null
  ): StructureMapGroup = {
    val __obj = js.Dynamic.literal(input = input.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], rule = rule.asInstanceOf[js.Any], typeMode = typeMode.asInstanceOf[js.Any])
    if (_documentation != null) __obj.updateDynamic("_documentation")(_documentation.asInstanceOf[js.Any])
    if (_extends != null) __obj.updateDynamic("_extends")(_extends.asInstanceOf[js.Any])
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_name != null) __obj.updateDynamic("_name")(_name.asInstanceOf[js.Any])
    if (_typeMode != null) __obj.updateDynamic("_typeMode")(_typeMode.asInstanceOf[js.Any])
    if (documentation != null) __obj.updateDynamic("documentation")(documentation.asInstanceOf[js.Any])
    if (`extends` != null) __obj.updateDynamic("extends")(`extends`.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    __obj.asInstanceOf[StructureMapGroup]
  }
}

