package typings.gitana.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
  
  @JSImport("gitana", "Project")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def extend(_instance: js.Any, _static: js.Any, args: js.Any*): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(_instance.asInstanceOf[js.Any], _static.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  /* static member */
  inline def forEach(`object`: js.Any, block: js.Any, context: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("forEach")(`object`.asInstanceOf[js.Any], block.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /* static member */
  inline def implement(args: js.Any*): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("implement")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  /* static member */
  inline def toString_(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("toString")().asInstanceOf[js.Any]
  
  /* static member */
  inline def valueOf_(`type`: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("valueOf")(`type`.asInstanceOf[js.Any]).asInstanceOf[js.Any]
}
