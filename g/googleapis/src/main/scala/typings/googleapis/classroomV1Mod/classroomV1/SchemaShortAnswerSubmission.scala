package typings.googleapis.classroomV1Mod.classroomV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Student work for a short answer question.
  */
@js.native
trait SchemaShortAnswerSubmission extends js.Object {
  /**
    * Student response to a short-answer question.
    */
  var answer: js.UndefOr[String] = js.native
}

object SchemaShortAnswerSubmission {
  @scala.inline
  def apply(answer: String = null): SchemaShortAnswerSubmission = {
    val __obj = js.Dynamic.literal()
    if (answer != null) __obj.updateDynamic("answer")(answer.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaShortAnswerSubmission]
  }
}

