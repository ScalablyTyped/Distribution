package typings.googleAppsScript.GoogleAppsScript.Groups

import typings.googleAppsScript.GoogleAppsScript.Base.User
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A group object whose members and those members' roles within the group can be queried.
  *
  * Here's an example which shows the members of a group. Before running it, replace the email
  * address of the group with that of one on your domain.
  *
  *     function listGroupMembers() {
  *       var group = GroupsApp.getGroupByEmail("example@googlegroups.com");
  *       var str = group.getEmail() + ': ';
  *       var users = group.getUsers();
  *       for (var i = 0; i < users.length; i++) {
  *         var user = users[i];
  *         str = str + user.getEmail() + ", ";
  *       }
  *       Logger.log(str);
  *     }
  */
@js.native
trait Group extends js.Object {
  def getEmail(): String = js.native
  def getGroups(): js.Array[Group] = js.native
  def getRole(email: String): Role = js.native
  def getRole(user: User): Role = js.native
  def getRoles(users: js.Array[User]): js.Array[Role] = js.native
  def getUsers(): js.Array[User] = js.native
  def hasGroup(email: String): Boolean = js.native
  def hasGroup(group: Group): Boolean = js.native
  def hasUser(email: String): Boolean = js.native
  def hasUser(user: User): Boolean = js.native
}

