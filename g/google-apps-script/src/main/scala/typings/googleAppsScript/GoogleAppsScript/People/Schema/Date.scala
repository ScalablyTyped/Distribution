package typings.googleAppsScript.GoogleAppsScript.People.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Date extends js.Object {
  var day: js.UndefOr[Double] = js.undefined
  var month: js.UndefOr[Double] = js.undefined
  var year: js.UndefOr[Double] = js.undefined
}

object Date {
  @scala.inline
  def apply(
    day: js.UndefOr[Double] = js.undefined,
    month: js.UndefOr[Double] = js.undefined,
    year: js.UndefOr[Double] = js.undefined
  ): Date = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(day)) __obj.updateDynamic("day")(day.get.asInstanceOf[js.Any])
    if (!js.isUndefined(month)) __obj.updateDynamic("month")(month.get.asInstanceOf[js.Any])
    if (!js.isUndefined(year)) __obj.updateDynamic("year")(year.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Date]
  }
}

