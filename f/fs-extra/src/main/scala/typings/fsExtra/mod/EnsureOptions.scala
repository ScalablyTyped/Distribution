package typings.fsExtra.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EnsureOptions extends js.Object {
  var mode: js.UndefOr[Double] = js.undefined
}

object EnsureOptions {
  @scala.inline
  def apply(mode: js.UndefOr[Double] = js.undefined): EnsureOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(mode)) __obj.updateDynamic("mode")(mode.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnsureOptions]
  }
}

