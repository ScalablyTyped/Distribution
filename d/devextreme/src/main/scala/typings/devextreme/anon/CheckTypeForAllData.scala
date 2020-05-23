package typings.devextreme.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CheckTypeForAllData extends js.Object {
  var checkTypeForAllData: js.UndefOr[Boolean] = js.undefined
  var convertToAxisDataType: js.UndefOr[Boolean] = js.undefined
  var sortingMethod: js.UndefOr[Boolean | (js.Function2[/* a */ js.Any, /* b */ js.Any, Double])] = js.undefined
}

object CheckTypeForAllData {
  @scala.inline
  def apply(
    checkTypeForAllData: js.UndefOr[Boolean] = js.undefined,
    convertToAxisDataType: js.UndefOr[Boolean] = js.undefined,
    sortingMethod: Boolean | (js.Function2[/* a */ js.Any, /* b */ js.Any, Double]) = null
  ): CheckTypeForAllData = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(checkTypeForAllData)) __obj.updateDynamic("checkTypeForAllData")(checkTypeForAllData.get.asInstanceOf[js.Any])
    if (!js.isUndefined(convertToAxisDataType)) __obj.updateDynamic("convertToAxisDataType")(convertToAxisDataType.get.asInstanceOf[js.Any])
    if (sortingMethod != null) __obj.updateDynamic("sortingMethod")(sortingMethod.asInstanceOf[js.Any])
    __obj.asInstanceOf[CheckTypeForAllData]
  }
}

