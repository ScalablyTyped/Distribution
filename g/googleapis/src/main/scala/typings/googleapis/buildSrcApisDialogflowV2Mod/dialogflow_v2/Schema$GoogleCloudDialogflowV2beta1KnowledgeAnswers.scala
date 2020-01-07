package typings.googleapis.buildSrcApisDialogflowV2Mod.dialogflow_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the result of querying a Knowledge base.
  */
@js.native
trait Schema$GoogleCloudDialogflowV2beta1KnowledgeAnswers extends js.Object {
  /**
    * A list of answers from Knowledge Connector.
    */
  var answers: js.UndefOr[js.Array[Schema$GoogleCloudDialogflowV2beta1KnowledgeAnswersAnswer]] = js.native
}

object Schema$GoogleCloudDialogflowV2beta1KnowledgeAnswers {
  @scala.inline
  def apply(answers: js.Array[Schema$GoogleCloudDialogflowV2beta1KnowledgeAnswersAnswer] = null): Schema$GoogleCloudDialogflowV2beta1KnowledgeAnswers = {
    val __obj = js.Dynamic.literal()
    if (answers != null) __obj.updateDynamic("answers")(answers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GoogleCloudDialogflowV2beta1KnowledgeAnswers]
  }
}

