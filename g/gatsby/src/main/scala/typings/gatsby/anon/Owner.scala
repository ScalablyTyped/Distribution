package typings.gatsby.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Owner extends js.Object {
  var owner: String
}

object Owner {
  @scala.inline
  def apply(owner: String): Owner = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any])
    __obj.asInstanceOf[Owner]
  }
}

