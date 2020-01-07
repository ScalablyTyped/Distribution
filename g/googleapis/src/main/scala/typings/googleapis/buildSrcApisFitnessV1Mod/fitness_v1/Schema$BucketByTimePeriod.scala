package typings.googleapis.buildSrcApisFitnessV1Mod.fitness_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$BucketByTimePeriod extends js.Object {
  /**
    * org.joda.timezone.DateTimeZone
    */
  var timeZoneId: js.UndefOr[String] = js.native
  var `type`: js.UndefOr[String] = js.native
  var value: js.UndefOr[Double] = js.native
}

object Schema$BucketByTimePeriod {
  @scala.inline
  def apply(timeZoneId: String = null, `type`: String = null, value: Int | Double = null): Schema$BucketByTimePeriod = {
    val __obj = js.Dynamic.literal()
    if (timeZoneId != null) __obj.updateDynamic("timeZoneId")(timeZoneId.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$BucketByTimePeriod]
  }
}

