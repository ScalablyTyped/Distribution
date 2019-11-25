package typings.engineDotIo.engineDotIoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessageOptions extends js.Object {
  var compress: js.UndefOr[Boolean] = js.undefined
}

object MessageOptions {
  @scala.inline
  def apply(compress: js.UndefOr[Boolean] = js.undefined): MessageOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(compress)) __obj.updateDynamic("compress")(compress.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageOptions]
  }
}

