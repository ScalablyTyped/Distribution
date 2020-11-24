package typings.elasticsearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("elasticsearch", "Tasks")
@js.native
class Tasks () extends js.Object {
  
  def cancel(params: TasksCancelParams): js.Promise[_] = js.native
  def cancel(
    params: TasksCancelParams,
    callback: js.Function3[/* error */ js.Any, /* response */ js.Any, /* status */ js.Any, Unit]
  ): Unit = js.native
  
  def get(params: TasksGetParams): js.Promise[_] = js.native
  def get(
    params: TasksGetParams,
    callback: js.Function3[/* error */ js.Any, /* response */ js.Any, /* status */ js.Any, Unit]
  ): Unit = js.native
  
  def list(params: TasksListParams): js.Promise[_] = js.native
  def list(
    params: TasksListParams,
    callback: js.Function3[/* error */ js.Any, /* response */ js.Any, /* status */ js.Any, Unit]
  ): Unit = js.native
}
