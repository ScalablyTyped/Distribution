package typings.frctlFractal

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonContent extends js.Object {
  var content: String
  var handle: String
  var path: String
}

object AnonContent {
  @scala.inline
  def apply(content: String, handle: String, path: String): AnonContent = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], handle = handle.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonContent]
  }
}

