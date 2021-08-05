package typings.gitana.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("gitana", "WorkflowInstance")
@js.native
class WorkflowInstance protected () extends StObject {
  def this(platform: js.Any, `object`: js.Any) = this()
  
  def addResource(resource: js.Any): js.Any = js.native
  
  def base(): Unit = js.native
  
  def getType(): js.Any = js.native
  
  def getUri(): js.Any = js.native
  
  def loadResource(id: js.Any, callback: js.Any): js.Any = js.native
  
  def loadResourceList(callback: js.Any): js.Any = js.native
  
  def removeAllResources(): js.Any = js.native
  
  def removeResource(resourceOrResourceId: js.Any): js.Any = js.native
  
  def resume(): js.Any = js.native
  
  def start(data: js.Any): js.Any = js.native
  
  def suspend(): js.Any = js.native
  
  def terminate(): js.Any = js.native
  
  def upgradeModel(newModel: js.Any, newModelVersion: js.Any): js.Any = js.native
}
object WorkflowInstance {
  
  @JSImport("gitana", "WorkflowInstance")
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
