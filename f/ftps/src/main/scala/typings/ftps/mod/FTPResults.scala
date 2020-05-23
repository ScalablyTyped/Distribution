package typings.ftps.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FTPResults extends js.Object {
  var data: String | Null
  var error: Error | Null
}

object FTPResults {
  @scala.inline
  def apply(data: String = null, error: Error = null): FTPResults = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any])
    __obj.asInstanceOf[FTPResults]
  }
}

