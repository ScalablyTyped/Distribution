package typings.gitana.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
  
  @JSImport("gitana", "Domain")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @scala.inline
  def extend(_instance: js.Any, _static: js.Any, args: js.Any*): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(_instance.asInstanceOf[js.Any], _static.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  /* static member */
  @scala.inline
  def forEach(`object`: js.Any, block: js.Any, context: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("forEach")(`object`.asInstanceOf[js.Any], block.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /* static member */
  @scala.inline
  def implement(args: js.Any*): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("implement")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  /* static member */
  @scala.inline
  def toString_(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("toString")().asInstanceOf[js.Any]
  
  /* static member */
  @scala.inline
  def valueOf_(`type`: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("valueOf")(`type`.asInstanceOf[js.Any]).asInstanceOf[js.Any]
}
