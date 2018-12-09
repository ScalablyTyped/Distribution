package typings
package elasticsearchLib.elasticsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("elasticsearch", "Nodes")
@js.native
class Nodes () extends js.Object {
  def hotThreads(params: NodesHotThreadsParams): js.Promise[_] = js.native
  def hotThreads(
    params: NodesHotThreadsParams,
    callback: js.Function3[/* error */ js.Any, /* response */ js.Any, /* status */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def info(params: NodesInfoParams): js.Promise[_] = js.native
  def info(
    params: NodesInfoParams,
    callback: js.Function3[/* error */ js.Any, /* response */ js.Any, /* status */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def stats(params: NodesStatsParams): js.Promise[_] = js.native
  def stats(
    params: NodesStatsParams,
    callback: js.Function3[/* error */ js.Any, /* response */ js.Any, /* status */ js.Any, scala.Unit]
  ): scala.Unit = js.native
}

