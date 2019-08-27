package typings.echarts.echartsNs.EChartOptionNs.BasicComponentsNs.CartesianAxisNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @todo describe
  */
trait DataObject extends js.Object {
  var textStyle: js.UndefOr[
    typings.echarts.echartsNs.EChartOptionNs.BasicComponentsNs.CartesianAxisNs.TextStyle
  ] = js.undefined
  var value: js.UndefOr[String | Double] = js.undefined
}

object DataObject {
  @scala.inline
  def apply(
    textStyle: typings.echarts.echartsNs.EChartOptionNs.BasicComponentsNs.CartesianAxisNs.TextStyle = null,
    value: String | Double = null
  ): DataObject = {
    val __obj = js.Dynamic.literal()
    if (textStyle != null) __obj.updateDynamic("textStyle")(textStyle)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataObject]
  }
}

