package typings.distributionsPoissonQuantile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDtypeUndefined extends js.Object {
  var dtype: js.UndefOr[scala.Nothing] = js.undefined
}

object AnonDtypeUndefined {
  @scala.inline
  def apply(dtype: js.UndefOr[scala.Nothing] = js.undefined): AnonDtypeUndefined = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(dtype)) __obj.updateDynamic("dtype")(dtype.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDtypeUndefined]
  }
}

