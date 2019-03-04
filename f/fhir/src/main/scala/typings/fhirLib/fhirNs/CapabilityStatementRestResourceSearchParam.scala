package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Search parameters supported by implementation
  */
trait CapabilityStatementRestResourceSearchParam extends BackboneElement {
  /**
    * Contains extended information for property 'definition'.
    */
  var _definition: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'documentation'.
    */
  var _documentation: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'name'.
    */
  var _name: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'type'.
    */
  var _type: js.UndefOr[Element] = js.undefined
  /**
    * Source of definition for parameter
    */
  var definition: js.UndefOr[uri] = js.undefined
  /**
    * Server-specific usage
    */
  var documentation: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Name of search parameter
    */
  var name: java.lang.String
  /**
    * number | date | string | token | reference | composite | quantity | uri
    */
  var `type`: code
}

object CapabilityStatementRestResourceSearchParam {
  @scala.inline
  def apply(
    name: java.lang.String,
    `type`: code,
    _definition: Element = null,
    _documentation: Element = null,
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    _name: Element = null,
    _type: Element = null,
    definition: uri = null,
    documentation: java.lang.String = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[java.lang.String] = null,
    id: java.lang.String = null,
    modifierExtension: js.Array[Extension] = null
  ): CapabilityStatementRestResourceSearchParam = {
    val __obj = js.Dynamic.literal(name = name)
    __obj.updateDynamic("type")(`type`)
    if (_definition != null) __obj.updateDynamic("_definition")(_definition)
    if (_documentation != null) __obj.updateDynamic("_documentation")(_documentation)
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (_name != null) __obj.updateDynamic("_name")(_name)
    if (_type != null) __obj.updateDynamic("_type")(_type)
    if (definition != null) __obj.updateDynamic("definition")(definition)
    if (documentation != null) __obj.updateDynamic("documentation")(documentation)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments)
    if (id != null) __obj.updateDynamic("id")(id)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    __obj.asInstanceOf[CapabilityStatementRestResourceSearchParam]
  }
}

