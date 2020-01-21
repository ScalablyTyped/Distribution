package typings.emberTestHelpers

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAs extends js.Object {
  var as: String
}

object AnonAs {
  @scala.inline
  def apply(as: String): AnonAs = {
    val __obj = js.Dynamic.literal(as = as.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAs]
  }
}

