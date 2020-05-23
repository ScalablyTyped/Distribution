package typings.ejWebAll.ej.datavisualization.RangeNavigator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValueAxisSettingsMajorGridLines extends js.Object {
  /** Toggles the visibility of major grid lines.
    * @Default {false}
    */
  var visible: js.UndefOr[Boolean] = js.undefined
}

object ValueAxisSettingsMajorGridLines {
  @scala.inline
  def apply(visible: js.UndefOr[Boolean] = js.undefined): ValueAxisSettingsMajorGridLines = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueAxisSettingsMajorGridLines]
  }
}

