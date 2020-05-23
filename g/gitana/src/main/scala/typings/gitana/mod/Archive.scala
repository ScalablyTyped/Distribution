package typings.gitana.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitana", "Archive")
@js.native
class Archive protected () extends AbstractVaultObject {
  def this(vault: js.Any, `object`: js.Any) = this()
  def attach(attachmentId: String, contentType: js.Any, data: js.Any): js.Any = js.native
  def attachment(attachmentId: String): js.Any = js.native
  def getDownloadUri(): String = js.native
  def getPreviewUri(name: js.Any, config: js.Any): String = js.native
  def getType(): String = js.native
  def getUri(): String = js.native
  def listAttachments(local: js.Any): js.Any = js.native
  def publish(): js.Any = js.native
  def unattach(attachmentId: js.Any): js.Any = js.native
  def unpublish(): js.Any = js.native
}

/* static members */
@JSImport("gitana", "Archive")
@js.native
object Archive extends js.Object {
  def extend(_instance: js.Any, _static: js.Any, args: js.Any*): js.Any = js.native
  def forEach(`object`: js.Any, block: js.Any, context: js.Any): Unit = js.native
  def implement(args: js.Any*): js.Any = js.native
  def valueOf(`type`: js.Any): js.Any = js.native
}

