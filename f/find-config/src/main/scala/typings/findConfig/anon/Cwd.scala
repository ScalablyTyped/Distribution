package typings.findConfig.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Cwd extends js.Object {
  var cwd: String
  var dir: String
  var path: String
}

object Cwd {
  @scala.inline
  def apply(cwd: String, dir: String, path: String): Cwd = {
    val __obj = js.Dynamic.literal(cwd = cwd.asInstanceOf[js.Any], dir = dir.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cwd]
  }
}

