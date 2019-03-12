package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.GroupsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GroupsApp extends js.Object {
  var Role: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Role */ js.Any
  def getGroupByEmail(email: java.lang.String): Group
  def getGroups(): js.Array[Group]
}

object GroupsApp {
  @scala.inline
  def apply(
    Role: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Role */ js.Any,
    getGroupByEmail: java.lang.String => Group,
    getGroups: () => js.Array[Group]
  ): GroupsApp = {
    val __obj = js.Dynamic.literal(Role = Role, getGroupByEmail = js.Any.fromFunction1(getGroupByEmail), getGroups = js.Any.fromFunction0(getGroups))
  
    __obj.asInstanceOf[GroupsApp]
  }
}

