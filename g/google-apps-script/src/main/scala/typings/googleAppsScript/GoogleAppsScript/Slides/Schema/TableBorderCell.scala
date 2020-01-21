package typings.googleAppsScript.GoogleAppsScript.Slides.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableBorderCell extends js.Object {
  var location: js.UndefOr[TableCellLocation] = js.undefined
  var tableBorderProperties: js.UndefOr[TableBorderProperties] = js.undefined
}

object TableBorderCell {
  @scala.inline
  def apply(location: TableCellLocation = null, tableBorderProperties: TableBorderProperties = null): TableBorderCell = {
    val __obj = js.Dynamic.literal()
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (tableBorderProperties != null) __obj.updateDynamic("tableBorderProperties")(tableBorderProperties.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableBorderCell]
  }
}

