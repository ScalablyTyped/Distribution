package typings
package extractDashZipLib.extractDashZipMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var defaultDirMode: js.UndefOr[scala.Double] = js.undefined
  var defaultFileMode: js.UndefOr[scala.Double] = js.undefined
  var dir: js.UndefOr[java.lang.String] = js.undefined
  var onEntry: js.UndefOr[js.Function2[/* entry */ js.Any, /* zipfile */ js.Any, scala.Unit]] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    defaultDirMode: scala.Int | scala.Double = null,
    defaultFileMode: scala.Int | scala.Double = null,
    dir: java.lang.String = null,
    onEntry: (/* entry */ js.Any, /* zipfile */ js.Any) => scala.Unit = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (defaultDirMode != null) __obj.updateDynamic("defaultDirMode")(defaultDirMode.asInstanceOf[js.Any])
    if (defaultFileMode != null) __obj.updateDynamic("defaultFileMode")(defaultFileMode.asInstanceOf[js.Any])
    if (dir != null) __obj.updateDynamic("dir")(dir)
    if (onEntry != null) __obj.updateDynamic("onEntry")(js.Any.fromFunction2(onEntry))
    __obj.asInstanceOf[Options]
  }
}

