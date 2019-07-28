package typings.googleDashAppsDashScript.GoogleAppsScriptNs.SlidesNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteTextRequest extends js.Object {
  var cellLocation: js.UndefOr[TableCellLocation] = js.undefined
  var objectId: js.UndefOr[String] = js.undefined
  var textRange: js.UndefOr[Range] = js.undefined
}

object DeleteTextRequest {
  @scala.inline
  def apply(cellLocation: TableCellLocation = null, objectId: String = null, textRange: Range = null): DeleteTextRequest = {
    val __obj = js.Dynamic.literal()
    if (cellLocation != null) __obj.updateDynamic("cellLocation")(cellLocation)
    if (objectId != null) __obj.updateDynamic("objectId")(objectId)
    if (textRange != null) __obj.updateDynamic("textRange")(textRange)
    __obj.asInstanceOf[DeleteTextRequest]
  }
}

