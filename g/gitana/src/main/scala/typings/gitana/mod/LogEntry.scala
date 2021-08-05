package typings.gitana.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
object LogEntry {
  
  @JSImport("gitana", "LogEntry")
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
