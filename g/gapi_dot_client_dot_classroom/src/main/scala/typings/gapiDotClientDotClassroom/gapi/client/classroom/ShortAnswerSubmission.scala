package typings.gapiDotClientDotClassroom.gapi.client.classroom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShortAnswerSubmission extends js.Object {
  /** Student response to a short-answer question. */
  var answer: js.UndefOr[String] = js.undefined
}

object ShortAnswerSubmission {
  @scala.inline
  def apply(answer: String = null): ShortAnswerSubmission = {
    val __obj = js.Dynamic.literal()
    if (answer != null) __obj.updateDynamic("answer")(answer)
    __obj.asInstanceOf[ShortAnswerSubmission]
  }
}

