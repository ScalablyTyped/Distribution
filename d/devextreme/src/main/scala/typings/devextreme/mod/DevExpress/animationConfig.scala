package typings.devextreme.mod.DevExpress

import typings.devextreme.devextremeStrings.bottom
import typings.devextreme.devextremeStrings.css
import typings.devextreme.devextremeStrings.fade
import typings.devextreme.devextremeStrings.fadeIn
import typings.devextreme.devextremeStrings.fadeOut
import typings.devextreme.devextremeStrings.left
import typings.devextreme.devextremeStrings.pop
import typings.devextreme.devextremeStrings.right
import typings.devextreme.devextremeStrings.slide
import typings.devextreme.devextremeStrings.slideIn
import typings.devextreme.devextremeStrings.slideOut
import typings.devextreme.devextremeStrings.top
import typings.devextreme.mod.DevExpress.core.dxElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait animationConfig extends js.Object {
  /** @name animationConfig.complete */
  var complete: js.UndefOr[js.Function2[/* $element */ dxElement, /* config */ js.Any, _]] = js.undefined
  /** @name animationConfig.delay */
  var delay: js.UndefOr[Double] = js.undefined
  /** @name animationConfig.direction */
  var direction: js.UndefOr[bottom | left | right | top] = js.undefined
  /** @name animationConfig.duration */
  var duration: js.UndefOr[Double] = js.undefined
  /** @name animationConfig.easing */
  var easing: js.UndefOr[String] = js.undefined
  /** @name animationConfig.from */
  var from: js.UndefOr[Double | String | js.Any] = js.undefined
  /** @name animationConfig.staggerDelay */
  var staggerDelay: js.UndefOr[Double] = js.undefined
  /** @name animationConfig.start */
  var start: js.UndefOr[js.Function2[/* $element */ dxElement, /* config */ js.Any, _]] = js.undefined
  /** @name animationConfig.to */
  var to: js.UndefOr[Double | String | js.Any] = js.undefined
  /** @name animationConfig.type */
  var `type`: js.UndefOr[css | fade | fadeIn | fadeOut | pop | slide | slideIn | slideOut] = js.undefined
}

object animationConfig {
  @scala.inline
  def apply(
    complete: (/* $element */ dxElement, /* config */ js.Any) => _ = null,
    delay: Int | Double = null,
    direction: bottom | left | right | top = null,
    duration: Int | Double = null,
    easing: String = null,
    from: Double | String | js.Any = null,
    staggerDelay: Int | Double = null,
    start: (/* $element */ dxElement, /* config */ js.Any) => _ = null,
    to: Double | String | js.Any = null,
    `type`: css | fade | fadeIn | fadeOut | pop | slide | slideIn | slideOut = null
  ): animationConfig = {
    val __obj = js.Dynamic.literal()
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction2(complete))
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (easing != null) __obj.updateDynamic("easing")(easing.asInstanceOf[js.Any])
    if (from != null) __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    if (staggerDelay != null) __obj.updateDynamic("staggerDelay")(staggerDelay.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(js.Any.fromFunction2(start))
    if (to != null) __obj.updateDynamic("to")(to.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[animationConfig]
  }
}

