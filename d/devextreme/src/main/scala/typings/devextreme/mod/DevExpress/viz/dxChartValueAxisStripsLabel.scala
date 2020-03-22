package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.devextremeStrings.bottom
import typings.devextreme.devextremeStrings.center
import typings.devextreme.devextremeStrings.left
import typings.devextreme.devextremeStrings.right
import typings.devextreme.devextremeStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxChartValueAxisStripsLabel extends dxChartCommonAxisSettingsStripStyleLabel {
  /** Specifies the text of the strip label. */
  var text: js.UndefOr[String] = js.undefined
}

object dxChartValueAxisStripsLabel {
  @scala.inline
  def apply(
    font: Font = null,
    horizontalAlignment: center | left | right = null,
    text: String = null,
    verticalAlignment: bottom | center | top = null
  ): dxChartValueAxisStripsLabel = {
    val __obj = js.Dynamic.literal()
    if (font != null) __obj.updateDynamic("font")(font.asInstanceOf[js.Any])
    if (horizontalAlignment != null) __obj.updateDynamic("horizontalAlignment")(horizontalAlignment.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (verticalAlignment != null) __obj.updateDynamic("verticalAlignment")(verticalAlignment.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxChartValueAxisStripsLabel]
  }
}

