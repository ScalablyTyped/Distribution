package typings.googleAppsScript.GoogleAppsScript.AdminDirectory.Collection

import typings.googleAppsScript.GoogleAppsScript.AdminDirectory.Collection.Resources.BuildingsCollection
import typings.googleAppsScript.GoogleAppsScript.AdminDirectory.Collection.Resources.CalendarsCollection
import typings.googleAppsScript.GoogleAppsScript.AdminDirectory.Collection.Resources.FeaturesCollection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResourcesCollection extends js.Object {
  var Buildings: js.UndefOr[BuildingsCollection] = js.undefined
  var Calendars: js.UndefOr[CalendarsCollection] = js.undefined
  var Features: js.UndefOr[FeaturesCollection] = js.undefined
}

object ResourcesCollection {
  @scala.inline
  def apply(
    Buildings: BuildingsCollection = null,
    Calendars: CalendarsCollection = null,
    Features: FeaturesCollection = null
  ): ResourcesCollection = {
    val __obj = js.Dynamic.literal()
    if (Buildings != null) __obj.updateDynamic("Buildings")(Buildings.asInstanceOf[js.Any])
    if (Calendars != null) __obj.updateDynamic("Calendars")(Calendars.asInstanceOf[js.Any])
    if (Features != null) __obj.updateDynamic("Features")(Features.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourcesCollection]
  }
}

