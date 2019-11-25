package typings.gapiDotClientDotFitness.gapi.client.fitness

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BucketByTimePeriod extends js.Object {
  /** org.joda.timezone.DateTimeZone */
  var timeZoneId: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
  var value: js.UndefOr[Double] = js.undefined
}

object BucketByTimePeriod {
  @scala.inline
  def apply(timeZoneId: String = null, `type`: String = null, value: Int | Double = null): BucketByTimePeriod = {
    val __obj = js.Dynamic.literal()
    if (timeZoneId != null) __obj.updateDynamic("timeZoneId")(timeZoneId.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[BucketByTimePeriod]
  }
}

