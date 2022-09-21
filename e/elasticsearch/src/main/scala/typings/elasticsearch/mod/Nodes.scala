package typings.elasticsearch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("elasticsearch", "Nodes")
@js.native
open class Nodes () extends StObject {
  
  def hotThreads(params: NodesHotThreadsParams): js.Promise[Any] = js.native
  def hotThreads(
    params: NodesHotThreadsParams,
    callback: js.Function3[/* error */ Any, /* response */ Any, /* status */ Any, Unit]
  ): Unit = js.native
  
  def info(params: NodesInfoParams): js.Promise[Any] = js.native
  def info(
    params: NodesInfoParams,
    callback: js.Function3[/* error */ Any, /* response */ Any, /* status */ Any, Unit]
  ): Unit = js.native
  
  def stats(params: NodesStatsParams): js.Promise[Any] = js.native
  def stats(
    params: NodesStatsParams,
    callback: js.Function3[/* error */ Any, /* response */ Any, /* status */ Any, Unit]
  ): Unit = js.native
}
