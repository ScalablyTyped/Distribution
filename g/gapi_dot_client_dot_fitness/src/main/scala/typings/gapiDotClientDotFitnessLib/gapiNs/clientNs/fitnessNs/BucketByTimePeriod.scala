package typings
package gapiDotClientDotFitnessLib.gapiNs.clientNs.fitnessNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BucketByTimePeriod extends js.Object {
  /** org.joda.timezone.DateTimeZone */
  var timeZoneId: js.UndefOr[java.lang.String] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  var value: js.UndefOr[scala.Double] = js.undefined
}

object BucketByTimePeriod {
  @scala.inline
  def apply(
    timeZoneId: java.lang.String = null,
    `type`: java.lang.String = null,
    value: scala.Int | scala.Double = null
  ): BucketByTimePeriod = {
    val __obj = js.Dynamic.literal()
    if (timeZoneId != null) __obj.updateDynamic("timeZoneId")(timeZoneId)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[BucketByTimePeriod]
  }
}

