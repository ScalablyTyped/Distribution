package typings.elasticsearch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("elasticsearch", "Tasks")
@js.native
class Tasks () extends StObject {
  
  def cancel(params: TasksCancelParams): js.Promise[js.Any] = js.native
  def cancel(
    params: TasksCancelParams,
    callback: js.Function3[/* error */ js.Any, /* response */ js.Any, /* status */ js.Any, Unit]
  ): Unit = js.native
  
  def get(params: TasksGetParams): js.Promise[js.Any] = js.native
  def get(
    params: TasksGetParams,
    callback: js.Function3[/* error */ js.Any, /* response */ js.Any, /* status */ js.Any, Unit]
  ): Unit = js.native
  
  def list(params: TasksListParams): js.Promise[js.Any] = js.native
  def list(
    params: TasksListParams,
    callback: js.Function3[/* error */ js.Any, /* response */ js.Any, /* status */ js.Any, Unit]
  ): Unit = js.native
}
