package typings
package eggDashCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IsWeakDep extends js.Object {
  var isWeakDep: js.UndefOr[scala.Boolean] = js.undefined
  var timeout: js.UndefOr[scala.Double] = js.undefined
}

object Anon_IsWeakDep {
  @scala.inline
  def apply(isWeakDep: js.UndefOr[scala.Boolean] = js.undefined, timeout: scala.Int | scala.Double = null): Anon_IsWeakDep = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(isWeakDep)) __obj.updateDynamic("isWeakDep")(isWeakDep)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_IsWeakDep]
  }
}

