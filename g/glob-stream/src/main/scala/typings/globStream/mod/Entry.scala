package typings.globStream.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Entry extends js.Object {
  var base: String
  var cwd: String
  var path: String
}

object Entry {
  @scala.inline
  def apply(base: String, cwd: String, path: String): Entry = {
    val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], cwd = cwd.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[Entry]
  }
}

