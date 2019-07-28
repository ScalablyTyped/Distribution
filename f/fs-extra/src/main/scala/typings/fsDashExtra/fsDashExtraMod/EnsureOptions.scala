package typings.fsDashExtra.fsDashExtraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EnsureOptions extends js.Object {
  var mode: js.UndefOr[Double] = js.undefined
}

object EnsureOptions {
  @scala.inline
  def apply(mode: Int | Double = null): EnsureOptions = {
    val __obj = js.Dynamic.literal()
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnsureOptions]
  }
}

