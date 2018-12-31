package typings
package gapiDotClientDotSheetsLib.gapiNs.clientNs.sheetsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DimensionRange extends js.Object {
  /** The dimension of the span. */
  var dimension: js.UndefOr[java.lang.String] = js.undefined
  /** The end (exclusive) of the span, or not set if unbounded. */
  var endIndex: js.UndefOr[scala.Double] = js.undefined
  /** The sheet this span is on. */
  var sheetId: js.UndefOr[scala.Double] = js.undefined
  /** The start (inclusive) of the span, or not set if unbounded. */
  var startIndex: js.UndefOr[scala.Double] = js.undefined
}

