package typings.findMyWay.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FindResult[V /* <: HTTPVersion */] extends js.Object {
  @JSName("handler")
  var handler_Original: Handler[V] = js.native
  var params: StringDictionary[js.UndefOr[String]] = js.native
  var store: js.Any = js.native
  def handler(req: Req[V], res: Res[V], params: StringDictionary[js.UndefOr[String]], store: js.Any): Unit = js.native
}

