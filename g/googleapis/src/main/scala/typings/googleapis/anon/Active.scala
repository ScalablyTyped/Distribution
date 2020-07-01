package typings.googleapis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Active extends js.Object {
  var active: js.UndefOr[Boolean] = js.native
  var every: js.UndefOr[Double] = js.native
  var expirationDate: js.UndefOr[String] = js.native
  var repeats: js.UndefOr[String] = js.native
  var repeatsOnWeekDays: js.UndefOr[js.Array[String]] = js.native
  var runsOnDayOfMonth: js.UndefOr[String] = js.native
  var startDate: js.UndefOr[String] = js.native
}

object Active {
  @scala.inline
  def apply(
    active: js.UndefOr[Boolean] = js.undefined,
    every: js.UndefOr[Double] = js.undefined,
    expirationDate: String = null,
    repeats: String = null,
    repeatsOnWeekDays: js.Array[String] = null,
    runsOnDayOfMonth: String = null,
    startDate: String = null
  ): Active = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.get.asInstanceOf[js.Any])
    if (!js.isUndefined(every)) __obj.updateDynamic("every")(every.get.asInstanceOf[js.Any])
    if (expirationDate != null) __obj.updateDynamic("expirationDate")(expirationDate.asInstanceOf[js.Any])
    if (repeats != null) __obj.updateDynamic("repeats")(repeats.asInstanceOf[js.Any])
    if (repeatsOnWeekDays != null) __obj.updateDynamic("repeatsOnWeekDays")(repeatsOnWeekDays.asInstanceOf[js.Any])
    if (runsOnDayOfMonth != null) __obj.updateDynamic("runsOnDayOfMonth")(runsOnDayOfMonth.asInstanceOf[js.Any])
    if (startDate != null) __obj.updateDynamic("startDate")(startDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[Active]
  }
}

