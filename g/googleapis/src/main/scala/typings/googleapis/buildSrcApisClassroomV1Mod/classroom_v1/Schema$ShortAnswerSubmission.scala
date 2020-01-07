package typings.googleapis.buildSrcApisClassroomV1Mod.classroom_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Student work for a short answer question.
  */
@js.native
trait Schema$ShortAnswerSubmission extends js.Object {
  /**
    * Student response to a short-answer question.
    */
  var answer: js.UndefOr[String] = js.native
}

object Schema$ShortAnswerSubmission {
  @scala.inline
  def apply(answer: String = null): Schema$ShortAnswerSubmission = {
    val __obj = js.Dynamic.literal()
    if (answer != null) __obj.updateDynamic("answer")(answer.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ShortAnswerSubmission]
  }
}

