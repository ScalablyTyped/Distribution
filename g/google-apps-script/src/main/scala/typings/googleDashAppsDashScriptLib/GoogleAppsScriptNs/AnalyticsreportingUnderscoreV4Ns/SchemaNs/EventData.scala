package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsreportingUnderscoreV4Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventData extends js.Object {
  var eventAction: js.UndefOr[java.lang.String] = js.undefined
  var eventCategory: js.UndefOr[java.lang.String] = js.undefined
  var eventCount: js.UndefOr[java.lang.String] = js.undefined
  var eventLabel: js.UndefOr[java.lang.String] = js.undefined
  var eventValue: js.UndefOr[java.lang.String] = js.undefined
}

object EventData {
  @scala.inline
  def apply(
    eventAction: java.lang.String = null,
    eventCategory: java.lang.String = null,
    eventCount: java.lang.String = null,
    eventLabel: java.lang.String = null,
    eventValue: java.lang.String = null
  ): EventData = {
    val __obj = js.Dynamic.literal()
    if (eventAction != null) __obj.updateDynamic("eventAction")(eventAction)
    if (eventCategory != null) __obj.updateDynamic("eventCategory")(eventCategory)
    if (eventCount != null) __obj.updateDynamic("eventCount")(eventCount)
    if (eventLabel != null) __obj.updateDynamic("eventLabel")(eventLabel)
    if (eventValue != null) __obj.updateDynamic("eventValue")(eventValue)
    __obj.asInstanceOf[EventData]
  }
}

