package typings
package gapiDotClientDotPartnersLib.gapiNs.clientNs.partnersNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExamsResource extends js.Object {
  /** Gets an Exam Token for a Partner's user to take an exam in the Exams System */
  def getToken(request: gapiDotClientDotPartnersLib.Anon_AccesstokenAltBearertokenCallbackExamType): gapiDotClientLib.gapiNs.clientNs.Request[ExamToken]
}

object ExamsResource {
  @scala.inline
  def apply(
    getToken: js.Function1[
      gapiDotClientDotPartnersLib.Anon_AccesstokenAltBearertokenCallbackExamType, 
      gapiDotClientLib.gapiNs.clientNs.Request[ExamToken]
    ]
  ): ExamsResource = {
    val __obj = js.Dynamic.literal(getToken = getToken)
  
    __obj.asInstanceOf[ExamsResource]
  }
}

