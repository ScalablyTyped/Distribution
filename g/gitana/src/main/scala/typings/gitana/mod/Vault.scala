package typings.gitana.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("gitana", "Vault")
@js.native
open class Vault protected () extends StObject {
  def this(platform: Any, `object`: Any) = this()
  
  def base(): Unit = js.native
  
  def checkArchiveAuthorities(checks: Any, callback: Any): Any = js.native
  
  def checkArchivePermissions(checks: Any, callback: Any): Any = js.native
  
  def getType(): Any = js.native
  
  def getUri(): Any = js.native
  
  def listArchives(pagination: Any): Any = js.native
  
  def lookupArchive(groupId: Any, artifactId: Any, versionId: Any): Any = js.native
  
  def queryArchives(query: Any, pagination: Any): Any = js.native
  
  def readArchive(archiveId: Any): Any = js.native
}
object Vault {
  
  @JSImport("gitana", "Vault")
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
