package typings.googleDashAppsDashScript.GoogleAppsScript.Analyticsreporting.Schema

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
    if (eventAction != null) __obj.updateDynamic("eventAction")(eventAction.asInstanceOf[js.Any])
    if (eventCategory != null) __obj.updateDynamic("eventCategory")(eventCategory.asInstanceOf[js.Any])
    if (eventCount != null) __obj.updateDynamic("eventCount")(eventCount.asInstanceOf[js.Any])
    if (eventLabel != null) __obj.updateDynamic("eventLabel")(eventLabel.asInstanceOf[js.Any])
    if (eventValue != null) __obj.updateDynamic("eventValue")(eventValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventData]
  }
}

