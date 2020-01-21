package typings.ejWebAll.ej.PivotGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HeaderSettings extends js.Object {
  /** Allows you to enable/disable the column header names in the PivotGrid control.
    * @Default {false}
    */
  var showColumnItems: js.UndefOr[Boolean] = js.undefined
  /** Allows you to enable/disable the row header names in the PivotGrid control.
    * @Default {false}
    */
  var showRowItems: js.UndefOr[Boolean] = js.undefined
}

object HeaderSettings {
  @scala.inline
  def apply(
    showColumnItems: js.UndefOr[Boolean] = js.undefined,
    showRowItems: js.UndefOr[Boolean] = js.undefined
  ): HeaderSettings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(showColumnItems)) __obj.updateDynamic("showColumnItems")(showColumnItems.asInstanceOf[js.Any])
    if (!js.isUndefined(showRowItems)) __obj.updateDynamic("showRowItems")(showRowItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeaderSettings]
  }
}

