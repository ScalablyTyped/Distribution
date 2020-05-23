package typings.gitana.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitana", "Project")
@js.native
class Project protected () extends AbstractPlatformObject {
  def this(platform: js.Any, `object`: js.Any) = this()
  def adminMaintenance(): js.Any = js.native
  def attach(attachmentId: js.Any, contentType: js.Any, data: js.Any): js.Any = js.native
  def attachment(attachmentId: js.Any): js.Any = js.native
  def getPreviewUri(name: js.Any, config: js.Any): js.Any = js.native
  def inviteUser(userId: js.Any): js.Any = js.native
  def listAttachments(local: js.Any): js.Any = js.native
  def readStack(): js.Any = js.native
  def unattach(attachmentId: js.Any): js.Any = js.native
}

/* static members */
@JSImport("gitana", "Project")
@js.native
object Project extends js.Object {
  def extend(_instance: js.Any, _static: js.Any, args: js.Any*): js.Any = js.native
  def forEach(`object`: js.Any, block: js.Any, context: js.Any): Unit = js.native
  def implement(args: js.Any*): js.Any = js.native
  def valueOf(`type`: js.Any): js.Any = js.native
}

