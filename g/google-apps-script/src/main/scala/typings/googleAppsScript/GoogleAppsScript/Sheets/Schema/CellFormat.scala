package typings.googleAppsScript.GoogleAppsScript.Sheets.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CellFormat extends js.Object {
  var backgroundColor: js.UndefOr[Color] = js.undefined
  var borders: js.UndefOr[Borders] = js.undefined
  var horizontalAlignment: js.UndefOr[String] = js.undefined
  var hyperlinkDisplayType: js.UndefOr[String] = js.undefined
  var numberFormat: js.UndefOr[NumberFormat] = js.undefined
  var padding: js.UndefOr[Padding] = js.undefined
  var textDirection: js.UndefOr[String] = js.undefined
  var textFormat: js.UndefOr[TextFormat] = js.undefined
  var textRotation: js.UndefOr[TextRotation] = js.undefined
  var verticalAlignment: js.UndefOr[String] = js.undefined
  var wrapStrategy: js.UndefOr[String] = js.undefined
}

object CellFormat {
  @scala.inline
  def apply(
    backgroundColor: Color = null,
    borders: Borders = null,
    horizontalAlignment: String = null,
    hyperlinkDisplayType: String = null,
    numberFormat: NumberFormat = null,
    padding: Padding = null,
    textDirection: String = null,
    textFormat: TextFormat = null,
    textRotation: TextRotation = null,
    verticalAlignment: String = null,
    wrapStrategy: String = null
  ): CellFormat = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (borders != null) __obj.updateDynamic("borders")(borders.asInstanceOf[js.Any])
    if (horizontalAlignment != null) __obj.updateDynamic("horizontalAlignment")(horizontalAlignment.asInstanceOf[js.Any])
    if (hyperlinkDisplayType != null) __obj.updateDynamic("hyperlinkDisplayType")(hyperlinkDisplayType.asInstanceOf[js.Any])
    if (numberFormat != null) __obj.updateDynamic("numberFormat")(numberFormat.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (textDirection != null) __obj.updateDynamic("textDirection")(textDirection.asInstanceOf[js.Any])
    if (textFormat != null) __obj.updateDynamic("textFormat")(textFormat.asInstanceOf[js.Any])
    if (textRotation != null) __obj.updateDynamic("textRotation")(textRotation.asInstanceOf[js.Any])
    if (verticalAlignment != null) __obj.updateDynamic("verticalAlignment")(verticalAlignment.asInstanceOf[js.Any])
    if (wrapStrategy != null) __obj.updateDynamic("wrapStrategy")(wrapStrategy.asInstanceOf[js.Any])
    __obj.asInstanceOf[CellFormat]
  }
}

