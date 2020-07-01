package typings.giustoInkRouter.mod

import typings.giustoInkRouter.anon.Params
import typings.history.mod.History
import typings.history.mod.Location
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RouteComponentProps[T /* <: Record[String, _] */] extends js.Object {
  var history: History[js.Object]
  var location: Location[js.Object]
  var `match`: Params[T]
}

object RouteComponentProps {
  @scala.inline
  def apply[/* <: typings.std.Record[java.lang.String, _] */ T](history: History[js.Object], location: Location[js.Object], `match`: Params[T]): RouteComponentProps[T] = {
    val __obj = js.Dynamic.literal(history = history.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any])
    __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteComponentProps[T]]
  }
}

