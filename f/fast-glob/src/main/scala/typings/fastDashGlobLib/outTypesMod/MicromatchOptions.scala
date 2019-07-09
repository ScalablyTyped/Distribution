package typings
package fastDashGlobLib.outTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MicromatchOptions extends js.Object {
  var dot: js.UndefOr[scala.Boolean] = js.undefined
  var matchBase: js.UndefOr[scala.Boolean] = js.undefined
  var nobrace: js.UndefOr[scala.Boolean] = js.undefined
  var nocase: js.UndefOr[scala.Boolean] = js.undefined
  var noext: js.UndefOr[scala.Boolean] = js.undefined
  var noglobstar: js.UndefOr[scala.Boolean] = js.undefined
  var posix: js.UndefOr[scala.Boolean] = js.undefined
  var strictSlashes: js.UndefOr[scala.Boolean] = js.undefined
}

object MicromatchOptions {
  @scala.inline
  def apply(
    dot: js.UndefOr[scala.Boolean] = js.undefined,
    matchBase: js.UndefOr[scala.Boolean] = js.undefined,
    nobrace: js.UndefOr[scala.Boolean] = js.undefined,
    nocase: js.UndefOr[scala.Boolean] = js.undefined,
    noext: js.UndefOr[scala.Boolean] = js.undefined,
    noglobstar: js.UndefOr[scala.Boolean] = js.undefined,
    posix: js.UndefOr[scala.Boolean] = js.undefined,
    strictSlashes: js.UndefOr[scala.Boolean] = js.undefined
  ): MicromatchOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(dot)) __obj.updateDynamic("dot")(dot)
    if (!js.isUndefined(matchBase)) __obj.updateDynamic("matchBase")(matchBase)
    if (!js.isUndefined(nobrace)) __obj.updateDynamic("nobrace")(nobrace)
    if (!js.isUndefined(nocase)) __obj.updateDynamic("nocase")(nocase)
    if (!js.isUndefined(noext)) __obj.updateDynamic("noext")(noext)
    if (!js.isUndefined(noglobstar)) __obj.updateDynamic("noglobstar")(noglobstar)
    if (!js.isUndefined(posix)) __obj.updateDynamic("posix")(posix)
    if (!js.isUndefined(strictSlashes)) __obj.updateDynamic("strictSlashes")(strictSlashes)
    __obj.asInstanceOf[MicromatchOptions]
  }
}

