package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SheetsNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BasicChartAxis extends js.Object {
  var format: js.UndefOr[TextFormat] = js.undefined
  var position: js.UndefOr[java.lang.String] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
  var titleTextPosition: js.UndefOr[TextPosition] = js.undefined
}

object BasicChartAxis {
  @scala.inline
  def apply(
    format: TextFormat = null,
    position: java.lang.String = null,
    title: java.lang.String = null,
    titleTextPosition: TextPosition = null
  ): BasicChartAxis = {
    val __obj = js.Dynamic.literal()
    if (format != null) __obj.updateDynamic("format")(format)
    if (position != null) __obj.updateDynamic("position")(position)
    if (title != null) __obj.updateDynamic("title")(title)
    if (titleTextPosition != null) __obj.updateDynamic("titleTextPosition")(titleTextPosition)
    __obj.asInstanceOf[BasicChartAxis]
  }
}

