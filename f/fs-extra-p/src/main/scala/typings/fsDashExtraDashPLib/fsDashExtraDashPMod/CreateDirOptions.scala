package typings
package fsDashExtraDashPLib.fsDashExtraDashPMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateDirOptions extends js.Object {
  var fs: js.UndefOr[js.Any] = js.undefined
  var mode: js.UndefOr[scala.Double | java.lang.String] = js.undefined
}

object CreateDirOptions {
  @scala.inline
  def apply(fs: js.Any = null, mode: scala.Double | java.lang.String = null): CreateDirOptions = {
    val __obj = js.Dynamic.literal()
    if (fs != null) __obj.updateDynamic("fs")(fs)
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDirOptions]
  }
}

