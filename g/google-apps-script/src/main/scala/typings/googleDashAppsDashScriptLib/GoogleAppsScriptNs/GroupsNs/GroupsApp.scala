package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.GroupsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GroupsApp extends js.Object {
  var Role: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google-apps-script.GoogleAppsScript.Groups.Role */ js.Any
  def getGroupByEmail(email: java.lang.String): Group
  def getGroups(): js.Array[Group]
}

