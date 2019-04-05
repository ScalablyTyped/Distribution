package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InsertTextRequest extends js.Object {
  var cellLocation: js.UndefOr[TableCellLocation] = js.undefined
  var insertionIndex: js.UndefOr[scala.Double] = js.undefined
  var objectId: js.UndefOr[java.lang.String] = js.undefined
  var text: js.UndefOr[java.lang.String] = js.undefined
}

object InsertTextRequest {
  @scala.inline
  def apply(
    cellLocation: TableCellLocation = null,
    insertionIndex: scala.Int | scala.Double = null,
    objectId: java.lang.String = null,
    text: java.lang.String = null
  ): InsertTextRequest = {
    val __obj = js.Dynamic.literal()
    if (cellLocation != null) __obj.updateDynamic("cellLocation")(cellLocation)
    if (insertionIndex != null) __obj.updateDynamic("insertionIndex")(insertionIndex.asInstanceOf[js.Any])
    if (objectId != null) __obj.updateDynamic("objectId")(objectId)
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[InsertTextRequest]
  }
}

