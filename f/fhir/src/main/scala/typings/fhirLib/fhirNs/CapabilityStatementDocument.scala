package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Document definition
  */
trait CapabilityStatementDocument extends BackboneElement {
  /**
    * Contains extended information for property 'documentation'.
    */
  var _documentation: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'mode'.
    */
  var _mode: js.UndefOr[Element] = js.undefined
  /**
    * Description of document support
    */
  var documentation: js.UndefOr[java.lang.String] = js.undefined
  /**
    * producer | consumer
    */
  var mode: code
  /**
    * Constraint on a resource used in the document
    */
  var profile: Reference
}

object CapabilityStatementDocument {
  @scala.inline
  def apply(
    mode: code,
    profile: Reference,
    _documentation: Element = null,
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    _mode: Element = null,
    documentation: java.lang.String = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[java.lang.String] = null,
    id: java.lang.String = null,
    modifierExtension: js.Array[Extension] = null
  ): CapabilityStatementDocument = {
    val __obj = js.Dynamic.literal(mode = mode, profile = profile)
    if (_documentation != null) __obj.updateDynamic("_documentation")(_documentation)
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (_mode != null) __obj.updateDynamic("_mode")(_mode)
    if (documentation != null) __obj.updateDynamic("documentation")(documentation)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments)
    if (id != null) __obj.updateDynamic("id")(id)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    __obj.asInstanceOf[CapabilityStatementDocument]
  }
}

