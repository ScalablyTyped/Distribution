package typings.distributionsPoissonQuantile

import typings.distributionsPoissonQuantile.distributionsPoissonQuantileStrings.float64
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDtypeFloat64 extends js.Object {
  var dtype: js.UndefOr[float64] = js.undefined
}

object AnonDtypeFloat64 {
  @scala.inline
  def apply(dtype: float64 = null): AnonDtypeFloat64 = {
    val __obj = js.Dynamic.literal()
    if (dtype != null) __obj.updateDynamic("dtype")(dtype.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDtypeFloat64]
  }
}

