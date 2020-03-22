package typings.devextreme

import typings.devextreme.devextremeStrings.buttonClick
import typings.devextreme.devextremeStrings.rowClick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAllowCollapsing extends js.Object {
  var allowCollapsing: js.UndefOr[Boolean] = js.undefined
  var autoExpandAll: js.UndefOr[Boolean] = js.undefined
  var contextMenuEnabled: js.UndefOr[Boolean] = js.undefined
  var expandMode: js.UndefOr[buttonClick | rowClick] = js.undefined
  var texts: js.UndefOr[AnonGroupByThisColumn] = js.undefined
}

object AnonAllowCollapsing {
  @scala.inline
  def apply(
    allowCollapsing: js.UndefOr[Boolean] = js.undefined,
    autoExpandAll: js.UndefOr[Boolean] = js.undefined,
    contextMenuEnabled: js.UndefOr[Boolean] = js.undefined,
    expandMode: buttonClick | rowClick = null,
    texts: AnonGroupByThisColumn = null
  ): AnonAllowCollapsing = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowCollapsing)) __obj.updateDynamic("allowCollapsing")(allowCollapsing.asInstanceOf[js.Any])
    if (!js.isUndefined(autoExpandAll)) __obj.updateDynamic("autoExpandAll")(autoExpandAll.asInstanceOf[js.Any])
    if (!js.isUndefined(contextMenuEnabled)) __obj.updateDynamic("contextMenuEnabled")(contextMenuEnabled.asInstanceOf[js.Any])
    if (expandMode != null) __obj.updateDynamic("expandMode")(expandMode.asInstanceOf[js.Any])
    if (texts != null) __obj.updateDynamic("texts")(texts.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAllowCollapsing]
  }
}

