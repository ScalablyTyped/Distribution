package typings.gitana.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("gitana", "Cluster")
@js.native
open class Cluster protected () extends DataStore {
  def this(driver: Any, `object`: Any) = this()
  
  def killJob(jobId: String): Any = js.native
  
  def loadContainedTypes(`type`: Any, callback: Any): Cluster = js.native
  
  def queryFailedJobs(query: Any, pagination: Any): JobMap = js.native
  
  def queryFinishedJobs(query: Any, pagination: Any): JobMap = js.native
  
  def queryJobs(query: Any, pagination: Any): JobMap = js.native
  
  def queryRunningJobs(query: Any, pagination: Any): JobMap = js.native
  
  def queryUnstartedJobs(query: Any, pagination: Any): JobMap = js.native
  
  def queryWaitingJobs(query: Any, pagination: Any): JobMap = js.native
  
  def readJob(jobId: String): Job = js.native
  
  def waitForJobCompletion(jobId: String, callback: jobCallback[this.type]): Cluster = js.native
  def waitForJobCompletion(jobId: String, callback: jobCallback[this.type], progressCallback: Any): Cluster = js.native
}
object Cluster {
  
  @JSImport("gitana", "Cluster")
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
