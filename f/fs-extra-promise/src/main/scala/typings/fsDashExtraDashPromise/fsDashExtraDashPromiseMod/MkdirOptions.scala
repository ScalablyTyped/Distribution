package typings.fsDashExtraDashPromise.fsDashExtraDashPromiseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MkdirOptions extends js.Object {
  var fs: js.UndefOr[js.Any] = js.undefined
  var mode: js.UndefOr[Double] = js.undefined
}

object MkdirOptions {
  @scala.inline
  def apply(fs: js.Any = null, mode: Int | Double = null): MkdirOptions = {
    val __obj = js.Dynamic.literal()
    if (fs != null) __obj.updateDynamic("fs")(fs.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[MkdirOptions]
  }
}

