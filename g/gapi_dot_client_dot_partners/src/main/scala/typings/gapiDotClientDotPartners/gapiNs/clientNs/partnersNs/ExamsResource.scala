package typings.gapiDotClientDotPartners.gapiNs.clientNs.partnersNs

import typings.gapiDotClient.gapiNs.clientNs.Request
import typings.gapiDotClientDotPartners.Anon_AccesstokenAltBearertokenCallbackExamType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExamsResource extends js.Object {
  /** Gets an Exam Token for a Partner's user to take an exam in the Exams System */
  def getToken(request: Anon_AccesstokenAltBearertokenCallbackExamType): Request[ExamToken]
}

object ExamsResource {
  @scala.inline
  def apply(getToken: Anon_AccesstokenAltBearertokenCallbackExamType => Request[ExamToken]): ExamsResource = {
    val __obj = js.Dynamic.literal(getToken = js.Any.fromFunction1(getToken))
  
    __obj.asInstanceOf[ExamsResource]
  }
}

