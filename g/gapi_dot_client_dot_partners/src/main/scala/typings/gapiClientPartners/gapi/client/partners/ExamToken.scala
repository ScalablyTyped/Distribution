package typings.gapiClientPartners.gapi.client.partners

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExamToken extends js.Object {
  /** The id of the exam the token is for. */
  var examId: js.UndefOr[String] = js.native
  /** The type of the exam the token belongs to. */
  var examType: js.UndefOr[String] = js.native
  /** The token, only present if the user has access to the exam. */
  var token: js.UndefOr[String] = js.native
}

object ExamToken {
  @scala.inline
  def apply(): ExamToken = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExamToken]
  }
  @scala.inline
  implicit class ExamTokenOps[Self <: ExamToken] (val x: Self) extends AnyVal {
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
    def setExamId(value: String): Self = this.set("examId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExamId: Self = this.set("examId", js.undefined)
    @scala.inline
    def setExamType(value: String): Self = this.set("examType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExamType: Self = this.set("examType", js.undefined)
    @scala.inline
    def setToken(value: String): Self = this.set("token", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteToken: Self = this.set("token", js.undefined)
  }
  
}

