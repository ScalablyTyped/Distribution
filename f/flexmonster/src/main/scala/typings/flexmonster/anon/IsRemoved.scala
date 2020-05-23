package typings.flexmonster.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IsRemoved extends js.Object {
  var isRemoved: Boolean
  var uniqueName: String
}

object IsRemoved {
  @scala.inline
  def apply(isRemoved: Boolean, uniqueName: String): IsRemoved = {
    val __obj = js.Dynamic.literal(isRemoved = isRemoved.asInstanceOf[js.Any], uniqueName = uniqueName.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsRemoved]
  }
}

