package typings
package gapiDotClientDotFusiontablesLib.gapiNs.clientNs.fusiontablesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnList extends js.Object {
  /** List of all requested columns. */
  var items: js.UndefOr[js.Array[Column]] = js.undefined
  /** The kind of item this is. For a column list, this is always fusiontables#columnList. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** Token used to access the next page of this result. No token is displayed if there are no more pages left. */
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
  /** Total number of columns for the table. */
  var totalItems: js.UndefOr[scala.Double] = js.undefined
}

