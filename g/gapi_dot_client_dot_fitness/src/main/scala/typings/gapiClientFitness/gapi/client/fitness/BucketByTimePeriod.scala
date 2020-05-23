package typings.gapiClientFitness.gapi.client.fitness

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
  def apply(timeZoneId: String = null, `type`: String = null, value: js.UndefOr[Double] = js.undefined): BucketByTimePeriod = {
    val __obj = js.Dynamic.literal()
    if (timeZoneId != null) __obj.updateDynamic("timeZoneId")(timeZoneId.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(value)) __obj.updateDynamic("value")(value.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[BucketByTimePeriod]
  }
}

