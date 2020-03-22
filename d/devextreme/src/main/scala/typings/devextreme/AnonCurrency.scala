package typings.devextreme

import typings.devextreme.devextremeStrings.billions
import typings.devextreme.devextremeStrings.currency
import typings.devextreme.devextremeStrings.day
import typings.devextreme.devextremeStrings.dayOfWeek
import typings.devextreme.devextremeStrings.decimal_
import typings.devextreme.devextremeStrings.exponential
import typings.devextreme.devextremeStrings.fixedPoint
import typings.devextreme.devextremeStrings.hour
import typings.devextreme.devextremeStrings.largeNumber
import typings.devextreme.devextremeStrings.longDate
import typings.devextreme.devextremeStrings.longDateLongTime
import typings.devextreme.devextremeStrings.longTime
import typings.devextreme.devextremeStrings.millions
import typings.devextreme.devextremeStrings.millisecond
import typings.devextreme.devextremeStrings.minute
import typings.devextreme.devextremeStrings.month
import typings.devextreme.devextremeStrings.monthAndDay
import typings.devextreme.devextremeStrings.monthAndYear
import typings.devextreme.devextremeStrings.percent
import typings.devextreme.devextremeStrings.quarter
import typings.devextreme.devextremeStrings.quarterAndYear
import typings.devextreme.devextremeStrings.second
import typings.devextreme.devextremeStrings.shortDate
import typings.devextreme.devextremeStrings.shortDateShortTime
import typings.devextreme.devextremeStrings.shortTime
import typings.devextreme.devextremeStrings.thousands
import typings.devextreme.devextremeStrings.trillions
import typings.devextreme.devextremeStrings.year
import typings.devextreme.mod.DevExpress.ui._format
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCurrency extends _format {
  var currency: js.UndefOr[String] = js.undefined
  var formatter: js.UndefOr[js.Function1[/* value */ Double | Date, String]] = js.undefined
  var parser: js.UndefOr[js.Function1[/* value */ String, Double | Date]] = js.undefined
  var precision: js.UndefOr[Double] = js.undefined
  var `type`: js.UndefOr[
    billions | currency | day | decimal_ | exponential | fixedPoint | largeNumber | longDate | longTime | millions | millisecond | month | monthAndDay | monthAndYear | percent | quarter | quarterAndYear | shortDate | shortTime | thousands | trillions | year | dayOfWeek | hour | longDateLongTime | minute | second | shortDateShortTime
  ] = js.undefined
}

object AnonCurrency {
  @scala.inline
  def apply(
    currency: String = null,
    formatter: /* value */ Double | Date => String = null,
    parser: /* value */ String => Double | Date = null,
    precision: Int | Double = null,
    `type`: billions | currency | day | decimal_ | exponential | fixedPoint | largeNumber | longDate | longTime | millions | millisecond | month | monthAndDay | monthAndYear | percent | quarter | quarterAndYear | shortDate | shortTime | thousands | trillions | year | dayOfWeek | hour | longDateLongTime | minute | second | shortDateShortTime = null
  ): AnonCurrency = {
    val __obj = js.Dynamic.literal()
    if (currency != null) __obj.updateDynamic("currency")(currency.asInstanceOf[js.Any])
    if (formatter != null) __obj.updateDynamic("formatter")(js.Any.fromFunction1(formatter))
    if (parser != null) __obj.updateDynamic("parser")(js.Any.fromFunction1(parser))
    if (precision != null) __obj.updateDynamic("precision")(precision.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCurrency]
  }
}

