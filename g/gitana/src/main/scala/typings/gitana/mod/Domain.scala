package typings.gitana.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("gitana", "Domain")
@js.native
open class Domain protected () extends StObject {
  def this(platform: Any, `object`: Any) = this()
  
  def addMember(group: Any, principal: Any): Any = js.native
  
  def base(): Unit = js.native
  
  def checkGroupMemberships(checks: Any, callback: Any): Any = js.native
  
  def checkPrincipalAuthorities(checks: Any, callback: Any): Any = js.native
  
  def checkPrincipalPermissions(checks: Any, callback: Any): Any = js.native
  
  def createGroup(`object`: Any): Any = js.native
  
  def createPrincipal(`object`: Any): Any = js.native
  
  def createUser(`object`: Any): Any = js.native
  
  def getType(): Any = js.native
  
  def getUri(): Any = js.native
  
  def listGroups(pagination: Any): Any = js.native
  
  def listMembers(group: Any, filter: Any, pagination: Any, indirect: Any): Any = js.native
  
  def listPrincipals(pagination: Any, options: Any): Any = js.native
  
  def listUsers(pagination: Any): Any = js.native
  
  def queryGroups(query: Any, pagination: Any): Any = js.native
  
  def queryPrincipals(query: Any, pagination: Any, options: Any): Any = js.native
  
  def queryUsers(query: Any, pagination: Any): Any = js.native
  
  def readPrincipal(principalId: Any, options: Any): Any = js.native
  
  def removeMember(group: Any, principal: Any): Any = js.native
}
object Domain {
  
  @JSImport("gitana", "Domain")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def extend(_instance: Any, _static: Any, args: Any*): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")((scala.List(_instance.asInstanceOf[js.Any], _static.asInstanceOf[js.Any])).`++`(args.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[Any]
  
  /* static member */
  inline def forEach(`object`: Any, block: Any, context: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("forEach")(`object`.asInstanceOf[js.Any], block.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /* static member */
  inline def implement(args: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("implement")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Any]
  
  /* static member */
  inline def toString_(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("toString")().asInstanceOf[Any]
  
  /* static member */
  inline def valueOf_(`type`: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("valueOf")(`type`.asInstanceOf[js.Any]).asInstanceOf[Any]
}
