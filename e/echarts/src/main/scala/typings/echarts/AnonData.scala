package typings.echarts

import typings.echarts.echarts.TypedArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonData extends js.Object {
  // The data to be appended.
  var data: js.UndefOr[js.Array[_] | TypedArray] = js.undefined
  // Specify which series the data will be appended to.
  var seriesIndex: js.UndefOr[String] = js.undefined
}

object AnonData {
  @scala.inline
  def apply(data: js.Array[_] | TypedArray = null, seriesIndex: String = null): AnonData = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (seriesIndex != null) __obj.updateDynamic("seriesIndex")(seriesIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonData]
  }
}

