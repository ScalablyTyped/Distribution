package typings.echarts.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LineStyleShadowBlur extends js.Object {
  /**
    * @see https://echarts.apache.org/en/option.html#series-parallel.data.emphasis.lineStyle
    */
  var lineStyle: js.UndefOr[ShadowBlur] = js.undefined
}

object LineStyleShadowBlur {
  @scala.inline
  def apply(lineStyle: ShadowBlur = null): LineStyleShadowBlur = {
    val __obj = js.Dynamic.literal()
    if (lineStyle != null) __obj.updateDynamic("lineStyle")(lineStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineStyleShadowBlur]
  }
}

