package typings.foundationDashSites.FoundationSitesNs

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
    if (alpha != null) __obj.updateDynamic("alpha")(alpha)
    if (alpha_numeric != null) __obj.updateDynamic("alpha_numeric")(alpha_numeric)
    if (card != null) __obj.updateDynamic("card")(card)
    if (color != null) __obj.updateDynamic("color")(color)
    if (cvv != null) __obj.updateDynamic("cvv")(cvv)
    if (date != null) __obj.updateDynamic("date")(date)
    if (dateISO != null) __obj.updateDynamic("dateISO")(dateISO)
    if (datetime != null) __obj.updateDynamic("datetime")(datetime)
    if (day_month_year != null) __obj.updateDynamic("day_month_year")(day_month_year)
    if (domain != null) __obj.updateDynamic("domain")(domain)
    if (email != null) __obj.updateDynamic("email")(email)
    if (integer != null) __obj.updateDynamic("integer")(integer)
    if (month_day_year != null) __obj.updateDynamic("month_day_year")(month_day_year)
    if (number != null) __obj.updateDynamic("number")(number)
    if (time != null) __obj.updateDynamic("time")(time)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[IAbidePatterns]
  }
}

