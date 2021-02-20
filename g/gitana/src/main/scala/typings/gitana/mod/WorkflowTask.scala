package typings.gitana.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("gitana", "WorkflowTask")
@js.native
class WorkflowTask protected () extends StObject {
  def this(platform: js.Any, `object`: js.Any) = this()
  
  def addResource(resource: js.Any): js.Any = js.native
  
  def base(): Unit = js.native
  
  def claim(): js.Any = js.native
  
  def complete(routeId: js.Any, data: js.Any): js.Any = js.native
  
  def delegate(user: js.Any): js.Any = js.native
  
  def getType(): js.Any = js.native
  
  def getUri(): js.Any = js.native
  
  def listDelegates(pagination: js.Any): js.Any = js.native
  
  def loadResource(id: js.Any, callback: js.Any): js.Any = js.native
  
  def loadResourceList(callback: js.Any): js.Any = js.native
  
  def loadRoutes(callback: js.Any): js.Any = js.native
  
  def move(workflowNodeId: js.Any, data: js.Any): js.Any = js.native
  
  def removeAllResources(): js.Any = js.native
  
  def removeResource(resourceOrResourceId: js.Any): js.Any = js.native
  
  def unclaim(): js.Any = js.native
}
object WorkflowTask {
  
  /* static member */
  @JSImport("gitana", "WorkflowTask.extend")
  @js.native
  def extend(_instance: js.Any, _static: js.Any, args: js.Any*): js.Any = js.native
  
  /* static member */
  @JSImport("gitana", "WorkflowTask.forEach")
  @js.native
  def forEach(`object`: js.Any, block: js.Any, context: js.Any): Unit = js.native
  
  /* static member */
  @JSImport("gitana", "WorkflowTask.implement")
  @js.native
  def implement(args: js.Any*): js.Any = js.native
  
  /* static member */
  @JSImport("gitana", "WorkflowTask.toString")
  @js.native
  def toString_(): js.Any = js.native
  
  /* static member */
  @JSImport("gitana", "WorkflowTask.valueOf")
  @js.native
  def valueOf_(`type`: js.Any): js.Any = js.native
}
