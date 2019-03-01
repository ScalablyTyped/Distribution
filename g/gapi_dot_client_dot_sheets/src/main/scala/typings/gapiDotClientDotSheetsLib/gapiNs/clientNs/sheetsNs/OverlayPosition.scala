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

object OverlayPosition {
  @scala.inline
  def apply(
    anchorCell: GridCoordinate = null,
    heightPixels: scala.Int | scala.Double = null,
    offsetXPixels: scala.Int | scala.Double = null,
    offsetYPixels: scala.Int | scala.Double = null,
    widthPixels: scala.Int | scala.Double = null
  ): OverlayPosition = {
    val __obj = js.Dynamic.literal()
    if (anchorCell != null) __obj.updateDynamic("anchorCell")(anchorCell)
    if (heightPixels != null) __obj.updateDynamic("heightPixels")(heightPixels.asInstanceOf[js.Any])
    if (offsetXPixels != null) __obj.updateDynamic("offsetXPixels")(offsetXPixels.asInstanceOf[js.Any])
    if (offsetYPixels != null) __obj.updateDynamic("offsetYPixels")(offsetYPixels.asInstanceOf[js.Any])
    if (widthPixels != null) __obj.updateDynamic("widthPixels")(widthPixels.asInstanceOf[js.Any])
    __obj.asInstanceOf[OverlayPosition]
  }
}

