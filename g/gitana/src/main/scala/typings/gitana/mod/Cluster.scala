package typings.gitana.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
  
  /* static member */
  @JSImport("gitana", "Cluster.extend")
  @js.native
  def extend(_instance: js.Any, _static: js.Any, args: js.Any*): js.Any = js.native
  
  /* static member */
  @JSImport("gitana", "Cluster.forEach")
  @js.native
  def forEach(`object`: js.Any, block: js.Any, context: js.Any): Unit = js.native
  
  /* static member */
  @JSImport("gitana", "Cluster.implement")
  @js.native
  def implement(args: js.Any*): js.Any = js.native
  
  /* static member */
  @JSImport("gitana", "Cluster.toString")
  @js.native
  def toString_(): js.Any = js.native
  
  /* static member */
  @JSImport("gitana", "Cluster.valueOf")
  @js.native
  def valueOf_(`type`: js.Any): js.Any = js.native
}
