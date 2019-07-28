package typings.engineDashCheck.engineDashCheckMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var debug: js.UndefOr[Boolean] = js.undefined
  var searchRoot: js.UndefOr[String] = js.undefined
  var silent: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    debug: js.UndefOr[Boolean] = js.undefined,
    searchRoot: String = null,
    silent: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug)
    if (searchRoot != null) __obj.updateDynamic("searchRoot")(searchRoot)
    if (!js.isUndefined(silent)) __obj.updateDynamic("silent")(silent)
    __obj.asInstanceOf[Options]
  }
}

