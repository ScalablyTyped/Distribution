package typings.googleAppsScript.GoogleAppsScript.Classroom.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShortAnswerSubmission extends js.Object {
  var answer: js.UndefOr[String] = js.undefined
}

object ShortAnswerSubmission {
  @scala.inline
  def apply(answer: String = null): ShortAnswerSubmission = {
    val __obj = js.Dynamic.literal()
    if (answer != null) __obj.updateDynamic("answer")(answer.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShortAnswerSubmission]
  }
}

