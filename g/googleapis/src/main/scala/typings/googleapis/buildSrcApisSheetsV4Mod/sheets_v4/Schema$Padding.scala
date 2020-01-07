package typings.googleapis.buildSrcApisSheetsV4Mod.sheets_v4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The amount of padding around the cell, in pixels. When updating padding,
  * every field must be specified.
  */
@js.native
trait Schema$Padding extends js.Object {
  /**
    * The bottom padding of the cell.
    */
  var bottom: js.UndefOr[Double] = js.native
  /**
    * The left padding of the cell.
    */
  var left: js.UndefOr[Double] = js.native
  /**
    * The right padding of the cell.
    */
  var right: js.UndefOr[Double] = js.native
  /**
    * The top padding of the cell.
    */
  var top: js.UndefOr[Double] = js.native
}

object Schema$Padding {
  @scala.inline
  def apply(
    bottom: Int | Double = null,
    left: Int | Double = null,
    right: Int | Double = null,
    top: Int | Double = null
  ): Schema$Padding = {
    val __obj = js.Dynamic.literal()
    if (bottom != null) __obj.updateDynamic("bottom")(bottom.asInstanceOf[js.Any])
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (right != null) __obj.updateDynamic("right")(right.asInstanceOf[js.Any])
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Padding]
  }
}

