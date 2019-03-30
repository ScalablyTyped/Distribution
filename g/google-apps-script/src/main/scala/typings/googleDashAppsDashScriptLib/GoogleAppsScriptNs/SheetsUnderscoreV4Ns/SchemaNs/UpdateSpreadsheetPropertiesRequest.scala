package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SheetsUnderscoreV4Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateSpreadsheetPropertiesRequest extends js.Object {
  var fields: js.UndefOr[java.lang.String] = js.undefined
  var properties: js.UndefOr[SpreadsheetProperties] = js.undefined
}

object UpdateSpreadsheetPropertiesRequest {
  @scala.inline
  def apply(fields: java.lang.String = null, properties: SpreadsheetProperties = null): UpdateSpreadsheetPropertiesRequest = {
    val __obj = js.Dynamic.literal()
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (properties != null) __obj.updateDynamic("properties")(properties)
    __obj.asInstanceOf[UpdateSpreadsheetPropertiesRequest]
  }
}

