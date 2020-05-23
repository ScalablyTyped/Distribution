package typings.expressFlash2.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Flash extends js.Object {
  var flash: typings.expressFlash2.mod.global.Express.Flash
}

object Flash {
  @scala.inline
  def apply(flash: typings.expressFlash2.mod.global.Express.Flash): Flash = {
    val __obj = js.Dynamic.literal(flash = flash.asInstanceOf[js.Any])
    __obj.asInstanceOf[Flash]
  }
}

