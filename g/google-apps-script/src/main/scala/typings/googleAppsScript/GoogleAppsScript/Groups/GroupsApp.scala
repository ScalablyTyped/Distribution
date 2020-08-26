package typings.googleAppsScript.GoogleAppsScript.Groups

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
@js.native
trait GroupsApp extends js.Object {
  var Role: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Role */ js.Any = js.native
  def getGroupByEmail(email: String): Group = js.native
  def getGroups(): js.Array[Group] = js.native
}

object GroupsApp {
  @scala.inline
  def apply(
    Role: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Role */ js.Any,
    getGroupByEmail: String => Group,
    getGroups: () => js.Array[Group]
  ): GroupsApp = {
    val __obj = js.Dynamic.literal(Role = Role.asInstanceOf[js.Any], getGroupByEmail = js.Any.fromFunction1(getGroupByEmail), getGroups = js.Any.fromFunction0(getGroups))
    __obj.asInstanceOf[GroupsApp]
  }
  @scala.inline
  implicit class GroupsAppOps[Self <: GroupsApp] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setRole(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Role */ js.Any): Self = this.set("Role", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetGroupByEmail(value: String => Group): Self = this.set("getGroupByEmail", js.Any.fromFunction1(value))
    @scala.inline
    def setGetGroups(value: () => js.Array[Group]): Self = this.set("getGroups", js.Any.fromFunction0(value))
  }
  
}

