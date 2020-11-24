package typings.gitana.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("gitana", "Settings")
@js.native
class Settings protected () extends js.Object {
  def this(application: js.Any, `object`: js.Any) = this()
  
  def attach(attachmentId: js.Any, contentType: js.Any, data: js.Any): js.Any = js.native
  
  def attachment(attachmentId: js.Any): js.Any = js.native
  
  def base(): Unit = js.native
  
  def getPreviewUri(name: js.Any, config: js.Any): js.Any = js.native
  
  def getSetting(key: js.Any): js.Any = js.native
  
  def getSettings(): js.Any = js.native
  
  def getType(): js.Any = js.native
  
  def getUri(): js.Any = js.native
  
  def listAttachments(local: js.Any): js.Any = js.native
  
  def setSetting(key: js.Any, `val`: js.Any): Unit = js.native
  
  def unattach(attachmentId: js.Any): js.Any = js.native
}
/* static members */
@JSImport("gitana", "Settings")
@js.native
object Settings extends js.Object {
  
  def extend(_instance: js.Any, _static: js.Any, args: js.Any*): js.Any = js.native
  
  def forEach(`object`: js.Any, block: js.Any, context: js.Any): Unit = js.native
  
  def implement(args: js.Any*): js.Any = js.native
  
  def valueOf(`type`: js.Any): js.Any = js.native
}
