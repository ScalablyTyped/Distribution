package typings.googleDashAppsDashScript.GoogleAppsScriptNs.AnalyticsreportingNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventData extends js.Object {
  var eventAction: js.UndefOr[String] = js.undefined
  var eventCategory: js.UndefOr[String] = js.undefined
  var eventCount: js.UndefOr[String] = js.undefined
  var eventLabel: js.UndefOr[String] = js.undefined
  var eventValue: js.UndefOr[String] = js.undefined
}

object EventData {
  @scala.inline
  def apply(
    eventAction: String = null,
    eventCategory: String = null,
    eventCount: String = null,
    eventLabel: String = null,
    eventValue: String = null
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

