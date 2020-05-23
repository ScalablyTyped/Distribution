package typings.devextreme.anon

import typings.devextreme.devextremeStrings.auto
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseSize extends js.Object {
  var baseSize: js.UndefOr[Double | auto] = js.undefined
  var ratio: js.UndefOr[Double] = js.undefined
  var screen: js.UndefOr[String] = js.undefined
  var shrink: js.UndefOr[Double] = js.undefined
}

object BaseSize {
  @scala.inline
  def apply(
    baseSize: Double | auto = null,
    ratio: js.UndefOr[Double] = js.undefined,
    screen: String = null,
    shrink: js.UndefOr[Double] = js.undefined
  ): BaseSize = {
    val __obj = js.Dynamic.literal()
    if (baseSize != null) __obj.updateDynamic("baseSize")(baseSize.asInstanceOf[js.Any])
    if (!js.isUndefined(ratio)) __obj.updateDynamic("ratio")(ratio.get.asInstanceOf[js.Any])
    if (screen != null) __obj.updateDynamic("screen")(screen.asInstanceOf[js.Any])
    if (!js.isUndefined(shrink)) __obj.updateDynamic("shrink")(shrink.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseSize]
  }
}

