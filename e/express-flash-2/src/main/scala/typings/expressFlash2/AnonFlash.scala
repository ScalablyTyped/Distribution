package typings.expressFlash2

import typings.expressFlash2.mod._Global_.Express.Flash
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFlash extends js.Object {
  var flash: Flash
}

object AnonFlash {
  @scala.inline
  def apply(flash: Flash): AnonFlash = {
    val __obj = js.Dynamic.literal(flash = flash.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFlash]
  }
}

