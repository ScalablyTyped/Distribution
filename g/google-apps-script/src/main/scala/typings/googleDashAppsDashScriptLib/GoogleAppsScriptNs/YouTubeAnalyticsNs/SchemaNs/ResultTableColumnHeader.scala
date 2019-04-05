package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.YouTubeAnalyticsNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResultTableColumnHeader extends js.Object {
  var columnType: js.UndefOr[java.lang.String] = js.undefined
  var dataType: js.UndefOr[java.lang.String] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
}

object ResultTableColumnHeader {
  @scala.inline
  def apply(
    columnType: java.lang.String = null,
    dataType: java.lang.String = null,
    name: java.lang.String = null
  ): ResultTableColumnHeader = {
    val __obj = js.Dynamic.literal()
    if (columnType != null) __obj.updateDynamic("columnType")(columnType)
    if (dataType != null) __obj.updateDynamic("dataType")(dataType)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[ResultTableColumnHeader]
  }
}

