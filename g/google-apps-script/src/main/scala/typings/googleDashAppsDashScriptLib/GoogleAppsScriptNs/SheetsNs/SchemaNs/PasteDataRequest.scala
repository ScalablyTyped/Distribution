package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SheetsNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PasteDataRequest extends js.Object {
  var coordinate: js.UndefOr[GridCoordinate] = js.undefined
  var data: js.UndefOr[java.lang.String] = js.undefined
  var delimiter: js.UndefOr[java.lang.String] = js.undefined
  var html: js.UndefOr[scala.Boolean] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object PasteDataRequest {
  @scala.inline
  def apply(
    coordinate: GridCoordinate = null,
    data: java.lang.String = null,
    delimiter: java.lang.String = null,
    html: js.UndefOr[scala.Boolean] = js.undefined,
    `type`: java.lang.String = null
  ): PasteDataRequest = {
    val __obj = js.Dynamic.literal()
    if (coordinate != null) __obj.updateDynamic("coordinate")(coordinate)
    if (data != null) __obj.updateDynamic("data")(data)
    if (delimiter != null) __obj.updateDynamic("delimiter")(delimiter)
    if (!js.isUndefined(html)) __obj.updateDynamic("html")(html)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[PasteDataRequest]
  }
}

