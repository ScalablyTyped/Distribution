package typings.gitana.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitana", "LogEntry")
@js.native
class LogEntry protected () extends AbstractObject {
  def this(platform: js.Any, `object`: js.Any) = this()
  def getBranchId(): js.Any = js.native
  def getClassDescriptor(): js.Any = js.native
  def getFilename(): js.Any = js.native
  def getLevel(): js.Any = js.native
  def getLineNumber(): js.Any = js.native
  def getMessage(): js.Any = js.native
  def getMethod(): js.Any = js.native
  def getPrincipalId(): js.Any = js.native
  def getRepositoryId(): js.Any = js.native
  def getThread(): js.Any = js.native
  def getThrowables(): js.Any = js.native
  def getTimestamp(): js.Any = js.native
}

/* static members */
@JSImport("gitana", "LogEntry")
@js.native
object LogEntry extends js.Object {
  def extend(_instance: js.Any, _static: js.Any, args: js.Any*): js.Any = js.native
  def forEach(`object`: js.Any, block: js.Any, context: js.Any): Unit = js.native
  def implement(args: js.Any*): js.Any = js.native
  def valueOf(`type`: js.Any): js.Any = js.native
}

