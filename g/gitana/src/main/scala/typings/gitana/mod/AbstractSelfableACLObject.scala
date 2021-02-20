package typings.gitana.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("gitana", "AbstractSelfableACLObject")
@js.native
class AbstractSelfableACLObject protected () extends AbstractSelfableObject {
  def this(driver: js.Any, `object`: js.Any) = this()
  
  def checkAuthority(principal: js.Any, authorityId: js.Any, callback: js.Any): js.Any = js.native
  
  def checkPermission(principal: js.Any, permissionId: js.Any, callback: js.Any): js.Any = js.native
  
  def grantAuthority(principal: js.Any, authorityId: js.Any): js.Any = js.native
  
  def listAuthorities(principal: js.Any, callback: js.Any): js.Any = js.native
  
  def loadACL(callback: js.Any): js.Any = js.native
  
  def loadAuthorityGrants(principalIds: js.Any, callback: js.Any): js.Any = js.native
  
  def revokeAllAuthorities(principal: js.Any): js.Any = js.native
  
  def revokeAuthority(principal: js.Any, authorityId: js.Any): js.Any = js.native
}
object AbstractSelfableACLObject {
  
  /* static member */
  @JSImport("gitana", "AbstractSelfableACLObject.extend")
  @js.native
  def extend(_instance: js.Any, _static: js.Any, args: js.Any*): js.Any = js.native
  
  /* static member */
  @JSImport("gitana", "AbstractSelfableACLObject.forEach")
  @js.native
  def forEach(`object`: js.Any, block: js.Any, context: js.Any): Unit = js.native
  
  /* static member */
  @JSImport("gitana", "AbstractSelfableACLObject.implement")
  @js.native
  def implement(args: js.Any*): js.Any = js.native
  
  /* static member */
  @JSImport("gitana", "AbstractSelfableACLObject.toString")
  @js.native
  def toString_(): js.Any = js.native
  
  /* static member */
  @JSImport("gitana", "AbstractSelfableACLObject.valueOf")
  @js.native
  def valueOf_(`type`: js.Any): js.Any = js.native
}
