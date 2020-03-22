package typings.echarts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLineStyleAnonShadowBlur extends js.Object {
  /**
    * @see https://echarts.apache.org/en/option.html#series-parallel.data.emphasis.lineStyle
    */
  var lineStyle: js.UndefOr[AnonShadowBlur] = js.undefined
}

object AnonLineStyleAnonShadowBlur {
  @scala.inline
  def apply(lineStyle: AnonShadowBlur = null): AnonLineStyleAnonShadowBlur = {
    val __obj = js.Dynamic.literal()
    if (lineStyle != null) __obj.updateDynamic("lineStyle")(lineStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLineStyleAnonShadowBlur]
  }
}

