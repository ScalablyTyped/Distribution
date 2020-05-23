package typings.devextreme.anon

import typings.devextreme.devextremeStrings.ellipsis
import typings.devextreme.devextremeStrings.hide
import typings.devextreme.devextremeStrings.none
import typings.devextreme.mod.DevExpress.viz.dxSankeyNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HorizontalOffset extends js.Object {
  var border: js.UndefOr[ColorVisible] = js.undefined
  var customizeText: js.UndefOr[js.Function1[/* itemInfo */ dxSankeyNode, String]] = js.undefined
  var font: js.UndefOr[typings.devextreme.mod.DevExpress.viz.Font] = js.undefined
  var horizontalOffset: js.UndefOr[Double] = js.undefined
  var overlappingBehavior: js.UndefOr[ellipsis | hide | none] = js.undefined
  var shadow: js.UndefOr[Blur] = js.undefined
  var useNodeColors: js.UndefOr[Boolean] = js.undefined
  var verticalOffset: js.UndefOr[Double] = js.undefined
  var visible: js.UndefOr[Boolean] = js.undefined
}

object HorizontalOffset {
  @scala.inline
  def apply(
    border: ColorVisible = null,
    customizeText: /* itemInfo */ dxSankeyNode => String = null,
    font: typings.devextreme.mod.DevExpress.viz.Font = null,
    horizontalOffset: js.UndefOr[Double] = js.undefined,
    overlappingBehavior: ellipsis | hide | none = null,
    shadow: Blur = null,
    useNodeColors: js.UndefOr[Boolean] = js.undefined,
    verticalOffset: js.UndefOr[Double] = js.undefined,
    visible: js.UndefOr[Boolean] = js.undefined
  ): HorizontalOffset = {
    val __obj = js.Dynamic.literal()
    if (border != null) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    if (customizeText != null) __obj.updateDynamic("customizeText")(js.Any.fromFunction1(customizeText))
    if (font != null) __obj.updateDynamic("font")(font.asInstanceOf[js.Any])
    if (!js.isUndefined(horizontalOffset)) __obj.updateDynamic("horizontalOffset")(horizontalOffset.get.asInstanceOf[js.Any])
    if (overlappingBehavior != null) __obj.updateDynamic("overlappingBehavior")(overlappingBehavior.asInstanceOf[js.Any])
    if (shadow != null) __obj.updateDynamic("shadow")(shadow.asInstanceOf[js.Any])
    if (!js.isUndefined(useNodeColors)) __obj.updateDynamic("useNodeColors")(useNodeColors.get.asInstanceOf[js.Any])
    if (!js.isUndefined(verticalOffset)) __obj.updateDynamic("verticalOffset")(verticalOffset.get.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[HorizontalOffset]
  }
}

