package typings.gitana.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("gitana", "Domain")
@js.native
class Domain protected () extends StObject {
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
object Domain {
  
  /* static member */
  @JSImport("gitana", "Domain.extend")
  @js.native
  def extend(_instance: js.Any, _static: js.Any, args: js.Any*): js.Any = js.native
  
  /* static member */
  @JSImport("gitana", "Domain.forEach")
  @js.native
  def forEach(`object`: js.Any, block: js.Any, context: js.Any): Unit = js.native
  
  /* static member */
  @JSImport("gitana", "Domain.implement")
  @js.native
  def implement(args: js.Any*): js.Any = js.native
  
  /* static member */
  @JSImport("gitana", "Domain.toString")
  @js.native
  def toString_(): js.Any = js.native
  
  /* static member */
  @JSImport("gitana", "Domain.valueOf")
  @js.native
  def valueOf_(`type`: js.Any): js.Any = js.native
}
