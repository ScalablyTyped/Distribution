package typings
package expoLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Horizontal extends js.Object {
  var horizontal: js.UndefOr[scala.Boolean] = js.undefined
  var vertical: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_Horizontal {
  @scala.inline
  def apply(
    horizontal: js.UndefOr[scala.Boolean] = js.undefined,
    vertical: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_Horizontal = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(horizontal)) __obj.updateDynamic("horizontal")(horizontal)
    if (!js.isUndefined(vertical)) __obj.updateDynamic("vertical")(vertical)
    __obj.asInstanceOf[Anon_Horizontal]
  }
}

