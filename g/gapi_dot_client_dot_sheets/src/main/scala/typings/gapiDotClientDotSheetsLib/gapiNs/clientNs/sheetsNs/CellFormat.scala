package typings
package gapiDotClientDotSheetsLib.gapiNs.clientNs.sheetsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CellFormat extends js.Object {
  /** The background color of the cell. */
  var backgroundColor: js.UndefOr[Color] = js.undefined
  /** The borders of the cell. */
  var borders: js.UndefOr[Borders] = js.undefined
  /** The horizontal alignment of the value in the cell. */
  var horizontalAlignment: js.UndefOr[java.lang.String] = js.undefined
  /** How a hyperlink, if it exists, should be displayed in the cell. */
  var hyperlinkDisplayType: js.UndefOr[java.lang.String] = js.undefined
  /** A format describing how number values should be represented to the user. */
  var numberFormat: js.UndefOr[NumberFormat] = js.undefined
  /** The padding of the cell. */
  var padding: js.UndefOr[Padding] = js.undefined
  /** The direction of the text in the cell. */
  var textDirection: js.UndefOr[java.lang.String] = js.undefined
  /** The format of the text in the cell (unless overridden by a format run). */
  var textFormat: js.UndefOr[TextFormat] = js.undefined
  /** The rotation applied to text in a cell */
  var textRotation: js.UndefOr[TextRotation] = js.undefined
  /** The vertical alignment of the value in the cell. */
  var verticalAlignment: js.UndefOr[java.lang.String] = js.undefined
  /** The wrap strategy for the value in the cell. */
  var wrapStrategy: js.UndefOr[java.lang.String] = js.undefined
}

