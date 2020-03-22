package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.devextremeStrings.bottom
import typings.devextreme.devextremeStrings.center
import typings.devextreme.devextremeStrings.left
import typings.devextreme.devextremeStrings.right
import typings.devextreme.devextremeStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxChartCommonAxisSettingsStripStyleLabel extends js.Object {
  /** Specifies font options for strip labels. */
  var font: js.UndefOr[Font] = js.undefined
  /** Aligns strip labels in the horizontal direction. */
  var horizontalAlignment: js.UndefOr[center | left | right] = js.undefined
  /** Aligns strip labels in the vertical direction. */
  var verticalAlignment: js.UndefOr[bottom | center | top] = js.undefined
}

object dxChartCommonAxisSettingsStripStyleLabel {
  @scala.inline
  def apply(
    font: Font = null,
    horizontalAlignment: center | left | right = null,
    verticalAlignment: bottom | center | top = null
  ): dxChartCommonAxisSettingsStripStyleLabel = {
    val __obj = js.Dynamic.literal()
    if (font != null) __obj.updateDynamic("font")(font.asInstanceOf[js.Any])
    if (horizontalAlignment != null) __obj.updateDynamic("horizontalAlignment")(horizontalAlignment.asInstanceOf[js.Any])
    if (verticalAlignment != null) __obj.updateDynamic("verticalAlignment")(verticalAlignment.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxChartCommonAxisSettingsStripStyleLabel]
  }
}

