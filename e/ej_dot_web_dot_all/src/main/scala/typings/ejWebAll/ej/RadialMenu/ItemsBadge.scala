package typings.ejWebAll.ej.RadialMenu

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ItemsBadge extends js.Object {
  /** Specifies whether to enable radialmenu item badge or not.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  /** Specifies the value of radial menu item badge.
    */
  var value: js.UndefOr[Double] = js.undefined
}

object ItemsBadge {
  @scala.inline
  def apply(enabled: js.UndefOr[Boolean] = js.undefined, value: Int | Double = null): ItemsBadge = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemsBadge]
  }
}

