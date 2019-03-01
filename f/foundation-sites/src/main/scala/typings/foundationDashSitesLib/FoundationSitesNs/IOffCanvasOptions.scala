package typings
package foundationDashSitesLib.FoundationSitesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOffCanvasOptions extends js.Object {
  var autoFocus: js.UndefOr[scala.Boolean] = js.undefined
  var closeOnClick: js.UndefOr[scala.Boolean] = js.undefined
  var forceTop: js.UndefOr[scala.Boolean] = js.undefined
  var isRevealed: js.UndefOr[scala.Boolean] = js.undefined
  var position: js.UndefOr[java.lang.String] = js.undefined
  var revealClass: js.UndefOr[java.lang.String] = js.undefined
  var revealOn: js.UndefOr[java.lang.String] = js.undefined
  var transitionTime: js.UndefOr[scala.Double] = js.undefined
  var trapFocus: js.UndefOr[scala.Boolean] = js.undefined
}

object IOffCanvasOptions {
  @scala.inline
  def apply(
    autoFocus: js.UndefOr[scala.Boolean] = js.undefined,
    closeOnClick: js.UndefOr[scala.Boolean] = js.undefined,
    forceTop: js.UndefOr[scala.Boolean] = js.undefined,
    isRevealed: js.UndefOr[scala.Boolean] = js.undefined,
    position: java.lang.String = null,
    revealClass: java.lang.String = null,
    revealOn: java.lang.String = null,
    transitionTime: scala.Int | scala.Double = null,
    trapFocus: js.UndefOr[scala.Boolean] = js.undefined
  ): IOffCanvasOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoFocus)) __obj.updateDynamic("autoFocus")(autoFocus)
    if (!js.isUndefined(closeOnClick)) __obj.updateDynamic("closeOnClick")(closeOnClick)
    if (!js.isUndefined(forceTop)) __obj.updateDynamic("forceTop")(forceTop)
    if (!js.isUndefined(isRevealed)) __obj.updateDynamic("isRevealed")(isRevealed)
    if (position != null) __obj.updateDynamic("position")(position)
    if (revealClass != null) __obj.updateDynamic("revealClass")(revealClass)
    if (revealOn != null) __obj.updateDynamic("revealOn")(revealOn)
    if (transitionTime != null) __obj.updateDynamic("transitionTime")(transitionTime.asInstanceOf[js.Any])
    if (!js.isUndefined(trapFocus)) __obj.updateDynamic("trapFocus")(trapFocus)
    __obj.asInstanceOf[IOffCanvasOptions]
  }
}

