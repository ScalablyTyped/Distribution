package typings
package gapiDotClientDotContentLib.gapiNs.clientNs.contentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Table extends js.Object {
  /** Headers of the table's columns. Optional: if not set then the table has only one dimension. */
  var columnHeaders: js.UndefOr[Headers] = js.undefined
  /** Name of the table. Required for subtables, ignored for the main table. */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** Headers of the table's rows. Required. */
  var rowHeaders: js.UndefOr[Headers] = js.undefined
  /** The list of rows that constitute the table. Must have the same length as rowHeaders. Required. */
  var rows: js.UndefOr[js.Array[Row]] = js.undefined
}

