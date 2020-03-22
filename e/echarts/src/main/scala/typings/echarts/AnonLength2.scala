package typings.echarts

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLength2
  extends /**
  * Some properties like "normal" or "emphasis" are not documented.
  * Please, write description for them
  */
/* unknownProperty */ StringDictionary[js.Any] {
  /**
    * The style of visual guide line in emphasis status.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-pie.labelLine.emphasis
    */
  var emphasis: js.UndefOr[AnonShow] = js.undefined
  /**
    * The length of the first segment of visual guide line.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-pie.labelLine.length
    */
  var length: js.UndefOr[Double] = js.undefined
  /**
    * The length of the second segment of visual guide line.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-pie.labelLine.length2
    */
  var length2: js.UndefOr[Double] = js.undefined
  /**
    * @see https://echarts.apache.org/en/option.html#series-pie.labelLine.lineStyle
    */
  var lineStyle: js.UndefOr[AnonShadowBlur] = js.undefined
  /**
    * Whether to show the visual guide ine.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-pie.labelLine.show
    */
  var show: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether to smooth the visual guide line.
    * It defaults to be `false` and can be set as `true` or the
    * values from 0 to 1 which indicating the smoothness.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-pie.labelLine.smooth
    */
  var smooth: js.UndefOr[Boolean | Double] = js.undefined
}

object AnonLength2 {
  @scala.inline
  def apply(
    StringDictionary: /**
    * Some properties like "normal" or "emphasis" are not documented.
    * Please, write description for them
    */
  /* unknownProperty */ StringDictionary[js.Any] = null,
    emphasis: AnonShow = null,
    length: Int | Double = null,
    length2: Int | Double = null,
    lineStyle: AnonShadowBlur = null,
    show: js.UndefOr[Boolean] = js.undefined,
    smooth: Boolean | Double = null
  ): AnonLength2 = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (emphasis != null) __obj.updateDynamic("emphasis")(emphasis.asInstanceOf[js.Any])
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (length2 != null) __obj.updateDynamic("length2")(length2.asInstanceOf[js.Any])
    if (lineStyle != null) __obj.updateDynamic("lineStyle")(lineStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(show)) __obj.updateDynamic("show")(show.asInstanceOf[js.Any])
    if (smooth != null) __obj.updateDynamic("smooth")(smooth.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLength2]
  }
}

