package typings.emberDebug.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IdString extends js.Object {
  var id: String
}

object IdString {
  @scala.inline
  def apply(id: String): IdString = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdString]
  }
}

