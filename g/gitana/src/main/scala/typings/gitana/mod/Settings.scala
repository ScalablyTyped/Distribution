package typings.gitana.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("gitana", "Settings")
@js.native
open class Settings protected () extends StObject {
  def this(application: Any, `object`: Any) = this()
  
  def attach(attachmentId: Any, contentType: Any, data: Any): Any = js.native
  
  def attachment(attachmentId: Any): Any = js.native
  
  def base(): Unit = js.native
  
  def getPreviewUri(name: Any, config: Any): Any = js.native
  
  def getSetting(key: Any): Any = js.native
  
  def getSettings(): Any = js.native
  
  def getType(): Any = js.native
  
  def getUri(): Any = js.native
  
  def listAttachments(local: Any): Any = js.native
  
  def setSetting(key: Any, `val`: Any): Unit = js.native
  
  def unattach(attachmentId: Any): Any = js.native
}
object Settings {
  
  @JSImport("gitana", "Settings")
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
