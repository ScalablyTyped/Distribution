package typings.giustoInkRouter.anon

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Params[T /* <: Record[String, _] */] extends js.Object {
  var params: T = js.native
  var path: String = js.native
}

object Params {
  @scala.inline
  def apply[/* <: typings.std.Record[java.lang.String, _] */ T](params: T, path: String): Params[T] = {
    val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[Params[T]]
  }
  @scala.inline
  implicit class ParamsOps[Self <: Params[_], /* <: typings.std.Record[java.lang.String, _] */ T] (val x: Self with Params[T]) extends AnyVal {
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
    def setParams(value: T): Self = this.set("params", value.asInstanceOf[js.Any])
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
  }
  
}

