package typings.giustoInkRouter.anon

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Params[T /* <: Record[String, _] */] extends js.Object {
  var params: T
  var path: String
}

object Params {
  @scala.inline
  def apply[/* <: typings.std.Record[java.lang.String, _] */ T](params: T, path: String): Params[T] = {
    val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[Params[T]]
  }
}

