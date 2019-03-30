package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Groupssettings_v1 extends js.Object {
  var Groups: js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.GroupssettingsUnderscoreV1Ns.CollectionNs.GroupsCollection
  ] = js.undefined
  // Create a new instance of Groups
  def newGroups(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.GroupssettingsUnderscoreV1Ns.SchemaNs.Groups
}

object Groupssettings_v1 {
  @scala.inline
  def apply(
    newGroups: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.GroupssettingsUnderscoreV1Ns.SchemaNs.Groups,
    Groups: googleDashAppsDashScriptLib.GoogleAppsScriptNs.GroupssettingsUnderscoreV1Ns.CollectionNs.GroupsCollection = null
  ): Groupssettings_v1 = {
    val __obj = js.Dynamic.literal(newGroups = js.Any.fromFunction0(newGroups))
    if (Groups != null) __obj.updateDynamic("Groups")(Groups)
    __obj.asInstanceOf[Groupssettings_v1]
  }
}

