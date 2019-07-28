package typings.fsDashExtraDashP.fsDashExtraDashPMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateDirOptions extends js.Object {
  var fs: js.UndefOr[js.Any] = js.undefined
  var mode: js.UndefOr[Double | String] = js.undefined
}

object CreateDirOptions {
  @scala.inline
  def apply(fs: js.Any = null, mode: Double | String = null): CreateDirOptions = {
    val __obj = js.Dynamic.literal()
    if (fs != null) __obj.updateDynamic("fs")(fs)
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDirOptions]
  }
}

