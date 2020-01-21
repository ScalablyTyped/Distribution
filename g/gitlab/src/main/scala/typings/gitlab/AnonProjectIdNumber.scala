package typings.gitlab

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonProjectIdNumber extends js.Object {
  var projectId: String | Double
}

object AnonProjectIdNumber {
  @scala.inline
  def apply(projectId: String | Double): AnonProjectIdNumber = {
    val __obj = js.Dynamic.literal(projectId = projectId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonProjectIdNumber]
  }
}

