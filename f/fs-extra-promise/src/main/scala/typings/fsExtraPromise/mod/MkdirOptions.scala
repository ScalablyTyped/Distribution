package typings.fsExtraPromise.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MkdirOptions extends js.Object {
  var fs: js.UndefOr[js.Any] = js.undefined
  var mode: js.UndefOr[Double] = js.undefined
}

object MkdirOptions {
  @scala.inline
  def apply(fs: js.Any = null, mode: js.UndefOr[Double] = js.undefined): MkdirOptions = {
    val __obj = js.Dynamic.literal()
    if (fs != null) __obj.updateDynamic("fs")(fs.asInstanceOf[js.Any])
    if (!js.isUndefined(mode)) __obj.updateDynamic("mode")(mode.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[MkdirOptions]
  }
}

