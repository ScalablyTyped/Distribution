package typings
package globDashToDashRegexpLib.globDashToDashRegexpMod.GlobToRegExpNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var extended: js.UndefOr[scala.Boolean] = js.undefined
  var flags: js.UndefOr[java.lang.String] = js.undefined
  var globstar: js.UndefOr[scala.Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    extended: js.UndefOr[scala.Boolean] = js.undefined,
    flags: java.lang.String = null,
    globstar: js.UndefOr[scala.Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(extended)) __obj.updateDynamic("extended")(extended)
    if (flags != null) __obj.updateDynamic("flags")(flags)
    if (!js.isUndefined(globstar)) __obj.updateDynamic("globstar")(globstar)
    __obj.asInstanceOf[Options]
  }
}

