package typings.googleDashAppsDashScript.GoogleAppsScriptNs.GroupsNs

import typings.googleDashAppsDashScript.GoogleAppsScriptNs.BaseNs.User
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Group extends js.Object {
  def getEmail(): String = js.native
  def getGroups(): js.Array[Group] = js.native
  def getRole(email: String): Role = js.native
  def getRole(user: User): Role = js.native
  def getUsers(): js.Array[User] = js.native
  def hasGroup(email: String): Boolean = js.native
  def hasGroup(group: Group): Boolean = js.native
  def hasUser(email: String): Boolean = js.native
  def hasUser(user: User): Boolean = js.native
}

