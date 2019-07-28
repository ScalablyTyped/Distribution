package typings.googleDashAppsDashScript.GoogleAppsScriptNs.AdminDirectoryNs.CollectionNs

import typings.googleDashAppsDashScript.GoogleAppsScriptNs.AdminDirectoryNs.CollectionNs.ResourcesNs.BuildingsCollection
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.AdminDirectoryNs.CollectionNs.ResourcesNs.CalendarsCollection
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.AdminDirectoryNs.CollectionNs.ResourcesNs.FeaturesCollection
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
    if (Buildings != null) __obj.updateDynamic("Buildings")(Buildings)
    if (Calendars != null) __obj.updateDynamic("Calendars")(Calendars)
    if (Features != null) __obj.updateDynamic("Features")(Features)
    __obj.asInstanceOf[ResourcesCollection]
  }
}

