package typings.googleapis.buildSrcApisSheetsV4Mod.sheets_v4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The borders of the cell.
  */
@js.native
trait Schema$Borders extends js.Object {
  /**
    * The bottom border of the cell.
    */
  var bottom: js.UndefOr[Schema$Border] = js.native
  /**
    * The left border of the cell.
    */
  var left: js.UndefOr[Schema$Border] = js.native
  /**
    * The right border of the cell.
    */
  var right: js.UndefOr[Schema$Border] = js.native
  /**
    * The top border of the cell.
    */
  var top: js.UndefOr[Schema$Border] = js.native
}

object Schema$Borders {
  @scala.inline
  def apply(
    bottom: Schema$Border = null,
    left: Schema$Border = null,
    right: Schema$Border = null,
    top: Schema$Border = null
  ): Schema$Borders = {
    val __obj = js.Dynamic.literal()
    if (bottom != null) __obj.updateDynamic("bottom")(bottom.asInstanceOf[js.Any])
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (right != null) __obj.updateDynamic("right")(right.asInstanceOf[js.Any])
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Borders]
  }
}

