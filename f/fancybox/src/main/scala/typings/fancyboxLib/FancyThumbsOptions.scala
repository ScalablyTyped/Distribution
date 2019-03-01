package typings
package fancyboxLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FancyThumbsOptions extends js.Object {
  /**
    * Display thumbnails on opening
    */
  var autoStart: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Vertical (y) or horizontal (x) scrolling
    */
  var axis: js.UndefOr[fancyboxLib.fancyboxLibStrings.x | fancyboxLib.fancyboxLibStrings.y] = js.undefined
  /**
    * Hide thumbnail grid when closing animation starts
    */
  var hideOnClose: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Container is injected into this element
    */
  var parentEl: js.UndefOr[java.lang.String] = js.undefined
}

object FancyThumbsOptions {
  @scala.inline
  def apply(
    autoStart: js.UndefOr[scala.Boolean] = js.undefined,
    axis: fancyboxLib.fancyboxLibStrings.x | fancyboxLib.fancyboxLibStrings.y = null,
    hideOnClose: js.UndefOr[scala.Boolean] = js.undefined,
    parentEl: java.lang.String = null
  ): FancyThumbsOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoStart)) __obj.updateDynamic("autoStart")(autoStart)
    if (axis != null) __obj.updateDynamic("axis")(axis.asInstanceOf[js.Any])
    if (!js.isUndefined(hideOnClose)) __obj.updateDynamic("hideOnClose")(hideOnClose)
    if (parentEl != null) __obj.updateDynamic("parentEl")(parentEl)
    __obj.asInstanceOf[FancyThumbsOptions]
  }
}

