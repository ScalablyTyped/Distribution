package typings.fluentuiKeyboardKey.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@fluentui/keyboard-key.@fluentui/keyboard-key.KeyboardEventLike> */
trait PartialKeyboardEventLike extends js.Object {
  var key: js.UndefOr[String] = js.undefined
  var keyCode: js.UndefOr[Double] = js.undefined
  var shiftKey: js.UndefOr[Boolean] = js.undefined
  var which: js.UndefOr[Double] = js.undefined
}

object PartialKeyboardEventLike {
  @scala.inline
  def apply(
    key: String = null,
    keyCode: js.UndefOr[Double] = js.undefined,
    shiftKey: js.UndefOr[Boolean] = js.undefined,
    which: js.UndefOr[Double] = js.undefined
  ): PartialKeyboardEventLike = {
    val __obj = js.Dynamic.literal()
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (!js.isUndefined(keyCode)) __obj.updateDynamic("keyCode")(keyCode.get.asInstanceOf[js.Any])
    if (!js.isUndefined(shiftKey)) __obj.updateDynamic("shiftKey")(shiftKey.get.asInstanceOf[js.Any])
    if (!js.isUndefined(which)) __obj.updateDynamic("which")(which.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialKeyboardEventLike]
  }
}

