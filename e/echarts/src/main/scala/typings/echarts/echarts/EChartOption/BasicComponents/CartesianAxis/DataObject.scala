package typings.echarts.echarts.EChartOption.BasicComponents.CartesianAxis

import typings.echarts.echarts.EChartOption.TextStyleWithRich
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @todo describe
  */
trait DataObject extends js.Object {
  var textStyle: js.UndefOr[TextStyleWithRich] = js.undefined
  var value: js.UndefOr[String | Double] = js.undefined
}

object DataObject {
  @scala.inline
  def apply(textStyle: TextStyleWithRich = null, value: String | Double = null): DataObject = {
    val __obj = js.Dynamic.literal()
    if (textStyle != null) __obj.updateDynamic("textStyle")(textStyle.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataObject]
  }
}

