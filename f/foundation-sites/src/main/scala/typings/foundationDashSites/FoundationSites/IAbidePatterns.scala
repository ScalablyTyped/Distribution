package typings.foundationDashSites.FoundationSites

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAbidePatterns extends js.Object {
  var alpha: js.UndefOr[RegExp] = js.undefined
  var alpha_numeric: js.UndefOr[RegExp] = js.undefined
  var card: js.UndefOr[RegExp] = js.undefined
  var color: js.UndefOr[RegExp] = js.undefined
  var cvv: js.UndefOr[RegExp] = js.undefined
  var date: js.UndefOr[RegExp] = js.undefined
  var dateISO: js.UndefOr[RegExp] = js.undefined
  var datetime: js.UndefOr[RegExp] = js.undefined
  var day_month_year: js.UndefOr[RegExp] = js.undefined
  var domain: js.UndefOr[RegExp] = js.undefined
  var email: js.UndefOr[RegExp] = js.undefined
  var integer: js.UndefOr[RegExp] = js.undefined
  var month_day_year: js.UndefOr[RegExp] = js.undefined
  var number: js.UndefOr[RegExp] = js.undefined
  var time: js.UndefOr[RegExp] = js.undefined
  var url: js.UndefOr[RegExp] = js.undefined
}

object IAbidePatterns {
  @scala.inline
  def apply(
    alpha: RegExp = null,
    alpha_numeric: RegExp = null,
    card: RegExp = null,
    color: RegExp = null,
    cvv: RegExp = null,
    date: RegExp = null,
    dateISO: RegExp = null,
    datetime: RegExp = null,
    day_month_year: RegExp = null,
    domain: RegExp = null,
    email: RegExp = null,
    integer: RegExp = null,
    month_day_year: RegExp = null,
    number: RegExp = null,
    time: RegExp = null,
    url: RegExp = null
  ): IAbidePatterns = {
    val __obj = js.Dynamic.literal()
    if (alpha != null) __obj.updateDynamic("alpha")(alpha.asInstanceOf[js.Any])
    if (alpha_numeric != null) __obj.updateDynamic("alpha_numeric")(alpha_numeric.asInstanceOf[js.Any])
    if (card != null) __obj.updateDynamic("card")(card.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (cvv != null) __obj.updateDynamic("cvv")(cvv.asInstanceOf[js.Any])
    if (date != null) __obj.updateDynamic("date")(date.asInstanceOf[js.Any])
    if (dateISO != null) __obj.updateDynamic("dateISO")(dateISO.asInstanceOf[js.Any])
    if (datetime != null) __obj.updateDynamic("datetime")(datetime.asInstanceOf[js.Any])
    if (day_month_year != null) __obj.updateDynamic("day_month_year")(day_month_year.asInstanceOf[js.Any])
    if (domain != null) __obj.updateDynamic("domain")(domain.asInstanceOf[js.Any])
    if (email != null) __obj.updateDynamic("email")(email.asInstanceOf[js.Any])
    if (integer != null) __obj.updateDynamic("integer")(integer.asInstanceOf[js.Any])
    if (month_day_year != null) __obj.updateDynamic("month_day_year")(month_day_year.asInstanceOf[js.Any])
    if (number != null) __obj.updateDynamic("number")(number.asInstanceOf[js.Any])
    if (time != null) __obj.updateDynamic("time")(time.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAbidePatterns]
  }
}

