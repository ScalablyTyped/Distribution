package typings.giustoInkRouter.mod

import typings.giustoInkRouter.anon.Params
import typings.history.mod.History
import typings.history.mod.Location
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RouteComponentProps[T /* <: Record[String, _] */] extends js.Object {
  var history: History[js.Object] = js.native
  var location: Location[js.Object] = js.native
  var `match`: Params[T] = js.native
}

object RouteComponentProps {
  @scala.inline
  def apply[/* <: typings.std.Record[java.lang.String, _] */ T](history: History[js.Object], location: Location[js.Object], `match`: Params[T]): RouteComponentProps[T] = {
    val __obj = js.Dynamic.literal(history = history.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any])
    __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteComponentProps[T]]
  }
  @scala.inline
  implicit class RouteComponentPropsOps[Self <: RouteComponentProps[_], /* <: typings.std.Record[java.lang.String, _] */ T] (val x: Self with RouteComponentProps[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setHistory(value: History[js.Object]): Self = this.set("history", value.asInstanceOf[js.Any])
    @scala.inline
    def setLocation(value: Location[js.Object]): Self = this.set("location", value.asInstanceOf[js.Any])
    @scala.inline
    def setMatch(value: Params[T]): Self = this.set("match", value.asInstanceOf[js.Any])
  }
  
}

