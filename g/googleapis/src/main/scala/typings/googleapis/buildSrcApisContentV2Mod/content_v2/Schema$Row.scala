package typings.googleapis.buildSrcApisContentV2Mod.content_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$Row extends js.Object {
  /**
    * The list of cells that constitute the row. Must have the same length as
    * columnHeaders for two-dimensional tables, a length of 1 for
    * one-dimensional tables. Required.
    */
  var cells: js.UndefOr[js.Array[Schema$Value]] = js.native
}

object Schema$Row {
  @scala.inline
  def apply(cells: js.Array[Schema$Value] = null): Schema$Row = {
    val __obj = js.Dynamic.literal()
    if (cells != null) __obj.updateDynamic("cells")(cells.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Row]
  }
}

