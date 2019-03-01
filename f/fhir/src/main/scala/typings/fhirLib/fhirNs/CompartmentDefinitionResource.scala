package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * How a resource is related to the compartment
  */
trait CompartmentDefinitionResource extends BackboneElement {
  /**
    * Contains extended information for property 'code'.
    */
  var _code: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'documentation'.
    */
  var _documentation: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'param'.
    */
  var _param: js.UndefOr[js.Array[Element]] = js.undefined
  /**
    * Name of resource type
    */
  var code: code
  /**
    * Additional documentation about the resource and compartment
    */
  var documentation: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Search Parameter Name, or chained parameters
    */
  var param: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object CompartmentDefinitionResource {
  @scala.inline
  def apply(
    code: code,
    _code: Element = null,
    _documentation: Element = null,
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    _param: js.Array[Element] = null,
    documentation: java.lang.String = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[java.lang.String] = null,
    id: java.lang.String = null,
    modifierExtension: js.Array[Extension] = null,
    param: js.Array[java.lang.String] = null
  ): CompartmentDefinitionResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("code")(code)
    if (_code != null) __obj.updateDynamic("_code")(_code)
    if (_documentation != null) __obj.updateDynamic("_documentation")(_documentation)
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (_param != null) __obj.updateDynamic("_param")(_param)
    if (documentation != null) __obj.updateDynamic("documentation")(documentation)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments)
    if (id != null) __obj.updateDynamic("id")(id)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    if (param != null) __obj.updateDynamic("param")(param)
    __obj.asInstanceOf[CompartmentDefinitionResource]
  }
}

