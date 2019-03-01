package typings
package ejDotWebDotAllLib.ejNs.GridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MergeHeaderCellInfoEventArgs extends js.Object {
  /** Returns the column headers.
    */
  var columnHeaders: js.UndefOr[js.Any] = js.undefined
  /** Method to merge the header cells.
    */
  var headerCellMerge: js.UndefOr[
    js.Function2[/* startIndex */ scala.Double, /* count */ scala.Double, scala.Unit]
  ] = js.undefined
  /** Returns the grid model.
    */
  var model: js.UndefOr[js.Any] = js.undefined
}

object MergeHeaderCellInfoEventArgs {
  @scala.inline
  def apply(
    columnHeaders: js.Any = null,
    headerCellMerge: js.Function2[/* startIndex */ scala.Double, /* count */ scala.Double, scala.Unit] = null,
    model: js.Any = null
  ): MergeHeaderCellInfoEventArgs = {
    val __obj = js.Dynamic.literal()
    if (columnHeaders != null) __obj.updateDynamic("columnHeaders")(columnHeaders)
    if (headerCellMerge != null) __obj.updateDynamic("headerCellMerge")(headerCellMerge)
    if (model != null) __obj.updateDynamic("model")(model)
    __obj.asInstanceOf[MergeHeaderCellInfoEventArgs]
  }
}

