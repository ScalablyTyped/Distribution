package typings.gitana.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
object Project {
  
  /* static member */
  @JSImport("gitana", "Project.extend")
  @js.native
  def extend(_instance: js.Any, _static: js.Any, args: js.Any*): js.Any = js.native
  
  /* static member */
  @JSImport("gitana", "Project.forEach")
  @js.native
  def forEach(`object`: js.Any, block: js.Any, context: js.Any): Unit = js.native
  
  /* static member */
  @JSImport("gitana", "Project.implement")
  @js.native
  def implement(args: js.Any*): js.Any = js.native
  
  /* static member */
  @JSImport("gitana", "Project.toString")
  @js.native
  def toString_(): js.Any = js.native
  
  /* static member */
  @JSImport("gitana", "Project.valueOf")
  @js.native
  def valueOf_(`type`: js.Any): js.Any = js.native
}
