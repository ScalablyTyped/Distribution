package typings.gitlab

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonShaString extends js.Object {
  var sha: String
}

object AnonShaString {
  @scala.inline
  def apply(sha: String): AnonShaString = {
    val __obj = js.Dynamic.literal(sha = sha.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonShaString]
  }
}

