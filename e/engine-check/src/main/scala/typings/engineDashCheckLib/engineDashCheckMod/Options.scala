package typings
package engineDashCheckLib.engineDashCheckMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var debug: js.UndefOr[scala.Boolean] = js.undefined
  var searchRoot: js.UndefOr[java.lang.String] = js.undefined
  var silent: js.UndefOr[scala.Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    debug: js.UndefOr[scala.Boolean] = js.undefined,
    searchRoot: java.lang.String = null,
    silent: js.UndefOr[scala.Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug)
    if (searchRoot != null) __obj.updateDynamic("searchRoot")(searchRoot)
    if (!js.isUndefined(silent)) __obj.updateDynamic("silent")(silent)
    __obj.asInstanceOf[Options]
  }
}

