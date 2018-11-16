package typings
package gapiDotClientDotSheetsLib.gapiNs.clientNs.sheetsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait SortRangeRequest extends js.Object {
  /** The range to sort. */
  var range: js.UndefOr[GridRange] = js.undefined
  /**
               * The sort order per column. Later specifications are used when values
               * are equal in the earlier specifications.
               */
  var sortSpecs: js.UndefOr[js.Array[SortSpec]] = js.undefined
}

