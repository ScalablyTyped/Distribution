package typings
package elasticsearchLib.elasticsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("elasticsearch", "Tasks")
@js.native
class Tasks () extends js.Object {
  def cancel(params: TasksCancelParams): stdLib.Promise[_] = js.native
  def cancel(
    params: TasksCancelParams,
    callback: js.Function3[/* error */ js.Any, /* response */ js.Any, /* status */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def get(params: TasksGetParams): stdLib.Promise[_] = js.native
  def get(
    params: TasksGetParams,
    callback: js.Function3[/* error */ js.Any, /* response */ js.Any, /* status */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def list(params: TasksListParams): stdLib.Promise[_] = js.native
  def list(
    params: TasksListParams,
    callback: js.Function3[/* error */ js.Any, /* response */ js.Any, /* status */ js.Any, scala.Unit]
  ): scala.Unit = js.native
}

