package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.GroupsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Group extends js.Object {
  def getEmail(): java.lang.String = js.native
  def getGroups(): js.Array[Group] = js.native
  def getRole(email: java.lang.String): Role = js.native
  def getRole(user: googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.User): Role = js.native
  def getUsers(): js.Array[googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.User] = js.native
  def hasGroup(email: java.lang.String): scala.Boolean = js.native
  def hasGroup(group: Group): scala.Boolean = js.native
  def hasUser(email: java.lang.String): scala.Boolean = js.native
  def hasUser(user: googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.User): scala.Boolean = js.native
}

