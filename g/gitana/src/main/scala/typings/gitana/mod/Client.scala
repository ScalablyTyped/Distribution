package typings.gitana.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("gitana", "Client")
@js.native
class Client protected () extends AbstractPlatformObject {
  def this(platform: js.Any, `object`: js.Any) = this()
  
  def getAllowOpenDriverAuthentication(): js.Any = js.native
  
  def getAuthorizedGrantTypes(): js.Any = js.native
  
  def getEnabled(): Boolean = js.native
  
  def getScope(): js.Any = js.native
  
  def listAuthenticationGrants(pagination: js.Any): js.Any = js.native
}
object Client {
  
  /* static member */
  @JSImport("gitana", "Client.extend")
  @js.native
  def extend(_instance: js.Any, _static: js.Any, args: js.Any*): js.Any = js.native
  
  /* static member */
  @JSImport("gitana", "Client.forEach")
  @js.native
  def forEach(`object`: js.Any, block: js.Any, context: js.Any): Unit = js.native
  
  /* static member */
  @JSImport("gitana", "Client.implement")
  @js.native
  def implement(args: js.Any*): js.Any = js.native
  
  /* static member */
  @JSImport("gitana", "Client.toString")
  @js.native
  def toString_(): js.Any = js.native
  
  /* static member */
  @JSImport("gitana", "Client.valueOf")
  @js.native
  def valueOf_(`type`: js.Any): js.Any = js.native
}
