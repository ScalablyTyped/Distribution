package typings.gatsby.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Create extends js.Object {
  var create: js.Function
}

object Create {
  @scala.inline
  def apply(create: js.Function): Create = {
    val __obj = js.Dynamic.literal(create = create.asInstanceOf[js.Any])
    __obj.asInstanceOf[Create]
  }
}

