package typings.ejWebAll.ej.Spreadsheet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SheetsRowsCellsComment extends js.Object {
  /** Get or sets the value that indicates whether to show or hide comments in Spreadsheet.
    * @Default {false}
    */
  var isVisible: js.UndefOr[Boolean] = js.undefined
  /** Specifies the value for the comment in Spreadsheet.
    */
  var value: js.UndefOr[String] = js.undefined
}

object SheetsRowsCellsComment {
  @scala.inline
  def apply(isVisible: js.UndefOr[Boolean] = js.undefined, value: String = null): SheetsRowsCellsComment = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(isVisible)) __obj.updateDynamic("isVisible")(isVisible.get.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SheetsRowsCellsComment]
  }
}

