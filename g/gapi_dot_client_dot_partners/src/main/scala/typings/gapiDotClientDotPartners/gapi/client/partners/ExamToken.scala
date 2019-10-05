package typings.gapiDotClientDotPartners.gapi.client.partners

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExamToken extends js.Object {
  /** The id of the exam the token is for. */
  var examId: js.UndefOr[String] = js.undefined
  /** The type of the exam the token belongs to. */
  var examType: js.UndefOr[String] = js.undefined
  /** The token, only present if the user has access to the exam. */
  var token: js.UndefOr[String] = js.undefined
}

object ExamToken {
  @scala.inline
  def apply(examId: String = null, examType: String = null, token: String = null): ExamToken = {
    val __obj = js.Dynamic.literal()
    if (examId != null) __obj.updateDynamic("examId")(examId)
    if (examType != null) __obj.updateDynamic("examType")(examType)
    if (token != null) __obj.updateDynamic("token")(token)
    __obj.asInstanceOf[ExamToken]
  }
}

