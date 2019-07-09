package typings
package expressDashValidatorLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CheckFalsy extends js.Object {
  var checkFalsy: js.UndefOr[scala.Boolean] = js.undefined
  var checkNull: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_CheckFalsy {
  @scala.inline
  def apply(
    checkFalsy: js.UndefOr[scala.Boolean] = js.undefined,
    checkNull: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_CheckFalsy = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(checkFalsy)) __obj.updateDynamic("checkFalsy")(checkFalsy)
    if (!js.isUndefined(checkNull)) __obj.updateDynamic("checkNull")(checkNull)
    __obj.asInstanceOf[Anon_CheckFalsy]
  }
}

