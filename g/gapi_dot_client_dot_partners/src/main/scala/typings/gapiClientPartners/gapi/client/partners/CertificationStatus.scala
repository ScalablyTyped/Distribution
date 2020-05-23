package typings.gapiClientPartners.gapi.client.partners

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CertificationStatus extends js.Object {
  /** List of certification exam statuses. */
  var examStatuses: js.UndefOr[js.Array[CertificationExamStatus]] = js.undefined
  /** Whether certification is passing. */
  var isCertified: js.UndefOr[Boolean] = js.undefined
  /** The type of the certification. */
  var `type`: js.UndefOr[String] = js.undefined
  /** Number of people who are certified, */
  var userCount: js.UndefOr[Double] = js.undefined
}

object CertificationStatus {
  @scala.inline
  def apply(
    examStatuses: js.Array[CertificationExamStatus] = null,
    isCertified: js.UndefOr[Boolean] = js.undefined,
    `type`: String = null,
    userCount: js.UndefOr[Double] = js.undefined
  ): CertificationStatus = {
    val __obj = js.Dynamic.literal()
    if (examStatuses != null) __obj.updateDynamic("examStatuses")(examStatuses.asInstanceOf[js.Any])
    if (!js.isUndefined(isCertified)) __obj.updateDynamic("isCertified")(isCertified.get.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(userCount)) __obj.updateDynamic("userCount")(userCount.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CertificationStatus]
  }
}

