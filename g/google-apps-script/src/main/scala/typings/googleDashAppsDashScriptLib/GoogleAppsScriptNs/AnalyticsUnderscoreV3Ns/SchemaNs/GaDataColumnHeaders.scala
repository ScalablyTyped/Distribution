package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsUnderscoreV3Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GaDataColumnHeaders extends js.Object {
  var columnType: js.UndefOr[java.lang.String] = js.undefined
  var dataType: js.UndefOr[java.lang.String] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
}

object GaDataColumnHeaders {
  @scala.inline
  def apply(
    columnType: java.lang.String = null,
    dataType: java.lang.String = null,
    name: java.lang.String = null
  ): GaDataColumnHeaders = {
    val __obj = js.Dynamic.literal()
    if (columnType != null) __obj.updateDynamic("columnType")(columnType)
    if (dataType != null) __obj.updateDynamic("dataType")(dataType)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[GaDataColumnHeaders]
  }
}

