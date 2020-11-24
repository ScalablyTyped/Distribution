package typings.gitana.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("gitana", "Vault")
@js.native
class Vault protected () extends js.Object {
  def this(platform: js.Any, `object`: js.Any) = this()
  
  def base(): Unit = js.native
  
  def checkArchiveAuthorities(checks: js.Any, callback: js.Any): js.Any = js.native
  
  def checkArchivePermissions(checks: js.Any, callback: js.Any): js.Any = js.native
  
  def getType(): js.Any = js.native
  
  def getUri(): js.Any = js.native
  
  def listArchives(pagination: js.Any): js.Any = js.native
  
  def lookupArchive(groupId: js.Any, artifactId: js.Any, versionId: js.Any): js.Any = js.native
  
  def queryArchives(query: js.Any, pagination: js.Any): js.Any = js.native
  
  def readArchive(archiveId: js.Any): js.Any = js.native
}
/* static members */
@JSImport("gitana", "Vault")
@js.native
object Vault extends js.Object {
  
  def extend(_instance: js.Any, _static: js.Any, args: js.Any*): js.Any = js.native
  
  def forEach(`object`: js.Any, block: js.Any, context: js.Any): Unit = js.native
  
  def implement(args: js.Any*): js.Any = js.native
  
  def valueOf(`type`: js.Any): js.Any = js.native
}
