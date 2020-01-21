package typings.gapiClientPartners.gapi.client.partners

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientPartners.AnonAccesstokenAltBearertokenCallbackExamType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExamsResource extends js.Object {
  /** Gets an Exam Token for a Partner's user to take an exam in the Exams System */
  def getToken(request: AnonAccesstokenAltBearertokenCallbackExamType): Request_[ExamToken]
}

object ExamsResource {
  @scala.inline
  def apply(getToken: AnonAccesstokenAltBearertokenCallbackExamType => Request_[ExamToken]): ExamsResource = {
    val __obj = js.Dynamic.literal(getToken = js.Any.fromFunction1(getToken))
  
    __obj.asInstanceOf[ExamsResource]
  }
}

