package typings.gitana.mod

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
/* static members */
@JSImport("gitana", "Client")
@js.native
object Client extends js.Object {
  
  def extend(_instance: js.Any, _static: js.Any, args: js.Any*): js.Any = js.native
  
  def forEach(`object`: js.Any, block: js.Any, context: js.Any): Unit = js.native
  
  def implement(args: js.Any*): js.Any = js.native
  
  def valueOf(`type`: js.Any): js.Any = js.native
}
