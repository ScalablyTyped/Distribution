package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the client-side equivalent of the FinancialIndicator class.
  */
@js.native
trait ASPxClientFinancialIndicator extends ASPxClientIndicator {
  /**
    * Gets the first point of the financial indicator.
    */
  var point1: ASPxClientFinancialIndicatorPoint = js.native
  /**
    * Gets the second point of the financial indicator.
    */
  var point2: ASPxClientFinancialIndicatorPoint = js.native
}

object ASPxClientFinancialIndicator {
  @scala.inline
  def apply(
    chart: ASPxClientWebChart,
    name: String,
    point1: ASPxClientFinancialIndicatorPoint,
    point2: ASPxClientFinancialIndicatorPoint,
    series: ASPxClientSeries
  ): ASPxClientFinancialIndicator = {
    val __obj = js.Dynamic.literal(chart = chart.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], point1 = point1.asInstanceOf[js.Any], point2 = point2.asInstanceOf[js.Any], series = series.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientFinancialIndicator]
  }
  @scala.inline
  implicit class ASPxClientFinancialIndicatorOps[Self <: ASPxClientFinancialIndicator] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setPoint1(value: ASPxClientFinancialIndicatorPoint): Self = this.set("point1", value.asInstanceOf[js.Any])
    @scala.inline
    def setPoint2(value: ASPxClientFinancialIndicatorPoint): Self = this.set("point2", value.asInstanceOf[js.Any])
  }
  
}

