package typings.frctlFractal

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPath extends js.Object {
  var mount: String
  var path: String
}

object AnonPath {
  @scala.inline
  def apply(mount: String, path: String): AnonPath = {
    val __obj = js.Dynamic.literal(mount = mount.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonPath]
  }
}

