package typings.emscripten.Emscripten

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CCallOpts extends js.Object {
  var async: js.UndefOr[Boolean] = js.undefined
}

object CCallOpts {
  @scala.inline
  def apply(async: js.UndefOr[Boolean] = js.undefined): CCallOpts = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(async)) __obj.updateDynamic("async")(async.asInstanceOf[js.Any])
    __obj.asInstanceOf[CCallOpts]
  }
}

