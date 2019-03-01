package typings
package fastifyLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Close extends js.Object {
  var close: js.UndefOr[scala.Boolean] = js.undefined
  var end: js.UndefOr[scala.Boolean] = js.undefined
  var error: js.UndefOr[scala.Boolean] = js.undefined
  var split: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_Close {
  @scala.inline
  def apply(
    close: js.UndefOr[scala.Boolean] = js.undefined,
    end: js.UndefOr[scala.Boolean] = js.undefined,
    error: js.UndefOr[scala.Boolean] = js.undefined,
    split: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_Close = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(close)) __obj.updateDynamic("close")(close)
    if (!js.isUndefined(end)) __obj.updateDynamic("end")(end)
    if (!js.isUndefined(error)) __obj.updateDynamic("error")(error)
    if (!js.isUndefined(split)) __obj.updateDynamic("split")(split)
    __obj.asInstanceOf[Anon_Close]
  }
}

