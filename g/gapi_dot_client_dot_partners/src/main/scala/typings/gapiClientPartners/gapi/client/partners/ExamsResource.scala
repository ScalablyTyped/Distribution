package typings.gapiClientPartners.gapi.client.partners

import typings.gapiClient.gapi.client.Request
import typings.gapiClientPartners.anon.ExamType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExamsResource extends js.Object {
  /** Gets an Exam Token for a Partner's user to take an exam in the Exams System */
  def getToken(request: ExamType): Request[ExamToken]
}

object ExamsResource {
  @scala.inline
  def apply(getToken: ExamType => Request[ExamToken]): ExamsResource = {
    val __obj = js.Dynamic.literal(getToken = js.Any.fromFunction1(getToken))
    __obj.asInstanceOf[ExamsResource]
  }
}

