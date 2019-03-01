package typings
package endDashOfDashStreamLib.endDashOfDashStreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var error: js.UndefOr[scala.Boolean] = js.undefined
  var readable: js.UndefOr[scala.Boolean] = js.undefined
  var writable: js.UndefOr[scala.Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    error: js.UndefOr[scala.Boolean] = js.undefined,
    readable: js.UndefOr[scala.Boolean] = js.undefined,
    writable: js.UndefOr[scala.Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(error)) __obj.updateDynamic("error")(error)
    if (!js.isUndefined(readable)) __obj.updateDynamic("readable")(readable)
    if (!js.isUndefined(writable)) __obj.updateDynamic("writable")(writable)
    __obj.asInstanceOf[Options]
  }
}

