package typings.expressFlash2.mod._Global_.Express

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Session extends js.Object {
  var flash: Flash
}

object Session {
  @scala.inline
  def apply(flash: Flash): Session = {
    val __obj = js.Dynamic.literal(flash = flash.asInstanceOf[js.Any])
    __obj.asInstanceOf[Session]
  }
}

