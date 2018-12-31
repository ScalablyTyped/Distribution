package typings
package gapiDotClientDotPartnersLib.gapiNs.clientNs.partnersNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExamToken extends js.Object {
  /** The id of the exam the token is for. */
  var examId: js.UndefOr[java.lang.String] = js.undefined
  /** The type of the exam the token belongs to. */
  var examType: js.UndefOr[java.lang.String] = js.undefined
  /** The token, only present if the user has access to the exam. */
  var token: js.UndefOr[java.lang.String] = js.undefined
}

