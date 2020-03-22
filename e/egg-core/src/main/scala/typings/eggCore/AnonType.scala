package typings.eggCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonType extends js.Object {
  var path: String
  var `type`: String
}

object AnonType {
  @scala.inline
  def apply(path: String, `type`: String): AnonType = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonType]
  }
}

