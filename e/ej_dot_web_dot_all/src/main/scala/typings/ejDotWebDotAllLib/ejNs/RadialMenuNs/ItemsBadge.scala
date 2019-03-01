package typings
package ejDotWebDotAllLib.ejNs.RadialMenuNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ItemsBadge extends js.Object {
  /** Specifies whether to enable radialmenu item badge or not.
    */
  var enabled: js.UndefOr[scala.Boolean] = js.undefined
  /** Specifies the value of radial menu item badge.
    */
  var value: js.UndefOr[scala.Double] = js.undefined
}

object ItemsBadge {
  @scala.inline
  def apply(enabled: js.UndefOr[scala.Boolean] = js.undefined, value: scala.Int | scala.Double = null): ItemsBadge = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemsBadge]
  }
}

