package typings.gapiClientSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CellFormat extends js.Object {
  /** The background color of the cell. */
  var backgroundColor: js.UndefOr[Color] = js.undefined
  /**
    * The background color of the cell.
    * If background_color is also set, this field takes precedence.
    */
  var backgroundColorStyle: js.UndefOr[ColorStyle] = js.undefined
  /** The borders of the cell. */
  var borders: js.UndefOr[Borders] = js.undefined
  /** The horizontal alignment of the value in the cell. */
  var horizontalAlignment: js.UndefOr[String] = js.undefined
  /** How a hyperlink, if it exists, should be displayed in the cell. */
  var hyperlinkDisplayType: js.UndefOr[String] = js.undefined
  /** A format describing how number values should be represented to the user. */
  var numberFormat: js.UndefOr[NumberFormat] = js.undefined
  /** The padding of the cell. */
  var padding: js.UndefOr[Padding] = js.undefined
  /** The direction of the text in the cell. */
  var textDirection: js.UndefOr[String] = js.undefined
  /** The format of the text in the cell (unless overridden by a format run). */
  var textFormat: js.UndefOr[TextFormat] = js.undefined
  /** The rotation applied to text in a cell */
  var textRotation: js.UndefOr[TextRotation] = js.undefined
  /** The vertical alignment of the value in the cell. */
  var verticalAlignment: js.UndefOr[String] = js.undefined
  /** The wrap strategy for the value in the cell. */
  var wrapStrategy: js.UndefOr[String] = js.undefined
}

object CellFormat {
  @scala.inline
  def apply(
    backgroundColor: Color = null,
    backgroundColorStyle: ColorStyle = null,
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
    if (backgroundColorStyle != null) __obj.updateDynamic("backgroundColorStyle")(backgroundColorStyle.asInstanceOf[js.Any])
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

