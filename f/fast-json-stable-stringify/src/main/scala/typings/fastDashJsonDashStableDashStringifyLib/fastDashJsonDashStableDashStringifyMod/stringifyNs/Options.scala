package typings
package fastDashJsonDashStableDashStringifyLib.fastDashJsonDashStableDashStringifyMod.stringifyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var cmp: js.UndefOr[js.Function2[/* a */ CompareDescriptor, /* b */ CompareDescriptor, scala.Double]] = js.undefined
  var cycles: js.UndefOr[scala.Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    cmp: (/* a */ CompareDescriptor, /* b */ CompareDescriptor) => scala.Double = null,
    cycles: js.UndefOr[scala.Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (cmp != null) __obj.updateDynamic("cmp")(js.Any.fromFunction2(cmp))
    if (!js.isUndefined(cycles)) __obj.updateDynamic("cycles")(cycles)
    __obj.asInstanceOf[Options]
  }
}

