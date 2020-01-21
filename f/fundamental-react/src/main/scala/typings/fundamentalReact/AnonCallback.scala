package typings.fundamentalReact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCallback extends js.Object {
  var text: String
  def callback(): Unit
}

object AnonCallback {
  @scala.inline
  def apply(callback: () => Unit, text: String): AnonCallback = {
    val __obj = js.Dynamic.literal(callback = js.Any.fromFunction0(callback), text = text.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCallback]
  }
}

