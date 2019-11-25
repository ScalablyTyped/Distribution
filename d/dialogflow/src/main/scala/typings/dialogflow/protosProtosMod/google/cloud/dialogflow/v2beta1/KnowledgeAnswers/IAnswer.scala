package typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1.KnowledgeAnswers

import typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1.KnowledgeAnswers.Answer.MatchConfidenceLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of an Answer. */
trait IAnswer extends js.Object {
  /** Answer answer */
  var answer: js.UndefOr[String | Null] = js.undefined
  /** Answer faqQuestion */
  var faqQuestion: js.UndefOr[String | Null] = js.undefined
  /** Answer matchConfidence */
  var matchConfidence: js.UndefOr[Double | Null] = js.undefined
  /** Answer matchConfidenceLevel */
  var matchConfidenceLevel: js.UndefOr[MatchConfidenceLevel | Null] = js.undefined
  /** Answer source */
  var source: js.UndefOr[String | Null] = js.undefined
}

object IAnswer {
  @scala.inline
  def apply(
    answer: String = null,
    faqQuestion: String = null,
    matchConfidence: Int | Double = null,
    matchConfidenceLevel: MatchConfidenceLevel = null,
    source: String = null
  ): IAnswer = {
    val __obj = js.Dynamic.literal()
    if (answer != null) __obj.updateDynamic("answer")(answer.asInstanceOf[js.Any])
    if (faqQuestion != null) __obj.updateDynamic("faqQuestion")(faqQuestion.asInstanceOf[js.Any])
    if (matchConfidence != null) __obj.updateDynamic("matchConfidence")(matchConfidence.asInstanceOf[js.Any])
    if (matchConfidenceLevel != null) __obj.updateDynamic("matchConfidenceLevel")(matchConfidenceLevel.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAnswer]
  }
}

