package typings.devextreme

import typings.devextreme.devextremeStrings.bottom
import typings.devextreme.devextremeStrings.center
import typings.devextreme.devextremeStrings.left
import typings.devextreme.devextremeStrings.right
import typings.devextreme.devextremeStrings.top
import typings.devextreme.mod.DevExpress.viz.Font
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHorizontalAlignment extends js.Object {
  var font: js.UndefOr[Font] = js.undefined
  var horizontalAlignment: js.UndefOr[center | left | right] = js.undefined
  var margin: js.UndefOr[AnonBottom] = js.undefined
  var placeholderSize: js.UndefOr[Double] = js.undefined
  var subtitle: js.UndefOr[AnonFont | String] = js.undefined
  var text: js.UndefOr[String] = js.undefined
  var verticalAlignment: js.UndefOr[bottom | top] = js.undefined
}

object AnonHorizontalAlignment {
  @scala.inline
  def apply(
    font: Font = null,
    horizontalAlignment: center | left | right = null,
    margin: AnonBottom = null,
    placeholderSize: Int | Double = null,
    subtitle: AnonFont | String = null,
    text: String = null,
    verticalAlignment: bottom | top = null
  ): AnonHorizontalAlignment = {
    val __obj = js.Dynamic.literal()
    if (font != null) __obj.updateDynamic("font")(font.asInstanceOf[js.Any])
    if (horizontalAlignment != null) __obj.updateDynamic("horizontalAlignment")(horizontalAlignment.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (placeholderSize != null) __obj.updateDynamic("placeholderSize")(placeholderSize.asInstanceOf[js.Any])
    if (subtitle != null) __obj.updateDynamic("subtitle")(subtitle.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (verticalAlignment != null) __obj.updateDynamic("verticalAlignment")(verticalAlignment.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonHorizontalAlignment]
  }
}

