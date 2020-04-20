package typings.fundamentalReact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNext extends js.Object {
  var next: String
  var previous: String
}

object AnonNext {
  @scala.inline
  def apply(next: String, previous: String): AnonNext = {
    val __obj = js.Dynamic.literal(next = next.asInstanceOf[js.Any], previous = previous.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonNext]
  }
}

