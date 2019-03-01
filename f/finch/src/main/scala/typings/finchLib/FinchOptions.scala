package typings
package finchLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FinchOptions extends js.Object {
  var CoerceParameterTypes: js.UndefOr[scala.Boolean] = js.undefined
}

object FinchOptions {
  @scala.inline
  def apply(CoerceParameterTypes: js.UndefOr[scala.Boolean] = js.undefined): FinchOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(CoerceParameterTypes)) __obj.updateDynamic("CoerceParameterTypes")(CoerceParameterTypes)
    __obj.asInstanceOf[FinchOptions]
  }
}

