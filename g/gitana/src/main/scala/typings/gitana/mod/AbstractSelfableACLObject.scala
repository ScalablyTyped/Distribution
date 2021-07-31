package typings.gitana.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
  
  @JSImport("gitana", "AbstractSelfableACLObject")
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
