package typings.fastGlob.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MicromatchOptions extends js.Object {
  var dot: js.UndefOr[Boolean] = js.undefined
  var matchBase: js.UndefOr[Boolean] = js.undefined
  var nobrace: js.UndefOr[Boolean] = js.undefined
  var nocase: js.UndefOr[Boolean] = js.undefined
  var noext: js.UndefOr[Boolean] = js.undefined
  var noglobstar: js.UndefOr[Boolean] = js.undefined
  var posix: js.UndefOr[Boolean] = js.undefined
  var strictSlashes: js.UndefOr[Boolean] = js.undefined
}

object MicromatchOptions {
  @scala.inline
  def apply(
    dot: js.UndefOr[Boolean] = js.undefined,
    matchBase: js.UndefOr[Boolean] = js.undefined,
    nobrace: js.UndefOr[Boolean] = js.undefined,
    nocase: js.UndefOr[Boolean] = js.undefined,
    noext: js.UndefOr[Boolean] = js.undefined,
    noglobstar: js.UndefOr[Boolean] = js.undefined,
    posix: js.UndefOr[Boolean] = js.undefined,
    strictSlashes: js.UndefOr[Boolean] = js.undefined
  ): MicromatchOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(dot)) __obj.updateDynamic("dot")(dot.asInstanceOf[js.Any])
    if (!js.isUndefined(matchBase)) __obj.updateDynamic("matchBase")(matchBase.asInstanceOf[js.Any])
    if (!js.isUndefined(nobrace)) __obj.updateDynamic("nobrace")(nobrace.asInstanceOf[js.Any])
    if (!js.isUndefined(nocase)) __obj.updateDynamic("nocase")(nocase.asInstanceOf[js.Any])
    if (!js.isUndefined(noext)) __obj.updateDynamic("noext")(noext.asInstanceOf[js.Any])
    if (!js.isUndefined(noglobstar)) __obj.updateDynamic("noglobstar")(noglobstar.asInstanceOf[js.Any])
    if (!js.isUndefined(posix)) __obj.updateDynamic("posix")(posix.asInstanceOf[js.Any])
    if (!js.isUndefined(strictSlashes)) __obj.updateDynamic("strictSlashes")(strictSlashes.asInstanceOf[js.Any])
    __obj.asInstanceOf[MicromatchOptions]
  }
}

