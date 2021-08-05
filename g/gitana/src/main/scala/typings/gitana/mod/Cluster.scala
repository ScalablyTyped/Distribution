package typings.gitana.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("gitana", "Cluster")
@js.native
class Cluster protected () extends DataStore {
  def this(driver: js.Any, `object`: js.Any) = this()
  
  def killJob(jobId: String): js.Any = js.native
  
  def loadContainedTypes(`type`: js.Any, callback: js.Any): Cluster = js.native
  
  def queryFailedJobs(query: js.Any, pagination: js.Any): JobMap = js.native
  
  def queryFinishedJobs(query: js.Any, pagination: js.Any): JobMap = js.native
  
  def queryJobs(query: js.Any, pagination: js.Any): JobMap = js.native
  
  def queryRunningJobs(query: js.Any, pagination: js.Any): JobMap = js.native
  
  def queryUnstartedJobs(query: js.Any, pagination: js.Any): JobMap = js.native
  
  def queryWaitingJobs(query: js.Any, pagination: js.Any): JobMap = js.native
  
  def readJob(jobId: String): Job = js.native
  
  def waitForJobCompletion(jobId: String, callback: jobCallback[this.type]): Cluster = js.native
  def waitForJobCompletion(jobId: String, callback: jobCallback[this.type], progressCallback: js.Any): Cluster = js.native
}
object Cluster {
  
  @JSImport("gitana", "Cluster")
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
