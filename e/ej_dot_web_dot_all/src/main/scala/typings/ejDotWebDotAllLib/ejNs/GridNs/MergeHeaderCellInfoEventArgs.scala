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

