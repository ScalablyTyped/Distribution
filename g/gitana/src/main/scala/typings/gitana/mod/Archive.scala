package typings.gitana.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
object Archive {
  
  @JSImport("gitana", "Archive")
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
