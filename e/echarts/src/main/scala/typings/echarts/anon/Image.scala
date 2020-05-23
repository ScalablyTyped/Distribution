package typings.echarts.anon

import typings.echarts.echarts.EChartOption._Color
import typings.echarts.echartsStrings.`no-repeat`
import typings.echarts.echartsStrings.`repeat-x`
import typings.echarts.echartsStrings.`repeat-y`
import typings.echarts.echartsStrings.repeat
import typings.std.HTMLCanvasElement
import typings.std.HTMLImageElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Image extends _Color {
  /**
    * HTMLImageElement, and HTMLCanvasElement are supported, while string path is not supported
    */
  var image: HTMLImageElement | HTMLCanvasElement
  var repeat: js.UndefOr[typings.echarts.echartsStrings.repeat | `repeat-x` | `repeat-y` | `no-repeat`] = js.undefined
}

object Image {
  @scala.inline
  def apply(
    image: HTMLImageElement | HTMLCanvasElement,
    repeat: repeat | `repeat-x` | `repeat-y` | `no-repeat` = null
  ): Image = {
    val __obj = js.Dynamic.literal(image = image.asInstanceOf[js.Any])
    if (repeat != null) __obj.updateDynamic("repeat")(repeat.asInstanceOf[js.Any])
    __obj.asInstanceOf[Image]
  }
}

