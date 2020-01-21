package typings.fbWatchman.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Capabilities extends js.Object {
  var optional: js.Array[_]
  var required: js.Array[_]
}

object Capabilities {
  @scala.inline
  def apply(optional: js.Array[_], required: js.Array[_]): Capabilities = {
    val __obj = js.Dynamic.literal(optional = optional.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Capabilities]
  }
}

