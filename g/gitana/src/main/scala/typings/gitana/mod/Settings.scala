package typings.gitana.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("gitana", "Settings")
@js.native
class Settings protected () extends StObject {
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
object Settings {
  
  /* static member */
  @JSImport("gitana", "Settings.extend")
  @js.native
  def extend(_instance: js.Any, _static: js.Any, args: js.Any*): js.Any = js.native
  
  /* static member */
  @JSImport("gitana", "Settings.forEach")
  @js.native
  def forEach(`object`: js.Any, block: js.Any, context: js.Any): Unit = js.native
  
  /* static member */
  @JSImport("gitana", "Settings.implement")
  @js.native
  def implement(args: js.Any*): js.Any = js.native
  
  /* static member */
  @JSImport("gitana", "Settings.toString")
  @js.native
  def toString_(): js.Any = js.native
  
  /* static member */
  @JSImport("gitana", "Settings.valueOf")
  @js.native
  def valueOf_(`type`: js.Any): js.Any = js.native
}
