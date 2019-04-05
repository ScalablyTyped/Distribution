package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminDirectoryNs.CollectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResourcesCollection extends js.Object {
  var Buildings: js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminDirectoryNs.CollectionNs.ResourcesNs.BuildingsCollection
  ] = js.undefined
  var Calendars: js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminDirectoryNs.CollectionNs.ResourcesNs.CalendarsCollection
  ] = js.undefined
  var Features: js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminDirectoryNs.CollectionNs.ResourcesNs.FeaturesCollection
  ] = js.undefined
}

object ResourcesCollection {
  @scala.inline
  def apply(
    Buildings: googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminDirectoryNs.CollectionNs.ResourcesNs.BuildingsCollection = null,
    Calendars: googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminDirectoryNs.CollectionNs.ResourcesNs.CalendarsCollection = null,
    Features: googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminDirectoryNs.CollectionNs.ResourcesNs.FeaturesCollection = null
  ): ResourcesCollection = {
    val __obj = js.Dynamic.literal()
    if (Buildings != null) __obj.updateDynamic("Buildings")(Buildings)
    if (Calendars != null) __obj.updateDynamic("Calendars")(Calendars)
    if (Features != null) __obj.updateDynamic("Features")(Features)
    __obj.asInstanceOf[ResourcesCollection]
  }
}

