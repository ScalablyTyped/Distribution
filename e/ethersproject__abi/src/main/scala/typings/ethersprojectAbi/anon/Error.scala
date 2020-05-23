package typings.ethersprojectAbi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Error extends js.Object {
  var error: typings.std.Error
  var path: js.Array[String | Double]
}

object Error {
  @scala.inline
  def apply(error: typings.std.Error, path: js.Array[String | Double]): Error = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[Error]
  }
}

