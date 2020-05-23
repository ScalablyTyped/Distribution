package typings.devextreme.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AllowFieldDragging extends js.Object {
  var allowFieldDragging: js.UndefOr[Boolean] = js.undefined
  var showColumnFields: js.UndefOr[Boolean] = js.undefined
  var showDataFields: js.UndefOr[Boolean] = js.undefined
  var showFilterFields: js.UndefOr[Boolean] = js.undefined
  var showRowFields: js.UndefOr[Boolean] = js.undefined
  var texts: js.UndefOr[ColumnFieldArea] = js.undefined
  var visible: js.UndefOr[Boolean] = js.undefined
}

object AllowFieldDragging {
  @scala.inline
  def apply(
    allowFieldDragging: js.UndefOr[Boolean] = js.undefined,
    showColumnFields: js.UndefOr[Boolean] = js.undefined,
    showDataFields: js.UndefOr[Boolean] = js.undefined,
    showFilterFields: js.UndefOr[Boolean] = js.undefined,
    showRowFields: js.UndefOr[Boolean] = js.undefined,
    texts: ColumnFieldArea = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): AllowFieldDragging = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowFieldDragging)) __obj.updateDynamic("allowFieldDragging")(allowFieldDragging.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showColumnFields)) __obj.updateDynamic("showColumnFields")(showColumnFields.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showDataFields)) __obj.updateDynamic("showDataFields")(showDataFields.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showFilterFields)) __obj.updateDynamic("showFilterFields")(showFilterFields.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showRowFields)) __obj.updateDynamic("showRowFields")(showRowFields.get.asInstanceOf[js.Any])
    if (texts != null) __obj.updateDynamic("texts")(texts.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllowFieldDragging]
  }
}

