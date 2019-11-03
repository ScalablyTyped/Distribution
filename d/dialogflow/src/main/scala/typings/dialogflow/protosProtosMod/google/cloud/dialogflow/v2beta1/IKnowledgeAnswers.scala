package typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1

import typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1.KnowledgeAnswers.IAnswer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a KnowledgeAnswers. */
trait IKnowledgeAnswers extends js.Object {
  /** KnowledgeAnswers answers */
  var answers: js.UndefOr[js.Array[IAnswer] | Null] = js.undefined
}

object IKnowledgeAnswers {
  @scala.inline
  def apply(answers: js.Array[IAnswer] = null): IKnowledgeAnswers = {
    val __obj = js.Dynamic.literal()
    if (answers != null) __obj.updateDynamic("answers")(answers)
    __obj.asInstanceOf[IKnowledgeAnswers]
  }
}

