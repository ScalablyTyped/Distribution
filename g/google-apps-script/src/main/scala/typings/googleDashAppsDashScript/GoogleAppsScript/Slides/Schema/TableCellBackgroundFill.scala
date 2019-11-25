package typings.googleDashAppsDashScript.GoogleAppsScript.Slides.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableCellBackgroundFill extends js.Object {
  var propertyState: js.UndefOr[String] = js.undefined
  var solidFill: js.UndefOr[typings.googleDashAppsDashScript.GoogleAppsScript.Slides.Schema.SolidFill] = js.undefined
}

object TableCellBackgroundFill {
  @scala.inline
  def apply(
    propertyState: String = null,
    solidFill: typings.googleDashAppsDashScript.GoogleAppsScript.Slides.Schema.SolidFill = null
  ): TableCellBackgroundFill = {
    val __obj = js.Dynamic.literal()
    if (propertyState != null) __obj.updateDynamic("propertyState")(propertyState.asInstanceOf[js.Any])
    if (solidFill != null) __obj.updateDynamic("solidFill")(solidFill.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableCellBackgroundFill]
  }
}

