package typings.findConfig.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var cwd: js.UndefOr[String] = js.undefined
  var dir: js.UndefOr[String] = js.undefined
  var dot: js.UndefOr[Boolean] = js.undefined
  var home: js.UndefOr[Boolean] = js.undefined
  var module: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    cwd: String = null,
    dir: String = null,
    dot: js.UndefOr[Boolean] = js.undefined,
    home: js.UndefOr[Boolean] = js.undefined,
    module: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (cwd != null) __obj.updateDynamic("cwd")(cwd.asInstanceOf[js.Any])
    if (dir != null) __obj.updateDynamic("dir")(dir.asInstanceOf[js.Any])
    if (!js.isUndefined(dot)) __obj.updateDynamic("dot")(dot.asInstanceOf[js.Any])
    if (!js.isUndefined(home)) __obj.updateDynamic("home")(home.asInstanceOf[js.Any])
    if (!js.isUndefined(module)) __obj.updateDynamic("module")(module.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

