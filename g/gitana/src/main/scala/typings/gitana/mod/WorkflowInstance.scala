package typings.gitana.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("gitana", "WorkflowInstance")
@js.native
open class WorkflowInstance protected () extends StObject {
  def this(platform: Any, `object`: Any) = this()
  
  def addResource(resource: Any): Any = js.native
  
  def base(): Unit = js.native
  
  def getType(): Any = js.native
  
  def getUri(): Any = js.native
  
  def loadResource(id: Any, callback: Any): Any = js.native
  
  def loadResourceList(callback: Any): Any = js.native
  
  def removeAllResources(): Any = js.native
  
  def removeResource(resourceOrResourceId: Any): Any = js.native
  
  def resume(): Any = js.native
  
  def start(data: Any): Any = js.native
  
  def suspend(): Any = js.native
  
  def terminate(): Any = js.native
  
  def upgradeModel(newModel: Any, newModelVersion: Any): Any = js.native
}
object WorkflowInstance {
  
  @JSImport("gitana", "WorkflowInstance")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def extend(_instance: Any, _static: Any, args: Any*): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")((scala.List(_instance.asInstanceOf[js.Any], _static.asInstanceOf[js.Any])).`++`(args.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[Any]
  
  /* static member */
  inline def forEach(`object`: Any, block: Any, context: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("forEach")(`object`.asInstanceOf[js.Any], block.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /* static member */
  inline def implement(args: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("implement")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Any]
  
  /* static member */
  inline def toString_(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("toString")().asInstanceOf[Any]
  
  /* static member */
  inline def valueOf_(`type`: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("valueOf")(`type`.asInstanceOf[js.Any]).asInstanceOf[Any]
}
