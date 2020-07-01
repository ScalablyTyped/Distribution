package typings.electronNotarize.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotarizeResult extends js.Object {
  var uuid: String
}

object NotarizeResult {
  @scala.inline
  def apply(uuid: String): NotarizeResult = {
    val __obj = js.Dynamic.literal(uuid = uuid.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotarizeResult]
  }
}

