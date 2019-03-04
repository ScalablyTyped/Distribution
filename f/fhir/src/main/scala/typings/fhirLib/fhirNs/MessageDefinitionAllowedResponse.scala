package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Responses to this message
  */
trait MessageDefinitionAllowedResponse extends BackboneElement {
  /**
    * Contains extended information for property 'situation'.
    */
  var _situation: js.UndefOr[Element] = js.undefined
  /**
    * Reference to allowed message definition response
    */
  var message: Reference
  /**
    * When should this response be used
    */
  var situation: js.UndefOr[markdown] = js.undefined
}

object MessageDefinitionAllowedResponse {
  @scala.inline
  def apply(
    message: Reference,
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    _situation: Element = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[java.lang.String] = null,
    id: java.lang.String = null,
    modifierExtension: js.Array[Extension] = null,
    situation: markdown = null
  ): MessageDefinitionAllowedResponse = {
    val __obj = js.Dynamic.literal(message = message)
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (_situation != null) __obj.updateDynamic("_situation")(_situation)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments)
    if (id != null) __obj.updateDynamic("id")(id)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    if (situation != null) __obj.updateDynamic("situation")(situation)
    __obj.asInstanceOf[MessageDefinitionAllowedResponse]
  }
}

