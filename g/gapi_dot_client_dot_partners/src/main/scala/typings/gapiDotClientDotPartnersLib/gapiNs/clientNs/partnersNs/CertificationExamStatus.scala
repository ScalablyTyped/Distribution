package typings
package gapiDotClientDotPartnersLib.gapiNs.clientNs.partnersNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CertificationExamStatus extends js.Object {
  /** The number of people who have passed the certification exam. */
  var numberUsersPass: js.UndefOr[scala.Double] = js.undefined
  /** The type of certification exam. */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object CertificationExamStatus {
  @scala.inline
  def apply(numberUsersPass: scala.Int | scala.Double = null, `type`: java.lang.String = null): CertificationExamStatus = {
    val __obj = js.Dynamic.literal()
    if (numberUsersPass != null) __obj.updateDynamic("numberUsersPass")(numberUsersPass.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[CertificationExamStatus]
  }
}

