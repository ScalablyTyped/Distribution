package typings.foundation.Foundation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// http://foundation.zurb.com/docs/components/equalizer.html#optional-javascript-configuration
trait EqualizerOptions extends js.Object {
  var equalize_on_stack: js.UndefOr[Boolean] = js.undefined
  var use_tallest: js.UndefOr[Boolean] = js.undefined
}

object EqualizerOptions {
  @scala.inline
  def apply(
    equalize_on_stack: js.UndefOr[Boolean] = js.undefined,
    use_tallest: js.UndefOr[Boolean] = js.undefined
  ): EqualizerOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(equalize_on_stack)) __obj.updateDynamic("equalize_on_stack")(equalize_on_stack.get.asInstanceOf[js.Any])
    if (!js.isUndefined(use_tallest)) __obj.updateDynamic("use_tallest")(use_tallest.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[EqualizerOptions]
  }
}

