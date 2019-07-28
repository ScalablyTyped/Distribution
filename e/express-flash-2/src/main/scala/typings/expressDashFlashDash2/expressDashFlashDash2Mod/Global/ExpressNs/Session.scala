package typings.expressDashFlashDash2.expressDashFlashDash2Mod.Global.ExpressNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Session extends js.Object {
  var flash: Flash
}

object Session {
  @scala.inline
  def apply(flash: Flash): Session = {
    val __obj = js.Dynamic.literal(flash = flash)
  
    __obj.asInstanceOf[Session]
  }
}

