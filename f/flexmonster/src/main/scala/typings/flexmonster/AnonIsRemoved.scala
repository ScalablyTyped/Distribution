package typings.flexmonster

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIsRemoved extends js.Object {
  var isRemoved: Boolean
  var uniqueName: String
}

object AnonIsRemoved {
  @scala.inline
  def apply(isRemoved: Boolean, uniqueName: String): AnonIsRemoved = {
    val __obj = js.Dynamic.literal(isRemoved = isRemoved.asInstanceOf[js.Any], uniqueName = uniqueName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonIsRemoved]
  }
}

