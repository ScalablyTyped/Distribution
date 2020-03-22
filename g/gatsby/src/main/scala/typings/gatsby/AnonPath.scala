package typings.gatsby

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPath extends js.Object {
  var component: String
  var path: String
}

object AnonPath {
  @scala.inline
  def apply(component: String, path: String): AnonPath = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonPath]
  }
}

