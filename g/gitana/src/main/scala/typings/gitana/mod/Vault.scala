package typings.gitana.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("gitana", "Vault")
@js.native
class Vault protected () extends StObject {
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
object Vault {
  
  /* static member */
  @JSImport("gitana", "Vault.extend")
  @js.native
  def extend(_instance: js.Any, _static: js.Any, args: js.Any*): js.Any = js.native
  
  /* static member */
  @JSImport("gitana", "Vault.forEach")
  @js.native
  def forEach(`object`: js.Any, block: js.Any, context: js.Any): Unit = js.native
  
  /* static member */
  @JSImport("gitana", "Vault.implement")
  @js.native
  def implement(args: js.Any*): js.Any = js.native
  
  /* static member */
  @JSImport("gitana", "Vault.toString")
  @js.native
  def toString_(): js.Any = js.native
  
  /* static member */
  @JSImport("gitana", "Vault.valueOf")
  @js.native
  def valueOf_(`type`: js.Any): js.Any = js.native
}
