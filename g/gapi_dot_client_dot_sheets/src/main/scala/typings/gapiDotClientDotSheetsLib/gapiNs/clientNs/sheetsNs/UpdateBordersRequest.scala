package typings
package gapiDotClientDotSheetsLib.gapiNs.clientNs.sheetsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateBordersRequest extends js.Object {
  /** The border to put at the bottom of the range. */
  var bottom: js.UndefOr[Border] = js.undefined
  /** The horizontal border to put within the range. */
  var innerHorizontal: js.UndefOr[Border] = js.undefined
  /** The vertical border to put within the range. */
  var innerVertical: js.UndefOr[Border] = js.undefined
  /** The border to put at the left of the range. */
  var left: js.UndefOr[Border] = js.undefined
  /** The range whose borders should be updated. */
  var range: js.UndefOr[GridRange] = js.undefined
  /** The border to put at the right of the range. */
  var right: js.UndefOr[Border] = js.undefined
  /** The border to put at the top of the range. */
  var top: js.UndefOr[Border] = js.undefined
}

