package typings.gamedig.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gamedig", "query")
@js.native
object query extends js.Object {
  def apply(options: QueryOptions): js.Promise[QueryResult] = js.native
  def apply(options: QueryOptions, callback: js.Function2[/* error */ js.Any, /* state */ QueryResult, Unit]): Unit = js.native
}

