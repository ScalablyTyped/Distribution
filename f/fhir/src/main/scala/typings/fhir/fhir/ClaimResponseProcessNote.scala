package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Processing notes
  */
trait ClaimResponseProcessNote extends BackboneElement {
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
    * Sequence Number for this note
    */
  var number: js.UndefOr[positiveInt] = js.undefined
  /**
    * Note explanatory text
    */
  var text: js.UndefOr[String] = js.undefined
  /**
    * display | print | printoper
    */
  var `type`: js.UndefOr[CodeableConcept] = js.undefined
}

object ClaimResponseProcessNote {
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
    number: Int | Double = null,
    text: String = null,
    `type`: CodeableConcept = null
  ): ClaimResponseProcessNote = {
    val __obj = js.Dynamic.literal()
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (_number != null) __obj.updateDynamic("_number")(_number)
    if (_text != null) __obj.updateDynamic("_text")(_text)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments)
    if (id != null) __obj.updateDynamic("id")(id)
    if (language != null) __obj.updateDynamic("language")(language)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    if (number != null) __obj.updateDynamic("number")(number.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ClaimResponseProcessNote]
  }
}

