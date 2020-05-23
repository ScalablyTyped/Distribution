package typings.frctlFractal.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Path extends js.Object {
  var mount: String
  var path: String
}

object Path {
  @scala.inline
  def apply(mount: String, path: String): Path = {
    val __obj = js.Dynamic.literal(mount = mount.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[Path]
  }
}

