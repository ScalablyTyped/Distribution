package typings.googleapis.classroomV1Mod.classroomV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Student work for a multiple-choice question.
  */
@js.native
trait SchemaMultipleChoiceSubmission extends js.Object {
  /**
    * Student&#39;s select choice.
    */
  var answer: js.UndefOr[String] = js.native
}

object SchemaMultipleChoiceSubmission {
  @scala.inline
  def apply(answer: String = null): SchemaMultipleChoiceSubmission = {
    val __obj = js.Dynamic.literal()
    if (answer != null) __obj.updateDynamic("answer")(answer.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaMultipleChoiceSubmission]
  }
}

