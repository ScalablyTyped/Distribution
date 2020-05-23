package typings.gitana.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitana", "Domain")
@js.native
class Domain protected () extends js.Object {
  def this(platform: js.Any, `object`: js.Any) = this()
  def addMember(group: js.Any, principal: js.Any): js.Any = js.native
  def base(): Unit = js.native
  def checkGroupMemberships(checks: js.Any, callback: js.Any): js.Any = js.native
  def checkPrincipalAuthorities(checks: js.Any, callback: js.Any): js.Any = js.native
  def checkPrincipalPermissions(checks: js.Any, callback: js.Any): js.Any = js.native
  def createGroup(`object`: js.Any): js.Any = js.native
  def createPrincipal(`object`: js.Any): js.Any = js.native
  def createUser(`object`: js.Any): js.Any = js.native
  def getType(): js.Any = js.native
  def getUri(): js.Any = js.native
  def listGroups(pagination: js.Any): js.Any = js.native
  def listMembers(group: js.Any, filter: js.Any, pagination: js.Any, indirect: js.Any): js.Any = js.native
  def listPrincipals(pagination: js.Any, options: js.Any): js.Any = js.native
  def listUsers(pagination: js.Any): js.Any = js.native
  def queryGroups(query: js.Any, pagination: js.Any): js.Any = js.native
  def queryPrincipals(query: js.Any, pagination: js.Any, options: js.Any): js.Any = js.native
  def queryUsers(query: js.Any, pagination: js.Any): js.Any = js.native
  def readPrincipal(principalId: js.Any, options: js.Any): js.Any = js.native
  def removeMember(group: js.Any, principal: js.Any): js.Any = js.native
}

/* static members */
@JSImport("gitana", "Domain")
@js.native
object Domain extends js.Object {
  def extend(_instance: js.Any, _static: js.Any, args: js.Any*): js.Any = js.native
  def forEach(`object`: js.Any, block: js.Any, context: js.Any): Unit = js.native
  def implement(args: js.Any*): js.Any = js.native
  def valueOf(`type`: js.Any): js.Any = js.native
}

