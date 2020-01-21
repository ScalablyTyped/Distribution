package typings.gatsby

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCreate extends js.Object {
  var create: js.Function
}

object AnonCreate {
  @scala.inline
  def apply(create: js.Function): AnonCreate = {
    val __obj = js.Dynamic.literal(create = create.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCreate]
  }
}

