package typings.ejWebAll.ej.datavisualization.LinearGauge

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Frame extends js.Object {
  /** Specifies the frame background image URL of linear gauge
    * @Default {null}
    */
  var backgroundImageUrl: js.UndefOr[String] = js.undefined
  /** Specifies the frame InnerWidth
    * @Default {8}
    */
  var innerWidth: js.UndefOr[Double] = js.undefined
  /** Specifies the frame OuterWidth
    * @Default {12}
    */
  var outerWidth: js.UndefOr[Double] = js.undefined
}

object Frame {
  @scala.inline
  def apply(
    backgroundImageUrl: String = null,
    innerWidth: js.UndefOr[Double] = js.undefined,
    outerWidth: js.UndefOr[Double] = js.undefined
  ): Frame = {
    val __obj = js.Dynamic.literal()
    if (backgroundImageUrl != null) __obj.updateDynamic("backgroundImageUrl")(backgroundImageUrl.asInstanceOf[js.Any])
    if (!js.isUndefined(innerWidth)) __obj.updateDynamic("innerWidth")(innerWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(outerWidth)) __obj.updateDynamic("outerWidth")(outerWidth.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Frame]
  }
}

