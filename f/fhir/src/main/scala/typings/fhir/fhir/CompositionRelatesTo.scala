package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Relationships to other compositions/documents
  */
trait CompositionRelatesTo extends BackboneElement {
  /**
    * Contains extended information for property 'code'.
    */
  var _code: js.UndefOr[Element] = js.undefined
  /**
    * replaces | transforms | signs | appends
    */
  var code: typings.fhir.fhir.code
  /**
    * Target of the relationship
    */
  var targetIdentifier: js.UndefOr[Identifier] = js.undefined
  /**
    * Target of the relationship
    */
  var targetReference: js.UndefOr[Reference] = js.undefined
}

object CompositionRelatesTo {
  @scala.inline
  def apply(
    code: code,
    _code: Element = null,
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[String] = null,
    id: String = null,
    modifierExtension: js.Array[Extension] = null,
    targetIdentifier: Identifier = null,
    targetReference: Reference = null
  ): CompositionRelatesTo = {
    val __obj = js.Dynamic.literal(code = code)
    if (_code != null) __obj.updateDynamic("_code")(_code)
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments)
    if (id != null) __obj.updateDynamic("id")(id)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    if (targetIdentifier != null) __obj.updateDynamic("targetIdentifier")(targetIdentifier)
    if (targetReference != null) __obj.updateDynamic("targetReference")(targetReference)
    __obj.asInstanceOf[CompositionRelatesTo]
  }
}

