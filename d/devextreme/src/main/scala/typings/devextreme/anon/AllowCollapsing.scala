package typings.devextreme.anon

import typings.devextreme.devextremeStrings.buttonClick
import typings.devextreme.devextremeStrings.rowClick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AllowCollapsing extends js.Object {
  var allowCollapsing: js.UndefOr[Boolean] = js.undefined
  var autoExpandAll: js.UndefOr[Boolean] = js.undefined
  var contextMenuEnabled: js.UndefOr[Boolean] = js.undefined
  var expandMode: js.UndefOr[buttonClick | rowClick] = js.undefined
  var texts: js.UndefOr[GroupByThisColumn] = js.undefined
}

object AllowCollapsing {
  @scala.inline
  def apply(
    allowCollapsing: js.UndefOr[Boolean] = js.undefined,
    autoExpandAll: js.UndefOr[Boolean] = js.undefined,
    contextMenuEnabled: js.UndefOr[Boolean] = js.undefined,
    expandMode: buttonClick | rowClick = null,
    texts: GroupByThisColumn = null
  ): AllowCollapsing = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowCollapsing)) __obj.updateDynamic("allowCollapsing")(allowCollapsing.get.asInstanceOf[js.Any])
    if (!js.isUndefined(autoExpandAll)) __obj.updateDynamic("autoExpandAll")(autoExpandAll.get.asInstanceOf[js.Any])
    if (!js.isUndefined(contextMenuEnabled)) __obj.updateDynamic("contextMenuEnabled")(contextMenuEnabled.get.asInstanceOf[js.Any])
    if (expandMode != null) __obj.updateDynamic("expandMode")(expandMode.asInstanceOf[js.Any])
    if (texts != null) __obj.updateDynamic("texts")(texts.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllowCollapsing]
  }
}

