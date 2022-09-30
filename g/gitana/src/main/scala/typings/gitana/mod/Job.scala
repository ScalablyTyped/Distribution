package typings.gitana.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("gitana", "Job")
@js.native
open class Job protected () extends AbstractClusterObject {
  def this(cluster: Any, `object`: Any) = this()
  
  def attach(attachmentId: String, contentType: Any, data: Any): Any = js.native
  
  def attachment(attachmentId: String): NodeAttachment = js.native
  
  def getAttempts(): Any = js.native
  
  def getCurrentServer(): Any = js.native
  
  def getCurrentServerTimeStamp(): Any = js.native
  
  def getCurrentThread(): Any = js.native
  
  def getLogEntries(): Any = js.native
  
  def getPaused(): Any = js.native
  
  def getPausedBy(): Any = js.native
  
  def getPausedTimestamp(): Any = js.native
  
  def getPlatformId(): String = js.native
  
  def getPreviewUri(name: Any, config: Any): String = js.native
  
  def getPriority(): Any = js.native
  
  def getRunAsPrincipalDomainId(): String = js.native
  
  def getRunAsPrincipalId(): String = js.native
  
  def getScheduledStartTime(): String = js.native
  
  def getStarted(): Any = js.native
  
  def getStartedBy(): String = js.native
  
  def getStartedTimestamp(): Timestamp = js.native
  
  def getState(): String = js.native
  
  def getStopped(): Any = js.native
  
  def getStoppedTimestamp(): Timestamp = js.native
  
  def getSubmittedBy(): String = js.native
  
  def getSubmittedTimestamp(): Timestamp = js.native
  
  def listAttachments(local: Any): NodeAttachmentMap = js.native
  
  def unattach(attachmentId: Any): Any = js.native
}
object Job {
  
  @JSImport("gitana", "Job")
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
