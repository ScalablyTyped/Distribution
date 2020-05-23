package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Processing notes
  */
trait ExplanationOfBenefitProcessNote extends BackboneElement {
  /**
    * Contains extended information for property 'number'.
    */
  var _number: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'text'.
    */
  var _text: js.UndefOr[Element] = js.undefined
  /**
    * Language if different from the resource
    */
  var language: js.UndefOr[CodeableConcept] = js.undefined
  /**
    * Sequence number for this note
    */
  var number: js.UndefOr[positiveInt] = js.undefined
  /**
    * Note explanitory text
    */
  var text: js.UndefOr[String] = js.undefined
  /**
    * display | print | printoper
    */
  var `type`: js.UndefOr[CodeableConcept] = js.undefined
}

object ExplanationOfBenefitProcessNote {
  @scala.inline
  def apply(
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    _number: Element = null,
    _text: Element = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[String] = null,
    id: String = null,
    language: CodeableConcept = null,
    modifierExtension: js.Array[Extension] = null,
    number: js.UndefOr[positiveInt] = js.undefined,
    text: String = null,
    `type`: CodeableConcept = null
  ): ExplanationOfBenefitProcessNote = {
    val __obj = js.Dynamic.literal()
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_number != null) __obj.updateDynamic("_number")(_number.asInstanceOf[js.Any])
    if (_text != null) __obj.updateDynamic("_text")(_text.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    if (!js.isUndefined(number)) __obj.updateDynamic("number")(number.get.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExplanationOfBenefitProcessNote]
  }
}

