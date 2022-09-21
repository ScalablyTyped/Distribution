package typings.gitana.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("gitana", "Archive")
@js.native
open class Archive protected () extends AbstractVaultObject {
  def this(vault: Any, `object`: Any) = this()
  
  def attach(attachmentId: String, contentType: Any, data: Any): Any = js.native
  
  def attachment(attachmentId: String): Any = js.native
  
  def getDownloadUri(): String = js.native
  
  def getPreviewUri(name: Any, config: Any): String = js.native
  
  def getType(): String = js.native
  
  def getUri(): String = js.native
  
  def listAttachments(local: Any): Any = js.native
  
  def publish(): Any = js.native
  
  def unattach(attachmentId: Any): Any = js.native
  
  def unpublish(): Any = js.native
}
object Archive {
  
  @JSImport("gitana", "Archive")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def extend(_instance: Any, _static: Any, args: Any*): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")((List(_instance.asInstanceOf[js.Any], _static.asInstanceOf[js.Any])).`++`(args.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[Any]
  
  /* static member */
  inline def forEach(`object`: Any, block: Any, context: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("forEach")(`object`.asInstanceOf[js.Any], block.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /* static member */
  inline def implement(args: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("implement")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Any]
  
  /* static member */
  inline def toString_(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("toString")().asInstanceOf[Any]
  
  /* static member */
  inline def valueOf_(`type`: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("valueOf")(`type`.asInstanceOf[js.Any]).asInstanceOf[Any]
}
