package typings.gapiPlus.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Primary extends js.Object {
  var primary: Boolean
  var value: String
}

object Primary {
  @scala.inline
  def apply(primary: Boolean, value: String): Primary = {
    val __obj = js.Dynamic.literal(primary = primary.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Primary]
  }
}

