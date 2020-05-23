package typings.findConfig.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReadOptions extends Options {
  var encoding: js.UndefOr[String] = js.undefined
  var flag: js.UndefOr[String] = js.undefined
}

object ReadOptions {
  @scala.inline
  def apply(
    cwd: String = null,
    dir: String = null,
    dot: js.UndefOr[Boolean] = js.undefined,
    encoding: String = null,
    flag: String = null,
    home: js.UndefOr[Boolean] = js.undefined,
    module: js.UndefOr[Boolean] = js.undefined
  ): ReadOptions = {
    val __obj = js.Dynamic.literal()
    if (cwd != null) __obj.updateDynamic("cwd")(cwd.asInstanceOf[js.Any])
    if (dir != null) __obj.updateDynamic("dir")(dir.asInstanceOf[js.Any])
    if (!js.isUndefined(dot)) __obj.updateDynamic("dot")(dot.get.asInstanceOf[js.Any])
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    if (flag != null) __obj.updateDynamic("flag")(flag.asInstanceOf[js.Any])
    if (!js.isUndefined(home)) __obj.updateDynamic("home")(home.get.asInstanceOf[js.Any])
    if (!js.isUndefined(module)) __obj.updateDynamic("module")(module.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadOptions]
  }
}

