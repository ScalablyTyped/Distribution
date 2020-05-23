package typings.gitana.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitana", "Directory")
@js.native
class Directory protected () extends js.Object {
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

/* static members */
@JSImport("gitana", "Directory")
@js.native
object Directory extends js.Object {
  def extend(_instance: js.Any, _static: js.Any, args: js.Any*): js.Any = js.native
  def forEach(`object`: js.Any, block: js.Any, context: js.Any): Unit = js.native
  def implement(args: js.Any*): js.Any = js.native
  def valueOf(`type`: js.Any): js.Any = js.native
}

