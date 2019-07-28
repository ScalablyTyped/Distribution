package typings.googleDashAppsDashScript.GoogleAppsScriptNs.SlidesNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableCellBackgroundFill extends js.Object {
  var propertyState: js.UndefOr[String] = js.undefined
  var solidFill: js.UndefOr[typings.googleDashAppsDashScript.GoogleAppsScriptNs.SlidesNs.SchemaNs.SolidFill] = js.undefined
}

object TableCellBackgroundFill {
  @scala.inline
  def apply(
    propertyState: String = null,
    solidFill: typings.googleDashAppsDashScript.GoogleAppsScriptNs.SlidesNs.SchemaNs.SolidFill = null
  ): TableCellBackgroundFill = {
    val __obj = js.Dynamic.literal()
    if (propertyState != null) __obj.updateDynamic("propertyState")(propertyState)
    if (solidFill != null) __obj.updateDynamic("solidFill")(solidFill)
    __obj.asInstanceOf[TableCellBackgroundFill]
  }
}

