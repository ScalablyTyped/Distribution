package typings.googleDashAppsDashScript.GoogleAppsScript.Slides.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableCellProperties extends js.Object {
  var contentAlignment: js.UndefOr[String] = js.undefined
  var tableCellBackgroundFill: js.UndefOr[TableCellBackgroundFill] = js.undefined
}

object TableCellProperties {
  @scala.inline
  def apply(contentAlignment: String = null, tableCellBackgroundFill: TableCellBackgroundFill = null): TableCellProperties = {
    val __obj = js.Dynamic.literal()
    if (contentAlignment != null) __obj.updateDynamic("contentAlignment")(contentAlignment.asInstanceOf[js.Any])
    if (tableCellBackgroundFill != null) __obj.updateDynamic("tableCellBackgroundFill")(tableCellBackgroundFill.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableCellProperties]
  }
}

