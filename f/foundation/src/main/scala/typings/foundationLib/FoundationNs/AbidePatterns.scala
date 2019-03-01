package typings
package foundationLib.FoundationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// http://foundation.zurb.com/docs/components/abide.html#optional-javascript-configuration
trait AbidePatterns extends js.Object {
  var alpha: js.UndefOr[stdLib.RegExp] = js.undefined
  var alpha_numeric: js.UndefOr[stdLib.RegExp] = js.undefined
  var card: js.UndefOr[stdLib.RegExp] = js.undefined
  var color: js.UndefOr[stdLib.RegExp] = js.undefined
  var cvv: js.UndefOr[stdLib.RegExp] = js.undefined
  var date: js.UndefOr[stdLib.RegExp] = js.undefined
  var dateISO: js.UndefOr[stdLib.RegExp] = js.undefined
  var datetime: js.UndefOr[stdLib.RegExp] = js.undefined
  var domain: js.UndefOr[stdLib.RegExp] = js.undefined
  var email: js.UndefOr[stdLib.RegExp] = js.undefined
  var integer: js.UndefOr[stdLib.RegExp] = js.undefined
  var month_day_year: js.UndefOr[stdLib.RegExp] = js.undefined
  var number: js.UndefOr[stdLib.RegExp] = js.undefined
  var time: js.UndefOr[stdLib.RegExp] = js.undefined
  var url: js.UndefOr[stdLib.RegExp] = js.undefined
}

object AbidePatterns {
  @scala.inline
  def apply(
    alpha: stdLib.RegExp = null,
    alpha_numeric: stdLib.RegExp = null,
    card: stdLib.RegExp = null,
    color: stdLib.RegExp = null,
    cvv: stdLib.RegExp = null,
    date: stdLib.RegExp = null,
    dateISO: stdLib.RegExp = null,
    datetime: stdLib.RegExp = null,
    domain: stdLib.RegExp = null,
    email: stdLib.RegExp = null,
    integer: stdLib.RegExp = null,
    month_day_year: stdLib.RegExp = null,
    number: stdLib.RegExp = null,
    time: stdLib.RegExp = null,
    url: stdLib.RegExp = null
  ): AbidePatterns = {
    val __obj = js.Dynamic.literal()
    if (alpha != null) __obj.updateDynamic("alpha")(alpha)
    if (alpha_numeric != null) __obj.updateDynamic("alpha_numeric")(alpha_numeric)
    if (card != null) __obj.updateDynamic("card")(card)
    if (color != null) __obj.updateDynamic("color")(color)
    if (cvv != null) __obj.updateDynamic("cvv")(cvv)
    if (date != null) __obj.updateDynamic("date")(date)
    if (dateISO != null) __obj.updateDynamic("dateISO")(dateISO)
    if (datetime != null) __obj.updateDynamic("datetime")(datetime)
    if (domain != null) __obj.updateDynamic("domain")(domain)
    if (email != null) __obj.updateDynamic("email")(email)
    if (integer != null) __obj.updateDynamic("integer")(integer)
    if (month_day_year != null) __obj.updateDynamic("month_day_year")(month_day_year)
    if (number != null) __obj.updateDynamic("number")(number)
    if (time != null) __obj.updateDynamic("time")(time)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[AbidePatterns]
  }
}

