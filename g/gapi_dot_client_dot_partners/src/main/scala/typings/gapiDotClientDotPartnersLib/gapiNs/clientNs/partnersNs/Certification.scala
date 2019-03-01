package typings
package gapiDotClientDotPartnersLib.gapiNs.clientNs.partnersNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Certification extends js.Object {
  /** Whether this certification has been achieved. */
  var achieved: js.UndefOr[scala.Boolean] = js.undefined
  /** The type of certification, the area of expertise. */
  var certificationType: js.UndefOr[java.lang.String] = js.undefined
  /** Date this certification is due to expire. */
  var expiration: js.UndefOr[java.lang.String] = js.undefined
  /** The date the user last achieved certification. */
  var lastAchieved: js.UndefOr[java.lang.String] = js.undefined
  /** Whether this certification is in the state of warning. */
  var warning: js.UndefOr[scala.Boolean] = js.undefined
}

object Certification {
  @scala.inline
  def apply(
    achieved: js.UndefOr[scala.Boolean] = js.undefined,
    certificationType: java.lang.String = null,
    expiration: java.lang.String = null,
    lastAchieved: java.lang.String = null,
    warning: js.UndefOr[scala.Boolean] = js.undefined
  ): Certification = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(achieved)) __obj.updateDynamic("achieved")(achieved)
    if (certificationType != null) __obj.updateDynamic("certificationType")(certificationType)
    if (expiration != null) __obj.updateDynamic("expiration")(expiration)
    if (lastAchieved != null) __obj.updateDynamic("lastAchieved")(lastAchieved)
    if (!js.isUndefined(warning)) __obj.updateDynamic("warning")(warning)
    __obj.asInstanceOf[Certification]
  }
}

