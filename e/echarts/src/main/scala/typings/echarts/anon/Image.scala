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

@js.native
trait Image extends _Color {
  /**
    * HTMLImageElement, and HTMLCanvasElement are supported, while string path is not supported
    */
  var image: HTMLImageElement | HTMLCanvasElement = js.native
  var repeat: js.UndefOr[typings.echarts.echartsStrings.repeat | `repeat-x` | `repeat-y` | `no-repeat`] = js.native
}

object Image {
  @scala.inline
  def apply(image: HTMLImageElement | HTMLCanvasElement): Image = {
    val __obj = js.Dynamic.literal(image = image.asInstanceOf[js.Any])
    __obj.asInstanceOf[Image]
  }
  @scala.inline
  implicit class ImageOps[Self <: Image] (val x: Self) extends AnyVal {
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
    def setImage(value: HTMLImageElement | HTMLCanvasElement): Self = this.set("image", value.asInstanceOf[js.Any])
    @scala.inline
    def setRepeat(value: repeat | `repeat-x` | `repeat-y` | `no-repeat`): Self = this.set("repeat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRepeat: Self = this.set("repeat", js.undefined)
  }
  
}

