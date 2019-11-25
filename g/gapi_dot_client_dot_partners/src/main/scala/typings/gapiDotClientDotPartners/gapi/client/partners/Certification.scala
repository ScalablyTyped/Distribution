package typings.gapiDotClientDotPartners.gapi.client.partners

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Certification extends js.Object {
  /** Whether this certification has been achieved. */
  var achieved: js.UndefOr[Boolean] = js.undefined
  /** The type of certification, the area of expertise. */
  var certificationType: js.UndefOr[String] = js.undefined
  /** Date this certification is due to expire. */
  var expiration: js.UndefOr[String] = js.undefined
  /** The date the user last achieved certification. */
  var lastAchieved: js.UndefOr[String] = js.undefined
  /** Whether this certification is in the state of warning. */
  var warning: js.UndefOr[Boolean] = js.undefined
}

object Certification {
  @scala.inline
  def apply(
    achieved: js.UndefOr[Boolean] = js.undefined,
    certificationType: String = null,
    expiration: String = null,
    lastAchieved: String = null,
    warning: js.UndefOr[Boolean] = js.undefined
  ): Certification = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(achieved)) __obj.updateDynamic("achieved")(achieved.asInstanceOf[js.Any])
    if (certificationType != null) __obj.updateDynamic("certificationType")(certificationType.asInstanceOf[js.Any])
    if (expiration != null) __obj.updateDynamic("expiration")(expiration.asInstanceOf[js.Any])
    if (lastAchieved != null) __obj.updateDynamic("lastAchieved")(lastAchieved.asInstanceOf[js.Any])
    if (!js.isUndefined(warning)) __obj.updateDynamic("warning")(warning.asInstanceOf[js.Any])
    __obj.asInstanceOf[Certification]
  }
}

