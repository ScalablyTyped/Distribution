package typings.googleapis.buildSrcApisClassroomV1Mod.classroom_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Student work for a multiple-choice question.
  */
@js.native
trait Schema$MultipleChoiceSubmission extends js.Object {
  /**
    * Student&#39;s select choice.
    */
  var answer: js.UndefOr[String] = js.native
}

object Schema$MultipleChoiceSubmission {
  @scala.inline
  def apply(answer: String = null): Schema$MultipleChoiceSubmission = {
    val __obj = js.Dynamic.literal()
    if (answer != null) __obj.updateDynamic("answer")(answer.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$MultipleChoiceSubmission]
  }
}

