package typings.fancybox

import typings.fancybox.fancyboxStrings.x
import typings.fancybox.fancyboxStrings.y
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FancyThumbsOptions extends js.Object {
  /**
    * Display thumbnails on opening
    */
  var autoStart: js.UndefOr[Boolean] = js.undefined
  /**
    * Vertical (y) or horizontal (x) scrolling
    */
  var axis: js.UndefOr[x | y] = js.undefined
  /**
    * Hide thumbnail grid when closing animation starts
    */
  var hideOnClose: js.UndefOr[Boolean] = js.undefined
  /**
    * Container is injected into this element
    */
  var parentEl: js.UndefOr[String] = js.undefined
}

object FancyThumbsOptions {
  @scala.inline
  def apply(
    autoStart: js.UndefOr[Boolean] = js.undefined,
    axis: x | y = null,
    hideOnClose: js.UndefOr[Boolean] = js.undefined,
    parentEl: String = null
  ): FancyThumbsOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoStart)) __obj.updateDynamic("autoStart")(autoStart.get.asInstanceOf[js.Any])
    if (axis != null) __obj.updateDynamic("axis")(axis.asInstanceOf[js.Any])
    if (!js.isUndefined(hideOnClose)) __obj.updateDynamic("hideOnClose")(hideOnClose.get.asInstanceOf[js.Any])
    if (parentEl != null) __obj.updateDynamic("parentEl")(parentEl.asInstanceOf[js.Any])
    __obj.asInstanceOf[FancyThumbsOptions]
  }
}

