package typings.gapiDotClientDotSheets.gapiNs.clientNs.sheetsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BasicChartDomain extends js.Object {
  /**
    * The data of the domain. For example, if charting stock prices over time,
    * this is the data representing the dates.
    */
  var domain: js.UndefOr[ChartData] = js.undefined
  /** True to reverse the order of the domain values (horizontal axis). */
  var reversed: js.UndefOr[Boolean] = js.undefined
}

object BasicChartDomain {
  @scala.inline
  def apply(domain: ChartData = null, reversed: js.UndefOr[Boolean] = js.undefined): BasicChartDomain = {
    val __obj = js.Dynamic.literal()
    if (domain != null) __obj.updateDynamic("domain")(domain)
    if (!js.isUndefined(reversed)) __obj.updateDynamic("reversed")(reversed)
    __obj.asInstanceOf[BasicChartDomain]
  }
}

