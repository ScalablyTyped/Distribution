package typings.devextreme.anon

import typings.devextreme.devextremeStrings.hide
import typings.devextreme.devextremeStrings.none
import typings.devextreme.mod.DevExpress.ui.format
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OverlappingBehavior extends js.Object {
  var customizeText: js.UndefOr[js.Function1[/* scaleValue */ ValueValueText, String]] = js.undefined
  var font: js.UndefOr[typings.devextreme.mod.DevExpress.viz.Font] = js.undefined
  var format: js.UndefOr[typings.devextreme.mod.DevExpress.ui.format] = js.undefined
  var overlappingBehavior: js.UndefOr[hide | none] = js.undefined
  var topIndent: js.UndefOr[Double] = js.undefined
  var visible: js.UndefOr[Boolean] = js.undefined
}

object OverlappingBehavior {
  @scala.inline
  def apply(
    customizeText: /* scaleValue */ ValueValueText => String = null,
    font: typings.devextreme.mod.DevExpress.viz.Font = null,
    format: format = null,
    overlappingBehavior: hide | none = null,
    topIndent: js.UndefOr[Double] = js.undefined,
    visible: js.UndefOr[Boolean] = js.undefined
  ): OverlappingBehavior = {
    val __obj = js.Dynamic.literal()
    if (customizeText != null) __obj.updateDynamic("customizeText")(js.Any.fromFunction1(customizeText))
    if (font != null) __obj.updateDynamic("font")(font.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (overlappingBehavior != null) __obj.updateDynamic("overlappingBehavior")(overlappingBehavior.asInstanceOf[js.Any])
    if (!js.isUndefined(topIndent)) __obj.updateDynamic("topIndent")(topIndent.get.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[OverlappingBehavior]
  }
}

