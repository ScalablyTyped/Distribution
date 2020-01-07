package typings.googleapis.buildSrcApisSheetsV4Mod.sheets_v4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The location an object is overlaid on top of a grid.
  */
@js.native
trait Schema$OverlayPosition extends js.Object {
  /**
    * The cell the object is anchored to.
    */
  var anchorCell: js.UndefOr[Schema$GridCoordinate] = js.native
  /**
    * The height of the object, in pixels. Defaults to 371.
    */
  var heightPixels: js.UndefOr[Double] = js.native
  /**
    * The horizontal offset, in pixels, that the object is offset from the
    * anchor cell.
    */
  var offsetXPixels: js.UndefOr[Double] = js.native
  /**
    * The vertical offset, in pixels, that the object is offset from the anchor
    * cell.
    */
  var offsetYPixels: js.UndefOr[Double] = js.native
  /**
    * The width of the object, in pixels. Defaults to 600.
    */
  var widthPixels: js.UndefOr[Double] = js.native
}

object Schema$OverlayPosition {
  @scala.inline
  def apply(
    anchorCell: Schema$GridCoordinate = null,
    heightPixels: Int | Double = null,
    offsetXPixels: Int | Double = null,
    offsetYPixels: Int | Double = null,
    widthPixels: Int | Double = null
  ): Schema$OverlayPosition = {
    val __obj = js.Dynamic.literal()
    if (anchorCell != null) __obj.updateDynamic("anchorCell")(anchorCell.asInstanceOf[js.Any])
    if (heightPixels != null) __obj.updateDynamic("heightPixels")(heightPixels.asInstanceOf[js.Any])
    if (offsetXPixels != null) __obj.updateDynamic("offsetXPixels")(offsetXPixels.asInstanceOf[js.Any])
    if (offsetYPixels != null) __obj.updateDynamic("offsetYPixels")(offsetYPixels.asInstanceOf[js.Any])
    if (widthPixels != null) __obj.updateDynamic("widthPixels")(widthPixels.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$OverlayPosition]
  }
}

