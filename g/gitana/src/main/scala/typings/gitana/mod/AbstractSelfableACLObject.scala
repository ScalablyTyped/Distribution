package typings.gitana.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("gitana", "AbstractSelfableACLObject")
@js.native
open class AbstractSelfableACLObject protected () extends AbstractSelfableObject {
  def this(driver: Any, `object`: Any) = this()
  
  def checkAuthority(principal: Any, authorityId: Any, callback: Any): Any = js.native
  
  def checkPermission(principal: Any, permissionId: Any, callback: Any): Any = js.native
  
  def grantAuthority(principal: Any, authorityId: Any): Any = js.native
  
  def listAuthorities(principal: Any, callback: Any): Any = js.native
  
  def loadACL(callback: Any): Any = js.native
  
  def loadAuthorityGrants(principalIds: Any, callback: Any): Any = js.native
  
  def revokeAllAuthorities(principal: Any): Any = js.native
  
  def revokeAuthority(principal: Any, authorityId: Any): Any = js.native
}
object AbstractSelfableACLObject {
  
  @JSImport("gitana", "AbstractSelfableACLObject")
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
