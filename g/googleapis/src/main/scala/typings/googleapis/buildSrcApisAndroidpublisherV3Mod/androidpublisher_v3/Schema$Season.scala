package typings.googleapis.buildSrcApisAndroidpublisherV3Mod.androidpublisher_v3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$Season extends js.Object {
  /**
    * Inclusive end date of the recurrence period.
    */
  var end: js.UndefOr[Schema$MonthDay] = js.native
  /**
    * Optionally present list of prorations for the season. Each proration is a
    * one-off discounted entry into a subscription. Each proration contains the
    * first date on which the discount is available and the new pricing
    * information.
    */
  var prorations: js.UndefOr[js.Array[Schema$Prorate]] = js.native
  /**
    * Inclusive start date of the recurrence period.
    */
  var start: js.UndefOr[Schema$MonthDay] = js.native
}

object Schema$Season {
  @scala.inline
  def apply(
    end: Schema$MonthDay = null,
    prorations: js.Array[Schema$Prorate] = null,
    start: Schema$MonthDay = null
  ): Schema$Season = {
    val __obj = js.Dynamic.literal()
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (prorations != null) __obj.updateDynamic("prorations")(prorations.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Season]
  }
}

