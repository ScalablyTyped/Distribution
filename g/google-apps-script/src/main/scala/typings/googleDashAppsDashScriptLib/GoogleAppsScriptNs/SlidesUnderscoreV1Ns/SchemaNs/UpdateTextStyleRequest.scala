package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesUnderscoreV1Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateTextStyleRequest extends js.Object {
  var cellLocation: js.UndefOr[TableCellLocation] = js.undefined
  var fields: js.UndefOr[java.lang.String] = js.undefined
  var objectId: js.UndefOr[java.lang.String] = js.undefined
  var style: js.UndefOr[TextStyle] = js.undefined
  var textRange: js.UndefOr[Range] = js.undefined
}

object UpdateTextStyleRequest {
  @scala.inline
  def apply(
    cellLocation: TableCellLocation = null,
    fields: java.lang.String = null,
    objectId: java.lang.String = null,
    style: TextStyle = null,
    textRange: Range = null
  ): UpdateTextStyleRequest = {
    val __obj = js.Dynamic.literal()
    if (cellLocation != null) __obj.updateDynamic("cellLocation")(cellLocation)
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (objectId != null) __obj.updateDynamic("objectId")(objectId)
    if (style != null) __obj.updateDynamic("style")(style)
    if (textRange != null) __obj.updateDynamic("textRange")(textRange)
    __obj.asInstanceOf[UpdateTextStyleRequest]
  }
}

