package typings.gestalt.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Path extends js.Object {
  var __path: String
}

object Path {
  @scala.inline
  def apply(__path: String): Path = {
    val __obj = js.Dynamic.literal(__path = __path.asInstanceOf[js.Any])
    __obj.asInstanceOf[Path]
  }
}

