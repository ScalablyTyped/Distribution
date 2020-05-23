package typings.ejWebAll.ej.Spreadsheet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RangeOptions extends js.Object {
  /** Pass the datasource object values as settings
    */
  var dataSource: js.UndefOr[js.Any] = js.undefined
  /** Pass the showheader condition as settings
    */
  var showHeader: js.UndefOr[Boolean] = js.undefined
  /** Pass the startcell values as settings
    */
  var startCell: js.UndefOr[String] = js.undefined
}

object RangeOptions {
  @scala.inline
  def apply(
    dataSource: js.Any = null,
    showHeader: js.UndefOr[Boolean] = js.undefined,
    startCell: String = null
  ): RangeOptions = {
    val __obj = js.Dynamic.literal()
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource.asInstanceOf[js.Any])
    if (!js.isUndefined(showHeader)) __obj.updateDynamic("showHeader")(showHeader.get.asInstanceOf[js.Any])
    if (startCell != null) __obj.updateDynamic("startCell")(startCell.asInstanceOf[js.Any])
    __obj.asInstanceOf[RangeOptions]
  }
}

