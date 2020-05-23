package typings.ethersprojectBytes.mod

import typings.ethersprojectBytes.ethersprojectBytesStrings.left
import typings.ethersprojectBytes.ethersprojectBytesStrings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataOptions extends js.Object {
  var allowMissingPrefix: js.UndefOr[Boolean] = js.undefined
  var hexPad: js.UndefOr[left | right | Null] = js.undefined
}

object DataOptions {
  @scala.inline
  def apply(
    allowMissingPrefix: js.UndefOr[Boolean] = js.undefined,
    hexPad: js.UndefOr[Null | left | right] = js.undefined
  ): DataOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowMissingPrefix)) __obj.updateDynamic("allowMissingPrefix")(allowMissingPrefix.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hexPad)) __obj.updateDynamic("hexPad")(hexPad.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataOptions]
  }
}

