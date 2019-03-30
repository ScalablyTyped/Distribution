package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SheetsUnderscoreV4Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DuplicateSheetResponse extends js.Object {
  var properties: js.UndefOr[SheetProperties] = js.undefined
}

object DuplicateSheetResponse {
  @scala.inline
  def apply(properties: SheetProperties = null): DuplicateSheetResponse = {
    val __obj = js.Dynamic.literal()
    if (properties != null) __obj.updateDynamic("properties")(properties)
    __obj.asInstanceOf[DuplicateSheetResponse]
  }
}

