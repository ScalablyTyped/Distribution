package typings
package etagLib.etagMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var weak: js.UndefOr[scala.Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(weak: js.UndefOr[scala.Boolean] = js.undefined): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(weak)) __obj.updateDynamic("weak")(weak)
    __obj.asInstanceOf[Options]
  }
}

