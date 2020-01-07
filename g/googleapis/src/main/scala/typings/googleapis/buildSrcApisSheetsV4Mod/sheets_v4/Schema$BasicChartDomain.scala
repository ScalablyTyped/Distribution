package typings.googleapis.buildSrcApisSheetsV4Mod.sheets_v4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The domain of a chart. For example, if charting stock prices over time,
  * this would be the date.
  */
@js.native
trait Schema$BasicChartDomain extends js.Object {
  /**
    * The data of the domain. For example, if charting stock prices over time,
    * this is the data representing the dates.
    */
  var domain: js.UndefOr[Schema$ChartData] = js.native
  /**
    * True to reverse the order of the domain values (horizontal axis).
    */
  var reversed: js.UndefOr[Boolean] = js.native
}

object Schema$BasicChartDomain {
  @scala.inline
  def apply(domain: Schema$ChartData = null, reversed: js.UndefOr[Boolean] = js.undefined): Schema$BasicChartDomain = {
    val __obj = js.Dynamic.literal()
    if (domain != null) __obj.updateDynamic("domain")(domain.asInstanceOf[js.Any])
    if (!js.isUndefined(reversed)) __obj.updateDynamic("reversed")(reversed.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$BasicChartDomain]
  }
}

