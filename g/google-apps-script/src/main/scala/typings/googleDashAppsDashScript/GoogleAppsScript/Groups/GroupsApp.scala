package typings.googleDashAppsDashScript.GoogleAppsScript.Groups

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This class provides access to Google Groups information. It can be used to query information such
  * as a group's email address, or the list of groups in which the user is a direct member.
  *
  * Here's an example that shows how many groups the current user is a member of:
  *
  *     var groups = GroupsApp.getGroups();
  *     Logger.log('You belong to ' + groups.length + ' groups.');
  */
trait GroupsApp extends js.Object {
  var Role: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Role */ js.Any
  def getGroupByEmail(email: String): Group
  def getGroups(): js.Array[Group]
}

object GroupsApp {
  @scala.inline
  def apply(
    Role: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Role */ js.Any,
    getGroupByEmail: String => Group,
    getGroups: () => js.Array[Group]
  ): GroupsApp = {
    val __obj = js.Dynamic.literal(Role = Role, getGroupByEmail = js.Any.fromFunction1(getGroupByEmail), getGroups = js.Any.fromFunction0(getGroups))
  
    __obj.asInstanceOf[GroupsApp]
  }
}

