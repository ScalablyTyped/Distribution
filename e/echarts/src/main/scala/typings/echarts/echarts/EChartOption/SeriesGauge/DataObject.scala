package typings.echarts.echarts.EChartOption.SeriesGauge

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataObject extends js.Object {
  /**
    * The name of data item.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-gauge.data.name
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * The value of a single data item.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-gauge.data.value
    */
  var value: js.UndefOr[Double] = js.undefined
}

object DataObject {
  @scala.inline
  def apply(name: String = null, value: js.UndefOr[Double] = js.undefined): DataObject = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(value)) __obj.updateDynamic("value")(value.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataObject]
  }
}

