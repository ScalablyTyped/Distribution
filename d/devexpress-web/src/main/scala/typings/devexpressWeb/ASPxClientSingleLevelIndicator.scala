package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The client-side equivalent of the SingleLevelIndicator class.
  */
@js.native
trait ASPxClientSingleLevelIndicator extends ASPxClientIndicator {
  /**
    * Gets a value specifying the value level to which the single-level indicator corresponds.
    */
  var valueLevel: String = js.native
}

object ASPxClientSingleLevelIndicator {
  @scala.inline
  def apply(chart: ASPxClientWebChart, name: String, series: ASPxClientSeries, valueLevel: String): ASPxClientSingleLevelIndicator = {
    val __obj = js.Dynamic.literal(chart = chart.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], series = series.asInstanceOf[js.Any], valueLevel = valueLevel.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientSingleLevelIndicator]
  }
  @scala.inline
  implicit class ASPxClientSingleLevelIndicatorOps[Self <: ASPxClientSingleLevelIndicator] (val x: Self) extends AnyVal {
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
    def setValueLevel(value: String): Self = this.set("valueLevel", value.asInstanceOf[js.Any])
  }
  
}

