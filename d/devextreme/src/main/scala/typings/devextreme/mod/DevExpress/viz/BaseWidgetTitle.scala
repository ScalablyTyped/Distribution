package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.AnonBottom
import typings.devextreme.AnonFontOffset
import typings.devextreme.devextremeStrings.bottom
import typings.devextreme.devextremeStrings.breakWord
import typings.devextreme.devextremeStrings.center
import typings.devextreme.devextremeStrings.ellipsis
import typings.devextreme.devextremeStrings.hide
import typings.devextreme.devextremeStrings.left
import typings.devextreme.devextremeStrings.none
import typings.devextreme.devextremeStrings.normal
import typings.devextreme.devextremeStrings.right
import typings.devextreme.devextremeStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Configures the widget's title. */
trait BaseWidgetTitle extends js.Object {
  /** Specifies font options for the title. */
  var font: js.UndefOr[Font] = js.undefined
  /** Specifies the title's alignment in a horizontal direction. */
  var horizontalAlignment: js.UndefOr[center | left | right] = js.undefined
  /** Generates space around the title. */
  var margin: js.UndefOr[Double | AnonBottom] = js.undefined
  /** Reserves a pixel-measured space for the title. */
  var placeholderSize: js.UndefOr[Double] = js.undefined
  /** Configures the widget's subtitle. */
  var subtitle: js.UndefOr[AnonFontOffset | String] = js.undefined
  /** Specifies the title's text. */
  var text: js.UndefOr[String] = js.undefined
  /** Specifies what to do with the title when it overflows the allocated space after applying wordWrap: hide, truncate it and display an ellipsis, or do nothing. */
  var textOverflow: js.UndefOr[ellipsis | hide | none] = js.undefined
  /** Specifies the title's alignment in a vertical direction. */
  var verticalAlignment: js.UndefOr[bottom | top] = js.undefined
  /** Specifies how to wrap the title if it does not fit into a single line. */
  var wordWrap: js.UndefOr[normal | breakWord | none] = js.undefined
}

object BaseWidgetTitle {
  @scala.inline
  def apply(
    font: Font = null,
    horizontalAlignment: center | left | right = null,
    margin: Double | AnonBottom = null,
    placeholderSize: Int | Double = null,
    subtitle: AnonFontOffset | String = null,
    text: String = null,
    textOverflow: ellipsis | hide | none = null,
    verticalAlignment: bottom | top = null,
    wordWrap: normal | breakWord | none = null
  ): BaseWidgetTitle = {
    val __obj = js.Dynamic.literal()
    if (font != null) __obj.updateDynamic("font")(font.asInstanceOf[js.Any])
    if (horizontalAlignment != null) __obj.updateDynamic("horizontalAlignment")(horizontalAlignment.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (placeholderSize != null) __obj.updateDynamic("placeholderSize")(placeholderSize.asInstanceOf[js.Any])
    if (subtitle != null) __obj.updateDynamic("subtitle")(subtitle.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (textOverflow != null) __obj.updateDynamic("textOverflow")(textOverflow.asInstanceOf[js.Any])
    if (verticalAlignment != null) __obj.updateDynamic("verticalAlignment")(verticalAlignment.asInstanceOf[js.Any])
    if (wordWrap != null) __obj.updateDynamic("wordWrap")(wordWrap.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseWidgetTitle]
  }
}

