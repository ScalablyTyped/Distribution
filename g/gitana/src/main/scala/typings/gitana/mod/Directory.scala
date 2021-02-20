package typings.gitana.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("gitana", "Directory")
@js.native
class Directory protected () extends StObject {
  def this(platform: js.Any, `object`: js.Any) = this()
  
  def base(): Unit = js.native
  
  def checkConnectionAuthorities(checks: js.Any, callback: js.Any): js.Any = js.native
  
  def checkConnectionPermissions(checks: js.Any, callback: js.Any): js.Any = js.native
  
  def checkIdentityAuthorities(checks: js.Any, callback: js.Any): js.Any = js.native
  
  def checkIdentityPermissions(checks: js.Any, callback: js.Any): js.Any = js.native
  
  def createConnection(`object`: js.Any): js.Any = js.native
  
  def getType(): js.Any = js.native
  
  def getUri(): js.Any = js.native
  
  def listConnections(pagination: js.Any): js.Any = js.native
  
  def listIdentities(pagination: js.Any): js.Any = js.native
  
  def queryConnections(query: js.Any, pagination: js.Any): js.Any = js.native
  
  def queryIdentities(query: js.Any, pagination: js.Any): js.Any = js.native
  
  def readConnection(connectionId: js.Any): js.Any = js.native
  
  def readIdentity(identityId: js.Any): js.Any = js.native
}
object Directory {
  
  /* static member */
  @JSImport("gitana", "Directory.extend")
  @js.native
  def extend(_instance: js.Any, _static: js.Any, args: js.Any*): js.Any = js.native
  
  /* static member */
  @JSImport("gitana", "Directory.forEach")
  @js.native
  def forEach(`object`: js.Any, block: js.Any, context: js.Any): Unit = js.native
  
  /* static member */
  @JSImport("gitana", "Directory.implement")
  @js.native
  def implement(args: js.Any*): js.Any = js.native
  
  /* static member */
  @JSImport("gitana", "Directory.toString")
  @js.native
  def toString_(): js.Any = js.native
  
  /* static member */
  @JSImport("gitana", "Directory.valueOf")
  @js.native
  def valueOf_(`type`: js.Any): js.Any = js.native
}
