package typings.gapiDotClientDotSheets.gapiNs.clientNs.sheetsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TrimWhitespaceResponse extends js.Object {
  /** The number of cells that were trimmed of whitespace. */
  var cellsChangedCount: js.UndefOr[Double] = js.undefined
}

object TrimWhitespaceResponse {
  @scala.inline
  def apply(cellsChangedCount: Int | Double = null): TrimWhitespaceResponse = {
    val __obj = js.Dynamic.literal()
    if (cellsChangedCount != null) __obj.updateDynamic("cellsChangedCount")(cellsChangedCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrimWhitespaceResponse]
  }
}

