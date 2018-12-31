package typings
package gapiDotClientDotSheetsLib.gapiNs.clientNs.sheetsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OverlayPosition extends js.Object {
  /** The cell the object is anchored to. */
  var anchorCell: js.UndefOr[GridCoordinate] = js.undefined
  /** The height of the object, in pixels. Defaults to 371. */
  var heightPixels: js.UndefOr[scala.Double] = js.undefined
  /**
    * The horizontal offset, in pixels, that the object is offset
    * from the anchor cell.
    */
  var offsetXPixels: js.UndefOr[scala.Double] = js.undefined
  /**
    * The vertical offset, in pixels, that the object is offset
    * from the anchor cell.
    */
  var offsetYPixels: js.UndefOr[scala.Double] = js.undefined
  /** The width of the object, in pixels. Defaults to 600. */
  var widthPixels: js.UndefOr[scala.Double] = js.undefined
}

