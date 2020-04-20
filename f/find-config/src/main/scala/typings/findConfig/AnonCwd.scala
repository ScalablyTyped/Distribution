package typings.findConfig

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCwd extends js.Object {
  var cwd: String
  var dir: String
  var path: String
}

object AnonCwd {
  @scala.inline
  def apply(cwd: String, dir: String, path: String): AnonCwd = {
    val __obj = js.Dynamic.literal(cwd = cwd.asInstanceOf[js.Any], dir = dir.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCwd]
  }
}

