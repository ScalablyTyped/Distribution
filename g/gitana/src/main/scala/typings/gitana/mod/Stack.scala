package typings.gitana.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("gitana", "Stack")
@js.native
open class Stack protected () extends AbstractPlatformObject {
  def this(platform: Any, `object`: Any) = this()
  
  def assignDataStore(datastore: Any, key: Any, args: Any*): Any = js.native
  
  def attach(attachmentId: Any, contentType: Any, data: Any): Any = js.native
  
  def attachment(attachmentId: Any): Any = js.native
  
  def createRole(roleKey: Any, `object`: Any): Any = js.native
  
  def createTeam(teamKey: Any, `object`: Any): Any = js.native
  
  def existsDataStore(key: Any, callback: Any): Any = js.native
  
  def getKey(): Any = js.native
  
  def getPreviewUri(name: Any, config: Any): Any = js.native
  
  def listAttachments(local: Any): Any = js.native
  
  def listDataStores(pagination: Any): Any = js.native
  
  def listRoles(inherited: Any): Any = js.native
  
  def listTeams(pagination: Any): Any = js.native
  
  def queryDataStores(query: Any, pagination: Any): PlatformDataStoreMap = js.native
  
  def queryLogEntries(query: Any, pagination: Any): LogEntryMap = js.native
  
  def readDataStore(key: Any, callback: Any): Stack = js.native
  
  def readLog(callback: Any): this.type = js.native
  
  def readLogEntry(logEntryId: Any): LogEntry = js.native
  
  def readOwnersTeam(): Any = js.native
  
  def readRole(roleKeyOrId: Any, inherited: Any): Any = js.native
  
  def readTeam(teamKey: Any): Any = js.native
  
  def unassignDataStore(key: Any): Any = js.native
  
  def unattach(attachmentId: Any): Any = js.native
}
object Stack {
  
  @JSImport("gitana", "Stack")
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
