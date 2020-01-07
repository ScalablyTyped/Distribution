package typings.googleapis.buildSrcApisDialogflowV2Mod.dialogflow_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An answer from Knowledge Connector.
  */
@js.native
trait Schema$GoogleCloudDialogflowV2beta1KnowledgeAnswersAnswer extends js.Object {
  /**
    * The piece of text from the `source` knowledge base document that answers
    * this conversational query.
    */
  var answer: js.UndefOr[String] = js.native
  /**
    * The corresponding FAQ question if the answer was extracted from a FAQ
    * Document, empty otherwise.
    */
  var faqQuestion: js.UndefOr[String] = js.native
  /**
    * The system&#39;s confidence score that this Knowledge answer is a good
    * match for this conversational query. The range is from 0.0 (completely
    * uncertain) to 1.0 (completely certain). Note: The confidence score is
    * likely to vary somewhat (possibly even for identical requests), as the
    * underlying model is under constant improvement. It may be deprecated in
    * the future. We recommend using `match_confidence_level` which should be
    * generally more stable.
    */
  var matchConfidence: js.UndefOr[Double] = js.native
  /**
    * The system&#39;s confidence level that this knowledge answer is a good
    * match for this conversational query. NOTE: The confidence level for a
    * given `&lt;query, answer&gt;` pair may change without notice, as it
    * depends on models that are constantly being improved. However, it will
    * change less frequently than the confidence score below, and should be
    * preferred for referencing the quality of an answer.
    */
  var matchConfidenceLevel: js.UndefOr[String] = js.native
  /**
    * Indicates which Knowledge Document this answer was extracted from.
    * Format: `projects/&lt;Project ID&gt;/knowledgeBases/&lt;Knowledge Base
    * ID&gt;/documents/&lt;Document ID&gt;`.
    */
  var source: js.UndefOr[String] = js.native
}

object Schema$GoogleCloudDialogflowV2beta1KnowledgeAnswersAnswer {
  @scala.inline
  def apply(
    answer: String = null,
    faqQuestion: String = null,
    matchConfidence: Int | Double = null,
    matchConfidenceLevel: String = null,
    source: String = null
  ): Schema$GoogleCloudDialogflowV2beta1KnowledgeAnswersAnswer = {
    val __obj = js.Dynamic.literal()
    if (answer != null) __obj.updateDynamic("answer")(answer.asInstanceOf[js.Any])
    if (faqQuestion != null) __obj.updateDynamic("faqQuestion")(faqQuestion.asInstanceOf[js.Any])
    if (matchConfidence != null) __obj.updateDynamic("matchConfidence")(matchConfidence.asInstanceOf[js.Any])
    if (matchConfidenceLevel != null) __obj.updateDynamic("matchConfidenceLevel")(matchConfidenceLevel.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GoogleCloudDialogflowV2beta1KnowledgeAnswersAnswer]
  }
}

