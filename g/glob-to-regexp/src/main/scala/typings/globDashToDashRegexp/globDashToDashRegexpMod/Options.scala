package typings.globDashToDashRegexp.globDashToDashRegexpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var extended: js.UndefOr[Boolean] = js.undefined
  var flags: js.UndefOr[String] = js.undefined
  var globstar: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    extended: js.UndefOr[Boolean] = js.undefined,
    flags: String = null,
    globstar: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(extended)) __obj.updateDynamic("extended")(extended)
    if (flags != null) __obj.updateDynamic("flags")(flags)
    if (!js.isUndefined(globstar)) __obj.updateDynamic("globstar")(globstar)
    __obj.asInstanceOf[Options]
  }
}

