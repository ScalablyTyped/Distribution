package typings.eggCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Path extends js.Object {
  var path: String
  var pathName: String
}

object Path {
  @scala.inline
  def apply(path: String, pathName: String): Path = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], pathName = pathName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Path]
  }
}

