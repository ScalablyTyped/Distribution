package typings
package gapiDotClientDotSlidesLib.gapiNs.clientNs.slidesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableRow extends js.Object {
  /** Height of a row. */
  var rowHeight: js.UndefOr[Dimension] = js.undefined
  /**
    * Properties and contents of each cell.
    *
    * Cells that span multiple columns are represented only once with a
    * column_span greater
    * than 1. As a result, the length of this collection does not always match
    * the number of columns of the entire table.
    */
  var tableCells: js.UndefOr[js.Array[TableCell]] = js.undefined
}

