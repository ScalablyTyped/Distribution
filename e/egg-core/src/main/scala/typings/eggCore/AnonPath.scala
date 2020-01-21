package typings.eggCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPath extends js.Object {
  var path: String
  var pathName: String
}

object AnonPath {
  @scala.inline
  def apply(path: String, pathName: String): AnonPath = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], pathName = pathName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonPath]
  }
}

