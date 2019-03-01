package typings
package gapiDotClientDotPartnersLib.gapiNs.clientNs.partnersNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CertificationStatus extends js.Object {
  /** List of certification exam statuses. */
  var examStatuses: js.UndefOr[js.Array[CertificationExamStatus]] = js.undefined
  /** Whether certification is passing. */
  var isCertified: js.UndefOr[scala.Boolean] = js.undefined
  /** The type of the certification. */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  /** Number of people who are certified, */
  var userCount: js.UndefOr[scala.Double] = js.undefined
}

object CertificationStatus {
  @scala.inline
  def apply(
    examStatuses: js.Array[CertificationExamStatus] = null,
    isCertified: js.UndefOr[scala.Boolean] = js.undefined,
    `type`: java.lang.String = null,
    userCount: scala.Int | scala.Double = null
  ): CertificationStatus = {
    val __obj = js.Dynamic.literal()
    if (examStatuses != null) __obj.updateDynamic("examStatuses")(examStatuses)
    if (!js.isUndefined(isCertified)) __obj.updateDynamic("isCertified")(isCertified)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (userCount != null) __obj.updateDynamic("userCount")(userCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[CertificationStatus]
  }
}

