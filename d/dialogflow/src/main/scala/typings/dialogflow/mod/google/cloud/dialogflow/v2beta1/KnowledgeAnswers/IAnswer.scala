package typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.KnowledgeAnswers

import typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.KnowledgeAnswers.Answer.MatchConfidenceLevel
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
  var matchConfidenceLevel: js.UndefOr[
    MatchConfidenceLevel | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.cloud.dialogflow.v2beta1.KnowledgeAnswers.Answer.MatchConfidenceLevel * / any */ String) | Null
  ] = js.undefined
  /** Answer source */
  var source: js.UndefOr[String | Null] = js.undefined
}

object IAnswer {
  @scala.inline
  def apply(
    answer: js.UndefOr[Null | String] = js.undefined,
    faqQuestion: js.UndefOr[Null | String] = js.undefined,
    matchConfidence: js.UndefOr[Null | Double] = js.undefined,
    matchConfidenceLevel: js.UndefOr[
      Null | MatchConfidenceLevel | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.cloud.dialogflow.v2beta1.KnowledgeAnswers.Answer.MatchConfidenceLevel * / any */ String)
    ] = js.undefined,
    source: js.UndefOr[Null | String] = js.undefined
  ): IAnswer = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(answer)) __obj.updateDynamic("answer")(answer.asInstanceOf[js.Any])
    if (!js.isUndefined(faqQuestion)) __obj.updateDynamic("faqQuestion")(faqQuestion.asInstanceOf[js.Any])
    if (!js.isUndefined(matchConfidence)) __obj.updateDynamic("matchConfidence")(matchConfidence.asInstanceOf[js.Any])
    if (!js.isUndefined(matchConfidenceLevel)) __obj.updateDynamic("matchConfidenceLevel")(matchConfidenceLevel.asInstanceOf[js.Any])
    if (!js.isUndefined(source)) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAnswer]
  }
}

