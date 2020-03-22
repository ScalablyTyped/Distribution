package typings.devextreme

import typings.devextreme.devextremeStrings.auto
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBaseSize extends js.Object {
  var baseSize: js.UndefOr[Double | auto] = js.undefined
  var ratio: js.UndefOr[Double] = js.undefined
  var screen: js.UndefOr[String] = js.undefined
  var shrink: js.UndefOr[Double] = js.undefined
}

object AnonBaseSize {
  @scala.inline
  def apply(
    baseSize: Double | auto = null,
    ratio: Int | Double = null,
    screen: String = null,
    shrink: Int | Double = null
  ): AnonBaseSize = {
    val __obj = js.Dynamic.literal()
    if (baseSize != null) __obj.updateDynamic("baseSize")(baseSize.asInstanceOf[js.Any])
    if (ratio != null) __obj.updateDynamic("ratio")(ratio.asInstanceOf[js.Any])
    if (screen != null) __obj.updateDynamic("screen")(screen.asInstanceOf[js.Any])
    if (shrink != null) __obj.updateDynamic("shrink")(shrink.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBaseSize]
  }
}

