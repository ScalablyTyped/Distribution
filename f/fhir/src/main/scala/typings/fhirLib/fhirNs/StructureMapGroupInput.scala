package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Named instance provided when invoking the map
  */
trait StructureMapGroupInput extends BackboneElement {
  /**
    * Contains extended information for property 'documentation'.
    */
  var _documentation: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'mode'.
    */
  var _mode: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'name'.
    */
  var _name: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'type'.
    */
  var _type: js.UndefOr[Element] = js.undefined
  /**
    * Documentation for this instance of data
    */
  var documentation: js.UndefOr[java.lang.String] = js.undefined
  /**
    * source | target
    */
  var mode: code
  /**
    * Name for this instance of data
    */
  var name: id
  /**
    * Type for this instance of data
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object StructureMapGroupInput {
  @scala.inline
  def apply(
    mode: code,
    name: id,
    _documentation: Element = null,
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    _mode: Element = null,
    _name: Element = null,
    _type: Element = null,
    documentation: java.lang.String = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[java.lang.String] = null,
    id: java.lang.String = null,
    modifierExtension: js.Array[Extension] = null,
    `type`: java.lang.String = null
  ): StructureMapGroupInput = {
    val __obj = js.Dynamic.literal(mode = mode, name = name)
    if (_documentation != null) __obj.updateDynamic("_documentation")(_documentation)
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (_mode != null) __obj.updateDynamic("_mode")(_mode)
    if (_name != null) __obj.updateDynamic("_name")(_name)
    if (_type != null) __obj.updateDynamic("_type")(_type)
    if (documentation != null) __obj.updateDynamic("documentation")(documentation)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments)
    if (id != null) __obj.updateDynamic("id")(id)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[StructureMapGroupInput]
  }
}

