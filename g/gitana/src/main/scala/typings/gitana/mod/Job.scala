package typings.gitana.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("gitana", "Job")
@js.native
class Job protected () extends AbstractClusterObject {
  def this(cluster: js.Any, `object`: js.Any) = this()
  
  def attach(attachmentId: String, contentType: js.Any, data: js.Any): js.Any = js.native
  
  def attachment(attachmentId: String): NodeAttachment = js.native
  
  def getAttempts(): js.Any = js.native
  
  def getCurrentServer(): js.Any = js.native
  
  def getCurrentServerTimeStamp(): js.Any = js.native
  
  def getCurrentThread(): js.Any = js.native
  
  def getLogEntries(): js.Any = js.native
  
  def getPaused(): js.Any = js.native
  
  def getPausedBy(): js.Any = js.native
  
  def getPausedTimestamp(): js.Any = js.native
  
  def getPlatformId(): String = js.native
  
  def getPreviewUri(name: js.Any, config: js.Any): String = js.native
  
  def getPriority(): js.Any = js.native
  
  def getRunAsPrincipalDomainId(): String = js.native
  
  def getRunAsPrincipalId(): String = js.native
  
  def getScheduledStartTime(): String = js.native
  
  def getStarted(): js.Any = js.native
  
  def getStartedBy(): String = js.native
  
  def getStartedTimestamp(): Timestamp = js.native
  
  def getState(): String = js.native
  
  def getStopped(): js.Any = js.native
  
  def getStoppedTimestamp(): Timestamp = js.native
  
  def getSubmittedBy(): String = js.native
  
  def getSubmittedTimestamp(): Timestamp = js.native
  
  def listAttachments(local: js.Any): NodeAttachmentMap = js.native
  
  def unattach(attachmentId: js.Any): js.Any = js.native
}
/* static members */
@JSImport("gitana", "Job")
@js.native
object Job extends js.Object {
  
  def extend(_instance: js.Any, _static: js.Any, args: js.Any*): js.Any = js.native
  
  def forEach(`object`: js.Any, block: js.Any, context: js.Any): Unit = js.native
  
  def implement(args: js.Any*): js.Any = js.native
  
  def valueOf(`type`: js.Any): js.Any = js.native
}
