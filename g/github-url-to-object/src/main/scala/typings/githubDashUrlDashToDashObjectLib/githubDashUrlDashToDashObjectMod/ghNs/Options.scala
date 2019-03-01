package typings
package githubDashUrlDashToDashObjectLib.githubDashUrlDashToDashObjectMod.ghNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var enterprise: js.UndefOr[scala.Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(enterprise: js.UndefOr[scala.Boolean] = js.undefined): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enterprise)) __obj.updateDynamic("enterprise")(enterprise)
    __obj.asInstanceOf[Options]
  }
}

