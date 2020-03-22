package typings.devextreme

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAllowFieldDragging extends js.Object {
  var allowFieldDragging: js.UndefOr[Boolean] = js.undefined
  var showColumnFields: js.UndefOr[Boolean] = js.undefined
  var showDataFields: js.UndefOr[Boolean] = js.undefined
  var showFilterFields: js.UndefOr[Boolean] = js.undefined
  var showRowFields: js.UndefOr[Boolean] = js.undefined
  var texts: js.UndefOr[AnonColumnFieldArea] = js.undefined
  var visible: js.UndefOr[Boolean] = js.undefined
}

object AnonAllowFieldDragging {
  @scala.inline
  def apply(
    allowFieldDragging: js.UndefOr[Boolean] = js.undefined,
    showColumnFields: js.UndefOr[Boolean] = js.undefined,
    showDataFields: js.UndefOr[Boolean] = js.undefined,
    showFilterFields: js.UndefOr[Boolean] = js.undefined,
    showRowFields: js.UndefOr[Boolean] = js.undefined,
    texts: AnonColumnFieldArea = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): AnonAllowFieldDragging = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowFieldDragging)) __obj.updateDynamic("allowFieldDragging")(allowFieldDragging.asInstanceOf[js.Any])
    if (!js.isUndefined(showColumnFields)) __obj.updateDynamic("showColumnFields")(showColumnFields.asInstanceOf[js.Any])
    if (!js.isUndefined(showDataFields)) __obj.updateDynamic("showDataFields")(showDataFields.asInstanceOf[js.Any])
    if (!js.isUndefined(showFilterFields)) __obj.updateDynamic("showFilterFields")(showFilterFields.asInstanceOf[js.Any])
    if (!js.isUndefined(showRowFields)) __obj.updateDynamic("showRowFields")(showRowFields.asInstanceOf[js.Any])
    if (texts != null) __obj.updateDynamic("texts")(texts.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAllowFieldDragging]
  }
}

