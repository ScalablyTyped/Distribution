package typings.extractZip.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var defaultDirMode: js.UndefOr[Double] = js.undefined
  var defaultFileMode: js.UndefOr[Double] = js.undefined
  var dir: js.UndefOr[String] = js.undefined
  var onEntry: js.UndefOr[js.Function2[/* entry */ js.Any, /* zipfile */ js.Any, Unit]] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    defaultDirMode: js.UndefOr[Double] = js.undefined,
    defaultFileMode: js.UndefOr[Double] = js.undefined,
    dir: String = null,
    onEntry: (/* entry */ js.Any, /* zipfile */ js.Any) => Unit = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(defaultDirMode)) __obj.updateDynamic("defaultDirMode")(defaultDirMode.get.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultFileMode)) __obj.updateDynamic("defaultFileMode")(defaultFileMode.get.asInstanceOf[js.Any])
    if (dir != null) __obj.updateDynamic("dir")(dir.asInstanceOf[js.Any])
    if (onEntry != null) __obj.updateDynamic("onEntry")(js.Any.fromFunction2(onEntry))
    __obj.asInstanceOf[Options]
  }
}

