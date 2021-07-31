package typings.elasticsearch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Cluster extends StObject {
  
  def allocationExplain(params: ClusterAllocationExplainParams): js.Promise[js.Any] = js.native
  def allocationExplain(
    params: ClusterAllocationExplainParams,
    callback: js.Function2[/* error */ js.Any, /* response */ js.Any, Unit]
  ): Unit = js.native
  
  def getSettings(params: ClusterGetSettingsParams): js.Promise[js.Any] = js.native
  def getSettings(
    params: ClusterGetSettingsParams,
    callback: js.Function2[/* error */ js.Any, /* response */ js.Any, Unit]
  ): Unit = js.native
  
  def health(params: ClusterHealthParams): js.Promise[js.Any] = js.native
  def health(
    params: ClusterHealthParams,
    callback: js.Function2[/* error */ js.Any, /* response */ js.Any, Unit]
  ): Unit = js.native
  
  def pendingTasks(params: ClusterPendingTasksParams): js.Promise[js.Any] = js.native
  def pendingTasks(
    params: ClusterPendingTasksParams,
    callback: js.Function2[/* error */ js.Any, /* response */ js.Any, Unit]
  ): Unit = js.native
  
  def putSettings(params: ClusterPutSettingsParams): js.Promise[js.Any] = js.native
  def putSettings(
    params: ClusterPutSettingsParams,
    callback: js.Function2[/* error */ js.Any, /* response */ js.Any, Unit]
  ): Unit = js.native
  
  def reroute(params: ClusterRerouteParams): js.Promise[js.Any] = js.native
  def reroute(
    params: ClusterRerouteParams,
    callback: js.Function2[/* error */ js.Any, /* response */ js.Any, Unit]
  ): Unit = js.native
  
  def state(params: ClusterStateParams): js.Promise[js.Any] = js.native
  def state(
    params: ClusterStateParams,
    callback: js.Function2[/* error */ js.Any, /* response */ js.Any, Unit]
  ): Unit = js.native
  
  def stats(params: ClusterStatsParams): js.Promise[js.Any] = js.native
  def stats(
    params: ClusterStatsParams,
    callback: js.Function2[/* error */ js.Any, /* response */ js.Any, Unit]
  ): Unit = js.native
}
