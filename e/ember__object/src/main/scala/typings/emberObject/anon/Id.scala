package typings.emberObject.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Id extends js.Object {
  var id: String
  var until: String
}

object Id {
  @scala.inline
  def apply(id: String, until: String): Id = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], until = until.asInstanceOf[js.Any])
    __obj.asInstanceOf[Id]
  }
}

