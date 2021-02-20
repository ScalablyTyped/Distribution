package typings.gitana.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("gitana", "Identity")
@js.native
class Identity protected () extends StObject {
  def this(directory: js.Any, `object`: js.Any) = this()
  
  def base(): Unit = js.native
  
  def changePassword(password: js.Any, verifyPassword: js.Any): js.Any = js.native
  
  def findPolicyTenants(registrarId: js.Any): js.Any = js.native
  
  def findPolicyUserForTenant(tenantId: js.Any): js.Any = js.native
  
  def findPolicyUsers(tenantId: js.Any): js.Any = js.native
  
  def findPolicyUsersForTenant(tenantId: js.Any): js.Any = js.native
  
  def getType(): js.Any = js.native
  
  def getUri(): js.Any = js.native
}
object Identity {
  
  /* static member */
  @JSImport("gitana", "Identity.extend")
  @js.native
  def extend(_instance: js.Any, _static: js.Any, args: js.Any*): js.Any = js.native
  
  /* static member */
  @JSImport("gitana", "Identity.forEach")
  @js.native
  def forEach(`object`: js.Any, block: js.Any, context: js.Any): Unit = js.native
  
  /* static member */
  @JSImport("gitana", "Identity.implement")
  @js.native
  def implement(args: js.Any*): js.Any = js.native
  
  /* static member */
  @JSImport("gitana", "Identity.toString")
  @js.native
  def toString_(): js.Any = js.native
  
  /* static member */
  @JSImport("gitana", "Identity.valueOf")
  @js.native
  def valueOf_(`type`: js.Any): js.Any = js.native
}
