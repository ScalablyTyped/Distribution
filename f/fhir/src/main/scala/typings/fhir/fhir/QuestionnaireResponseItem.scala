package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Groups and questions
  */
trait QuestionnaireResponseItem extends BackboneElement {
  /**
    * Contains extended information for property 'definition'.
    */
  var _definition: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'linkId'.
    */
  var _linkId: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'text'.
    */
  var _text: js.UndefOr[Element] = js.undefined
  /**
    * The response(s) to the question
    */
  var answer: js.UndefOr[js.Array[QuestionnaireResponseItemAnswer]] = js.undefined
  /**
    * ElementDefinition - details for the item
    */
  var definition: js.UndefOr[uri] = js.undefined
  /**
    * Nested questionnaire response items
    */
  var item: js.UndefOr[js.Array[QuestionnaireResponseItem]] = js.undefined
  /**
    * Pointer to specific item from Questionnaire
    */
  var linkId: String
  /**
    * The subject this group's answers are about
    */
  var subject: js.UndefOr[Reference] = js.undefined
  /**
    * Name for group or question text
    */
  var text: js.UndefOr[String] = js.undefined
}

object QuestionnaireResponseItem {
  @scala.inline
  def apply(
    linkId: String,
    _definition: Element = null,
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    _linkId: Element = null,
    _text: Element = null,
    answer: js.Array[QuestionnaireResponseItemAnswer] = null,
    definition: uri = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[String] = null,
    id: String = null,
    item: js.Array[QuestionnaireResponseItem] = null,
    modifierExtension: js.Array[Extension] = null,
    subject: Reference = null,
    text: String = null
  ): QuestionnaireResponseItem = {
    val __obj = js.Dynamic.literal(linkId = linkId.asInstanceOf[js.Any])
    if (_definition != null) __obj.updateDynamic("_definition")(_definition.asInstanceOf[js.Any])
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_linkId != null) __obj.updateDynamic("_linkId")(_linkId.asInstanceOf[js.Any])
    if (_text != null) __obj.updateDynamic("_text")(_text.asInstanceOf[js.Any])
    if (answer != null) __obj.updateDynamic("answer")(answer.asInstanceOf[js.Any])
    if (definition != null) __obj.updateDynamic("definition")(definition.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (item != null) __obj.updateDynamic("item")(item.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    if (subject != null) __obj.updateDynamic("subject")(subject.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[QuestionnaireResponseItem]
  }
}

