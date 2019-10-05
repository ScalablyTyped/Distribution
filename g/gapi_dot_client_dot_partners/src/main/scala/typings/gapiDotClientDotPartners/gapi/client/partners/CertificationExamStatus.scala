package typings.gapiDotClientDotPartners.gapi.client.partners

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CertificationExamStatus extends js.Object {
  /** The number of people who have passed the certification exam. */
  var numberUsersPass: js.UndefOr[Double] = js.undefined
  /** The type of certification exam. */
  var `type`: js.UndefOr[String] = js.undefined
}

object CertificationExamStatus {
  @scala.inline
  def apply(numberUsersPass: Int | Double = null, `type`: String = null): CertificationExamStatus = {
    val __obj = js.Dynamic.literal()
    if (numberUsersPass != null) __obj.updateDynamic("numberUsersPass")(numberUsersPass.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[CertificationExamStatus]
  }
}

