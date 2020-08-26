package typings.googleAppsScript.GoogleAppsScript.Classroom.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ShortAnswerSubmission extends js.Object {
  var answer: js.UndefOr[String] = js.native
}

object ShortAnswerSubmission {
  @scala.inline
  def apply(): ShortAnswerSubmission = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShortAnswerSubmission]
  }
  @scala.inline
  implicit class ShortAnswerSubmissionOps[Self <: ShortAnswerSubmission] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAnswer(value: String): Self = this.set("answer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnswer: Self = this.set("answer", js.undefined)
  }
  
}

