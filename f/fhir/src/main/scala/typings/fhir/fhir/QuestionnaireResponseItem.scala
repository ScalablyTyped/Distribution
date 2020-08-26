package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Groups and questions
  */
@js.native
trait QuestionnaireResponseItem extends BackboneElement {
  /**
    * Contains extended information for property 'definition'.
    */
  var _definition: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'linkId'.
    */
  var _linkId: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'text'.
    */
  var _text: js.UndefOr[Element] = js.native
  /**
    * The response(s) to the question
    */
  var answer: js.UndefOr[js.Array[QuestionnaireResponseItemAnswer]] = js.native
  /**
    * ElementDefinition - details for the item
    */
  var definition: js.UndefOr[uri] = js.native
  /**
    * Nested questionnaire response items
    */
  var item: js.UndefOr[js.Array[QuestionnaireResponseItem]] = js.native
  /**
    * Pointer to specific item from Questionnaire
    */
  var linkId: String = js.native
  /**
    * The subject this group's answers are about
    */
  var subject: js.UndefOr[Reference] = js.native
  /**
    * Name for group or question text
    */
  var text: js.UndefOr[String] = js.native
}

object QuestionnaireResponseItem {
  @scala.inline
  def apply(linkId: String): QuestionnaireResponseItem = {
    val __obj = js.Dynamic.literal(linkId = linkId.asInstanceOf[js.Any])
    __obj.asInstanceOf[QuestionnaireResponseItem]
  }
  @scala.inline
  implicit class QuestionnaireResponseItemOps[Self <: QuestionnaireResponseItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setLinkId(value: String): Self = this.set("linkId", value.asInstanceOf[js.Any])
    @scala.inline
    def set_definition(value: Element): Self = this.set("_definition", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_definition: Self = this.set("_definition", js.undefined)
    @scala.inline
    def set_linkId(value: Element): Self = this.set("_linkId", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_linkId: Self = this.set("_linkId", js.undefined)
    @scala.inline
    def set_text(value: Element): Self = this.set("_text", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_text: Self = this.set("_text", js.undefined)
    @scala.inline
    def setAnswerVarargs(value: QuestionnaireResponseItemAnswer*): Self = this.set("answer", js.Array(value :_*))
    @scala.inline
    def setAnswer(value: js.Array[QuestionnaireResponseItemAnswer]): Self = this.set("answer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnswer: Self = this.set("answer", js.undefined)
    @scala.inline
    def setDefinition(value: uri): Self = this.set("definition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefinition: Self = this.set("definition", js.undefined)
    @scala.inline
    def setItemVarargs(value: QuestionnaireResponseItem*): Self = this.set("item", js.Array(value :_*))
    @scala.inline
    def setItem(value: js.Array[QuestionnaireResponseItem]): Self = this.set("item", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItem: Self = this.set("item", js.undefined)
    @scala.inline
    def setSubject(value: Reference): Self = this.set("subject", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubject: Self = this.set("subject", js.undefined)
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
  }
  
}

