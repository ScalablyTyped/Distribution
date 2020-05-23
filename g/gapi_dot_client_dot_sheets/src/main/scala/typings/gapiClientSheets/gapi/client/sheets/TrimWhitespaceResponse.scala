package typings.gapiClientSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TrimWhitespaceResponse extends js.Object {
  /** The number of cells that were trimmed of whitespace. */
  var cellsChangedCount: js.UndefOr[Double] = js.undefined
}

object TrimWhitespaceResponse {
  @scala.inline
  def apply(cellsChangedCount: js.UndefOr[Double] = js.undefined): TrimWhitespaceResponse = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cellsChangedCount)) __obj.updateDynamic("cellsChangedCount")(cellsChangedCount.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrimWhitespaceResponse]
  }
}

