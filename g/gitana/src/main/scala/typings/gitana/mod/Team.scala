package typings.gitana.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("gitana", "Team")
@js.native
class Team protected () extends js.Object {
  def this(cluster: js.Any, teamable: js.Any, `object`: js.Any) = this()
  
  def addMember(principal: js.Any): js.Any = js.native
  
  def base(): Unit = js.native
  
  def del(): js.Any = js.native
  
  def getGroupId(): js.Any = js.native
  
  def getKey(): js.Any = js.native
  
  def getRoleKeys(): js.Any = js.native
  
  def getType(): js.Any = js.native
  
  def getUri(): js.Any = js.native
  
  def grant(authorityId: js.Any): js.Any = js.native
  
  def hasMember(principal: js.Any, callback: js.Any): js.Any = js.native
  
  def listMembers(pagination: js.Any): js.Any = js.native
  
  def loadAuthorities(callback: js.Any): js.Any = js.native
  
  def reload(): js.Any = js.native
  
  def removeMember(principal: js.Any): js.Any = js.native
  
  def revoke(authorityId: js.Any): js.Any = js.native
  
  def update(): js.Any = js.native
}
/* static members */
@JSImport("gitana", "Team")
@js.native
object Team extends js.Object {
  
  def extend(_instance: js.Any, _static: js.Any, args: js.Any*): js.Any = js.native
  
  def forEach(`object`: js.Any, block: js.Any, context: js.Any): Unit = js.native
  
  def implement(args: js.Any*): js.Any = js.native
  
  def valueOf(`type`: js.Any): js.Any = js.native
}
